package dan.rojas.epam.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dan.rojas.epam.dynamodb.dto.ProductRequest;
import dan.rojas.epam.dynamodb.dto.ProductResponse;
import dan.rojas.epam.dynamodb.model.Product;
import dan.rojas.epam.dynamodb.repository.ProductRepository;
import dan.rojas.epam.dynamodb.validator.ProductRequestValidator;
import software.amazon.awssdk.services.dynamodb.model.GetItemResponse;

import static dan.rojas.epam.dynamodb.utils.ProductUtils.buildKeyGetItemRequest;
import static dan.rojas.epam.dynamodb.utils.ProductUtils.keyMap;
import static dan.rojas.epam.dynamodb.utils.ProductUtils.productToUpdateMap;

public class UpdateProductHandler implements RequestHandler<ProductRequest, ProductResponse> {

  private ProductRepository productRepository;
  private LambdaLogger logger;

  @Override
  public ProductResponse handleRequest(ProductRequest productRequest, Context context) {
    logger = context.getLogger();
    ProductResponse productResponse;
    try {
      ProductRequestValidator.validate(productRequest);
      logger.log(productRequest.getProduct().toString());
      productRepository = new ProductRepository();
      final GetItemResponse retrievedProduct =
          productRepository.findByKey(buildKeyGetItemRequest(productRequest.getProduct()));

      if (!retrievedProduct.hasItem()) {
        throw new Exception("Product does not exists, cannot be updated");
      }

      productResponse = updateProduct(productRequest.getProduct());

    } catch (Exception e) {
      productResponse = new ProductResponse();
      productResponse.setError(true);
      productResponse.setMessage(e.getMessage());
      logger.log(e.getMessage());
    }
    return productResponse;
  }

  private ProductResponse updateProduct(final Product product) {
    logger.log("Updating Item...");
    productRepository.update(keyMap(product), productToUpdateMap(product));
    final ProductResponse productResponse = new ProductResponse();
    productResponse.setId(product.getId());
    productResponse.setMessage("Success");
    productResponse.setError(false);
    return productResponse;
  }

}

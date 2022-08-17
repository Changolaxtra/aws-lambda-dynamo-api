package dan.rojas.epam.dynamodb.validator;

import dan.rojas.epam.dynamodb.dto.ProductRequest;

import java.util.Objects;

public class ProductRequestValidator {

  public static void validate(ProductRequest productRequest) throws Exception {
    if (Objects.isNull(productRequest.getProduct())) {
      throw new Exception("Product is null");
    }

    if (Objects.isNull(productRequest.getProduct().getId())) {
      throw new Exception("Product Id is null");
    }
    final String pictureUrl = productRequest.getProduct().getPictureUrl();
    if (Objects.nonNull(pictureUrl) && !(pictureUrl.startsWith("http://") || pictureUrl.startsWith("https://"))) {
      throw new Exception("Picture URL is invalid");
    }

  }

}

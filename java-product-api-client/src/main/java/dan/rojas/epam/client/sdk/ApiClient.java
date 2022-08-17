package dan.rojas.epam.client.sdk;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import dan.rojas.epam.client.sdk.model.PostProductCreateRequest;
import dan.rojas.epam.client.sdk.model.Product;
import dan.rojas.epam.client.sdk.model.PutProductUpdateRequest;
import dan.rojas.epam.client.sdk.model.Request;


public class ApiClient {

  private ProductClientSdk productClientSdk;

  public ApiClient() {
    productClientSdk = new ProductClientSdkClientBuilder()
        .iamCredentials(new ProfileCredentialsProvider("mainDeveloper"))
        .build();
  }

  public String createProduct(final Product product) {
    final Request request = new Request();
    request.setProduct(product);
    final PostProductCreateRequest postProductCreateRequest = new PostProductCreateRequest();
    postProductCreateRequest.setRequest(request);
    return productClientSdk.postProductCreate(postProductCreateRequest).toString();
  }

  public String updateProduct(final Product product) {
    final Request request = new Request();
    request.setProduct(product);
    final PutProductUpdateRequest putProductUpdateRequest = new PutProductUpdateRequest();
    putProductUpdateRequest.setRequest(request);
    return productClientSdk.putProductUpdate(putProductUpdateRequest).toString();
  }

}

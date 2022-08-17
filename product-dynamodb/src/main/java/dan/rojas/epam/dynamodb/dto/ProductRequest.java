package dan.rojas.epam.dynamodb.dto;

import dan.rojas.epam.dynamodb.model.Product;

public class ProductRequest {

  private Product product;

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}

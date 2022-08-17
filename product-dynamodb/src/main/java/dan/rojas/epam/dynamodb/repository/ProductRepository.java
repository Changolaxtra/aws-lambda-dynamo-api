package dan.rojas.epam.dynamodb.repository;

public class ProductRepository extends Repository {

  @Override
  public String getTableName() {
    return "products";
  }

}

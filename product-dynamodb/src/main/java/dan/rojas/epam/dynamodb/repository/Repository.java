package dan.rojas.epam.dynamodb.repository;

import software.amazon.awssdk.auth.credentials.EnvironmentVariableCredentialsProvider;
import software.amazon.awssdk.http.urlconnection.UrlConnectionHttpClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.AttributeValueUpdate;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;
import software.amazon.awssdk.services.dynamodb.model.GetItemResponse;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;
import software.amazon.awssdk.services.dynamodb.model.PutItemResponse;
import software.amazon.awssdk.services.dynamodb.model.UpdateItemRequest;
import software.amazon.awssdk.services.dynamodb.model.UpdateItemResponse;

import java.util.Map;

public abstract class Repository {

  /**
   * @return an instance of DynamoDbClient
   */
  protected static DynamoDbClient dynamoDbClient() {
    return DynamoDbClient.builder()
        .credentialsProvider(EnvironmentVariableCredentialsProvider.create())
        .region(Region.US_EAST_1)
        .httpClientBuilder(UrlConnectionHttpClient.builder())
        .build();
  }

  public abstract String getTableName();

  public GetItemResponse findByKey(final GetItemRequest getItemRequest) {
    return dynamoDbClient().getItem(getItemRequest);
  }

  public PutItemResponse insert(final Map<String, AttributeValue> attributeMap) {
    return dynamoDbClient().putItem(
        PutItemRequest.builder()
            .tableName(getTableName())
            .item(attributeMap)
            .build());
  }

  public UpdateItemResponse update(final Map<String, AttributeValue> key, final Map<String, AttributeValueUpdate> attributeValueUpdateMap) {
    return dynamoDbClient().updateItem(
        UpdateItemRequest.builder()
            .tableName(getTableName())
            .key(key)
            .attributeUpdates(attributeValueUpdateMap)
            .build());
  }

}

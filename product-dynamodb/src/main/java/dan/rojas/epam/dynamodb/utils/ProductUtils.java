package dan.rojas.epam.dynamodb.utils;

import dan.rojas.epam.dynamodb.model.Product;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.AttributeValueUpdate;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;

import java.util.HashMap;
import java.util.Map;

public class ProductUtils {

  public static GetItemRequest buildKeyGetItemRequest(final Product product) {
    final Map<String, AttributeValue> keyMap = keyMap(product);
    return GetItemRequest.builder().tableName("products")
        .key(keyMap)
        .build();
  }

  public static Map<String, AttributeValue> keyMap(final Product product) {
    final Map<String, AttributeValue> keyMap = new HashMap<>();
    keyMap.put("id", getAttributeValue(product.getId()));
    keyMap.put("name", getAttributeValue(product.getName()));
    return keyMap;
  }

  public static Map<String, AttributeValue> productToMap(final Product product) {
    final Map<String, AttributeValue> itemMap = new HashMap<>();
    itemMap.put("id", getAttributeValue(product.getId()));
    itemMap.put("name", getAttributeValue(product.getName()));
    itemMap.put("price", getAttributeValue(product.getPrice().toString()));
    itemMap.put("pictureUrl", getAttributeValue(product.getPictureUrl()));
    return itemMap;
  }

  public static Map<String, AttributeValueUpdate> productToUpdateMap(final Product product) {
    final Map<String, AttributeValueUpdate> itemMap = new HashMap<>();
    itemMap.put("price", AttributeValueUpdate.builder().value(getAttributeValue(product.getPrice().toString())).build());
    itemMap.put("pictureUrl", AttributeValueUpdate.builder().value(getAttributeValue(product.getPictureUrl())).build());
    return itemMap;
  }

  private static AttributeValue getAttributeValue(final String value) {
    return AttributeValue.builder().s(value).build();
  }

  private static AttributeValue getAttributeValue(final Double value) {
    return AttributeValue.builder().n(value.toString()).build();
  }

}

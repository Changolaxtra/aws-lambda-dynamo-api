package dan.rojas.epam.client;

import dan.rojas.epam.client.sdk.ApiClient;
import dan.rojas.epam.client.sdk.model.Product;
import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.Namespace;

public class App {
  public static void main(String[] args) {
    System.out.println("[ProductDTO API Client]");
    final ArgumentParser parser = ArgumentParsers.newFor("App").build()
        .defaultHelp(true)
        .description("Calls ProductDTO API");

    parser.addArgument("-o", "--operation")
        .choices("create", "update").setDefault("create")
        .help("Specify the API Operation");

    parser.addArgument("--id")
        .help("Specify ProductDTO Id");

    parser.addArgument("--name")
        .help("Specify ProductDTO Name");

    parser.addArgument("--price")
        .help("Specify ProductDTO Price");

    parser.addArgument("--pictureUrl")
        .help("Specify ProductDTO Picture URL");


    try {
      final Namespace namespace = parser.parseArgs(args);
      final Product productDTO = getProduct(namespace);
      System.out.println("ProductDTO => " + productDTO);
      final ApiClient apiClient = new ApiClient();
      String result = null;
      switch (namespace.getString("operation")) {
        case "create":
          result = apiClient.createProduct(productDTO);
          break;
        case "update":
          result = apiClient.updateProduct(productDTO);
          break;
      }
      System.out.println("Done: " + result);
    } catch (Exception aps) {
      System.out.println("Error");
      aps.printStackTrace();
    }
  }

  private static Product getProduct(final Namespace namespace) {
    final Product product = new Product();
    product.setId(namespace.getString("id"));
    product.setName(namespace.getString("name"));
    product.setPrice(Double.valueOf(namespace.getString("price")));
    product.setPictureUrl(namespace.getString("pictureUrl"));
    return product;
  }


}

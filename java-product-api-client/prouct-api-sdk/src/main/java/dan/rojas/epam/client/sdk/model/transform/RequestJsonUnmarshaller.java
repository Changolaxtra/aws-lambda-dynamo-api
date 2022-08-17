/**

*/
package dan.rojas.epam.client.sdk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import dan.rojas.epam.client.sdk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Request JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestJsonUnmarshaller implements Unmarshaller<Request, JsonUnmarshallerContext> {

    public Request unmarshall(JsonUnmarshallerContext context) throws Exception {
        Request request = new Request();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("product", targetDepth)) {
                    context.nextToken();
                    request.setProduct(ProductJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return request;
    }

    private static RequestJsonUnmarshaller instance;

    public static RequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RequestJsonUnmarshaller();
        return instance;
    }
}

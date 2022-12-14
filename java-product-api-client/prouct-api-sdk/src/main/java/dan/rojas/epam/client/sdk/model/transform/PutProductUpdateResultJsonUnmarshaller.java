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
 * PutProductUpdateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutProductUpdateResultJsonUnmarshaller implements Unmarshaller<PutProductUpdateResult, JsonUnmarshallerContext> {

    public PutProductUpdateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutProductUpdateResult putProductUpdateResult = new PutProductUpdateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putProductUpdateResult;
        }

        while (true) {
            if (token == null)
                break;

            putProductUpdateResult.setResponse(ResponseJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return putProductUpdateResult;
    }

    private static PutProductUpdateResultJsonUnmarshaller instance;

    public static PutProductUpdateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutProductUpdateResultJsonUnmarshaller();
        return instance;
    }
}

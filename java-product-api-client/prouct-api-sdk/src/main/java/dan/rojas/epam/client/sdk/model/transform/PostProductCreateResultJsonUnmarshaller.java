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
 * PostProductCreateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostProductCreateResultJsonUnmarshaller implements Unmarshaller<PostProductCreateResult, JsonUnmarshallerContext> {

    public PostProductCreateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostProductCreateResult postProductCreateResult = new PostProductCreateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postProductCreateResult;
        }

        while (true) {
            if (token == null)
                break;

            postProductCreateResult.setResponse(ResponseJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postProductCreateResult;
    }

    private static PostProductCreateResultJsonUnmarshaller instance;

    public static PostProductCreateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostProductCreateResultJsonUnmarshaller();
        return instance;
    }
}

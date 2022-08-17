/**

*/
package dan.rojas.epam.client.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import dan.rojas.epam.client.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PostProductCreateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostProductCreateRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> REQUEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();

    private static final PostProductCreateRequestMarshaller instance = new PostProductCreateRequestMarshaller();

    public static PostProductCreateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostProductCreateRequest postProductCreateRequest, ProtocolMarshaller protocolMarshaller) {

        if (postProductCreateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postProductCreateRequest.getRequest(), REQUEST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

/**

*/
package dan.rojas.epam.client.sdk;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import dan.rojas.epam.client.sdk.model.*;
import dan.rojas.epam.client.sdk.model.transform.*;

/**
 * Client for accessing ProductClientSdk. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class ProductClientSdkClient implements ProductClientSdk {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(false).withSupportsIon(false).withContentTypeOverride("application/json")
                    .withBaseServiceExceptionClass(dan.rojas.epam.client.sdk.model.ProductClientSdkException.class));

    /**
     * Constructs a new client to invoke service methods on ProductClientSdk using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    ProductClientSdkClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param postProductCreateRequest
     * @return Result of the PostProductCreate operation returned by the service.
     * @sample ProductClientSdk.PostProductCreate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/9w25kuf0z3-2022-04-15T03:53:12Z/PostProductCreate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostProductCreateResult postProductCreate(PostProductCreateRequest postProductCreateRequest) {
        HttpResponseHandler<PostProductCreateResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostProductCreateResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostProductCreateRequest, PostProductCreateResult>()
                .withMarshaller(new PostProductCreateRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postProductCreateRequest));
    }

    /**
     * @param putProductUpdateRequest
     * @return Result of the PutProductUpdate operation returned by the service.
     * @sample ProductClientSdk.PutProductUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/9w25kuf0z3-2022-04-15T03:53:12Z/PutProductUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutProductUpdateResult putProductUpdate(PutProductUpdateRequest putProductUpdateRequest) {
        HttpResponseHandler<PutProductUpdateResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PutProductUpdateResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PutProductUpdateRequest, PutProductUpdateResult>()
                .withMarshaller(new PutProductUpdateRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(putProductUpdateRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}

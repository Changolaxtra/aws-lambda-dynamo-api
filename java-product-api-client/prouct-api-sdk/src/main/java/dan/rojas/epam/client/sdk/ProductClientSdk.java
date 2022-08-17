/**

*/
package dan.rojas.epam.client.sdk;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import dan.rojas.epam.client.sdk.model.*;

/**
 * Interface for accessing ProductClientSdk.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ProductClientSdk {

    /**
     * @param postProductCreateRequest
     * @return Result of the PostProductCreate operation returned by the service.
     * @sample ProductClientSdk.PostProductCreate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/9w25kuf0z3-2022-04-15T03:53:12Z/PostProductCreate"
     *      target="_top">AWS API Documentation</a>
     */
    PostProductCreateResult postProductCreate(PostProductCreateRequest postProductCreateRequest);

    /**
     * @param putProductUpdateRequest
     * @return Result of the PutProductUpdate operation returned by the service.
     * @sample ProductClientSdk.PutProductUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/9w25kuf0z3-2022-04-15T03:53:12Z/PutProductUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    PutProductUpdateResult putProductUpdate(PutProductUpdateRequest putProductUpdateRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static ProductClientSdkClientBuilder builder() {
        return new ProductClientSdkClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}

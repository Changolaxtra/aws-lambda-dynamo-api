/**

*/
package dan.rojas.epam.client.sdk;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.Signer;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link dan.rojas.epam.client.sdk.ProductClientSdk}.
 * 
 * @see dan.rojas.epam.client.sdk.ProductClientSdk#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class ProductClientSdkClientBuilder extends SdkSyncClientBuilder<ProductClientSdkClientBuilder, ProductClientSdk> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("9w25kuf0z3.execute-api.us-east-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "us-east-1";

    /**
     * Package private constructor - builder should be created via {@link ProductClientSdk#builder()}
     */
    ProductClientSdkClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Specify an implementation of {@link AWSCredentialsProvider} to be used when signing IAM auth'd requests
     *
     * @param iamCredentials
     *        the credential provider
     */
    @Override
    public void setIamCredentials(AWSCredentialsProvider iamCredentials) {
        super.setIamCredentials(iamCredentials);
    }

    /**
     * Specify an implementation of {@link AWSCredentialsProvider} to be used when signing IAM auth'd requests
     *
     * @param iamCredentials
     *        the credential provider
     * @return This object for method chaining.
     */
    public ProductClientSdkClientBuilder iamCredentials(AWSCredentialsProvider iamCredentials) {
        setIamCredentials(iamCredentials);
        return this;
    }

    /**
     * Sets the IAM region to use when using IAM auth'd requests against a service in any of it's non-default regions.
     * This is only expected to be used when a custom endpoint has also been set.
     *
     * @param iamRegion
     *        the IAM region string to use when signing
     */
    public void setIamRegion(String iamRegion) {
        super.setIamRegion(iamRegion);
    }

    /**
     * Sets the IAM region to use when using IAM auth'd requests against a service in any of it's non-default regions.
     * This is only expected to be used when a custom endpoint has also been set.
     *
     * @param iamRegion
     *        the IAM region string to use when signing
     * @return This object for method chaining.
     */
    public ProductClientSdkClientBuilder iamRegion(String iamRegion) {
        setIamRegion(iamRegion);
        return this;
    }

    /**
     * Construct a synchronous implementation of ProductClientSdk using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of ProductClientSdk.
     */
    @Override
    protected ProductClientSdk build(AwsSyncClientParams params) {
        return new ProductClientSdkClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

    @Override
    protected Signer defaultIamSigner() {
        return signerFactory().createSigner();
    }
}

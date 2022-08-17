/**

*/
package dan.rojas.epam.client.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/9w25kuf0z3-2022-04-15T03:53:12Z/PostProductCreate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostProductCreateResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private Response response;

    /**
     * @param response
     */

    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * @return
     */

    public Response getResponse() {
        return this.response;
    }

    /**
     * @param response
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostProductCreateResult response(Response response) {
        setResponse(response);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResponse() != null)
            sb.append("Response: ").append(getResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostProductCreateResult == false)
            return false;
        PostProductCreateResult other = (PostProductCreateResult) obj;
        if (other.getResponse() == null ^ this.getResponse() == null)
            return false;
        if (other.getResponse() != null && other.getResponse().equals(this.getResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponse() == null) ? 0 : getResponse().hashCode());
        return hashCode;
    }

    @Override
    public PostProductCreateResult clone() {
        try {
            return (PostProductCreateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

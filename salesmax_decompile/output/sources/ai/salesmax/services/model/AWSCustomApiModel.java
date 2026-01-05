package ai.salesmax.services.model;

import com.amplifyframework.api.aws.AuthorizationType;
import com.amplifyframework.api.aws.EndpointType;

/* loaded from: classes.dex */
public class AWSCustomApiModel {
    private AuthorizationType authorizationType;
    private String endpoint;
    private EndpointType endpointType;
    private String region;

    public AuthorizationType getAuthorizationType() {
        return this.authorizationType;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public EndpointType getEndpointType() {
        return this.endpointType;
    }

    public String getRegion() {
        return this.region;
    }

    public void setAuthorizationType(AuthorizationType authorizationType) {
        this.authorizationType = authorizationType;
    }

    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    public void setEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType;
    }

    public void setRegion(String str) {
        this.region = str;
    }
}

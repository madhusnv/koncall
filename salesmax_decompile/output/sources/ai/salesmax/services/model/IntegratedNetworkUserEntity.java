package ai.salesmax.services.model;

import ai.salesmax.model.IntegrationParameters;

/* loaded from: classes.dex */
public class IntegratedNetworkUserEntity {
    public String entityId;
    public String entityType;
    public String name;
    public String requestUrl;
    public Boolean subscribed;
    public String token;
    public String userId;

    public IntegrationParameters toIntegrationParameter() {
        IntegrationParameters integrationParameters = new IntegrationParameters();
        integrationParameters.setIntegrationId(this.entityId);
        integrationParameters.setConnectionName(this.name);
        String str = this.token;
        String str2 = this.requestUrl;
        if (str != str2) {
            integrationParameters.setRequestUrl(str2);
        }
        String str3 = this.token;
        if (str3 != null) {
            integrationParameters.setToken(str3);
        }
        return integrationParameters;
    }
}

package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class IntegrationParameters {
    public static final int $stable = 8;
    private String accessToken;
    private String accountId;
    private String apiKey;
    private String apiVersion;
    private String authType;
    private String connectionName;
    private String createdById;
    private boolean fetchHistorical;
    private String integrationId;
    private String nextActionTaskType;
    private String requestUrl;
    private String token;

    public IntegrationParameters() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, 4095, null);
    }

    public final String component1() {
        return this.connectionName;
    }

    public final String component10() {
        return this.createdById;
    }

    public final boolean component11() {
        return this.fetchHistorical;
    }

    public final String component12() {
        return this.nextActionTaskType;
    }

    public final String component2() {
        return this.authType;
    }

    public final String component3() {
        return this.apiKey;
    }

    public final String component4() {
        return this.apiVersion;
    }

    public final String component5() {
        return this.accessToken;
    }

    public final String component6() {
        return this.requestUrl;
    }

    public final String component7() {
        return this.token;
    }

    public final String component8() {
        return this.integrationId;
    }

    public final String component9() {
        return this.accountId;
    }

    public final IntegrationParameters copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11) {
        sq8.m48649h(str, "connectionName");
        sq8.m48649h(str2, "authType");
        sq8.m48649h(str3, "apiKey");
        sq8.m48649h(str4, "apiVersion");
        sq8.m48649h(str5, "accessToken");
        sq8.m48649h(str8, "integrationId");
        sq8.m48649h(str9, "accountId");
        sq8.m48649h(str10, "createdById");
        sq8.m48649h(str11, "nextActionTaskType");
        return new IntegrationParameters(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegrationParameters)) {
            return false;
        }
        IntegrationParameters integrationParameters = (IntegrationParameters) obj;
        return sq8.m48644c(this.connectionName, integrationParameters.connectionName) && sq8.m48644c(this.authType, integrationParameters.authType) && sq8.m48644c(this.apiKey, integrationParameters.apiKey) && sq8.m48644c(this.apiVersion, integrationParameters.apiVersion) && sq8.m48644c(this.accessToken, integrationParameters.accessToken) && sq8.m48644c(this.requestUrl, integrationParameters.requestUrl) && sq8.m48644c(this.token, integrationParameters.token) && sq8.m48644c(this.integrationId, integrationParameters.integrationId) && sq8.m48644c(this.accountId, integrationParameters.accountId) && sq8.m48644c(this.createdById, integrationParameters.createdById) && this.fetchHistorical == integrationParameters.fetchHistorical && sq8.m48644c(this.nextActionTaskType, integrationParameters.nextActionTaskType);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getApiVersion() {
        return this.apiVersion;
    }

    public final String getAuthType() {
        return this.authType;
    }

    public final String getConnectionName() {
        return this.connectionName;
    }

    public final String getCreatedById() {
        return this.createdById;
    }

    public final boolean getFetchHistorical() {
        return this.fetchHistorical;
    }

    public final String getIntegrationId() {
        return this.integrationId;
    }

    public final String getNextActionTaskType() {
        return this.nextActionTaskType;
    }

    public final String getRequestUrl() {
        return this.requestUrl;
    }

    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((this.connectionName.hashCode() * 31) + this.authType.hashCode()) * 31) + this.apiKey.hashCode()) * 31) + this.apiVersion.hashCode()) * 31) + this.accessToken.hashCode()) * 31;
        String str = this.requestUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.token;
        int iHashCode3 = (((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.integrationId.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.createdById.hashCode()) * 31;
        boolean z = this.fetchHistorical;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((iHashCode3 + i) * 31) + this.nextActionTaskType.hashCode();
    }

    public final void setAccessToken(String str) {
        sq8.m48649h(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.accountId = str;
    }

    public final void setApiKey(String str) {
        sq8.m48649h(str, "<set-?>");
        this.apiKey = str;
    }

    public final void setApiVersion(String str) {
        sq8.m48649h(str, "<set-?>");
        this.apiVersion = str;
    }

    public final void setAuthType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.authType = str;
    }

    public final void setConnectionName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.connectionName = str;
    }

    public final void setCreatedById(String str) {
        sq8.m48649h(str, "<set-?>");
        this.createdById = str;
    }

    public final void setFetchHistorical(boolean z) {
        this.fetchHistorical = z;
    }

    public final void setIntegrationId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.integrationId = str;
    }

    public final void setNextActionTaskType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.nextActionTaskType = str;
    }

    public final void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "IntegrationParameters(connectionName=" + this.connectionName + ", authType=" + this.authType + ", apiKey=" + this.apiKey + ", apiVersion=" + this.apiVersion + ", accessToken=" + this.accessToken + ", requestUrl=" + this.requestUrl + ", token=" + this.token + ", integrationId=" + this.integrationId + ", accountId=" + this.accountId + ", createdById=" + this.createdById + ", fetchHistorical=" + this.fetchHistorical + ", nextActionTaskType=" + this.nextActionTaskType + ")";
    }

    public IntegrationParameters(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11) {
        sq8.m48649h(str, "connectionName");
        sq8.m48649h(str2, "authType");
        sq8.m48649h(str3, "apiKey");
        sq8.m48649h(str4, "apiVersion");
        sq8.m48649h(str5, "accessToken");
        sq8.m48649h(str8, "integrationId");
        sq8.m48649h(str9, "accountId");
        sq8.m48649h(str10, "createdById");
        sq8.m48649h(str11, "nextActionTaskType");
        this.connectionName = str;
        this.authType = str2;
        this.apiKey = str3;
        this.apiVersion = str4;
        this.accessToken = str5;
        this.requestUrl = str6;
        this.token = str7;
        this.integrationId = str8;
        this.accountId = str9;
        this.createdById = str10;
        this.fetchHistorical = z;
        this.nextActionTaskType = str11;
    }

    public /* synthetic */ IntegrationParameters(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? str7 : null, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? false : z, (i & 2048) == 0 ? str11 : "");
    }
}

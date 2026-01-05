package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.gi6;
import p001o.hi6;
import p001o.id5;
import p001o.mge;
import p001o.sq8;
import p001o.xk7;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class UserPoolConfiguration {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_REGION = "us-east-1";
    private final String appClient;
    private final String appClientSecret;
    private final String endpoint;
    private final String pinpointAppId;
    private final String poolId;
    private final String region;

    public static final class Builder {
        private String appClientId;
        private String appClientSecret;
        private String endpoint;
        private String pinpointAppId;
        private String poolId;
        private String region;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        private final String validateEndpoint(String str) throws Exception {
            if (str != null) {
                try {
                    if (!new mge("^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])$").m38995g(str)) {
                        throw new Exception("Invalid endpoint");
                    }
                } catch (Exception unused) {
                    throw new Exception("Invalid endpoint value " + str + ". Expected fully qualified hostname with no scheme, no path and no query");
                }
            }
            if (str == null) {
                return null;
            }
            return "https://" + str;
        }

        public final Builder appClientId(String str) {
            sq8.m48649h(str, "appClientId");
            this.appClientId = str;
            return this;
        }

        public final Builder appClientSecret(String str) {
            sq8.m48649h(str, "appClientSecret");
            this.appClientSecret = str;
            return this;
        }

        public final UserPoolConfiguration build() {
            return new UserPoolConfiguration(this.region, this.endpoint, this.poolId, this.appClientId, this.appClientSecret, this.pinpointAppId);
        }

        public final Builder endpoint(String str) {
            sq8.m48649h(str, "endpoint");
            this.endpoint = validateEndpoint(str);
            return this;
        }

        public final String getAppClientId() {
            return this.appClientId;
        }

        public final String getAppClientSecret() {
            return this.appClientSecret;
        }

        public final String getEndpoint() {
            return this.endpoint;
        }

        public final String getPinpointAppId() {
            return this.pinpointAppId;
        }

        public final String getPoolId() {
            return this.poolId;
        }

        public final String getRegion() {
            return this.region;
        }

        public final Builder pinpointAppId(String str) {
            sq8.m48649h(str, "pinpointAppId");
            this.pinpointAppId = str;
            return this;
        }

        public final Builder poolId(String str) {
            sq8.m48649h(str, "poolId");
            this.poolId = str;
            return this;
        }

        public final Builder region(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_REGION);
            this.region = str;
            return this;
        }

        public final void setAppClientId(String str) {
            this.appClientId = str;
        }

        public final void setAppClientSecret(String str) {
            this.appClientSecret = str;
        }

        public final void setEndpoint(String str) {
            this.endpoint = str;
        }

        public final void setPinpointAppId(String str) {
            this.pinpointAppId = str;
        }

        public final void setPoolId(String str) {
            this.poolId = str;
        }

        public final void setRegion(String str) {
            this.region = str;
        }

        public Builder(JSONObject jSONObject) {
            this.region = UserPoolConfiguration.DEFAULT_REGION;
            if (jSONObject != null) {
                String strOptString = jSONObject.optString(Config.REGION.getKey());
                this.region = Boolean.valueOf(strOptString == null || strOptString.length() == 0).booleanValue() ? null : strOptString;
                String strOptString2 = jSONObject.optString(Config.ENDPOINT.getKey());
                this.endpoint = validateEndpoint(strOptString2 == null || strOptString2.length() == 0 ? null : strOptString2);
                String strOptString3 = jSONObject.optString(Config.POOL_ID.getKey());
                this.poolId = Boolean.valueOf(strOptString3 == null || strOptString3.length() == 0).booleanValue() ? null : strOptString3;
                String strOptString4 = jSONObject.optString(Config.APP_CLIENT_ID.getKey());
                this.appClientId = Boolean.valueOf(strOptString4 == null || strOptString4.length() == 0).booleanValue() ? null : strOptString4;
                String strOptString5 = jSONObject.optString(Config.APP_CLIENT_SECRET.getKey());
                this.appClientSecret = Boolean.valueOf(strOptString5 == null || strOptString5.length() == 0).booleanValue() ? null : strOptString5;
                String strOptString6 = jSONObject.optString(Config.PINPOINT_APP_ID.getKey());
                this.pinpointAppId = Boolean.valueOf(strOptString6 == null || strOptString6.length() == 0).booleanValue() ? null : strOptString6;
            }
        }

        public /* synthetic */ Builder(JSONObject jSONObject, int i, id5 id5Var) {
            this((i & 1) != 0 ? null : jSONObject);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Builder builder() {
            return new Builder(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder fromJson(JSONObject jSONObject) {
            sq8.m48649h(jSONObject, "configJson");
            return new Builder(jSONObject);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final UserPoolConfiguration invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            Builder builder = new Builder(null, 1, 0 == true ? 1 : 0);
            xk7Var.invoke(builder);
            return builder.build();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Config {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ Config[] $VALUES;
        private final String key;
        public static final Config REGION = new Config("REGION", 0, "Region");
        public static final Config ENDPOINT = new Config("ENDPOINT", 1, "Endpoint");
        public static final Config POOL_ID = new Config("POOL_ID", 2, "PoolId");
        public static final Config APP_CLIENT_ID = new Config("APP_CLIENT_ID", 3, "AppClientId");
        public static final Config APP_CLIENT_SECRET = new Config("APP_CLIENT_SECRET", 4, "AppClientSecret");
        public static final Config PINPOINT_APP_ID = new Config("PINPOINT_APP_ID", 5, "PinpointAppId");

        private static final /* synthetic */ Config[] $values() {
            return new Config[]{REGION, ENDPOINT, POOL_ID, APP_CLIENT_ID, APP_CLIENT_SECRET, PINPOINT_APP_ID};
        }

        static {
            Config[] configArr$values = $values();
            $VALUES = configArr$values;
            $ENTRIES = hi6.m30609a(configArr$values);
        }

        private Config(String str, int i, String str2) {
            this.key = str2;
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static Config valueOf(String str) {
            return (Config) Enum.valueOf(Config.class, str);
        }

        public static Config[] values() {
            return (Config[]) $VALUES.clone();
        }

        public final String getKey() {
            return this.key;
        }
    }

    public UserPoolConfiguration(String str, String str2, String str3, String str4, String str5, String str6) {
        this.region = str;
        this.endpoint = str2;
        this.poolId = str3;
        this.appClient = str4;
        this.appClientSecret = str5;
        this.pinpointAppId = str6;
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public static /* synthetic */ UserPoolConfiguration copy$default(UserPoolConfiguration userPoolConfiguration, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userPoolConfiguration.region;
        }
        if ((i & 2) != 0) {
            str2 = userPoolConfiguration.endpoint;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = userPoolConfiguration.poolId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = userPoolConfiguration.appClient;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = userPoolConfiguration.appClientSecret;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = userPoolConfiguration.pinpointAppId;
        }
        return userPoolConfiguration.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.region;
    }

    public final String component2() {
        return this.endpoint;
    }

    public final String component3() {
        return this.poolId;
    }

    public final String component4() {
        return this.appClient;
    }

    public final String component5() {
        return this.appClientSecret;
    }

    public final String component6() {
        return this.pinpointAppId;
    }

    public final UserPoolConfiguration copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new UserPoolConfiguration(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPoolConfiguration)) {
            return false;
        }
        UserPoolConfiguration userPoolConfiguration = (UserPoolConfiguration) obj;
        return sq8.m48644c(this.region, userPoolConfiguration.region) && sq8.m48644c(this.endpoint, userPoolConfiguration.endpoint) && sq8.m48644c(this.poolId, userPoolConfiguration.poolId) && sq8.m48644c(this.appClient, userPoolConfiguration.appClient) && sq8.m48644c(this.appClientSecret, userPoolConfiguration.appClientSecret) && sq8.m48644c(this.pinpointAppId, userPoolConfiguration.pinpointAppId);
    }

    public final String getAppClient() {
        return this.appClient;
    }

    public final String getAppClientSecret() {
        return this.appClientSecret;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getPinpointAppId() {
        return this.pinpointAppId;
    }

    public final String getPoolId() {
        return this.poolId;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        String str = this.region;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endpoint;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poolId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appClient;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appClientSecret;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pinpointAppId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final JSONObject toGen1Json$aws_auth_cognito_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.region;
        if (str != null) {
            jSONObject.put(Config.REGION.getKey(), str);
        }
        String str2 = this.endpoint;
        if (str2 != null) {
            jSONObject.put(Config.ENDPOINT.getKey(), str2);
        }
        String str3 = this.poolId;
        if (str3 != null) {
            jSONObject.put(Config.POOL_ID.getKey(), str3);
        }
        String str4 = this.appClient;
        if (str4 != null) {
            jSONObject.put(Config.APP_CLIENT_ID.getKey(), str4);
        }
        String str5 = this.appClientSecret;
        if (str5 != null) {
            jSONObject.put(Config.APP_CLIENT_SECRET.getKey(), str5);
        }
        String str6 = this.pinpointAppId;
        if (str6 != null) {
            jSONObject.put(Config.PINPOINT_APP_ID.getKey(), str6);
        }
        return jSONObject;
    }

    public String toString() {
        return "UserPoolConfiguration(region=" + this.region + ", endpoint=" + this.endpoint + ", poolId=" + this.poolId + ", appClient=" + this.appClient + ", appClientSecret=" + this.appClientSecret + ", pinpointAppId=" + this.pinpointAppId + ")";
    }
}

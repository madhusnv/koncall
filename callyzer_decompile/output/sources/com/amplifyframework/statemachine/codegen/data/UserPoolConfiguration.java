package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import com.amplifyframework.annotations.InternalAmplifyApi;
import ex.InterfaceC2139c;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.json.JSONException;
import org.json.JSONObject;
import p020v.a1;
import pg.b8;
import xw.InterfaceC8493a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class UserPoolConfiguration {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_REGION = "us-east-1";
    private final String appClient;
    private final String appClientSecret;
    private final String endpoint;
    private final String pinpointAppId;
    private final String poolId;
    private final String region;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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
                    Pattern patternCompile = Pattern.compile("^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])$");
                    AbstractC4154l.m8922e(patternCompile, "compile(...)");
                    if (!patternCompile.matcher(str).matches()) {
                        throw new Exception("Invalid endpoint");
                    }
                } catch (Exception unused) {
                    throw new Exception(AbstractC5601a.m11238i("Invalid endpoint value ", str, ". Expected fully qualified hostname with no scheme, no path and no query"));
                }
            }
            if (str != null) {
                return "https://".concat(str);
            }
            return null;
        }

        public final Builder appClientId(String appClientId) {
            AbstractC4154l.m8923f(appClientId, "appClientId");
            this.appClientId = appClientId;
            return this;
        }

        public final Builder appClientSecret(String appClientSecret) {
            AbstractC4154l.m8923f(appClientSecret, "appClientSecret");
            this.appClientSecret = appClientSecret;
            return this;
        }

        public final UserPoolConfiguration build() {
            return new UserPoolConfiguration(this.region, this.endpoint, this.poolId, this.appClientId, this.appClientSecret, this.pinpointAppId);
        }

        public final Builder endpoint(String endpoint) {
            AbstractC4154l.m8923f(endpoint, "endpoint");
            this.endpoint = validateEndpoint(endpoint);
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

        public final Builder pinpointAppId(String pinpointAppId) {
            AbstractC4154l.m8923f(pinpointAppId, "pinpointAppId");
            this.pinpointAppId = pinpointAppId;
            return this;
        }

        public final Builder poolId(String poolId) {
            AbstractC4154l.m8923f(poolId, "poolId");
            this.poolId = poolId;
            return this;
        }

        public final Builder region(String region) {
            AbstractC4154l.m8923f(region, "region");
            this.region = region;
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
                boolean z6 = true;
                this.region = strOptString == null || strOptString.length() == 0 ? null : strOptString;
                String strOptString2 = jSONObject.optString(Config.ENDPOINT.getKey());
                this.endpoint = validateEndpoint((strOptString2 == null || strOptString2.length() == 0) ? null : strOptString2);
                String strOptString3 = jSONObject.optString(Config.POOL_ID.getKey());
                this.poolId = strOptString3 == null || strOptString3.length() == 0 ? null : strOptString3;
                String strOptString4 = jSONObject.optString(Config.APP_CLIENT_ID.getKey());
                this.appClientId = strOptString4 == null || strOptString4.length() == 0 ? null : strOptString4;
                String strOptString5 = jSONObject.optString(Config.APP_CLIENT_SECRET.getKey());
                this.appClientSecret = strOptString5 == null || strOptString5.length() == 0 ? null : strOptString5;
                String strOptString6 = jSONObject.optString(Config.PINPOINT_APP_ID.getKey());
                if (strOptString6 != null && strOptString6.length() != 0) {
                    z6 = false;
                }
                this.pinpointAppId = z6 ? null : strOptString6;
            }
        }

        public /* synthetic */ Builder(JSONObject jSONObject, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? null : jSONObject);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Builder builder() {
            return new Builder(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder fromJson(JSONObject configJson) {
            AbstractC4154l.m8923f(configJson, "configJson");
            return new Builder(configJson);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final UserPoolConfiguration invoke(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            Builder builder = new Builder(null, 1, 0 == true ? 1 : 0);
            block.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Config {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
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
            $ENTRIES = b8.m11548b(configArr$values);
        }

        private Config(String str, int i10, String str2) {
            this.key = str2;
        }

        public static InterfaceC8493a getEntries() {
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

    public static /* synthetic */ UserPoolConfiguration copy$aws_auth_cognito_release$default(UserPoolConfiguration userPoolConfiguration, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userPoolConfiguration.region;
        }
        if ((i10 & 2) != 0) {
            str2 = userPoolConfiguration.endpoint;
        }
        if ((i10 & 4) != 0) {
            str3 = userPoolConfiguration.poolId;
        }
        if ((i10 & 8) != 0) {
            str4 = userPoolConfiguration.appClient;
        }
        if ((i10 & 16) != 0) {
            str5 = userPoolConfiguration.appClientSecret;
        }
        if ((i10 & 32) != 0) {
            str6 = userPoolConfiguration.pinpointAppId;
        }
        String str7 = str5;
        String str8 = str6;
        return userPoolConfiguration.copy$aws_auth_cognito_release(str, str2, str3, str4, str7, str8);
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

    public final UserPoolConfiguration copy$aws_auth_cognito_release(String str, String str2, String str3, String str4, String str5, String str6) {
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
        return AbstractC4154l.m8918a(this.region, userPoolConfiguration.region) && AbstractC4154l.m8918a(this.endpoint, userPoolConfiguration.endpoint) && AbstractC4154l.m8918a(this.poolId, userPoolConfiguration.poolId) && AbstractC4154l.m8918a(this.appClient, userPoolConfiguration.appClient) && AbstractC4154l.m8918a(this.appClientSecret, userPoolConfiguration.appClientSecret) && AbstractC4154l.m8918a(this.pinpointAppId, userPoolConfiguration.pinpointAppId);
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
        String str = this.region;
        String str2 = this.endpoint;
        String str3 = this.poolId;
        String str4 = this.appClient;
        String str5 = this.appClientSecret;
        String str6 = this.pinpointAppId;
        StringBuilder sbM127r = AbstractC0030c.m127r("UserPoolConfiguration(region=", str, ", endpoint=", str2, ", poolId=");
        a1.m14319B(sbM127r, str3, ", appClient=", str4, ", appClientSecret=");
        return AbstractC0030c.m124o(sbM127r, str5, ", pinpointAppId=", str6, ")");
    }
}

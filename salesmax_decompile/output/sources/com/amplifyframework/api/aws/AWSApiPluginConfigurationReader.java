package com.amplifyframework.api.aws;

import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.AWSApiPluginConfiguration;
import com.amplifyframework.api.aws.ApiConfiguration;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class AWSApiPluginConfigurationReader {

    /* renamed from: com.amplifyframework.api.aws.AWSApiPluginConfigurationReader$1 */
    public static /* synthetic */ class C102811 {

        /* renamed from: $SwitchMap$com$amplifyframework$core$configuration$AmplifyOutputsData$AwsAppsyncAuthorizationType */
        static final /* synthetic */ int[] f10621x804e2994;

        static {
            int[] iArr = new int[AmplifyOutputsData.AwsAppsyncAuthorizationType.values().length];
            f10621x804e2994 = iArr;
            try {
                iArr[AmplifyOutputsData.AwsAppsyncAuthorizationType.AMAZON_COGNITO_USER_POOLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10621x804e2994[AmplifyOutputsData.AwsAppsyncAuthorizationType.API_KEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10621x804e2994[AmplifyOutputsData.AwsAppsyncAuthorizationType.AWS_IAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10621x804e2994[AmplifyOutputsData.AwsAppsyncAuthorizationType.AWS_LAMBDA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10621x804e2994[AmplifyOutputsData.AwsAppsyncAuthorizationType.OPENID_CONNECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ENDPOINT_TYPE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class ConfigKey {
        private static final /* synthetic */ ConfigKey[] $VALUES;
        public static final ConfigKey API_KEY;
        public static final ConfigKey AUTHORIZATION_TYPE;
        public static final ConfigKey ENDPOINT;
        public static final ConfigKey ENDPOINT_TYPE;
        public static final ConfigKey REGION;
        private final Importance importance;
        private final String key;

        public enum Importance {
            REQUIRED,
            OPTIONAL
        }

        private static /* synthetic */ ConfigKey[] $values() {
            return new ConfigKey[]{ENDPOINT_TYPE, ENDPOINT, REGION, AUTHORIZATION_TYPE, API_KEY};
        }

        static {
            Importance importance = Importance.REQUIRED;
            ENDPOINT_TYPE = new ConfigKey("ENDPOINT_TYPE", 0, "endpointType", importance);
            ENDPOINT = new ConfigKey("ENDPOINT", 1, "endpoint", importance);
            REGION = new ConfigKey("REGION", 2, TransferTable.COLUMN_REGION, importance);
            AUTHORIZATION_TYPE = new ConfigKey("AUTHORIZATION_TYPE", 3, "authorizationType", importance);
            API_KEY = new ConfigKey("API_KEY", 4, "apiKey", Importance.OPTIONAL);
            $VALUES = $values();
        }

        private ConfigKey(String str, int i, String str2, Importance importance) {
            this.key = str2;
            this.importance = importance;
        }

        public static Set<String> optionalKeys() {
            HashSet hashSet = new HashSet();
            for (ConfigKey configKey : values()) {
                if (!configKey.isRequired()) {
                    hashSet.add(configKey.key());
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }

        public static Set<String> requiredKeys() {
            HashSet hashSet = new HashSet();
            for (ConfigKey configKey : values()) {
                if (configKey.isRequired()) {
                    hashSet.add(configKey.key());
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }

        public static ConfigKey valueOf(String str) {
            return (ConfigKey) Enum.valueOf(ConfigKey.class, str);
        }

        public static ConfigKey[] values() {
            return (ConfigKey[]) $VALUES.clone();
        }

        public boolean isRequired() {
            return Importance.REQUIRED.equals(this.importance);
        }

        public String key() {
            return this.key;
        }
    }

    private AWSApiPluginConfigurationReader() {
    }

    public static AWSApiPluginConfiguration from(AmplifyOutputsData amplifyOutputsData) throws ApiException {
        AmplifyOutputsData.Data data = amplifyOutputsData.getData();
        if (data == null) {
            throw new ApiException("Missing data configuration in Amplify Outputs", "Check that your amplify_outputs.json file contains a \"data\" section");
        }
        return AWSApiPluginConfiguration.builder().addApi(AWSApiPlugin.DEFAULT_GRAPHQL_API, ApiConfiguration.builder().endpointType(EndpointType.GRAPHQL).endpoint(data.getUrl()).region(data.getAwsRegion()).authorizationType(getAuthorizationType(data.getDefaultAuthorizationType())).apiKey(data.getApiKey()).build()).build();
    }

    private static AuthorizationType getAuthorizationType(AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType) {
        int i = C102811.f10621x804e2994[awsAppsyncAuthorizationType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? AuthorizationType.NONE : AuthorizationType.OPENID_CONNECT : AuthorizationType.AWS_LAMBDA : AuthorizationType.AWS_IAM : AuthorizationType.API_KEY : AuthorizationType.AMAZON_COGNITO_USER_POOLS;
    }

    private static AWSApiPluginConfiguration parseConfigurationJson(JSONObject jSONObject) throws JSONException, ApiException {
        AWSApiPluginConfiguration.Builder builder = AWSApiPluginConfiguration.builder();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                for (String str : ConfigKey.requiredKeys()) {
                    if (!jSONObject2.has(str)) {
                        throw new ApiException("Failed to parse configuration, missing required key: " + str, "Sorry, we don’t have a recovery suggestion for this error.");
                    }
                }
                ApiConfiguration.Builder builderAuthorizationType = ApiConfiguration.builder().endpointType(EndpointType.from(jSONObject2.getString(ConfigKey.ENDPOINT_TYPE.key()))).endpoint(jSONObject2.getString(ConfigKey.ENDPOINT.key())).region(jSONObject2.getString(ConfigKey.REGION.key())).authorizationType(AuthorizationType.from(jSONObject2.getString(ConfigKey.AUTHORIZATION_TYPE.key())));
                ConfigKey configKey = ConfigKey.API_KEY;
                if (jSONObject2.has(configKey.key())) {
                    builderAuthorizationType.apiKey(jSONObject2.getString(configKey.key()));
                }
                builder.addApi(next, builderAuthorizationType.build());
            }
            return builder.build();
        } catch (ApiException | JSONException e) {
            throw new ApiException("Failed to parse configuration JSON for AWS API Plugin", e, "Check amplifyconfiguration.json to make sure the AWS API configuration section hasn't been wrongly modified.");
        }
    }

    public static AWSApiPluginConfiguration readFrom(JSONObject jSONObject) throws ApiException {
        if (jSONObject != null) {
            return parseConfigurationJson(jSONObject);
        }
        throw new ApiException("Null configuration JSON provided to AWS API plugin.", "Check that the content of the AWS API Plugin section of the amplifyconfiguration.json file hasn't been accidentally deleted.");
    }
}

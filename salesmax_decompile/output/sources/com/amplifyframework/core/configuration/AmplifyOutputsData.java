package com.amplifyframework.core.configuration;

import android.content.Context;
import android.content.res.Resources;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.cj9;
import p001o.dc9;
import p001o.dff;
import p001o.f99;
import p001o.gi6;
import p001o.gi9;
import p001o.hi6;
import p001o.id5;
import p001o.kf9;
import p001o.ni6;
import p001o.p79;
import p001o.sh2;
import p001o.si9;
import p001o.sq8;
import p001o.szb;
import p001o.tb3;
import p001o.uih;
import p001o.uk7;
import p001o.z99;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public interface AmplifyOutputsData {
    public static final Companion Companion = Companion.$$INSTANCE;

    @InternalAmplifyApi
    public interface AmazonLocationServiceConfig {
        String getStyle();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InternalAmplifyApi
    public static final class AmazonPinpointChannels {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ AmazonPinpointChannels[] $VALUES;
        public static final AmazonPinpointChannels IN_APP_MESSAGING = new AmazonPinpointChannels("IN_APP_MESSAGING", 0);
        public static final AmazonPinpointChannels FCM = new AmazonPinpointChannels("FCM", 1);
        public static final AmazonPinpointChannels APNS = new AmazonPinpointChannels("APNS", 2);
        public static final AmazonPinpointChannels EMAIL = new AmazonPinpointChannels("EMAIL", 3);
        public static final AmazonPinpointChannels SMS = new AmazonPinpointChannels("SMS", 4);

        private static final /* synthetic */ AmazonPinpointChannels[] $values() {
            return new AmazonPinpointChannels[]{IN_APP_MESSAGING, FCM, APNS, EMAIL, SMS};
        }

        static {
            AmazonPinpointChannels[] amazonPinpointChannelsArr$values = $values();
            $VALUES = amazonPinpointChannelsArr$values;
            $ENTRIES = hi6.m30609a(amazonPinpointChannelsArr$values);
        }

        private AmazonPinpointChannels(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static AmazonPinpointChannels valueOf(String str) {
            return (AmazonPinpointChannels) Enum.valueOf(AmazonPinpointChannels.class, str);
        }

        public static AmazonPinpointChannels[] values() {
            return (AmazonPinpointChannels[]) $VALUES.clone();
        }
    }

    @InternalAmplifyApi
    public interface Analytics {

        @InternalAmplifyApi
        public interface AmazonPinpoint {
            String getAppId();

            String getAwsRegion();
        }

        AmazonPinpoint getAmazonPinpoint();
    }

    @InternalAmplifyApi
    public interface Auth {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @InternalAmplifyApi
        public static final class MfaConfiguration {
            private static final /* synthetic */ gi6 $ENTRIES;
            private static final /* synthetic */ MfaConfiguration[] $VALUES;
            public static final MfaConfiguration NONE = new MfaConfiguration("NONE", 0);
            public static final MfaConfiguration OPTIONAL = new MfaConfiguration("OPTIONAL", 1);
            public static final MfaConfiguration REQUIRED = new MfaConfiguration("REQUIRED", 2);

            private static final /* synthetic */ MfaConfiguration[] $values() {
                return new MfaConfiguration[]{NONE, OPTIONAL, REQUIRED};
            }

            static {
                MfaConfiguration[] mfaConfigurationArr$values = $values();
                $VALUES = mfaConfigurationArr$values;
                $ENTRIES = hi6.m30609a(mfaConfigurationArr$values);
            }

            private MfaConfiguration(String str, int i) {
            }

            public static gi6 getEntries() {
                return $ENTRIES;
            }

            public static MfaConfiguration valueOf(String str) {
                return (MfaConfiguration) Enum.valueOf(MfaConfiguration.class, str);
            }

            public static MfaConfiguration[] values() {
                return (MfaConfiguration[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @InternalAmplifyApi
        public static final class MfaMethods {
            private static final /* synthetic */ gi6 $ENTRIES;
            private static final /* synthetic */ MfaMethods[] $VALUES;
            public static final MfaMethods SMS = new MfaMethods("SMS", 0);
            public static final MfaMethods TOTP = new MfaMethods("TOTP", 1);

            private static final /* synthetic */ MfaMethods[] $values() {
                return new MfaMethods[]{SMS, TOTP};
            }

            static {
                MfaMethods[] mfaMethodsArr$values = $values();
                $VALUES = mfaMethodsArr$values;
                $ENTRIES = hi6.m30609a(mfaMethodsArr$values);
            }

            private MfaMethods(String str, int i) {
            }

            public static gi6 getEntries() {
                return $ENTRIES;
            }

            public static MfaMethods valueOf(String str) {
                return (MfaMethods) Enum.valueOf(MfaMethods.class, str);
            }

            public static MfaMethods[] values() {
                return (MfaMethods[]) $VALUES.clone();
            }
        }

        @InternalAmplifyApi
        public interface Oauth {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @InternalAmplifyApi
            public static final class IdentityProviders {
                private static final /* synthetic */ gi6 $ENTRIES;
                private static final /* synthetic */ IdentityProviders[] $VALUES;
                public static final IdentityProviders GOOGLE = new IdentityProviders("GOOGLE", 0);
                public static final IdentityProviders FACEBOOK = new IdentityProviders("FACEBOOK", 1);
                public static final IdentityProviders LOGIN_WITH_AMAZON = new IdentityProviders("LOGIN_WITH_AMAZON", 2);
                public static final IdentityProviders SIGN_IN_WITH_APPLE = new IdentityProviders("SIGN_IN_WITH_APPLE", 3);

                private static final /* synthetic */ IdentityProviders[] $values() {
                    return new IdentityProviders[]{GOOGLE, FACEBOOK, LOGIN_WITH_AMAZON, SIGN_IN_WITH_APPLE};
                }

                static {
                    IdentityProviders[] identityProvidersArr$values = $values();
                    $VALUES = identityProvidersArr$values;
                    $ENTRIES = hi6.m30609a(identityProvidersArr$values);
                }

                private IdentityProviders(String str, int i) {
                }

                public static gi6 getEntries() {
                    return $ENTRIES;
                }

                public static IdentityProviders valueOf(String str) {
                    return (IdentityProviders) Enum.valueOf(IdentityProviders.class, str);
                }

                public static IdentityProviders[] values() {
                    return (IdentityProviders[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @dff
            @InternalAmplifyApi
            public static final class ResponseType {
                private static final /* synthetic */ gi6 $ENTRIES;
                private static final /* synthetic */ ResponseType[] $VALUES;
                private static final gi9 $cachedSerializer$delegate;
                public static final Companion Companion;
                public static final ResponseType Code = new ResponseType("Code", 0);
                public static final ResponseType Token = new ResponseType("Token", 1);

                public static final class Companion {

                    /* renamed from: com.amplifyframework.core.configuration.AmplifyOutputsData$Auth$Oauth$ResponseType$Companion$1 */
                    public static final class C105491 extends kf9 implements uk7 {
                        public static final C105491 INSTANCE = new C105491();

                        public C105491() {
                            super(0);
                        }

                        @Override // p001o.uk7
                        public final dc9 invoke() {
                            return ni6.m40629a("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.Oauth.ResponseType", ResponseType.values(), new String[]{"code", AWSCognitoLegacyCredentialStore.TOKEN_KEY}, new Annotation[][]{null, null}, null);
                        }
                    }

                    private Companion() {
                    }

                    public /* synthetic */ Companion(id5 id5Var) {
                        this();
                    }

                    private final /* synthetic */ dc9 get$cachedSerializer() {
                        return (dc9) ResponseType.$cachedSerializer$delegate.getValue();
                    }

                    public final dc9 serializer() {
                        return get$cachedSerializer();
                    }
                }

                private static final /* synthetic */ ResponseType[] $values() {
                    return new ResponseType[]{Code, Token};
                }

                static {
                    ResponseType[] responseTypeArr$values = $values();
                    $VALUES = responseTypeArr$values;
                    $ENTRIES = hi6.m30609a(responseTypeArr$values);
                    Companion = new Companion(null);
                    $cachedSerializer$delegate = si9.m48361b(cj9.PUBLICATION, Companion.C105491.INSTANCE);
                }

                private ResponseType(String str, int i) {
                }

                public static gi6 getEntries() {
                    return $ENTRIES;
                }

                public static ResponseType valueOf(String str) {
                    return (ResponseType) Enum.valueOf(ResponseType.class, str);
                }

                public static ResponseType[] values() {
                    return (ResponseType[]) $VALUES.clone();
                }
            }

            String getDomain();

            List<IdentityProviders> getIdentityProviders();

            List<String> getRedirectSignInUri();

            List<String> getRedirectSignOutUri();

            ResponseType getResponseType();

            List<String> getScopes();
        }

        @InternalAmplifyApi
        public interface PasswordPolicy {
            Integer getMinLength();

            Boolean getRequireLowercase();

            Boolean getRequireNumbers();

            Boolean getRequireSymbols();

            Boolean getRequireUppercase();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @dff
        @InternalAmplifyApi
        public static final class UserVerificationTypes {
            private static final /* synthetic */ gi6 $ENTRIES;
            private static final /* synthetic */ UserVerificationTypes[] $VALUES;
            private static final gi9 $cachedSerializer$delegate;
            public static final Companion Companion;
            public static final UserVerificationTypes Email = new UserVerificationTypes("Email", 0);
            public static final UserVerificationTypes PhoneNumber = new UserVerificationTypes("PhoneNumber", 1);

            public static final class Companion {

                /* renamed from: com.amplifyframework.core.configuration.AmplifyOutputsData$Auth$UserVerificationTypes$Companion$1 */
                public static final class C105501 extends kf9 implements uk7 {
                    public static final C105501 INSTANCE = new C105501();

                    public C105501() {
                        super(0);
                    }

                    @Override // p001o.uk7
                    public final dc9 invoke() {
                        return ni6.m40629a("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.UserVerificationTypes", UserVerificationTypes.values(), new String[]{"email", "phone_number"}, new Annotation[][]{null, null}, null);
                    }
                }

                private Companion() {
                }

                public /* synthetic */ Companion(id5 id5Var) {
                    this();
                }

                private final /* synthetic */ dc9 get$cachedSerializer() {
                    return (dc9) UserVerificationTypes.$cachedSerializer$delegate.getValue();
                }

                public final dc9 serializer() {
                    return get$cachedSerializer();
                }
            }

            private static final /* synthetic */ UserVerificationTypes[] $values() {
                return new UserVerificationTypes[]{Email, PhoneNumber};
            }

            static {
                UserVerificationTypes[] userVerificationTypesArr$values = $values();
                $VALUES = userVerificationTypesArr$values;
                $ENTRIES = hi6.m30609a(userVerificationTypesArr$values);
                Companion = new Companion(null);
                $cachedSerializer$delegate = si9.m48361b(cj9.PUBLICATION, Companion.C105501.INSTANCE);
            }

            private UserVerificationTypes(String str, int i) {
            }

            public static gi6 getEntries() {
                return $ENTRIES;
            }

            public static UserVerificationTypes valueOf(String str) {
                return (UserVerificationTypes) Enum.valueOf(UserVerificationTypes.class, str);
            }

            public static UserVerificationTypes[] values() {
                return (UserVerificationTypes[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @dff
        @InternalAmplifyApi
        public static final class UsernameAttributes {
            private static final /* synthetic */ gi6 $ENTRIES;
            private static final /* synthetic */ UsernameAttributes[] $VALUES;
            private static final gi9 $cachedSerializer$delegate;
            public static final Companion Companion;
            public static final UsernameAttributes Username = new UsernameAttributes("Username", 0);
            public static final UsernameAttributes Email = new UsernameAttributes("Email", 1);
            public static final UsernameAttributes PhoneNumber = new UsernameAttributes("PhoneNumber", 2);

            public static final class Companion {

                /* renamed from: com.amplifyframework.core.configuration.AmplifyOutputsData$Auth$UsernameAttributes$Companion$1 */
                public static final class C105511 extends kf9 implements uk7 {
                    public static final C105511 INSTANCE = new C105511();

                    public C105511() {
                        super(0);
                    }

                    @Override // p001o.uk7
                    public final dc9 invoke() {
                        return ni6.m40629a("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.UsernameAttributes", UsernameAttributes.values(), new String[]{"username", "email", "phone_number"}, new Annotation[][]{null, null, null}, null);
                    }
                }

                private Companion() {
                }

                public /* synthetic */ Companion(id5 id5Var) {
                    this();
                }

                private final /* synthetic */ dc9 get$cachedSerializer() {
                    return (dc9) UsernameAttributes.$cachedSerializer$delegate.getValue();
                }

                public final dc9 serializer() {
                    return get$cachedSerializer();
                }
            }

            private static final /* synthetic */ UsernameAttributes[] $values() {
                return new UsernameAttributes[]{Username, Email, PhoneNumber};
            }

            static {
                UsernameAttributes[] usernameAttributesArr$values = $values();
                $VALUES = usernameAttributesArr$values;
                $ENTRIES = hi6.m30609a(usernameAttributesArr$values);
                Companion = new Companion(null);
                $cachedSerializer$delegate = si9.m48361b(cj9.PUBLICATION, Companion.C105511.INSTANCE);
            }

            private UsernameAttributes(String str, int i) {
            }

            public static gi6 getEntries() {
                return $ENTRIES;
            }

            public static UsernameAttributes valueOf(String str) {
                return (UsernameAttributes) Enum.valueOf(UsernameAttributes.class, str);
            }

            public static UsernameAttributes[] values() {
                return (UsernameAttributes[]) $VALUES.clone();
            }
        }

        String getAwsRegion();

        String getIdentityPoolId();

        MfaConfiguration getMfaConfiguration();

        List<MfaMethods> getMfaMethods();

        Oauth getOauth();

        PasswordPolicy getPasswordPolicy();

        List<AuthUserAttributeKey> getStandardRequiredAttributes();

        boolean getUnauthenticatedIdentitiesEnabled();

        String getUserPoolClientId();

        String getUserPoolId();

        List<UserVerificationTypes> getUserVerificationTypes();

        List<UsernameAttributes> getUsernameAttributes();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InternalAmplifyApi
    public static final class AwsAppsyncAuthorizationType {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ AwsAppsyncAuthorizationType[] $VALUES;
        public static final AwsAppsyncAuthorizationType AMAZON_COGNITO_USER_POOLS = new AwsAppsyncAuthorizationType("AMAZON_COGNITO_USER_POOLS", 0);
        public static final AwsAppsyncAuthorizationType API_KEY = new AwsAppsyncAuthorizationType("API_KEY", 1);
        public static final AwsAppsyncAuthorizationType AWS_IAM = new AwsAppsyncAuthorizationType("AWS_IAM", 2);
        public static final AwsAppsyncAuthorizationType AWS_LAMBDA = new AwsAppsyncAuthorizationType("AWS_LAMBDA", 3);
        public static final AwsAppsyncAuthorizationType OPENID_CONNECT = new AwsAppsyncAuthorizationType("OPENID_CONNECT", 4);

        private static final /* synthetic */ AwsAppsyncAuthorizationType[] $values() {
            return new AwsAppsyncAuthorizationType[]{AMAZON_COGNITO_USER_POOLS, API_KEY, AWS_IAM, AWS_LAMBDA, OPENID_CONNECT};
        }

        static {
            AwsAppsyncAuthorizationType[] awsAppsyncAuthorizationTypeArr$values = $values();
            $VALUES = awsAppsyncAuthorizationTypeArr$values;
            $ENTRIES = hi6.m30609a(awsAppsyncAuthorizationTypeArr$values);
        }

        private AwsAppsyncAuthorizationType(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static AwsAppsyncAuthorizationType valueOf(String str) {
            return (AwsAppsyncAuthorizationType) Enum.valueOf(AwsAppsyncAuthorizationType.class, str);
        }

        public static AwsAppsyncAuthorizationType[] values() {
            return (AwsAppsyncAuthorizationType[]) $VALUES.clone();
        }
    }

    @InternalAmplifyApi
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private final String readContent(AmplifyOutputsResource amplifyOutputsResource, Context context) throws IllegalAccessException, Resources.NotFoundException, IOException, IllegalArgumentException, InvocationTargetException {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(amplifyOutputsResource.getResourceId());
            sq8.m48648g(inputStreamOpenRawResource, "openRawResource(...)");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, sh2.f45422b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String strM51644d = uih.m51644d(bufferedReader);
                tb3.m49666a(bufferedReader, null);
                return strM51644d;
            } finally {
            }
        }

        @InternalAmplifyApi
        public final AmplifyOutputsData deserialize(Context context, AmplifyOutputs amplifyOutputs) throws IllegalAccessException, Resources.NotFoundException, IOException, IllegalArgumentException, InvocationTargetException {
            String json;
            sq8.m48649h(context, "context");
            sq8.m48649h(amplifyOutputs, "amplifyOutputs");
            if (amplifyOutputs instanceof AmplifyOutputsResource) {
                json = readContent((AmplifyOutputsResource) amplifyOutputs, context);
            } else {
                if (!(amplifyOutputs instanceof AmplifyOutputsString)) {
                    throw new szb();
                }
                json = ((AmplifyOutputsString) amplifyOutputs).getJson();
            }
            return deserialize$com_amplifyframework_core_release(json);
        }

        public final AmplifyOutputsData deserialize$com_amplifyframework_core_release(String str) throws AmplifyException {
            sq8.m48649h(str, FirebaseAnalytics.Param.CONTENT);
            p79 p79VarM26299b = f99.m26299b(null, AmplifyOutputsData$Companion$deserialize$json$1.INSTANCE, 1, null);
            try {
                p79VarM26299b.mo43085a();
                return (AmplifyOutputsData) p79VarM26299b.m43086c(AmplifyOutputsDataImpl.Companion.serializer(), str);
            } catch (Exception e) {
                throw new AmplifyException("Could not decode AmplifyOutputs", e, "Ensure the AmplifyOutputs data is correct");
            }
        }
    }

    @InternalAmplifyApi
    public interface Data {
        String getApiKey();

        List<AwsAppsyncAuthorizationType> getAuthorizationTypes();

        String getAwsRegion();

        AwsAppsyncAuthorizationType getDefaultAuthorizationType();

        String getUrl();
    }

    @InternalAmplifyApi
    public interface Geo {

        @InternalAmplifyApi
        public interface GeofenceCollections {
            String getDefault();

            Set<String> getItems();
        }

        @InternalAmplifyApi
        public interface Maps {
            String getDefault();

            Map<String, AmazonLocationServiceConfig> getItems();
        }

        @InternalAmplifyApi
        public interface SearchIndices {
            String getDefault();

            Set<String> getItems();
        }

        String getAwsRegion();

        GeofenceCollections getGeofenceCollections();

        Maps getMaps();

        SearchIndices getSearchIndices();
    }

    @InternalAmplifyApi
    public interface Notifications {
        String getAmazonPinpointAppId();

        String getAwsRegion();

        List<AmazonPinpointChannels> getChannels();
    }

    @InternalAmplifyApi
    public interface Storage {
        String getAwsRegion();

        String getBucketName();

        List<StorageBucket> getBuckets();
    }

    @InternalAmplifyApi
    public interface StorageBucket {
        String getAwsRegion();

        String getBucketName();

        String getName();
    }

    @InternalAmplifyApi
    static AmplifyOutputsData deserialize(Context context, AmplifyOutputs amplifyOutputs) {
        return Companion.deserialize(context, amplifyOutputs);
    }

    Analytics getAnalytics();

    Auth getAuth();

    z99 getCustom();

    Data getData();

    Geo getGeo();

    Notifications getNotifications();

    Storage getStorage();

    String getVersion();
}

package com.amplifyframework.core.configuration;

import an.j5;
import android.content.Context;
import android.content.res.Resources;
import aw.C0466f;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import fy.InterfaceC2401a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jy.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import ky.C4276h;
import ky.C4290v;
import ky.C4294z;
import nx.AbstractC5163a;
import og.nd;
import og.s1;
import pg.b8;
import pg.y9;
import qw.EnumC6359i;
import qw.InterfaceC6357g;
import qw.a0;
import xw.InterfaceC8493a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public interface AmplifyOutputsData {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public interface AmazonLocationServiceConfig {
        String getStyle();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public static final class AmazonPinpointChannels {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
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
            $ENTRIES = b8.m11548b(amazonPinpointChannelsArr$values);
        }

        private AmazonPinpointChannels(String str, int i10) {
        }

        public static InterfaceC8493a getEntries() {
            return $ENTRIES;
        }

        public static AmazonPinpointChannels valueOf(String str) {
            return (AmazonPinpointChannels) Enum.valueOf(AmazonPinpointChannels.class, str);
        }

        public static AmazonPinpointChannels[] values() {
            return (AmazonPinpointChannels[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public interface Analytics {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        @InternalAmplifyApi
        public interface AmazonPinpoint {
            String getAppId();

            String getAwsRegion();
        }

        AmazonPinpoint getAmazonPinpoint();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public interface Auth {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        @InternalAmplifyApi
        public static final class MfaConfiguration {
            private static final /* synthetic */ InterfaceC8493a $ENTRIES;
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
                $ENTRIES = b8.m11548b(mfaConfigurationArr$values);
            }

            private MfaConfiguration(String str, int i10) {
            }

            public static InterfaceC8493a getEntries() {
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
        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        @InternalAmplifyApi
        public static final class MfaMethods {
            private static final /* synthetic */ InterfaceC8493a $ENTRIES;
            private static final /* synthetic */ MfaMethods[] $VALUES;
            public static final MfaMethods SMS = new MfaMethods("SMS", 0);
            public static final MfaMethods TOTP = new MfaMethods("TOTP", 1);

            private static final /* synthetic */ MfaMethods[] $values() {
                return new MfaMethods[]{SMS, TOTP};
            }

            static {
                MfaMethods[] mfaMethodsArr$values = $values();
                $VALUES = mfaMethodsArr$values;
                $ENTRIES = b8.m11548b(mfaMethodsArr$values);
            }

            private MfaMethods(String str, int i10) {
            }

            public static InterfaceC8493a getEntries() {
                return $ENTRIES;
            }

            public static MfaMethods valueOf(String str) {
                return (MfaMethods) Enum.valueOf(MfaMethods.class, str);
            }

            public static MfaMethods[] values() {
                return (MfaMethods[]) $VALUES.clone();
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        @InternalAmplifyApi
        public interface Oauth {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
            @InternalAmplifyApi
            public static final class IdentityProviders {
                private static final /* synthetic */ InterfaceC8493a $ENTRIES;
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
                    $ENTRIES = b8.m11548b(identityProvidersArr$values);
                }

                private IdentityProviders(String str, int i10) {
                }

                public static InterfaceC8493a getEntries() {
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
            /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
            @InternalAmplifyApi
            public static final class ResponseType {
                private static final /* synthetic */ InterfaceC8493a $ENTRIES;
                private static final /* synthetic */ ResponseType[] $VALUES;
                private static final InterfaceC6357g $cachedSerializer$delegate;
                public static final Companion Companion;
                public static final ResponseType Code = new ResponseType("Code", 0);
                public static final ResponseType Token = new ResponseType("Token", 1);

                /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
                public static final class Companion {
                    private Companion() {
                    }

                    private final /* synthetic */ InterfaceC2401a get$cachedSerializer() {
                        return (InterfaceC2401a) ResponseType.$cachedSerializer$delegate.getValue();
                    }

                    public final InterfaceC2401a serializer() {
                        return get$cachedSerializer();
                    }

                    public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                        this();
                    }
                }

                private static final /* synthetic */ ResponseType[] $values() {
                    return new ResponseType[]{Code, Token};
                }

                static {
                    ResponseType[] responseTypeArr$values = $values();
                    $VALUES = responseTypeArr$values;
                    $ENTRIES = b8.m11548b(responseTypeArr$values);
                    Companion = new Companion(null);
                    $cachedSerializer$delegate = nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(5));
                }

                private ResponseType(String str, int i10) {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ InterfaceC2401a _init_$_anonymous_() {
                    return n0.m8423d("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.Oauth.ResponseType", values(), new String[]{"code", AWSCognitoLegacyCredentialStore.TOKEN_KEY}, new Annotation[][]{null, null});
                }

                public static InterfaceC8493a getEntries() {
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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
        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        @InternalAmplifyApi
        public static final class UserVerificationTypes {
            private static final /* synthetic */ InterfaceC8493a $ENTRIES;
            private static final /* synthetic */ UserVerificationTypes[] $VALUES;
            private static final InterfaceC6357g $cachedSerializer$delegate;
            public static final Companion Companion;
            public static final UserVerificationTypes Email = new UserVerificationTypes("Email", 0);
            public static final UserVerificationTypes PhoneNumber = new UserVerificationTypes("PhoneNumber", 1);

            /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
            public static final class Companion {
                private Companion() {
                }

                private final /* synthetic */ InterfaceC2401a get$cachedSerializer() {
                    return (InterfaceC2401a) UserVerificationTypes.$cachedSerializer$delegate.getValue();
                }

                public final InterfaceC2401a serializer() {
                    return get$cachedSerializer();
                }

                public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                    this();
                }
            }

            private static final /* synthetic */ UserVerificationTypes[] $values() {
                return new UserVerificationTypes[]{Email, PhoneNumber};
            }

            static {
                UserVerificationTypes[] userVerificationTypesArr$values = $values();
                $VALUES = userVerificationTypesArr$values;
                $ENTRIES = b8.m11548b(userVerificationTypesArr$values);
                Companion = new Companion(null);
                $cachedSerializer$delegate = nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(6));
            }

            private UserVerificationTypes(String str, int i10) {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC2401a _init_$_anonymous_() {
                return n0.m8423d("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.UserVerificationTypes", values(), new String[]{"email", "phone_number"}, new Annotation[][]{null, null});
            }

            public static InterfaceC8493a getEntries() {
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
        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        @InternalAmplifyApi
        public static final class UsernameAttributes {
            private static final /* synthetic */ InterfaceC8493a $ENTRIES;
            private static final /* synthetic */ UsernameAttributes[] $VALUES;
            private static final InterfaceC6357g $cachedSerializer$delegate;
            public static final Companion Companion;
            public static final UsernameAttributes Username = new UsernameAttributes("Username", 0);
            public static final UsernameAttributes Email = new UsernameAttributes("Email", 1);
            public static final UsernameAttributes PhoneNumber = new UsernameAttributes("PhoneNumber", 2);

            /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
            public static final class Companion {
                private Companion() {
                }

                private final /* synthetic */ InterfaceC2401a get$cachedSerializer() {
                    return (InterfaceC2401a) UsernameAttributes.$cachedSerializer$delegate.getValue();
                }

                public final InterfaceC2401a serializer() {
                    return get$cachedSerializer();
                }

                public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                    this();
                }
            }

            private static final /* synthetic */ UsernameAttributes[] $values() {
                return new UsernameAttributes[]{Username, Email, PhoneNumber};
            }

            static {
                UsernameAttributes[] usernameAttributesArr$values = $values();
                $VALUES = usernameAttributesArr$values;
                $ENTRIES = b8.m11548b(usernameAttributesArr$values);
                Companion = new Companion(null);
                $cachedSerializer$delegate = nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(7));
            }

            private UsernameAttributes(String str, int i10) {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC2401a _init_$_anonymous_() {
                return n0.m8423d("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.UsernameAttributes", values(), new String[]{"username", "email", "phone_number"}, new Annotation[][]{null, null, null});
            }

            public static InterfaceC8493a getEntries() {
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
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public static final class AwsAppsyncAuthorizationType {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
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
            $ENTRIES = b8.m11548b(awsAppsyncAuthorizationTypeArr$values);
        }

        private AwsAppsyncAuthorizationType(String str, int i10) {
        }

        public static InterfaceC8493a getEntries() {
            return $ENTRIES;
        }

        public static AwsAppsyncAuthorizationType valueOf(String str) {
            return (AwsAppsyncAuthorizationType) Enum.valueOf(AwsAppsyncAuthorizationType.class, str);
        }

        public static AwsAppsyncAuthorizationType[] values() {
            return (AwsAppsyncAuthorizationType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a0 deserialize$lambda$0(C4276h Json) {
            AbstractC4154l.m8923f(Json, "$this$Json");
            Json.f21679b = true;
            Json.f21680c = C4290v.f21696a;
            Json.f21678a = false;
            return a0.f30746a;
        }

        private final String readContent(AmplifyOutputsResource amplifyOutputsResource, Context context) throws Resources.NotFoundException, IOException {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(amplifyOutputsResource.getResourceId());
            AbstractC4154l.m8922e(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, AbstractC5163a.f25245a), 8192);
            try {
                String strM10887b = s1.m10887b(bufferedReader);
                bufferedReader.close();
                return strM10887b;
            } finally {
            }
        }

        @InternalAmplifyApi
        public final AmplifyOutputsData deserialize(Context context, AmplifyOutputs amplifyOutputs) throws Resources.NotFoundException, IOException {
            String json;
            AbstractC4154l.m8923f(context, "context");
            AbstractC4154l.m8923f(amplifyOutputs, "amplifyOutputs");
            if (amplifyOutputs instanceof AmplifyOutputsResource) {
                json = readContent((AmplifyOutputsResource) amplifyOutputs, context);
            } else {
                if (!(amplifyOutputs instanceof AmplifyOutputsString)) {
                    throw new NoWhenBranchMatchedException();
                }
                json = ((AmplifyOutputsString) amplifyOutputs).getJson();
            }
            return deserialize$core_release(json);
        }

        public final AmplifyOutputsData deserialize$core_release(String content) throws AmplifyException {
            AbstractC4154l.m8923f(content, "content");
            try {
                return (AmplifyOutputsData) y9.m11954a(new j5(27)).m8987a(AmplifyOutputsDataImpl.Companion.serializer(), content);
            } catch (Exception e2) {
                throw new AmplifyException("Could not decode AmplifyOutputs", e2, "Ensure the AmplifyOutputs data is correct");
            }
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public interface Data {
        String getApiKey();

        List<AwsAppsyncAuthorizationType> getAuthorizationTypes();

        String getAwsRegion();

        AwsAppsyncAuthorizationType getDefaultAuthorizationType();

        String getUrl();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public interface Geo {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        @InternalAmplifyApi
        public interface GeofenceCollections {
            String getDefault();

            Set<String> getItems();
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        @InternalAmplifyApi
        public interface Maps {
            String getDefault();

            Map<String, AmazonLocationServiceConfig> getItems();
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public interface Notifications {
        String getAmazonPinpointAppId();

        String getAwsRegion();

        List<AmazonPinpointChannels> getChannels();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public interface Storage {
        String getAwsRegion();

        String getBucketName();

        List<StorageBucket> getBuckets();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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

    C4294z getCustom();

    Data getData();

    Geo getGeo();

    Notifications getNotifications();

    Storage getStorage();

    String getVersion();
}

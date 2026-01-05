package com.amplifyframework.core.configuration;

import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.cookie.ClientCookie;
import p001o.aa9;
import p001o.bea;
import p001o.ch3;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.hk1;
import p001o.id5;
import p001o.ll8;
import p001o.lo3;
import p001o.ni6;
import p001o.p8g;
import p001o.sq8;
import p001o.tbd;
import p001o.to0;
import p001o.uef;
import p001o.z99;
import p001o.zda;

@dff
/* loaded from: classes5.dex */
public final class AmplifyOutputsDataImpl implements AmplifyOutputsData {
    public static final Companion Companion = new Companion(null);
    private final Analytics analytics;
    private final Auth auth;
    private final z99 custom;
    private final Data data;
    private final Geo geo;
    private final Notifications notifications;
    private final Storage storage;
    private final String version;

    @dff
    public static final class AmazonLocationServiceConfig implements AmplifyOutputsData.AmazonLocationServiceConfig {
        public static final Companion Companion = new Companion(null);
        private final String style;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AmazonLocationServiceConfig(int i, String str, fff fffVar) {
            if (1 != (i & 1)) {
                tbd.m49692a(i, 1, AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer.INSTANCE.getDescriptor());
            }
            this.style = str;
        }

        public static /* synthetic */ AmazonLocationServiceConfig copy$default(AmazonLocationServiceConfig amazonLocationServiceConfig, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = amazonLocationServiceConfig.style;
            }
            return amazonLocationServiceConfig.copy(str);
        }

        public final String component1() {
            return this.style;
        }

        public final AmazonLocationServiceConfig copy(String str) {
            sq8.m48649h(str, "style");
            return new AmazonLocationServiceConfig(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmazonLocationServiceConfig) && sq8.m48644c(this.style, ((AmazonLocationServiceConfig) obj).style);
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.AmazonLocationServiceConfig
        public String getStyle() {
            return this.style;
        }

        public int hashCode() {
            return this.style.hashCode();
        }

        public String toString() {
            return "AmazonLocationServiceConfig(style=" + this.style + ")";
        }

        public AmazonLocationServiceConfig(String str) {
            sq8.m48649h(str, "style");
            this.style = str;
        }
    }

    @dff
    public static final class Analytics implements AmplifyOutputsData.Analytics {
        public static final Companion Companion = new Companion(null);
        private final AmazonPinpoint amazonPinpoint;

        @dff
        public static final class AmazonPinpoint implements AmplifyOutputsData.Analytics.AmazonPinpoint {
            public static final Companion Companion = new Companion(null);
            private final String appId;
            private final String awsRegion;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(id5 id5Var) {
                    this();
                }

                public final dc9 serializer() {
                    return AmplifyOutputsDataImpl$Analytics$AmazonPinpoint$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ AmazonPinpoint(int i, String str, String str2, fff fffVar) {
                if (3 != (i & 3)) {
                    tbd.m49692a(i, 3, AmplifyOutputsDataImpl$Analytics$AmazonPinpoint$$serializer.INSTANCE.getDescriptor());
                }
                this.awsRegion = str;
                this.appId = str2;
            }

            public static /* synthetic */ AmazonPinpoint copy$default(AmazonPinpoint amazonPinpoint, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = amazonPinpoint.awsRegion;
                }
                if ((i & 2) != 0) {
                    str2 = amazonPinpoint.appId;
                }
                return amazonPinpoint.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self(AmazonPinpoint amazonPinpoint, lo3 lo3Var, uef uefVar) {
                lo3Var.mo37568p(uefVar, 0, amazonPinpoint.getAwsRegion());
                lo3Var.mo37568p(uefVar, 1, amazonPinpoint.getAppId());
            }

            public final String component1() {
                return this.awsRegion;
            }

            public final String component2() {
                return this.appId;
            }

            public final AmazonPinpoint copy(String str, String str2) {
                sq8.m48649h(str, "awsRegion");
                sq8.m48649h(str2, RemoteConfigConstants.RequestFieldKey.APP_ID);
                return new AmazonPinpoint(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AmazonPinpoint)) {
                    return false;
                }
                AmazonPinpoint amazonPinpoint = (AmazonPinpoint) obj;
                return sq8.m48644c(this.awsRegion, amazonPinpoint.awsRegion) && sq8.m48644c(this.appId, amazonPinpoint.appId);
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Analytics.AmazonPinpoint
            public String getAppId() {
                return this.appId;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Analytics.AmazonPinpoint
            public String getAwsRegion() {
                return this.awsRegion;
            }

            public int hashCode() {
                return (this.awsRegion.hashCode() * 31) + this.appId.hashCode();
            }

            public String toString() {
                return "AmazonPinpoint(awsRegion=" + this.awsRegion + ", appId=" + this.appId + ")";
            }

            public AmazonPinpoint(String str, String str2) {
                sq8.m48649h(str, "awsRegion");
                sq8.m48649h(str2, RemoteConfigConstants.RequestFieldKey.APP_ID);
                this.awsRegion = str;
                this.appId = str2;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Analytics(int i, AmazonPinpoint amazonPinpoint, fff fffVar) {
            if (1 != (i & 1)) {
                tbd.m49692a(i, 1, AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE.getDescriptor());
            }
            this.amazonPinpoint = amazonPinpoint;
        }

        public static /* synthetic */ Analytics copy$default(Analytics analytics, AmazonPinpoint amazonPinpoint, int i, Object obj) {
            if ((i & 1) != 0) {
                amazonPinpoint = analytics.amazonPinpoint;
            }
            return analytics.copy(amazonPinpoint);
        }

        public final AmazonPinpoint component1() {
            return this.amazonPinpoint;
        }

        public final Analytics copy(AmazonPinpoint amazonPinpoint) {
            return new Analytics(amazonPinpoint);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && sq8.m48644c(this.amazonPinpoint, ((Analytics) obj).amazonPinpoint);
        }

        public int hashCode() {
            AmazonPinpoint amazonPinpoint = this.amazonPinpoint;
            if (amazonPinpoint == null) {
                return 0;
            }
            return amazonPinpoint.hashCode();
        }

        public String toString() {
            return "Analytics(amazonPinpoint=" + this.amazonPinpoint + ")";
        }

        public Analytics(AmazonPinpoint amazonPinpoint) {
            this.amazonPinpoint = amazonPinpoint;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Analytics
        public AmazonPinpoint getAmazonPinpoint() {
            return this.amazonPinpoint;
        }
    }

    @dff
    public static final class Auth implements AmplifyOutputsData.Auth {
        private final String awsRegion;
        private final String identityPoolId;
        private final AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration;
        private final List<AmplifyOutputsData.Auth.MfaMethods> mfaMethods;
        private final Oauth oauth;
        private final PasswordPolicy passwordPolicy;
        private final List<AuthUserAttributeKey> standardRequiredAttributes;
        private final boolean unauthenticatedIdentitiesEnabled;
        private final String userPoolClientId;
        private final String userPoolId;
        private final List<AmplifyOutputsData.Auth.UserVerificationTypes> userVerificationTypes;
        private final List<AmplifyOutputsData.Auth.UsernameAttributes> usernameAttributes;
        public static final Companion Companion = new Companion(null);
        private static final dc9[] $childSerializers = {null, null, null, null, null, null, new to0(AuthUserAttributeKeySerializer.INSTANCE), new to0(AmplifyOutputsData.Auth.UsernameAttributes.Companion.serializer()), new to0(AmplifyOutputsData.Auth.UserVerificationTypes.Companion.serializer()), null, ni6.m40630b("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.MfaConfiguration", AmplifyOutputsData.Auth.MfaConfiguration.values()), new to0(ni6.m40630b("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.MfaMethods", AmplifyOutputsData.Auth.MfaMethods.values()))};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE;
            }
        }

        @dff
        public static final class Oauth implements AmplifyOutputsData.Auth.Oauth {
            private static final dc9[] $childSerializers;
            public static final Companion Companion = new Companion(null);
            private final String domain;
            private final List<AmplifyOutputsData.Auth.Oauth.IdentityProviders> identityProviders;
            private final List<String> redirectSignInUri;
            private final List<String> redirectSignOutUri;
            private final AmplifyOutputsData.Auth.Oauth.ResponseType responseType;
            private final List<String> scopes;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(id5 id5Var) {
                    this();
                }

                public final dc9 serializer() {
                    return AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE;
                }
            }

            static {
                p8g p8gVar = p8g.f39602a;
                $childSerializers = new dc9[]{new to0(ni6.m40630b("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.Oauth.IdentityProviders", AmplifyOutputsData.Auth.Oauth.IdentityProviders.values())), null, new to0(p8gVar), new to0(p8gVar), new to0(p8gVar), AmplifyOutputsData.Auth.Oauth.ResponseType.Companion.serializer()};
            }

            public /* synthetic */ Oauth(int i, List list, String str, List list2, List list3, List list4, AmplifyOutputsData.Auth.Oauth.ResponseType responseType, fff fffVar) {
                if (63 != (i & 63)) {
                    tbd.m49692a(i, 63, AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE.getDescriptor());
                }
                this.identityProviders = list;
                this.domain = str;
                this.scopes = list2;
                this.redirectSignInUri = list3;
                this.redirectSignOutUri = list4;
                this.responseType = responseType;
            }

            public static /* synthetic */ Oauth copy$default(Oauth oauth, List list, String str, List list2, List list3, List list4, AmplifyOutputsData.Auth.Oauth.ResponseType responseType, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = oauth.identityProviders;
                }
                if ((i & 2) != 0) {
                    str = oauth.domain;
                }
                String str2 = str;
                if ((i & 4) != 0) {
                    list2 = oauth.scopes;
                }
                List list5 = list2;
                if ((i & 8) != 0) {
                    list3 = oauth.redirectSignInUri;
                }
                List list6 = list3;
                if ((i & 16) != 0) {
                    list4 = oauth.redirectSignOutUri;
                }
                List list7 = list4;
                if ((i & 32) != 0) {
                    responseType = oauth.responseType;
                }
                return oauth.copy(list, str2, list5, list6, list7, responseType);
            }

            public static final /* synthetic */ void write$Self(Oauth oauth, lo3 lo3Var, uef uefVar) {
                dc9[] dc9VarArr = $childSerializers;
                lo3Var.mo37566l(uefVar, 0, dc9VarArr[0], oauth.getIdentityProviders());
                lo3Var.mo37568p(uefVar, 1, oauth.getDomain());
                lo3Var.mo37566l(uefVar, 2, dc9VarArr[2], oauth.getScopes());
                lo3Var.mo37566l(uefVar, 3, dc9VarArr[3], oauth.getRedirectSignInUri());
                lo3Var.mo37566l(uefVar, 4, dc9VarArr[4], oauth.getRedirectSignOutUri());
                lo3Var.mo37566l(uefVar, 5, dc9VarArr[5], oauth.getResponseType());
            }

            public final List<AmplifyOutputsData.Auth.Oauth.IdentityProviders> component1() {
                return this.identityProviders;
            }

            public final String component2() {
                return this.domain;
            }

            public final List<String> component3() {
                return this.scopes;
            }

            public final List<String> component4() {
                return this.redirectSignInUri;
            }

            public final List<String> component5() {
                return this.redirectSignOutUri;
            }

            public final AmplifyOutputsData.Auth.Oauth.ResponseType component6() {
                return this.responseType;
            }

            public final Oauth copy(List<? extends AmplifyOutputsData.Auth.Oauth.IdentityProviders> list, String str, List<String> list2, List<String> list3, List<String> list4, AmplifyOutputsData.Auth.Oauth.ResponseType responseType) {
                sq8.m48649h(list, "identityProviders");
                sq8.m48649h(str, ClientCookie.DOMAIN_ATTR);
                sq8.m48649h(list2, "scopes");
                sq8.m48649h(list3, "redirectSignInUri");
                sq8.m48649h(list4, "redirectSignOutUri");
                sq8.m48649h(responseType, "responseType");
                return new Oauth(list, str, list2, list3, list4, responseType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Oauth)) {
                    return false;
                }
                Oauth oauth = (Oauth) obj;
                return sq8.m48644c(this.identityProviders, oauth.identityProviders) && sq8.m48644c(this.domain, oauth.domain) && sq8.m48644c(this.scopes, oauth.scopes) && sq8.m48644c(this.redirectSignInUri, oauth.redirectSignInUri) && sq8.m48644c(this.redirectSignOutUri, oauth.redirectSignOutUri) && this.responseType == oauth.responseType;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.Oauth
            public String getDomain() {
                return this.domain;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.Oauth
            public List<AmplifyOutputsData.Auth.Oauth.IdentityProviders> getIdentityProviders() {
                return this.identityProviders;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.Oauth
            public List<String> getRedirectSignInUri() {
                return this.redirectSignInUri;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.Oauth
            public List<String> getRedirectSignOutUri() {
                return this.redirectSignOutUri;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.Oauth
            public AmplifyOutputsData.Auth.Oauth.ResponseType getResponseType() {
                return this.responseType;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.Oauth
            public List<String> getScopes() {
                return this.scopes;
            }

            public int hashCode() {
                return (((((((((this.identityProviders.hashCode() * 31) + this.domain.hashCode()) * 31) + this.scopes.hashCode()) * 31) + this.redirectSignInUri.hashCode()) * 31) + this.redirectSignOutUri.hashCode()) * 31) + this.responseType.hashCode();
            }

            public String toString() {
                return "Oauth(identityProviders=" + this.identityProviders + ", domain=" + this.domain + ", scopes=" + this.scopes + ", redirectSignInUri=" + this.redirectSignInUri + ", redirectSignOutUri=" + this.redirectSignOutUri + ", responseType=" + this.responseType + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Oauth(List<? extends AmplifyOutputsData.Auth.Oauth.IdentityProviders> list, String str, List<String> list2, List<String> list3, List<String> list4, AmplifyOutputsData.Auth.Oauth.ResponseType responseType) {
                sq8.m48649h(list, "identityProviders");
                sq8.m48649h(str, ClientCookie.DOMAIN_ATTR);
                sq8.m48649h(list2, "scopes");
                sq8.m48649h(list3, "redirectSignInUri");
                sq8.m48649h(list4, "redirectSignOutUri");
                sq8.m48649h(responseType, "responseType");
                this.identityProviders = list;
                this.domain = str;
                this.scopes = list2;
                this.redirectSignInUri = list3;
                this.redirectSignOutUri = list4;
                this.responseType = responseType;
            }
        }

        @dff
        public static final class PasswordPolicy implements AmplifyOutputsData.Auth.PasswordPolicy {
            public static final Companion Companion = new Companion(null);
            private final Integer minLength;
            private final Boolean requireLowercase;
            private final Boolean requireNumbers;
            private final Boolean requireSymbols;
            private final Boolean requireUppercase;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(id5 id5Var) {
                    this();
                }

                public final dc9 serializer() {
                    return AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ PasswordPolicy(int i, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, fff fffVar) {
                if (31 != (i & 31)) {
                    tbd.m49692a(i, 31, AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE.getDescriptor());
                }
                this.minLength = num;
                this.requireNumbers = bool;
                this.requireLowercase = bool2;
                this.requireUppercase = bool3;
                this.requireSymbols = bool4;
            }

            public static /* synthetic */ PasswordPolicy copy$default(PasswordPolicy passwordPolicy, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = passwordPolicy.minLength;
                }
                if ((i & 2) != 0) {
                    bool = passwordPolicy.requireNumbers;
                }
                Boolean bool5 = bool;
                if ((i & 4) != 0) {
                    bool2 = passwordPolicy.requireLowercase;
                }
                Boolean bool6 = bool2;
                if ((i & 8) != 0) {
                    bool3 = passwordPolicy.requireUppercase;
                }
                Boolean bool7 = bool3;
                if ((i & 16) != 0) {
                    bool4 = passwordPolicy.requireSymbols;
                }
                return passwordPolicy.copy(num, bool5, bool6, bool7, bool4);
            }

            public static final /* synthetic */ void write$Self(PasswordPolicy passwordPolicy, lo3 lo3Var, uef uefVar) {
                lo3Var.mo37571z(uefVar, 0, ll8.f34006a, passwordPolicy.getMinLength());
                hk1 hk1Var = hk1.f27067a;
                lo3Var.mo37571z(uefVar, 1, hk1Var, passwordPolicy.getRequireNumbers());
                lo3Var.mo37571z(uefVar, 2, hk1Var, passwordPolicy.getRequireLowercase());
                lo3Var.mo37571z(uefVar, 3, hk1Var, passwordPolicy.getRequireUppercase());
                lo3Var.mo37571z(uefVar, 4, hk1Var, passwordPolicy.getRequireSymbols());
            }

            public final Integer component1() {
                return this.minLength;
            }

            public final Boolean component2() {
                return this.requireNumbers;
            }

            public final Boolean component3() {
                return this.requireLowercase;
            }

            public final Boolean component4() {
                return this.requireUppercase;
            }

            public final Boolean component5() {
                return this.requireSymbols;
            }

            public final PasswordPolicy copy(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
                return new PasswordPolicy(num, bool, bool2, bool3, bool4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PasswordPolicy)) {
                    return false;
                }
                PasswordPolicy passwordPolicy = (PasswordPolicy) obj;
                return sq8.m48644c(this.minLength, passwordPolicy.minLength) && sq8.m48644c(this.requireNumbers, passwordPolicy.requireNumbers) && sq8.m48644c(this.requireLowercase, passwordPolicy.requireLowercase) && sq8.m48644c(this.requireUppercase, passwordPolicy.requireUppercase) && sq8.m48644c(this.requireSymbols, passwordPolicy.requireSymbols);
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.PasswordPolicy
            public Integer getMinLength() {
                return this.minLength;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.PasswordPolicy
            public Boolean getRequireLowercase() {
                return this.requireLowercase;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.PasswordPolicy
            public Boolean getRequireNumbers() {
                return this.requireNumbers;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.PasswordPolicy
            public Boolean getRequireSymbols() {
                return this.requireSymbols;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.PasswordPolicy
            public Boolean getRequireUppercase() {
                return this.requireUppercase;
            }

            public int hashCode() {
                Integer num = this.minLength;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Boolean bool = this.requireNumbers;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.requireLowercase;
                int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.requireUppercase;
                int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Boolean bool4 = this.requireSymbols;
                return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
            }

            public String toString() {
                return "PasswordPolicy(minLength=" + this.minLength + ", requireNumbers=" + this.requireNumbers + ", requireLowercase=" + this.requireLowercase + ", requireUppercase=" + this.requireUppercase + ", requireSymbols=" + this.requireSymbols + ")";
            }

            public PasswordPolicy(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
                this.minLength = num;
                this.requireNumbers = bool;
                this.requireLowercase = bool2;
                this.requireUppercase = bool3;
                this.requireSymbols = bool4;
            }
        }

        public /* synthetic */ Auth(int i, String str, String str2, String str3, String str4, PasswordPolicy passwordPolicy, Oauth oauth, List list, List list2, List list3, boolean z, AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration, List list4, fff fffVar) {
            if (1087 != (i & 1087)) {
                tbd.m49692a(i, 1087, AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE.getDescriptor());
            }
            this.awsRegion = str;
            this.userPoolId = str2;
            this.userPoolClientId = str3;
            this.identityPoolId = str4;
            this.passwordPolicy = passwordPolicy;
            this.oauth = oauth;
            if ((i & 64) == 0) {
                this.standardRequiredAttributes = ch3.m21246k();
            } else {
                this.standardRequiredAttributes = list;
            }
            if ((i & 128) == 0) {
                this.usernameAttributes = ch3.m21246k();
            } else {
                this.usernameAttributes = list2;
            }
            if ((i & 256) == 0) {
                this.userVerificationTypes = ch3.m21246k();
            } else {
                this.userVerificationTypes = list3;
            }
            if ((i & 512) == 0) {
                this.unauthenticatedIdentitiesEnabled = true;
            } else {
                this.unauthenticatedIdentitiesEnabled = z;
            }
            this.mfaConfiguration = mfaConfiguration;
            if ((i & 2048) == 0) {
                this.mfaMethods = ch3.m21246k();
            } else {
                this.mfaMethods = list4;
            }
        }

        public static final /* synthetic */ void write$Self(Auth auth, lo3 lo3Var, uef uefVar) {
            dc9[] dc9VarArr = $childSerializers;
            lo3Var.mo37568p(uefVar, 0, auth.getAwsRegion());
            lo3Var.mo37568p(uefVar, 1, auth.getUserPoolId());
            lo3Var.mo37568p(uefVar, 2, auth.getUserPoolClientId());
            lo3Var.mo37571z(uefVar, 3, p8g.f39602a, auth.getIdentityPoolId());
            lo3Var.mo37571z(uefVar, 4, AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE, auth.getPasswordPolicy());
            lo3Var.mo37571z(uefVar, 5, AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE, auth.getOauth());
            if (lo3Var.mo37569r(uefVar, 6) || !sq8.m48644c(auth.getStandardRequiredAttributes(), ch3.m21246k())) {
                lo3Var.mo37566l(uefVar, 6, dc9VarArr[6], auth.getStandardRequiredAttributes());
            }
            if (lo3Var.mo37569r(uefVar, 7) || !sq8.m48644c(auth.getUsernameAttributes(), ch3.m21246k())) {
                lo3Var.mo37566l(uefVar, 7, dc9VarArr[7], auth.getUsernameAttributes());
            }
            if (lo3Var.mo37569r(uefVar, 8) || !sq8.m48644c(auth.getUserVerificationTypes(), ch3.m21246k())) {
                lo3Var.mo37566l(uefVar, 8, dc9VarArr[8], auth.getUserVerificationTypes());
            }
            if (lo3Var.mo37569r(uefVar, 9) || !auth.getUnauthenticatedIdentitiesEnabled()) {
                lo3Var.mo37561e(uefVar, 9, auth.getUnauthenticatedIdentitiesEnabled());
            }
            lo3Var.mo37571z(uefVar, 10, dc9VarArr[10], auth.getMfaConfiguration());
            if (lo3Var.mo37569r(uefVar, 11) || !sq8.m48644c(auth.getMfaMethods(), ch3.m21246k())) {
                lo3Var.mo37566l(uefVar, 11, dc9VarArr[11], auth.getMfaMethods());
            }
        }

        public final String component1() {
            return this.awsRegion;
        }

        public final boolean component10() {
            return this.unauthenticatedIdentitiesEnabled;
        }

        public final AmplifyOutputsData.Auth.MfaConfiguration component11() {
            return this.mfaConfiguration;
        }

        public final List<AmplifyOutputsData.Auth.MfaMethods> component12() {
            return this.mfaMethods;
        }

        public final String component2() {
            return this.userPoolId;
        }

        public final String component3() {
            return this.userPoolClientId;
        }

        public final String component4() {
            return this.identityPoolId;
        }

        public final PasswordPolicy component5() {
            return this.passwordPolicy;
        }

        public final Oauth component6() {
            return this.oauth;
        }

        public final List<AuthUserAttributeKey> component7() {
            return this.standardRequiredAttributes;
        }

        public final List<AmplifyOutputsData.Auth.UsernameAttributes> component8() {
            return this.usernameAttributes;
        }

        public final List<AmplifyOutputsData.Auth.UserVerificationTypes> component9() {
            return this.userVerificationTypes;
        }

        public final Auth copy(String str, String str2, String str3, String str4, PasswordPolicy passwordPolicy, Oauth oauth, List<AuthUserAttributeKey> list, List<? extends AmplifyOutputsData.Auth.UsernameAttributes> list2, List<? extends AmplifyOutputsData.Auth.UserVerificationTypes> list3, boolean z, AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration, List<? extends AmplifyOutputsData.Auth.MfaMethods> list4) {
            sq8.m48649h(str, "awsRegion");
            sq8.m48649h(str2, "userPoolId");
            sq8.m48649h(str3, "userPoolClientId");
            sq8.m48649h(list, "standardRequiredAttributes");
            sq8.m48649h(list2, "usernameAttributes");
            sq8.m48649h(list3, "userVerificationTypes");
            sq8.m48649h(list4, "mfaMethods");
            return new Auth(str, str2, str3, str4, passwordPolicy, oauth, list, list2, list3, z, mfaConfiguration, list4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Auth)) {
                return false;
            }
            Auth auth = (Auth) obj;
            return sq8.m48644c(this.awsRegion, auth.awsRegion) && sq8.m48644c(this.userPoolId, auth.userPoolId) && sq8.m48644c(this.userPoolClientId, auth.userPoolClientId) && sq8.m48644c(this.identityPoolId, auth.identityPoolId) && sq8.m48644c(this.passwordPolicy, auth.passwordPolicy) && sq8.m48644c(this.oauth, auth.oauth) && sq8.m48644c(this.standardRequiredAttributes, auth.standardRequiredAttributes) && sq8.m48644c(this.usernameAttributes, auth.usernameAttributes) && sq8.m48644c(this.userVerificationTypes, auth.userVerificationTypes) && this.unauthenticatedIdentitiesEnabled == auth.unauthenticatedIdentitiesEnabled && this.mfaConfiguration == auth.mfaConfiguration && sq8.m48644c(this.mfaMethods, auth.mfaMethods);
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public String getAwsRegion() {
            return this.awsRegion;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public String getIdentityPoolId() {
            return this.identityPoolId;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public AmplifyOutputsData.Auth.MfaConfiguration getMfaConfiguration() {
            return this.mfaConfiguration;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public List<AmplifyOutputsData.Auth.MfaMethods> getMfaMethods() {
            return this.mfaMethods;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public List<AuthUserAttributeKey> getStandardRequiredAttributes() {
            return this.standardRequiredAttributes;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public boolean getUnauthenticatedIdentitiesEnabled() {
            return this.unauthenticatedIdentitiesEnabled;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public String getUserPoolClientId() {
            return this.userPoolClientId;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public String getUserPoolId() {
            return this.userPoolId;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public List<AmplifyOutputsData.Auth.UserVerificationTypes> getUserVerificationTypes() {
            return this.userVerificationTypes;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public List<AmplifyOutputsData.Auth.UsernameAttributes> getUsernameAttributes() {
            return this.usernameAttributes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = ((((this.awsRegion.hashCode() * 31) + this.userPoolId.hashCode()) * 31) + this.userPoolClientId.hashCode()) * 31;
            String str = this.identityPoolId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            PasswordPolicy passwordPolicy = this.passwordPolicy;
            int iHashCode3 = (iHashCode2 + (passwordPolicy == null ? 0 : passwordPolicy.hashCode())) * 31;
            Oauth oauth = this.oauth;
            int iHashCode4 = (((((((iHashCode3 + (oauth == null ? 0 : oauth.hashCode())) * 31) + this.standardRequiredAttributes.hashCode()) * 31) + this.usernameAttributes.hashCode()) * 31) + this.userVerificationTypes.hashCode()) * 31;
            boolean z = this.unauthenticatedIdentitiesEnabled;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (iHashCode4 + i) * 31;
            AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration = this.mfaConfiguration;
            return ((i2 + (mfaConfiguration != null ? mfaConfiguration.hashCode() : 0)) * 31) + this.mfaMethods.hashCode();
        }

        public String toString() {
            return "Auth(awsRegion=" + this.awsRegion + ", userPoolId=" + this.userPoolId + ", userPoolClientId=" + this.userPoolClientId + ", identityPoolId=" + this.identityPoolId + ", passwordPolicy=" + this.passwordPolicy + ", oauth=" + this.oauth + ", standardRequiredAttributes=" + this.standardRequiredAttributes + ", usernameAttributes=" + this.usernameAttributes + ", userVerificationTypes=" + this.userVerificationTypes + ", unauthenticatedIdentitiesEnabled=" + this.unauthenticatedIdentitiesEnabled + ", mfaConfiguration=" + this.mfaConfiguration + ", mfaMethods=" + this.mfaMethods + ")";
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public Oauth getOauth() {
            return this.oauth;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public PasswordPolicy getPasswordPolicy() {
            return this.passwordPolicy;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Auth(String str, String str2, String str3, String str4, PasswordPolicy passwordPolicy, Oauth oauth, List<AuthUserAttributeKey> list, List<? extends AmplifyOutputsData.Auth.UsernameAttributes> list2, List<? extends AmplifyOutputsData.Auth.UserVerificationTypes> list3, boolean z, AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration, List<? extends AmplifyOutputsData.Auth.MfaMethods> list4) {
            sq8.m48649h(str, "awsRegion");
            sq8.m48649h(str2, "userPoolId");
            sq8.m48649h(str3, "userPoolClientId");
            sq8.m48649h(list, "standardRequiredAttributes");
            sq8.m48649h(list2, "usernameAttributes");
            sq8.m48649h(list3, "userVerificationTypes");
            sq8.m48649h(list4, "mfaMethods");
            this.awsRegion = str;
            this.userPoolId = str2;
            this.userPoolClientId = str3;
            this.identityPoolId = str4;
            this.passwordPolicy = passwordPolicy;
            this.oauth = oauth;
            this.standardRequiredAttributes = list;
            this.usernameAttributes = list2;
            this.userVerificationTypes = list3;
            this.unauthenticatedIdentitiesEnabled = z;
            this.mfaConfiguration = mfaConfiguration;
            this.mfaMethods = list4;
        }

        public /* synthetic */ Auth(String str, String str2, String str3, String str4, PasswordPolicy passwordPolicy, Oauth oauth, List list, List list2, List list3, boolean z, AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration, List list4, int i, id5 id5Var) {
            this(str, str2, str3, str4, passwordPolicy, oauth, (i & 64) != 0 ? ch3.m21246k() : list, (i & 128) != 0 ? ch3.m21246k() : list2, (i & 256) != 0 ? ch3.m21246k() : list3, (i & 512) != 0 ? true : z, mfaConfiguration, (i & 2048) != 0 ? ch3.m21246k() : list4);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return AmplifyOutputsDataImpl$$serializer.INSTANCE;
        }
    }

    @dff
    public static final class Data implements AmplifyOutputsData.Data {
        private final String apiKey;
        private final List<AmplifyOutputsData.AwsAppsyncAuthorizationType> authorizationTypes;
        private final String awsRegion;
        private final AmplifyOutputsData.AwsAppsyncAuthorizationType defaultAuthorizationType;
        private final String url;
        public static final Companion Companion = new Companion(null);
        private static final dc9[] $childSerializers = {null, null, null, ni6.m40630b("com.amplifyframework.core.configuration.AmplifyOutputsData.AwsAppsyncAuthorizationType", AmplifyOutputsData.AwsAppsyncAuthorizationType.values()), new to0(ni6.m40630b("com.amplifyframework.core.configuration.AmplifyOutputsData.AwsAppsyncAuthorizationType", AmplifyOutputsData.AwsAppsyncAuthorizationType.values()))};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyOutputsDataImpl$Data$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Data(int i, String str, String str2, String str3, AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType, List list, fff fffVar) {
            if (31 != (i & 31)) {
                tbd.m49692a(i, 31, AmplifyOutputsDataImpl$Data$$serializer.INSTANCE.getDescriptor());
            }
            this.awsRegion = str;
            this.url = str2;
            this.apiKey = str3;
            this.defaultAuthorizationType = awsAppsyncAuthorizationType;
            this.authorizationTypes = list;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.awsRegion;
            }
            if ((i & 2) != 0) {
                str2 = data.url;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = data.apiKey;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                awsAppsyncAuthorizationType = data.defaultAuthorizationType;
            }
            AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType2 = awsAppsyncAuthorizationType;
            if ((i & 16) != 0) {
                list = data.authorizationTypes;
            }
            return data.copy(str, str4, str5, awsAppsyncAuthorizationType2, list);
        }

        public static final /* synthetic */ void write$Self(Data data, lo3 lo3Var, uef uefVar) {
            dc9[] dc9VarArr = $childSerializers;
            lo3Var.mo37568p(uefVar, 0, data.getAwsRegion());
            lo3Var.mo37568p(uefVar, 1, data.getUrl());
            lo3Var.mo37571z(uefVar, 2, p8g.f39602a, data.getApiKey());
            lo3Var.mo37566l(uefVar, 3, dc9VarArr[3], data.getDefaultAuthorizationType());
            lo3Var.mo37566l(uefVar, 4, dc9VarArr[4], data.getAuthorizationTypes());
        }

        public final String component1() {
            return this.awsRegion;
        }

        public final String component2() {
            return this.url;
        }

        public final String component3() {
            return this.apiKey;
        }

        public final AmplifyOutputsData.AwsAppsyncAuthorizationType component4() {
            return this.defaultAuthorizationType;
        }

        public final List<AmplifyOutputsData.AwsAppsyncAuthorizationType> component5() {
            return this.authorizationTypes;
        }

        public final Data copy(String str, String str2, String str3, AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType, List<? extends AmplifyOutputsData.AwsAppsyncAuthorizationType> list) {
            sq8.m48649h(str, "awsRegion");
            sq8.m48649h(str2, ImagesContract.URL);
            sq8.m48649h(awsAppsyncAuthorizationType, "defaultAuthorizationType");
            sq8.m48649h(list, "authorizationTypes");
            return new Data(str, str2, str3, awsAppsyncAuthorizationType, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return sq8.m48644c(this.awsRegion, data.awsRegion) && sq8.m48644c(this.url, data.url) && sq8.m48644c(this.apiKey, data.apiKey) && this.defaultAuthorizationType == data.defaultAuthorizationType && sq8.m48644c(this.authorizationTypes, data.authorizationTypes);
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Data
        public String getApiKey() {
            return this.apiKey;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Data
        public List<AmplifyOutputsData.AwsAppsyncAuthorizationType> getAuthorizationTypes() {
            return this.authorizationTypes;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Data
        public String getAwsRegion() {
            return this.awsRegion;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Data
        public AmplifyOutputsData.AwsAppsyncAuthorizationType getDefaultAuthorizationType() {
            return this.defaultAuthorizationType;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Data
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = ((this.awsRegion.hashCode() * 31) + this.url.hashCode()) * 31;
            String str = this.apiKey;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.defaultAuthorizationType.hashCode()) * 31) + this.authorizationTypes.hashCode();
        }

        public String toString() {
            return "Data(awsRegion=" + this.awsRegion + ", url=" + this.url + ", apiKey=" + this.apiKey + ", defaultAuthorizationType=" + this.defaultAuthorizationType + ", authorizationTypes=" + this.authorizationTypes + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Data(String str, String str2, String str3, AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType, List<? extends AmplifyOutputsData.AwsAppsyncAuthorizationType> list) {
            sq8.m48649h(str, "awsRegion");
            sq8.m48649h(str2, ImagesContract.URL);
            sq8.m48649h(awsAppsyncAuthorizationType, "defaultAuthorizationType");
            sq8.m48649h(list, "authorizationTypes");
            this.awsRegion = str;
            this.url = str2;
            this.apiKey = str3;
            this.defaultAuthorizationType = awsAppsyncAuthorizationType;
            this.authorizationTypes = list;
        }
    }

    @dff
    public static final class Geo implements AmplifyOutputsData.Geo {
        public static final Companion Companion = new Companion(null);
        private final String awsRegion;
        private final GeofenceCollections geofenceCollections;
        private final Maps maps;
        private final SearchIndices searchIndices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE;
            }
        }

        @dff
        public static final class GeofenceCollections implements AmplifyOutputsData.Geo.GeofenceCollections {

            /* renamed from: default, reason: not valid java name */
            private final String f58050default;
            private final Set<String> items;
            public static final Companion Companion = new Companion(null);
            private static final dc9[] $childSerializers = {new bea(p8g.f39602a), null};

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(id5 id5Var) {
                    this();
                }

                public final dc9 serializer() {
                    return AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ GeofenceCollections(int i, Set set, String str, fff fffVar) {
                if (3 != (i & 3)) {
                    tbd.m49692a(i, 3, AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE.getDescriptor());
                }
                this.items = set;
                this.f58050default = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GeofenceCollections copy$default(GeofenceCollections geofenceCollections, Set set, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = geofenceCollections.items;
                }
                if ((i & 2) != 0) {
                    str = geofenceCollections.f58050default;
                }
                return geofenceCollections.copy(set, str);
            }

            public static final /* synthetic */ void write$Self(GeofenceCollections geofenceCollections, lo3 lo3Var, uef uefVar) {
                lo3Var.mo37566l(uefVar, 0, $childSerializers[0], geofenceCollections.getItems());
                lo3Var.mo37568p(uefVar, 1, geofenceCollections.getDefault());
            }

            public final Set<String> component1() {
                return this.items;
            }

            public final String component2() {
                return this.f58050default;
            }

            public final GeofenceCollections copy(Set<String> set, String str) {
                sq8.m48649h(set, "items");
                sq8.m48649h(str, CookieSpecs.DEFAULT);
                return new GeofenceCollections(set, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GeofenceCollections)) {
                    return false;
                }
                GeofenceCollections geofenceCollections = (GeofenceCollections) obj;
                return sq8.m48644c(this.items, geofenceCollections.items) && sq8.m48644c(this.f58050default, geofenceCollections.f58050default);
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.GeofenceCollections
            public String getDefault() {
                return this.f58050default;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.GeofenceCollections
            public Set<String> getItems() {
                return this.items;
            }

            public int hashCode() {
                return (this.items.hashCode() * 31) + this.f58050default.hashCode();
            }

            public String toString() {
                return "GeofenceCollections(items=" + this.items + ", default=" + this.f58050default + ")";
            }

            public GeofenceCollections(Set<String> set, String str) {
                sq8.m48649h(set, "items");
                sq8.m48649h(str, CookieSpecs.DEFAULT);
                this.items = set;
                this.f58050default = str;
            }
        }

        @dff
        public static final class Maps implements AmplifyOutputsData.Geo.Maps {

            /* renamed from: default, reason: not valid java name */
            private final String f58051default;
            private final Map<String, AmazonLocationServiceConfig> items;
            public static final Companion Companion = new Companion(null);
            private static final dc9[] $childSerializers = {new zda(p8g.f39602a, AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer.INSTANCE), null};

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(id5 id5Var) {
                    this();
                }

                public final dc9 serializer() {
                    return AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Maps(int i, Map map, String str, fff fffVar) {
                if (3 != (i & 3)) {
                    tbd.m49692a(i, 3, AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE.getDescriptor());
                }
                this.items = map;
                this.f58051default = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Maps copy$default(Maps maps, Map map, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = maps.items;
                }
                if ((i & 2) != 0) {
                    str = maps.f58051default;
                }
                return maps.copy(map, str);
            }

            public static final /* synthetic */ void write$Self(Maps maps, lo3 lo3Var, uef uefVar) {
                lo3Var.mo37566l(uefVar, 0, $childSerializers[0], maps.getItems());
                lo3Var.mo37568p(uefVar, 1, maps.getDefault());
            }

            public final Map<String, AmazonLocationServiceConfig> component1() {
                return this.items;
            }

            public final String component2() {
                return this.f58051default;
            }

            public final Maps copy(Map<String, AmazonLocationServiceConfig> map, String str) {
                sq8.m48649h(map, "items");
                sq8.m48649h(str, CookieSpecs.DEFAULT);
                return new Maps(map, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Maps)) {
                    return false;
                }
                Maps maps = (Maps) obj;
                return sq8.m48644c(this.items, maps.items) && sq8.m48644c(this.f58051default, maps.f58051default);
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.Maps
            public String getDefault() {
                return this.f58051default;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.Maps
            public Map<String, AmazonLocationServiceConfig> getItems() {
                return this.items;
            }

            public int hashCode() {
                return (this.items.hashCode() * 31) + this.f58051default.hashCode();
            }

            public String toString() {
                return "Maps(items=" + this.items + ", default=" + this.f58051default + ")";
            }

            public Maps(Map<String, AmazonLocationServiceConfig> map, String str) {
                sq8.m48649h(map, "items");
                sq8.m48649h(str, CookieSpecs.DEFAULT);
                this.items = map;
                this.f58051default = str;
            }
        }

        @dff
        public static final class SearchIndices implements AmplifyOutputsData.Geo.SearchIndices {

            /* renamed from: default, reason: not valid java name */
            private final String f58052default;
            private final Set<String> items;
            public static final Companion Companion = new Companion(null);
            private static final dc9[] $childSerializers = {new bea(p8g.f39602a), null};

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(id5 id5Var) {
                    this();
                }

                public final dc9 serializer() {
                    return AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ SearchIndices(int i, Set set, String str, fff fffVar) {
                if (3 != (i & 3)) {
                    tbd.m49692a(i, 3, AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE.getDescriptor());
                }
                this.items = set;
                this.f58052default = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SearchIndices copy$default(SearchIndices searchIndices, Set set, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = searchIndices.items;
                }
                if ((i & 2) != 0) {
                    str = searchIndices.f58052default;
                }
                return searchIndices.copy(set, str);
            }

            public static final /* synthetic */ void write$Self(SearchIndices searchIndices, lo3 lo3Var, uef uefVar) {
                lo3Var.mo37566l(uefVar, 0, $childSerializers[0], searchIndices.getItems());
                lo3Var.mo37568p(uefVar, 1, searchIndices.getDefault());
            }

            public final Set<String> component1() {
                return this.items;
            }

            public final String component2() {
                return this.f58052default;
            }

            public final SearchIndices copy(Set<String> set, String str) {
                sq8.m48649h(set, "items");
                sq8.m48649h(str, CookieSpecs.DEFAULT);
                return new SearchIndices(set, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchIndices)) {
                    return false;
                }
                SearchIndices searchIndices = (SearchIndices) obj;
                return sq8.m48644c(this.items, searchIndices.items) && sq8.m48644c(this.f58052default, searchIndices.f58052default);
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.SearchIndices
            public String getDefault() {
                return this.f58052default;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.SearchIndices
            public Set<String> getItems() {
                return this.items;
            }

            public int hashCode() {
                return (this.items.hashCode() * 31) + this.f58052default.hashCode();
            }

            public String toString() {
                return "SearchIndices(items=" + this.items + ", default=" + this.f58052default + ")";
            }

            public SearchIndices(Set<String> set, String str) {
                sq8.m48649h(set, "items");
                sq8.m48649h(str, CookieSpecs.DEFAULT);
                this.items = set;
                this.f58052default = str;
            }
        }

        public /* synthetic */ Geo(int i, String str, Maps maps, SearchIndices searchIndices, GeofenceCollections geofenceCollections, fff fffVar) {
            if (15 != (i & 15)) {
                tbd.m49692a(i, 15, AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE.getDescriptor());
            }
            this.awsRegion = str;
            this.maps = maps;
            this.searchIndices = searchIndices;
            this.geofenceCollections = geofenceCollections;
        }

        public static /* synthetic */ Geo copy$default(Geo geo, String str, Maps maps, SearchIndices searchIndices, GeofenceCollections geofenceCollections, int i, Object obj) {
            if ((i & 1) != 0) {
                str = geo.awsRegion;
            }
            if ((i & 2) != 0) {
                maps = geo.maps;
            }
            if ((i & 4) != 0) {
                searchIndices = geo.searchIndices;
            }
            if ((i & 8) != 0) {
                geofenceCollections = geo.geofenceCollections;
            }
            return geo.copy(str, maps, searchIndices, geofenceCollections);
        }

        public static final /* synthetic */ void write$Self(Geo geo, lo3 lo3Var, uef uefVar) {
            lo3Var.mo37568p(uefVar, 0, geo.getAwsRegion());
            lo3Var.mo37571z(uefVar, 1, AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE, geo.getMaps());
            lo3Var.mo37571z(uefVar, 2, AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE, geo.getSearchIndices());
            lo3Var.mo37571z(uefVar, 3, AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE, geo.getGeofenceCollections());
        }

        public final String component1() {
            return this.awsRegion;
        }

        public final Maps component2() {
            return this.maps;
        }

        public final SearchIndices component3() {
            return this.searchIndices;
        }

        public final GeofenceCollections component4() {
            return this.geofenceCollections;
        }

        public final Geo copy(String str, Maps maps, SearchIndices searchIndices, GeofenceCollections geofenceCollections) {
            sq8.m48649h(str, "awsRegion");
            return new Geo(str, maps, searchIndices, geofenceCollections);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Geo)) {
                return false;
            }
            Geo geo = (Geo) obj;
            return sq8.m48644c(this.awsRegion, geo.awsRegion) && sq8.m48644c(this.maps, geo.maps) && sq8.m48644c(this.searchIndices, geo.searchIndices) && sq8.m48644c(this.geofenceCollections, geo.geofenceCollections);
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo
        public String getAwsRegion() {
            return this.awsRegion;
        }

        public int hashCode() {
            int iHashCode = this.awsRegion.hashCode() * 31;
            Maps maps = this.maps;
            int iHashCode2 = (iHashCode + (maps == null ? 0 : maps.hashCode())) * 31;
            SearchIndices searchIndices = this.searchIndices;
            int iHashCode3 = (iHashCode2 + (searchIndices == null ? 0 : searchIndices.hashCode())) * 31;
            GeofenceCollections geofenceCollections = this.geofenceCollections;
            return iHashCode3 + (geofenceCollections != null ? geofenceCollections.hashCode() : 0);
        }

        public String toString() {
            return "Geo(awsRegion=" + this.awsRegion + ", maps=" + this.maps + ", searchIndices=" + this.searchIndices + ", geofenceCollections=" + this.geofenceCollections + ")";
        }

        public Geo(String str, Maps maps, SearchIndices searchIndices, GeofenceCollections geofenceCollections) {
            sq8.m48649h(str, "awsRegion");
            this.awsRegion = str;
            this.maps = maps;
            this.searchIndices = searchIndices;
            this.geofenceCollections = geofenceCollections;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo
        public GeofenceCollections getGeofenceCollections() {
            return this.geofenceCollections;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo
        public Maps getMaps() {
            return this.maps;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo
        public SearchIndices getSearchIndices() {
            return this.searchIndices;
        }
    }

    @dff
    public static final class Notifications implements AmplifyOutputsData.Notifications {
        private final String amazonPinpointAppId;
        private final String awsRegion;
        private final List<AmplifyOutputsData.AmazonPinpointChannels> channels;
        public static final Companion Companion = new Companion(null);
        private static final dc9[] $childSerializers = {null, null, new to0(ni6.m40630b("com.amplifyframework.core.configuration.AmplifyOutputsData.AmazonPinpointChannels", AmplifyOutputsData.AmazonPinpointChannels.values()))};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Notifications(int i, String str, String str2, List list, fff fffVar) {
            if (7 != (i & 7)) {
                tbd.m49692a(i, 7, AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE.getDescriptor());
            }
            this.awsRegion = str;
            this.amazonPinpointAppId = str2;
            this.channels = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Notifications copy$default(Notifications notifications, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notifications.awsRegion;
            }
            if ((i & 2) != 0) {
                str2 = notifications.amazonPinpointAppId;
            }
            if ((i & 4) != 0) {
                list = notifications.channels;
            }
            return notifications.copy(str, str2, list);
        }

        public static final /* synthetic */ void write$Self(Notifications notifications, lo3 lo3Var, uef uefVar) {
            dc9[] dc9VarArr = $childSerializers;
            lo3Var.mo37568p(uefVar, 0, notifications.getAwsRegion());
            lo3Var.mo37568p(uefVar, 1, notifications.getAmazonPinpointAppId());
            lo3Var.mo37566l(uefVar, 2, dc9VarArr[2], notifications.getChannels());
        }

        public final String component1() {
            return this.awsRegion;
        }

        public final String component2() {
            return this.amazonPinpointAppId;
        }

        public final List<AmplifyOutputsData.AmazonPinpointChannels> component3() {
            return this.channels;
        }

        public final Notifications copy(String str, String str2, List<? extends AmplifyOutputsData.AmazonPinpointChannels> list) {
            sq8.m48649h(str, "awsRegion");
            sq8.m48649h(str2, "amazonPinpointAppId");
            sq8.m48649h(list, "channels");
            return new Notifications(str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Notifications)) {
                return false;
            }
            Notifications notifications = (Notifications) obj;
            return sq8.m48644c(this.awsRegion, notifications.awsRegion) && sq8.m48644c(this.amazonPinpointAppId, notifications.amazonPinpointAppId) && sq8.m48644c(this.channels, notifications.channels);
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Notifications
        public String getAmazonPinpointAppId() {
            return this.amazonPinpointAppId;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Notifications
        public String getAwsRegion() {
            return this.awsRegion;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Notifications
        public List<AmplifyOutputsData.AmazonPinpointChannels> getChannels() {
            return this.channels;
        }

        public int hashCode() {
            return (((this.awsRegion.hashCode() * 31) + this.amazonPinpointAppId.hashCode()) * 31) + this.channels.hashCode();
        }

        public String toString() {
            return "Notifications(awsRegion=" + this.awsRegion + ", amazonPinpointAppId=" + this.amazonPinpointAppId + ", channels=" + this.channels + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Notifications(String str, String str2, List<? extends AmplifyOutputsData.AmazonPinpointChannels> list) {
            sq8.m48649h(str, "awsRegion");
            sq8.m48649h(str2, "amazonPinpointAppId");
            sq8.m48649h(list, "channels");
            this.awsRegion = str;
            this.amazonPinpointAppId = str2;
            this.channels = list;
        }
    }

    @dff
    public static final class StorageBucket implements AmplifyOutputsData.StorageBucket {
        public static final Companion Companion = new Companion(null);
        private final String awsRegion;
        private final String bucketName;
        private final String name;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyOutputsDataImpl$StorageBucket$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ StorageBucket(int i, String str, String str2, String str3, fff fffVar) {
            if (7 != (i & 7)) {
                tbd.m49692a(i, 7, AmplifyOutputsDataImpl$StorageBucket$$serializer.INSTANCE.getDescriptor());
            }
            this.name = str;
            this.awsRegion = str2;
            this.bucketName = str3;
        }

        public static /* synthetic */ StorageBucket copy$default(StorageBucket storageBucket, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = storageBucket.name;
            }
            if ((i & 2) != 0) {
                str2 = storageBucket.awsRegion;
            }
            if ((i & 4) != 0) {
                str3 = storageBucket.bucketName;
            }
            return storageBucket.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self(StorageBucket storageBucket, lo3 lo3Var, uef uefVar) {
            lo3Var.mo37568p(uefVar, 0, storageBucket.getName());
            lo3Var.mo37568p(uefVar, 1, storageBucket.getAwsRegion());
            lo3Var.mo37568p(uefVar, 2, storageBucket.getBucketName());
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.awsRegion;
        }

        public final String component3() {
            return this.bucketName;
        }

        public final StorageBucket copy(String str, String str2, String str3) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "awsRegion");
            sq8.m48649h(str3, "bucketName");
            return new StorageBucket(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StorageBucket)) {
                return false;
            }
            StorageBucket storageBucket = (StorageBucket) obj;
            return sq8.m48644c(this.name, storageBucket.name) && sq8.m48644c(this.awsRegion, storageBucket.awsRegion) && sq8.m48644c(this.bucketName, storageBucket.bucketName);
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.StorageBucket
        public String getAwsRegion() {
            return this.awsRegion;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.StorageBucket
        public String getBucketName() {
            return this.bucketName;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.StorageBucket
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.awsRegion.hashCode()) * 31) + this.bucketName.hashCode();
        }

        public String toString() {
            return "StorageBucket(name=" + this.name + ", awsRegion=" + this.awsRegion + ", bucketName=" + this.bucketName + ")";
        }

        public StorageBucket(String str, String str2, String str3) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "awsRegion");
            sq8.m48649h(str3, "bucketName");
            this.name = str;
            this.awsRegion = str2;
            this.bucketName = str3;
        }
    }

    public /* synthetic */ AmplifyOutputsDataImpl(int i, String str, Analytics analytics, Auth auth, Data data, Geo geo, Notifications notifications, Storage storage, z99 z99Var, fff fffVar) {
        if (255 != (i & Constants.MAX_HOST_LENGTH)) {
            tbd.m49692a(i, Constants.MAX_HOST_LENGTH, AmplifyOutputsDataImpl$$serializer.INSTANCE.getDescriptor());
        }
        this.version = str;
        this.analytics = analytics;
        this.auth = auth;
        this.data = data;
        this.geo = geo;
        this.notifications = notifications;
        this.storage = storage;
        this.custom = z99Var;
    }

    public static final /* synthetic */ void write$Self(AmplifyOutputsDataImpl amplifyOutputsDataImpl, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37568p(uefVar, 0, amplifyOutputsDataImpl.getVersion());
        lo3Var.mo37571z(uefVar, 1, AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE, amplifyOutputsDataImpl.getAnalytics());
        lo3Var.mo37571z(uefVar, 2, AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE, amplifyOutputsDataImpl.getAuth());
        lo3Var.mo37571z(uefVar, 3, AmplifyOutputsDataImpl$Data$$serializer.INSTANCE, amplifyOutputsDataImpl.getData());
        lo3Var.mo37571z(uefVar, 4, AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE, amplifyOutputsDataImpl.getGeo());
        lo3Var.mo37571z(uefVar, 5, AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE, amplifyOutputsDataImpl.getNotifications());
        lo3Var.mo37571z(uefVar, 6, AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE, amplifyOutputsDataImpl.getStorage());
        lo3Var.mo37571z(uefVar, 7, aa9.f14377a, amplifyOutputsDataImpl.getCustom());
    }

    public final String component1() {
        return this.version;
    }

    public final Analytics component2() {
        return this.analytics;
    }

    public final Auth component3() {
        return this.auth;
    }

    public final Data component4() {
        return this.data;
    }

    public final Geo component5() {
        return this.geo;
    }

    public final Notifications component6() {
        return this.notifications;
    }

    public final Storage component7() {
        return this.storage;
    }

    public final z99 component8() {
        return this.custom;
    }

    public final AmplifyOutputsDataImpl copy(String str, Analytics analytics, Auth auth, Data data, Geo geo, Notifications notifications, Storage storage, z99 z99Var) {
        sq8.m48649h(str, ClientCookie.VERSION_ATTR);
        return new AmplifyOutputsDataImpl(str, analytics, auth, data, geo, notifications, storage, z99Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmplifyOutputsDataImpl)) {
            return false;
        }
        AmplifyOutputsDataImpl amplifyOutputsDataImpl = (AmplifyOutputsDataImpl) obj;
        return sq8.m48644c(this.version, amplifyOutputsDataImpl.version) && sq8.m48644c(this.analytics, amplifyOutputsDataImpl.analytics) && sq8.m48644c(this.auth, amplifyOutputsDataImpl.auth) && sq8.m48644c(this.data, amplifyOutputsDataImpl.data) && sq8.m48644c(this.geo, amplifyOutputsDataImpl.geo) && sq8.m48644c(this.notifications, amplifyOutputsDataImpl.notifications) && sq8.m48644c(this.storage, amplifyOutputsDataImpl.storage) && sq8.m48644c(this.custom, amplifyOutputsDataImpl.custom);
    }

    @Override // com.amplifyframework.core.configuration.AmplifyOutputsData
    public z99 getCustom() {
        return this.custom;
    }

    @Override // com.amplifyframework.core.configuration.AmplifyOutputsData
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.version.hashCode() * 31;
        Analytics analytics = this.analytics;
        int iHashCode2 = (iHashCode + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Auth auth = this.auth;
        int iHashCode3 = (iHashCode2 + (auth == null ? 0 : auth.hashCode())) * 31;
        Data data = this.data;
        int iHashCode4 = (iHashCode3 + (data == null ? 0 : data.hashCode())) * 31;
        Geo geo = this.geo;
        int iHashCode5 = (iHashCode4 + (geo == null ? 0 : geo.hashCode())) * 31;
        Notifications notifications = this.notifications;
        int iHashCode6 = (iHashCode5 + (notifications == null ? 0 : notifications.hashCode())) * 31;
        Storage storage = this.storage;
        int iHashCode7 = (iHashCode6 + (storage == null ? 0 : storage.hashCode())) * 31;
        z99 z99Var = this.custom;
        return iHashCode7 + (z99Var != null ? z99Var.hashCode() : 0);
    }

    public String toString() {
        return "AmplifyOutputsDataImpl(version=" + this.version + ", analytics=" + this.analytics + ", auth=" + this.auth + ", data=" + this.data + ", geo=" + this.geo + ", notifications=" + this.notifications + ", storage=" + this.storage + ", custom=" + this.custom + ")";
    }

    public AmplifyOutputsDataImpl(String str, Analytics analytics, Auth auth, Data data, Geo geo, Notifications notifications, Storage storage, z99 z99Var) {
        sq8.m48649h(str, ClientCookie.VERSION_ATTR);
        this.version = str;
        this.analytics = analytics;
        this.auth = auth;
        this.data = data;
        this.geo = geo;
        this.notifications = notifications;
        this.storage = storage;
        this.custom = z99Var;
    }

    @Override // com.amplifyframework.core.configuration.AmplifyOutputsData
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @Override // com.amplifyframework.core.configuration.AmplifyOutputsData
    public Auth getAuth() {
        return this.auth;
    }

    @Override // com.amplifyframework.core.configuration.AmplifyOutputsData
    public Data getData() {
        return this.data;
    }

    @Override // com.amplifyframework.core.configuration.AmplifyOutputsData
    public Geo getGeo() {
        return this.geo;
    }

    @Override // com.amplifyframework.core.configuration.AmplifyOutputsData
    public Notifications getNotifications() {
        return this.notifications;
    }

    @Override // com.amplifyframework.core.configuration.AmplifyOutputsData
    public Storage getStorage() {
        return this.storage;
    }

    @dff
    public static final class Storage implements AmplifyOutputsData.Storage {
        private final String awsRegion;
        private final String bucketName;
        private final List<StorageBucket> buckets;
        public static final Companion Companion = new Companion(null);
        private static final dc9[] $childSerializers = {null, null, new to0(AmplifyOutputsDataImpl$StorageBucket$$serializer.INSTANCE)};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Storage(int i, String str, String str2, List list, fff fffVar) {
            if (3 != (i & 3)) {
                tbd.m49692a(i, 3, AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE.getDescriptor());
            }
            this.awsRegion = str;
            this.bucketName = str2;
            if ((i & 4) == 0) {
                this.buckets = ch3.m21246k();
            } else {
                this.buckets = list;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Storage copy$default(Storage storage, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = storage.awsRegion;
            }
            if ((i & 2) != 0) {
                str2 = storage.bucketName;
            }
            if ((i & 4) != 0) {
                list = storage.buckets;
            }
            return storage.copy(str, str2, list);
        }

        public static final /* synthetic */ void write$Self(Storage storage, lo3 lo3Var, uef uefVar) {
            dc9[] dc9VarArr = $childSerializers;
            lo3Var.mo37568p(uefVar, 0, storage.getAwsRegion());
            lo3Var.mo37568p(uefVar, 1, storage.getBucketName());
            if (lo3Var.mo37569r(uefVar, 2) || !sq8.m48644c(storage.getBuckets(), ch3.m21246k())) {
                lo3Var.mo37566l(uefVar, 2, dc9VarArr[2], storage.getBuckets());
            }
        }

        public final String component1() {
            return this.awsRegion;
        }

        public final String component2() {
            return this.bucketName;
        }

        public final List<StorageBucket> component3() {
            return this.buckets;
        }

        public final Storage copy(String str, String str2, List<StorageBucket> list) {
            sq8.m48649h(str, "awsRegion");
            sq8.m48649h(str2, "bucketName");
            sq8.m48649h(list, "buckets");
            return new Storage(str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Storage)) {
                return false;
            }
            Storage storage = (Storage) obj;
            return sq8.m48644c(this.awsRegion, storage.awsRegion) && sq8.m48644c(this.bucketName, storage.bucketName) && sq8.m48644c(this.buckets, storage.buckets);
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Storage
        public String getAwsRegion() {
            return this.awsRegion;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Storage
        public String getBucketName() {
            return this.bucketName;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Storage
        public List<StorageBucket> getBuckets() {
            return this.buckets;
        }

        public int hashCode() {
            return (((this.awsRegion.hashCode() * 31) + this.bucketName.hashCode()) * 31) + this.buckets.hashCode();
        }

        public String toString() {
            return "Storage(awsRegion=" + this.awsRegion + ", bucketName=" + this.bucketName + ", buckets=" + this.buckets + ")";
        }

        public Storage(String str, String str2, List<StorageBucket> list) {
            sq8.m48649h(str, "awsRegion");
            sq8.m48649h(str2, "bucketName");
            sq8.m48649h(list, "buckets");
            this.awsRegion = str;
            this.bucketName = str2;
            this.buckets = list;
        }

        public /* synthetic */ Storage(String str, String str2, List list, int i, id5 id5Var) {
            this(str, str2, (i & 4) != 0 ? ch3.m21246k() : list);
        }
    }
}

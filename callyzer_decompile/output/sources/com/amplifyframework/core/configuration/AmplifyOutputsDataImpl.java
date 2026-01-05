package com.amplifyframework.core.configuration;

import a2.AbstractC0030c;
import aw.C0466f;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.sun.mail.util.AbstractC1452a;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jy.C3866c;
import jy.C3869f;
import jy.d0;
import jy.f0;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import ky.C4294z;
import ky.b0;
import ly.C4597u;
import og.nd;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;
import qw.EnumC6359i;
import qw.InterfaceC6357g;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AmplifyOutputsDataImpl implements AmplifyOutputsData {
    public static final Companion Companion = new Companion(null);
    private final Analytics analytics;
    private final Auth auth;
    private final C4294z custom;
    private final Data data;
    private final Geo geo;
    private final Notifications notifications;
    private final Storage storage;
    private final String version;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class AmazonLocationServiceConfig implements AmplifyOutputsData.AmazonLocationServiceConfig {
        public static final Companion Companion = new Companion(null);
        private final String style;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        public /* synthetic */ AmazonLocationServiceConfig(int i10, String str, w0 w0Var) {
            if (1 == (i10 & 1)) {
                this.style = str;
            } else {
                n0.m8426g(i10, 1, AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ AmazonLocationServiceConfig copy$default(AmazonLocationServiceConfig amazonLocationServiceConfig, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = amazonLocationServiceConfig.style;
            }
            return amazonLocationServiceConfig.copy(str);
        }

        public final String component1() {
            return this.style;
        }

        public final AmazonLocationServiceConfig copy(String style) {
            AbstractC4154l.m8923f(style, "style");
            return new AmazonLocationServiceConfig(style);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmazonLocationServiceConfig) && AbstractC4154l.m8918a(this.style, ((AmazonLocationServiceConfig) obj).style);
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.AmazonLocationServiceConfig
        public String getStyle() {
            return this.style;
        }

        public int hashCode() {
            return this.style.hashCode();
        }

        public String toString() {
            return AbstractC5601a.m11238i("AmazonLocationServiceConfig(style=", this.style, ")");
        }

        public AmazonLocationServiceConfig(String style) {
            AbstractC4154l.m8923f(style, "style");
            this.style = style;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Analytics implements AmplifyOutputsData.Analytics {
        public static final Companion Companion = new Companion(null);
        private final AmazonPinpoint amazonPinpoint;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class AmazonPinpoint implements AmplifyOutputsData.Analytics.AmazonPinpoint {
            public static final Companion Companion = new Companion(null);
            private final String appId;
            private final String awsRegion;

            /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
            public static final class Companion {
                private Companion() {
                }

                public final InterfaceC2401a serializer() {
                    return AmplifyOutputsDataImpl$Analytics$AmazonPinpoint$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                    this();
                }
            }

            public /* synthetic */ AmazonPinpoint(int i10, String str, String str2, w0 w0Var) {
                if (3 != (i10 & 3)) {
                    n0.m8426g(i10, 3, AmplifyOutputsDataImpl$Analytics$AmazonPinpoint$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.awsRegion = str;
                this.appId = str2;
            }

            public static /* synthetic */ AmazonPinpoint copy$default(AmazonPinpoint amazonPinpoint, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = amazonPinpoint.awsRegion;
                }
                if ((i10 & 2) != 0) {
                    str2 = amazonPinpoint.appId;
                }
                return amazonPinpoint.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$core_release(AmazonPinpoint amazonPinpoint, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
                C4597u c4597u = (C4597u) interfaceC3365b;
                c4597u.m9444w(interfaceC3055f, 0, amazonPinpoint.getAwsRegion());
                c4597u.m9444w(interfaceC3055f, 1, amazonPinpoint.getAppId());
            }

            public final String component1() {
                return this.awsRegion;
            }

            public final String component2() {
                return this.appId;
            }

            public final AmazonPinpoint copy(String awsRegion, String appId) {
                AbstractC4154l.m8923f(awsRegion, "awsRegion");
                AbstractC4154l.m8923f(appId, "appId");
                return new AmazonPinpoint(awsRegion, appId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AmazonPinpoint)) {
                    return false;
                }
                AmazonPinpoint amazonPinpoint = (AmazonPinpoint) obj;
                return AbstractC4154l.m8918a(this.awsRegion, amazonPinpoint.awsRegion) && AbstractC4154l.m8918a(this.appId, amazonPinpoint.appId);
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
                return this.appId.hashCode() + (this.awsRegion.hashCode() * 31);
            }

            public String toString() {
                return a1.m14333m("AmazonPinpoint(awsRegion=", this.awsRegion, ", appId=", this.appId, ")");
            }

            public AmazonPinpoint(String awsRegion, String appId) {
                AbstractC4154l.m8923f(awsRegion, "awsRegion");
                AbstractC4154l.m8923f(appId, "appId");
                this.awsRegion = awsRegion;
                this.appId = appId;
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        public /* synthetic */ Analytics(int i10, AmazonPinpoint amazonPinpoint, w0 w0Var) {
            if (1 == (i10 & 1)) {
                this.amazonPinpoint = amazonPinpoint;
            } else {
                n0.m8426g(i10, 1, AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Analytics copy$default(Analytics analytics, AmazonPinpoint amazonPinpoint, int i10, Object obj) {
            if ((i10 & 1) != 0) {
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
            return (obj instanceof Analytics) && AbstractC4154l.m8918a(this.amazonPinpoint, ((Analytics) obj).amazonPinpoint);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Auth implements AmplifyOutputsData.Auth {
        private static final InterfaceC6357g[] $childSerializers;
        public static final Companion Companion = new Companion(null);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Oauth implements AmplifyOutputsData.Auth.Oauth {
            private static final InterfaceC6357g[] $childSerializers;
            public static final Companion Companion = new Companion(null);
            private final String domain;
            private final List<AmplifyOutputsData.Auth.Oauth.IdentityProviders> identityProviders;
            private final List<String> redirectSignInUri;
            private final List<String> redirectSignOutUri;
            private final AmplifyOutputsData.Auth.Oauth.ResponseType responseType;
            private final List<String> scopes;

            /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
            public static final class Companion {
                private Companion() {
                }

                public final InterfaceC2401a serializer() {
                    return AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                    this();
                }
            }

            static {
                EnumC6359i enumC6359i = EnumC6359i.PUBLICATION;
                $childSerializers = new InterfaceC6357g[]{nd.m10781b(enumC6359i, new C0466f(13)), null, nd.m10781b(enumC6359i, new C0466f(14)), nd.m10781b(enumC6359i, new C0466f(15)), nd.m10781b(enumC6359i, new C0466f(16)), nd.m10781b(enumC6359i, new C0466f(17))};
            }

            public /* synthetic */ Oauth(int i10, List list, String str, List list2, List list3, List list4, AmplifyOutputsData.Auth.Oauth.ResponseType responseType, w0 w0Var) {
                if (63 != (i10 & 63)) {
                    n0.m8426g(i10, 63, AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.identityProviders = list;
                this.domain = str;
                this.scopes = list2;
                this.redirectSignInUri = list3;
                this.redirectSignOutUri = list4;
                this.responseType = responseType;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
                return new C3866c(n0.m8424e("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.Oauth.IdentityProviders", AmplifyOutputsData.Auth.Oauth.IdentityProviders.values()));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$0() {
                return new C3866c(jy.a1.f19869a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$1() {
                return new C3866c(jy.a1.f19869a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$2() {
                return new C3866c(jy.a1.f19869a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$3() {
                return AmplifyOutputsData.Auth.Oauth.ResponseType.Companion.serializer();
            }

            public static /* synthetic */ Oauth copy$default(Oauth oauth, List list, String str, List list2, List list3, List list4, AmplifyOutputsData.Auth.Oauth.ResponseType responseType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = oauth.identityProviders;
                }
                if ((i10 & 2) != 0) {
                    str = oauth.domain;
                }
                if ((i10 & 4) != 0) {
                    list2 = oauth.scopes;
                }
                if ((i10 & 8) != 0) {
                    list3 = oauth.redirectSignInUri;
                }
                if ((i10 & 16) != 0) {
                    list4 = oauth.redirectSignOutUri;
                }
                if ((i10 & 32) != 0) {
                    responseType = oauth.responseType;
                }
                List list5 = list4;
                AmplifyOutputsData.Auth.Oauth.ResponseType responseType2 = responseType;
                return oauth.copy(list, str, list2, list3, list5, responseType2);
            }

            public static final /* synthetic */ void write$Self$core_release(Oauth oauth, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
                InterfaceC6357g[] interfaceC6357gArr = $childSerializers;
                C4597u c4597u = (C4597u) interfaceC3365b;
                c4597u.m9443v(interfaceC3055f, 0, (InterfaceC2401a) interfaceC6357gArr[0].getValue(), oauth.getIdentityProviders());
                c4597u.m9444w(interfaceC3055f, 1, oauth.getDomain());
                c4597u.m9443v(interfaceC3055f, 2, (InterfaceC2401a) interfaceC6357gArr[2].getValue(), oauth.getScopes());
                c4597u.m9443v(interfaceC3055f, 3, (InterfaceC2401a) interfaceC6357gArr[3].getValue(), oauth.getRedirectSignInUri());
                c4597u.m9443v(interfaceC3055f, 4, (InterfaceC2401a) interfaceC6357gArr[4].getValue(), oauth.getRedirectSignOutUri());
                c4597u.m9443v(interfaceC3055f, 5, (InterfaceC2401a) interfaceC6357gArr[5].getValue(), oauth.getResponseType());
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

            public final Oauth copy(List<? extends AmplifyOutputsData.Auth.Oauth.IdentityProviders> identityProviders, String domain, List<String> scopes, List<String> redirectSignInUri, List<String> redirectSignOutUri, AmplifyOutputsData.Auth.Oauth.ResponseType responseType) {
                AbstractC4154l.m8923f(identityProviders, "identityProviders");
                AbstractC4154l.m8923f(domain, "domain");
                AbstractC4154l.m8923f(scopes, "scopes");
                AbstractC4154l.m8923f(redirectSignInUri, "redirectSignInUri");
                AbstractC4154l.m8923f(redirectSignOutUri, "redirectSignOutUri");
                AbstractC4154l.m8923f(responseType, "responseType");
                return new Oauth(identityProviders, domain, scopes, redirectSignInUri, redirectSignOutUri, responseType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Oauth)) {
                    return false;
                }
                Oauth oauth = (Oauth) obj;
                return AbstractC4154l.m8918a(this.identityProviders, oauth.identityProviders) && AbstractC4154l.m8918a(this.domain, oauth.domain) && AbstractC4154l.m8918a(this.scopes, oauth.scopes) && AbstractC4154l.m8918a(this.redirectSignInUri, oauth.redirectSignInUri) && AbstractC4154l.m8918a(this.redirectSignOutUri, oauth.redirectSignOutUri) && this.responseType == oauth.responseType;
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
                return this.responseType.hashCode() + AbstractC1452a.m4559f(this.redirectSignOutUri, AbstractC1452a.m4559f(this.redirectSignInUri, AbstractC1452a.m4559f(this.scopes, AbstractC0030c.m113d(this.identityProviders.hashCode() * 31, 31, this.domain), 31), 31), 31);
            }

            public String toString() {
                return "Oauth(identityProviders=" + this.identityProviders + ", domain=" + this.domain + ", scopes=" + this.scopes + ", redirectSignInUri=" + this.redirectSignInUri + ", redirectSignOutUri=" + this.redirectSignOutUri + ", responseType=" + this.responseType + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Oauth(List<? extends AmplifyOutputsData.Auth.Oauth.IdentityProviders> identityProviders, String domain, List<String> scopes, List<String> redirectSignInUri, List<String> redirectSignOutUri, AmplifyOutputsData.Auth.Oauth.ResponseType responseType) {
                AbstractC4154l.m8923f(identityProviders, "identityProviders");
                AbstractC4154l.m8923f(domain, "domain");
                AbstractC4154l.m8923f(scopes, "scopes");
                AbstractC4154l.m8923f(redirectSignInUri, "redirectSignInUri");
                AbstractC4154l.m8923f(redirectSignOutUri, "redirectSignOutUri");
                AbstractC4154l.m8923f(responseType, "responseType");
                this.identityProviders = identityProviders;
                this.domain = domain;
                this.scopes = scopes;
                this.redirectSignInUri = redirectSignInUri;
                this.redirectSignOutUri = redirectSignOutUri;
                this.responseType = responseType;
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class PasswordPolicy implements AmplifyOutputsData.Auth.PasswordPolicy {
            public static final Companion Companion = new Companion(null);
            private final Integer minLength;
            private final Boolean requireLowercase;
            private final Boolean requireNumbers;
            private final Boolean requireSymbols;
            private final Boolean requireUppercase;

            /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
            public static final class Companion {
                private Companion() {
                }

                public final InterfaceC2401a serializer() {
                    return AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                    this();
                }
            }

            public /* synthetic */ PasswordPolicy(int i10, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, w0 w0Var) {
                if (31 != (i10 & 31)) {
                    n0.m8426g(i10, 31, AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.minLength = num;
                this.requireNumbers = bool;
                this.requireLowercase = bool2;
                this.requireUppercase = bool3;
                this.requireSymbols = bool4;
            }

            public static /* synthetic */ PasswordPolicy copy$default(PasswordPolicy passwordPolicy, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    num = passwordPolicy.minLength;
                }
                if ((i10 & 2) != 0) {
                    bool = passwordPolicy.requireNumbers;
                }
                if ((i10 & 4) != 0) {
                    bool2 = passwordPolicy.requireLowercase;
                }
                if ((i10 & 8) != 0) {
                    bool3 = passwordPolicy.requireUppercase;
                }
                if ((i10 & 16) != 0) {
                    bool4 = passwordPolicy.requireSymbols;
                }
                Boolean bool5 = bool4;
                Boolean bool6 = bool2;
                return passwordPolicy.copy(num, bool, bool6, bool3, bool5);
            }

            public static final /* synthetic */ void write$Self$core_release(PasswordPolicy passwordPolicy, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
                interfaceC3365b.mo7695n(interfaceC3055f, 0, d0.f19882a, passwordPolicy.getMinLength());
                C3869f c3869f = C3869f.f19891a;
                interfaceC3365b.mo7695n(interfaceC3055f, 1, c3869f, passwordPolicy.getRequireNumbers());
                interfaceC3365b.mo7695n(interfaceC3055f, 2, c3869f, passwordPolicy.getRequireLowercase());
                interfaceC3365b.mo7695n(interfaceC3055f, 3, c3869f, passwordPolicy.getRequireUppercase());
                interfaceC3365b.mo7695n(interfaceC3055f, 4, c3869f, passwordPolicy.getRequireSymbols());
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
                return AbstractC4154l.m8918a(this.minLength, passwordPolicy.minLength) && AbstractC4154l.m8918a(this.requireNumbers, passwordPolicy.requireNumbers) && AbstractC4154l.m8918a(this.requireLowercase, passwordPolicy.requireLowercase) && AbstractC4154l.m8918a(this.requireUppercase, passwordPolicy.requireUppercase) && AbstractC4154l.m8918a(this.requireSymbols, passwordPolicy.requireSymbols);
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

        static {
            EnumC6359i enumC6359i = EnumC6359i.PUBLICATION;
            $childSerializers = new InterfaceC6357g[]{null, null, null, null, null, null, nd.m10781b(enumC6359i, new C0466f(8)), nd.m10781b(enumC6359i, new C0466f(9)), nd.m10781b(enumC6359i, new C0466f(10)), null, nd.m10781b(enumC6359i, new C0466f(11)), nd.m10781b(enumC6359i, new C0466f(12))};
        }

        public /* synthetic */ Auth(int i10, String str, String str2, String str3, String str4, PasswordPolicy passwordPolicy, Oauth oauth, List list, List list2, List list3, boolean z6, AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration, List list4, w0 w0Var) {
            if (1087 != (i10 & 1087)) {
                n0.m8426g(i10, 1087, AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.awsRegion = str;
            this.userPoolId = str2;
            this.userPoolClientId = str3;
            this.identityPoolId = str4;
            this.passwordPolicy = passwordPolicy;
            this.oauth = oauth;
            int i11 = i10 & 64;
            C6668r c6668r = C6668r.f31943a;
            if (i11 == 0) {
                this.standardRequiredAttributes = c6668r;
            } else {
                this.standardRequiredAttributes = list;
            }
            if ((i10 & 128) == 0) {
                this.usernameAttributes = c6668r;
            } else {
                this.usernameAttributes = list2;
            }
            if ((i10 & 256) == 0) {
                this.userVerificationTypes = c6668r;
            } else {
                this.userVerificationTypes = list3;
            }
            if ((i10 & 512) == 0) {
                this.unauthenticatedIdentitiesEnabled = true;
            } else {
                this.unauthenticatedIdentitiesEnabled = z6;
            }
            this.mfaConfiguration = mfaConfiguration;
            if ((i10 & NewHope.SENDB_BYTES) == 0) {
                this.mfaMethods = c6668r;
            } else {
                this.mfaMethods = list4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
            return new C3866c(AuthUserAttributeKeySerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$0() {
            return new C3866c(AmplifyOutputsData.Auth.UsernameAttributes.Companion.serializer());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$1() {
            return new C3866c(AmplifyOutputsData.Auth.UserVerificationTypes.Companion.serializer());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$2() {
            return n0.m8424e("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.MfaConfiguration", AmplifyOutputsData.Auth.MfaConfiguration.values());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$3() {
            return new C3866c(n0.m8424e("com.amplifyframework.core.configuration.AmplifyOutputsData.Auth.MfaMethods", AmplifyOutputsData.Auth.MfaMethods.values()));
        }

        public static /* synthetic */ Auth copy$default(Auth auth, String str, String str2, String str3, String str4, PasswordPolicy passwordPolicy, Oauth oauth, List list, List list2, List list3, boolean z6, AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration, List list4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = auth.awsRegion;
            }
            if ((i10 & 2) != 0) {
                str2 = auth.userPoolId;
            }
            if ((i10 & 4) != 0) {
                str3 = auth.userPoolClientId;
            }
            if ((i10 & 8) != 0) {
                str4 = auth.identityPoolId;
            }
            if ((i10 & 16) != 0) {
                passwordPolicy = auth.passwordPolicy;
            }
            if ((i10 & 32) != 0) {
                oauth = auth.oauth;
            }
            if ((i10 & 64) != 0) {
                list = auth.standardRequiredAttributes;
            }
            if ((i10 & 128) != 0) {
                list2 = auth.usernameAttributes;
            }
            if ((i10 & 256) != 0) {
                list3 = auth.userVerificationTypes;
            }
            if ((i10 & 512) != 0) {
                z6 = auth.unauthenticatedIdentitiesEnabled;
            }
            if ((i10 & 1024) != 0) {
                mfaConfiguration = auth.mfaConfiguration;
            }
            if ((i10 & NewHope.SENDB_BYTES) != 0) {
                list4 = auth.mfaMethods;
            }
            AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration2 = mfaConfiguration;
            List list5 = list4;
            List list6 = list3;
            boolean z10 = z6;
            List list7 = list;
            List list8 = list2;
            PasswordPolicy passwordPolicy2 = passwordPolicy;
            Oauth oauth2 = oauth;
            return auth.copy(str, str2, str3, str4, passwordPolicy2, oauth2, list7, list8, list6, z10, mfaConfiguration2, list5);
        }

        public static final void write$Self$core_release(Auth auth, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            InterfaceC6357g[] interfaceC6357gArr = $childSerializers;
            C4597u c4597u = (C4597u) interfaceC3365b;
            c4597u.m9444w(interfaceC3055f, 0, auth.getAwsRegion());
            c4597u.m9444w(interfaceC3055f, 1, auth.getUserPoolId());
            c4597u.m9444w(interfaceC3055f, 2, auth.getUserPoolClientId());
            c4597u.mo7695n(interfaceC3055f, 3, jy.a1.f19869a, auth.getIdentityPoolId());
            c4597u.mo7695n(interfaceC3055f, 4, AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE, auth.getPasswordPolicy());
            c4597u.mo7695n(interfaceC3055f, 5, AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE, auth.getOauth());
            boolean zMo7694i = c4597u.mo7694i(interfaceC3055f);
            C6668r c6668r = C6668r.f31943a;
            if (zMo7694i || !AbstractC4154l.m8918a(auth.getStandardRequiredAttributes(), c6668r)) {
                c4597u.m9443v(interfaceC3055f, 6, (InterfaceC2401a) interfaceC6357gArr[6].getValue(), auth.getStandardRequiredAttributes());
            }
            if (c4597u.mo7694i(interfaceC3055f) || !AbstractC4154l.m8918a(auth.getUsernameAttributes(), c6668r)) {
                c4597u.m9443v(interfaceC3055f, 7, (InterfaceC2401a) interfaceC6357gArr[7].getValue(), auth.getUsernameAttributes());
            }
            if (c4597u.mo7694i(interfaceC3055f) || !AbstractC4154l.m8918a(auth.getUserVerificationTypes(), c6668r)) {
                c4597u.m9443v(interfaceC3055f, 8, (InterfaceC2401a) interfaceC6357gArr[8].getValue(), auth.getUserVerificationTypes());
            }
            if (c4597u.mo7694i(interfaceC3055f) || !auth.getUnauthenticatedIdentitiesEnabled()) {
                boolean unauthenticatedIdentitiesEnabled = auth.getUnauthenticatedIdentitiesEnabled();
                c4597u.m9440s(interfaceC3055f, 9);
                c4597u.mo7717j(unauthenticatedIdentitiesEnabled);
            }
            c4597u.mo7695n(interfaceC3055f, 10, (InterfaceC2401a) interfaceC6357gArr[10].getValue(), auth.getMfaConfiguration());
            if (!c4597u.mo7694i(interfaceC3055f) && AbstractC4154l.m8918a(auth.getMfaMethods(), c6668r)) {
                return;
            }
            c4597u.m9443v(interfaceC3055f, 11, (InterfaceC2401a) interfaceC6357gArr[11].getValue(), auth.getMfaMethods());
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

        public final Auth copy(String awsRegion, String userPoolId, String userPoolClientId, String str, PasswordPolicy passwordPolicy, Oauth oauth, List<AuthUserAttributeKey> standardRequiredAttributes, List<? extends AmplifyOutputsData.Auth.UsernameAttributes> usernameAttributes, List<? extends AmplifyOutputsData.Auth.UserVerificationTypes> userVerificationTypes, boolean z6, AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration, List<? extends AmplifyOutputsData.Auth.MfaMethods> mfaMethods) {
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            AbstractC4154l.m8923f(userPoolId, "userPoolId");
            AbstractC4154l.m8923f(userPoolClientId, "userPoolClientId");
            AbstractC4154l.m8923f(standardRequiredAttributes, "standardRequiredAttributes");
            AbstractC4154l.m8923f(usernameAttributes, "usernameAttributes");
            AbstractC4154l.m8923f(userVerificationTypes, "userVerificationTypes");
            AbstractC4154l.m8923f(mfaMethods, "mfaMethods");
            return new Auth(awsRegion, userPoolId, userPoolClientId, str, passwordPolicy, oauth, standardRequiredAttributes, usernameAttributes, userVerificationTypes, z6, mfaConfiguration, mfaMethods);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Auth)) {
                return false;
            }
            Auth auth = (Auth) obj;
            return AbstractC4154l.m8918a(this.awsRegion, auth.awsRegion) && AbstractC4154l.m8918a(this.userPoolId, auth.userPoolId) && AbstractC4154l.m8918a(this.userPoolClientId, auth.userPoolClientId) && AbstractC4154l.m8918a(this.identityPoolId, auth.identityPoolId) && AbstractC4154l.m8918a(this.passwordPolicy, auth.passwordPolicy) && AbstractC4154l.m8918a(this.oauth, auth.oauth) && AbstractC4154l.m8918a(this.standardRequiredAttributes, auth.standardRequiredAttributes) && AbstractC4154l.m8918a(this.usernameAttributes, auth.usernameAttributes) && AbstractC4154l.m8918a(this.userVerificationTypes, auth.userVerificationTypes) && this.unauthenticatedIdentitiesEnabled == auth.unauthenticatedIdentitiesEnabled && this.mfaConfiguration == auth.mfaConfiguration && AbstractC4154l.m8918a(this.mfaMethods, auth.mfaMethods);
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

        public int hashCode() {
            int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(this.awsRegion.hashCode() * 31, 31, this.userPoolId), 31, this.userPoolClientId);
            String str = this.identityPoolId;
            int iHashCode = (iM113d + (str == null ? 0 : str.hashCode())) * 31;
            PasswordPolicy passwordPolicy = this.passwordPolicy;
            int iHashCode2 = (iHashCode + (passwordPolicy == null ? 0 : passwordPolicy.hashCode())) * 31;
            Oauth oauth = this.oauth;
            int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.userVerificationTypes, AbstractC1452a.m4559f(this.usernameAttributes, AbstractC1452a.m4559f(this.standardRequiredAttributes, (iHashCode2 + (oauth == null ? 0 : oauth.hashCode())) * 31, 31), 31), 31), 31, this.unauthenticatedIdentitiesEnabled);
            AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration = this.mfaConfiguration;
            return this.mfaMethods.hashCode() + ((iM4558e + (mfaConfiguration != null ? mfaConfiguration.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.awsRegion;
            String str2 = this.userPoolId;
            String str3 = this.userPoolClientId;
            String str4 = this.identityPoolId;
            PasswordPolicy passwordPolicy = this.passwordPolicy;
            Oauth oauth = this.oauth;
            List<AuthUserAttributeKey> list = this.standardRequiredAttributes;
            List<AmplifyOutputsData.Auth.UsernameAttributes> list2 = this.usernameAttributes;
            List<AmplifyOutputsData.Auth.UserVerificationTypes> list3 = this.userVerificationTypes;
            boolean z6 = this.unauthenticatedIdentitiesEnabled;
            AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration = this.mfaConfiguration;
            List<AmplifyOutputsData.Auth.MfaMethods> list4 = this.mfaMethods;
            StringBuilder sbM127r = AbstractC0030c.m127r("Auth(awsRegion=", str, ", userPoolId=", str2, ", userPoolClientId=");
            a1.m14319B(sbM127r, str3, ", identityPoolId=", str4, ", passwordPolicy=");
            sbM127r.append(passwordPolicy);
            sbM127r.append(", oauth=");
            sbM127r.append(oauth);
            sbM127r.append(", standardRequiredAttributes=");
            sbM127r.append(list);
            sbM127r.append(", usernameAttributes=");
            sbM127r.append(list2);
            sbM127r.append(", userVerificationTypes=");
            sbM127r.append(list3);
            sbM127r.append(", unauthenticatedIdentitiesEnabled=");
            sbM127r.append(z6);
            sbM127r.append(", mfaConfiguration=");
            sbM127r.append(mfaConfiguration);
            sbM127r.append(", mfaMethods=");
            sbM127r.append(list4);
            sbM127r.append(")");
            return sbM127r.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Auth(String awsRegion, String userPoolId, String userPoolClientId, String str, PasswordPolicy passwordPolicy, Oauth oauth, List<AuthUserAttributeKey> standardRequiredAttributes, List<? extends AmplifyOutputsData.Auth.UsernameAttributes> usernameAttributes, List<? extends AmplifyOutputsData.Auth.UserVerificationTypes> userVerificationTypes, boolean z6, AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration, List<? extends AmplifyOutputsData.Auth.MfaMethods> mfaMethods) {
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            AbstractC4154l.m8923f(userPoolId, "userPoolId");
            AbstractC4154l.m8923f(userPoolClientId, "userPoolClientId");
            AbstractC4154l.m8923f(standardRequiredAttributes, "standardRequiredAttributes");
            AbstractC4154l.m8923f(usernameAttributes, "usernameAttributes");
            AbstractC4154l.m8923f(userVerificationTypes, "userVerificationTypes");
            AbstractC4154l.m8923f(mfaMethods, "mfaMethods");
            this.awsRegion = awsRegion;
            this.userPoolId = userPoolId;
            this.userPoolClientId = userPoolClientId;
            this.identityPoolId = str;
            this.passwordPolicy = passwordPolicy;
            this.oauth = oauth;
            this.standardRequiredAttributes = standardRequiredAttributes;
            this.usernameAttributes = usernameAttributes;
            this.userVerificationTypes = userVerificationTypes;
            this.unauthenticatedIdentitiesEnabled = z6;
            this.mfaConfiguration = mfaConfiguration;
            this.mfaMethods = mfaMethods;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public Oauth getOauth() {
            return this.oauth;
        }

        @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Auth
        public PasswordPolicy getPasswordPolicy() {
            return this.passwordPolicy;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Auth(String str, String str2, String str3, String str4, PasswordPolicy passwordPolicy, Oauth oauth, List list, List list2, List list3, boolean z6, AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration, List list4, int i10, AbstractC4148f abstractC4148f) {
            int i11 = i10 & 64;
            C6668r c6668r = C6668r.f31943a;
            this(str, str2, str3, str4, passwordPolicy, oauth, i11 != 0 ? c6668r : list, (i10 & 128) != 0 ? c6668r : list2, (i10 & 256) != 0 ? c6668r : list3, (i10 & 512) != 0 ? true : z6, mfaConfiguration, (i10 & NewHope.SENDB_BYTES) != 0 ? c6668r : list4);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC2401a serializer() {
            return AmplifyOutputsDataImpl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Data implements AmplifyOutputsData.Data {
        private static final InterfaceC6357g[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private final String apiKey;
        private final List<AmplifyOutputsData.AwsAppsyncAuthorizationType> authorizationTypes;
        private final String awsRegion;
        private final AmplifyOutputsData.AwsAppsyncAuthorizationType defaultAuthorizationType;
        private final String url;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyOutputsDataImpl$Data$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        static {
            EnumC6359i enumC6359i = EnumC6359i.PUBLICATION;
            $childSerializers = new InterfaceC6357g[]{null, null, null, nd.m10781b(enumC6359i, new C0466f(18)), nd.m10781b(enumC6359i, new C0466f(19))};
        }

        public /* synthetic */ Data(int i10, String str, String str2, String str3, AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType, List list, w0 w0Var) {
            if (31 != (i10 & 31)) {
                n0.m8426g(i10, 31, AmplifyOutputsDataImpl$Data$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.awsRegion = str;
            this.url = str2;
            this.apiKey = str3;
            this.defaultAuthorizationType = awsAppsyncAuthorizationType;
            this.authorizationTypes = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
            return n0.m8424e("com.amplifyframework.core.configuration.AmplifyOutputsData.AwsAppsyncAuthorizationType", AmplifyOutputsData.AwsAppsyncAuthorizationType.values());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$0() {
            return new C3866c(n0.m8424e("com.amplifyframework.core.configuration.AmplifyOutputsData.AwsAppsyncAuthorizationType", AmplifyOutputsData.AwsAppsyncAuthorizationType.values()));
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = data.awsRegion;
            }
            if ((i10 & 2) != 0) {
                str2 = data.url;
            }
            if ((i10 & 4) != 0) {
                str3 = data.apiKey;
            }
            if ((i10 & 8) != 0) {
                awsAppsyncAuthorizationType = data.defaultAuthorizationType;
            }
            if ((i10 & 16) != 0) {
                list = data.authorizationTypes;
            }
            List list2 = list;
            String str4 = str3;
            return data.copy(str, str2, str4, awsAppsyncAuthorizationType, list2);
        }

        public static final /* synthetic */ void write$Self$core_release(Data data, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            InterfaceC6357g[] interfaceC6357gArr = $childSerializers;
            C4597u c4597u = (C4597u) interfaceC3365b;
            c4597u.m9444w(interfaceC3055f, 0, data.getAwsRegion());
            c4597u.m9444w(interfaceC3055f, 1, data.getUrl());
            c4597u.mo7695n(interfaceC3055f, 2, jy.a1.f19869a, data.getApiKey());
            c4597u.m9443v(interfaceC3055f, 3, (InterfaceC2401a) interfaceC6357gArr[3].getValue(), data.getDefaultAuthorizationType());
            c4597u.m9443v(interfaceC3055f, 4, (InterfaceC2401a) interfaceC6357gArr[4].getValue(), data.getAuthorizationTypes());
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

        public final Data copy(String awsRegion, String url, String str, AmplifyOutputsData.AwsAppsyncAuthorizationType defaultAuthorizationType, List<? extends AmplifyOutputsData.AwsAppsyncAuthorizationType> authorizationTypes) {
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            AbstractC4154l.m8923f(url, "url");
            AbstractC4154l.m8923f(defaultAuthorizationType, "defaultAuthorizationType");
            AbstractC4154l.m8923f(authorizationTypes, "authorizationTypes");
            return new Data(awsRegion, url, str, defaultAuthorizationType, authorizationTypes);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return AbstractC4154l.m8918a(this.awsRegion, data.awsRegion) && AbstractC4154l.m8918a(this.url, data.url) && AbstractC4154l.m8918a(this.apiKey, data.apiKey) && this.defaultAuthorizationType == data.defaultAuthorizationType && AbstractC4154l.m8918a(this.authorizationTypes, data.authorizationTypes);
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
            int iM113d = AbstractC0030c.m113d(this.awsRegion.hashCode() * 31, 31, this.url);
            String str = this.apiKey;
            return this.authorizationTypes.hashCode() + ((this.defaultAuthorizationType.hashCode() + ((iM113d + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public String toString() {
            String str = this.awsRegion;
            String str2 = this.url;
            String str3 = this.apiKey;
            AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType = this.defaultAuthorizationType;
            List<AmplifyOutputsData.AwsAppsyncAuthorizationType> list = this.authorizationTypes;
            StringBuilder sbM127r = AbstractC0030c.m127r("Data(awsRegion=", str, ", url=", str2, ", apiKey=");
            sbM127r.append(str3);
            sbM127r.append(", defaultAuthorizationType=");
            sbM127r.append(awsAppsyncAuthorizationType);
            sbM127r.append(", authorizationTypes=");
            return AbstractC5601a.m11240k(")", sbM127r, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Data(String awsRegion, String url, String str, AmplifyOutputsData.AwsAppsyncAuthorizationType defaultAuthorizationType, List<? extends AmplifyOutputsData.AwsAppsyncAuthorizationType> authorizationTypes) {
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            AbstractC4154l.m8923f(url, "url");
            AbstractC4154l.m8923f(defaultAuthorizationType, "defaultAuthorizationType");
            AbstractC4154l.m8923f(authorizationTypes, "authorizationTypes");
            this.awsRegion = awsRegion;
            this.url = url;
            this.apiKey = str;
            this.defaultAuthorizationType = defaultAuthorizationType;
            this.authorizationTypes = authorizationTypes;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Geo implements AmplifyOutputsData.Geo {
        public static final Companion Companion = new Companion(null);
        private final String awsRegion;
        private final GeofenceCollections geofenceCollections;
        private final Maps maps;
        private final SearchIndices searchIndices;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class GeofenceCollections implements AmplifyOutputsData.Geo.GeofenceCollections {

            /* renamed from: default, reason: not valid java name */
            private final String f43681default;
            private final Set<String> items;
            public static final Companion Companion = new Companion(null);
            private static final InterfaceC6357g[] $childSerializers = {nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(20)), null};

            /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
            public static final class Companion {
                private Companion() {
                }

                public final InterfaceC2401a serializer() {
                    return AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                    this();
                }
            }

            public /* synthetic */ GeofenceCollections(int i10, Set set, String str, w0 w0Var) {
                if (3 != (i10 & 3)) {
                    n0.m8426g(i10, 3, AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.items = set;
                this.f43681default = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
                jy.a1 a1Var = jy.a1.f19869a;
                return new C3866c();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GeofenceCollections copy$default(GeofenceCollections geofenceCollections, Set set, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    set = geofenceCollections.items;
                }
                if ((i10 & 2) != 0) {
                    str = geofenceCollections.f43681default;
                }
                return geofenceCollections.copy(set, str);
            }

            public static final /* synthetic */ void write$Self$core_release(GeofenceCollections geofenceCollections, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
                C4597u c4597u = (C4597u) interfaceC3365b;
                c4597u.m9443v(interfaceC3055f, 0, (InterfaceC2401a) $childSerializers[0].getValue(), geofenceCollections.getItems());
                c4597u.m9444w(interfaceC3055f, 1, geofenceCollections.getDefault());
            }

            public final Set<String> component1() {
                return this.items;
            }

            public final String component2() {
                return this.f43681default;
            }

            public final GeofenceCollections copy(Set<String> items, String str) {
                AbstractC4154l.m8923f(items, "items");
                AbstractC4154l.m8923f(str, "default");
                return new GeofenceCollections(items, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GeofenceCollections)) {
                    return false;
                }
                GeofenceCollections geofenceCollections = (GeofenceCollections) obj;
                return AbstractC4154l.m8918a(this.items, geofenceCollections.items) && AbstractC4154l.m8918a(this.f43681default, geofenceCollections.f43681default);
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.GeofenceCollections
            public String getDefault() {
                return this.f43681default;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.GeofenceCollections
            public Set<String> getItems() {
                return this.items;
            }

            public int hashCode() {
                return this.f43681default.hashCode() + (this.items.hashCode() * 31);
            }

            public String toString() {
                return "GeofenceCollections(items=" + this.items + ", default=" + this.f43681default + ")";
            }

            public GeofenceCollections(Set<String> items, String str) {
                AbstractC4154l.m8923f(items, "items");
                AbstractC4154l.m8923f(str, "default");
                this.items = items;
                this.f43681default = str;
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Maps implements AmplifyOutputsData.Geo.Maps {

            /* renamed from: default, reason: not valid java name */
            private final String f43682default;
            private final Map<String, AmazonLocationServiceConfig> items;
            public static final Companion Companion = new Companion(null);
            private static final InterfaceC6357g[] $childSerializers = {nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(21)), null};

            /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
            public static final class Companion {
                private Companion() {
                }

                public final InterfaceC2401a serializer() {
                    return AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                    this();
                }
            }

            public /* synthetic */ Maps(int i10, Map map, String str, w0 w0Var) {
                if (3 != (i10 & 3)) {
                    n0.m8426g(i10, 3, AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.items = map;
                this.f43682default = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
                jy.a1 a1Var = jy.a1.f19869a;
                return new f0(AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Maps copy$default(Maps maps, Map map, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    map = maps.items;
                }
                if ((i10 & 2) != 0) {
                    str = maps.f43682default;
                }
                return maps.copy(map, str);
            }

            public static final /* synthetic */ void write$Self$core_release(Maps maps, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
                C4597u c4597u = (C4597u) interfaceC3365b;
                c4597u.m9443v(interfaceC3055f, 0, (InterfaceC2401a) $childSerializers[0].getValue(), maps.getItems());
                c4597u.m9444w(interfaceC3055f, 1, maps.getDefault());
            }

            public final Map<String, AmazonLocationServiceConfig> component1() {
                return this.items;
            }

            public final String component2() {
                return this.f43682default;
            }

            public final Maps copy(Map<String, AmazonLocationServiceConfig> items, String str) {
                AbstractC4154l.m8923f(items, "items");
                AbstractC4154l.m8923f(str, "default");
                return new Maps(items, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Maps)) {
                    return false;
                }
                Maps maps = (Maps) obj;
                return AbstractC4154l.m8918a(this.items, maps.items) && AbstractC4154l.m8918a(this.f43682default, maps.f43682default);
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.Maps
            public String getDefault() {
                return this.f43682default;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.Maps
            public Map<String, AmazonLocationServiceConfig> getItems() {
                return this.items;
            }

            public int hashCode() {
                return this.f43682default.hashCode() + (this.items.hashCode() * 31);
            }

            public String toString() {
                return "Maps(items=" + this.items + ", default=" + this.f43682default + ")";
            }

            public Maps(Map<String, AmazonLocationServiceConfig> items, String str) {
                AbstractC4154l.m8923f(items, "items");
                AbstractC4154l.m8923f(str, "default");
                this.items = items;
                this.f43682default = str;
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class SearchIndices implements AmplifyOutputsData.Geo.SearchIndices {

            /* renamed from: default, reason: not valid java name */
            private final String f43683default;
            private final Set<String> items;
            public static final Companion Companion = new Companion(null);
            private static final InterfaceC6357g[] $childSerializers = {nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(22)), null};

            /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
            public static final class Companion {
                private Companion() {
                }

                public final InterfaceC2401a serializer() {
                    return AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                    this();
                }
            }

            public /* synthetic */ SearchIndices(int i10, Set set, String str, w0 w0Var) {
                if (3 != (i10 & 3)) {
                    n0.m8426g(i10, 3, AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.items = set;
                this.f43683default = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
                jy.a1 a1Var = jy.a1.f19869a;
                return new C3866c();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SearchIndices copy$default(SearchIndices searchIndices, Set set, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    set = searchIndices.items;
                }
                if ((i10 & 2) != 0) {
                    str = searchIndices.f43683default;
                }
                return searchIndices.copy(set, str);
            }

            public static final /* synthetic */ void write$Self$core_release(SearchIndices searchIndices, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
                C4597u c4597u = (C4597u) interfaceC3365b;
                c4597u.m9443v(interfaceC3055f, 0, (InterfaceC2401a) $childSerializers[0].getValue(), searchIndices.getItems());
                c4597u.m9444w(interfaceC3055f, 1, searchIndices.getDefault());
            }

            public final Set<String> component1() {
                return this.items;
            }

            public final String component2() {
                return this.f43683default;
            }

            public final SearchIndices copy(Set<String> items, String str) {
                AbstractC4154l.m8923f(items, "items");
                AbstractC4154l.m8923f(str, "default");
                return new SearchIndices(items, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchIndices)) {
                    return false;
                }
                SearchIndices searchIndices = (SearchIndices) obj;
                return AbstractC4154l.m8918a(this.items, searchIndices.items) && AbstractC4154l.m8918a(this.f43683default, searchIndices.f43683default);
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.SearchIndices
            public String getDefault() {
                return this.f43683default;
            }

            @Override // com.amplifyframework.core.configuration.AmplifyOutputsData.Geo.SearchIndices
            public Set<String> getItems() {
                return this.items;
            }

            public int hashCode() {
                return this.f43683default.hashCode() + (this.items.hashCode() * 31);
            }

            public String toString() {
                return "SearchIndices(items=" + this.items + ", default=" + this.f43683default + ")";
            }

            public SearchIndices(Set<String> items, String str) {
                AbstractC4154l.m8923f(items, "items");
                AbstractC4154l.m8923f(str, "default");
                this.items = items;
                this.f43683default = str;
            }
        }

        public /* synthetic */ Geo(int i10, String str, Maps maps, SearchIndices searchIndices, GeofenceCollections geofenceCollections, w0 w0Var) {
            if (15 != (i10 & 15)) {
                n0.m8426g(i10, 15, AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.awsRegion = str;
            this.maps = maps;
            this.searchIndices = searchIndices;
            this.geofenceCollections = geofenceCollections;
        }

        public static /* synthetic */ Geo copy$default(Geo geo, String str, Maps maps, SearchIndices searchIndices, GeofenceCollections geofenceCollections, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = geo.awsRegion;
            }
            if ((i10 & 2) != 0) {
                maps = geo.maps;
            }
            if ((i10 & 4) != 0) {
                searchIndices = geo.searchIndices;
            }
            if ((i10 & 8) != 0) {
                geofenceCollections = geo.geofenceCollections;
            }
            return geo.copy(str, maps, searchIndices, geofenceCollections);
        }

        public static final /* synthetic */ void write$Self$core_release(Geo geo, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            C4597u c4597u = (C4597u) interfaceC3365b;
            c4597u.m9444w(interfaceC3055f, 0, geo.getAwsRegion());
            c4597u.mo7695n(interfaceC3055f, 1, AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE, geo.getMaps());
            c4597u.mo7695n(interfaceC3055f, 2, AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE, geo.getSearchIndices());
            c4597u.mo7695n(interfaceC3055f, 3, AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE, geo.getGeofenceCollections());
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

        public final Geo copy(String awsRegion, Maps maps, SearchIndices searchIndices, GeofenceCollections geofenceCollections) {
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            return new Geo(awsRegion, maps, searchIndices, geofenceCollections);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Geo)) {
                return false;
            }
            Geo geo = (Geo) obj;
            return AbstractC4154l.m8918a(this.awsRegion, geo.awsRegion) && AbstractC4154l.m8918a(this.maps, geo.maps) && AbstractC4154l.m8918a(this.searchIndices, geo.searchIndices) && AbstractC4154l.m8918a(this.geofenceCollections, geo.geofenceCollections);
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

        public Geo(String awsRegion, Maps maps, SearchIndices searchIndices, GeofenceCollections geofenceCollections) {
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            this.awsRegion = awsRegion;
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Notifications implements AmplifyOutputsData.Notifications {
        private final String amazonPinpointAppId;
        private final String awsRegion;
        private final List<AmplifyOutputsData.AmazonPinpointChannels> channels;
        public static final Companion Companion = new Companion(null);
        private static final InterfaceC6357g[] $childSerializers = {null, null, nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(23))};

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        public /* synthetic */ Notifications(int i10, String str, String str2, List list, w0 w0Var) {
            if (7 != (i10 & 7)) {
                n0.m8426g(i10, 7, AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.awsRegion = str;
            this.amazonPinpointAppId = str2;
            this.channels = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
            return new C3866c(n0.m8424e("com.amplifyframework.core.configuration.AmplifyOutputsData.AmazonPinpointChannels", AmplifyOutputsData.AmazonPinpointChannels.values()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Notifications copy$default(Notifications notifications, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notifications.awsRegion;
            }
            if ((i10 & 2) != 0) {
                str2 = notifications.amazonPinpointAppId;
            }
            if ((i10 & 4) != 0) {
                list = notifications.channels;
            }
            return notifications.copy(str, str2, list);
        }

        public static final /* synthetic */ void write$Self$core_release(Notifications notifications, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            InterfaceC6357g[] interfaceC6357gArr = $childSerializers;
            C4597u c4597u = (C4597u) interfaceC3365b;
            c4597u.m9444w(interfaceC3055f, 0, notifications.getAwsRegion());
            c4597u.m9444w(interfaceC3055f, 1, notifications.getAmazonPinpointAppId());
            c4597u.m9443v(interfaceC3055f, 2, (InterfaceC2401a) interfaceC6357gArr[2].getValue(), notifications.getChannels());
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

        public final Notifications copy(String awsRegion, String amazonPinpointAppId, List<? extends AmplifyOutputsData.AmazonPinpointChannels> channels) {
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            AbstractC4154l.m8923f(amazonPinpointAppId, "amazonPinpointAppId");
            AbstractC4154l.m8923f(channels, "channels");
            return new Notifications(awsRegion, amazonPinpointAppId, channels);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Notifications)) {
                return false;
            }
            Notifications notifications = (Notifications) obj;
            return AbstractC4154l.m8918a(this.awsRegion, notifications.awsRegion) && AbstractC4154l.m8918a(this.amazonPinpointAppId, notifications.amazonPinpointAppId) && AbstractC4154l.m8918a(this.channels, notifications.channels);
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
            return this.channels.hashCode() + AbstractC0030c.m113d(this.awsRegion.hashCode() * 31, 31, this.amazonPinpointAppId);
        }

        public String toString() {
            String str = this.awsRegion;
            String str2 = this.amazonPinpointAppId;
            return AbstractC5601a.m11240k(")", AbstractC0030c.m127r("Notifications(awsRegion=", str, ", amazonPinpointAppId=", str2, ", channels="), this.channels);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Notifications(String awsRegion, String amazonPinpointAppId, List<? extends AmplifyOutputsData.AmazonPinpointChannels> channels) {
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            AbstractC4154l.m8923f(amazonPinpointAppId, "amazonPinpointAppId");
            AbstractC4154l.m8923f(channels, "channels");
            this.awsRegion = awsRegion;
            this.amazonPinpointAppId = amazonPinpointAppId;
            this.channels = channels;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class StorageBucket implements AmplifyOutputsData.StorageBucket {
        public static final Companion Companion = new Companion(null);
        private final String awsRegion;
        private final String bucketName;
        private final String name;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyOutputsDataImpl$StorageBucket$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        public /* synthetic */ StorageBucket(int i10, String str, String str2, String str3, w0 w0Var) {
            if (7 != (i10 & 7)) {
                n0.m8426g(i10, 7, AmplifyOutputsDataImpl$StorageBucket$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.name = str;
            this.awsRegion = str2;
            this.bucketName = str3;
        }

        public static /* synthetic */ StorageBucket copy$default(StorageBucket storageBucket, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = storageBucket.name;
            }
            if ((i10 & 2) != 0) {
                str2 = storageBucket.awsRegion;
            }
            if ((i10 & 4) != 0) {
                str3 = storageBucket.bucketName;
            }
            return storageBucket.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self$core_release(StorageBucket storageBucket, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            C4597u c4597u = (C4597u) interfaceC3365b;
            c4597u.m9444w(interfaceC3055f, 0, storageBucket.getName());
            c4597u.m9444w(interfaceC3055f, 1, storageBucket.getAwsRegion());
            c4597u.m9444w(interfaceC3055f, 2, storageBucket.getBucketName());
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

        public final StorageBucket copy(String name, String awsRegion, String bucketName) {
            AbstractC4154l.m8923f(name, "name");
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            AbstractC4154l.m8923f(bucketName, "bucketName");
            return new StorageBucket(name, awsRegion, bucketName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StorageBucket)) {
                return false;
            }
            StorageBucket storageBucket = (StorageBucket) obj;
            return AbstractC4154l.m8918a(this.name, storageBucket.name) && AbstractC4154l.m8918a(this.awsRegion, storageBucket.awsRegion) && AbstractC4154l.m8918a(this.bucketName, storageBucket.bucketName);
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
            return this.bucketName.hashCode() + AbstractC0030c.m113d(this.name.hashCode() * 31, 31, this.awsRegion);
        }

        public String toString() {
            String str = this.name;
            String str2 = this.awsRegion;
            return AbstractC1452a.m4564k(AbstractC0030c.m127r("StorageBucket(name=", str, ", awsRegion=", str2, ", bucketName="), this.bucketName, ")");
        }

        public StorageBucket(String name, String awsRegion, String bucketName) {
            AbstractC4154l.m8923f(name, "name");
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            AbstractC4154l.m8923f(bucketName, "bucketName");
            this.name = name;
            this.awsRegion = awsRegion;
            this.bucketName = bucketName;
        }
    }

    public /* synthetic */ AmplifyOutputsDataImpl(int i10, String str, Analytics analytics, Auth auth, Data data, Geo geo, Notifications notifications, Storage storage, C4294z c4294z, w0 w0Var) {
        if (255 != (i10 & 255)) {
            n0.m8426g(i10, 255, AmplifyOutputsDataImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.version = str;
        this.analytics = analytics;
        this.auth = auth;
        this.data = data;
        this.geo = geo;
        this.notifications = notifications;
        this.storage = storage;
        this.custom = c4294z;
    }

    public static /* synthetic */ AmplifyOutputsDataImpl copy$default(AmplifyOutputsDataImpl amplifyOutputsDataImpl, String str, Analytics analytics, Auth auth, Data data, Geo geo, Notifications notifications, Storage storage, C4294z c4294z, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = amplifyOutputsDataImpl.version;
        }
        if ((i10 & 2) != 0) {
            analytics = amplifyOutputsDataImpl.analytics;
        }
        if ((i10 & 4) != 0) {
            auth = amplifyOutputsDataImpl.auth;
        }
        if ((i10 & 8) != 0) {
            data = amplifyOutputsDataImpl.data;
        }
        if ((i10 & 16) != 0) {
            geo = amplifyOutputsDataImpl.geo;
        }
        if ((i10 & 32) != 0) {
            notifications = amplifyOutputsDataImpl.notifications;
        }
        if ((i10 & 64) != 0) {
            storage = amplifyOutputsDataImpl.storage;
        }
        if ((i10 & 128) != 0) {
            c4294z = amplifyOutputsDataImpl.custom;
        }
        Storage storage2 = storage;
        C4294z c4294z2 = c4294z;
        Geo geo2 = geo;
        Notifications notifications2 = notifications;
        return amplifyOutputsDataImpl.copy(str, analytics, auth, data, geo2, notifications2, storage2, c4294z2);
    }

    public static final /* synthetic */ void write$Self$core_release(AmplifyOutputsDataImpl amplifyOutputsDataImpl, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
        C4597u c4597u = (C4597u) interfaceC3365b;
        c4597u.m9444w(interfaceC3055f, 0, amplifyOutputsDataImpl.getVersion());
        c4597u.mo7695n(interfaceC3055f, 1, AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE, amplifyOutputsDataImpl.getAnalytics());
        c4597u.mo7695n(interfaceC3055f, 2, AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE, amplifyOutputsDataImpl.getAuth());
        c4597u.mo7695n(interfaceC3055f, 3, AmplifyOutputsDataImpl$Data$$serializer.INSTANCE, amplifyOutputsDataImpl.getData());
        c4597u.mo7695n(interfaceC3055f, 4, AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE, amplifyOutputsDataImpl.getGeo());
        c4597u.mo7695n(interfaceC3055f, 5, AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE, amplifyOutputsDataImpl.getNotifications());
        c4597u.mo7695n(interfaceC3055f, 6, AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE, amplifyOutputsDataImpl.getStorage());
        c4597u.mo7695n(interfaceC3055f, 7, b0.f21664a, amplifyOutputsDataImpl.getCustom());
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

    public final C4294z component8() {
        return this.custom;
    }

    public final AmplifyOutputsDataImpl copy(String version, Analytics analytics, Auth auth, Data data, Geo geo, Notifications notifications, Storage storage, C4294z c4294z) {
        AbstractC4154l.m8923f(version, "version");
        return new AmplifyOutputsDataImpl(version, analytics, auth, data, geo, notifications, storage, c4294z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmplifyOutputsDataImpl)) {
            return false;
        }
        AmplifyOutputsDataImpl amplifyOutputsDataImpl = (AmplifyOutputsDataImpl) obj;
        return AbstractC4154l.m8918a(this.version, amplifyOutputsDataImpl.version) && AbstractC4154l.m8918a(this.analytics, amplifyOutputsDataImpl.analytics) && AbstractC4154l.m8918a(this.auth, amplifyOutputsDataImpl.auth) && AbstractC4154l.m8918a(this.data, amplifyOutputsDataImpl.data) && AbstractC4154l.m8918a(this.geo, amplifyOutputsDataImpl.geo) && AbstractC4154l.m8918a(this.notifications, amplifyOutputsDataImpl.notifications) && AbstractC4154l.m8918a(this.storage, amplifyOutputsDataImpl.storage) && AbstractC4154l.m8918a(this.custom, amplifyOutputsDataImpl.custom);
    }

    @Override // com.amplifyframework.core.configuration.AmplifyOutputsData
    public C4294z getCustom() {
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
        C4294z c4294z = this.custom;
        return iHashCode7 + (c4294z != null ? c4294z.f21699a.hashCode() : 0);
    }

    public String toString() {
        return "AmplifyOutputsDataImpl(version=" + this.version + ", analytics=" + this.analytics + ", auth=" + this.auth + ", data=" + this.data + ", geo=" + this.geo + ", notifications=" + this.notifications + ", storage=" + this.storage + ", custom=" + this.custom + ")";
    }

    public AmplifyOutputsDataImpl(String version, Analytics analytics, Auth auth, Data data, Geo geo, Notifications notifications, Storage storage, C4294z c4294z) {
        AbstractC4154l.m8923f(version, "version");
        this.version = version;
        this.analytics = analytics;
        this.auth = auth;
        this.data = data;
        this.geo = geo;
        this.notifications = notifications;
        this.storage = storage;
        this.custom = c4294z;
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Storage implements AmplifyOutputsData.Storage {
        private final String awsRegion;
        private final String bucketName;
        private final List<StorageBucket> buckets;
        public static final Companion Companion = new Companion(null);
        private static final InterfaceC6357g[] $childSerializers = {null, null, nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(24))};

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        public /* synthetic */ Storage(int i10, String str, String str2, List list, w0 w0Var) {
            if (3 != (i10 & 3)) {
                n0.m8426g(i10, 3, AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.awsRegion = str;
            this.bucketName = str2;
            if ((i10 & 4) == 0) {
                this.buckets = C6668r.f31943a;
            } else {
                this.buckets = list;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
            return new C3866c(AmplifyOutputsDataImpl$StorageBucket$$serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Storage copy$default(Storage storage, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = storage.awsRegion;
            }
            if ((i10 & 2) != 0) {
                str2 = storage.bucketName;
            }
            if ((i10 & 4) != 0) {
                list = storage.buckets;
            }
            return storage.copy(str, str2, list);
        }

        public static final /* synthetic */ void write$Self$core_release(Storage storage, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            InterfaceC6357g[] interfaceC6357gArr = $childSerializers;
            C4597u c4597u = (C4597u) interfaceC3365b;
            c4597u.m9444w(interfaceC3055f, 0, storage.getAwsRegion());
            c4597u.m9444w(interfaceC3055f, 1, storage.getBucketName());
            if (!c4597u.mo7694i(interfaceC3055f) && AbstractC4154l.m8918a(storage.getBuckets(), C6668r.f31943a)) {
                return;
            }
            c4597u.m9443v(interfaceC3055f, 2, (InterfaceC2401a) interfaceC6357gArr[2].getValue(), storage.getBuckets());
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

        public final Storage copy(String awsRegion, String bucketName, List<StorageBucket> buckets) {
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            AbstractC4154l.m8923f(bucketName, "bucketName");
            AbstractC4154l.m8923f(buckets, "buckets");
            return new Storage(awsRegion, bucketName, buckets);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Storage)) {
                return false;
            }
            Storage storage = (Storage) obj;
            return AbstractC4154l.m8918a(this.awsRegion, storage.awsRegion) && AbstractC4154l.m8918a(this.bucketName, storage.bucketName) && AbstractC4154l.m8918a(this.buckets, storage.buckets);
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
            return this.buckets.hashCode() + AbstractC0030c.m113d(this.awsRegion.hashCode() * 31, 31, this.bucketName);
        }

        public String toString() {
            String str = this.awsRegion;
            String str2 = this.bucketName;
            return AbstractC5601a.m11240k(")", AbstractC0030c.m127r("Storage(awsRegion=", str, ", bucketName=", str2, ", buckets="), this.buckets);
        }

        public Storage(String awsRegion, String bucketName, List<StorageBucket> buckets) {
            AbstractC4154l.m8923f(awsRegion, "awsRegion");
            AbstractC4154l.m8923f(bucketName, "bucketName");
            AbstractC4154l.m8923f(buckets, "buckets");
            this.awsRegion = awsRegion;
            this.bucketName = bucketName;
            this.buckets = buckets;
        }

        public /* synthetic */ Storage(String str, String str2, List list, int i10, AbstractC4148f abstractC4148f) {
            this(str, str2, (i10 & 4) != 0 ? C6668r.f31943a : list);
        }
    }
}

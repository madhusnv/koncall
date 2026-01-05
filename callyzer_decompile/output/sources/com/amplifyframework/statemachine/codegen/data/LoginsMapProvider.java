package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import rw.AbstractC6674x;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class LoginsMapProvider {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class AuthProviderLogins extends LoginsMapProvider {
        private final FederatedToken federatedToken;
        private final Map<String, String> logins;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthProviderLogins(FederatedToken federatedToken) {
            super(null);
            AbstractC4154l.m8923f(federatedToken, "federatedToken");
            this.federatedToken = federatedToken;
            this.logins = AbstractC6674x.m12777e(new C6361k(federatedToken.getProviderName(), federatedToken.getToken()));
        }

        private final FederatedToken component1() {
            return this.federatedToken;
        }

        public static /* synthetic */ AuthProviderLogins copy$default(AuthProviderLogins authProviderLogins, FederatedToken federatedToken, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                federatedToken = authProviderLogins.federatedToken;
            }
            return authProviderLogins.copy(federatedToken);
        }

        public final AuthProviderLogins copy(FederatedToken federatedToken) {
            AbstractC4154l.m8923f(federatedToken, "federatedToken");
            return new AuthProviderLogins(federatedToken);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AuthProviderLogins) && AbstractC4154l.m8918a(this.federatedToken, ((AuthProviderLogins) obj).federatedToken);
        }

        @Override // com.amplifyframework.statemachine.codegen.data.LoginsMapProvider
        public Map<String, String> getLogins() {
            return this.logins;
        }

        public int hashCode() {
            return this.federatedToken.hashCode();
        }

        public String toString() {
            return "AuthProviderLogins(federatedToken=" + this.federatedToken + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CognitoUserPoolLogins extends LoginsMapProvider {
        private final String idToken;
        private final Map<String, String> logins;
        private final String poolId;
        private final String providerName;
        private final String region;

        public /* synthetic */ CognitoUserPoolLogins(String str, String str2, String str3, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, str3);
        }

        private final String component1() {
            return this.region;
        }

        private final String component2() {
            return this.poolId;
        }

        private final String component3() {
            return this.idToken;
        }

        public static /* synthetic */ CognitoUserPoolLogins copy$default(CognitoUserPoolLogins cognitoUserPoolLogins, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cognitoUserPoolLogins.region;
            }
            if ((i10 & 2) != 0) {
                str2 = cognitoUserPoolLogins.poolId;
            }
            if ((i10 & 4) != 0) {
                str3 = cognitoUserPoolLogins.idToken;
            }
            return cognitoUserPoolLogins.copy(str, str2, str3);
        }

        public final CognitoUserPoolLogins copy(String str, String str2, String idToken) {
            AbstractC4154l.m8923f(idToken, "idToken");
            return new CognitoUserPoolLogins(str, str2, idToken);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CognitoUserPoolLogins)) {
                return false;
            }
            CognitoUserPoolLogins cognitoUserPoolLogins = (CognitoUserPoolLogins) obj;
            return AbstractC4154l.m8918a(this.region, cognitoUserPoolLogins.region) && AbstractC4154l.m8918a(this.poolId, cognitoUserPoolLogins.poolId) && AbstractC4154l.m8918a(this.idToken, cognitoUserPoolLogins.idToken);
        }

        @Override // com.amplifyframework.statemachine.codegen.data.LoginsMapProvider
        public Map<String, String> getLogins() {
            return this.logins;
        }

        public final String getProviderName() {
            return this.providerName;
        }

        public int hashCode() {
            String str = this.region;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.poolId;
            return this.idToken.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.region;
            String str2 = this.poolId;
            return AbstractC1452a.m4564k(AbstractC0030c.m127r("CognitoUserPoolLogins(region=", str, ", poolId=", str2, ", idToken="), this.idToken, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CognitoUserPoolLogins(String str, String str2, String idToken) {
            super(null);
            AbstractC4154l.m8923f(idToken, "idToken");
            this.region = str;
            this.poolId = str2;
            this.idToken = idToken;
            String strM121l = AbstractC0030c.m121l("cognito-idp.", str, ".amazonaws.com/", str2);
            this.providerName = strM121l;
            this.logins = AbstractC6674x.m12777e(new C6361k(strM121l, idToken));
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class UnAuthLogins extends LoginsMapProvider {
        private final Map<String, String> logins;

        /* JADX WARN: Multi-variable type inference failed */
        public UnAuthLogins() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UnAuthLogins copy$default(UnAuthLogins unAuthLogins, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = unAuthLogins.logins;
            }
            return unAuthLogins.copy(map);
        }

        public final Map<String, String> component1() {
            return this.logins;
        }

        public final UnAuthLogins copy(Map<String, String> logins) {
            AbstractC4154l.m8923f(logins, "logins");
            return new UnAuthLogins(logins);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnAuthLogins) && AbstractC4154l.m8918a(this.logins, ((UnAuthLogins) obj).logins);
        }

        @Override // com.amplifyframework.statemachine.codegen.data.LoginsMapProvider
        public Map<String, String> getLogins() {
            return this.logins;
        }

        public int hashCode() {
            return this.logins.hashCode();
        }

        public String toString() {
            return "UnAuthLogins(logins=" + this.logins + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnAuthLogins(Map<String, String> logins) {
            super(null);
            AbstractC4154l.m8923f(logins, "logins");
            this.logins = logins;
        }

        public /* synthetic */ UnAuthLogins(Map map, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? C6669s.f31944a : map);
        }
    }

    public /* synthetic */ LoginsMapProvider(AbstractC4148f abstractC4148f) {
        this();
    }

    public abstract Map<String, String> getLogins();

    private LoginsMapProvider() {
    }
}

package com.amplifyframework.statemachine.codegen.data;

import java.util.Map;
import p001o.hsa;
import p001o.id5;
import p001o.isa;
import p001o.sq8;
import p001o.vyh;

/* loaded from: classes5.dex */
public abstract class LoginsMapProvider {

    public static final class AuthProviderLogins extends LoginsMapProvider {
        private final FederatedToken federatedToken;
        private final Map<String, String> logins;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthProviderLogins(FederatedToken federatedToken) {
            super(null);
            sq8.m48649h(federatedToken, "federatedToken");
            this.federatedToken = federatedToken;
            this.logins = hsa.m31056f(vyh.m53620a(federatedToken.getProviderName(), federatedToken.getToken()));
        }

        private final FederatedToken component1() {
            return this.federatedToken;
        }

        public static /* synthetic */ AuthProviderLogins copy$default(AuthProviderLogins authProviderLogins, FederatedToken federatedToken, int i, Object obj) {
            if ((i & 1) != 0) {
                federatedToken = authProviderLogins.federatedToken;
            }
            return authProviderLogins.copy(federatedToken);
        }

        public final AuthProviderLogins copy(FederatedToken federatedToken) {
            sq8.m48649h(federatedToken, "federatedToken");
            return new AuthProviderLogins(federatedToken);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AuthProviderLogins) && sq8.m48644c(this.federatedToken, ((AuthProviderLogins) obj).federatedToken);
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

    public static final class CognitoUserPoolLogins extends LoginsMapProvider {
        private final String idToken;
        private final Map<String, String> logins;
        private final String poolId;
        private final String providerName;
        private final String region;

        public /* synthetic */ CognitoUserPoolLogins(String str, String str2, String str3, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3);
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

        public static /* synthetic */ CognitoUserPoolLogins copy$default(CognitoUserPoolLogins cognitoUserPoolLogins, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cognitoUserPoolLogins.region;
            }
            if ((i & 2) != 0) {
                str2 = cognitoUserPoolLogins.poolId;
            }
            if ((i & 4) != 0) {
                str3 = cognitoUserPoolLogins.idToken;
            }
            return cognitoUserPoolLogins.copy(str, str2, str3);
        }

        public final CognitoUserPoolLogins copy(String str, String str2, String str3) {
            sq8.m48649h(str3, "idToken");
            return new CognitoUserPoolLogins(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CognitoUserPoolLogins)) {
                return false;
            }
            CognitoUserPoolLogins cognitoUserPoolLogins = (CognitoUserPoolLogins) obj;
            return sq8.m48644c(this.region, cognitoUserPoolLogins.region) && sq8.m48644c(this.poolId, cognitoUserPoolLogins.poolId) && sq8.m48644c(this.idToken, cognitoUserPoolLogins.idToken);
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
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.idToken.hashCode();
        }

        public String toString() {
            return "CognitoUserPoolLogins(region=" + this.region + ", poolId=" + this.poolId + ", idToken=" + this.idToken + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CognitoUserPoolLogins(String str, String str2, String str3) {
            super(null);
            sq8.m48649h(str3, "idToken");
            this.region = str;
            this.poolId = str2;
            this.idToken = str3;
            String str4 = "cognito-idp." + str + ".amazonaws.com/" + str2;
            this.providerName = str4;
            this.logins = hsa.m31056f(vyh.m53620a(str4, str3));
        }
    }

    public static final class UnAuthLogins extends LoginsMapProvider {
        private final Map<String, String> logins;

        /* JADX WARN: Multi-variable type inference failed */
        public UnAuthLogins() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UnAuthLogins copy$default(UnAuthLogins unAuthLogins, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = unAuthLogins.logins;
            }
            return unAuthLogins.copy(map);
        }

        public final Map<String, String> component1() {
            return this.logins;
        }

        public final UnAuthLogins copy(Map<String, String> map) {
            sq8.m48649h(map, "logins");
            return new UnAuthLogins(map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnAuthLogins) && sq8.m48644c(this.logins, ((UnAuthLogins) obj).logins);
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
        public UnAuthLogins(Map<String, String> map) {
            super(null);
            sq8.m48649h(map, "logins");
            this.logins = map;
        }

        public /* synthetic */ UnAuthLogins(Map map, int i, id5 id5Var) {
            this((i & 1) != 0 ? isa.m32681h() : map);
        }
    }

    private LoginsMapProvider() {
    }

    public /* synthetic */ LoginsMapProvider(id5 id5Var) {
        this();
    }

    public abstract Map<String, String> getLogins();
}

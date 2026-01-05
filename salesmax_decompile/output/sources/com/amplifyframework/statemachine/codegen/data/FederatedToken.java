package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import p001o.dc9;
import p001o.dff;
import p001o.f9g;
import p001o.fff;
import p001o.id5;
import p001o.kl8;
import p001o.lo3;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class FederatedToken {
    public static final Companion Companion = new Companion(null);
    private final String providerName;
    private final String token;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return FederatedToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FederatedToken(int i, String str, String str2, fff fffVar) {
        if (3 != (i & 3)) {
            tbd.m49692a(i, 3, FederatedToken$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        this.providerName = str2;
    }

    public static /* synthetic */ FederatedToken copy$default(FederatedToken federatedToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = federatedToken.token;
        }
        if ((i & 2) != 0) {
            str2 = federatedToken.providerName;
        }
        return federatedToken.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self(FederatedToken federatedToken, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37568p(uefVar, 0, federatedToken.token);
        lo3Var.mo37568p(uefVar, 1, federatedToken.providerName);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.providerName;
    }

    public final FederatedToken copy(String str, String str2) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        sq8.m48649h(str2, "providerName");
        return new FederatedToken(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FederatedToken)) {
            return false;
        }
        FederatedToken federatedToken = (FederatedToken) obj;
        return sq8.m48644c(this.token, federatedToken.token) && sq8.m48644c(this.providerName, federatedToken.providerName);
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + this.providerName.hashCode();
    }

    public String toString() {
        return "FederatedToken(token = " + f9g.L0(this.token, new kl8(0, 4)) + "***, providerName = " + this.providerName + ")";
    }

    public FederatedToken(String str, String str2) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        sq8.m48649h(str2, "providerName");
        this.token = str;
        this.providerName = str2;
    }
}

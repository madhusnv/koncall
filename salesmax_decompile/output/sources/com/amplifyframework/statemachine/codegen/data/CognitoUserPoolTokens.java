package com.amplifyframework.statemachine.codegen.data;

import p001o.dc9;
import p001o.dff;
import p001o.f9g;
import p001o.fff;
import p001o.id5;
import p001o.kl8;
import p001o.lo3;
import p001o.p8g;
import p001o.qla;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class CognitoUserPoolTokens {
    public static final Companion Companion = new Companion(null);
    private final String accessToken;
    private final Long expiration;
    private final String idToken;
    private final String refreshToken;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return CognitoUserPoolTokens$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CognitoUserPoolTokens(int i, String str, String str2, String str3, Long l, fff fffVar) {
        if (15 != (i & 15)) {
            tbd.m49692a(i, 15, CognitoUserPoolTokens$$serializer.INSTANCE.getDescriptor());
        }
        this.idToken = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.expiration = l;
    }

    public static /* synthetic */ CognitoUserPoolTokens copy$default(CognitoUserPoolTokens cognitoUserPoolTokens, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cognitoUserPoolTokens.idToken;
        }
        if ((i & 2) != 0) {
            str2 = cognitoUserPoolTokens.accessToken;
        }
        if ((i & 4) != 0) {
            str3 = cognitoUserPoolTokens.refreshToken;
        }
        if ((i & 8) != 0) {
            l = cognitoUserPoolTokens.expiration;
        }
        return cognitoUserPoolTokens.copy(str, str2, str3, l);
    }

    public static final /* synthetic */ void write$Self(CognitoUserPoolTokens cognitoUserPoolTokens, lo3 lo3Var, uef uefVar) {
        p8g p8gVar = p8g.f39602a;
        lo3Var.mo37571z(uefVar, 0, p8gVar, cognitoUserPoolTokens.idToken);
        lo3Var.mo37571z(uefVar, 1, p8gVar, cognitoUserPoolTokens.accessToken);
        lo3Var.mo37571z(uefVar, 2, p8gVar, cognitoUserPoolTokens.refreshToken);
        lo3Var.mo37571z(uefVar, 3, qla.f42120a, cognitoUserPoolTokens.expiration);
    }

    public final String component1() {
        return this.idToken;
    }

    public final String component2() {
        return this.accessToken;
    }

    public final String component3() {
        return this.refreshToken;
    }

    public final Long component4() {
        return this.expiration;
    }

    public final CognitoUserPoolTokens copy(String str, String str2, String str3, Long l) {
        return new CognitoUserPoolTokens(str, str2, str3, l);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj != null && sq8.m48644c(CognitoUserPoolTokens.class, obj.getClass()) && (obj instanceof CognitoUserPoolTokens)) {
            CognitoUserPoolTokens cognitoUserPoolTokens = (CognitoUserPoolTokens) obj;
            if (sq8.m48644c(this.idToken, cognitoUserPoolTokens.idToken) && sq8.m48644c(this.accessToken, cognitoUserPoolTokens.accessToken) && sq8.m48644c(this.refreshToken, cognitoUserPoolTokens.refreshToken)) {
                return true;
            }
        }
        return false;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Long getExpiration() {
        return this.expiration;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        String str = this.idToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accessToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refreshToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.expiration;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.idToken;
        String strL0 = str != null ? f9g.L0(str, new kl8(0, 4)) : null;
        String str2 = this.accessToken;
        String strL02 = str2 != null ? f9g.L0(str2, new kl8(0, 4)) : null;
        String str3 = this.refreshToken;
        return "CognitoUserPoolTokens(idToken = " + strL0 + "***, accessToken = " + strL02 + "***, refreshToken = " + (str3 != null ? f9g.L0(str3, new kl8(0, 4)) : null) + "***)";
    }

    public CognitoUserPoolTokens(String str, String str2, String str3, Long l) {
        this.idToken = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.expiration = l;
    }
}

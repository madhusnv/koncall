package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import jy.a1;
import jy.j0;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CognitoUserPoolTokens {
    public static final Companion Companion = new Companion(null);
    private final String accessToken;
    private final Long expiration;
    private final String idToken;
    private final String refreshToken;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC2401a serializer() {
            return CognitoUserPoolTokens$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    public /* synthetic */ CognitoUserPoolTokens(int i10, String str, String str2, String str3, Long l9, w0 w0Var) {
        if (15 != (i10 & 15)) {
            n0.m8426g(i10, 15, CognitoUserPoolTokens$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.idToken = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.expiration = l9;
    }

    public static /* synthetic */ CognitoUserPoolTokens copy$default(CognitoUserPoolTokens cognitoUserPoolTokens, String str, String str2, String str3, Long l9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cognitoUserPoolTokens.idToken;
        }
        if ((i10 & 2) != 0) {
            str2 = cognitoUserPoolTokens.accessToken;
        }
        if ((i10 & 4) != 0) {
            str3 = cognitoUserPoolTokens.refreshToken;
        }
        if ((i10 & 8) != 0) {
            l9 = cognitoUserPoolTokens.expiration;
        }
        return cognitoUserPoolTokens.copy(str, str2, str3, l9);
    }

    public static final /* synthetic */ void write$Self$aws_auth_cognito_release(CognitoUserPoolTokens cognitoUserPoolTokens, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
        a1 a1Var = a1.f19869a;
        interfaceC3365b.mo7695n(interfaceC3055f, 0, a1Var, cognitoUserPoolTokens.idToken);
        interfaceC3365b.mo7695n(interfaceC3055f, 1, a1Var, cognitoUserPoolTokens.accessToken);
        interfaceC3365b.mo7695n(interfaceC3055f, 2, a1Var, cognitoUserPoolTokens.refreshToken);
        interfaceC3365b.mo7695n(interfaceC3055f, 3, j0.f19910a, cognitoUserPoolTokens.expiration);
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

    public final CognitoUserPoolTokens copy(String str, String str2, String str3, Long l9) {
        return new CognitoUserPoolTokens(str, str2, str3, l9);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj != null && CognitoUserPoolTokens.class.equals(obj.getClass()) && (obj instanceof CognitoUserPoolTokens)) {
            CognitoUserPoolTokens cognitoUserPoolTokens = (CognitoUserPoolTokens) obj;
            if (AbstractC4154l.m8918a(this.idToken, cognitoUserPoolTokens.idToken) && AbstractC4154l.m8918a(this.accessToken, cognitoUserPoolTokens.accessToken) && AbstractC4154l.m8918a(this.refreshToken, cognitoUserPoolTokens.refreshToken)) {
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
        Long l9 = this.expiration;
        return iHashCode3 + (l9 != null ? l9.hashCode() : 0);
    }

    public String toString() {
        String str = this.idToken;
        String strM10114Y = str != null ? AbstractC5178p.m10114Y(str, new C4266h(0, 4, 1)) : null;
        String str2 = this.accessToken;
        String strM10114Y2 = str2 != null ? AbstractC5178p.m10114Y(str2, new C4266h(0, 4, 1)) : null;
        String str3 = this.refreshToken;
        return AbstractC1452a.m4564k(AbstractC0030c.m127r("CognitoUserPoolTokens(idToken = ", strM10114Y, "***, accessToken = ", strM10114Y2, "***, refreshToken = "), str3 != null ? AbstractC5178p.m10114Y(str3, new C4266h(0, 4, 1)) : null, "***)");
    }

    public CognitoUserPoolTokens(String str, String str2, String str3, Long l9) {
        this.idToken = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.expiration = l9;
    }
}

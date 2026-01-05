package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import com.amplifyframework.statemachine.codegen.data.serializer.DateSerializer;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import java.util.Date;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;
import og.nd;
import qw.EnumC6359i;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignedInData {
    private final CognitoUserPoolTokens cognitoUserPoolTokens;
    private final SignInMethod signInMethod;
    private final Date signedInDate;
    private final String userId;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC6357g[] $childSerializers = {null, null, null, nd.m10781b(EnumC6359i.PUBLICATION, new C1226a(6)), null};

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC2401a serializer() {
            return SignedInData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    public /* synthetic */ SignedInData(int i10, String str, String str2, Date date, SignInMethod signInMethod, CognitoUserPoolTokens cognitoUserPoolTokens, w0 w0Var) {
        if (31 != (i10 & 31)) {
            n0.m8426g(i10, 31, SignedInData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userId = str;
        this.username = str2;
        this.signedInDate = date;
        this.signInMethod = signInMethod;
        this.cognitoUserPoolTokens = cognitoUserPoolTokens;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
        return SignInMethod.Companion.serializer();
    }

    public static /* synthetic */ SignedInData copy$default(SignedInData signedInData, String str, String str2, Date date, SignInMethod signInMethod, CognitoUserPoolTokens cognitoUserPoolTokens, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = signedInData.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = signedInData.username;
        }
        if ((i10 & 4) != 0) {
            date = signedInData.signedInDate;
        }
        if ((i10 & 8) != 0) {
            signInMethod = signedInData.signInMethod;
        }
        if ((i10 & 16) != 0) {
            cognitoUserPoolTokens = signedInData.cognitoUserPoolTokens;
        }
        CognitoUserPoolTokens cognitoUserPoolTokens2 = cognitoUserPoolTokens;
        Date date2 = date;
        return signedInData.copy(str, str2, date2, signInMethod, cognitoUserPoolTokens2);
    }

    public static final /* synthetic */ void write$Self$aws_auth_cognito_release(SignedInData signedInData, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
        InterfaceC6357g[] interfaceC6357gArr = $childSerializers;
        C4597u c4597u = (C4597u) interfaceC3365b;
        c4597u.m9444w(interfaceC3055f, 0, signedInData.userId);
        c4597u.m9444w(interfaceC3055f, 1, signedInData.username);
        c4597u.m9443v(interfaceC3055f, 2, DateSerializer.INSTANCE, signedInData.signedInDate);
        c4597u.m9443v(interfaceC3055f, 3, (InterfaceC2401a) interfaceC6357gArr[3].getValue(), signedInData.signInMethod);
        c4597u.m9443v(interfaceC3055f, 4, CognitoUserPoolTokens$$serializer.INSTANCE, signedInData.cognitoUserPoolTokens);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.username;
    }

    public final Date component3() {
        return this.signedInDate;
    }

    public final SignInMethod component4() {
        return this.signInMethod;
    }

    public final CognitoUserPoolTokens component5() {
        return this.cognitoUserPoolTokens;
    }

    public final SignedInData copy(String userId, String username, Date signedInDate, SignInMethod signInMethod, CognitoUserPoolTokens cognitoUserPoolTokens) {
        AbstractC4154l.m8923f(userId, "userId");
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(signedInDate, "signedInDate");
        AbstractC4154l.m8923f(signInMethod, "signInMethod");
        AbstractC4154l.m8923f(cognitoUserPoolTokens, "cognitoUserPoolTokens");
        return new SignedInData(userId, username, signedInDate, signInMethod, cognitoUserPoolTokens);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj != null && SignedInData.class.equals(obj.getClass()) && (obj instanceof SignedInData)) {
            SignedInData signedInData = (SignedInData) obj;
            if (AbstractC4154l.m8918a(this.userId, signedInData.userId) && AbstractC4154l.m8918a(this.username, signedInData.username) && AbstractC4154l.m8918a(this.signInMethod, signedInData.signInMethod) && AbstractC4154l.m8918a(this.cognitoUserPoolTokens, signedInData.cognitoUserPoolTokens)) {
                return true;
            }
        }
        return false;
    }

    public final CognitoUserPoolTokens getCognitoUserPoolTokens() {
        return this.cognitoUserPoolTokens;
    }

    public final SignInMethod getSignInMethod() {
        return this.signInMethod;
    }

    public final Date getSignedInDate() {
        return this.signedInDate;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.cognitoUserPoolTokens.hashCode() + ((this.signInMethod.hashCode() + ((this.signedInDate.hashCode() + AbstractC0030c.m113d(this.userId.hashCode() * 31, 31, this.username)) * 31)) * 31);
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.username;
        Date date = this.signedInDate;
        SignInMethod signInMethod = this.signInMethod;
        CognitoUserPoolTokens cognitoUserPoolTokens = this.cognitoUserPoolTokens;
        StringBuilder sbM127r = AbstractC0030c.m127r("SignedInData(userId=", str, ", username=", str2, ", signedInDate=");
        sbM127r.append(date);
        sbM127r.append(", signInMethod=");
        sbM127r.append(signInMethod);
        sbM127r.append(", cognitoUserPoolTokens=");
        sbM127r.append(cognitoUserPoolTokens);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public SignedInData(String userId, String username, Date signedInDate, SignInMethod signInMethod, CognitoUserPoolTokens cognitoUserPoolTokens) {
        AbstractC4154l.m8923f(userId, "userId");
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(signedInDate, "signedInDate");
        AbstractC4154l.m8923f(signInMethod, "signInMethod");
        AbstractC4154l.m8923f(cognitoUserPoolTokens, "cognitoUserPoolTokens");
        this.userId = userId;
        this.username = username;
        this.signedInDate = signedInDate;
        this.signInMethod = signInMethod;
        this.cognitoUserPoolTokens = cognitoUserPoolTokens;
    }

    public static /* synthetic */ void getSignedInDate$annotations() {
    }
}

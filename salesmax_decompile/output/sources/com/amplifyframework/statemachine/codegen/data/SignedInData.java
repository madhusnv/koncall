package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.serializer.DateSerializer;
import java.util.Date;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class SignedInData {
    private final CognitoUserPoolTokens cognitoUserPoolTokens;
    private final SignInMethod signInMethod;
    private final Date signedInDate;
    private final String userId;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final dc9[] $childSerializers = {null, null, null, SignInMethod.Companion.serializer(), null};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return SignedInData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignedInData(int i, String str, String str2, @dff(with = DateSerializer.class) Date date, SignInMethod signInMethod, CognitoUserPoolTokens cognitoUserPoolTokens, fff fffVar) {
        if (31 != (i & 31)) {
            tbd.m49692a(i, 31, SignedInData$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        this.username = str2;
        this.signedInDate = date;
        this.signInMethod = signInMethod;
        this.cognitoUserPoolTokens = cognitoUserPoolTokens;
    }

    public static /* synthetic */ SignedInData copy$default(SignedInData signedInData, String str, String str2, Date date, SignInMethod signInMethod, CognitoUserPoolTokens cognitoUserPoolTokens, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signedInData.userId;
        }
        if ((i & 2) != 0) {
            str2 = signedInData.username;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            date = signedInData.signedInDate;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            signInMethod = signedInData.signInMethod;
        }
        SignInMethod signInMethod2 = signInMethod;
        if ((i & 16) != 0) {
            cognitoUserPoolTokens = signedInData.cognitoUserPoolTokens;
        }
        return signedInData.copy(str, str3, date2, signInMethod2, cognitoUserPoolTokens);
    }

    @dff(with = DateSerializer.class)
    public static /* synthetic */ void getSignedInDate$annotations() {
    }

    public static final /* synthetic */ void write$Self(SignedInData signedInData, lo3 lo3Var, uef uefVar) {
        dc9[] dc9VarArr = $childSerializers;
        lo3Var.mo37568p(uefVar, 0, signedInData.userId);
        lo3Var.mo37568p(uefVar, 1, signedInData.username);
        lo3Var.mo37566l(uefVar, 2, DateSerializer.INSTANCE, signedInData.signedInDate);
        lo3Var.mo37566l(uefVar, 3, dc9VarArr[3], signedInData.signInMethod);
        lo3Var.mo37566l(uefVar, 4, CognitoUserPoolTokens$$serializer.INSTANCE, signedInData.cognitoUserPoolTokens);
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

    public final SignedInData copy(String str, String str2, Date date, SignInMethod signInMethod, CognitoUserPoolTokens cognitoUserPoolTokens) {
        sq8.m48649h(str, "userId");
        sq8.m48649h(str2, "username");
        sq8.m48649h(date, "signedInDate");
        sq8.m48649h(signInMethod, "signInMethod");
        sq8.m48649h(cognitoUserPoolTokens, "cognitoUserPoolTokens");
        return new SignedInData(str, str2, date, signInMethod, cognitoUserPoolTokens);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj != null && sq8.m48644c(SignedInData.class, obj.getClass()) && (obj instanceof SignedInData)) {
            SignedInData signedInData = (SignedInData) obj;
            if (sq8.m48644c(this.userId, signedInData.userId) && sq8.m48644c(this.username, signedInData.username) && sq8.m48644c(this.signInMethod, signedInData.signInMethod) && sq8.m48644c(this.cognitoUserPoolTokens, signedInData.cognitoUserPoolTokens)) {
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
        return (((((((this.userId.hashCode() * 31) + this.username.hashCode()) * 31) + this.signedInDate.hashCode()) * 31) + this.signInMethod.hashCode()) * 31) + this.cognitoUserPoolTokens.hashCode();
    }

    public String toString() {
        return "SignedInData(userId=" + this.userId + ", username=" + this.username + ", signedInDate=" + this.signedInDate + ", signInMethod=" + this.signInMethod + ", cognitoUserPoolTokens=" + this.cognitoUserPoolTokens + ")";
    }

    public SignedInData(String str, String str2, Date date, SignInMethod signInMethod, CognitoUserPoolTokens cognitoUserPoolTokens) {
        sq8.m48649h(str, "userId");
        sq8.m48649h(str2, "username");
        sq8.m48649h(date, "signedInDate");
        sq8.m48649h(signInMethod, "signInMethod");
        sq8.m48649h(cognitoUserPoolTokens, "cognitoUserPoolTokens");
        this.userId = str;
        this.username = str2;
        this.signedInDate = date;
        this.signInMethod = signInMethod;
        this.cognitoUserPoolTokens = cognitoUserPoolTokens;
    }
}

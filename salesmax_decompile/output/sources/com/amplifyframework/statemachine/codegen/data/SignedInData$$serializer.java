package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.serializer.DateSerializer;
import java.util.Date;
import p001o.dc9;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.lo3;
import p001o.p8g;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class SignedInData$$serializer implements yn7 {
    public static final SignedInData$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        SignedInData$$serializer signedInData$$serializer = new SignedInData$$serializer();
        INSTANCE = signedInData$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.statemachine.codegen.data.SignedInData", signedInData$$serializer, 5);
        ubdVar.m51338k("userId", false);
        ubdVar.m51338k("username", false);
        ubdVar.m51338k("signedInDate", false);
        ubdVar.m51338k("signInMethod", false);
        ubdVar.m51338k("cognitoUserPoolTokens", false);
        descriptor = ubdVar;
    }

    private SignedInData$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        dc9[] dc9VarArr = SignedInData.$childSerializers;
        p8g p8gVar = p8g.f39602a;
        return new dc9[]{p8gVar, p8gVar, DateSerializer.INSTANCE, dc9VarArr[3], CognitoUserPoolTokens$$serializer.INSTANCE};
    }

    @Override // p001o.bn5
    public SignedInData deserialize(w75 w75Var) {
        int i;
        String str;
        String str2;
        Date date;
        SignInMethod signInMethod;
        CognitoUserPoolTokens cognitoUserPoolTokens;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = SignedInData.$childSerializers;
        String strMo17247p = null;
        if (jo3VarMo20420b.mo17245n()) {
            String strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 0);
            String strMo17247p3 = jo3VarMo20420b.mo17247p(descriptor2, 1);
            Date date2 = (Date) jo3VarMo20420b.mo17252u(descriptor2, 2, DateSerializer.INSTANCE, null);
            signInMethod = (SignInMethod) jo3VarMo20420b.mo17252u(descriptor2, 3, dc9VarArr[3], null);
            str = strMo17247p2;
            cognitoUserPoolTokens = (CognitoUserPoolTokens) jo3VarMo20420b.mo17252u(descriptor2, 4, CognitoUserPoolTokens$$serializer.INSTANCE, null);
            date = date2;
            i = 31;
            str2 = strMo17247p3;
        } else {
            boolean z = true;
            int i2 = 0;
            String strMo17247p4 = null;
            Date date3 = null;
            SignInMethod signInMethod2 = null;
            CognitoUserPoolTokens cognitoUserPoolTokens2 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 0);
                    i2 |= 1;
                } else if (iMo16814k == 1) {
                    strMo17247p4 = jo3VarMo20420b.mo17247p(descriptor2, 1);
                    i2 |= 2;
                } else if (iMo16814k == 2) {
                    date3 = (Date) jo3VarMo20420b.mo17252u(descriptor2, 2, DateSerializer.INSTANCE, date3);
                    i2 |= 4;
                } else if (iMo16814k == 3) {
                    signInMethod2 = (SignInMethod) jo3VarMo20420b.mo17252u(descriptor2, 3, dc9VarArr[3], signInMethod2);
                    i2 |= 8;
                } else {
                    if (iMo16814k != 4) {
                        throw new i4i(iMo16814k);
                    }
                    cognitoUserPoolTokens2 = (CognitoUserPoolTokens) jo3VarMo20420b.mo17252u(descriptor2, 4, CognitoUserPoolTokens$$serializer.INSTANCE, cognitoUserPoolTokens2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = strMo17247p;
            str2 = strMo17247p4;
            date = date3;
            signInMethod = signInMethod2;
            cognitoUserPoolTokens = cognitoUserPoolTokens2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new SignedInData(i, str, str2, date, signInMethod, cognitoUserPoolTokens, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, SignedInData signedInData) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(signedInData, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        SignedInData.write$Self(signedInData, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

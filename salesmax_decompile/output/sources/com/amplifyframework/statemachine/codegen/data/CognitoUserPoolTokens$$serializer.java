package com.amplifyframework.statemachine.codegen.data;

import p001o.dc9;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.lo3;
import p001o.p8g;
import p001o.qla;
import p001o.sm1;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class CognitoUserPoolTokens$$serializer implements yn7 {
    public static final CognitoUserPoolTokens$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        CognitoUserPoolTokens$$serializer cognitoUserPoolTokens$$serializer = new CognitoUserPoolTokens$$serializer();
        INSTANCE = cognitoUserPoolTokens$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens", cognitoUserPoolTokens$$serializer, 4);
        ubdVar.m51338k("idToken", false);
        ubdVar.m51338k("accessToken", false);
        ubdVar.m51338k("refreshToken", false);
        ubdVar.m51338k("expiration", false);
        descriptor = ubdVar;
    }

    private CognitoUserPoolTokens$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        p8g p8gVar = p8g.f39602a;
        return new dc9[]{sm1.m48521p(p8gVar), sm1.m48521p(p8gVar), sm1.m48521p(p8gVar), sm1.m48521p(qla.f42120a)};
    }

    @Override // p001o.bn5
    public CognitoUserPoolTokens deserialize(w75 w75Var) {
        int i;
        String str;
        String str2;
        String str3;
        Long l;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        String str4 = null;
        if (jo3VarMo20420b.mo17245n()) {
            p8g p8gVar = p8g.f39602a;
            String str5 = (String) jo3VarMo20420b.mo17244m(descriptor2, 0, p8gVar, null);
            String str6 = (String) jo3VarMo20420b.mo17244m(descriptor2, 1, p8gVar, null);
            str3 = (String) jo3VarMo20420b.mo17244m(descriptor2, 2, p8gVar, null);
            l = (Long) jo3VarMo20420b.mo17244m(descriptor2, 3, qla.f42120a, null);
            i = 15;
            str2 = str6;
            str = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            String str7 = null;
            String str8 = null;
            Long l2 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    str4 = (String) jo3VarMo20420b.mo17244m(descriptor2, 0, p8g.f39602a, str4);
                    i2 |= 1;
                } else if (iMo16814k == 1) {
                    str7 = (String) jo3VarMo20420b.mo17244m(descriptor2, 1, p8g.f39602a, str7);
                    i2 |= 2;
                } else if (iMo16814k == 2) {
                    str8 = (String) jo3VarMo20420b.mo17244m(descriptor2, 2, p8g.f39602a, str8);
                    i2 |= 4;
                } else {
                    if (iMo16814k != 3) {
                        throw new i4i(iMo16814k);
                    }
                    l2 = (Long) jo3VarMo20420b.mo17244m(descriptor2, 3, qla.f42120a, l2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str7;
            str3 = str8;
            l = l2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new CognitoUserPoolTokens(i, str, str2, str3, l, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, CognitoUserPoolTokens cognitoUserPoolTokens) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(cognitoUserPoolTokens, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        CognitoUserPoolTokens.write$Self(cognitoUserPoolTokens, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

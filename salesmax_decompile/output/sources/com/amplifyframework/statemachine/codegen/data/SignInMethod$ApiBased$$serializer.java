package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import p001o.dc9;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.lo3;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class SignInMethod$ApiBased$$serializer implements yn7 {
    public static final SignInMethod$ApiBased$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        SignInMethod$ApiBased$$serializer signInMethod$ApiBased$$serializer = new SignInMethod$ApiBased$$serializer();
        INSTANCE = signInMethod$ApiBased$$serializer;
        ubd ubdVar = new ubd("SignInMethod.ApiBased", signInMethod$ApiBased$$serializer, 1);
        ubdVar.m51338k("authType", false);
        descriptor = ubdVar;
    }

    private SignInMethod$ApiBased$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{SignInMethod.ApiBased.$childSerializers[0]};
    }

    @Override // p001o.bn5
    public SignInMethod.ApiBased deserialize(w75 w75Var) {
        SignInMethod.ApiBased.AuthType authType;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = SignInMethod.ApiBased.$childSerializers;
        int i = 1;
        if (jo3VarMo20420b.mo17245n()) {
            authType = (SignInMethod.ApiBased.AuthType) jo3VarMo20420b.mo17252u(descriptor2, 0, dc9VarArr[0], null);
        } else {
            int i2 = 0;
            SignInMethod.ApiBased.AuthType authType2 = null;
            while (i != 0) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    i = 0;
                } else {
                    if (iMo16814k != 0) {
                        throw new i4i(iMo16814k);
                    }
                    authType2 = (SignInMethod.ApiBased.AuthType) jo3VarMo20420b.mo17252u(descriptor2, 0, dc9VarArr[0], authType2);
                    i2 |= 1;
                }
            }
            authType = authType2;
            i = i2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new SignInMethod.ApiBased(i, authType, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, SignInMethod.ApiBased apiBased) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(apiBased, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        SignInMethod.ApiBased.write$Self(apiBased, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

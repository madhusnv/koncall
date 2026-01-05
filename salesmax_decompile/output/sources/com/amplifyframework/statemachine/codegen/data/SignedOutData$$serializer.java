package com.amplifyframework.statemachine.codegen.data;

import p001o.dc9;
import p001o.fff;
import p001o.h76;
import p001o.hk1;
import p001o.i4i;
import p001o.jo3;
import p001o.lo3;
import p001o.p8g;
import p001o.sm1;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class SignedOutData$$serializer implements yn7 {
    public static final SignedOutData$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        SignedOutData$$serializer signedOutData$$serializer = new SignedOutData$$serializer();
        INSTANCE = signedOutData$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.statemachine.codegen.data.SignedOutData", signedOutData$$serializer, 2);
        ubdVar.m51338k("lastKnownUsername", true);
        ubdVar.m51338k("hasError", true);
        descriptor = ubdVar;
    }

    private SignedOutData$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{sm1.m48521p(p8g.f39602a), hk1.f27067a};
    }

    @Override // p001o.bn5
    public SignedOutData deserialize(w75 w75Var) {
        String str;
        boolean zMo17253v;
        int i;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        if (jo3VarMo20420b.mo17245n()) {
            str = (String) jo3VarMo20420b.mo17244m(descriptor2, 0, p8g.f39602a, null);
            zMo17253v = jo3VarMo20420b.mo17253v(descriptor2, 1);
            i = 3;
        } else {
            boolean z = true;
            boolean zMo17253v2 = false;
            int i2 = 0;
            str = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    str = (String) jo3VarMo20420b.mo17244m(descriptor2, 0, p8g.f39602a, str);
                    i2 |= 1;
                } else {
                    if (iMo16814k != 1) {
                        throw new i4i(iMo16814k);
                    }
                    zMo17253v2 = jo3VarMo20420b.mo17253v(descriptor2, 1);
                    i2 |= 2;
                }
            }
            zMo17253v = zMo17253v2;
            i = i2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new SignedOutData(i, str, zMo17253v, (fff) null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, SignedOutData signedOutData) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(signedOutData, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        SignedOutData.write$Self(signedOutData, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
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
public final class AmplifyCredential$IdentityPool$$serializer implements yn7 {
    public static final AmplifyCredential$IdentityPool$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AmplifyCredential$IdentityPool$$serializer amplifyCredential$IdentityPool$$serializer = new AmplifyCredential$IdentityPool$$serializer();
        INSTANCE = amplifyCredential$IdentityPool$$serializer;
        ubd ubdVar = new ubd("identityPool", amplifyCredential$IdentityPool$$serializer, 2);
        ubdVar.m51338k("identityId", false);
        ubdVar.m51338k("credentials", false);
        descriptor = ubdVar;
    }

    private AmplifyCredential$IdentityPool$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{p8g.f39602a, AWSCredentials$$serializer.INSTANCE};
    }

    @Override // p001o.bn5
    public AmplifyCredential.IdentityPool deserialize(w75 w75Var) {
        String strMo17247p;
        AWSCredentials aWSCredentials;
        int i;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        if (jo3VarMo20420b.mo17245n()) {
            strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 0);
            aWSCredentials = (AWSCredentials) jo3VarMo20420b.mo17252u(descriptor2, 1, AWSCredentials$$serializer.INSTANCE, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            strMo17247p = null;
            AWSCredentials aWSCredentials2 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (iMo16814k != 1) {
                        throw new i4i(iMo16814k);
                    }
                    aWSCredentials2 = (AWSCredentials) jo3VarMo20420b.mo17252u(descriptor2, 1, AWSCredentials$$serializer.INSTANCE, aWSCredentials2);
                    i2 |= 2;
                }
            }
            aWSCredentials = aWSCredentials2;
            i = i2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AmplifyCredential.IdentityPool(i, strMo17247p, aWSCredentials, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AmplifyCredential.IdentityPool identityPool) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(identityPool, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AmplifyCredential.IdentityPool.write$Self(identityPool, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

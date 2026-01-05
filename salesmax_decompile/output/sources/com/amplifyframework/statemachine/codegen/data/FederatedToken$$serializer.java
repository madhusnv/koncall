package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import p001o.dc9;
import p001o.fff;
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
public final class FederatedToken$$serializer implements yn7 {
    public static final FederatedToken$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        FederatedToken$$serializer federatedToken$$serializer = new FederatedToken$$serializer();
        INSTANCE = federatedToken$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.statemachine.codegen.data.FederatedToken", federatedToken$$serializer, 2);
        ubdVar.m51338k(AWSCognitoLegacyCredentialStore.TOKEN_KEY, false);
        ubdVar.m51338k("providerName", false);
        descriptor = ubdVar;
    }

    private FederatedToken$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        p8g p8gVar = p8g.f39602a;
        return new dc9[]{p8gVar, p8gVar};
    }

    @Override // p001o.bn5
    public FederatedToken deserialize(w75 w75Var) {
        String strMo17247p;
        String strMo17247p2;
        int i;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        fff fffVar = null;
        if (jo3VarMo20420b.mo17245n()) {
            strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 0);
            strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            strMo17247p = null;
            String strMo17247p3 = null;
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
                    strMo17247p3 = jo3VarMo20420b.mo17247p(descriptor2, 1);
                    i2 |= 2;
                }
            }
            strMo17247p2 = strMo17247p3;
            i = i2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new FederatedToken(i, strMo17247p, strMo17247p2, fffVar);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, FederatedToken federatedToken) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(federatedToken, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        FederatedToken.write$Self(federatedToken, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

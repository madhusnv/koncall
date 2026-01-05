package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import p001o.dc9;
import p001o.h76;
import p001o.hk1;
import p001o.i4i;
import p001o.jo3;
import p001o.ll8;
import p001o.lo3;
import p001o.sm1;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer implements yn7 {
    public static final AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer amplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer = new AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Auth.PasswordPolicy", amplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer, 5);
        ubdVar.m51338k("minLength", false);
        ubdVar.m51338k("requireNumbers", false);
        ubdVar.m51338k("requireLowercase", false);
        ubdVar.m51338k("requireUppercase", false);
        ubdVar.m51338k("requireSymbols", false);
        descriptor = ubdVar;
    }

    private AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        hk1 hk1Var = hk1.f27067a;
        return new dc9[]{sm1.m48521p(ll8.f34006a), sm1.m48521p(hk1Var), sm1.m48521p(hk1Var), sm1.m48521p(hk1Var), sm1.m48521p(hk1Var)};
    }

    @Override // p001o.bn5
    public AmplifyOutputsDataImpl.Auth.PasswordPolicy deserialize(w75 w75Var) {
        int i;
        Integer num;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        Integer num2 = null;
        if (jo3VarMo20420b.mo17245n()) {
            Integer num3 = (Integer) jo3VarMo20420b.mo17244m(descriptor2, 0, ll8.f34006a, null);
            hk1 hk1Var = hk1.f27067a;
            Boolean bool5 = (Boolean) jo3VarMo20420b.mo17244m(descriptor2, 1, hk1Var, null);
            Boolean bool6 = (Boolean) jo3VarMo20420b.mo17244m(descriptor2, 2, hk1Var, null);
            num = num3;
            bool3 = (Boolean) jo3VarMo20420b.mo17244m(descriptor2, 3, hk1Var, null);
            bool4 = (Boolean) jo3VarMo20420b.mo17244m(descriptor2, 4, hk1Var, null);
            bool2 = bool6;
            bool = bool5;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    num2 = (Integer) jo3VarMo20420b.mo17244m(descriptor2, 0, ll8.f34006a, num2);
                    i2 |= 1;
                } else if (iMo16814k == 1) {
                    bool7 = (Boolean) jo3VarMo20420b.mo17244m(descriptor2, 1, hk1.f27067a, bool7);
                    i2 |= 2;
                } else if (iMo16814k == 2) {
                    bool8 = (Boolean) jo3VarMo20420b.mo17244m(descriptor2, 2, hk1.f27067a, bool8);
                    i2 |= 4;
                } else if (iMo16814k == 3) {
                    bool9 = (Boolean) jo3VarMo20420b.mo17244m(descriptor2, 3, hk1.f27067a, bool9);
                    i2 |= 8;
                } else {
                    if (iMo16814k != 4) {
                        throw new i4i(iMo16814k);
                    }
                    bool10 = (Boolean) jo3VarMo20420b.mo17244m(descriptor2, 4, hk1.f27067a, bool10);
                    i2 |= 16;
                }
            }
            i = i2;
            num = num2;
            bool = bool7;
            bool2 = bool8;
            bool3 = bool9;
            bool4 = bool10;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AmplifyOutputsDataImpl.Auth.PasswordPolicy(i, num, bool, bool2, bool3, bool4, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AmplifyOutputsDataImpl.Auth.PasswordPolicy passwordPolicy) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(passwordPolicy, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AmplifyOutputsDataImpl.Auth.PasswordPolicy.write$Self(passwordPolicy, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

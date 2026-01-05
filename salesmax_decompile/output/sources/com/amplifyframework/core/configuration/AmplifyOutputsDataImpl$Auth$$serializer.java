package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import java.util.List;
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
public final class AmplifyOutputsDataImpl$Auth$$serializer implements yn7 {
    public static final AmplifyOutputsDataImpl$Auth$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AmplifyOutputsDataImpl$Auth$$serializer amplifyOutputsDataImpl$Auth$$serializer = new AmplifyOutputsDataImpl$Auth$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Auth$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Auth", amplifyOutputsDataImpl$Auth$$serializer, 12);
        ubdVar.m51338k("awsRegion", false);
        ubdVar.m51338k("userPoolId", false);
        ubdVar.m51338k("userPoolClientId", false);
        ubdVar.m51338k("identityPoolId", false);
        ubdVar.m51338k("passwordPolicy", false);
        ubdVar.m51338k("oauth", false);
        ubdVar.m51338k("standardRequiredAttributes", true);
        ubdVar.m51338k("usernameAttributes", true);
        ubdVar.m51338k("userVerificationTypes", true);
        ubdVar.m51338k("unauthenticatedIdentitiesEnabled", true);
        ubdVar.m51338k("mfaConfiguration", false);
        ubdVar.m51338k("mfaMethods", true);
        descriptor = ubdVar;
    }

    private AmplifyOutputsDataImpl$Auth$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        dc9[] dc9VarArr = AmplifyOutputsDataImpl.Auth.$childSerializers;
        p8g p8gVar = p8g.f39602a;
        return new dc9[]{p8gVar, p8gVar, p8gVar, sm1.m48521p(p8gVar), sm1.m48521p(AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE), sm1.m48521p(AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE), dc9VarArr[6], dc9VarArr[7], dc9VarArr[8], hk1.f27067a, sm1.m48521p(dc9VarArr[10]), dc9VarArr[11]};
    }

    @Override // p001o.bn5
    public AmplifyOutputsDataImpl.Auth deserialize(w75 w75Var) {
        String str;
        List list;
        AmplifyOutputsDataImpl.Auth.Oauth oauth;
        int i;
        List list2;
        List list3;
        String str2;
        boolean z;
        String str3;
        List list4;
        AmplifyOutputsDataImpl.Auth.PasswordPolicy passwordPolicy;
        String str4;
        AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = AmplifyOutputsDataImpl.Auth.$childSerializers;
        int i2 = 0;
        if (jo3VarMo20420b.mo17245n()) {
            String strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 0);
            String strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 1);
            String strMo17247p3 = jo3VarMo20420b.mo17247p(descriptor2, 2);
            String str5 = (String) jo3VarMo20420b.mo17244m(descriptor2, 3, p8g.f39602a, null);
            AmplifyOutputsDataImpl.Auth.PasswordPolicy passwordPolicy2 = (AmplifyOutputsDataImpl.Auth.PasswordPolicy) jo3VarMo20420b.mo17244m(descriptor2, 4, AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE, null);
            AmplifyOutputsDataImpl.Auth.Oauth oauth2 = (AmplifyOutputsDataImpl.Auth.Oauth) jo3VarMo20420b.mo17244m(descriptor2, 5, AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE, null);
            List list5 = (List) jo3VarMo20420b.mo17252u(descriptor2, 6, dc9VarArr[6], null);
            List list6 = (List) jo3VarMo20420b.mo17252u(descriptor2, 7, dc9VarArr[7], null);
            List list7 = (List) jo3VarMo20420b.mo17252u(descriptor2, 8, dc9VarArr[8], null);
            boolean zMo17253v = jo3VarMo20420b.mo17253v(descriptor2, 9);
            AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration2 = (AmplifyOutputsData.Auth.MfaConfiguration) jo3VarMo20420b.mo17244m(descriptor2, 10, dc9VarArr[10], null);
            list4 = (List) jo3VarMo20420b.mo17252u(descriptor2, 11, dc9VarArr[11], null);
            z = zMo17253v;
            mfaConfiguration = mfaConfiguration2;
            list2 = list7;
            str = str5;
            i = 4095;
            list3 = list5;
            oauth = oauth2;
            str3 = strMo17247p3;
            str4 = strMo17247p2;
            list = list6;
            passwordPolicy = passwordPolicy2;
            str2 = strMo17247p;
        } else {
            int i3 = 11;
            List list8 = null;
            AmplifyOutputsDataImpl.Auth.Oauth oauth3 = null;
            List list9 = null;
            AmplifyOutputsDataImpl.Auth.PasswordPolicy passwordPolicy3 = null;
            AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration3 = null;
            List list10 = null;
            List list11 = null;
            String strMo17247p4 = null;
            String strMo17247p5 = null;
            String strMo17247p6 = null;
            boolean z2 = true;
            String str6 = null;
            boolean zMo17253v2 = false;
            while (z2) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                switch (iMo16814k) {
                    case -1:
                        z2 = false;
                        i3 = 11;
                    case 0:
                        strMo17247p4 = jo3VarMo20420b.mo17247p(descriptor2, 0);
                        i2 |= 1;
                        i3 = 11;
                    case 1:
                        strMo17247p5 = jo3VarMo20420b.mo17247p(descriptor2, 1);
                        i2 |= 2;
                        i3 = 11;
                    case 2:
                        strMo17247p6 = jo3VarMo20420b.mo17247p(descriptor2, 2);
                        i2 |= 4;
                        i3 = 11;
                    case 3:
                        str6 = (String) jo3VarMo20420b.mo17244m(descriptor2, 3, p8g.f39602a, str6);
                        i2 |= 8;
                        i3 = 11;
                    case 4:
                        passwordPolicy3 = (AmplifyOutputsDataImpl.Auth.PasswordPolicy) jo3VarMo20420b.mo17244m(descriptor2, 4, AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE, passwordPolicy3);
                        i2 |= 16;
                        i3 = 11;
                    case 5:
                        oauth3 = (AmplifyOutputsDataImpl.Auth.Oauth) jo3VarMo20420b.mo17244m(descriptor2, 5, AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE, oauth3);
                        i2 |= 32;
                        i3 = 11;
                    case 6:
                        list9 = (List) jo3VarMo20420b.mo17252u(descriptor2, 6, dc9VarArr[6], list9);
                        i2 |= 64;
                        i3 = 11;
                    case 7:
                        list8 = (List) jo3VarMo20420b.mo17252u(descriptor2, 7, dc9VarArr[7], list8);
                        i2 |= 128;
                        i3 = 11;
                    case 8:
                        list10 = (List) jo3VarMo20420b.mo17252u(descriptor2, 8, dc9VarArr[8], list10);
                        i2 |= 256;
                        i3 = 11;
                    case 9:
                        zMo17253v2 = jo3VarMo20420b.mo17253v(descriptor2, 9);
                        i2 |= 512;
                    case 10:
                        mfaConfiguration3 = (AmplifyOutputsData.Auth.MfaConfiguration) jo3VarMo20420b.mo17244m(descriptor2, 10, dc9VarArr[10], mfaConfiguration3);
                        i2 |= 1024;
                    case 11:
                        list11 = (List) jo3VarMo20420b.mo17252u(descriptor2, i3, dc9VarArr[i3], list11);
                        i2 |= 2048;
                    default:
                        throw new i4i(iMo16814k);
                }
            }
            str = str6;
            list = list8;
            List list12 = list10;
            oauth = oauth3;
            i = i2;
            list2 = list12;
            List list13 = list11;
            list3 = list9;
            str2 = strMo17247p4;
            z = zMo17253v2;
            str3 = strMo17247p6;
            list4 = list13;
            AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration4 = mfaConfiguration3;
            passwordPolicy = passwordPolicy3;
            str4 = strMo17247p5;
            mfaConfiguration = mfaConfiguration4;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AmplifyOutputsDataImpl.Auth(i, str2, str4, str3, str, passwordPolicy, oauth, list3, list, list2, z, mfaConfiguration, list4, (fff) null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AmplifyOutputsDataImpl.Auth auth) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(auth, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AmplifyOutputsDataImpl.Auth.write$Self(auth, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

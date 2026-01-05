package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
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
public final class AmplifyOutputsDataImpl$Auth$Oauth$$serializer implements yn7 {
    public static final AmplifyOutputsDataImpl$Auth$Oauth$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AmplifyOutputsDataImpl$Auth$Oauth$$serializer amplifyOutputsDataImpl$Auth$Oauth$$serializer = new AmplifyOutputsDataImpl$Auth$Oauth$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Auth$Oauth$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Auth.Oauth", amplifyOutputsDataImpl$Auth$Oauth$$serializer, 6);
        ubdVar.m51338k("identityProviders", false);
        ubdVar.m51338k(ClientCookie.DOMAIN_ATTR, false);
        ubdVar.m51338k("scopes", false);
        ubdVar.m51338k("redirectSignInUri", false);
        ubdVar.m51338k("redirectSignOutUri", false);
        ubdVar.m51338k("responseType", false);
        descriptor = ubdVar;
    }

    private AmplifyOutputsDataImpl$Auth$Oauth$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        dc9[] dc9VarArr = AmplifyOutputsDataImpl.Auth.Oauth.$childSerializers;
        return new dc9[]{dc9VarArr[0], p8g.f39602a, dc9VarArr[2], dc9VarArr[3], dc9VarArr[4], dc9VarArr[5]};
    }

    @Override // p001o.bn5
    public AmplifyOutputsDataImpl.Auth.Oauth deserialize(w75 w75Var) {
        List list;
        AmplifyOutputsData.Auth.Oauth.ResponseType responseType;
        List list2;
        List list3;
        List list4;
        String str;
        int i;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = AmplifyOutputsDataImpl.Auth.Oauth.$childSerializers;
        int i2 = 5;
        List list5 = null;
        if (jo3VarMo20420b.mo17245n()) {
            List list6 = (List) jo3VarMo20420b.mo17252u(descriptor2, 0, dc9VarArr[0], null);
            String strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 1);
            List list7 = (List) jo3VarMo20420b.mo17252u(descriptor2, 2, dc9VarArr[2], null);
            List list8 = (List) jo3VarMo20420b.mo17252u(descriptor2, 3, dc9VarArr[3], null);
            List list9 = (List) jo3VarMo20420b.mo17252u(descriptor2, 4, dc9VarArr[4], null);
            responseType = (AmplifyOutputsData.Auth.Oauth.ResponseType) jo3VarMo20420b.mo17252u(descriptor2, 5, dc9VarArr[5], null);
            list4 = list6;
            i = 63;
            list3 = list8;
            list = list9;
            list2 = list7;
            str = strMo17247p;
        } else {
            boolean z = true;
            int i3 = 0;
            String strMo17247p2 = null;
            List list10 = null;
            List list11 = null;
            List list12 = null;
            AmplifyOutputsData.Auth.Oauth.ResponseType responseType2 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                switch (iMo16814k) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        list5 = (List) jo3VarMo20420b.mo17252u(descriptor2, 0, dc9VarArr[0], list5);
                        i3 |= 1;
                        i2 = 5;
                        continue;
                    case 1:
                        strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        list10 = (List) jo3VarMo20420b.mo17252u(descriptor2, 2, dc9VarArr[2], list10);
                        i3 |= 4;
                        break;
                    case 3:
                        list11 = (List) jo3VarMo20420b.mo17252u(descriptor2, 3, dc9VarArr[3], list11);
                        i3 |= 8;
                        break;
                    case 4:
                        list12 = (List) jo3VarMo20420b.mo17252u(descriptor2, 4, dc9VarArr[4], list12);
                        i3 |= 16;
                        break;
                    case 5:
                        responseType2 = (AmplifyOutputsData.Auth.Oauth.ResponseType) jo3VarMo20420b.mo17252u(descriptor2, i2, dc9VarArr[i2], responseType2);
                        i3 |= 32;
                        break;
                    default:
                        throw new i4i(iMo16814k);
                }
            }
            list = list12;
            responseType = responseType2;
            list2 = list10;
            list3 = list11;
            list4 = list5;
            str = strMo17247p2;
            i = i3;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AmplifyOutputsDataImpl.Auth.Oauth(i, list4, str, list2, list3, list, responseType, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AmplifyOutputsDataImpl.Auth.Oauth oauth) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(oauth, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AmplifyOutputsDataImpl.Auth.Oauth.write$Self(oauth, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

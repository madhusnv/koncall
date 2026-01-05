package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import p001o.dc9;
import p001o.h76;
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
public final class AmplifyOutputsDataImpl$Data$$serializer implements yn7 {
    public static final AmplifyOutputsDataImpl$Data$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AmplifyOutputsDataImpl$Data$$serializer amplifyOutputsDataImpl$Data$$serializer = new AmplifyOutputsDataImpl$Data$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Data$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Data", amplifyOutputsDataImpl$Data$$serializer, 5);
        ubdVar.m51338k("awsRegion", false);
        ubdVar.m51338k(ImagesContract.URL, false);
        ubdVar.m51338k("apiKey", false);
        ubdVar.m51338k("defaultAuthorizationType", false);
        ubdVar.m51338k("authorizationTypes", false);
        descriptor = ubdVar;
    }

    private AmplifyOutputsDataImpl$Data$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        dc9[] dc9VarArr = AmplifyOutputsDataImpl.Data.$childSerializers;
        p8g p8gVar = p8g.f39602a;
        return new dc9[]{p8gVar, p8gVar, sm1.m48521p(p8gVar), dc9VarArr[3], dc9VarArr[4]};
    }

    @Override // p001o.bn5
    public AmplifyOutputsDataImpl.Data deserialize(w75 w75Var) {
        int i;
        String str;
        String str2;
        String str3;
        AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType;
        List list;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = AmplifyOutputsDataImpl.Data.$childSerializers;
        String strMo17247p = null;
        if (jo3VarMo20420b.mo17245n()) {
            String strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 0);
            String strMo17247p3 = jo3VarMo20420b.mo17247p(descriptor2, 1);
            String str4 = (String) jo3VarMo20420b.mo17244m(descriptor2, 2, p8g.f39602a, null);
            AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType2 = (AmplifyOutputsData.AwsAppsyncAuthorizationType) jo3VarMo20420b.mo17252u(descriptor2, 3, dc9VarArr[3], null);
            list = (List) jo3VarMo20420b.mo17252u(descriptor2, 4, dc9VarArr[4], null);
            str = strMo17247p2;
            str3 = str4;
            awsAppsyncAuthorizationType = awsAppsyncAuthorizationType2;
            i = 31;
            str2 = strMo17247p3;
        } else {
            boolean z = true;
            int i2 = 0;
            String strMo17247p4 = null;
            String str5 = null;
            AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType3 = null;
            List list2 = null;
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
                    str5 = (String) jo3VarMo20420b.mo17244m(descriptor2, 2, p8g.f39602a, str5);
                    i2 |= 4;
                } else if (iMo16814k == 3) {
                    awsAppsyncAuthorizationType3 = (AmplifyOutputsData.AwsAppsyncAuthorizationType) jo3VarMo20420b.mo17252u(descriptor2, 3, dc9VarArr[3], awsAppsyncAuthorizationType3);
                    i2 |= 8;
                } else {
                    if (iMo16814k != 4) {
                        throw new i4i(iMo16814k);
                    }
                    list2 = (List) jo3VarMo20420b.mo17252u(descriptor2, 4, dc9VarArr[4], list2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = strMo17247p;
            str2 = strMo17247p4;
            str3 = str5;
            awsAppsyncAuthorizationType = awsAppsyncAuthorizationType3;
            list = list2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AmplifyOutputsDataImpl.Data(i, str, str2, str3, awsAppsyncAuthorizationType, list, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AmplifyOutputsDataImpl.Data data) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(data, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AmplifyOutputsDataImpl.Data.write$Self(data, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

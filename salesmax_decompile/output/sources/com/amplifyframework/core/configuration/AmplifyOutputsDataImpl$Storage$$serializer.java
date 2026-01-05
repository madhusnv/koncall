package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import java.util.List;
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
public final class AmplifyOutputsDataImpl$Storage$$serializer implements yn7 {
    public static final AmplifyOutputsDataImpl$Storage$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AmplifyOutputsDataImpl$Storage$$serializer amplifyOutputsDataImpl$Storage$$serializer = new AmplifyOutputsDataImpl$Storage$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Storage$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Storage", amplifyOutputsDataImpl$Storage$$serializer, 3);
        ubdVar.m51338k("awsRegion", false);
        ubdVar.m51338k("bucketName", false);
        ubdVar.m51338k("buckets", true);
        descriptor = ubdVar;
    }

    private AmplifyOutputsDataImpl$Storage$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        dc9[] dc9VarArr = AmplifyOutputsDataImpl.Storage.$childSerializers;
        p8g p8gVar = p8g.f39602a;
        return new dc9[]{p8gVar, p8gVar, dc9VarArr[2]};
    }

    @Override // p001o.bn5
    public AmplifyOutputsDataImpl.Storage deserialize(w75 w75Var) {
        int i;
        String str;
        String str2;
        List list;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = AmplifyOutputsDataImpl.Storage.$childSerializers;
        String strMo17247p = null;
        if (jo3VarMo20420b.mo17245n()) {
            String strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 0);
            String strMo17247p3 = jo3VarMo20420b.mo17247p(descriptor2, 1);
            list = (List) jo3VarMo20420b.mo17252u(descriptor2, 2, dc9VarArr[2], null);
            str = strMo17247p2;
            i = 7;
            str2 = strMo17247p3;
        } else {
            boolean z = true;
            int i2 = 0;
            String strMo17247p4 = null;
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
                } else {
                    if (iMo16814k != 2) {
                        throw new i4i(iMo16814k);
                    }
                    list2 = (List) jo3VarMo20420b.mo17252u(descriptor2, 2, dc9VarArr[2], list2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = strMo17247p;
            str2 = strMo17247p4;
            list = list2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AmplifyOutputsDataImpl.Storage(i, str, str2, list, (fff) null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AmplifyOutputsDataImpl.Storage storage) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(storage, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AmplifyOutputsDataImpl.Storage.write$Self(storage, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

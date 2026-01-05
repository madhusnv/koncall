package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import p001o.dc9;
import p001o.fff;
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
public final class DeviceMetadata$Metadata$$serializer implements yn7 {
    public static final DeviceMetadata$Metadata$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        DeviceMetadata$Metadata$$serializer deviceMetadata$Metadata$$serializer = new DeviceMetadata$Metadata$$serializer();
        INSTANCE = deviceMetadata$Metadata$$serializer;
        ubd ubdVar = new ubd("metadata", deviceMetadata$Metadata$$serializer, 3);
        ubdVar.m51338k("deviceKey", false);
        ubdVar.m51338k("deviceGroupKey", false);
        ubdVar.m51338k("deviceSecret", true);
        descriptor = ubdVar;
    }

    private DeviceMetadata$Metadata$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        p8g p8gVar = p8g.f39602a;
        return new dc9[]{p8gVar, p8gVar, sm1.m48521p(p8gVar)};
    }

    @Override // p001o.bn5
    public DeviceMetadata.Metadata deserialize(w75 w75Var) {
        int i;
        String str;
        String str2;
        String str3;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        String strMo17247p = null;
        if (jo3VarMo20420b.mo17245n()) {
            String strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 0);
            String strMo17247p3 = jo3VarMo20420b.mo17247p(descriptor2, 1);
            str = strMo17247p2;
            str3 = (String) jo3VarMo20420b.mo17244m(descriptor2, 2, p8g.f39602a, null);
            str2 = strMo17247p3;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String strMo17247p4 = null;
            String str4 = null;
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
                    str4 = (String) jo3VarMo20420b.mo17244m(descriptor2, 2, p8g.f39602a, str4);
                    i2 |= 4;
                }
            }
            i = i2;
            str = strMo17247p;
            str2 = strMo17247p4;
            str3 = str4;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new DeviceMetadata.Metadata(i, str, str2, str3, (fff) null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, DeviceMetadata.Metadata metadata) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(metadata, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        DeviceMetadata.Metadata.write$Self(metadata, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

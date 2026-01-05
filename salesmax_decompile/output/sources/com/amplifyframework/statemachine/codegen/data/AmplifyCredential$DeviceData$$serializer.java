package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
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
public final class AmplifyCredential$DeviceData$$serializer implements yn7 {
    public static final AmplifyCredential$DeviceData$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AmplifyCredential$DeviceData$$serializer amplifyCredential$DeviceData$$serializer = new AmplifyCredential$DeviceData$$serializer();
        INSTANCE = amplifyCredential$DeviceData$$serializer;
        ubd ubdVar = new ubd("deviceMetadata", amplifyCredential$DeviceData$$serializer, 1);
        ubdVar.m51338k("deviceMetadata", false);
        descriptor = ubdVar;
    }

    private AmplifyCredential$DeviceData$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{AmplifyCredential.DeviceData.$childSerializers[0]};
    }

    @Override // p001o.bn5
    public AmplifyCredential.DeviceData deserialize(w75 w75Var) {
        DeviceMetadata deviceMetadata;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = AmplifyCredential.DeviceData.$childSerializers;
        int i = 1;
        if (jo3VarMo20420b.mo17245n()) {
            deviceMetadata = (DeviceMetadata) jo3VarMo20420b.mo17252u(descriptor2, 0, dc9VarArr[0], null);
        } else {
            int i2 = 0;
            DeviceMetadata deviceMetadata2 = null;
            while (i != 0) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    i = 0;
                } else {
                    if (iMo16814k != 0) {
                        throw new i4i(iMo16814k);
                    }
                    deviceMetadata2 = (DeviceMetadata) jo3VarMo20420b.mo17252u(descriptor2, 0, dc9VarArr[0], deviceMetadata2);
                    i2 |= 1;
                }
            }
            deviceMetadata = deviceMetadata2;
            i = i2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AmplifyCredential.DeviceData(i, deviceMetadata, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AmplifyCredential.DeviceData deviceData) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(deviceData, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AmplifyCredential.DeviceData.write$Self(deviceData, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

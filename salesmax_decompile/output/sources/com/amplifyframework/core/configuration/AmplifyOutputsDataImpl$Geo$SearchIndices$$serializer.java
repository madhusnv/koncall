package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import java.util.Set;
import org.apache.http.client.config.CookieSpecs;
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
public final class AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer implements yn7 {
    public static final AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer amplifyOutputsDataImpl$Geo$SearchIndices$$serializer = new AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Geo$SearchIndices$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Geo.SearchIndices", amplifyOutputsDataImpl$Geo$SearchIndices$$serializer, 2);
        ubdVar.m51338k("items", false);
        ubdVar.m51338k(CookieSpecs.DEFAULT, false);
        descriptor = ubdVar;
    }

    private AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{AmplifyOutputsDataImpl.Geo.SearchIndices.$childSerializers[0], p8g.f39602a};
    }

    @Override // p001o.bn5
    public AmplifyOutputsDataImpl.Geo.SearchIndices deserialize(w75 w75Var) {
        Set set;
        String strMo17247p;
        int i;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = AmplifyOutputsDataImpl.Geo.SearchIndices.$childSerializers;
        if (jo3VarMo20420b.mo17245n()) {
            set = (Set) jo3VarMo20420b.mo17252u(descriptor2, 0, dc9VarArr[0], null);
            strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Set set2 = null;
            String strMo17247p2 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    set2 = (Set) jo3VarMo20420b.mo17252u(descriptor2, 0, dc9VarArr[0], set2);
                    i2 |= 1;
                } else {
                    if (iMo16814k != 1) {
                        throw new i4i(iMo16814k);
                    }
                    strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 1);
                    i2 |= 2;
                }
            }
            set = set2;
            strMo17247p = strMo17247p2;
            i = i2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AmplifyOutputsDataImpl.Geo.SearchIndices(i, set, strMo17247p, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AmplifyOutputsDataImpl.Geo.SearchIndices searchIndices) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(searchIndices, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AmplifyOutputsDataImpl.Geo.SearchIndices.write$Self(searchIndices, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

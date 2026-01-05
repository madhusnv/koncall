package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
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
public final class AmplifyOutputsDataImpl$Geo$$serializer implements yn7 {
    public static final AmplifyOutputsDataImpl$Geo$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AmplifyOutputsDataImpl$Geo$$serializer amplifyOutputsDataImpl$Geo$$serializer = new AmplifyOutputsDataImpl$Geo$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Geo$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Geo", amplifyOutputsDataImpl$Geo$$serializer, 4);
        ubdVar.m51338k("awsRegion", false);
        ubdVar.m51338k("maps", false);
        ubdVar.m51338k("searchIndices", false);
        ubdVar.m51338k("geofenceCollections", false);
        descriptor = ubdVar;
    }

    private AmplifyOutputsDataImpl$Geo$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{p8g.f39602a, sm1.m48521p(AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE), sm1.m48521p(AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE), sm1.m48521p(AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE)};
    }

    @Override // p001o.bn5
    public AmplifyOutputsDataImpl.Geo deserialize(w75 w75Var) {
        int i;
        String str;
        AmplifyOutputsDataImpl.Geo.Maps maps;
        AmplifyOutputsDataImpl.Geo.SearchIndices searchIndices;
        AmplifyOutputsDataImpl.Geo.GeofenceCollections geofenceCollections;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        String strMo17247p = null;
        if (jo3VarMo20420b.mo17245n()) {
            String strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 0);
            AmplifyOutputsDataImpl.Geo.Maps maps2 = (AmplifyOutputsDataImpl.Geo.Maps) jo3VarMo20420b.mo17244m(descriptor2, 1, AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE, null);
            AmplifyOutputsDataImpl.Geo.SearchIndices searchIndices2 = (AmplifyOutputsDataImpl.Geo.SearchIndices) jo3VarMo20420b.mo17244m(descriptor2, 2, AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE, null);
            str = strMo17247p2;
            geofenceCollections = (AmplifyOutputsDataImpl.Geo.GeofenceCollections) jo3VarMo20420b.mo17244m(descriptor2, 3, AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE, null);
            searchIndices = searchIndices2;
            maps = maps2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            AmplifyOutputsDataImpl.Geo.Maps maps3 = null;
            AmplifyOutputsDataImpl.Geo.SearchIndices searchIndices3 = null;
            AmplifyOutputsDataImpl.Geo.GeofenceCollections geofenceCollections2 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 0);
                    i2 |= 1;
                } else if (iMo16814k == 1) {
                    maps3 = (AmplifyOutputsDataImpl.Geo.Maps) jo3VarMo20420b.mo17244m(descriptor2, 1, AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE, maps3);
                    i2 |= 2;
                } else if (iMo16814k == 2) {
                    searchIndices3 = (AmplifyOutputsDataImpl.Geo.SearchIndices) jo3VarMo20420b.mo17244m(descriptor2, 2, AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE, searchIndices3);
                    i2 |= 4;
                } else {
                    if (iMo16814k != 3) {
                        throw new i4i(iMo16814k);
                    }
                    geofenceCollections2 = (AmplifyOutputsDataImpl.Geo.GeofenceCollections) jo3VarMo20420b.mo17244m(descriptor2, 3, AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE, geofenceCollections2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strMo17247p;
            maps = maps3;
            searchIndices = searchIndices3;
            geofenceCollections = geofenceCollections2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AmplifyOutputsDataImpl.Geo(i, str, maps, searchIndices, geofenceCollections, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AmplifyOutputsDataImpl.Geo geo) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(geo, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AmplifyOutputsDataImpl.Geo.write$Self(geo, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

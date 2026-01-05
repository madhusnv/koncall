package com.amplifyframework.statemachine.codegen.data;

import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.Map;
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
public final class SignUpData$$serializer implements yn7 {
    public static final SignUpData$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        SignUpData$$serializer signUpData$$serializer = new SignUpData$$serializer();
        INSTANCE = signUpData$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.statemachine.codegen.data.SignUpData", signUpData$$serializer, 5);
        ubdVar.m51338k("username", false);
        ubdVar.m51338k("validationData", true);
        ubdVar.m51338k("clientMetadata", true);
        ubdVar.m51338k(OutcomeEventsTable.COLUMN_NAME_SESSION, true);
        ubdVar.m51338k("userId", true);
        descriptor = ubdVar;
    }

    private SignUpData$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        dc9[] dc9VarArr = SignUpData.$childSerializers;
        p8g p8gVar = p8g.f39602a;
        return new dc9[]{p8gVar, sm1.m48521p(dc9VarArr[1]), sm1.m48521p(dc9VarArr[2]), sm1.m48521p(p8gVar), sm1.m48521p(p8gVar)};
    }

    @Override // p001o.bn5
    public SignUpData deserialize(w75 w75Var) {
        int i;
        String str;
        Map map;
        Map map2;
        String str2;
        String str3;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = SignUpData.$childSerializers;
        String strMo17247p = null;
        if (jo3VarMo20420b.mo17245n()) {
            String strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 0);
            Map map3 = (Map) jo3VarMo20420b.mo17244m(descriptor2, 1, dc9VarArr[1], null);
            Map map4 = (Map) jo3VarMo20420b.mo17244m(descriptor2, 2, dc9VarArr[2], null);
            p8g p8gVar = p8g.f39602a;
            map2 = map4;
            str = strMo17247p2;
            str2 = (String) jo3VarMo20420b.mo17244m(descriptor2, 3, p8gVar, null);
            str3 = (String) jo3VarMo20420b.mo17244m(descriptor2, 4, p8gVar, null);
            i = 31;
            map = map3;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map5 = null;
            Map map6 = null;
            String str4 = null;
            String str5 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 0);
                    i2 |= 1;
                } else if (iMo16814k == 1) {
                    map5 = (Map) jo3VarMo20420b.mo17244m(descriptor2, 1, dc9VarArr[1], map5);
                    i2 |= 2;
                } else if (iMo16814k == 2) {
                    map6 = (Map) jo3VarMo20420b.mo17244m(descriptor2, 2, dc9VarArr[2], map6);
                    i2 |= 4;
                } else if (iMo16814k == 3) {
                    str4 = (String) jo3VarMo20420b.mo17244m(descriptor2, 3, p8g.f39602a, str4);
                    i2 |= 8;
                } else {
                    if (iMo16814k != 4) {
                        throw new i4i(iMo16814k);
                    }
                    str5 = (String) jo3VarMo20420b.mo17244m(descriptor2, 4, p8g.f39602a, str5);
                    i2 |= 16;
                }
            }
            i = i2;
            str = strMo17247p;
            map = map5;
            map2 = map6;
            str2 = str4;
            str3 = str5;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new SignUpData(i, str, map, map2, str2, str3, (fff) null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, SignUpData signUpData) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(signUpData, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        SignUpData.write$Self(signUpData, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

package com.amplifyframework.statemachine.codegen.data;

import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.List;
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
public final class AuthChallenge$$serializer implements yn7 {
    public static final AuthChallenge$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AuthChallenge$$serializer authChallenge$$serializer = new AuthChallenge$$serializer();
        INSTANCE = authChallenge$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.statemachine.codegen.data.AuthChallenge", authChallenge$$serializer, 5);
        ubdVar.m51338k("challengeName", false);
        ubdVar.m51338k("username", true);
        ubdVar.m51338k(OutcomeEventsTable.COLUMN_NAME_SESSION, false);
        ubdVar.m51338k("parameters", false);
        ubdVar.m51338k("availableChallenges", true);
        descriptor = ubdVar;
    }

    private AuthChallenge$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        dc9[] dc9VarArr = AuthChallenge.$childSerializers;
        p8g p8gVar = p8g.f39602a;
        return new dc9[]{p8gVar, sm1.m48521p(p8gVar), sm1.m48521p(p8gVar), sm1.m48521p(dc9VarArr[3]), sm1.m48521p(dc9VarArr[4])};
    }

    @Override // p001o.bn5
    public AuthChallenge deserialize(w75 w75Var) {
        int i;
        String str;
        String str2;
        String str3;
        Map map;
        List list;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = AuthChallenge.$childSerializers;
        String strMo17247p = null;
        if (jo3VarMo20420b.mo17245n()) {
            String strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 0);
            p8g p8gVar = p8g.f39602a;
            String str4 = (String) jo3VarMo20420b.mo17244m(descriptor2, 1, p8gVar, null);
            String str5 = (String) jo3VarMo20420b.mo17244m(descriptor2, 2, p8gVar, null);
            Map map2 = (Map) jo3VarMo20420b.mo17244m(descriptor2, 3, dc9VarArr[3], null);
            list = (List) jo3VarMo20420b.mo17244m(descriptor2, 4, dc9VarArr[4], null);
            str = strMo17247p2;
            str3 = str5;
            map = map2;
            i = 31;
            str2 = str4;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            Map map3 = null;
            List list2 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 0);
                    i2 |= 1;
                } else if (iMo16814k == 1) {
                    str6 = (String) jo3VarMo20420b.mo17244m(descriptor2, 1, p8g.f39602a, str6);
                    i2 |= 2;
                } else if (iMo16814k == 2) {
                    str7 = (String) jo3VarMo20420b.mo17244m(descriptor2, 2, p8g.f39602a, str7);
                    i2 |= 4;
                } else if (iMo16814k == 3) {
                    map3 = (Map) jo3VarMo20420b.mo17244m(descriptor2, 3, dc9VarArr[3], map3);
                    i2 |= 8;
                } else {
                    if (iMo16814k != 4) {
                        throw new i4i(iMo16814k);
                    }
                    list2 = (List) jo3VarMo20420b.mo17244m(descriptor2, 4, dc9VarArr[4], list2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = strMo17247p;
            str2 = str6;
            str3 = str7;
            map = map3;
            list = list2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AuthChallenge(i, str, str2, str3, map, list, (fff) null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AuthChallenge authChallenge) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(authChallenge, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AuthChallenge.write$Self(authChallenge, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

package com.amplifyframework.auth.cognito.helpers;

import com.google.firebase.messaging.Constants;
import p001o.dc9;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.ll8;
import p001o.lo3;
import p001o.p8g;
import p001o.qla;
import p001o.sm1;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class FetchTokenResponse$$serializer implements yn7 {
    public static final FetchTokenResponse$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        FetchTokenResponse$$serializer fetchTokenResponse$$serializer = new FetchTokenResponse$$serializer();
        INSTANCE = fetchTokenResponse$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.auth.cognito.helpers.FetchTokenResponse", fetchTokenResponse$$serializer, 7);
        ubdVar.m51338k("access_token", true);
        ubdVar.m51338k("id_token", true);
        ubdVar.m51338k("refresh_token", true);
        ubdVar.m51338k("expires_in", true);
        ubdVar.m51338k(Constants.IPC_BUNDLE_KEY_SEND_ERROR, true);
        ubdVar.m51338k("error_description", true);
        ubdVar.m51338k("expiration", true);
        descriptor = ubdVar;
    }

    private FetchTokenResponse$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        p8g p8gVar = p8g.f39602a;
        return new dc9[]{sm1.m48521p(p8gVar), sm1.m48521p(p8gVar), sm1.m48521p(p8gVar), sm1.m48521p(ll8.f34006a), sm1.m48521p(p8gVar), sm1.m48521p(p8gVar), sm1.m48521p(qla.f42120a)};
    }

    @Override // p001o.bn5
    public FetchTokenResponse deserialize(w75 w75Var) {
        Long l;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        int i;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        int i2 = 6;
        String str6 = null;
        if (jo3VarMo20420b.mo17245n()) {
            p8g p8gVar = p8g.f39602a;
            String str7 = (String) jo3VarMo20420b.mo17244m(descriptor2, 0, p8gVar, null);
            String str8 = (String) jo3VarMo20420b.mo17244m(descriptor2, 1, p8gVar, null);
            String str9 = (String) jo3VarMo20420b.mo17244m(descriptor2, 2, p8gVar, null);
            Integer num2 = (Integer) jo3VarMo20420b.mo17244m(descriptor2, 3, ll8.f34006a, null);
            String str10 = (String) jo3VarMo20420b.mo17244m(descriptor2, 4, p8gVar, null);
            str = (String) jo3VarMo20420b.mo17244m(descriptor2, 5, p8gVar, null);
            l = (Long) jo3VarMo20420b.mo17244m(descriptor2, 6, qla.f42120a, null);
            i = 127;
            num = num2;
            str2 = str10;
            str3 = str9;
            str4 = str8;
            str5 = str7;
        } else {
            boolean z = true;
            int i3 = 0;
            Long l2 = null;
            String str11 = null;
            String str12 = null;
            Integer num3 = null;
            String str13 = null;
            String str14 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                switch (iMo16814k) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        str6 = (String) jo3VarMo20420b.mo17244m(descriptor2, 0, p8g.f39602a, str6);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        str11 = (String) jo3VarMo20420b.mo17244m(descriptor2, 1, p8g.f39602a, str11);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        str12 = (String) jo3VarMo20420b.mo17244m(descriptor2, 2, p8g.f39602a, str12);
                        i3 |= 4;
                    case 3:
                        num3 = (Integer) jo3VarMo20420b.mo17244m(descriptor2, 3, ll8.f34006a, num3);
                        i3 |= 8;
                    case 4:
                        str13 = (String) jo3VarMo20420b.mo17244m(descriptor2, 4, p8g.f39602a, str13);
                        i3 |= 16;
                    case 5:
                        str14 = (String) jo3VarMo20420b.mo17244m(descriptor2, 5, p8g.f39602a, str14);
                        i3 |= 32;
                    case 6:
                        l2 = (Long) jo3VarMo20420b.mo17244m(descriptor2, i2, qla.f42120a, l2);
                        i3 |= 64;
                    default:
                        throw new i4i(iMo16814k);
                }
            }
            l = l2;
            str = str14;
            str2 = str13;
            num = num3;
            str3 = str12;
            str4 = str11;
            str5 = str6;
            i = i3;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new FetchTokenResponse(i, str5, str4, str3, num, str2, str, l, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, FetchTokenResponse fetchTokenResponse) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(fetchTokenResponse, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        FetchTokenResponse.write$Self(fetchTokenResponse, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}

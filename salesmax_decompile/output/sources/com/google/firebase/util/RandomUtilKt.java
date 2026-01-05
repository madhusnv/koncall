package com.google.firebase.util;

import java.util.ArrayList;
import java.util.Iterator;
import p001o.bce;
import p001o.dh3;
import p001o.dl8;
import p001o.h9g;
import p001o.kh3;
import p001o.kl8;
import p001o.sq8;
import p001o.vbe;

/* loaded from: classes6.dex */
public final class RandomUtilKt {
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    public static final String nextAlphanumericString(vbe vbeVar, int i) {
        sq8.m48649h(vbeVar, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("invalid length: " + i).toString());
        }
        kl8 kl8VarM18616s = bce.m18616s(0, i);
        ArrayList arrayList = new ArrayList(dh3.m23088v(kl8VarM18616s, 10));
        Iterator it = kl8VarM18616s.iterator();
        while (it.hasNext()) {
            ((dl8) it).mo23412a();
            arrayList.add(Character.valueOf(h9g.j1(ALPHANUMERIC_ALPHABET, vbeVar)));
        }
        return kh3.p0(arrayList, "", null, null, 0, null, null, 62, null);
    }
}

package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.GenderBinaryType;
import p001o.sn7;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class GenderBinaryTypeAdapter {
    public static final GenderBinaryTypeAdapter INSTANCE = new GenderBinaryTypeAdapter();

    private GenderBinaryTypeAdapter() {
    }

    public static final GenderBinaryType fromRekognition(String str) {
        sq8.m48649h(str, "gender");
        sn7 sn7VarM48562a = sn7.f45667a.m48562a(str);
        return sq8.m48644c(sn7VarM48562a, sn7.C16875c.f45671c) ? GenderBinaryType.MALE : sq8.m48644c(sn7VarM48562a, sn7.C16874b.f45669c) ? GenderBinaryType.FEMALE : GenderBinaryType.UNKNOWN;
    }
}

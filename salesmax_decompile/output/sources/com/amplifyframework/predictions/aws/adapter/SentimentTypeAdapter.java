package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.SentimentType;
import p001o.gef;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SentimentTypeAdapter {
    public static final SentimentTypeAdapter INSTANCE = new SentimentTypeAdapter();

    private SentimentTypeAdapter() {
    }

    public static final SentimentType fromComprehend(String str) {
        sq8.m48649h(str, "sentiment");
        gef gefVarM28529a = gef.f25039a.m28529a(str);
        return sq8.m48644c(gefVarM28529a, gef.C13696e.f25047c) ? SentimentType.POSITIVE : sq8.m48644c(gefVarM28529a, gef.C13694c.f25043c) ? SentimentType.NEGATIVE : sq8.m48644c(gefVarM28529a, gef.C13695d.f25045c) ? SentimentType.NEUTRAL : sq8.m48644c(gefVarM28529a, gef.C13693b.f25041c) ? SentimentType.MIXED : SentimentType.UNKNOWN;
    }
}

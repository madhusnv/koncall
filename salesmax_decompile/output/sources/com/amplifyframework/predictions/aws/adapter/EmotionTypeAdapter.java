package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.EmotionType;
import p001o.sq8;
import p001o.y56;

/* loaded from: classes5.dex */
public final class EmotionTypeAdapter {
    public static final EmotionTypeAdapter INSTANCE = new EmotionTypeAdapter();

    private EmotionTypeAdapter() {
    }

    public static final EmotionType fromRekognition(String str) {
        sq8.m48649h(str, "emotion");
        y56 y56VarM57228a = y56.f54913a.m57228a(str);
        return sq8.m48644c(y56VarM57228a, y56.C18331g.f54925c) ? EmotionType.HAPPY : sq8.m48644c(y56VarM57228a, y56.C18332h.f54927c) ? EmotionType.SAD : sq8.m48644c(y56VarM57228a, y56.C18325a.f54915c) ? EmotionType.ANGRY : sq8.m48644c(y56VarM57228a, y56.C18328d.f54919c) ? EmotionType.CONFUSED : sq8.m48644c(y56VarM57228a, y56.C18329e.f54921c) ? EmotionType.DISGUSTED : sq8.m48644c(y56VarM57228a, y56.C18334j.f54930c) ? EmotionType.SURPRISED : sq8.m48644c(y56VarM57228a, y56.C18326b.f54917c) ? EmotionType.CALM : sq8.m48644c(y56VarM57228a, y56.C18330f.f54923c) ? EmotionType.FEAR : EmotionType.UNKNOWN;
    }
}

package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.SpeechType;
import p001o.sq8;
import p001o.tyc;

/* loaded from: classes5.dex */
public final class SpeechTypeAdapter {
    public static final SpeechTypeAdapter INSTANCE = new SpeechTypeAdapter();

    private SpeechTypeAdapter() {
    }

    public static final SpeechType fromComprehend(String str) {
        sq8.m48649h(str, "tag");
        tyc tycVarM50787a = tyc.f48050a.m50787a(str);
        return sq8.m48644c(tycVarM50787a, tyc.C17252a.f48052c) ? SpeechType.ADJECTIVE : sq8.m48644c(tycVarM50787a, tyc.C17253b.f48054c) ? SpeechType.ADPOSITION : sq8.m48644c(tycVarM50787a, tyc.C17254c.f48056c) ? SpeechType.ADVERB : sq8.m48644c(tycVarM50787a, tyc.C17255d.f48058c) ? SpeechType.AUXILIARY : sq8.m48644c(tycVarM50787a, tyc.C17256e.f48060c) ? SpeechType.COORDINATING_CONJUNCTION : sq8.m48644c(tycVarM50787a, tyc.C17259h.f48064c) ? SpeechType.DETERMINER : sq8.m48644c(tycVarM50787a, tyc.C17260i.f48066c) ? SpeechType.INTERJECTION : sq8.m48644c(tycVarM50787a, tyc.C17261j.f48068c) ? SpeechType.NOUN : sq8.m48644c(tycVarM50787a, tyc.C17262k.f48070c) ? SpeechType.NUMERAL : sq8.m48644c(tycVarM50787a, tyc.C17264m.f48074c) ? SpeechType.PARTICLE : sq8.m48644c(tycVarM50787a, tyc.C17265n.f48076c) ? SpeechType.PRONOUN : sq8.m48644c(tycVarM50787a, tyc.C17266o.f48078c) ? SpeechType.PROPER_NOUN : sq8.m48644c(tycVarM50787a, tyc.C17267p.f48080c) ? SpeechType.PUNCTUATION : sq8.m48644c(tycVarM50787a, tyc.C17268q.f48082c) ? SpeechType.SUBORDINATING_CONJUNCTION : sq8.m48644c(tycVarM50787a, tyc.C17270s.f48085c) ? SpeechType.SYMBOL : sq8.m48644c(tycVarM50787a, tyc.C17271t.f48087c) ? SpeechType.VERB : SpeechType.UNKNOWN;
    }
}

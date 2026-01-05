package com.amplifyframework.predictions.aws.service;

import p001o.aig;
import p001o.jgc;
import p001o.kf9;
import p001o.l2j;
import p001o.sq8;
import p001o.tg9;
import p001o.xk7;
import p001o.y3i;
import p001o.yih;

/* loaded from: classes5.dex */
public final class AWSPollyService$synthesizeSpeech$synthesizeSpeechRequest$1 extends kf9 implements xk7 {
    final /* synthetic */ String $languageCode;
    final /* synthetic */ String $text;
    final /* synthetic */ String $voiceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSPollyService$synthesizeSpeech$synthesizeSpeechRequest$1(String str, String str2, String str3) {
        super(1);
        this.$text = str;
        this.$languageCode = str2;
        this.$voiceId = str3;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((aig.C12195a) obj);
        return y3i.f54824a;
    }

    public final void invoke(aig.C12195a c12195a) {
        sq8.m48649h(c12195a, "$this$invoke");
        c12195a.m17187n(this.$text);
        c12195a.m17188o(yih.C18417d.f55564c);
        c12195a.m17184k(tg9.f47013a.m49829a(this.$languageCode));
        c12195a.m17189p(l2j.f33019a.m36462a(this.$voiceId));
        c12195a.m17185l(jgc.C14540c.f30399c);
        c12195a.m17186m("24000");
    }
}

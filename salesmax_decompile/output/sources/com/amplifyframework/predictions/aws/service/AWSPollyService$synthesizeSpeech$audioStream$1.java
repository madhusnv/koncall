package com.amplifyframework.predictions.aws.service;

import java.io.ByteArrayInputStream;
import p001o.big;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.oq1;
import p001o.tq1;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSPollyService$synthesizeSpeech$audioStream$1", m36648f = "AWSPollyService.kt", m36649l = {103}, m36650m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AWSPollyService$synthesizeSpeech$audioStream$1 extends jgg implements nl7 {
    /* synthetic */ Object L$0;
    int label;

    public AWSPollyService$synthesizeSpeech$audioStream$1(n64 n64Var) {
        super(2, n64Var);
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        AWSPollyService$synthesizeSpeech$audioStream$1 aWSPollyService$synthesizeSpeech$audioStream$1 = new AWSPollyService$synthesizeSpeech$audioStream$1(n64Var);
        aWSPollyService$synthesizeSpeech$audioStream$1.L$0 = obj;
        return aWSPollyService$synthesizeSpeech$audioStream$1;
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            oq1 oq1VarM19206a = ((big) this.L$0).m19206a();
            if (oq1VarM19206a != null) {
                this.label = 1;
                obj = tq1.m50333a(oq1VarM19206a, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wre.m54934b(obj);
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            return new ByteArrayInputStream(bArr);
        }
        return null;
    }

    @Override // p001o.nl7
    public final Object invoke(big bigVar, n64 n64Var) {
        return ((AWSPollyService$synthesizeSpeech$audioStream$1) create(bigVar, n64Var)).invokeSuspend(y3i.f54824a);
    }
}

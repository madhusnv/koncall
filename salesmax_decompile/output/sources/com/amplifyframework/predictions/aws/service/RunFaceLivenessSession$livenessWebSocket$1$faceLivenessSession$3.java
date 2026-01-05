package com.amplifyframework.predictions.aws.service;

import p001o.dm7;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public /* synthetic */ class RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$3 extends dm7 implements xk7 {
    public RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$3(Object obj) {
        super(1, obj, RunFaceLivenessSession.class, "stopLivenessSession", "stopLivenessSession(Ljava/lang/Integer;)V", 0);
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Integer) obj);
        return y3i.f54824a;
    }

    public final void invoke(Integer num) {
        ((RunFaceLivenessSession) this.receiver).stopLivenessSession(num);
    }
}

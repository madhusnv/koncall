package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.predictions.models.ChallengeResponseEvent;
import p001o.dm7;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public /* synthetic */ class RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$2 extends dm7 implements xk7 {
    public RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$2(Object obj) {
        super(1, obj, RunFaceLivenessSession.class, "processChallengeResponseEvent", "processChallengeResponseEvent(Lcom/amplifyframework/predictions/models/ChallengeResponseEvent;)V", 0);
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ChallengeResponseEvent) obj);
        return y3i.f54824a;
    }

    public final void invoke(ChallengeResponseEvent challengeResponseEvent) {
        sq8.m48649h(challengeResponseEvent, "p0");
        ((RunFaceLivenessSession) this.receiver).processChallengeResponseEvent(challengeResponseEvent);
    }
}

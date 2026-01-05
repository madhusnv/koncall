package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.predictions.models.VideoEvent;
import p001o.dm7;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public /* synthetic */ class RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$1 extends dm7 implements xk7 {
    public RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$1(Object obj) {
        super(1, obj, RunFaceLivenessSession.class, "processVideoEvent", "processVideoEvent(Lcom/amplifyframework/predictions/models/VideoEvent;)V", 0);
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VideoEvent) obj);
        return y3i.f54824a;
    }

    public final void invoke(VideoEvent videoEvent) {
        sq8.m48649h(videoEvent, "p0");
        ((RunFaceLivenessSession) this.receiver).processVideoEvent(videoEvent);
    }
}

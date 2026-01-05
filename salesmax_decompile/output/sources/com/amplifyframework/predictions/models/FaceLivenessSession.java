package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.List;
import p001o.sq8;
import p001o.xk7;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class FaceLivenessSession {
    private final List<FaceLivenessSessionChallenge> challenges;
    private final xk7 onChallengeResponseEvent;
    private final xk7 onVideoEvent;
    private final xk7 stopLivenessSession;

    /* JADX WARN: Multi-variable type inference failed */
    public FaceLivenessSession(List<? extends FaceLivenessSessionChallenge> list, xk7 xk7Var, xk7 xk7Var2, xk7 xk7Var3) {
        sq8.m48649h(list, "challenges");
        sq8.m48649h(xk7Var, "onVideoEvent");
        sq8.m48649h(xk7Var2, "onChallengeResponseEvent");
        sq8.m48649h(xk7Var3, "stopLivenessSession");
        this.challenges = list;
        this.onVideoEvent = xk7Var;
        this.onChallengeResponseEvent = xk7Var2;
        this.stopLivenessSession = xk7Var3;
    }

    public static /* synthetic */ void stopSession$default(FaceLivenessSession faceLivenessSession, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        faceLivenessSession.stopSession(num);
    }

    public final List<FaceLivenessSessionChallenge> getChallenges() {
        return this.challenges;
    }

    public final void sendChallengeResponseEvent(ChallengeResponseEvent challengeResponseEvent) {
        sq8.m48649h(challengeResponseEvent, "challengeResponseEvent");
        this.onChallengeResponseEvent.invoke(challengeResponseEvent);
    }

    public final void sendVideoEvent(VideoEvent videoEvent) {
        sq8.m48649h(videoEvent, "videoEvent");
        this.onVideoEvent.invoke(videoEvent);
    }

    public final void stopSession() {
        stopSession$default(this, null, 1, null);
    }

    public final void stopSession(Integer num) {
        this.stopLivenessSession.invoke(num);
    }
}

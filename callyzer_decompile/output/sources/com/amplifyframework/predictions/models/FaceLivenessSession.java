package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class FaceLivenessSession {
    private final String challengeId;
    private final FaceLivenessChallengeType challengeType;
    private final List<FaceLivenessSessionChallenge> challenges;
    private final InterfaceC2139c onChallengeResponseEvent;
    private final InterfaceC2139c onVideoEvent;
    private final InterfaceC2139c stopLivenessSession;

    /* JADX WARN: Multi-variable type inference failed */
    public FaceLivenessSession(String challengeId, FaceLivenessChallengeType challengeType, List<? extends FaceLivenessSessionChallenge> challenges, InterfaceC2139c onVideoEvent, InterfaceC2139c onChallengeResponseEvent, InterfaceC2139c stopLivenessSession) {
        AbstractC4154l.m8923f(challengeId, "challengeId");
        AbstractC4154l.m8923f(challengeType, "challengeType");
        AbstractC4154l.m8923f(challenges, "challenges");
        AbstractC4154l.m8923f(onVideoEvent, "onVideoEvent");
        AbstractC4154l.m8923f(onChallengeResponseEvent, "onChallengeResponseEvent");
        AbstractC4154l.m8923f(stopLivenessSession, "stopLivenessSession");
        this.challengeId = challengeId;
        this.challengeType = challengeType;
        this.challenges = challenges;
        this.onVideoEvent = onVideoEvent;
        this.onChallengeResponseEvent = onChallengeResponseEvent;
        this.stopLivenessSession = stopLivenessSession;
    }

    public static /* synthetic */ void stopSession$default(FaceLivenessSession faceLivenessSession, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        faceLivenessSession.stopSession(num);
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final FaceLivenessChallengeType getChallengeType() {
        return this.challengeType;
    }

    public final List<FaceLivenessSessionChallenge> getChallenges() {
        return this.challenges;
    }

    public final void sendChallengeResponseEvent(ChallengeResponseEvent challengeResponseEvent) {
        AbstractC4154l.m8923f(challengeResponseEvent, "challengeResponseEvent");
        this.onChallengeResponseEvent.invoke(challengeResponseEvent);
    }

    public final void sendVideoEvent(VideoEvent videoEvent) {
        AbstractC4154l.m8923f(videoEvent, "videoEvent");
        this.onVideoEvent.invoke(videoEvent);
    }

    public final void stopSession() {
        stopSession$default(this, null, 1, null);
    }

    public final void stopSession(Integer num) {
        this.stopLivenessSession.invoke(num);
    }
}

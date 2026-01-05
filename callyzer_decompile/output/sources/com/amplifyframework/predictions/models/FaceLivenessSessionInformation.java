package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.models.Challenge;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class FaceLivenessSessionInformation {
    private final Integer attemptCount;
    private final List<Challenge> challengeVersions;
    private final Boolean preCheckViewEnabled;
    private final String region;
    private final float videoHeight;
    private final float videoWidth;

    @InterfaceC6353c
    public FaceLivenessSessionInformation(float f6, float f10, String challenge, String region) {
        AbstractC4154l.m8923f(challenge, "challenge");
        AbstractC4154l.m8923f(region, "region");
        this.videoWidth = f6;
        this.videoHeight = f10;
        this.challengeVersions = pe.m10833h(new Challenge.FaceMovementAndLightChallenge("1.0.0"));
        this.region = region;
        this.preCheckViewEnabled = null;
        this.attemptCount = null;
    }

    public final Integer getAttemptCount() {
        return this.attemptCount;
    }

    public final List<Challenge> getChallengeVersions() {
        return this.challengeVersions;
    }

    public final Boolean getPreCheckViewEnabled() {
        return this.preCheckViewEnabled;
    }

    public final String getRegion() {
        return this.region;
    }

    public final float getVideoHeight() {
        return this.videoHeight;
    }

    public final float getVideoWidth() {
        return this.videoWidth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceLivenessSessionInformation(float f6, float f10, String region, List<? extends Challenge> challengeVersions, boolean z6, int i10) {
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(challengeVersions, "challengeVersions");
        this.videoWidth = f6;
        this.videoHeight = f10;
        this.region = region;
        this.challengeVersions = challengeVersions;
        this.preCheckViewEnabled = Boolean.valueOf(z6);
        this.attemptCount = Integer.valueOf(i10);
    }
}

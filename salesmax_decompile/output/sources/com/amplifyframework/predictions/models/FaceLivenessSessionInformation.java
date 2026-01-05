package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class FaceLivenessSessionInformation {
    private final String challengeVersions;
    private final String region;
    private final float videoHeight;
    private final float videoWidth;

    public FaceLivenessSessionInformation(float f, float f2, String str, String str2) {
        sq8.m48649h(str, "challengeVersions");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        this.videoWidth = f;
        this.videoHeight = f2;
        this.challengeVersions = str;
        this.region = str2;
    }

    public static /* synthetic */ FaceLivenessSessionInformation copy$default(FaceLivenessSessionInformation faceLivenessSessionInformation, float f, float f2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = faceLivenessSessionInformation.videoWidth;
        }
        if ((i & 2) != 0) {
            f2 = faceLivenessSessionInformation.videoHeight;
        }
        if ((i & 4) != 0) {
            str = faceLivenessSessionInformation.challengeVersions;
        }
        if ((i & 8) != 0) {
            str2 = faceLivenessSessionInformation.region;
        }
        return faceLivenessSessionInformation.copy(f, f2, str, str2);
    }

    public final float component1() {
        return this.videoWidth;
    }

    public final float component2() {
        return this.videoHeight;
    }

    public final String component3() {
        return this.challengeVersions;
    }

    public final String component4() {
        return this.region;
    }

    public final FaceLivenessSessionInformation copy(float f, float f2, String str, String str2) {
        sq8.m48649h(str, "challengeVersions");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        return new FaceLivenessSessionInformation(f, f2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceLivenessSessionInformation)) {
            return false;
        }
        FaceLivenessSessionInformation faceLivenessSessionInformation = (FaceLivenessSessionInformation) obj;
        return Float.compare(this.videoWidth, faceLivenessSessionInformation.videoWidth) == 0 && Float.compare(this.videoHeight, faceLivenessSessionInformation.videoHeight) == 0 && sq8.m48644c(this.challengeVersions, faceLivenessSessionInformation.challengeVersions) && sq8.m48644c(this.region, faceLivenessSessionInformation.region);
    }

    public final String getChallengeVersions() {
        return this.challengeVersions;
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

    public int hashCode() {
        return (((((Float.hashCode(this.videoWidth) * 31) + Float.hashCode(this.videoHeight)) * 31) + this.challengeVersions.hashCode()) * 31) + this.region.hashCode();
    }

    public String toString() {
        return "FaceLivenessSessionInformation(videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", challengeVersions=" + this.challengeVersions + ", region=" + this.region + ")";
    }
}

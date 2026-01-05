package com.amplifyframework.predictions.aws.models;

import android.graphics.RectF;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.models.ChallengeResponseEvent;
import java.util.Date;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class FaceTargetChallengeResponse implements ChallengeResponseEvent {
    private final String challengeId;
    private final Date faceInTargetEndTimestamp;
    private final Date faceInTargetStartTimestamp;
    private final RectF targetLocation;

    public FaceTargetChallengeResponse(String str, RectF rectF, Date date, Date date2) {
        sq8.m48649h(str, "challengeId");
        sq8.m48649h(rectF, "targetLocation");
        sq8.m48649h(date, "faceInTargetStartTimestamp");
        sq8.m48649h(date2, "faceInTargetEndTimestamp");
        this.challengeId = str;
        this.targetLocation = rectF;
        this.faceInTargetStartTimestamp = date;
        this.faceInTargetEndTimestamp = date2;
    }

    public static /* synthetic */ FaceTargetChallengeResponse copy$default(FaceTargetChallengeResponse faceTargetChallengeResponse, String str, RectF rectF, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceTargetChallengeResponse.challengeId;
        }
        if ((i & 2) != 0) {
            rectF = faceTargetChallengeResponse.targetLocation;
        }
        if ((i & 4) != 0) {
            date = faceTargetChallengeResponse.faceInTargetStartTimestamp;
        }
        if ((i & 8) != 0) {
            date2 = faceTargetChallengeResponse.faceInTargetEndTimestamp;
        }
        return faceTargetChallengeResponse.copy(str, rectF, date, date2);
    }

    public final String component1() {
        return this.challengeId;
    }

    public final RectF component2() {
        return this.targetLocation;
    }

    public final Date component3() {
        return this.faceInTargetStartTimestamp;
    }

    public final Date component4() {
        return this.faceInTargetEndTimestamp;
    }

    public final FaceTargetChallengeResponse copy(String str, RectF rectF, Date date, Date date2) {
        sq8.m48649h(str, "challengeId");
        sq8.m48649h(rectF, "targetLocation");
        sq8.m48649h(date, "faceInTargetStartTimestamp");
        sq8.m48649h(date2, "faceInTargetEndTimestamp");
        return new FaceTargetChallengeResponse(str, rectF, date, date2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceTargetChallengeResponse)) {
            return false;
        }
        FaceTargetChallengeResponse faceTargetChallengeResponse = (FaceTargetChallengeResponse) obj;
        return sq8.m48644c(this.challengeId, faceTargetChallengeResponse.challengeId) && sq8.m48644c(this.targetLocation, faceTargetChallengeResponse.targetLocation) && sq8.m48644c(this.faceInTargetStartTimestamp, faceTargetChallengeResponse.faceInTargetStartTimestamp) && sq8.m48644c(this.faceInTargetEndTimestamp, faceTargetChallengeResponse.faceInTargetEndTimestamp);
    }

    @Override // com.amplifyframework.predictions.models.ChallengeResponseEvent
    public String getChallengeId() {
        return this.challengeId;
    }

    public final Date getFaceInTargetEndTimestamp() {
        return this.faceInTargetEndTimestamp;
    }

    public final Date getFaceInTargetStartTimestamp() {
        return this.faceInTargetStartTimestamp;
    }

    public final RectF getTargetLocation() {
        return this.targetLocation;
    }

    public int hashCode() {
        return (((((this.challengeId.hashCode() * 31) + this.targetLocation.hashCode()) * 31) + this.faceInTargetStartTimestamp.hashCode()) * 31) + this.faceInTargetEndTimestamp.hashCode();
    }

    public String toString() {
        return "FaceTargetChallengeResponse(challengeId=" + this.challengeId + ", targetLocation=" + this.targetLocation + ", faceInTargetStartTimestamp=" + this.faceInTargetStartTimestamp + ", faceInTargetEndTimestamp=" + this.faceInTargetEndTimestamp + ")";
    }
}

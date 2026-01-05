package com.amplifyframework.predictions.aws.models;

import android.graphics.RectF;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.models.ChallengeResponseEvent;
import java.util.Date;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class InitialFaceDetected implements ChallengeResponseEvent {
    private final String challengeId;
    private final RectF faceLocation;
    private final Date timestamp;

    public InitialFaceDetected(String str, RectF rectF, Date date) {
        sq8.m48649h(str, "challengeId");
        sq8.m48649h(rectF, "faceLocation");
        sq8.m48649h(date, "timestamp");
        this.challengeId = str;
        this.faceLocation = rectF;
        this.timestamp = date;
    }

    public static /* synthetic */ InitialFaceDetected copy$default(InitialFaceDetected initialFaceDetected, String str, RectF rectF, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initialFaceDetected.challengeId;
        }
        if ((i & 2) != 0) {
            rectF = initialFaceDetected.faceLocation;
        }
        if ((i & 4) != 0) {
            date = initialFaceDetected.timestamp;
        }
        return initialFaceDetected.copy(str, rectF, date);
    }

    public final String component1() {
        return this.challengeId;
    }

    public final RectF component2() {
        return this.faceLocation;
    }

    public final Date component3() {
        return this.timestamp;
    }

    public final InitialFaceDetected copy(String str, RectF rectF, Date date) {
        sq8.m48649h(str, "challengeId");
        sq8.m48649h(rectF, "faceLocation");
        sq8.m48649h(date, "timestamp");
        return new InitialFaceDetected(str, rectF, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitialFaceDetected)) {
            return false;
        }
        InitialFaceDetected initialFaceDetected = (InitialFaceDetected) obj;
        return sq8.m48644c(this.challengeId, initialFaceDetected.challengeId) && sq8.m48644c(this.faceLocation, initialFaceDetected.faceLocation) && sq8.m48644c(this.timestamp, initialFaceDetected.timestamp);
    }

    @Override // com.amplifyframework.predictions.models.ChallengeResponseEvent
    public String getChallengeId() {
        return this.challengeId;
    }

    public final RectF getFaceLocation() {
        return this.faceLocation;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((this.challengeId.hashCode() * 31) + this.faceLocation.hashCode()) * 31) + this.timestamp.hashCode();
    }

    public String toString() {
        return "InitialFaceDetected(challengeId=" + this.challengeId + ", faceLocation=" + this.faceLocation + ", timestamp=" + this.timestamp + ")";
    }
}

package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.models.ChallengeResponseEvent;
import java.util.Date;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class ColorChallengeResponse implements ChallengeResponseEvent {
    private final String challengeId;
    private final int colorSequenceIndex;
    private final RgbColor currentColor;
    private final Date currentColorStartTime;
    private final RgbColor previousColor;

    public ColorChallengeResponse(String str, RgbColor rgbColor, RgbColor rgbColor2, Date date, int i) {
        sq8.m48649h(str, "challengeId");
        sq8.m48649h(rgbColor, "currentColor");
        sq8.m48649h(date, "currentColorStartTime");
        this.challengeId = str;
        this.currentColor = rgbColor;
        this.previousColor = rgbColor2;
        this.currentColorStartTime = date;
        this.colorSequenceIndex = i;
    }

    public static /* synthetic */ ColorChallengeResponse copy$default(ColorChallengeResponse colorChallengeResponse, String str, RgbColor rgbColor, RgbColor rgbColor2, Date date, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = colorChallengeResponse.challengeId;
        }
        if ((i2 & 2) != 0) {
            rgbColor = colorChallengeResponse.currentColor;
        }
        RgbColor rgbColor3 = rgbColor;
        if ((i2 & 4) != 0) {
            rgbColor2 = colorChallengeResponse.previousColor;
        }
        RgbColor rgbColor4 = rgbColor2;
        if ((i2 & 8) != 0) {
            date = colorChallengeResponse.currentColorStartTime;
        }
        Date date2 = date;
        if ((i2 & 16) != 0) {
            i = colorChallengeResponse.colorSequenceIndex;
        }
        return colorChallengeResponse.copy(str, rgbColor3, rgbColor4, date2, i);
    }

    public final String component1() {
        return this.challengeId;
    }

    public final RgbColor component2() {
        return this.currentColor;
    }

    public final RgbColor component3() {
        return this.previousColor;
    }

    public final Date component4() {
        return this.currentColorStartTime;
    }

    public final int component5() {
        return this.colorSequenceIndex;
    }

    public final ColorChallengeResponse copy(String str, RgbColor rgbColor, RgbColor rgbColor2, Date date, int i) {
        sq8.m48649h(str, "challengeId");
        sq8.m48649h(rgbColor, "currentColor");
        sq8.m48649h(date, "currentColorStartTime");
        return new ColorChallengeResponse(str, rgbColor, rgbColor2, date, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorChallengeResponse)) {
            return false;
        }
        ColorChallengeResponse colorChallengeResponse = (ColorChallengeResponse) obj;
        return sq8.m48644c(this.challengeId, colorChallengeResponse.challengeId) && sq8.m48644c(this.currentColor, colorChallengeResponse.currentColor) && sq8.m48644c(this.previousColor, colorChallengeResponse.previousColor) && sq8.m48644c(this.currentColorStartTime, colorChallengeResponse.currentColorStartTime) && this.colorSequenceIndex == colorChallengeResponse.colorSequenceIndex;
    }

    @Override // com.amplifyframework.predictions.models.ChallengeResponseEvent
    public String getChallengeId() {
        return this.challengeId;
    }

    public final int getColorSequenceIndex() {
        return this.colorSequenceIndex;
    }

    public final RgbColor getCurrentColor() {
        return this.currentColor;
    }

    public final Date getCurrentColorStartTime() {
        return this.currentColorStartTime;
    }

    public final RgbColor getPreviousColor() {
        return this.previousColor;
    }

    public int hashCode() {
        int iHashCode = ((this.challengeId.hashCode() * 31) + this.currentColor.hashCode()) * 31;
        RgbColor rgbColor = this.previousColor;
        return ((((iHashCode + (rgbColor == null ? 0 : rgbColor.hashCode())) * 31) + this.currentColorStartTime.hashCode()) * 31) + Integer.hashCode(this.colorSequenceIndex);
    }

    public String toString() {
        return "ColorChallengeResponse(challengeId=" + this.challengeId + ", currentColor=" + this.currentColor + ", previousColor=" + this.previousColor + ", currentColorStartTime=" + this.currentColorStartTime + ", colorSequenceIndex=" + this.colorSequenceIndex + ")";
    }
}

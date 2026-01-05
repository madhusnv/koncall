package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.models.FaceLivenessSessionChallenge;
import java.util.List;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class ColorChallenge implements FaceLivenessSessionChallenge {
    private final List<ColorDisplayInformation> challengeColors;
    private final String challengeId;
    private final ColorChallengeType challengeType;

    public ColorChallenge(String str, ColorChallengeType colorChallengeType, List<ColorDisplayInformation> list) {
        sq8.m48649h(str, "challengeId");
        sq8.m48649h(colorChallengeType, "challengeType");
        sq8.m48649h(list, "challengeColors");
        this.challengeId = str;
        this.challengeType = colorChallengeType;
        this.challengeColors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColorChallenge copy$default(ColorChallenge colorChallenge, String str, ColorChallengeType colorChallengeType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = colorChallenge.challengeId;
        }
        if ((i & 2) != 0) {
            colorChallengeType = colorChallenge.challengeType;
        }
        if ((i & 4) != 0) {
            list = colorChallenge.challengeColors;
        }
        return colorChallenge.copy(str, colorChallengeType, list);
    }

    public final String component1() {
        return this.challengeId;
    }

    public final ColorChallengeType component2() {
        return this.challengeType;
    }

    public final List<ColorDisplayInformation> component3() {
        return this.challengeColors;
    }

    public final ColorChallenge copy(String str, ColorChallengeType colorChallengeType, List<ColorDisplayInformation> list) {
        sq8.m48649h(str, "challengeId");
        sq8.m48649h(colorChallengeType, "challengeType");
        sq8.m48649h(list, "challengeColors");
        return new ColorChallenge(str, colorChallengeType, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorChallenge)) {
            return false;
        }
        ColorChallenge colorChallenge = (ColorChallenge) obj;
        return sq8.m48644c(this.challengeId, colorChallenge.challengeId) && this.challengeType == colorChallenge.challengeType && sq8.m48644c(this.challengeColors, colorChallenge.challengeColors);
    }

    public final List<ColorDisplayInformation> getChallengeColors() {
        return this.challengeColors;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final ColorChallengeType getChallengeType() {
        return this.challengeType;
    }

    public int hashCode() {
        return (((this.challengeId.hashCode() * 31) + this.challengeType.hashCode()) * 31) + this.challengeColors.hashCode();
    }

    public String toString() {
        return "ColorChallenge(challengeId=" + this.challengeId + ", challengeType=" + this.challengeType + ", challengeColors=" + this.challengeColors + ")";
    }
}

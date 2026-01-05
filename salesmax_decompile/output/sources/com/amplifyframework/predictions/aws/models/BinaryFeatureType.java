package com.amplifyframework.predictions.aws.models;

/* loaded from: classes5.dex */
public enum BinaryFeatureType {
    BEARD("Beard"),
    SUNGLASSES("Sunglasses"),
    SMILE("Smile"),
    EYE_GLASSES("EyeGlasses"),
    MUSTACHE("Mustache"),
    MOUTH_OPEN("MouthOpen"),
    EYES_OPEN("EyesOpen");

    private final String typeAlias;

    BinaryFeatureType(String str) {
        this.typeAlias = str;
    }

    public String getAlias() {
        return this.typeAlias;
    }
}

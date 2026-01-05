package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.gi6;
import p001o.hi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class ColorChallengeType {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ ColorChallengeType[] $VALUES;
    public static final ColorChallengeType SEQUENTIAL = new ColorChallengeType("SEQUENTIAL", 0);

    private static final /* synthetic */ ColorChallengeType[] $values() {
        return new ColorChallengeType[]{SEQUENTIAL};
    }

    static {
        ColorChallengeType[] colorChallengeTypeArr$values = $values();
        $VALUES = colorChallengeTypeArr$values;
        $ENTRIES = hi6.m30609a(colorChallengeTypeArr$values);
    }

    private ColorChallengeType(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static ColorChallengeType valueOf(String str) {
        return (ColorChallengeType) Enum.valueOf(ColorChallengeType.class, str);
    }

    public static ColorChallengeType[] values() {
        return (ColorChallengeType[]) $VALUES.clone();
    }
}

package com.amplifyframework.predictions.aws.models.liveness;

import p001o.gi6;
import p001o.hi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LightChallengeType {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ LightChallengeType[] $VALUES;
    public static final LightChallengeType SEQUENTIAL = new LightChallengeType("SEQUENTIAL", 0);

    private static final /* synthetic */ LightChallengeType[] $values() {
        return new LightChallengeType[]{SEQUENTIAL};
    }

    static {
        LightChallengeType[] lightChallengeTypeArr$values = $values();
        $VALUES = lightChallengeTypeArr$values;
        $ENTRIES = hi6.m30609a(lightChallengeTypeArr$values);
    }

    private LightChallengeType(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static LightChallengeType valueOf(String str) {
        return (LightChallengeType) Enum.valueOf(LightChallengeType.class, str);
    }

    public static LightChallengeType[] values() {
        return (LightChallengeType[]) $VALUES.clone();
    }
}

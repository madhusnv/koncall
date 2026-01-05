package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class FaceLivenessChallengeType {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ FaceLivenessChallengeType[] $VALUES;
    public static final FaceLivenessChallengeType FaceMovementChallenge = new FaceLivenessChallengeType("FaceMovementChallenge", 0);
    public static final FaceLivenessChallengeType FaceMovementAndLightChallenge = new FaceLivenessChallengeType("FaceMovementAndLightChallenge", 1);

    private static final /* synthetic */ FaceLivenessChallengeType[] $values() {
        return new FaceLivenessChallengeType[]{FaceMovementChallenge, FaceMovementAndLightChallenge};
    }

    static {
        FaceLivenessChallengeType[] faceLivenessChallengeTypeArr$values = $values();
        $VALUES = faceLivenessChallengeTypeArr$values;
        $ENTRIES = b8.m11548b(faceLivenessChallengeTypeArr$values);
    }

    private FaceLivenessChallengeType(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static FaceLivenessChallengeType valueOf(String str) {
        return (FaceLivenessChallengeType) Enum.valueOf(FaceLivenessChallengeType.class, str);
    }

    public static FaceLivenessChallengeType[] values() {
        return (FaceLivenessChallengeType[]) $VALUES.clone();
    }
}

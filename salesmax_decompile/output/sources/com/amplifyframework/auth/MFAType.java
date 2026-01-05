package com.amplifyframework.auth;

import p001o.gi6;
import p001o.hi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class MFAType {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ MFAType[] $VALUES;
    public static final MFAType SMS = new MFAType("SMS", 0);
    public static final MFAType TOTP = new MFAType("TOTP", 1);
    public static final MFAType EMAIL = new MFAType("EMAIL", 2);

    private static final /* synthetic */ MFAType[] $values() {
        return new MFAType[]{SMS, TOTP, EMAIL};
    }

    static {
        MFAType[] mFATypeArr$values = $values();
        $VALUES = mFATypeArr$values;
        $ENTRIES = hi6.m30609a(mFATypeArr$values);
    }

    private MFAType(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static MFAType valueOf(String str) {
        return (MFAType) Enum.valueOf(MFAType.class, str);
    }

    public static MFAType[] values() {
        return (MFAType[]) $VALUES.clone();
    }
}

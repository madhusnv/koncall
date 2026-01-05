package com.amplifyframework.auth;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MFAType {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
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
        $ENTRIES = b8.m11548b(mFATypeArr$values);
    }

    private MFAType(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static MFAType valueOf(String str) {
        return (MFAType) Enum.valueOf(MFAType.class, str);
    }

    public static MFAType[] values() {
        return (MFAType[]) $VALUES.clone();
    }
}

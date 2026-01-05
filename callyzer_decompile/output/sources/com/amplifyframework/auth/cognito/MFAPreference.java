package com.amplifyframework.auth.cognito;

import kotlin.jvm.internal.AbstractC4148f;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MFAPreference {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ MFAPreference[] $VALUES;
    private final boolean mfaEnabled;
    private final Boolean mfaPreferred;
    public static final MFAPreference DISABLED = new MFAPreference("DISABLED", 0, false, null, 2, null);
    public static final MFAPreference ENABLED = new MFAPreference("ENABLED", 1, true, null, 2, null);
    public static final MFAPreference PREFERRED = new MFAPreference("PREFERRED", 2, true, Boolean.TRUE);
    public static final MFAPreference NOT_PREFERRED = new MFAPreference("NOT_PREFERRED", 3, true, Boolean.FALSE);

    private static final /* synthetic */ MFAPreference[] $values() {
        return new MFAPreference[]{DISABLED, ENABLED, PREFERRED, NOT_PREFERRED};
    }

    static {
        MFAPreference[] mFAPreferenceArr$values = $values();
        $VALUES = mFAPreferenceArr$values;
        $ENTRIES = b8.m11548b(mFAPreferenceArr$values);
    }

    private MFAPreference(String str, int i10, boolean z6, Boolean bool) {
        this.mfaEnabled = z6;
        this.mfaPreferred = bool;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static MFAPreference valueOf(String str) {
        return (MFAPreference) Enum.valueOf(MFAPreference.class, str);
    }

    public static MFAPreference[] values() {
        return (MFAPreference[]) $VALUES.clone();
    }

    public final boolean getMfaEnabled$aws_auth_cognito_release() {
        return this.mfaEnabled;
    }

    public final Boolean getMfaPreferred$aws_auth_cognito_release() {
        return this.mfaPreferred;
    }

    public /* synthetic */ MFAPreference(String str, int i10, boolean z6, Boolean bool, int i11, AbstractC4148f abstractC4148f) {
        this(str, i10, z6, (i11 & 2) != 0 ? null : bool);
    }
}

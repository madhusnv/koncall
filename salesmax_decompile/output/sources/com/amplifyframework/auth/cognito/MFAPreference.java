package com.amplifyframework.auth.cognito;

import p001o.gi6;
import p001o.hi6;
import p001o.id5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class MFAPreference {
    private static final /* synthetic */ gi6 $ENTRIES;
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
        $ENTRIES = hi6.m30609a(mFAPreferenceArr$values);
    }

    private MFAPreference(String str, int i, boolean z, Boolean bool) {
        this.mfaEnabled = z;
        this.mfaPreferred = bool;
    }

    public static gi6 getEntries() {
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

    public /* synthetic */ MFAPreference(String str, int i, boolean z, Boolean bool, int i2, id5 id5Var) {
        this(str, i, z, (i2 & 2) != 0 ? null : bool);
    }
}

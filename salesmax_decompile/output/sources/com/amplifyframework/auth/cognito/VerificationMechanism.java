package com.amplifyframework.auth.cognito;

import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.gi6;
import p001o.hi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class VerificationMechanism {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ VerificationMechanism[] $VALUES;
    public static final VerificationMechanism Email = new VerificationMechanism("Email", 0);
    public static final VerificationMechanism PhoneNumber = new VerificationMechanism("PhoneNumber", 1);

    private static final /* synthetic */ VerificationMechanism[] $values() {
        return new VerificationMechanism[]{Email, PhoneNumber};
    }

    static {
        VerificationMechanism[] verificationMechanismArr$values = $values();
        $VALUES = verificationMechanismArr$values;
        $ENTRIES = hi6.m30609a(verificationMechanismArr$values);
    }

    private VerificationMechanism(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static VerificationMechanism valueOf(String str) {
        return (VerificationMechanism) Enum.valueOf(VerificationMechanism.class, str);
    }

    public static VerificationMechanism[] values() {
        return (VerificationMechanism[]) $VALUES.clone();
    }
}

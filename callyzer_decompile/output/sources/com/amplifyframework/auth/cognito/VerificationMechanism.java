package com.amplifyframework.auth.cognito;

import com.amplifyframework.annotations.InternalAmplifyApi;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class VerificationMechanism {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ VerificationMechanism[] $VALUES;
    public static final VerificationMechanism Email = new VerificationMechanism("Email", 0);
    public static final VerificationMechanism PhoneNumber = new VerificationMechanism("PhoneNumber", 1);

    private static final /* synthetic */ VerificationMechanism[] $values() {
        return new VerificationMechanism[]{Email, PhoneNumber};
    }

    static {
        VerificationMechanism[] verificationMechanismArr$values = $values();
        $VALUES = verificationMechanismArr$values;
        $ENTRIES = b8.m11548b(verificationMechanismArr$values);
    }

    private VerificationMechanism(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static VerificationMechanism valueOf(String str) {
        return (VerificationMechanism) Enum.valueOf(VerificationMechanism.class, str);
    }

    public static VerificationMechanism[] values() {
        return (VerificationMechanism[]) $VALUES.clone();
    }
}

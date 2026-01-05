package com.amplifyframework.statemachine.codegen.data;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ChallengeParameter {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ ChallengeParameter[] $VALUES;
    public static final ChallengeParameter CodeDeliveryDestination = new ChallengeParameter("CodeDeliveryDestination", 0, "CODE_DELIVERY_DESTINATION");
    public static final ChallengeParameter CodeDeliveryMedium = new ChallengeParameter("CodeDeliveryMedium", 1, "CODE_DELIVERY_DELIVERY_MEDIUM");
    public static final ChallengeParameter CredentialRequestOptions = new ChallengeParameter("CredentialRequestOptions", 2, "CREDENTIAL_REQUEST_OPTIONS");
    public static final ChallengeParameter MfasCanChoose = new ChallengeParameter("MfasCanChoose", 3, "MFAS_CAN_CHOOSE");
    public static final ChallengeParameter MfasCanSetup = new ChallengeParameter("MfasCanSetup", 4, "MFAS_CAN_SETUP");
    private final String key;

    private static final /* synthetic */ ChallengeParameter[] $values() {
        return new ChallengeParameter[]{CodeDeliveryDestination, CodeDeliveryMedium, CredentialRequestOptions, MfasCanChoose, MfasCanSetup};
    }

    static {
        ChallengeParameter[] challengeParameterArr$values = $values();
        $VALUES = challengeParameterArr$values;
        $ENTRIES = b8.m11548b(challengeParameterArr$values);
    }

    private ChallengeParameter(String str, int i10, String str2) {
        this.key = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static ChallengeParameter valueOf(String str) {
        return (ChallengeParameter) Enum.valueOf(ChallengeParameter.class, str);
    }

    public static ChallengeParameter[] values() {
        return (ChallengeParameter[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}

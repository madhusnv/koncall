package com.amplifyframework.statemachine.codegen.data;

import p001o.gi6;
import p001o.hi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ChallengeParameter {
    private static final /* synthetic */ gi6 $ENTRIES;
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
        $ENTRIES = hi6.m30609a(challengeParameterArr$values);
    }

    private ChallengeParameter(String str, int i, String str2) {
        this.key = str2;
    }

    public static gi6 getEntries() {
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

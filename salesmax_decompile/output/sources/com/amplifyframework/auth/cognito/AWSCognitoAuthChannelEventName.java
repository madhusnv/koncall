package com.amplifyframework.auth.cognito;

import p001o.gi6;
import p001o.hi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AWSCognitoAuthChannelEventName {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ AWSCognitoAuthChannelEventName[] $VALUES;
    public static final AWSCognitoAuthChannelEventName FEDERATED_TO_IDENTITY_POOL = new AWSCognitoAuthChannelEventName("FEDERATED_TO_IDENTITY_POOL", 0);
    public static final AWSCognitoAuthChannelEventName FEDERATION_TO_IDENTITY_POOL_CLEARED = new AWSCognitoAuthChannelEventName("FEDERATION_TO_IDENTITY_POOL_CLEARED", 1);

    private static final /* synthetic */ AWSCognitoAuthChannelEventName[] $values() {
        return new AWSCognitoAuthChannelEventName[]{FEDERATED_TO_IDENTITY_POOL, FEDERATION_TO_IDENTITY_POOL_CLEARED};
    }

    static {
        AWSCognitoAuthChannelEventName[] aWSCognitoAuthChannelEventNameArr$values = $values();
        $VALUES = aWSCognitoAuthChannelEventNameArr$values;
        $ENTRIES = hi6.m30609a(aWSCognitoAuthChannelEventNameArr$values);
    }

    private AWSCognitoAuthChannelEventName(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static AWSCognitoAuthChannelEventName valueOf(String str) {
        return (AWSCognitoAuthChannelEventName) Enum.valueOf(AWSCognitoAuthChannelEventName.class, str);
    }

    public static AWSCognitoAuthChannelEventName[] values() {
        return (AWSCognitoAuthChannelEventName[]) $VALUES.clone();
    }
}

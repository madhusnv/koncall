package com.amplifyframework.auth.cognito;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthChannelEventName {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ AWSCognitoAuthChannelEventName[] $VALUES;
    public static final AWSCognitoAuthChannelEventName FEDERATED_TO_IDENTITY_POOL = new AWSCognitoAuthChannelEventName("FEDERATED_TO_IDENTITY_POOL", 0);
    public static final AWSCognitoAuthChannelEventName FEDERATION_TO_IDENTITY_POOL_CLEARED = new AWSCognitoAuthChannelEventName("FEDERATION_TO_IDENTITY_POOL_CLEARED", 1);

    private static final /* synthetic */ AWSCognitoAuthChannelEventName[] $values() {
        return new AWSCognitoAuthChannelEventName[]{FEDERATED_TO_IDENTITY_POOL, FEDERATION_TO_IDENTITY_POOL_CLEARED};
    }

    static {
        AWSCognitoAuthChannelEventName[] aWSCognitoAuthChannelEventNameArr$values = $values();
        $VALUES = aWSCognitoAuthChannelEventNameArr$values;
        $ENTRIES = b8.m11548b(aWSCognitoAuthChannelEventNameArr$values);
    }

    private AWSCognitoAuthChannelEventName(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static AWSCognitoAuthChannelEventName valueOf(String str) {
        return (AWSCognitoAuthChannelEventName) Enum.valueOf(AWSCognitoAuthChannelEventName.class, str);
    }

    public static AWSCognitoAuthChannelEventName[] values() {
        return (AWSCognitoAuthChannelEventName[]) $VALUES.clone();
    }
}

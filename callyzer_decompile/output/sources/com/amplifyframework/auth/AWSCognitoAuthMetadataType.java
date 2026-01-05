package com.amplifyframework.auth;

import com.amplifyframework.annotations.InternalAmplifyApi;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class AWSCognitoAuthMetadataType {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ AWSCognitoAuthMetadataType[] $VALUES;
    private final String key;
    public static final AWSCognitoAuthMetadataType Authenticator = new AWSCognitoAuthMetadataType("Authenticator", 0, "authenticator");
    public static final AWSCognitoAuthMetadataType AuthPluginsCore = new AWSCognitoAuthMetadataType("AuthPluginsCore", 1, "oidc-auth-plugin");

    private static final /* synthetic */ AWSCognitoAuthMetadataType[] $values() {
        return new AWSCognitoAuthMetadataType[]{Authenticator, AuthPluginsCore};
    }

    static {
        AWSCognitoAuthMetadataType[] aWSCognitoAuthMetadataTypeArr$values = $values();
        $VALUES = aWSCognitoAuthMetadataTypeArr$values;
        $ENTRIES = b8.m11548b(aWSCognitoAuthMetadataTypeArr$values);
    }

    private AWSCognitoAuthMetadataType(String str, int i10, String str2) {
        this.key = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static AWSCognitoAuthMetadataType valueOf(String str) {
        return (AWSCognitoAuthMetadataType) Enum.valueOf(AWSCognitoAuthMetadataType.class, str);
    }

    public static AWSCognitoAuthMetadataType[] values() {
        return (AWSCognitoAuthMetadataType[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}

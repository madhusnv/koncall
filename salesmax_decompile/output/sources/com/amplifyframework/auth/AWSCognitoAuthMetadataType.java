package com.amplifyframework.auth;

import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.gi6;
import p001o.hi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class AWSCognitoAuthMetadataType {
    private static final /* synthetic */ gi6 $ENTRIES;
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
        $ENTRIES = hi6.m30609a(aWSCognitoAuthMetadataTypeArr$values);
    }

    private AWSCognitoAuthMetadataType(String str, int i, String str2) {
        this.key = str2;
    }

    public static gi6 getEntries() {
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

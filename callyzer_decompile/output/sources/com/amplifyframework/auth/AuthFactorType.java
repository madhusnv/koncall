package com.amplifyframework.auth;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthFactorType {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ AuthFactorType[] $VALUES;
    private final String challengeResponse;
    public static final AuthFactorType PASSWORD = new AuthFactorType("PASSWORD", 0, "PASSWORD");
    public static final AuthFactorType PASSWORD_SRP = new AuthFactorType("PASSWORD_SRP", 1, "PASSWORD_SRP");
    public static final AuthFactorType EMAIL_OTP = new AuthFactorType("EMAIL_OTP", 2, "EMAIL_OTP");
    public static final AuthFactorType SMS_OTP = new AuthFactorType("SMS_OTP", 3, "SMS_OTP");
    public static final AuthFactorType WEB_AUTHN = new AuthFactorType("WEB_AUTHN", 4, "WEB_AUTHN");

    private static final /* synthetic */ AuthFactorType[] $values() {
        return new AuthFactorType[]{PASSWORD, PASSWORD_SRP, EMAIL_OTP, SMS_OTP, WEB_AUTHN};
    }

    static {
        AuthFactorType[] authFactorTypeArr$values = $values();
        $VALUES = authFactorTypeArr$values;
        $ENTRIES = b8.m11548b(authFactorTypeArr$values);
    }

    private AuthFactorType(String str, int i10, String str2) {
        this.challengeResponse = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static AuthFactorType valueOf(String str) {
        return (AuthFactorType) Enum.valueOf(AuthFactorType.class, str);
    }

    public static AuthFactorType[] values() {
        return (AuthFactorType[]) $VALUES.clone();
    }

    public final String getChallengeResponse() {
        return this.challengeResponse;
    }
}

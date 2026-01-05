package com.amplifyframework.auth.cognito.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum AuthFlowType {
    USER_SRP_AUTH("USER_SRP_AUTH"),
    CUSTOM_AUTH("CUSTOM_AUTH"),
    CUSTOM_AUTH_WITH_SRP("CUSTOM_AUTH_WITH_SRP"),
    CUSTOM_AUTH_WITHOUT_SRP("CUSTOM_AUTH_WITHOUT_SRP"),
    USER_PASSWORD_AUTH("USER_PASSWORD_AUTH"),
    USER_AUTH("USER_AUTH");

    private String value;

    AuthFlowType(String str) {
        this.value = str;
    }
}

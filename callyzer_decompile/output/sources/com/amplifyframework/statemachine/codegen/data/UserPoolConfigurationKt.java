package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UserPoolConfigurationKt {
    public static final String requireAppClientId(UserPoolConfiguration userPoolConfiguration) {
        String appClient;
        if (userPoolConfiguration == null || (appClient = userPoolConfiguration.getAppClient()) == null) {
            throw new InvalidUserPoolConfigurationException();
        }
        return appClient;
    }
}

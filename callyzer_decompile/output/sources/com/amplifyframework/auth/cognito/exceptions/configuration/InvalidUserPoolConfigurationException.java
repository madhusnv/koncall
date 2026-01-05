package com.amplifyframework.auth.cognito.exceptions.configuration;

import com.amplifyframework.auth.exceptions.ConfigurationException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InvalidUserPoolConfigurationException extends ConfigurationException {
    public InvalidUserPoolConfigurationException() {
        super("The user pool configuration is missing or invalid.", "Please check the user pool configuration in your amplifyconfiguration.json file.", null, 4, null);
    }
}

package com.amplifyframework.auth.cognito.exceptions.configuration;

import com.amplifyframework.auth.exceptions.ConfigurationException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InvalidOauthConfigurationException extends ConfigurationException {
    public InvalidOauthConfigurationException() {
        super("The Oauth configuration is missing or invalid.", "HostedUI Oauth section not configured or unable to parse from amplifyconfiguration.json file.", null, 4, null);
    }
}

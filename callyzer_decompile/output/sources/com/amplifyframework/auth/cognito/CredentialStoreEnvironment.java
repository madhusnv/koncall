package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.cognito.data.AWSCognitoAuthCredentialStore;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.Environment;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialStoreEnvironment implements Environment {
    private final AWSCognitoAuthCredentialStore credentialStore;
    private final AWSCognitoLegacyCredentialStore legacyCredentialStore;
    private final Logger logger;

    public CredentialStoreEnvironment(AWSCognitoAuthCredentialStore credentialStore, AWSCognitoLegacyCredentialStore legacyCredentialStore, Logger logger) {
        AbstractC4154l.m8923f(credentialStore, "credentialStore");
        AbstractC4154l.m8923f(legacyCredentialStore, "legacyCredentialStore");
        AbstractC4154l.m8923f(logger, "logger");
        this.credentialStore = credentialStore;
        this.legacyCredentialStore = legacyCredentialStore;
        this.logger = logger;
    }

    public final AWSCognitoAuthCredentialStore getCredentialStore() {
        return this.credentialStore;
    }

    public final AWSCognitoLegacyCredentialStore getLegacyCredentialStore() {
        return this.legacyCredentialStore;
    }

    public final Logger getLogger() {
        return this.logger;
    }
}

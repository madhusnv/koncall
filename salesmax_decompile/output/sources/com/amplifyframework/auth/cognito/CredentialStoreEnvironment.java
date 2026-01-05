package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.cognito.data.AWSCognitoAuthCredentialStore;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.Environment;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CredentialStoreEnvironment implements Environment {
    private final AWSCognitoAuthCredentialStore credentialStore;
    private final AWSCognitoLegacyCredentialStore legacyCredentialStore;
    private final Logger logger;

    public CredentialStoreEnvironment(AWSCognitoAuthCredentialStore aWSCognitoAuthCredentialStore, AWSCognitoLegacyCredentialStore aWSCognitoLegacyCredentialStore, Logger logger) {
        sq8.m48649h(aWSCognitoAuthCredentialStore, "credentialStore");
        sq8.m48649h(aWSCognitoLegacyCredentialStore, "legacyCredentialStore");
        sq8.m48649h(logger, "logger");
        this.credentialStore = aWSCognitoAuthCredentialStore;
        this.legacyCredentialStore = aWSCognitoLegacyCredentialStore;
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

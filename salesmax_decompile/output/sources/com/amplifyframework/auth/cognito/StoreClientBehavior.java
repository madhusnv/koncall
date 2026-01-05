package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import p001o.n64;

/* loaded from: classes5.dex */
public interface StoreClientBehavior {
    Object clearCredentials(CredentialType credentialType, n64 n64Var);

    Object loadCredentials(CredentialType credentialType, n64 n64Var);

    Object storeCredentials(CredentialType credentialType, AmplifyCredential amplifyCredential, n64 n64Var);
}

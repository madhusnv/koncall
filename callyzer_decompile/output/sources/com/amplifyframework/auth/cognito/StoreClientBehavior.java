package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface StoreClientBehavior {
    Object clearCredentials(CredentialType credentialType, InterfaceC7559c<? super a0> interfaceC7559c);

    Object loadCredentials(CredentialType credentialType, InterfaceC7559c<? super AmplifyCredential> interfaceC7559c);

    Object storeCredentials(CredentialType credentialType, AmplifyCredential amplifyCredential, InterfaceC7559c<? super a0> interfaceC7559c);
}

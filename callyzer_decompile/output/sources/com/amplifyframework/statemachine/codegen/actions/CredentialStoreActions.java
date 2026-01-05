package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface CredentialStoreActions {
    Action clearCredentialStoreAction(CredentialType credentialType);

    Action loadCredentialStoreAction(CredentialType credentialType);

    Action migrateLegacyCredentialStoreAction();

    Action moveToIdleStateAction();

    Action storeCredentialsAction(CredentialType credentialType, AmplifyCredential amplifyCredential);
}

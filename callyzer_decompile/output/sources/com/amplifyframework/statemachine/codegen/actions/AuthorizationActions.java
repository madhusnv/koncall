package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface AuthorizationActions {
    Action configureAuthorizationAction();

    Action initializeFederationToIdentityPool(FederatedToken federatedToken, String str);

    Action initializeFetchAuthSession(SignedInData signedInData);

    Action initializeFetchUnAuthSession();

    Action initiateDeleteUser(DeleteUserEvent.EventType.DeleteUser deleteUser);

    Action initiateRefreshSessionAction(AmplifyCredential amplifyCredential);

    Action persistCredentials(AmplifyCredential amplifyCredential);
}

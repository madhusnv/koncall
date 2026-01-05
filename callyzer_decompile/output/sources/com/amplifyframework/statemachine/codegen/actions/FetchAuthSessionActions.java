package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface FetchAuthSessionActions {
    Action fetchAWSCredentialsAction(String str, LoginsMapProvider loginsMapProvider);

    Action fetchIdentityAction(LoginsMapProvider loginsMapProvider);

    Action notifySessionEstablishedAction(String str, AWSCredentials aWSCredentials);

    Action notifySessionRefreshedAction(AmplifyCredential amplifyCredential);

    Action refreshAuthSessionAction(LoginsMapProvider loginsMapProvider);

    Action refreshUserPoolTokensAction(SignedInData signedInData);
}

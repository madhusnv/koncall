package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;

/* loaded from: classes5.dex */
public interface FetchAuthSessionActions {
    Action fetchAWSCredentialsAction(String str, LoginsMapProvider loginsMapProvider);

    Action fetchIdentityAction(LoginsMapProvider loginsMapProvider);

    Action notifySessionEstablishedAction(String str, AWSCredentials aWSCredentials);

    Action notifySessionRefreshedAction(AmplifyCredential amplifyCredential);

    Action refreshAuthSessionAction(LoginsMapProvider loginsMapProvider);

    Action refreshUserPoolTokensAction(SignedInData signedInData);
}

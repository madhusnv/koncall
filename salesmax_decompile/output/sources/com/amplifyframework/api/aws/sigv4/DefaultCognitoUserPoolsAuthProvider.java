package com.amplifyframework.api.aws.sigv4;

import com.amplifyframework.api.ApiException;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.auth.CognitoCredentialsProvider;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import java.util.concurrent.Semaphore;

/* loaded from: classes5.dex */
public final class DefaultCognitoUserPoolsAuthProvider implements CognitoUserPoolsAuthProvider {
    private final CognitoCredentialsProvider credentialsProvider;
    private AuthUser currentUser;
    private String currentUserRetrievalFailureMessage;
    private String lastTokenRetrievalFailureMessage;
    private String token;

    public DefaultCognitoUserPoolsAuthProvider() throws ApiException.ApiAuthException {
        try {
            this.credentialsProvider = new CognitoCredentialsProvider();
        } catch (IllegalStateException e) {
            throw new ApiException.ApiAuthException("AWSApiPlugin depends on AWSCognitoAuthPlugin but it is currently missing", e, "Before configuring Amplify, be sure to add AWSCognitoAuthPlugin same as you added AWSApiPlugin.");
        }
    }

    private synchronized void fetchToken() {
        final Semaphore semaphore = new Semaphore(0);
        this.lastTokenRetrievalFailureMessage = null;
        this.credentialsProvider.getAccessToken(new Consumer() { // from class: o.yc5
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f55211a.lambda$fetchToken$0(semaphore, (String) obj);
            }
        }, new Consumer() { // from class: o.zc5
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f56929a.lambda$fetchToken$1(semaphore, (Exception) obj);
            }
        });
        try {
            semaphore.acquire();
            if (this.lastTokenRetrievalFailureMessage != null) {
                throw new ApiException.ApiAuthException(this.lastTokenRetrievalFailureMessage, "Sorry, we don’t have a recovery suggestion for this error.");
            }
        } catch (InterruptedException e) {
            throw new ApiException("Interrupted waiting for Cognito Userpools token.", e, "Sorry, we don’t have a recovery suggestion for this error.");
        }
    }

    private synchronized void fetchUser() {
        final Semaphore semaphore = new Semaphore(0);
        Amplify.Auth.getCurrentUser(new Consumer() { // from class: o.ad5
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f14524a.lambda$fetchUser$2(semaphore, (AuthUser) obj);
            }
        }, new Consumer() { // from class: o.bd5
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f15953a.lambda$fetchUser$3(semaphore, (AuthException) obj);
            }
        });
        try {
            semaphore.acquire();
            if (this.currentUserRetrievalFailureMessage != null) {
                throw new ApiException(this.currentUserRetrievalFailureMessage, "Sorry, we don’t have a recovery suggestion for this error.");
            }
        } catch (InterruptedException e) {
            throw new ApiException("Interrupted waiting for Cognito Username.", e, "Sorry, we don’t have a recovery suggestion for this error.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchToken$0(Semaphore semaphore, String str) {
        this.token = str;
        semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchToken$1(Semaphore semaphore, Exception exc) {
        this.lastTokenRetrievalFailureMessage = exc.getLocalizedMessage();
        semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchUser$2(Semaphore semaphore, AuthUser authUser) {
        this.currentUser = authUser;
        semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchUser$3(Semaphore semaphore, AuthException authException) {
        this.currentUser = null;
        this.currentUserRetrievalFailureMessage = authException.getLocalizedMessage();
        semaphore.release();
    }

    @Override // com.amplifyframework.api.aws.sigv4.CognitoUserPoolsAuthProvider
    public String getLatestAuthToken() {
        fetchToken();
        return this.token;
    }

    @Override // com.amplifyframework.api.aws.sigv4.CognitoUserPoolsAuthProvider
    public String getUsername() {
        fetchUser();
        AuthUser authUser = this.currentUser;
        if (authUser != null) {
            return authUser.getUsername();
        }
        return null;
    }
}

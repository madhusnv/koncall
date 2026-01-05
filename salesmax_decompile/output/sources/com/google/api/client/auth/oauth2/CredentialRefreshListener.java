package com.google.api.client.auth.oauth2;

/* loaded from: classes3.dex */
public interface CredentialRefreshListener {
    void onTokenErrorResponse(Credential credential, TokenErrorResponse tokenErrorResponse);

    void onTokenResponse(Credential credential, TokenResponse tokenResponse);
}

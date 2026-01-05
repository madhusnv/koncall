package com.google.api.client.extensions.java6.auth.oauth2;

/* loaded from: classes3.dex */
public interface VerificationCodeReceiver {
    String getRedirectUri();

    void stop();

    String waitForCode();
}

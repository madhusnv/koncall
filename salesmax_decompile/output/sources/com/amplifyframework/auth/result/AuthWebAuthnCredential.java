package com.amplifyframework.auth.result;

import j$.time.Instant;

/* loaded from: classes5.dex */
public interface AuthWebAuthnCredential {
    Instant getCreatedAt();

    String getCredentialId();

    String getFriendlyName();

    String getRelyingPartyId();
}

package com.amplifyframework.auth.result;

import j$.time.Instant;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface AuthWebAuthnCredential {
    Instant getCreatedAt();

    String getCredentialId();

    String getFriendlyName();

    String getRelyingPartyId();
}

package com.amplifyframework.auth;

import j$.time.Instant;
import p001o.c74;
import p001o.ic4;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSCredentialsKt {
    public static final ic4 toSdkCredentials(AWSCredentials aWSCredentials) {
        Instant expiresAt;
        sq8.m48649h(aWSCredentials, "<this>");
        ic4.C14248a c14248a = ic4.f28446a;
        String accessKeyId = aWSCredentials.getAccessKeyId();
        String secretAccessKey = aWSCredentials.getSecretAccessKey();
        boolean z = aWSCredentials instanceof AWSTemporaryCredentials;
        AWSTemporaryCredentials aWSTemporaryCredentials = z ? (AWSTemporaryCredentials) aWSCredentials : null;
        String sessionToken = aWSTemporaryCredentials != null ? aWSTemporaryCredentials.getSessionToken() : null;
        AWSTemporaryCredentials aWSTemporaryCredentials2 = z ? (AWSTemporaryCredentials) aWSCredentials : null;
        return c14248a.m31900a(accessKeyId, secretAccessKey, (16 & 4) != 0 ? null : sessionToken, (16 & 8) != 0 ? null : (aWSTemporaryCredentials2 == null || (expiresAt = aWSTemporaryCredentials2.getExpiresAt()) == null) ? null : c74.m20363b(expiresAt), (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? null : null);
    }
}

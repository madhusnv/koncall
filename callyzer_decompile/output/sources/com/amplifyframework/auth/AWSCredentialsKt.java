package com.amplifyframework.auth;

import j$.time.Instant;
import kotlin.jvm.internal.AbstractC4154l;
import sb.C6776c;
import sb.InterfaceC6777d;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCredentialsKt {
    public static final InterfaceC6777d toSdkCredentials(AWSCredentials aWSCredentials) {
        Instant expiresAt;
        AbstractC4154l.m8923f(aWSCredentials, "<this>");
        String accessKeyId = aWSCredentials.getAccessKeyId();
        String secretAccessKey = aWSCredentials.getSecretAccessKey();
        boolean z6 = aWSCredentials instanceof AWSTemporaryCredentials;
        C7126c c7126c = null;
        AWSTemporaryCredentials aWSTemporaryCredentials = z6 ? (AWSTemporaryCredentials) aWSCredentials : null;
        String sessionToken = aWSTemporaryCredentials != null ? aWSTemporaryCredentials.getSessionToken() : null;
        AWSTemporaryCredentials aWSTemporaryCredentials2 = z6 ? (AWSTemporaryCredentials) aWSCredentials : null;
        if (aWSTemporaryCredentials2 != null && (expiresAt = aWSTemporaryCredentials2.getExpiresAt()) != null) {
            c7126c = new C7126c(expiresAt);
        }
        return C6776c.m12972a(accessKeyId, secretAccessKey, sessionToken, c7126c, null, 48);
    }
}

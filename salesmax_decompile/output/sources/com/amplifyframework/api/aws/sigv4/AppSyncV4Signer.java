package com.amplifyframework.api.aws.sigv4;

import p001o.sq8;
import p001o.u81;

/* loaded from: classes5.dex */
public final class AppSyncV4Signer extends AWS4Signer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSyncV4Signer(String str) {
        super(str);
        sq8.m48649h(str, "regionName");
        setAwsSignedBodyHeaderType(u81.X_AMZ_CONTENT_SHA256);
    }
}

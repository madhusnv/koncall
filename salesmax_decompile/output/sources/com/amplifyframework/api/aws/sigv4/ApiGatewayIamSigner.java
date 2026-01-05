package com.amplifyframework.api.aws.sigv4;

import p001o.sq8;

/* loaded from: classes5.dex */
public final class ApiGatewayIamSigner extends AWS4Signer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiGatewayIamSigner(String str) {
        super(str);
        sq8.m48649h(str, "regionName");
    }
}

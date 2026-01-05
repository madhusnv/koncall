package com.amplifyframework.storage.s3.service;

import p001o.efa;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSS3StorageService$listFiles$1$result$1 extends kf9 implements xk7 {
    final /* synthetic */ String $path;
    final /* synthetic */ AWSS3StorageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageService$listFiles$1$result$1(AWSS3StorageService aWSS3StorageService, String str) {
        super(1);
        this.this$0 = aWSS3StorageService;
        this.$path = str;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((efa.C13180a) obj);
        return y3i.f54824a;
    }

    public final void invoke(efa.C13180a c13180a) {
        sq8.m48649h(c13180a, "$this$listObjectsV2Paginated");
        c13180a.m24949m(this.this$0.s3BucketName);
        c13180a.m24953q(this.$path);
    }
}

package com.amplifyframework.storage.s3.service;

import p001o.cxe;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSS3StorageService$getPresignedUrl$presignUrlRequest$1 extends kf9 implements xk7 {
    final /* synthetic */ boolean $useAccelerateEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageService$getPresignedUrl$presignUrlRequest$1(boolean z) {
        super(1);
        this.$useAccelerateEndpoint = z;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((cxe.C12766c.a) obj);
        return y3i.f54824a;
    }

    public final void invoke(cxe.C12766c.a aVar) {
        sq8.m48649h(aVar, "$this$withConfig");
        aVar.m22017P(Boolean.valueOf(this.$useAccelerateEndpoint));
    }
}

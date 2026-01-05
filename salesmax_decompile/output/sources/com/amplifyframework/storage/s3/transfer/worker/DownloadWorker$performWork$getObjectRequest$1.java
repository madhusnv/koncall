package com.amplifyframework.storage.s3.transfer.worker;

import p001o.kf9;
import p001o.sq8;
import p001o.wq7;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class DownloadWorker$performWork$getObjectRequest$1 extends kf9 implements xk7 {
    final /* synthetic */ long $downloadedBytes;
    final /* synthetic */ DownloadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker$performWork$getObjectRequest$1(DownloadWorker downloadWorker, long j) {
        super(1);
        this.this$0 = downloadWorker;
        this.$downloadedBytes = j;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((wq7.C17946a) obj);
        return y3i.f54824a;
    }

    public final void invoke(wq7.C17946a c17946a) {
        sq8.m48649h(c17946a, "$this$invoke");
        c17946a.m54852x(this.this$0.getTransferRecord$aws_storage_s3_release().getKey());
        c17946a.m54851w(this.this$0.getTransferRecord$aws_storage_s3_release().getBucketName());
        c17946a.m54853y("bytes=" + this.$downloadedBytes + "-");
    }
}

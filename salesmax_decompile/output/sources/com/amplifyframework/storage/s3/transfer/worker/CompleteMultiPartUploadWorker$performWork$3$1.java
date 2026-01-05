package com.amplifyframework.storage.s3.transfer.worker;

import java.util.List;
import p001o.kf9;
import p001o.mm3;
import p001o.om3;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class CompleteMultiPartUploadWorker$performWork$3$1 extends kf9 implements xk7 {
    final /* synthetic */ List<om3> $completedParts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteMultiPartUploadWorker$performWork$3$1(List<om3> list) {
        super(1);
        this.$completedParts = list;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((mm3.C15360a) obj);
        return y3i.f54824a;
    }

    public final void invoke(mm3.C15360a c15360a) {
        sq8.m48649h(c15360a, "$this$invoke");
        c15360a.m39345c(this.$completedParts);
    }
}

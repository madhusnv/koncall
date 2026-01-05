package com.amplifyframework.storage.s3.transfer;

import p001o.kf9;
import p001o.om3;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class TransferDB$queryPartETagsOfUpload$1$1 extends kf9 implements xk7 {
    final /* synthetic */ int $part;
    final /* synthetic */ String $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferDB$queryPartETagsOfUpload$1$1(int i, String str) {
        super(1);
        this.$part = i;
        this.$tag = str;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((om3.C15838a) obj);
        return y3i.f54824a;
    }

    public final void invoke(om3.C15838a c15838a) {
        sq8.m48649h(c15838a, "$this$invoke");
        c15838a.m42421i(Integer.valueOf(this.$part));
        c15838a.m42420h(this.$tag);
    }
}

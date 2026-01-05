package com.amplifyframework.predictions.aws.service;

import java.nio.ByteBuffer;
import p001o.kf9;
import p001o.sq8;
import p001o.tv5;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSTextractService$detectDocumentText$1$result$1$1 extends kf9 implements xk7 {
    final /* synthetic */ ByteBuffer $imageData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSTextractService$detectDocumentText$1$result$1$1(ByteBuffer byteBuffer) {
        super(1);
        this.$imageData = byteBuffer;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((tv5.C17239a) obj);
        return y3i.f54824a;
    }

    public final void invoke(tv5.C17239a c17239a) {
        sq8.m48649h(c17239a, "$this$invoke");
        c17239a.m50709d(this.$imageData.array());
    }
}

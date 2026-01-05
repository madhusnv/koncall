package com.amplifyframework.storage.s3.transfer;

import p001o.l75;
import p001o.n64;
import p001o.o64;

@l75(m36647c = "com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates$readFrom$1", m36648f = "ProgressListenerHttpInterceptor.kt", m36649l = {103}, m36650m = "read")
/* renamed from: com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates$readFrom$1$read$1 */
/* loaded from: classes5.dex */
public final class C10696x7624dd82 extends o64 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C10695xbbc034a5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10696x7624dd82(C10695xbbc034a5 c10695xbbc034a5, n64 n64Var) {
        super(n64Var);
        this.this$0 = c10695xbbc034a5;
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.read(null, 0L, this);
    }
}

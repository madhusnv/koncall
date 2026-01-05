package com.amplifyframework.storage.s3.transfer;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates$readFrom$1", m15344f = "ProgressListenerHttpInterceptor.kt", m15345l = {93}, m15346m = "read")
/* renamed from: com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates$readFrom$1$read$1 */
/* loaded from: classes.dex */
public final class C1248x7624dd82 extends AbstractC8193c {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1247xbbc034a5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248x7624dd82(C1247xbbc034a5 c1247xbbc034a5, InterfaceC7559c<? super C1248x7624dd82> interfaceC7559c) {
        super(interfaceC7559c);
        this.this$0 = c1247xbbc034a5;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.read(null, 0L, this);
    }
}

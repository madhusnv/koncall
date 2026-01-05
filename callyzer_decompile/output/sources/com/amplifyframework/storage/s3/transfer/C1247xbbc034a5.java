package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor;
import wc.InterfaceC7989w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates$readFrom$1 */
/* loaded from: classes.dex */
public final class C1247xbbc034a5 implements InterfaceC7989w {
    private final /* synthetic */ InterfaceC7989w $$delegate_0;
    final /* synthetic */ ProgressListenerInterceptor.SdkByteReadChannelWithProgressUpdates this$0;

    public C1247xbbc034a5(ProgressListenerInterceptor.SdkByteReadChannelWithProgressUpdates sdkByteReadChannelWithProgressUpdates) {
        this.this$0 = sdkByteReadChannelWithProgressUpdates;
        this.$$delegate_0 = sdkByteReadChannelWithProgressUpdates.getDelegate();
    }

    @Override // wc.InterfaceC7989w
    public boolean cancel(Throwable th2) {
        return this.this$0.getDelegate().cancel(th2);
    }

    @Override // wc.InterfaceC7989w
    public int getAvailableForRead() {
        return this.this$0.getDelegate().getAvailableForRead();
    }

    @Override // wc.InterfaceC7989w
    public Throwable getClosedCause() {
        return this.$$delegate_0.getClosedCause();
    }

    @Override // wc.InterfaceC7989w
    public boolean isClosedForRead() {
        return this.this$0.getDelegate().isClosedForRead();
    }

    @Override // wc.InterfaceC7989w
    public boolean isClosedForWrite() {
        return this.this$0.getDelegate().isClosedForWrite();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wc.InterfaceC7989w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object read(wc.C7985s r5, long r6, uw.InterfaceC7559c<? super java.lang.Long> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.amplifyframework.storage.s3.transfer.C1248x7624dd82
            if (r0 == 0) goto L13
            r0 = r8
            com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates$readFrom$1$read$1 r0 = (com.amplifyframework.storage.s3.transfer.C1248x7624dd82) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates$readFrom$1$read$1 r0 = new com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates$readFrom$1$read$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            wc.s r5 = (wc.C7985s) r5
            og.od.m10798c(r8)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r8)
            com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates r8 = r4.this$0
            wc.w r8 = r8.getDelegate()
            r2 = 0
            r0.L$0 = r2
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r8 = wc.AbstractC7984r.m15161e(r8, r5, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates r5 = r4.this$0
            r6 = r8
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L60
            com.amplifyframework.storage.s3.transfer.ProgressListener r5 = com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor.SdkByteReadChannelWithProgressUpdates.access$getProgressListener$p(r5)
            r5.progressChanged(r6)
        L60:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.storage.s3.transfer.C1247xbbc034a5.read(wc.s, long, uw.c):java.lang.Object");
    }
}

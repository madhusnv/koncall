package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor;
import p001o.n64;
import p001o.t6f;
import p001o.uq8;
import p001o.wre;
import p001o.y6f;
import p001o.z6f;

/* renamed from: com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SdkByteReadChannelWithProgressUpdates$readFrom$1 */
/* loaded from: classes5.dex */
public final class C10695xbbc034a5 implements y6f {
    private final /* synthetic */ y6f $$delegate_0;
    final /* synthetic */ ProgressListenerInterceptor.SdkByteReadChannelWithProgressUpdates this$0;

    public C10695xbbc034a5(ProgressListenerInterceptor.SdkByteReadChannelWithProgressUpdates sdkByteReadChannelWithProgressUpdates) {
        this.this$0 = sdkByteReadChannelWithProgressUpdates;
        this.$$delegate_0 = sdkByteReadChannelWithProgressUpdates.getDelegate();
    }

    @Override // p001o.y6f
    public boolean cancel(Throwable th) {
        return this.this$0.getDelegate().cancel(th);
    }

    @Override // p001o.y6f
    public int getAvailableForRead() {
        return this.this$0.getDelegate().getAvailableForRead();
    }

    @Override // p001o.y6f
    public Throwable getClosedCause() {
        return this.$$delegate_0.getClosedCause();
    }

    @Override // p001o.y6f
    public boolean isClosedForRead() {
        return this.this$0.getDelegate().isClosedForRead();
    }

    @Override // p001o.y6f
    public boolean isClosedForWrite() {
        return this.this$0.getDelegate().isClosedForWrite();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.y6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object read(t6f t6fVar, long j, n64 n64Var) {
        C10696x7624dd82 c10696x7624dd82;
        C10695xbbc034a5 c10695xbbc034a5;
        if (n64Var instanceof C10696x7624dd82) {
            c10696x7624dd82 = (C10696x7624dd82) n64Var;
            int i = c10696x7624dd82.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c10696x7624dd82.label = i - Integer.MIN_VALUE;
            } else {
                c10696x7624dd82 = new C10696x7624dd82(this, n64Var);
            }
        }
        Object objM58851a = c10696x7624dd82.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c10696x7624dd82.label;
        if (i2 == 0) {
            wre.m54934b(objM58851a);
            y6f delegate = this.this$0.getDelegate();
            c10696x7624dd82.L$0 = this;
            c10696x7624dd82.label = 1;
            objM58851a = z6f.m58851a(delegate, t6fVar, c10696x7624dd82);
            if (objM58851a == objM51918f) {
                return objM51918f;
            }
            c10695xbbc034a5 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10695xbbc034a5 = (C10695xbbc034a5) c10696x7624dd82.L$0;
            wre.m54934b(objM58851a);
        }
        ProgressListenerInterceptor.SdkByteReadChannelWithProgressUpdates sdkByteReadChannelWithProgressUpdates = c10695xbbc034a5.this$0;
        long jLongValue = ((Number) objM58851a).longValue();
        if (jLongValue > 0) {
            sdkByteReadChannelWithProgressUpdates.progressListener.progressChanged(jLongValue);
        }
        return objM58851a;
    }
}

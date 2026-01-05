package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor;
import java.io.IOException;
import jc.AbstractC3740p;
import jc.AbstractC3741q;
import jc.AbstractC3744t;
import jc.AbstractC3745u;
import jc.C3743s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6364n;
import tc.InterfaceC7116a;
import uc.C7394a;
import uw.InterfaceC7559c;
import wc.C7985s;
import wc.InterfaceC7989w;
import wc.e0;
import zb.InterfaceC8909c;
import zb.InterfaceC8913g;
import zb.InterfaceC8914h;
import zb.InterfaceC8915i;
import zb.InterfaceC8916j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ProgressListenerInterceptor implements InterfaceC8909c {
    private final ProgressListener progressListener;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SdkByteReadChannelWithProgressUpdates extends AbstractC3741q {
        private final InterfaceC7989w delegate;
        private final AbstractC3741q httpBody;
        private final ProgressListener progressListener;

        public SdkByteReadChannelWithProgressUpdates(AbstractC3741q httpBody, ProgressListener progressListener) {
            AbstractC4154l.m8923f(httpBody, "httpBody");
            AbstractC4154l.m8923f(progressListener, "progressListener");
            this.httpBody = httpBody;
            this.progressListener = progressListener;
            this.delegate = httpBody.readFrom();
        }

        @Override // jc.AbstractC3745u
        public Long getContentLength() {
            return this.httpBody.getContentLength();
        }

        public final InterfaceC7989w getDelegate() {
            return this.delegate;
        }

        @Override // jc.AbstractC3741q
        public InterfaceC7989w readFrom() {
            return new C1247xbbc034a5(this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SourceContentWithProgressUpdates extends AbstractC3744t {
        private final e0 delegate;
        private final ProgressListener progressListener;
        private final AbstractC3744t sourceContent;

        public SourceContentWithProgressUpdates(AbstractC3744t sourceContent, ProgressListener progressListener) {
            AbstractC4154l.m8923f(sourceContent, "sourceContent");
            AbstractC4154l.m8923f(progressListener, "progressListener");
            this.sourceContent = sourceContent;
            this.progressListener = progressListener;
            this.delegate = sourceContent.readFrom();
        }

        @Override // jc.AbstractC3745u
        public Long getContentLength() {
            return this.sourceContent.getContentLength();
        }

        @Override // jc.AbstractC3744t
        public e0 readFrom() {
            return new e0() { // from class: com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SourceContentWithProgressUpdates$readFrom$1
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.this$0.delegate.close();
                }

                @Override // wc.e0
                public long read(C7985s sink, long j6) {
                    AbstractC4154l.m8923f(sink, "sink");
                    long j10 = this.this$0.delegate.read(sink, j6);
                    ProgressListenerInterceptor.SourceContentWithProgressUpdates sourceContentWithProgressUpdates = this.this$0;
                    if (j10 > 0) {
                        sourceContentWithProgressUpdates.progressListener.progressChanged(j10);
                    }
                    return j10;
                }
            };
        }
    }

    public ProgressListenerInterceptor(ProgressListener progressListener) {
        AbstractC4154l.m8923f(progressListener, "progressListener");
        this.progressListener = progressListener;
    }

    public final AbstractC3745u convertBodyWithProgressUpdates(AbstractC3745u httpBody) {
        AbstractC4154l.m8923f(httpBody, "httpBody");
        if (httpBody instanceof AbstractC3741q) {
            return new SdkByteReadChannelWithProgressUpdates((AbstractC3741q) httpBody, this.progressListener);
        }
        if (httpBody instanceof AbstractC3744t) {
            return new SourceContentWithProgressUpdates((AbstractC3744t) httpBody, this.progressListener);
        }
        if ((httpBody instanceof AbstractC3740p) || (httpBody instanceof C3743s)) {
            return httpBody;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public Object mo16556modifyBeforeAttemptCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c<? super C6364n> interfaceC7559c) {
        return interfaceC8916j.mo12203c();
    }

    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    public Object mo16557modifyBeforeCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c<? super C6364n> interfaceC7559c) {
        return interfaceC8916j.mo12203c();
    }

    @Override // zb.InterfaceC8909c
    public Object modifyBeforeDeserialization(InterfaceC8914h interfaceC8914h, InterfaceC7559c<? super C7394a> interfaceC7559c) {
        return interfaceC8914h.mo12201a();
    }

    @Override // zb.InterfaceC8909c
    public Object modifyBeforeRetryLoop(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
        return interfaceC8913g.mo12204d();
    }

    @Override // zb.InterfaceC8909c
    public Object modifyBeforeSerialization(InterfaceC8915i interfaceC8915i, InterfaceC7559c<Object> interfaceC7559c) {
        return interfaceC8915i.mo12205e();
    }

    @Override // zb.InterfaceC8909c
    public Object modifyBeforeSigning(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
        return interfaceC8913g.mo12204d();
    }

    @Override // zb.InterfaceC8909c
    public Object modifyBeforeTransmit(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
        return interfaceC8913g.mo12204d();
    }

    @Override // zb.InterfaceC8909c
    public void readAfterAttempt(InterfaceC8916j interfaceC8916j) {
        super.readAfterAttempt(interfaceC8916j);
    }

    @Override // zb.InterfaceC8909c
    public void readAfterDeserialization(InterfaceC8916j interfaceC8916j) {
        super.readAfterDeserialization(interfaceC8916j);
    }

    @Override // zb.InterfaceC8909c
    public void readAfterExecution(InterfaceC8916j interfaceC8916j) {
        super.readAfterExecution(interfaceC8916j);
    }

    @Override // zb.InterfaceC8909c
    public void readAfterSerialization(InterfaceC8913g interfaceC8913g) {
        super.readAfterSerialization(interfaceC8913g);
    }

    @Override // zb.InterfaceC8909c
    public void readAfterSigning(InterfaceC8913g interfaceC8913g) {
        super.readAfterSigning(interfaceC8913g);
    }

    @Override // zb.InterfaceC8909c
    public void readAfterTransmit(InterfaceC8914h interfaceC8914h) {
        super.readAfterTransmit(interfaceC8914h);
    }

    @Override // zb.InterfaceC8909c
    public void readBeforeAttempt(InterfaceC8913g interfaceC8913g) {
        super.readBeforeAttempt(interfaceC8913g);
    }

    @Override // zb.InterfaceC8909c
    public void readBeforeDeserialization(InterfaceC8914h interfaceC8914h) {
        super.readBeforeDeserialization(interfaceC8914h);
    }

    @Override // zb.InterfaceC8909c
    public void readBeforeExecution(InterfaceC8915i interfaceC8915i) {
        super.readBeforeExecution(interfaceC8915i);
    }

    @Override // zb.InterfaceC8909c
    public void readBeforeSerialization(InterfaceC8915i interfaceC8915i) {
        super.readBeforeSerialization(interfaceC8915i);
    }

    @Override // zb.InterfaceC8909c
    public void readBeforeSigning(InterfaceC8913g interfaceC8913g) {
        super.readBeforeSigning(interfaceC8913g);
    }

    @Override // zb.InterfaceC8909c
    public void readBeforeTransmit(InterfaceC8913g interfaceC8913g) {
        super.readBeforeTransmit(interfaceC8913g);
    }
}

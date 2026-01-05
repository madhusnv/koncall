package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor;
import p001o.c2e;
import p001o.e2e;
import p001o.eme;
import p001o.ere;
import p001o.h8f;
import p001o.m18;
import p001o.n64;
import p001o.sn8;
import p001o.sq8;
import p001o.szb;
import p001o.t6f;
import p001o.y6f;

/* loaded from: classes5.dex */
public class ProgressListenerInterceptor implements sn8 {
    private final ProgressListener progressListener;

    public static final class SdkByteReadChannelWithProgressUpdates extends m18.AbstractC15194b {
        private final y6f delegate;
        private final m18.AbstractC15194b httpBody;
        private final ProgressListener progressListener;

        public SdkByteReadChannelWithProgressUpdates(m18.AbstractC15194b abstractC15194b, ProgressListener progressListener) {
            sq8.m48649h(abstractC15194b, "httpBody");
            sq8.m48649h(progressListener, "progressListener");
            this.httpBody = abstractC15194b;
            this.progressListener = progressListener;
            this.delegate = abstractC15194b.readFrom();
        }

        @Override // p001o.m18
        public Long getContentLength() {
            return this.httpBody.getContentLength();
        }

        public final y6f getDelegate() {
            return this.delegate;
        }

        @Override // p001o.m18.AbstractC15194b
        public y6f readFrom() {
            return new C10695xbbc034a5(this);
        }
    }

    public static final class SourceContentWithProgressUpdates extends m18.AbstractC15197e {
        private final h8f delegate;
        private final ProgressListener progressListener;
        private final m18.AbstractC15197e sourceContent;

        public SourceContentWithProgressUpdates(m18.AbstractC15197e abstractC15197e, ProgressListener progressListener) {
            sq8.m48649h(abstractC15197e, "sourceContent");
            sq8.m48649h(progressListener, "progressListener");
            this.sourceContent = abstractC15197e;
            this.progressListener = progressListener;
            this.delegate = abstractC15197e.readFrom();
        }

        @Override // p001o.m18
        public Long getContentLength() {
            return this.sourceContent.getContentLength();
        }

        @Override // p001o.m18.AbstractC15197e
        public h8f readFrom() {
            return new h8f() { // from class: com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor$SourceContentWithProgressUpdates$readFrom$1
                @Override // p001o.h8f, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    this.this$0.delegate.close();
                }

                @Override // p001o.h8f
                public long read(t6f t6fVar, long j) {
                    sq8.m48649h(t6fVar, "sink");
                    long j2 = this.this$0.delegate.read(t6fVar, j);
                    ProgressListenerInterceptor.SourceContentWithProgressUpdates sourceContentWithProgressUpdates = this.this$0;
                    if (j2 > 0) {
                        sourceContentWithProgressUpdates.progressListener.progressChanged(j2);
                    }
                    return j2;
                }
            };
        }
    }

    public ProgressListenerInterceptor(ProgressListener progressListener) {
        sq8.m48649h(progressListener, "progressListener");
        this.progressListener = progressListener;
    }

    public final m18 convertBodyWithProgressUpdates(m18 m18Var) {
        m18 sourceContentWithProgressUpdates;
        sq8.m48649h(m18Var, "httpBody");
        if (m18Var instanceof m18.AbstractC15194b) {
            sourceContentWithProgressUpdates = new SdkByteReadChannelWithProgressUpdates((m18.AbstractC15194b) m18Var, this.progressListener);
        } else {
            if (!(m18Var instanceof m18.AbstractC15197e)) {
                if ((m18Var instanceof m18.AbstractC15193a) || (m18Var instanceof m18.C15196d)) {
                    return m18Var;
                }
                throw new szb();
            }
            sourceContentWithProgressUpdates = new SourceContentWithProgressUpdates((m18.AbstractC15197e) m18Var, this.progressListener);
        }
        return sourceContentWithProgressUpdates;
    }

    @Override // p001o.sn8
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public Object mo68712modifyBeforeAttemptCompletiongIAlus(ere ereVar, n64 n64Var) {
        return sn8.C16877a.m48563a(this, ereVar, n64Var);
    }

    @Override // p001o.sn8
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    public Object mo68713modifyBeforeCompletiongIAlus(ere ereVar, n64 n64Var) {
        return sn8.C16877a.m48564b(this, ereVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeDeserialization(e2e e2eVar, n64 n64Var) {
        return sn8.C16877a.m48565c(this, e2eVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeRetryLoop(c2e c2eVar, n64 n64Var) {
        return sn8.C16877a.m48566d(this, c2eVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeSerialization(eme emeVar, n64 n64Var) {
        return sn8.C16877a.m48567e(this, emeVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeSigning(c2e c2eVar, n64 n64Var) {
        return sn8.C16877a.m48568f(this, c2eVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeTransmit(c2e c2eVar, n64 n64Var) {
        return sn8.C16877a.m48569g(this, c2eVar, n64Var);
    }

    @Override // p001o.sn8
    public void readAfterAttempt(ere ereVar) {
        sn8.C16877a.m48570h(this, ereVar);
    }

    @Override // p001o.sn8
    public void readAfterDeserialization(ere ereVar) {
        sn8.C16877a.m48571i(this, ereVar);
    }

    @Override // p001o.sn8
    public void readAfterExecution(ere ereVar) {
        sn8.C16877a.m48572j(this, ereVar);
    }

    @Override // p001o.sn8
    public void readAfterSerialization(c2e c2eVar) {
        sn8.C16877a.m48573k(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readAfterSigning(c2e c2eVar) {
        sn8.C16877a.m48574l(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readAfterTransmit(e2e e2eVar) {
        sn8.C16877a.m48575m(this, e2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeAttempt(c2e c2eVar) {
        sn8.C16877a.m48576n(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeDeserialization(e2e e2eVar) {
        sn8.C16877a.m48577o(this, e2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeExecution(eme emeVar) {
        sn8.C16877a.m48578p(this, emeVar);
    }

    @Override // p001o.sn8
    public void readBeforeSerialization(eme emeVar) {
        sn8.C16877a.m48579q(this, emeVar);
    }

    @Override // p001o.sn8
    public void readBeforeSigning(c2e c2eVar) {
        sn8.C16877a.m48580r(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeTransmit(c2e c2eVar) {
        sn8.C16877a.m48581s(this, c2eVar);
    }
}

package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.amplifyframework.storage.s3.transfer.DownloadProgressListener;
import com.amplifyframework.storage.s3.transfer.DownloadProgressListenerInterceptor;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import ex.InterfaceC2141e;
import gb.C2554d;
import gs.C2715a;
import hc.AbstractC2879b;
import hc.AbstractC2880c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import jc.C3747w;
import jc.C3748x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import mb.j0;
import mb.m0;
import og.od;
import qw.a0;
import t8.AbstractC7075u;
import t8.C7074t;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wc.AbstractC7984r;
import wc.e0;
import ww.AbstractC8193c;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DownloadWorker extends SuspendingTransferWorker {
    private final StorageTransferClientProvider clientProvider;
    private final long defaultBufferSize;
    private DownloadProgressListener downloadProgressListener;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.worker.DownloadWorker", m15344f = "DownloadWorker.kt", m15345l = {73}, m15346m = "performWork")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$performWork$1 */
    public static final class C12601 extends AbstractC8193c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C12601(InterfaceC7559c<? super C12601> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadWorker.this.performWork(this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$performWork$4", m15344f = "DownloadWorker.kt", m15345l = {79}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$performWork$4 */
    public static final class C12614 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ long $downloadedBytes;
        final /* synthetic */ File $file;
        int I$0;
        long J$0;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DownloadWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12614(long j6, DownloadWorker downloadWorker, File file, InterfaceC7559c<? super C12614> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$downloadedBytes = j6;
            this.this$0 = downloadWorker;
            this.$file = file;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            C12614 c12614 = new C12614(this.$downloadedBytes, this.this$0, this.$file, interfaceC7559c);
            c12614.L$0 = obj;
            return c12614;
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            long jLongValue;
            long j6;
            Long lMo6995a;
            m0 m0Var = (m0) this.L$0;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                AbstractC2880c abstractC2880c = m0Var.f23329b;
                jLongValue = ((abstractC2880c == null || (lMo6995a = abstractC2880c.mo6995a()) == null) ? 0L : lMo6995a.longValue()) + this.$downloadedBytes;
                this.this$0.getTransferRecord$aws_storage_s3_release().setBytesTotal(jLongValue);
                this.this$0.getTransferRecord$aws_storage_s3_release().setBytesCurrent(this.$downloadedBytes);
                File parentFile = this.$file.getParentFile();
                if (parentFile != null) {
                    if (parentFile.exists()) {
                        parentFile = null;
                    }
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                }
                AbstractC2880c abstractC2880c2 = m0Var.f23329b;
                if (abstractC2880c2 != null) {
                    DownloadWorker downloadWorker = this.this$0;
                    File file = this.$file;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.J$0 = jLongValue;
                    this.I$0 = 0;
                    this.label = 1;
                    if (downloadWorker.writeStreamToFile(abstractC2880c2, file, this) == enumC7794a) {
                        return enumC7794a;
                    }
                    j6 = jLongValue;
                }
                this.this$0.transferStatusUpdater.updateProgress(this.this$0.getTransferRecord$aws_storage_s3_release().getId(), jLongValue, jLongValue, true, (16 & 16) != 0);
                return new C7074t(this.this$0.getOutputData$aws_storage_s3_release());
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j6 = this.J$0;
            od.m10798c(obj);
            jLongValue = j6;
            this.this$0.transferStatusUpdater.updateProgress(this.this$0.getTransferRecord$aws_storage_s3_release().getId(), jLongValue, jLongValue, true, (16 & 16) != 0);
            return new C7074t(this.this$0.getOutputData$aws_storage_s3_release());
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(m0 m0Var, InterfaceC7559c<? super AbstractC7075u> interfaceC7559c) {
            return ((C12614) create(m0Var, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$writeStreamToFile$2", m15344f = "DownloadWorker.kt", m15345l = {95}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.DownloadWorker$writeStreamToFile$2 */
    public static final class C12622 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ File $file;
        final /* synthetic */ AbstractC2880c $stream;
        int label;
        final /* synthetic */ DownloadWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12622(AbstractC2880c abstractC2880c, File file, DownloadWorker downloadWorker, InterfaceC7559c<? super C12622> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$stream = abstractC2880c;
            this.$file = file;
            this.this$0 = downloadWorker;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12622(this.$stream, this.$file, this.this$0, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int iN0;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            AbstractC2880c abstractC2880c = this.$stream;
            if ((abstractC2880c instanceof C3748x) || (abstractC2880c instanceof C3747w)) {
                File file = this.$file;
                this.label = 1;
                C0496f c0496f = tx.m0.f34659a;
                Object objM13475K = c0.m13475K(ExecutorC0495e.f3538c, new C2715a(abstractC2880c, file, null, 5), this);
                return objM13475K == enumC7794a ? enumC7794a : objM13475K;
            }
            if (!(abstractC2880c instanceof AbstractC2879b)) {
                throw new NoWhenBranchMatchedException();
            }
            e0 e0VarMo6994c = ((AbstractC2879b) abstractC2880c).mo6994c();
            Long lMo6995a = this.$stream.mo6995a();
            long jLongValue = lMo6995a != null ? lMo6995a.longValue() : 0L;
            int i11 = (int) this.this$0.defaultBufferSize;
            byte[] bArr = new byte[i11];
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.$file, this.$file.length() > 0));
            while (c0.m13500w(getContext()) && jLongValue != 0 && (iN0 = AbstractC7984r.m15159c(e0VarMo6994c).n0((int) Math.min(i11, jLongValue), bArr)) != -1) {
                try {
                    bufferedOutputStream.write(bArr, 0, iN0);
                } finally {
                }
            }
            if (AbstractC7984r.m15159c(e0VarMo6994c).mo15147e()) {
                bufferedOutputStream.flush();
            }
            bufferedOutputStream.close();
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<Object> interfaceC7559c) {
            return ((C12622) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(StorageTransferClientProvider clientProvider, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater, Context context, WorkerParameters workerParameters) {
        super(transferStatusUpdater, transferDB, context, workerParameters);
        AbstractC4154l.m8923f(clientProvider, "clientProvider");
        AbstractC4154l.m8923f(transferDB, "transferDB");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParameters, "workerParameters");
        this.clientProvider = clientProvider;
        this.transferDB = transferDB;
        this.transferStatusUpdater = transferStatusUpdater;
        this.defaultBufferSize = 8192L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 performWork$lambda$0(DownloadWorker downloadWorker, C2554d withConfig) {
        AbstractC4154l.m8923f(withConfig, "$this$withConfig");
        withConfig.f13913m = Boolean.valueOf(downloadWorker.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1);
        return a0.f30746a;
    }

    private static final a0 performWork$lambda$1(DownloadWorker downloadWorker, long j6, j0 GetObjectRequest) {
        AbstractC4154l.m8923f(GetObjectRequest, "$this$GetObjectRequest");
        GetObjectRequest.f23259b = downloadWorker.getTransferRecord$aws_storage_s3_release().getKey();
        GetObjectRequest.f23258a = downloadWorker.getTransferRecord$aws_storage_s3_release().getBucketName();
        GetObjectRequest.f23260c = "bytes=" + j6 + "-";
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 performWork$lambda$2(DownloadWorker downloadWorker, C2554d withConfig) {
        AbstractC4154l.m8923f(withConfig, "$this$withConfig");
        ArrayList arrayList = withConfig.f13920v;
        DownloadProgressListener downloadProgressListener = downloadWorker.downloadProgressListener;
        if (downloadProgressListener == null) {
            AbstractC4154l.m8928k("downloadProgressListener");
            throw null;
        }
        arrayList.add(new DownloadProgressListenerInterceptor(downloadProgressListener));
        withConfig.f13913m = Boolean.valueOf(downloadWorker.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1);
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeStreamToFile(AbstractC2880c abstractC2880c, File file, InterfaceC7559c<? super a0> interfaceC7559c) throws Throwable {
        C0496f c0496f = tx.m0.f34659a;
        Object objM13475K = c0.m13475K(ExecutorC0495e.f3538c, new C12622(abstractC2880c, file, this, null), interfaceC7559c);
        return objM13475K == EnumC7794a.COROUTINE_SUSPENDED ? objM13475K : a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performWork(uw.InterfaceC7559c<? super t8.AbstractC7075u> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.storage.s3.transfer.worker.DownloadWorker.performWork(uw.c):java.lang.Object");
    }
}

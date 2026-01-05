package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.transfer.PartUploadProgressListener;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import com.amplifyframework.storage.s3.transfer.UploadProgressListenerInterceptor;
import java.io.File;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.c7i;
import p001o.cxe;
import p001o.d7i;
import p001o.dxe;
import p001o.h84;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.qm1;
import p001o.sq1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class PartUploadTransferWorker extends BlockingTransferWorker {
    private final StorageTransferClientProvider clientProvider;
    private int maxRetryCount;
    private String multiPartUploadId;
    private PartUploadProgressListener partUploadProgressListener;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.worker.PartUploadTransferWorker$performWork$1", m36648f = "PartUploadTransferWorker.kt", m36649l = {Opcodes.POP2}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.PartUploadTransferWorker$performWork$1 */
    public static final class C107141 extends jgg implements nl7 {
        final /* synthetic */ cxe $s3;
        int label;
        final /* synthetic */ PartUploadTransferWorker this$0;

        /* renamed from: com.amplifyframework.storage.s3.transfer.worker.PartUploadTransferWorker$performWork$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ PartUploadTransferWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PartUploadTransferWorker partUploadTransferWorker) {
                super(1);
                this.this$0 = partUploadTransferWorker;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((cxe.C12766c.a) obj);
                return y3i.f54824a;
            }

            public final void invoke(cxe.C12766c.a aVar) {
                sq8.m48649h(aVar, "$this$withConfig");
                List listM22007F = aVar.m22007F();
                PartUploadProgressListener partUploadProgressListener = this.this$0.partUploadProgressListener;
                if (partUploadProgressListener == null) {
                    sq8.m48667z("partUploadProgressListener");
                    partUploadProgressListener = null;
                }
                listM22007F.add(new UploadProgressListenerInterceptor(partUploadProgressListener));
                aVar.m22017P(Boolean.valueOf(this.this$0.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107141(cxe cxeVar, PartUploadTransferWorker partUploadTransferWorker, n64 n64Var) {
            super(2, n64Var);
            this.$s3 = cxeVar;
            this.this$0 = partUploadTransferWorker;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C107141(this.$s3, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                cxe cxeVarM23925a = dxe.m23925a(this.$s3, new AnonymousClass1(this.this$0));
                PartUploadTransferWorker partUploadTransferWorker = this.this$0;
                c7i.C12585a c12585a = new c7i.C12585a();
                c12585a.m20413t(partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getBucketName());
                c12585a.m20414u(partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getKey());
                String str = partUploadTransferWorker.multiPartUploadId;
                if (str == null) {
                    sq8.m48667z("multiPartUploadId");
                    str = null;
                }
                c12585a.m20416w(str);
                c12585a.m20412s(sq1.m48627b(new File(partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getFile()), partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getFileOffset(), (partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getFileOffset() + partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getBytesTotal()) - 1));
                c12585a.m20415v(ml1.m39304d(partUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getPartNumber()));
                c7i c7iVarM20394a = c12585a.m20394a();
                this.label = 1;
                obj = cxeVarM23925a.V1(c7iVarM20394a, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C107141) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartUploadTransferWorker(StorageTransferClientProvider storageTransferClientProvider, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater, Context context, WorkerParameters workerParameters) {
        super(transferStatusUpdater, transferDB, context, workerParameters);
        sq8.m48649h(storageTransferClientProvider, "clientProvider");
        sq8.m48649h(transferDB, "transferDB");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "workerParameters");
        this.clientProvider = storageTransferClientProvider;
        this.transferDB = transferDB;
        this.transferStatusUpdater = transferStatusUpdater;
        this.maxRetryCount = 3;
    }

    private final void updateProgress() {
        this.transferStatusUpdater.updateProgress(getTransferRecord$aws_storage_s3_release().getId(), getTransferRecord$aws_storage_s3_release().getBytesTotal(), getTransferRecord$aws_storage_s3_release().getBytesTotal(), false, (16 & 16) != 0);
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BlockingTransferWorker
    public int getMaxRetryCount$aws_storage_s3_release() {
        return this.maxRetryCount;
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BlockingTransferWorker
    public ListenableWorker.Result performWork() {
        this.transferStatusUpdater.updateTransferState(getTransferRecord$aws_storage_s3_release().getMainUploadId(), TransferState.IN_PROGRESS);
        Object obj = getInputData().getKeyValueMap().get("multipartUploadId");
        sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.String");
        this.multiPartUploadId = (String) obj;
        this.partUploadProgressListener = new PartUploadProgressListener(getTransferRecord$aws_storage_s3_release(), this.transferStatusUpdater);
        String strM22460a = ((d7i) qm1.m45641b(null, new C107141(this.clientProvider.getStorageTransferClient(getTransferRecord$aws_storage_s3_release().getRegion(), getTransferRecord$aws_storage_s3_release().getBucketName()), this, null), 1, null)).m22460a();
        if (strM22460a == null) {
            throw new IllegalStateException("Etag is empty");
        }
        this.transferDB.updateETag(getTransferRecord$aws_storage_s3_release().getId(), strM22460a);
        this.transferDB.updateState(getTransferRecord$aws_storage_s3_release().getId(), TransferState.PART_COMPLETED);
        updateProgress();
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success(getOutputData$aws_storage_s3_release());
        sq8.m48648g(resultSuccess, "success(...)");
        return resultSuccess;
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BlockingTransferWorker
    public void setMaxRetryCount$aws_storage_s3_release(int i) {
        this.maxRetryCount = i;
    }
}

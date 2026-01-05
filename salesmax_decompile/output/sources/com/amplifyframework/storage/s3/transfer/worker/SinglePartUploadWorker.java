package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import com.amplifyframework.storage.s3.transfer.UploadProgressListener;
import com.amplifyframework.storage.s3.transfer.UploadProgressListenerInterceptor;
import java.util.List;
import p001o.cxe;
import p001o.dxe;
import p001o.kf9;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.s3e;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SinglePartUploadWorker extends SuspendingTransferWorker {
    private final StorageTransferClientProvider clientProvider;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;
    private UploadProgressListener uploadProgressListener;

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.worker.SinglePartUploadWorker", m36648f = "SinglePartUploadWorker.kt", m36649l = {48}, m36650m = "performWork")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.SinglePartUploadWorker$performWork$1 */
    public static final class C107151 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C107151(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SinglePartUploadWorker.this.performWork(this);
        }
    }

    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.SinglePartUploadWorker$performWork$2 */
    public static final class C107162 extends kf9 implements xk7 {
        public C107162() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((cxe.C12766c.a) obj);
            return y3i.f54824a;
        }

        public final void invoke(cxe.C12766c.a aVar) {
            sq8.m48649h(aVar, "$this$withConfig");
            List listM22007F = aVar.m22007F();
            UploadProgressListener uploadProgressListener = SinglePartUploadWorker.this.uploadProgressListener;
            if (uploadProgressListener == null) {
                sq8.m48667z("uploadProgressListener");
                uploadProgressListener = null;
            }
            listM22007F.add(new UploadProgressListenerInterceptor(uploadProgressListener));
            aVar.m22017P(Boolean.valueOf(SinglePartUploadWorker.this.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SinglePartUploadWorker(StorageTransferClientProvider storageTransferClientProvider, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater, Context context, WorkerParameters workerParameters) {
        super(transferStatusUpdater, transferDB, context, workerParameters);
        sq8.m48649h(storageTransferClientProvider, "clientProvider");
        sq8.m48649h(transferDB, "transferDB");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "workerParameters");
        this.clientProvider = storageTransferClientProvider;
        this.transferDB = transferDB;
        this.transferStatusUpdater = transferStatusUpdater;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performWork(n64 n64Var) {
        C107151 c107151;
        SinglePartUploadWorker singlePartUploadWorker;
        if (n64Var instanceof C107151) {
            c107151 = (C107151) n64Var;
            int i = c107151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107151.label = i - Integer.MIN_VALUE;
            } else {
                c107151 = new C107151(n64Var);
            }
        }
        Object objX2 = c107151.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c107151.label;
        if (i2 == 0) {
            wre.m54934b(objX2);
            this.uploadProgressListener = new UploadProgressListener(getTransferRecord$aws_storage_s3_release(), this.transferStatusUpdater);
            TransferRecord transferRecord$aws_storage_s3_release = getTransferRecord$aws_storage_s3_release();
            UploadProgressListener uploadProgressListener = this.uploadProgressListener;
            if (uploadProgressListener == null) {
                sq8.m48667z("uploadProgressListener");
                uploadProgressListener = null;
            }
            s3e s3eVarCreatePutObjectRequest = createPutObjectRequest(transferRecord$aws_storage_s3_release, uploadProgressListener);
            cxe cxeVarM23925a = dxe.m23925a(this.clientProvider.getStorageTransferClient(getTransferRecord$aws_storage_s3_release().getRegion(), getTransferRecord$aws_storage_s3_release().getBucketName()), new C107162());
            c107151.L$0 = this;
            c107151.label = 1;
            objX2 = cxeVarM23925a.X2(s3eVarCreatePutObjectRequest, c107151);
            if (objX2 == objM51918f) {
                return objM51918f;
            }
            singlePartUploadWorker = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singlePartUploadWorker = (SinglePartUploadWorker) c107151.L$0;
            wre.m54934b(objX2);
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success(singlePartUploadWorker.getOutputData$aws_storage_s3_release());
        sq8.m48648g(resultSuccess, "let(...)");
        return resultSuccess;
    }
}

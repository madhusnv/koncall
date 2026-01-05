package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import p001o.cxe;
import p001o.dxe;
import p001o.e6;
import p001o.kf9;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AbortMultiPartUploadWorker extends SuspendingTransferWorker {
    private final StorageTransferClientProvider clientProvider;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.worker.AbortMultiPartUploadWorker", m36648f = "AbortMultiPartUploadWorker.kt", m36649l = {58}, m36650m = "performWork")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.AbortMultiPartUploadWorker$performWork$1 */
    public static final class C107021 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C107021(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbortMultiPartUploadWorker.this.performWork(this);
        }
    }

    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.AbortMultiPartUploadWorker$performWork$2 */
    public static final class C107032 extends kf9 implements xk7 {
        public C107032() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((cxe.C12766c.a) obj);
            return y3i.f54824a;
        }

        public final void invoke(cxe.C12766c.a aVar) {
            sq8.m48649h(aVar, "$this$withConfig");
            aVar.m22017P(Boolean.valueOf(AbortMultiPartUploadWorker.this.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortMultiPartUploadWorker(StorageTransferClientProvider storageTransferClientProvider, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater, Context context, WorkerParameters workerParameters) {
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
        C107021 c107021;
        AbortMultiPartUploadWorker abortMultiPartUploadWorker;
        if (n64Var instanceof C107021) {
            c107021 = (C107021) n64Var;
            int i = c107021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107021.label = i - Integer.MIN_VALUE;
            } else {
                c107021 = new C107021(n64Var);
            }
        }
        Object objMo21971v = c107021.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c107021.label;
        if (i2 == 0) {
            wre.m54934b(objMo21971v);
            cxe cxeVarM23925a = dxe.m23925a(this.clientProvider.getStorageTransferClient(getTransferRecord$aws_storage_s3_release().getRegion(), getTransferRecord$aws_storage_s3_release().getBucketName()), new C107032());
            e6.C13109a c13109a = new e6.C13109a();
            c13109a.m24365h(getTransferRecord$aws_storage_s3_release().getBucketName());
            c13109a.m24366i(getTransferRecord$aws_storage_s3_release().getKey());
            c13109a.m24367j(getTransferRecord$aws_storage_s3_release().getMultipartId());
            e6 e6VarM24358a = c13109a.m24358a();
            c107021.L$0 = this;
            c107021.label = 1;
            objMo21971v = cxeVarM23925a.mo21971v(e6VarM24358a, c107021);
            if (objMo21971v == objM51918f) {
                return objM51918f;
            }
            abortMultiPartUploadWorker = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abortMultiPartUploadWorker = (AbortMultiPartUploadWorker) c107021.L$0;
            wre.m54934b(objMo21971v);
        }
        if (abortMultiPartUploadWorker.getTransferRecord$aws_storage_s3_release().getState() == TransferState.PENDING_CANCEL) {
            abortMultiPartUploadWorker.transferStatusUpdater.updateTransferState(abortMultiPartUploadWorker.getTransferRecord$aws_storage_s3_release().getId(), TransferState.CANCELED);
        } else {
            abortMultiPartUploadWorker.transferStatusUpdater.updateTransferState(abortMultiPartUploadWorker.getTransferRecord$aws_storage_s3_release().getId(), TransferState.FAILED);
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success(abortMultiPartUploadWorker.getOutputData$aws_storage_s3_release());
        sq8.m48648g(resultSuccess, "let(...)");
        return resultSuccess;
    }
}

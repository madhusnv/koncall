package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import p001o.ca4;
import p001o.cxe;
import p001o.da4;
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
public final class InitiateMultiPartUploadTransferWorker extends SuspendingTransferWorker {
    private final StorageTransferClientProvider clientProvider;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.worker.InitiateMultiPartUploadTransferWorker", m36648f = "InitiateMultiPartUploadTransferWorker.kt", m36649l = {62}, m36650m = "performWork")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.InitiateMultiPartUploadTransferWorker$performWork$1 */
    public static final class C107121 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C107121(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitiateMultiPartUploadTransferWorker.this.performWork(this);
        }
    }

    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.InitiateMultiPartUploadTransferWorker$performWork$2 */
    public static final class C107132 extends kf9 implements xk7 {
        public C107132() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((cxe.C12766c.a) obj);
            return y3i.f54824a;
        }

        public final void invoke(cxe.C12766c.a aVar) {
            sq8.m48649h(aVar, "$this$withConfig");
            aVar.m22017P(Boolean.valueOf(InitiateMultiPartUploadTransferWorker.this.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateMultiPartUploadTransferWorker(StorageTransferClientProvider storageTransferClientProvider, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater, Context context, WorkerParameters workerParameters) {
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
    public Object performWork(n64 n64Var) throws Throwable {
        C107121 c107121;
        InitiateMultiPartUploadTransferWorker initiateMultiPartUploadTransferWorker;
        if (n64Var instanceof C107121) {
            c107121 = (C107121) n64Var;
            int i = c107121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107121.label = i - Integer.MIN_VALUE;
            } else {
                c107121 = new C107121(n64Var);
            }
        }
        Object objMo21970E = c107121.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c107121.label;
        if (i2 == 0) {
            wre.m54934b(objMo21970E);
            cxe storageTransferClient = this.clientProvider.getStorageTransferClient(getTransferRecord$aws_storage_s3_release().getRegion(), getTransferRecord$aws_storage_s3_release().getBucketName());
            this.transferStatusUpdater.updateTransferState(getTransferRecord$aws_storage_s3_release().getId(), TransferState.IN_PROGRESS);
            s3e s3eVarCreatePutObjectRequest = createPutObjectRequest(getTransferRecord$aws_storage_s3_release(), null);
            cxe cxeVarM23925a = dxe.m23925a(storageTransferClient, new C107132());
            ca4.C12598a c12598a = new ca4.C12598a();
            c12598a.m20584G(s3eVarCreatePutObjectRequest.m47591c());
            c12598a.m20585H(s3eVarCreatePutObjectRequest.m47612x());
            c12598a.m20583F(s3eVarCreatePutObjectRequest.m47589a());
            c12598a.m20586I(s3eVarCreatePutObjectRequest.m47613y());
            c12598a.m20587J(s3eVarCreatePutObjectRequest.m47586K());
            ca4 ca4VarM20588a = c12598a.m20588a();
            c107121.L$0 = this;
            c107121.label = 1;
            objMo21970E = cxeVarM23925a.mo21970E(ca4VarM20588a, c107121);
            if (objMo21970E == objM51918f) {
                return objM51918f;
            }
            initiateMultiPartUploadTransferWorker = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            initiateMultiPartUploadTransferWorker = (InitiateMultiPartUploadTransferWorker) c107121.L$0;
            wre.m54934b(objMo21970E);
        }
        da4 da4Var = (da4) objMo21970E;
        initiateMultiPartUploadTransferWorker.transferStatusUpdater.updateMultipartId(initiateMultiPartUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getId(), da4Var.m22648a());
        Data dataBuild = new Data.Builder().putInt("TRANSFER_RECORD_ID", initiateMultiPartUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getId()).putString("multipartUploadId", da4Var.m22648a()).build();
        sq8.m48648g(dataBuild, "build(...)");
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success(dataBuild);
        sq8.m48648g(resultSuccess, "let(...)");
        return resultSuccess;
    }
}

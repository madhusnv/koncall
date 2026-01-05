package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p001o.am3;
import p001o.cxe;
import p001o.dxe;
import p001o.kf9;
import p001o.l75;
import p001o.mm3;
import p001o.n64;
import p001o.o64;
import p001o.om3;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class CompleteMultiPartUploadWorker extends SuspendingTransferWorker {
    private final StorageTransferClientProvider clientProvider;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.worker.CompleteMultiPartUploadWorker", m36648f = "CompleteMultiPartUploadWorker.kt", m36649l = {56}, m36650m = "performWork")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.CompleteMultiPartUploadWorker$performWork$1 */
    public static final class C107051 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C107051(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CompleteMultiPartUploadWorker.this.performWork(this);
        }
    }

    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.CompleteMultiPartUploadWorker$performWork$2 */
    public static final class C107062 extends kf9 implements xk7 {
        public C107062() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((cxe.C12766c.a) obj);
            return y3i.f54824a;
        }

        public final void invoke(cxe.C12766c.a aVar) {
            sq8.m48649h(aVar, "$this$withConfig");
            aVar.m22017P(Boolean.valueOf(CompleteMultiPartUploadWorker.this.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteMultiPartUploadWorker(StorageTransferClientProvider storageTransferClientProvider, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater, Context context, WorkerParameters workerParameters) {
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
    public Object performWork(n64 n64Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C107051 c107051;
        CompleteMultiPartUploadWorker completeMultiPartUploadWorker;
        if (n64Var instanceof C107051) {
            c107051 = (C107051) n64Var;
            int i = c107051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107051.label = i - Integer.MIN_VALUE;
            } else {
                c107051 = new C107051(n64Var);
            }
        }
        Object objH1 = c107051.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c107051.label;
        if (i2 == 0) {
            wre.m54934b(objH1);
            List<om3> listQueryPartETagsOfUpload = this.transferDB.queryPartETagsOfUpload(getTransferRecord$aws_storage_s3_release().getId());
            cxe cxeVarM23925a = dxe.m23925a(this.clientProvider.getStorageTransferClient(getTransferRecord$aws_storage_s3_release().getRegion(), getTransferRecord$aws_storage_s3_release().getBucketName()), new C107062());
            am3.C12217a c12217a = new am3.C12217a();
            c12217a.m17432p(getTransferRecord$aws_storage_s3_release().getBucketName());
            c12217a.m17433q(getTransferRecord$aws_storage_s3_release().getKey());
            c12217a.m17434r(mm3.f35681b.m39346a(new CompleteMultiPartUploadWorker$performWork$3$1(listQueryPartETagsOfUpload)));
            c12217a.m17435s(getTransferRecord$aws_storage_s3_release().getMultipartId());
            am3 am3VarM17417a = c12217a.m17417a();
            c107051.L$0 = this;
            c107051.label = 1;
            objH1 = cxeVarM23925a.h1(am3VarM17417a, c107051);
            if (objH1 == objM51918f) {
                return objM51918f;
            }
            completeMultiPartUploadWorker = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completeMultiPartUploadWorker = (CompleteMultiPartUploadWorker) c107051.L$0;
            wre.m54934b(objH1);
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success(completeMultiPartUploadWorker.getInputData());
        sq8.m48648g(resultSuccess, "let(...)");
        return resultSuccess;
    }
}

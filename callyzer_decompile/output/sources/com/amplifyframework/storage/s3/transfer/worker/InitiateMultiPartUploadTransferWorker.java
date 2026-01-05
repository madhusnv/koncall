package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import gb.C2554d;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InitiateMultiPartUploadTransferWorker extends SuspendingTransferWorker {
    private final StorageTransferClientProvider clientProvider;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.worker.InitiateMultiPartUploadTransferWorker", m15344f = "InitiateMultiPartUploadTransferWorker.kt", m15345l = {62}, m15346m = "performWork")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.InitiateMultiPartUploadTransferWorker$performWork$1 */
    public static final class C12631 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C12631(InterfaceC7559c<? super C12631> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitiateMultiPartUploadTransferWorker.this.performWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateMultiPartUploadTransferWorker(StorageTransferClientProvider clientProvider, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater, Context context, WorkerParameters workerParameters) {
        super(transferStatusUpdater, transferDB, context, workerParameters);
        AbstractC4154l.m8923f(clientProvider, "clientProvider");
        AbstractC4154l.m8923f(transferDB, "transferDB");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParameters, "workerParameters");
        this.clientProvider = clientProvider;
        this.transferDB = transferDB;
        this.transferStatusUpdater = transferStatusUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 performWork$lambda$0(InitiateMultiPartUploadTransferWorker initiateMultiPartUploadTransferWorker, C2554d withConfig) {
        AbstractC4154l.m8923f(withConfig, "$this$withConfig");
        withConfig.f13913m = Boolean.valueOf(initiateMultiPartUploadTransferWorker.getTransferRecord$aws_storage_s3_release().getUseAccelerateEndpoint() == 1);
        return a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performWork(uw.InterfaceC7559c<? super t8.AbstractC7075u> r18) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.storage.s3.transfer.worker.InitiateMultiPartUploadTransferWorker.performWork(uw.c):java.lang.Object");
    }
}

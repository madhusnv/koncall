package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import t8.AbstractC7076v;
import t8.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TransferWorkerFactory extends i0 {
    private final StorageTransferClientProvider clientProvider;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;

    public TransferWorkerFactory(TransferDB transferDB, StorageTransferClientProvider clientProvider, TransferStatusUpdater transferStatusUpdater) {
        AbstractC4154l.m8923f(transferDB, "transferDB");
        AbstractC4154l.m8923f(clientProvider, "clientProvider");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        this.transferDB = transferDB;
        this.clientProvider = clientProvider;
        this.transferStatusUpdater = transferStatusUpdater;
    }

    @Override // t8.i0
    public AbstractC7076v createWorker(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        AbstractC4154l.m8923f(appContext, "appContext");
        AbstractC4154l.m8923f(workerClassName, "workerClassName");
        AbstractC4154l.m8923f(workerParameters, "workerParameters");
        if (workerClassName.equals(DownloadWorker.class.getName())) {
            return new DownloadWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, appContext, workerParameters);
        }
        if (workerClassName.equals(SinglePartUploadWorker.class.getName())) {
            return new SinglePartUploadWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, appContext, workerParameters);
        }
        if (workerClassName.equals(InitiateMultiPartUploadTransferWorker.class.getName())) {
            return new InitiateMultiPartUploadTransferWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, appContext, workerParameters);
        }
        if (workerClassName.equals(PartUploadTransferWorker.class.getName())) {
            return new PartUploadTransferWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, appContext, workerParameters);
        }
        if (workerClassName.equals(CompleteMultiPartUploadWorker.class.getName())) {
            return new CompleteMultiPartUploadWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, appContext, workerParameters);
        }
        if (workerClassName.equals(AbortMultiPartUploadWorker.class.getName())) {
            return new AbortMultiPartUploadWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, appContext, workerParameters);
        }
        throw new IllegalStateException("Failed to find matching Worker for ".concat(workerClassName));
    }
}

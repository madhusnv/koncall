package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class TransferWorkerFactory extends WorkerFactory {
    private final StorageTransferClientProvider clientProvider;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;

    public TransferWorkerFactory(TransferDB transferDB, StorageTransferClientProvider storageTransferClientProvider, TransferStatusUpdater transferStatusUpdater) {
        sq8.m48649h(transferDB, "transferDB");
        sq8.m48649h(storageTransferClientProvider, "clientProvider");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        this.transferDB = transferDB;
        this.clientProvider = storageTransferClientProvider;
        this.transferStatusUpdater = transferStatusUpdater;
    }

    @Override // androidx.work.WorkerFactory
    public ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
        sq8.m48649h(context, "appContext");
        sq8.m48649h(str, "workerClassName");
        sq8.m48649h(workerParameters, "workerParameters");
        if (sq8.m48644c(str, DownloadWorker.class.getName())) {
            return new DownloadWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, context, workerParameters);
        }
        if (sq8.m48644c(str, SinglePartUploadWorker.class.getName())) {
            return new SinglePartUploadWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, context, workerParameters);
        }
        if (sq8.m48644c(str, InitiateMultiPartUploadTransferWorker.class.getName())) {
            return new InitiateMultiPartUploadTransferWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, context, workerParameters);
        }
        if (sq8.m48644c(str, PartUploadTransferWorker.class.getName())) {
            return new PartUploadTransferWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, context, workerParameters);
        }
        if (sq8.m48644c(str, CompleteMultiPartUploadWorker.class.getName())) {
            return new CompleteMultiPartUploadWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, context, workerParameters);
        }
        if (sq8.m48644c(str, AbortMultiPartUploadWorker.class.getName())) {
            return new AbortMultiPartUploadWorker(this.clientProvider, this.transferDB, this.transferStatusUpdater, context, workerParameters);
        }
        throw new IllegalStateException("Failed to find matching Worker for " + str);
    }
}

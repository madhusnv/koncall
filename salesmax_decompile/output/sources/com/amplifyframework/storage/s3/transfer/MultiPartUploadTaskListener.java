package com.amplifyframework.storage.s3.transfer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicLong;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class MultiPartUploadTaskListener implements ProgressListener {
    private AtomicLong progressUpdateSink;
    private AtomicLong totalBytesTransferred;
    private final TransferDB transferDB;
    private final TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    public MultiPartUploadTaskListener(TransferRecord transferRecord, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(transferRecord, "transferRecord");
        sq8.m48649h(transferDB, "transferDB");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        this.transferRecord = transferRecord;
        this.transferDB = transferDB;
        this.transferStatusUpdater = transferStatusUpdater;
        this.totalBytesTransferred = new AtomicLong(0L);
        this.progressUpdateSink = new AtomicLong(0L);
        this.totalBytesTransferred.getAndAdd(transferDB.queryBytesTransferredByMainUploadId(transferRecord.getId()));
    }

    private final void updateProgress(boolean z) {
        this.transferStatusUpdater.updateProgress(this.transferRecord.getId(), this.transferRecord.getBytesCurrent(), this.transferRecord.getBytesTotal(), z, (16 & 16) != 0);
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListener
    public synchronized void progressChanged(long j) {
        this.totalBytesTransferred.getAndAdd(j);
        this.transferRecord.setBytesCurrent(this.totalBytesTransferred.get());
        if (this.transferRecord.getBytesCurrent() > this.transferRecord.getBytesTotal()) {
            TransferRecord transferRecord = this.transferRecord;
            transferRecord.setBytesCurrent(transferRecord.getBytesTotal());
        }
        this.progressUpdateSink.getAndAdd(j);
        if (this.progressUpdateSink.get() >= Math.min(this.transferRecord.getBytesTotal() / 100, this.transferRecord.getBytesTotal() - this.transferRecord.getBytesCurrent())) {
            updateProgress(true);
            this.progressUpdateSink.getAndSet(0L);
        }
    }
}

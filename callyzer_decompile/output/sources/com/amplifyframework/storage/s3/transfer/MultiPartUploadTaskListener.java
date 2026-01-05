package com.amplifyframework.storage.s3.transfer;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MultiPartUploadTaskListener implements ProgressListener {
    private AtomicLong progressUpdateSink;
    private AtomicLong totalBytesTransferred;
    private final TransferDB transferDB;
    private final TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    public MultiPartUploadTaskListener(TransferRecord transferRecord, TransferDB transferDB, TransferStatusUpdater transferStatusUpdater) {
        AbstractC4154l.m8923f(transferRecord, "transferRecord");
        AbstractC4154l.m8923f(transferDB, "transferDB");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        this.transferRecord = transferRecord;
        this.transferDB = transferDB;
        this.transferStatusUpdater = transferStatusUpdater;
        this.totalBytesTransferred = new AtomicLong(0L);
        this.progressUpdateSink = new AtomicLong(0L);
        this.totalBytesTransferred.getAndAdd(transferDB.queryBytesTransferredByMainUploadId(transferRecord.getId()));
    }

    private final void updateProgress(boolean z6) {
        this.transferStatusUpdater.updateProgress(this.transferRecord.getId(), this.transferRecord.getBytesCurrent(), this.transferRecord.getBytesTotal(), z6, (16 & 16) != 0);
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListener
    public synchronized void progressChanged(long j6) {
        try {
            this.totalBytesTransferred.getAndAdd(j6);
            this.transferRecord.setBytesCurrent(this.totalBytesTransferred.get());
            if (this.transferRecord.getBytesCurrent() > this.transferRecord.getBytesTotal()) {
                TransferRecord transferRecord = this.transferRecord;
                transferRecord.setBytesCurrent(transferRecord.getBytesTotal());
            }
            this.progressUpdateSink.getAndAdd(j6);
            if (this.progressUpdateSink.get() >= Math.min(this.transferRecord.getBytesTotal() / 100, this.transferRecord.getBytesTotal() - this.transferRecord.getBytesCurrent())) {
                updateProgress(true);
                this.progressUpdateSink.getAndSet(0L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

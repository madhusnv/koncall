package com.amplifyframework.storage.s3.transfer;

import p001o.sq8;

/* loaded from: classes5.dex */
public final class UploadProgressListener implements ProgressListener {
    private long bytesTransferredSoFar;
    private long progressUpdateSink;
    private final TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    public UploadProgressListener(TransferRecord transferRecord, TransferStatusUpdater transferStatusUpdater) {
        sq8.m48649h(transferRecord, "transferRecord");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        this.transferRecord = transferRecord;
        this.transferStatusUpdater = transferStatusUpdater;
    }

    private final void updateProgress(boolean z) {
        this.transferStatusUpdater.updateProgress(this.transferRecord.getId(), this.transferRecord.getBytesCurrent(), this.transferRecord.getBytesTotal(), z, (16 & 16) != 0);
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListener
    public synchronized void progressChanged(long j) {
        this.progressUpdateSink += j;
        long j2 = this.bytesTransferredSoFar + j;
        this.bytesTransferredSoFar = j2;
        this.transferRecord.setBytesCurrent(j2);
        if (this.progressUpdateSink >= Math.min(this.transferRecord.getBytesTotal() / 100, this.transferRecord.getBytesTotal() - this.transferRecord.getBytesCurrent())) {
            updateProgress(true);
            this.progressUpdateSink = 0L;
        }
    }
}

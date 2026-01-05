package com.amplifyframework.storage.s3.transfer;

import p001o.sq8;

/* loaded from: classes5.dex */
public final class DownloadProgressListener implements ProgressListener {
    private long bytesTransferredSoFar;
    private long progressUpdateSink;
    private final TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    public DownloadProgressListener(TransferRecord transferRecord, TransferStatusUpdater transferStatusUpdater) {
        sq8.m48649h(transferRecord, "transferRecord");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        this.transferRecord = transferRecord;
        this.transferStatusUpdater = transferStatusUpdater;
        this.bytesTransferredSoFar = transferRecord.getBytesCurrent();
    }

    private final void updateProgress() {
        this.transferStatusUpdater.updateProgress(this.transferRecord.getId(), this.transferRecord.getBytesCurrent(), this.transferRecord.getBytesTotal(), true, false);
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListener
    public void progressChanged(long j) {
        long j2 = this.bytesTransferredSoFar + j;
        this.bytesTransferredSoFar = j2;
        this.progressUpdateSink += j;
        this.transferRecord.setBytesCurrent(j2);
        if (this.transferRecord.getBytesCurrent() > this.transferRecord.getBytesTotal()) {
            TransferRecord transferRecord = this.transferRecord;
            transferRecord.setBytesCurrent(transferRecord.getBytesTotal());
        }
        if (this.progressUpdateSink >= Math.min(this.transferRecord.getBytesTotal() / 100, this.transferRecord.getBytesTotal() - this.transferRecord.getBytesCurrent())) {
            updateProgress();
            this.progressUpdateSink = 0L;
        }
    }
}

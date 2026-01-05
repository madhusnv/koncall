package com.amplifyframework.storage.s3.transfer;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DownloadProgressListener implements ProgressListener {
    private long bytesTransferredSoFar;
    private long progressUpdateSink;
    private final TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    public DownloadProgressListener(TransferRecord transferRecord, TransferStatusUpdater transferStatusUpdater) {
        AbstractC4154l.m8923f(transferRecord, "transferRecord");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        this.transferRecord = transferRecord;
        this.transferStatusUpdater = transferStatusUpdater;
        this.bytesTransferredSoFar = transferRecord.getBytesCurrent();
    }

    private final void updateProgress() {
        this.transferStatusUpdater.updateProgress(this.transferRecord.getId(), this.transferRecord.getBytesCurrent(), this.transferRecord.getBytesTotal(), true, false);
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListener
    public void progressChanged(long j6) {
        long j10 = this.bytesTransferredSoFar + j6;
        this.bytesTransferredSoFar = j10;
        this.progressUpdateSink += j6;
        this.transferRecord.setBytesCurrent(j10);
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

package com.amplifyframework.storage.s3.transfer;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UploadProgressListener implements ProgressListener {
    private long bytesTransferredSoFar;
    private long progressUpdateSink;
    private final TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    public UploadProgressListener(TransferRecord transferRecord, TransferStatusUpdater transferStatusUpdater) {
        AbstractC4154l.m8923f(transferRecord, "transferRecord");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        this.transferRecord = transferRecord;
        this.transferStatusUpdater = transferStatusUpdater;
    }

    private final void updateProgress(boolean z6) {
        this.transferStatusUpdater.updateProgress(this.transferRecord.getId(), this.transferRecord.getBytesCurrent(), this.transferRecord.getBytesTotal(), z6, (16 & 16) != 0);
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListener
    public synchronized void progressChanged(long j6) {
        this.progressUpdateSink += j6;
        long j10 = this.bytesTransferredSoFar + j6;
        this.bytesTransferredSoFar = j10;
        this.transferRecord.setBytesCurrent(j10);
        if (this.progressUpdateSink >= Math.min(this.transferRecord.getBytesTotal() / 100, this.transferRecord.getBytesTotal() - this.transferRecord.getBytesCurrent())) {
            updateProgress(true);
            this.progressUpdateSink = 0L;
        }
    }
}

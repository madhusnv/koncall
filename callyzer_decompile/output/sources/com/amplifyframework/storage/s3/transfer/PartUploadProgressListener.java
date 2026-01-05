package com.amplifyframework.storage.s3.transfer;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PartUploadProgressListener implements ProgressListener {
    private boolean resetProgress;
    private final TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    public PartUploadProgressListener(TransferRecord transferRecord, TransferStatusUpdater transferStatusUpdater) {
        AbstractC4154l.m8923f(transferRecord, "transferRecord");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        this.transferRecord = transferRecord;
        this.transferStatusUpdater = transferStatusUpdater;
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListener
    public void progressChanged(long j6) {
        TransferRecord transferRecord = this.transferRecord;
        transferRecord.setBytesCurrent(transferRecord.getBytesCurrent() + j6);
        MultiPartUploadTaskListener multiPartTransferListener = this.transferStatusUpdater.getMultiPartTransferListener(this.transferRecord.getMainUploadId());
        if (multiPartTransferListener != null) {
            multiPartTransferListener.progressChanged(j6);
        }
    }

    public final void resetProgress() {
        this.resetProgress = true;
        MultiPartUploadTaskListener multiPartTransferListener = this.transferStatusUpdater.getMultiPartTransferListener(this.transferRecord.getMainUploadId());
        if (multiPartTransferListener != null) {
            multiPartTransferListener.progressChanged(0L);
        }
    }
}

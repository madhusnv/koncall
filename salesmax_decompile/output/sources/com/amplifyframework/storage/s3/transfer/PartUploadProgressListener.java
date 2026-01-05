package com.amplifyframework.storage.s3.transfer;

import p001o.sq8;

/* loaded from: classes5.dex */
public final class PartUploadProgressListener implements ProgressListener {
    private boolean resetProgress;
    private final TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    public PartUploadProgressListener(TransferRecord transferRecord, TransferStatusUpdater transferStatusUpdater) {
        sq8.m48649h(transferRecord, "transferRecord");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        this.transferRecord = transferRecord;
        this.transferStatusUpdater = transferStatusUpdater;
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListener
    public void progressChanged(long j) {
        TransferRecord transferRecord = this.transferRecord;
        transferRecord.setBytesCurrent(transferRecord.getBytesCurrent() + j);
        MultiPartUploadTaskListener multiPartTransferListener = this.transferStatusUpdater.getMultiPartTransferListener(this.transferRecord.getMainUploadId());
        if (multiPartTransferListener != null) {
            multiPartTransferListener.progressChanged(j);
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

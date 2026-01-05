package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.storage.TransferState;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class TransferObserver {
    private final String bucket;
    private long bytesTransferred;
    private final String filePath;
    private final int id;
    private final String key;
    private final TransferListener listener;
    private final String region;
    private long totalBytes;
    private TransferListener transferListener;
    private TransferState transferState;
    private TransferStatusListener transferStatusListener;
    private final TransferStatusUpdater transferStatusUpdater;

    public final class TransferStatusListener implements TransferListener {
        public TransferStatusListener() {
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onError(int i, Exception exc) {
            sq8.m48649h(exc, "ex");
            TransferListener transferListener = TransferObserver.this.listener;
            if (transferListener != null) {
                transferListener.onError(i, exc);
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i, long j, long j2) {
            TransferObserver.this.setBytesTransferred(j);
            TransferObserver.this.setTotalBytes(j2);
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onStateChanged(int i, TransferState transferState, String str) {
            sq8.m48649h(transferState, "state");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            TransferObserver.this.setTransferState(transferState);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i, TransferStatusUpdater transferStatusUpdater) {
        this(i, transferStatusUpdater, null, null, null, null, null, null, 252, null);
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
    }

    private final void clearTransferListener() {
        TransferListener transferListener = this.transferListener;
        if (transferListener != null) {
            this.transferStatusUpdater.unregisterListener(this.id, transferListener);
        }
        TransferStatusListener transferStatusListener = this.transferStatusListener;
        if (transferStatusListener != null) {
            this.transferStatusUpdater.unregisterListener(this.id, transferStatusListener);
        }
        this.transferStatusListener = null;
        this.transferListener = null;
    }

    private final TransferStatusUpdater component2() {
        return this.transferStatusUpdater;
    }

    private final TransferListener component7() {
        return this.listener;
    }

    public final int component1() {
        return this.id;
    }

    public final String component3() {
        return this.bucket;
    }

    public final String component4() {
        return this.region;
    }

    public final String component5() {
        return this.key;
    }

    public final String component6() {
        return this.filePath;
    }

    public final TransferState component8() {
        return this.transferState;
    }

    public final TransferObserver copy(int i, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4, TransferListener transferListener, TransferState transferState) {
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        sq8.m48649h(transferState, "transferState");
        return new TransferObserver(i, transferStatusUpdater, str, str2, str3, str4, transferListener, transferState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferObserver)) {
            return false;
        }
        TransferObserver transferObserver = (TransferObserver) obj;
        return this.id == transferObserver.id && sq8.m48644c(this.transferStatusUpdater, transferObserver.transferStatusUpdater) && sq8.m48644c(this.bucket, transferObserver.bucket) && sq8.m48644c(this.region, transferObserver.region) && sq8.m48644c(this.key, transferObserver.key) && sq8.m48644c(this.filePath, transferObserver.filePath) && sq8.m48644c(this.listener, transferObserver.listener) && this.transferState == transferObserver.transferState;
    }

    public final String getBucket() {
        return this.bucket;
    }

    public final long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final int getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getRegion() {
        return this.region;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final TransferState getTransferState() {
        return this.transferState;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + this.transferStatusUpdater.hashCode()) * 31;
        String str = this.bucket;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.filePath;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TransferListener transferListener = this.listener;
        return ((iHashCode5 + (transferListener != null ? transferListener.hashCode() : 0)) * 31) + this.transferState.hashCode();
    }

    public final void setBytesTransferred(long j) {
        this.bytesTransferred = j;
    }

    public final void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public final void setTransferListener(TransferListener transferListener) {
        sq8.m48649h(transferListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        clearTransferListener();
        this.transferListener = transferListener;
        this.transferStatusUpdater.registerListener(this.id, transferListener);
        if (this.transferStatusListener == null) {
            this.transferStatusListener = new TransferStatusListener();
        }
        TransferStatusListener transferStatusListener = this.transferStatusListener;
        if (transferStatusListener != null) {
            this.transferStatusUpdater.registerListener(this.id, transferStatusListener);
        }
    }

    public final void setTransferState(TransferState transferState) {
        sq8.m48649h(transferState, "<set-?>");
        this.transferState = transferState;
    }

    public String toString() {
        return "TransferObserver(id=" + this.id + ", transferStatusUpdater=" + this.transferStatusUpdater + ", bucket=" + this.bucket + ", region=" + this.region + ", key=" + this.key + ", filePath=" + this.filePath + ", listener=" + this.listener + ", transferState=" + this.transferState + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i, TransferStatusUpdater transferStatusUpdater, String str) {
        this(i, transferStatusUpdater, str, null, null, null, null, null, 248, null);
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i, TransferStatusUpdater transferStatusUpdater, String str, String str2) {
        this(i, transferStatusUpdater, str, str2, null, null, null, null, 240, null);
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3) {
        this(i, transferStatusUpdater, str, str2, str3, null, null, null, 224, null);
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4) {
        this(i, transferStatusUpdater, str, str2, str3, str4, null, null, Opcodes.CHECKCAST, null);
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4, TransferListener transferListener) {
        this(i, transferStatusUpdater, str, str2, str3, str4, transferListener, null, 128, null);
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
    }

    public TransferObserver(int i, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4, TransferListener transferListener, TransferState transferState) {
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        sq8.m48649h(transferState, "transferState");
        this.id = i;
        this.transferStatusUpdater = transferStatusUpdater;
        this.bucket = str;
        this.region = str2;
        this.key = str3;
        this.filePath = str4;
        this.listener = transferListener;
        this.transferState = transferState;
        this.transferListener = transferListener;
        this.transferStatusListener = new TransferStatusListener();
        if (transferListener != null) {
            setTransferListener(transferListener);
        }
    }

    public /* synthetic */ TransferObserver(int i, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4, TransferListener transferListener, TransferState transferState, int i2, id5 id5Var) {
        this(i, transferStatusUpdater, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : transferListener, (i2 & 128) != 0 ? TransferState.WAITING : transferState);
    }
}

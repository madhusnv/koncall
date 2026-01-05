package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.storage.TransferState;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.asn1.BERTags;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TransferObserver {
    private final String bucket;
    private long bytesTransferred;
    private final String filePath;

    /* renamed from: id, reason: collision with root package name */
    private final int f43859id;
    private final String key;
    private final TransferListener listener;
    private final String region;
    private long totalBytes;
    private TransferListener transferListener;
    private TransferState transferState;
    private TransferStatusListener transferStatusListener;
    private final TransferStatusUpdater transferStatusUpdater;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public final class TransferStatusListener implements TransferListener {
        public TransferStatusListener() {
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onError(int i10, Exception ex2) {
            AbstractC4154l.m8923f(ex2, "ex");
            TransferListener transferListener = TransferObserver.this.listener;
            if (transferListener != null) {
                transferListener.onError(i10, ex2);
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i10, long j6, long j10) {
            TransferObserver.this.setBytesTransferred(j6);
            TransferObserver.this.setTotalBytes(j10);
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onStateChanged(int i10, TransferState state, String key) {
            AbstractC4154l.m8923f(state, "state");
            AbstractC4154l.m8923f(key, "key");
            TransferObserver.this.setTransferState(state);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i10, TransferStatusUpdater transferStatusUpdater) {
        this(i10, transferStatusUpdater, null, null, null, null, null, null, 252, null);
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
    }

    private final void clearTransferListener() {
        TransferListener transferListener = this.transferListener;
        if (transferListener != null) {
            this.transferStatusUpdater.unregisterListener(this.f43859id, transferListener);
        }
        TransferStatusListener transferStatusListener = this.transferStatusListener;
        if (transferStatusListener != null) {
            this.transferStatusUpdater.unregisterListener(this.f43859id, transferStatusListener);
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

    public static /* synthetic */ TransferObserver copy$default(TransferObserver transferObserver, int i10, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4, TransferListener transferListener, TransferState transferState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = transferObserver.f43859id;
        }
        if ((i11 & 2) != 0) {
            transferStatusUpdater = transferObserver.transferStatusUpdater;
        }
        if ((i11 & 4) != 0) {
            str = transferObserver.bucket;
        }
        if ((i11 & 8) != 0) {
            str2 = transferObserver.region;
        }
        if ((i11 & 16) != 0) {
            str3 = transferObserver.key;
        }
        if ((i11 & 32) != 0) {
            str4 = transferObserver.filePath;
        }
        if ((i11 & 64) != 0) {
            transferListener = transferObserver.listener;
        }
        if ((i11 & 128) != 0) {
            transferState = transferObserver.transferState;
        }
        TransferListener transferListener2 = transferListener;
        TransferState transferState2 = transferState;
        String str5 = str3;
        String str6 = str4;
        return transferObserver.copy(i10, transferStatusUpdater, str, str2, str5, str6, transferListener2, transferState2);
    }

    public final int component1() {
        return this.f43859id;
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

    public final TransferObserver copy(int i10, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4, TransferListener transferListener, TransferState transferState) {
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        AbstractC4154l.m8923f(transferState, "transferState");
        return new TransferObserver(i10, transferStatusUpdater, str, str2, str3, str4, transferListener, transferState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferObserver)) {
            return false;
        }
        TransferObserver transferObserver = (TransferObserver) obj;
        return this.f43859id == transferObserver.f43859id && AbstractC4154l.m8918a(this.transferStatusUpdater, transferObserver.transferStatusUpdater) && AbstractC4154l.m8918a(this.bucket, transferObserver.bucket) && AbstractC4154l.m8918a(this.region, transferObserver.region) && AbstractC4154l.m8918a(this.key, transferObserver.key) && AbstractC4154l.m8918a(this.filePath, transferObserver.filePath) && AbstractC4154l.m8918a(this.listener, transferObserver.listener) && this.transferState == transferObserver.transferState;
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
        return this.f43859id;
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
        int iHashCode = (this.transferStatusUpdater.hashCode() + (Integer.hashCode(this.f43859id) * 31)) * 31;
        String str = this.bucket;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.filePath;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TransferListener transferListener = this.listener;
        return this.transferState.hashCode() + ((iHashCode5 + (transferListener != null ? transferListener.hashCode() : 0)) * 31);
    }

    public final void setBytesTransferred(long j6) {
        this.bytesTransferred = j6;
    }

    public final void setTotalBytes(long j6) {
        this.totalBytes = j6;
    }

    public final void setTransferListener(TransferListener listener) {
        AbstractC4154l.m8923f(listener, "listener");
        clearTransferListener();
        this.transferListener = listener;
        this.transferStatusUpdater.registerListener(this.f43859id, listener);
        if (this.transferStatusListener == null) {
            this.transferStatusListener = new TransferStatusListener();
        }
        TransferStatusListener transferStatusListener = this.transferStatusListener;
        if (transferStatusListener != null) {
            this.transferStatusUpdater.registerListener(this.f43859id, transferStatusListener);
        }
    }

    public final void setTransferState(TransferState transferState) {
        AbstractC4154l.m8923f(transferState, "<set-?>");
        this.transferState = transferState;
    }

    public String toString() {
        int i10 = this.f43859id;
        TransferStatusUpdater transferStatusUpdater = this.transferStatusUpdater;
        String str = this.bucket;
        String str2 = this.region;
        String str3 = this.key;
        String str4 = this.filePath;
        TransferListener transferListener = this.listener;
        TransferState transferState = this.transferState;
        StringBuilder sb2 = new StringBuilder("TransferObserver(id=");
        sb2.append(i10);
        sb2.append(", transferStatusUpdater=");
        sb2.append(transferStatusUpdater);
        sb2.append(", bucket=");
        a1.m14319B(sb2, str, ", region=", str2, ", key=");
        a1.m14319B(sb2, str3, ", filePath=", str4, ", listener=");
        sb2.append(transferListener);
        sb2.append(", transferState=");
        sb2.append(transferState);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i10, TransferStatusUpdater transferStatusUpdater, String str) {
        this(i10, transferStatusUpdater, str, null, null, null, null, null, 248, null);
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i10, TransferStatusUpdater transferStatusUpdater, String str, String str2) {
        this(i10, transferStatusUpdater, str, str2, null, null, null, null, 240, null);
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i10, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3) {
        this(i10, transferStatusUpdater, str, str2, str3, null, null, null, BERTags.FLAGS, null);
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i10, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4) {
        this(i10, transferStatusUpdater, str, str2, str3, str4, null, null, BERTags.PRIVATE, null);
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferObserver(int i10, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4, TransferListener transferListener) {
        this(i10, transferStatusUpdater, str, str2, str3, str4, transferListener, null, 128, null);
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
    }

    public TransferObserver(int i10, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4, TransferListener transferListener, TransferState transferState) {
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        AbstractC4154l.m8923f(transferState, "transferState");
        this.f43859id = i10;
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

    public /* synthetic */ TransferObserver(int i10, TransferStatusUpdater transferStatusUpdater, String str, String str2, String str3, String str4, TransferListener transferListener, TransferState transferState, int i11, AbstractC4148f abstractC4148f) {
        this(i10, transferStatusUpdater, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : transferListener, (i11 & 128) != 0 ? TransferState.WAITING : transferState);
    }
}

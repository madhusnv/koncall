package com.amplifyframework.storage.result;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StorageTransferProgress {
    private final long currentBytes;
    private final long totalBytes;

    public StorageTransferProgress(long j6, long j10) {
        this.currentBytes = j6;
        this.totalBytes = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StorageTransferProgress.class == obj.getClass()) {
            StorageTransferProgress storageTransferProgress = (StorageTransferProgress) obj;
            if (getCurrentBytes() == storageTransferProgress.getCurrentBytes() && getTotalBytes() == storageTransferProgress.getTotalBytes()) {
                return true;
            }
        }
        return false;
    }

    public long getCurrentBytes() {
        return this.currentBytes;
    }

    public double getFractionCompleted() {
        return this.currentBytes / this.totalBytes;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public int hashCode() {
        return (((int) (getCurrentBytes() ^ (getCurrentBytes() >>> 32))) * 31) + ((int) (getTotalBytes() ^ (getTotalBytes() >>> 32)));
    }

    public String toString() {
        return "StorageTransferProgress{currentBytes=" + getCurrentBytes() + ", totalBytes=" + getTotalBytes() + ", fractionCompleted=" + getFractionCompleted() + '}';
    }
}

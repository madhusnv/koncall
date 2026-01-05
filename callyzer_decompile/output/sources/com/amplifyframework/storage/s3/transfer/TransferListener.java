package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.storage.TransferState;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface TransferListener {
    void onError(int i10, Exception exc);

    void onProgressChanged(int i10, long j6, long j10);

    void onStateChanged(int i10, TransferState transferState, String str);
}

package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.storage.TransferState;

/* loaded from: classes5.dex */
public interface TransferListener {
    void onError(int i, Exception exc);

    void onProgressChanged(int i, long j, long j2);

    void onStateChanged(int i, TransferState transferState, String str);
}

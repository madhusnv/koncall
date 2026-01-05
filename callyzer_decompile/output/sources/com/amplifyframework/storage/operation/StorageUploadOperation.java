package com.amplifyframework.storage.operation;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageUploadResult;
import java.util.UUID;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class StorageUploadOperation<R, T extends StorageUploadResult> extends StorageTransferOperation<R, T> {
    public StorageUploadOperation(R r9) {
        this(r9, UUID.randomUUID().toString(), null, null, null);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public R getRequest() {
        return (R) super.getRequest();
    }

    @Override // com.amplifyframework.storage.operation.StorageTransferOperation
    public void setOnSuccess(Consumer<T> consumer) {
        super.setOnSuccess(consumer);
    }

    public StorageUploadOperation(R r9, String str, Consumer<StorageTransferProgress> consumer, Consumer<T> consumer2, Consumer<StorageException> consumer3) {
        super(r9, str, consumer, consumer2, consumer3);
    }
}

package com.amplifyframework.storage.operation;

import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.category.CategoryType;

/* loaded from: classes5.dex */
public abstract class StorageGetUrlOperation<R> extends AmplifyOperation<R> {
    public StorageGetUrlOperation(R r) {
        super(CategoryType.STORAGE, r);
    }
}

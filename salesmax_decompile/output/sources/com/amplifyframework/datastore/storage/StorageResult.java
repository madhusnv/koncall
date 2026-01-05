package com.amplifyframework.datastore.storage;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.datastore.DataStoreException;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class StorageResult<T extends Model> {

    public static final class Failure<T extends Model> extends StorageResult<T> {
        private final DataStoreException exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(DataStoreException dataStoreException) {
            super(null);
            sq8.m48649h(dataStoreException, "exception");
            this.exception = dataStoreException;
        }

        public final DataStoreException getException() {
            return this.exception;
        }
    }

    public static final class Success<T extends Model> extends StorageResult<T> {
        private final StorageItemChange<T> storageItemChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(StorageItemChange<T> storageItemChange) {
            super(null);
            sq8.m48649h(storageItemChange, "storageItemChange");
            this.storageItemChange = storageItemChange;
        }

        public final StorageItemChange<T> getStorageItemChange() {
            return this.storageItemChange;
        }
    }

    private StorageResult() {
    }

    public /* synthetic */ StorageResult(id5 id5Var) {
        this();
    }
}

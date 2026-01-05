package com.google.api.client.util.store;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class MemoryDataStoreFactory extends AbstractDataStoreFactory {

    public static class InstanceHolder {
        static final MemoryDataStoreFactory INSTANCE = new MemoryDataStoreFactory();
    }

    public static class MemoryDataStore<V extends Serializable> extends AbstractMemoryDataStore<V> {
        public MemoryDataStore(MemoryDataStoreFactory memoryDataStoreFactory, String str) {
            super(memoryDataStoreFactory, str);
        }

        @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
        public MemoryDataStoreFactory getDataStoreFactory() {
            return (MemoryDataStoreFactory) super.getDataStoreFactory();
        }
    }

    public static MemoryDataStoreFactory getDefaultInstance() {
        return InstanceHolder.INSTANCE;
    }

    @Override // com.google.api.client.util.store.AbstractDataStoreFactory
    public <V extends Serializable> DataStore<V> createDataStore(String str) {
        return new MemoryDataStore(this, str);
    }
}

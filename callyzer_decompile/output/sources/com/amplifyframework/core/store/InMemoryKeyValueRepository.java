package com.amplifyframework.core.store;

import com.amplifyframework.annotations.InternalApiWarning;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalApiWarning
/* loaded from: classes.dex */
public final class InMemoryKeyValueRepository implements KeyValueRepository {
    private final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public String get(String dataKey) {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        return this.cache.getOrDefault(dataKey, null);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(String dataKey, String str) {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        if (str != null) {
            this.cache.put(dataKey, str);
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void remove(String dataKey) {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        this.cache.remove(dataKey);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        this.cache.clear();
    }
}

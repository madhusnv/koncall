package com.amplifyframework.core.store;

import com.amplifyframework.annotations.InternalApiWarning;
import java.util.concurrent.ConcurrentHashMap;
import p001o.sq8;

@InternalApiWarning
/* loaded from: classes5.dex */
public final class InMemoryKeyValueRepository implements KeyValueRepository {
    private final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public String get(String str) {
        sq8.m48649h(str, "dataKey");
        return this.cache.getOrDefault(str, null);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(String str, String str2) {
        sq8.m48649h(str, "dataKey");
        if (str2 != null) {
            this.cache.put(str, str2);
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void remove(String str) {
        sq8.m48649h(str, "dataKey");
        this.cache.remove(str);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        this.cache.clear();
    }
}

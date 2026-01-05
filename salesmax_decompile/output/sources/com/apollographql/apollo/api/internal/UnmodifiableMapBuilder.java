package com.apollographql.apollo.api.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class UnmodifiableMapBuilder<K, V> {
    private final Map<K, V> map;

    public UnmodifiableMapBuilder(int i) {
        this.map = new HashMap(i);
    }

    public Map<K, V> build() {
        return Collections.unmodifiableMap(this.map);
    }

    public UnmodifiableMapBuilder<K, V> put(K k, V v) {
        this.map.put(k, v);
        return this;
    }

    public UnmodifiableMapBuilder() {
        this.map = new HashMap();
    }
}

package com.apollographql.apollo.api;

/* loaded from: classes5.dex */
public final class Input<V> {
    public final boolean defined;
    public final V value;

    private Input(V v, boolean z) {
        this.value = v;
        this.defined = z;
    }

    public static <V> Input<V> absent() {
        return new Input<>(null, false);
    }

    public static <V> Input<V> fromNullable(V v) {
        return new Input<>(v, true);
    }
}

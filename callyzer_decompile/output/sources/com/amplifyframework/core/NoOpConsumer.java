package com.amplifyframework.core;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class NoOpConsumer<T> implements Consumer<T> {
    private NoOpConsumer() {
    }

    public static <T> NoOpConsumer<T> create() {
        return new NoOpConsumer<>();
    }

    public boolean equals(Object obj) {
        return obj instanceof NoOpConsumer;
    }

    public int hashCode() {
        return NoOpConsumer.class.hashCode();
    }

    public String toString() {
        return "NoOpConsumer {}";
    }

    @Override // com.amplifyframework.core.Consumer
    public void accept(T t7) {
    }
}

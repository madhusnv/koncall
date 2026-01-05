package com.amplifyframework.util;

import java.lang.Comparable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Range<T extends Comparable<T>> {
    private final T high;
    private final T low;

    public Range(T t7, T t10) {
        if (t7.compareTo(t10) > 0) {
            throw new IllegalArgumentException("Low value should be lower than high");
        }
        this.low = t7;
        this.high = t10;
    }

    public boolean contains(T t7) {
        return t7.compareTo(this.low) >= 0 && t7.compareTo(this.high) <= 0;
    }
}

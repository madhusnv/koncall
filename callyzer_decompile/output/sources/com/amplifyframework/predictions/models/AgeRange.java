package com.amplifyframework.predictions.models;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AgeRange {
    private final int high;
    private final int low;

    public AgeRange(int i10, int i11) {
        if (i11 < i10) {
            throw new IllegalArgumentException("Low cannot be higher than High.");
        }
        this.low = i10;
        this.high = i11;
    }

    public boolean contains(int i10) {
        return i10 >= this.low && i10 <= this.high;
    }

    public int getHigh() {
        return this.high;
    }

    public int getLow() {
        return this.low;
    }
}

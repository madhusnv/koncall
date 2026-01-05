package p001o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class ine {
    private volatile AtomicReferenceArray<Object> array;

    public ine(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: a */
    public final int m32501a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final Object m32502b(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: c */
    public final void m32503c(int i, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(bce.m18601d(i + 1, length * 2));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, obj);
        this.array = atomicReferenceArray2;
    }
}

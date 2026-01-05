package yx;

import ay.C0492b;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.o */
/* loaded from: classes3.dex */
public final class C8821o {
    private volatile AtomicReferenceArray<Object> array;

    public C8821o(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    /* renamed from: a */
    public final int m16273a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final Object m16274b(int i10) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    /* renamed from: c */
    public final void m16275c(int i10, C0492b c0492b) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, c0492b);
            return;
        }
        int i11 = i10 + 1;
        int i12 = length * 2;
        if (i11 < i12) {
            i11 = i12;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i11);
        for (int i13 = 0; i13 < length; i13++) {
            atomicReferenceArray2.set(i13, atomicReferenceArray.get(i13));
        }
        atomicReferenceArray2.set(i10, c0492b);
        this.array = atomicReferenceArray2;
    }
}

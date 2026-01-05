package b00;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class f0 {

    /* renamed from: a */
    public static final e0 f3622a = new e0(new byte[0], 0, 0, false, false);

    /* renamed from: b */
    public static final int f3623b;

    /* renamed from: c */
    public static final AtomicReference[] f3624c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3623b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f3624c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m1559a(e0 segment) {
        AbstractC4154l.m8923f(segment, "segment");
        if (segment.f3612f != null || segment.f3613g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f3610d) {
            return;
        }
        AtomicReference atomicReference = f3624c[(int) (Thread.currentThread().getId() & (f3623b - 1))];
        e0 e0Var = f3622a;
        e0 e0Var2 = (e0) atomicReference.getAndSet(e0Var);
        if (e0Var2 == e0Var) {
            return;
        }
        int i10 = e0Var2 != null ? e0Var2.f3609c : 0;
        if (i10 >= 65536) {
            atomicReference.set(e0Var2);
            return;
        }
        segment.f3612f = e0Var2;
        segment.f3608b = 0;
        segment.f3609c = i10 + 8192;
        atomicReference.set(segment);
    }

    /* renamed from: b */
    public static final e0 m1560b() {
        AtomicReference atomicReference = f3624c[(int) (Thread.currentThread().getId() & (f3623b - 1))];
        e0 e0Var = f3622a;
        e0 e0Var2 = (e0) atomicReference.getAndSet(e0Var);
        if (e0Var2 == e0Var) {
            return new e0();
        }
        if (e0Var2 == null) {
            atomicReference.set(null);
            return new e0();
        }
        atomicReference.set(e0Var2.f3612f);
        e0Var2.f3612f = null;
        e0Var2.f3609c = 0;
        return e0Var2;
    }
}

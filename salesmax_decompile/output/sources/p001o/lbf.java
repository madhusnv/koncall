package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class lbf {

    /* renamed from: a */
    public static final lbf f33562a = new lbf();

    /* renamed from: b */
    public static final int f33563b = 65536;

    /* renamed from: c */
    public static final hbf f33564c = new hbf(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    public static final int f33565d;

    /* renamed from: e */
    public static final AtomicReference[] f33566e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f33565d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f33566e = atomicReferenceArr;
    }

    /* renamed from: b */
    public static final void m36864b(hbf hbfVar) {
        sq8.m48649h(hbfVar, "segment");
        if (!(hbfVar.f26592f == null && hbfVar.f26593g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (hbfVar.f26590d) {
            return;
        }
        AtomicReference atomicReferenceM36866a = f33562a.m36866a();
        hbf hbfVar2 = f33564c;
        hbf hbfVar3 = (hbf) atomicReferenceM36866a.getAndSet(hbfVar2);
        if (hbfVar3 == hbfVar2) {
            return;
        }
        int i = hbfVar3 != null ? hbfVar3.f26589c : 0;
        if (i >= f33563b) {
            atomicReferenceM36866a.set(hbfVar3);
            return;
        }
        hbfVar.f26592f = hbfVar3;
        hbfVar.f26588b = 0;
        hbfVar.f26589c = i + 8192;
        atomicReferenceM36866a.set(hbfVar);
    }

    /* renamed from: c */
    public static final hbf m36865c() {
        AtomicReference atomicReferenceM36866a = f33562a.m36866a();
        hbf hbfVar = f33564c;
        hbf hbfVar2 = (hbf) atomicReferenceM36866a.getAndSet(hbfVar);
        if (hbfVar2 == hbfVar) {
            return new hbf();
        }
        if (hbfVar2 == null) {
            atomicReferenceM36866a.set(null);
            return new hbf();
        }
        atomicReferenceM36866a.set(hbfVar2.f26592f);
        hbfVar2.f26592f = null;
        hbfVar2.f26589c = 0;
        return hbfVar2;
    }

    /* renamed from: a */
    public final AtomicReference m36866a() {
        return f33566e[(int) (Thread.currentThread().getId() & (f33565d - 1))];
    }
}

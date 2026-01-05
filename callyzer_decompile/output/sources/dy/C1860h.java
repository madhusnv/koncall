package dy;

import bt.l0;
import cy.C1534e;
import cy.InterfaceC1535f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l7.C4417q;
import mm.AbstractC4801l;
import qw.a0;
import tx.InterfaceC7250j;
import tx.e2;
import yx.AbstractC8808b;
import yx.AbstractC8823q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dy.h */
/* loaded from: classes3.dex */
public class C1860h {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8836c = AtomicReferenceFieldUpdater.newUpdater(C1860h.class, Object.class, "head$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f8837d = AtomicLongFieldUpdater.newUpdater(C1860h.class, "deqIdx$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8838e = AtomicReferenceFieldUpdater.newUpdater(C1860h.class, Object.class, "tail$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f8839f = AtomicLongFieldUpdater.newUpdater(C1860h.class, "enqIdx$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8840g = AtomicIntegerFieldUpdater.newUpdater(C1860h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a */
    public final int f8841a;

    /* renamed from: b */
    public final l0 f8842b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public C1860h(int i10, int i11) {
        this.f8841a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "The number of acquired permits should be in 0..").toString());
        }
        C1863k c1863k = new C1863k(0L, null, 2);
        this.head$volatile = c1863k;
        this.tail$volatile = c1863k;
        this._availablePermits$volatile = i10 - i11;
        this.f8842b = new l0(5, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.mo5485f(r3, r4.f8842b);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5491a(ww.AbstractC8193c r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = dy.C1860h.f8840g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f8841a
            if (r1 > r2) goto L0
            qw.a0 r3 = qw.a0.f30746a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            uw.c r5 = pg.n6.m11797c(r5)
            tx.k r5 = tx.c0.m13496s(r5)
            boolean r1 = r4.m5492b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            bt.l0 r0 = r4.f8842b     // Catch: java.lang.Throwable -> L3f
            r5.mo5485f(r3, r0)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.m5492b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.m13539o()
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.m13546z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dy.C1860h.m5491a(ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public final boolean m5492b(e2 e2Var) {
        Object objM16244d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8838e;
        C1863k c1863k = (C1863k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f8839f.getAndIncrement(this);
        C1858f c1858f = C1858f.f8834a;
        long j6 = andIncrement / AbstractC1862j.f8848f;
        loop0: while (true) {
            objM16244d = AbstractC8808b.m16244d(c1863k, j6, c1858f);
            if (!AbstractC8808b.m16247g(objM16244d)) {
                AbstractC8823q abstractC8823qM16245e = AbstractC8808b.m16245e(objM16244d);
                while (true) {
                    AbstractC8823q abstractC8823q = (AbstractC8823q) atomicReferenceFieldUpdater.get(this);
                    if (abstractC8823q.f42518c >= abstractC8823qM16245e.f42518c) {
                        break loop0;
                    }
                    if (!abstractC8823qM16245e.m16278j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC8823q, abstractC8823qM16245e)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC8823q) {
                            if (abstractC8823qM16245e.m16276f()) {
                                abstractC8823qM16245e.m16260e();
                            }
                        }
                    }
                    if (abstractC8823q.m16276f()) {
                        abstractC8823q.m16260e();
                    }
                }
            } else {
                break;
            }
        }
        C1863k c1863k2 = (C1863k) AbstractC8808b.m16245e(objM16244d);
        AtomicReferenceArray atomicReferenceArray = c1863k2.f8849e;
        int i10 = (int) (andIncrement % AbstractC1862j.f8848f);
        while (!atomicReferenceArray.compareAndSet(i10, null, e2Var)) {
            if (atomicReferenceArray.get(i10) != null) {
                C4417q c4417q = AbstractC1862j.f8844b;
                C4417q c4417q2 = AbstractC1862j.f8845c;
                while (!atomicReferenceArray.compareAndSet(i10, c4417q, c4417q2)) {
                    if (atomicReferenceArray.get(i10) != c4417q) {
                        return false;
                    }
                }
                ((InterfaceC7250j) e2Var).mo5485f(a0.f30746a, this.f8842b);
                return true;
            }
        }
        e2Var.mo5076a(c1863k2, i10);
        return true;
    }

    /* renamed from: c */
    public final void m5493c() {
        int i10;
        Object objM16244d;
        boolean z6;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8840g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f8841a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8836c;
            C1863k c1863k = (C1863k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f8837d.getAndIncrement(this);
            long j6 = andIncrement2 / AbstractC1862j.f8848f;
            C1859g c1859g = C1859g.f8835a;
            while (true) {
                objM16244d = AbstractC8808b.m16244d(c1863k, j6, c1859g);
                if (AbstractC8808b.m16247g(objM16244d)) {
                    break;
                }
                AbstractC8823q abstractC8823qM16245e = AbstractC8808b.m16245e(objM16244d);
                while (true) {
                    AbstractC8823q abstractC8823q = (AbstractC8823q) atomicReferenceFieldUpdater.get(this);
                    if (abstractC8823q.f42518c >= abstractC8823qM16245e.f42518c) {
                        break;
                    }
                    if (!abstractC8823qM16245e.m16278j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC8823q, abstractC8823qM16245e)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC8823q) {
                            if (abstractC8823qM16245e.m16276f()) {
                                abstractC8823qM16245e.m16260e();
                            }
                        }
                    }
                    if (abstractC8823q.m16276f()) {
                        abstractC8823q.m16260e();
                    }
                }
            }
            C1863k c1863k2 = (C1863k) AbstractC8808b.m16245e(objM16244d);
            AtomicReferenceArray atomicReferenceArray = c1863k2.f8849e;
            c1863k2.m16257a();
            z6 = false;
            if (c1863k2.f42518c <= j6) {
                int i12 = (int) (andIncrement2 % AbstractC1862j.f8848f);
                Object andSet = atomicReferenceArray.getAndSet(i12, AbstractC1862j.f8844b);
                if (andSet == null) {
                    int i13 = AbstractC1862j.f8843a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (atomicReferenceArray.get(i12) == AbstractC1862j.f8845c) {
                            z6 = true;
                            break;
                        }
                    }
                    C4417q c4417q = AbstractC1862j.f8844b;
                    C4417q c4417q2 = AbstractC1862j.f8846d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i12, c4417q, c4417q2)) {
                            if (atomicReferenceArray.get(i12) != c4417q) {
                                break;
                            }
                        } else {
                            z6 = true;
                            break;
                        }
                    }
                    z6 = !z6;
                } else if (andSet != AbstractC1862j.f8847e) {
                    boolean z10 = andSet instanceof InterfaceC7250j;
                    a0 a0Var = a0.f30746a;
                    if (!z10) {
                        if (!(andSet instanceof InterfaceC1535f)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((C1534e) ((InterfaceC1535f) andSet)).m5082g(this, a0Var) == 0) {
                            z6 = true;
                            break;
                            break;
                        }
                    } else {
                        InterfaceC7250j interfaceC7250j = (InterfaceC7250j) andSet;
                        C4417q c4417qMo5486r = interfaceC7250j.mo5486r(a0Var, this.f8842b);
                        if (c4417qMo5486r != null) {
                            interfaceC7250j.mo5487s(c4417qMo5486r);
                            z6 = true;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (!z6);
    }
}

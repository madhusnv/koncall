package yx;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l7.C4417q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.l */
/* loaded from: classes3.dex */
public final class C8818l {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42507e = AtomicReferenceFieldUpdater.newUpdater(C8818l.class, Object.class, "_next$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f42508f = AtomicLongFieldUpdater.newUpdater(C8818l.class, "_state$volatile");

    /* renamed from: g */
    public static final C4417q f42509g = new C4417q("REMOVE_FROZEN", 3);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a */
    public final int f42510a;

    /* renamed from: b */
    public final boolean f42511b;

    /* renamed from: c */
    public final int f42512c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f42513d;

    public C8818l(int i10, boolean z6) {
        this.f42510a = i10;
        this.f42511b = z6;
        int i11 = i10 - 1;
        this.f42512c = i11;
        this.f42513d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: a */
    public final int m16269a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f42508f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j6) != 0) {
                return (2305843009213693952L & j6) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j6);
            int i11 = (int) ((1152921503533105152L & j6) >> 30);
            int i12 = this.f42512c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            boolean z6 = this.f42511b;
            AtomicReferenceArray atomicReferenceArray = this.f42513d;
            if (z6 || atomicReferenceArray.get(i11 & i12) == null) {
                if (f42508f.compareAndSet(this, j6, ((-1152921503533105153L) & j6) | (((i11 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i11 & i12, obj);
                    C8818l c8818lM16271c = this;
                    while ((atomicLongFieldUpdater.get(c8818lM16271c) & 1152921504606846976L) != 0) {
                        c8818lM16271c = c8818lM16271c.m16271c();
                        AtomicReferenceArray atomicReferenceArray2 = c8818lM16271c.f42513d;
                        int i13 = c8818lM16271c.f42512c & i11;
                        Object obj2 = atomicReferenceArray2.get(i13);
                        if ((obj2 instanceof C8817k) && ((C8817k) obj2).f42506a == i11) {
                            atomicReferenceArray2.set(i13, obj);
                        } else {
                            c8818lM16271c = null;
                        }
                        if (c8818lM16271c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i14 = this.f42510a;
                if (i14 < 1024 || ((i11 - i10) & 1073741823) > (i14 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m16270b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        do {
            atomicLongFieldUpdater = f42508f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, 2305843009213693952L | j6));
        return true;
    }

    /* renamed from: c */
    public final C8818l m16271c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        C8818l c8818l;
        while (true) {
            atomicLongFieldUpdater = f42508f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                c8818l = this;
                break;
            }
            long j10 = 1152921504606846976L | j6;
            c8818l = this;
            if (atomicLongFieldUpdater.compareAndSet(c8818l, j6, j10)) {
                j6 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42507e;
            C8818l c8818l2 = (C8818l) atomicReferenceFieldUpdater.get(this);
            if (c8818l2 != null) {
                return c8818l2;
            }
            C8818l c8818l3 = new C8818l(c8818l.f42510a * 2, c8818l.f42511b);
            int i10 = (int) (1073741823 & j6);
            int i11 = (int) ((1152921503533105152L & j6) >> 30);
            while (true) {
                int i12 = c8818l.f42512c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object c8817k = c8818l.f42513d.get(i13);
                if (c8817k == null) {
                    c8817k = new C8817k(i10);
                }
                c8818l3.f42513d.set(c8818l3.f42512c & i10, c8817k);
                i10++;
            }
            atomicLongFieldUpdater.set(c8818l3, (-1152921504606846977L) & j6);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c8818l3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16272d() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = yx.C8818l.f42508f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            l7.q r0 = yx.C8818l.f42509g
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.f42512c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.f42513d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.f42511b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof yx.C8817k
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = yx.C8818l.f42508f
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            yx.l r0 = r1.m16271c()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = yx.C8818l.f42508f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f42513d
            int r2 = r2.f42512c
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: yx.C8818l.m16272d():java.lang.Object");
    }
}

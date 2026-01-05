package vx;

import bt.l0;
import cy.C1534e;
import cy.EnumC1538i;
import cy.InterfaceC1535f;
import dr.C1762l;
import ex.InterfaceC2139c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.d0;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import l7.C4417q;
import ls.C4512c;
import og.md;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.n6;
import qw.a0;
import tb.C7105p;
import tx.C7251k;
import tx.InterfaceC7250j;
import tx.c0;
import tx.e2;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yx.AbstractC8808b;
import yx.AbstractC8823q;
import yx.AbstractC8824r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.h */
/* loaded from: classes3.dex */
public class C7806h implements InterfaceC7810l {

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f37484d = AtomicLongFieldUpdater.newUpdater(C7806h.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f37485e = AtomicLongFieldUpdater.newUpdater(C7806h.class, "receivers$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f37486f = AtomicLongFieldUpdater.newUpdater(C7806h.class, "bufferEnd$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f37487g = AtomicLongFieldUpdater.newUpdater(C7806h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37488h = AtomicReferenceFieldUpdater.newUpdater(C7806h.class, Object.class, "sendSegment$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37489j = AtomicReferenceFieldUpdater.newUpdater(C7806h.class, Object.class, "receiveSegment$volatile");

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37490k = AtomicReferenceFieldUpdater.newUpdater(C7806h.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37491l = AtomicReferenceFieldUpdater.newUpdater(C7806h.class, Object.class, "_closeCause$volatile");

    /* renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37492m = AtomicReferenceFieldUpdater.newUpdater(C7806h.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a */
    public final int f37493a;

    /* renamed from: b */
    public final InterfaceC2139c f37494b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c */
    public final l0 f37495c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public C7806h(int i10, InterfaceC2139c interfaceC2139c) {
        this.f37493a = i10;
        this.f37494b = interfaceC2139c;
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C7814p c7814p = AbstractC7808j.f37497a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f37486f.get(this);
        C7814p c7814p2 = new C7814p(0L, null, this, 3);
        this.sendSegment$volatile = c7814p2;
        this.receiveSegment$volatile = c7814p2;
        if (m14761C()) {
            c7814p2 = AbstractC7808j.f37497a;
            AbstractC4154l.m8921d(c7814p2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c7814p2;
        this.f37495c = interfaceC2139c != null ? new l0(26, this) : null;
        this._closeCause$volatile = AbstractC7808j.f37515s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m14754F(vx.C7806h r13, ww.AbstractC8193c r14) {
        /*
            boolean r0 = r14 instanceof vx.C7804f
            if (r0 == 0) goto L14
            r0 = r14
            vx.f r0 = (vx.C7804f) r0
            int r1 = r0.f37480c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f37480c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            vx.f r0 = new vx.f
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f37478a
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r6.f37480c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            og.od.m10798c(r14)
            vx.o r14 = (vx.C7813o) r14
            java.lang.Object r13 = r14.f37520a
            return r13
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            og.od.m10798c(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = vx.C7806h.f37489j
            java.lang.Object r14 = r14.get(r13)
            vx.p r14 = (vx.C7814p) r14
        L40:
            boolean r1 = r13.m14792z()
            if (r1 == 0) goto L50
            java.lang.Throwable r13 = r13.m14787t()
            vx.m r14 = new vx.m
            r14.<init>(r13)
            return r14
        L50:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = vx.C7806h.f37485e
            long r4 = r1.getAndIncrement(r13)
            int r1 = vx.AbstractC7808j.f37498b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f42518c
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            vx.p r1 = r13.m14786s(r9, r14)
            if (r1 != 0) goto L6b
            goto L40
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r14
        L6e:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.m14768K(r8, r9, r10, r12)
            r1 = r7
            l7.q r14 = vx.AbstractC7808j.f37509m
            if (r13 == r14) goto La0
            l7.q r14 = vx.AbstractC7808j.f37511o
            if (r13 != r14) goto L8d
            long r13 = r1.m14790w()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8a
            r8.m16257a()
        L8a:
            r13 = r1
            r14 = r8
            goto L40
        L8d:
            l7.q r14 = vx.AbstractC7808j.f37510n
            if (r13 != r14) goto L9c
            r6.f37480c = r2
            r2 = r8
            java.lang.Object r13 = r1.m14764G(r2, r3, r4, r6)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            return r13
        L9c:
            r8.m16257a()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7806h.m14754F(vx.h, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public static final C7814p m14755d(C7806h c7806h, long j6, C7814p c7814p) {
        Object objM16244d;
        C7806h c7806h2;
        C7814p c7814p2 = AbstractC7808j.f37497a;
        C7807i c7807i = C7807i.f37496a;
        loop0: while (true) {
            objM16244d = AbstractC8808b.m16244d(c7814p, j6, c7807i);
            if (!AbstractC8808b.m16247g(objM16244d)) {
                AbstractC8823q abstractC8823qM16245e = AbstractC8808b.m16245e(objM16244d);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37488h;
                    AbstractC8823q abstractC8823q = (AbstractC8823q) atomicReferenceFieldUpdater.get(c7806h);
                    if (abstractC8823q.f42518c >= abstractC8823qM16245e.f42518c) {
                        break loop0;
                    }
                    if (!abstractC8823qM16245e.m16278j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c7806h, abstractC8823q, abstractC8823qM16245e)) {
                        if (atomicReferenceFieldUpdater.get(c7806h) != abstractC8823q) {
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
        boolean zM16247g = AbstractC8808b.m16247g(objM16244d);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37485e;
        if (zM16247g) {
            c7806h.m14759A();
            if (c7814p.f42518c * AbstractC7808j.f37498b < atomicLongFieldUpdater.get(c7806h)) {
                c7814p.m16257a();
                return null;
            }
        } else {
            C7814p c7814p3 = (C7814p) AbstractC8808b.m16245e(objM16244d);
            long j10 = c7814p3.f42518c;
            if (j10 <= j6) {
                return c7814p3;
            }
            long j11 = AbstractC7808j.f37498b * j10;
            while (true) {
                long j12 = f37484d.get(c7806h);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    c7806h2 = c7806h;
                    break;
                }
                c7806h2 = c7806h;
                if (f37484d.compareAndSet(c7806h2, j12, (((int) (j12 >> 60)) << 60) + j13)) {
                    break;
                }
                c7806h = c7806h2;
            }
            if (j10 * AbstractC7808j.f37498b < atomicLongFieldUpdater.get(c7806h2)) {
                c7814p3.m16257a();
            }
        }
        return null;
    }

    /* renamed from: f */
    public static final void m14756f(C7806h c7806h, Object obj, C7251k c7251k) {
        InterfaceC2139c interfaceC2139c = c7806h.f37494b;
        if (interfaceC2139c != null) {
            AbstractC8808b.m16241a(interfaceC2139c, obj, c7251k.f34651e);
        }
        c7251k.resumeWith(od.m10796a(c7806h.m14789v()));
    }

    /* renamed from: h */
    public static final int m14757h(C7806h c7806h, C7814p c7814p, int i10, Object obj, long j6, Object obj2, boolean z6) {
        c7814p.m14798n(i10, obj);
        if (z6) {
            return c7806h.m14769L(c7814p, i10, obj, j6, obj2, z6);
        }
        Object objM14796l = c7814p.m14796l(i10);
        if (objM14796l == null) {
            if (c7806h.m14780m(j6)) {
                if (c7814p.m14795k(i10, null, AbstractC7808j.f37500d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c7814p.m14795k(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM14796l instanceof e2) {
            c7814p.m14798n(i10, null);
            if (c7806h.m14766I(objM14796l, obj)) {
                c7814p.m14799o(i10, AbstractC7808j.f37505i);
                return 0;
            }
            C4417q c4417q = AbstractC7808j.f37507k;
            if (c7814p.f37522f.getAndSet((i10 * 2) + 1, c4417q) == c4417q) {
                return 5;
            }
            c7814p.m14797m(i10, true);
            return 5;
        }
        return c7806h.m14769L(c7814p, i10, obj, j6, obj2, z6);
    }

    /* renamed from: x */
    public static void m14758x(C7806h c7806h) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37487g;
        if ((atomicLongFieldUpdater.addAndGet(c7806h, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c7806h) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* renamed from: A */
    public final boolean m14759A() {
        return m14791y(false, f37484d.get(this));
    }

    /* renamed from: B */
    public boolean mo14760B() {
        return false;
    }

    /* renamed from: C */
    public final boolean m14761C() {
        long j6 = f37486f.get(this);
        return j6 == 0 || j6 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14762D(long r5, vx.C7814p r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f42518c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            yx.c r0 = r7.m16258c()
            vx.p r0 = (vx.C7814p) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.mo16259d()
            if (r5 == 0) goto L22
            yx.c r5 = r7.m16258c()
            vx.p r5 = (vx.C7814p) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = vx.C7806h.f37490k
            java.lang.Object r6 = r5.get(r4)
            yx.q r6 = (yx.AbstractC8823q) r6
            long r0 = r6.f42518c
            long r2 = r7.f42518c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.m16278j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m16276f()
            if (r5 == 0) goto L49
            r6.m16260e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.m16276f()
            if (r5 == 0) goto L22
            r7.m16260e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7806h.m14762D(long, vx.p):void");
    }

    /* renamed from: E */
    public final Object m14763E(Object obj, InterfaceC7559c interfaceC7559c) {
        UndeliveredElementException undeliveredElementExceptionM16242b;
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        InterfaceC2139c interfaceC2139c = this.f37494b;
        if (interfaceC2139c == null || (undeliveredElementExceptionM16242b = AbstractC8808b.m16242b(interfaceC2139c, obj, null)) == null) {
            c7251k.resumeWith(od.m10796a(m14789v()));
        } else {
            md.m10764a(undeliveredElementExceptionM16242b, m14789v());
            c7251k.resumeWith(od.m10796a(undeliveredElementExceptionM16242b));
        }
        Object objM13539o = c7251k.m13539o();
        return objM13539o == EnumC7794a.COROUTINE_SUSPENDED ? objM13539o : a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m14764G(vx.C7814p r16, int r17, long r18, ww.AbstractC8193c r20) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7806h.m14764G(vx.p, int, long, ww.c):java.lang.Object");
    }

    /* renamed from: H */
    public final void m14765H(e2 e2Var, boolean z6) {
        if (e2Var instanceof InterfaceC7250j) {
            ((InterfaceC7559c) e2Var).resumeWith(od.m10796a(z6 ? m14788u() : m14789v()));
            return;
        }
        if (e2Var instanceof C7820v) {
            ((C7820v) e2Var).f37530a.resumeWith(new C7813o(new C7811m(m14787t())));
            return;
        }
        if (!(e2Var instanceof C7800b)) {
            if (e2Var instanceof InterfaceC1535f) {
                ((C1534e) ((InterfaceC1535f) e2Var)).m5082g(this, AbstractC7808j.f37508l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + e2Var).toString());
            }
        }
        C7800b c7800b = (C7800b) e2Var;
        C7251k c7251k = c7800b.f37473b;
        AbstractC4154l.m8920c(c7251k);
        c7800b.f37473b = null;
        c7800b.f37472a = AbstractC7808j.f37508l;
        Throwable thM14787t = c7800b.f37474c.m14787t();
        if (thM14787t == null) {
            c7251k.resumeWith(Boolean.FALSE);
        } else {
            c7251k.resumeWith(od.m10796a(thM14787t));
        }
    }

    /* renamed from: I */
    public final boolean m14766I(Object obj, Object obj2) {
        if (obj instanceof InterfaceC1535f) {
            return ((C1534e) ((InterfaceC1535f) obj)).m5082g(this, obj2) == 0;
        }
        boolean z6 = obj instanceof C7820v;
        InterfaceC2139c interfaceC2139c = this.f37494b;
        if (z6) {
            return AbstractC7808j.m14793a(((C7820v) obj).f37530a, new C7813o(obj2), interfaceC2139c != null ? m14779l() : null);
        }
        if (!(obj instanceof C7800b)) {
            if (obj instanceof InterfaceC7250j) {
                return AbstractC7808j.m14793a((InterfaceC7250j) obj, obj2, interfaceC2139c != null ? m14778k() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        C7800b c7800b = (C7800b) obj;
        C7251k c7251k = c7800b.f37473b;
        AbstractC4154l.m8920c(c7251k);
        c7800b.f37473b = null;
        c7800b.f37472a = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC2139c interfaceC2139c2 = c7800b.f37474c.f37494b;
        return AbstractC7808j.m14793a(c7251k, bool, interfaceC2139c2 != null ? new C4512c(15, interfaceC2139c2, obj2) : null);
    }

    /* renamed from: J */
    public final boolean m14767J(Object obj, C7814p c7814p, int i10) {
        EnumC1538i enumC1538i;
        boolean z6 = obj instanceof InterfaceC7250j;
        a0 a0Var = a0.f30746a;
        if (z6) {
            return AbstractC7808j.m14793a((InterfaceC7250j) obj, a0Var, null);
        }
        if (!(obj instanceof InterfaceC1535f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iM5082g = ((C1534e) obj).m5082g(this, a0Var);
        if (iM5082g == 0) {
            enumC1538i = EnumC1538i.SUCCESSFUL;
        } else if (iM5082g == 1) {
            enumC1538i = EnumC1538i.REREGISTER;
        } else if (iM5082g == 2) {
            enumC1538i = EnumC1538i.CANCELLED;
        } else {
            if (iM5082g != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iM5082g).toString());
            }
            enumC1538i = EnumC1538i.ALREADY_SELECTED;
        }
        if (enumC1538i == EnumC1538i.REREGISTER) {
            c7814p.m14798n(i10, null);
        }
        return enumC1538i == EnumC1538i.SUCCESSFUL;
    }

    /* renamed from: K */
    public final Object m14768K(C7814p c7814p, int i10, long j6, Object obj) {
        Object objM14796l = c7814p.m14796l(i10);
        AtomicReferenceArray atomicReferenceArray = c7814p.f37522f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37484d;
        if (objM14796l == null) {
            if (j6 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC7808j.f37510n;
                }
                if (c7814p.m14795k(i10, objM14796l, obj)) {
                    m14785r();
                    return AbstractC7808j.f37509m;
                }
            }
        } else if (objM14796l == AbstractC7808j.f37500d && c7814p.m14795k(i10, objM14796l, AbstractC7808j.f37505i)) {
            m14785r();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            c7814p.m14798n(i10, null);
            return obj2;
        }
        while (true) {
            Object objM14796l2 = c7814p.m14796l(i10);
            if (objM14796l2 == null || objM14796l2 == AbstractC7808j.f37501e) {
                if (j6 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c7814p.m14795k(i10, objM14796l2, AbstractC7808j.f37504h)) {
                        m14785r();
                        return AbstractC7808j.f37511o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC7808j.f37510n;
                    }
                    if (c7814p.m14795k(i10, objM14796l2, obj)) {
                        m14785r();
                        return AbstractC7808j.f37509m;
                    }
                }
            } else if (objM14796l2 != AbstractC7808j.f37500d) {
                C4417q c4417q = AbstractC7808j.f37506j;
                if (objM14796l2 == c4417q) {
                    return AbstractC7808j.f37511o;
                }
                if (objM14796l2 == AbstractC7808j.f37504h) {
                    return AbstractC7808j.f37511o;
                }
                if (objM14796l2 == AbstractC7808j.f37508l) {
                    m14785r();
                    return AbstractC7808j.f37511o;
                }
                if (objM14796l2 != AbstractC7808j.f37503g && c7814p.m14795k(i10, objM14796l2, AbstractC7808j.f37502f)) {
                    boolean z6 = objM14796l2 instanceof C7823y;
                    if (z6) {
                        objM14796l2 = ((C7823y) objM14796l2).f37531a;
                    }
                    if (m14767J(objM14796l2, c7814p, i10)) {
                        c7814p.m14799o(i10, AbstractC7808j.f37505i);
                        m14785r();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        c7814p.m14798n(i10, null);
                        return obj3;
                    }
                    c7814p.m14799o(i10, c4417q);
                    c7814p.m16277i();
                    if (z6) {
                        m14785r();
                    }
                    return AbstractC7808j.f37511o;
                }
            } else if (c7814p.m14795k(i10, objM14796l2, AbstractC7808j.f37505i)) {
                m14785r();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                c7814p.m14798n(i10, null);
                return obj4;
            }
        }
    }

    /* renamed from: L */
    public final int m14769L(C7814p c7814p, int i10, Object obj, long j6, Object obj2, boolean z6) {
        while (true) {
            Object objM14796l = c7814p.m14796l(i10);
            if (objM14796l == null) {
                if (!m14780m(j6) || z6) {
                    if (z6) {
                        if (c7814p.m14795k(i10, null, AbstractC7808j.f37506j)) {
                            c7814p.m16277i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c7814p.m14795k(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c7814p.m14795k(i10, null, AbstractC7808j.f37500d)) {
                    break;
                }
            } else {
                if (objM14796l != AbstractC7808j.f37501e) {
                    C4417q c4417q = AbstractC7808j.f37507k;
                    if (objM14796l == c4417q) {
                        c7814p.m14798n(i10, null);
                        return 5;
                    }
                    if (objM14796l == AbstractC7808j.f37504h) {
                        c7814p.m14798n(i10, null);
                        return 5;
                    }
                    if (objM14796l == AbstractC7808j.f37508l) {
                        c7814p.m14798n(i10, null);
                        m14759A();
                        return 4;
                    }
                    c7814p.m14798n(i10, null);
                    if (objM14796l instanceof C7823y) {
                        objM14796l = ((C7823y) objM14796l).f37531a;
                    }
                    if (m14766I(objM14796l, obj)) {
                        c7814p.m14799o(i10, AbstractC7808j.f37505i);
                        return 0;
                    }
                    if (c7814p.f37522f.getAndSet((i10 * 2) + 1, c4417q) != c4417q) {
                        c7814p.m14797m(i10, true);
                    }
                    return 5;
                }
                if (c7814p.m14795k(i10, objM14796l, AbstractC7808j.f37500d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* renamed from: M */
    public final void m14770M(long j6) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C7806h c7806h = this;
        if (c7806h.m14761C()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f37486f;
            if (atomicLongFieldUpdater.get(c7806h) > j6) {
                break;
            } else {
                c7806h = this;
            }
        }
        int i10 = AbstractC7808j.f37499c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f37487g;
            if (i11 < i10) {
                long j10 = atomicLongFieldUpdater.get(c7806h);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(c7806h)) && j10 == atomicLongFieldUpdater.get(c7806h)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(c7806h);
                    if (atomicLongFieldUpdater2.compareAndSet(c7806h, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c7806h = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(c7806h);
                    long j13 = atomicLongFieldUpdater2.get(c7806h);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z6 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(c7806h)) {
                        break;
                    }
                    if (z6) {
                        c7806h = this;
                    } else {
                        c7806h = this;
                        atomicLongFieldUpdater2.compareAndSet(c7806h, j13, 4611686018427387904L + j14);
                    }
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(c7806h);
                    if (atomicLongFieldUpdater2.compareAndSet(c7806h, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        c7806h = this;
                    }
                }
            }
        }
    }

    @Override // vx.InterfaceC7821w
    /* renamed from: a */
    public final C7105p mo14771a() {
        d0.m8907d(3, C7802d.f37476a);
        d0.m8907d(3, C7803e.f37477a);
        return new C7105p(this, this.f37495c);
    }

    @Override // vx.InterfaceC7821w
    /* renamed from: b */
    public final Object mo14772b() {
        C7814p c7814p;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37485e;
        long j6 = atomicLongFieldUpdater.get(this);
        long j10 = f37484d.get(this);
        if (m14791y(true, j10)) {
            return new C7811m(m14787t());
        }
        long j11 = j10 & 1152921504606846975L;
        C7812n c7812n = C7813o.f37519b;
        if (j6 >= j11) {
            return c7812n;
        }
        Object obj = AbstractC7808j.f37507k;
        C7814p c7814p2 = (C7814p) f37489j.get(this);
        while (!m14792z()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = AbstractC7808j.f37498b;
            long j13 = andIncrement / j12;
            int i10 = (int) (andIncrement % j12);
            if (c7814p2.f42518c != j13) {
                C7814p c7814pM14786s = m14786s(j13, c7814p2);
                if (c7814pM14786s == null) {
                    continue;
                } else {
                    c7814p = c7814pM14786s;
                }
            } else {
                c7814p = c7814p2;
            }
            Object objM14768K = m14768K(c7814p, i10, andIncrement, obj);
            C7814p c7814p3 = c7814p;
            if (objM14768K == AbstractC7808j.f37509m) {
                e2 e2Var = obj instanceof e2 ? (e2) obj : null;
                if (e2Var != null) {
                    e2Var.mo5076a(c7814p3, i10);
                }
                m14770M(andIncrement);
                c7814p3.m16277i();
                return c7812n;
            }
            if (objM14768K != AbstractC7808j.f37511o) {
                if (objM14768K == AbstractC7808j.f37510n) {
                    throw new IllegalStateException("unexpected");
                }
                c7814p3.m16257a();
                return objM14768K;
            }
            if (andIncrement < m14790w()) {
                c7814p3.m16257a();
            }
            c7814p2 = c7814p3;
        }
        return new C7811m(m14787t());
    }

    @Override // vx.InterfaceC7821w
    /* renamed from: c */
    public final Object mo14773c(C1762l c1762l) {
        return m14754F(this, c1762l);
    }

    @Override // vx.InterfaceC7821w
    /* renamed from: e */
    public final Object mo14774e(AbstractC8199i abstractC8199i) throws Throwable {
        C7814p c7814p;
        Throwable th2;
        C7814p c7814p2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37489j;
        C7814p c7814p3 = (C7814p) atomicReferenceFieldUpdater.get(this);
        while (!m14792z()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f37485e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = AbstractC7808j.f37498b;
            long j10 = andIncrement / j6;
            int i10 = (int) (andIncrement % j6);
            if (c7814p3.f42518c != j10) {
                C7814p c7814pM14786s = m14786s(j10, c7814p3);
                if (c7814pM14786s == null) {
                    continue;
                } else {
                    c7814p = c7814pM14786s;
                }
            } else {
                c7814p = c7814p3;
            }
            Object objM14768K = m14768K(c7814p, i10, andIncrement, null);
            C4417q c4417q = AbstractC7808j.f37509m;
            if (objM14768K == c4417q) {
                throw new IllegalStateException("unexpected");
            }
            C4417q c4417q2 = AbstractC7808j.f37511o;
            if (objM14768K == c4417q2) {
                if (andIncrement < m14790w()) {
                    c7814p.m16257a();
                }
                c7814p3 = c7814p;
            } else {
                if (objM14768K != AbstractC7808j.f37510n) {
                    c7814p.m16257a();
                    return objM14768K;
                }
                C7251k c7251kM13496s = c0.m13496s(n6.m11797c(abstractC8199i));
                C7806h c7806h = this;
                try {
                    Object objM14768K2 = c7806h.m14768K(c7814p, i10, andIncrement, c7251kM13496s);
                    if (objM14768K2 == c4417q) {
                        c7251kM13496s.mo5076a(c7814p, i10);
                    } else {
                        C7801c c7801cM14778k = null;
                        InterfaceC2139c interfaceC2139c = c7806h.f37494b;
                        if (objM14768K2 == c4417q2) {
                            if (andIncrement < m14790w()) {
                                c7814p.m16257a();
                            }
                            C7814p c7814p4 = (C7814p) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (m14792z()) {
                                    c7251kM13496s.resumeWith(od.m10796a(m14788u()));
                                    break;
                                }
                                C7251k c7251k = c7251kM13496s;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j11 = AbstractC7808j.f37498b;
                                    long j12 = andIncrement2 / j11;
                                    int i11 = (int) (andIncrement2 % j11);
                                    if (c7814p4.f42518c != j12) {
                                        try {
                                            C7814p c7814pM14786s2 = m14786s(j12, c7814p4);
                                            if (c7814pM14786s2 == null) {
                                                c7251kM13496s = c7251k;
                                            } else {
                                                c7814p2 = c7814pM14786s2;
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            c7251kM13496s = c7251k;
                                            c7251kM13496s.m13546z();
                                            throw th2;
                                        }
                                    } else {
                                        c7814p2 = c7814p4;
                                    }
                                    objM14768K2 = c7806h.m14768K(c7814p2, i11, andIncrement2, c7251k);
                                    C7814p c7814p5 = c7814p2;
                                    c7251kM13496s = c7251k;
                                    if (objM14768K2 == AbstractC7808j.f37509m) {
                                        c7251kM13496s.mo5076a(c7814p5, i11);
                                        break;
                                    }
                                    if (objM14768K2 == AbstractC7808j.f37511o) {
                                        if (andIncrement2 < m14790w()) {
                                            c7814p5.m16257a();
                                        }
                                        c7806h = this;
                                        c7814p4 = c7814p5;
                                    } else {
                                        if (objM14768K2 == AbstractC7808j.f37510n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c7814p5.m16257a();
                                        if (interfaceC2139c != null) {
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    c7251kM13496s = c7251k;
                                    th2 = th;
                                    c7251kM13496s.m13546z();
                                    throw th2;
                                }
                            }
                            c7251kM13496s.mo5485f(objM14768K2, c7801cM14778k);
                        } else {
                            c7814p.m16257a();
                            if (interfaceC2139c != null) {
                                c7801cM14778k = m14778k();
                            }
                            c7251kM13496s.mo5485f(objM14768K2, c7801cM14778k);
                        }
                    }
                    Object objM13539o = c7251kM13496s.m13539o();
                    EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                    return objM13539o;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        Throwable thM14788u = m14788u();
        int i12 = AbstractC8824r.f42519a;
        throw thM14788u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        m14756f(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173 A[RETURN] */
    @Override // vx.InterfaceC7822x
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo14775g(java.lang.Object r24, uw.InterfaceC7559c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7806h.mo14775g(java.lang.Object, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // vx.InterfaceC7822x
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo14776i(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = vx.C7806h.f37484d
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.m14791y(r9, r1)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.m14780m(r1)
            r1 = r1 ^ r10
        L1b:
            vx.n r13 = vx.C7813o.f37519b
            if (r1 == 0) goto L20
            return r13
        L20:
            l7.q r6 = vx.AbstractC7808j.f37506j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = vx.C7806h.f37488h
            java.lang.Object r1 = r1.get(r15)
            vx.p r1 = (vx.C7814p) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.m14791y(r9, r2)
            int r14 = vx.AbstractC7808j.f37498b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f42518c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            vx.p r3 = m14755d(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.m14789v()
            vx.m r2 = new vx.m
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = m14757h(r0, r1, r2, r3, r4, r6, r7)
            qw.a0 r3 = qw.a0.f30746a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.m16257a()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = vx.C7806h.f37485e
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.m16257a()
        L8a:
            java.lang.Throwable r1 = r15.m14789v()
            vx.m r2 = new vx.m
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.m16277i()
            java.lang.Throwable r1 = r15.m14789v()
            vx.m r2 = new vx.m
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof tx.e2
            if (r3 == 0) goto Lb2
            tx.e2 r6 = (tx.e2) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.mo5076a(r1, r2)
        Lb9:
            r1.m16277i()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.m16257a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7806h.mo14776i(java.lang.Object):java.lang.Object");
    }

    @Override // vx.InterfaceC7821w
    public final C7800b iterator() {
        return new C7800b(this);
    }

    @Override // vx.InterfaceC7821w
    /* renamed from: j */
    public final void mo14777j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m14782o(cancellationException, true);
    }

    /* renamed from: k */
    public final C7801c m14778k() {
        return new C7801c(3, this, C7806h.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0);
    }

    /* renamed from: l */
    public final C7801c m14779l() {
        return new C7801c(3, this, C7806h.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
    }

    /* renamed from: m */
    public final boolean m14780m(long j6) {
        return j6 < f37486f.get(this) || j6 < f37485e.get(this) + ((long) this.f37493a);
    }

    /* renamed from: n */
    public final boolean m14781n(Throwable th2) {
        return m14782o(th2, false);
    }

    /* renamed from: o */
    public final boolean m14782o(Throwable th2, boolean z6) {
        C7806h c7806h;
        boolean z10;
        long j6;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37484d;
        if (!z6) {
            c7806h = this;
            break;
        }
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if (((int) (j13 >> 60)) != 0) {
                c7806h = this;
                break;
            }
            C7814p c7814p = AbstractC7808j.f37497a;
            c7806h = this;
        } while (!atomicLongFieldUpdater.compareAndSet(c7806h, j13, (j13 & 1152921504606846975L) + (1 << 60)));
        C4417q c4417q = AbstractC7808j.f37515s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37491l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c4417q, th2)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c4417q) {
                z10 = false;
                break;
            }
        }
        if (z6) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(c7806h, j12, (3 << 60) + (j12 & 1152921504606846975L)));
        } else {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j6 >> 60);
                if (i10 == 0) {
                    j10 = j6 & 1152921504606846975L;
                    j11 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j10 = j6 & 1152921504606846975L;
                    j11 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c7806h, j6, (j11 << 60) + j10));
        }
        m14759A();
        if (z10) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f37492m;
                obj = atomicReferenceFieldUpdater2.get(this);
                C4417q c4417q2 = obj == null ? AbstractC7808j.f37513q : AbstractC7808j.f37514r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c4417q2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                d0.m8907d(1, obj);
                ((InterfaceC2139c) obj).invoke(m14787t());
                return z10;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (vx.C7814p) ((yx.AbstractC8809c) yx.AbstractC8809c.f42487b.get(r1));
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final vx.C7814p m14783p(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7806h.m14783p(long):vx.p");
    }

    /* renamed from: q */
    public final void m14784q(long j6) {
        UndeliveredElementException undeliveredElementExceptionM16242b;
        C7814p c7814p = (C7814p) f37489j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f37485e;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j6 < Math.max(this.f37493a + j10, f37486f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = AbstractC7808j.f37498b;
                long j12 = j10 / j11;
                int i10 = (int) (j10 % j11);
                if (c7814p.f42518c != j12) {
                    C7814p c7814pM14786s = m14786s(j12, c7814p);
                    if (c7814pM14786s == null) {
                        continue;
                    } else {
                        c7814p = c7814pM14786s;
                    }
                }
                C7814p c7814p2 = c7814p;
                Object objM14768K = m14768K(c7814p2, i10, j10, null);
                if (objM14768K != AbstractC7808j.f37511o) {
                    c7814p2.m16257a();
                    InterfaceC2139c interfaceC2139c = this.f37494b;
                    if (interfaceC2139c != null && (undeliveredElementExceptionM16242b = AbstractC8808b.m16242b(interfaceC2139c, objM14768K, null)) != null) {
                        throw undeliveredElementExceptionM16242b;
                    }
                } else if (j10 < m14790w()) {
                    c7814p2.m16257a();
                }
                c7814p = c7814p2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        m14758x(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14785r() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7806h.m14785r():void");
    }

    /* renamed from: s */
    public final C7814p m14786s(long j6, C7814p c7814p) {
        Object objM16244d;
        long j10;
        C7814p c7814p2 = AbstractC7808j.f37497a;
        C7807i c7807i = C7807i.f37496a;
        loop0: while (true) {
            objM16244d = AbstractC8808b.m16244d(c7814p, j6, c7807i);
            if (!AbstractC8808b.m16247g(objM16244d)) {
                AbstractC8823q abstractC8823qM16245e = AbstractC8808b.m16245e(objM16244d);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37489j;
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
        if (AbstractC8808b.m16247g(objM16244d)) {
            m14759A();
            if (c7814p.f42518c * AbstractC7808j.f37498b < m14790w()) {
                c7814p.m16257a();
                return null;
            }
        } else {
            C7814p c7814p3 = (C7814p) AbstractC8808b.m16245e(objM16244d);
            long j11 = c7814p3.f42518c;
            if (!m14761C() && j6 <= f37486f.get(this) / AbstractC7808j.f37498b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f37490k;
                    AbstractC8823q abstractC8823q2 = (AbstractC8823q) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC8823q2.f42518c >= j11 || !c7814p3.m16278j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC8823q2, c7814p3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != abstractC8823q2) {
                            if (c7814p3.m16276f()) {
                                c7814p3.m16260e();
                            }
                        }
                    }
                    if (abstractC8823q2.m16276f()) {
                        abstractC8823q2.m16260e();
                    }
                }
            }
            if (j11 <= j6) {
                return c7814p3;
            }
            long j12 = j11 * AbstractC7808j.f37498b;
            do {
                j10 = f37485e.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!f37485e.compareAndSet(this, j10, j12));
            if (j11 * AbstractC7808j.f37498b < m14790w()) {
                c7814p3.m16257a();
            }
        }
        return null;
    }

    /* renamed from: t */
    public final Throwable m14787t() {
        return (Throwable) f37491l.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b7, code lost:
    
        r16 = r7;
        r3 = (vx.C7814p) r3.m16258c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7806h.toString():java.lang.String");
    }

    /* renamed from: u */
    public final Throwable m14788u() {
        Throwable thM14787t = m14787t();
        return thM14787t == null ? new ClosedReceiveChannelException("Channel was closed") : thM14787t;
    }

    /* renamed from: v */
    public final Throwable m14789v() {
        Throwable thM14787t = m14787t();
        return thM14787t == null ? new ClosedSendChannelException("Channel was closed") : thM14787t;
    }

    /* renamed from: w */
    public final long m14790w() {
        return f37484d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01a4, code lost:
    
        vx.C7806h.f37485e.compareAndSet(r1, r3, 1 + r3);
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r16 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r16 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m14791y(boolean r19, long r20) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7806h.m14791y(boolean, long):boolean");
    }

    /* renamed from: z */
    public final boolean m14792z() {
        return m14791y(true, f37484d.get(this));
    }
}

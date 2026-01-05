package p001o;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lombok.javac.Javac;
import p001o.vre;

/* loaded from: classes6.dex */
public class dm1 implements jg2 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f20202d = AtomicLongFieldUpdater.newUpdater(dm1.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f20203e = AtomicLongFieldUpdater.newUpdater(dm1.class, "receivers$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f20204f = AtomicLongFieldUpdater.newUpdater(dm1.class, "bufferEnd$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f20205g = AtomicLongFieldUpdater.newUpdater(dm1.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20206h = AtomicReferenceFieldUpdater.newUpdater(dm1.class, Object.class, "sendSegment$volatile");

    /* renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20207q = AtomicReferenceFieldUpdater.newUpdater(dm1.class, Object.class, "receiveSegment$volatile");

    /* renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20208s = AtomicReferenceFieldUpdater.newUpdater(dm1.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20209x = AtomicReferenceFieldUpdater.newUpdater(dm1.class, Object.class, "_closeCause$volatile");

    /* renamed from: y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20210y = AtomicReferenceFieldUpdater.newUpdater(dm1.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a */
    public final int f20211a;

    /* renamed from: b */
    public final xk7 f20212b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c */
    public final ql7 f20213c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: o.dm1$a */
    public final class C12985a implements sg2, x3j {

        /* renamed from: a */
        public Object f20214a = em1.f21848p;

        /* renamed from: b */
        public zb2 f20215b;

        public C12985a() {
        }

        @Override // p001o.sg2
        /* renamed from: a */
        public Object mo23482a(n64 n64Var) throws Throwable {
            xg2 xg2Var;
            boolean zM23485g = true;
            if (this.f20214a == em1.f21848p || this.f20214a == em1.m25280z()) {
                dm1 dm1Var = dm1.this;
                xg2 xg2Var2 = (xg2) dm1.e0().get(dm1Var);
                while (true) {
                    if (dm1Var.s0()) {
                        zM23485g = m23485g();
                        break;
                    }
                    long andIncrement = dm1.f0().getAndIncrement(dm1Var);
                    int i = em1.f21834b;
                    long j = andIncrement / i;
                    int i2 = (int) (andIncrement % i);
                    if (xg2Var2.f28439c != j) {
                        xg2 xg2VarM23467V = dm1Var.m23467V(j, xg2Var2);
                        if (xg2VarM23467V == null) {
                            continue;
                        } else {
                            xg2Var = xg2VarM23467V;
                        }
                    } else {
                        xg2Var = xg2Var2;
                    }
                    Object objF1 = dm1Var.f1(xg2Var, i2, andIncrement, null);
                    if (objF1 == em1.f21845m) {
                        throw new IllegalStateException("unreachable".toString());
                    }
                    if (objF1 == em1.f21847o) {
                        if (andIncrement < dm1Var.k0()) {
                            xg2Var.m25422c();
                        }
                        xg2Var2 = xg2Var;
                    } else {
                        if (objF1 == em1.f21846n) {
                            return m23484f(xg2Var, i2, andIncrement, n64Var);
                        }
                        xg2Var.m25422c();
                        this.f20214a = objF1;
                    }
                }
            }
            return ml1.m39301a(zM23485g);
        }

        @Override // p001o.x3j
        /* renamed from: c */
        public void mo23483c(ibf ibfVar, int i) {
            zb2 zb2Var = this.f20215b;
            if (zb2Var != null) {
                zb2Var.mo23483c(ibfVar, i);
            }
        }

        /* renamed from: f */
        public final Object m23484f(xg2 xg2Var, int i, long j, n64 n64Var) {
            Boolean boolM39301a;
            dm1 dm1Var = dm1.this;
            zb2 zb2VarM18561b = bc2.m18561b(tq8.m50336c(n64Var));
            try {
                this.f20215b = zb2VarM18561b;
                Object objF1 = dm1Var.f1(xg2Var, i, j, this);
                if (objF1 == em1.f21845m) {
                    dm1Var.M0(this, xg2Var, i);
                } else {
                    ql7 ql7VarM23454H = null;
                    if (objF1 == em1.f21847o) {
                        if (j < dm1Var.k0()) {
                            xg2Var.m25422c();
                        }
                        xg2 xg2Var2 = (xg2) dm1.e0().get(dm1Var);
                        while (true) {
                            if (dm1Var.s0()) {
                                m23486h();
                                break;
                            }
                            long andIncrement = dm1.f0().getAndIncrement(dm1Var);
                            int i2 = em1.f21834b;
                            long j2 = andIncrement / i2;
                            int i3 = (int) (andIncrement % i2);
                            if (xg2Var2.f28439c != j2) {
                                xg2 xg2VarM23467V = dm1Var.m23467V(j2, xg2Var2);
                                if (xg2VarM23467V != null) {
                                    xg2Var2 = xg2VarM23467V;
                                }
                            }
                            Object objF12 = dm1Var.f1(xg2Var2, i3, andIncrement, this);
                            if (objF12 == em1.f21845m) {
                                dm1Var.M0(this, xg2Var2, i3);
                                break;
                            }
                            if (objF12 == em1.f21847o) {
                                if (andIncrement < dm1Var.k0()) {
                                    xg2Var2.m25422c();
                                }
                            } else {
                                if (objF12 == em1.f21846n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                xg2Var2.m25422c();
                                this.f20214a = objF12;
                                this.f20215b = null;
                                boolM39301a = ml1.m39301a(true);
                                xk7 xk7Var = dm1Var.f20212b;
                                if (xk7Var != null) {
                                    ql7VarM23454H = dm1Var.m23454H(xk7Var, objF12);
                                }
                            }
                        }
                    } else {
                        xg2Var.m25422c();
                        this.f20214a = objF1;
                        this.f20215b = null;
                        boolM39301a = ml1.m39301a(true);
                        xk7 xk7Var2 = dm1Var.f20212b;
                        if (xk7Var2 != null) {
                            ql7VarM23454H = dm1Var.m23454H(xk7Var2, objF1);
                        }
                    }
                    zb2VarM18561b.mo48684A(boolM39301a, ql7VarM23454H);
                }
                Object objM59140v = zb2VarM18561b.m59140v();
                if (objM59140v == uq8.m51918f()) {
                    n75.m40201c(n64Var);
                }
                return objM59140v;
            } catch (Throwable th) {
                zb2VarM18561b.m59124O();
                throw th;
            }
        }

        /* renamed from: g */
        public final boolean m23485g() throws Throwable {
            this.f20214a = em1.m25280z();
            Throwable thA0 = dm1.this.a0();
            if (thA0 == null) {
                return false;
            }
            throw u2g.m50870a(thA0);
        }

        /* renamed from: h */
        public final void m23486h() {
            zb2 zb2Var = this.f20215b;
            sq8.m48646e(zb2Var);
            this.f20215b = null;
            this.f20214a = em1.m25280z();
            Throwable thA0 = dm1.this.a0();
            if (thA0 == null) {
                vre.C17665a c17665a = vre.f50797b;
                zb2Var.resumeWith(vre.m53351b(Boolean.FALSE));
            } else {
                vre.C17665a c17665a2 = vre.f50797b;
                zb2Var.resumeWith(vre.m53351b(wre.m54933a(thA0)));
            }
        }

        /* renamed from: i */
        public final boolean m23487i(Object obj) {
            zb2 zb2Var = this.f20215b;
            sq8.m48646e(zb2Var);
            this.f20215b = null;
            this.f20214a = obj;
            Boolean bool = Boolean.TRUE;
            dm1 dm1Var = dm1.this;
            xk7 xk7Var = dm1Var.f20212b;
            return em1.m25253B(zb2Var, bool, xk7Var != null ? dm1Var.m23454H(xk7Var, obj) : null);
        }

        /* renamed from: j */
        public final void m23488j() {
            zb2 zb2Var = this.f20215b;
            sq8.m48646e(zb2Var);
            this.f20215b = null;
            this.f20214a = em1.m25280z();
            Throwable thA0 = dm1.this.a0();
            if (thA0 == null) {
                vre.C17665a c17665a = vre.f50797b;
                zb2Var.resumeWith(vre.m53351b(Boolean.FALSE));
            } else {
                vre.C17665a c17665a2 = vre.f50797b;
                zb2Var.resumeWith(vre.m53351b(wre.m54933a(thA0)));
            }
        }

        @Override // p001o.sg2
        public Object next() throws Throwable {
            Object obj = this.f20214a;
            if (!(obj != em1.f21848p)) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.f20214a = em1.f21848p;
            if (obj != em1.m25280z()) {
                return obj;
            }
            throw u2g.m50870a(dm1.this.d0());
        }
    }

    /* renamed from: o.dm1$b */
    public /* synthetic */ class C12986b extends dm7 implements ql7 {
        public C12986b(Object obj) {
            super(3, obj, dm1.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        /* renamed from: b */
        public final void m23489b(Throwable th, Object obj, q74 q74Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ((dm1) this.receiver).C0(th, obj, q74Var);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m23489b((Throwable) obj, obj2, (q74) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.dm1$c */
    public /* synthetic */ class C12987c extends dm7 implements ql7 {

        /* renamed from: a */
        public static final C12987c f20217a = new C12987c();

        public C12987c() {
            super(3, dm1.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final void m23490b(dm1 dm1Var, xbf xbfVar, Object obj) {
            dm1Var.S0(xbfVar, obj);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m23490b((dm1) obj, (xbf) obj2, obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.dm1$d */
    public /* synthetic */ class C12988d extends dm7 implements ql7 {

        /* renamed from: a */
        public static final C12988d f20218a = new C12988d();

        public C12988d() {
            super(3, dm1.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p001o.ql7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dm1 dm1Var, Object obj, Object obj2) {
            return dm1Var.O0(obj, obj2);
        }
    }

    /* renamed from: o.dm1$e */
    public /* synthetic */ class C12989e extends dm7 implements ql7 {

        /* renamed from: a */
        public static final C12989e f20219a = new C12989e();

        public C12989e() {
            super(3, dm1.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final void m23492b(dm1 dm1Var, xbf xbfVar, Object obj) {
            dm1Var.S0(xbfVar, obj);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m23492b((dm1) obj, (xbf) obj2, obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.dm1$f */
    public /* synthetic */ class C12990f extends dm7 implements ql7 {

        /* renamed from: a */
        public static final C12990f f20220a = new C12990f();

        public C12990f() {
            super(3, dm1.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p001o.ql7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dm1 dm1Var, Object obj, Object obj2) {
            return dm1Var.P0(obj, obj2);
        }
    }

    public dm1(int i, xk7 xk7Var) {
        this.f20211a = i;
        this.f20212b = xk7Var;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = em1.m25252A(i);
        this.completedExpandBuffersAndPauseFlag$volatile = m23469Y();
        xg2 xg2Var = new xg2(0L, null, this, 3);
        this.sendSegment$volatile = xg2Var;
        this.receiveSegment$volatile = xg2Var;
        if (w0()) {
            xg2Var = em1.f21833a;
            sq8.m48647f(xg2Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = xg2Var;
        this.f20213c = xk7Var != null ? new ql7() { // from class: o.bm1
            @Override // p001o.ql7
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return dm1.K0(this.f16495a, (xbf) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = em1.f21851s;
    }

    /* renamed from: J */
    public static final y3i m23435J(xk7 xk7Var, Object obj, Throwable th, Object obj2, q74 q74Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        lcc.m36947a(xk7Var, obj, q74Var);
        return y3i.f54824a;
    }

    public static final ql7 K0(final dm1 dm1Var, final xbf xbfVar, Object obj, final Object obj2) {
        return new ql7() { // from class: o.cm1
            @Override // p001o.ql7
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return dm1.L0(obj2, dm1Var, xbfVar, (Throwable) obj3, obj4, (q74) obj5);
            }
        };
    }

    public static final y3i L0(Object obj, dm1 dm1Var, xbf xbfVar, Throwable th, Object obj2, q74 q74Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj != em1.m25280z()) {
            lcc.m36947a(dm1Var.f20212b, obj, xbfVar.getContext());
        }
        return y3i.f54824a;
    }

    public static /* synthetic */ Object Q0(dm1 dm1Var, n64 n64Var) throws Throwable {
        xg2 xg2Var;
        xg2 xg2Var2 = (xg2) e0().get(dm1Var);
        while (!dm1Var.s0()) {
            long andIncrement = f0().getAndIncrement(dm1Var);
            int i = em1.f21834b;
            long j = andIncrement / i;
            int i2 = (int) (andIncrement % i);
            if (xg2Var2.f28439c != j) {
                xg2 xg2VarM23467V = dm1Var.m23467V(j, xg2Var2);
                if (xg2VarM23467V == null) {
                    continue;
                } else {
                    xg2Var = xg2VarM23467V;
                }
            } else {
                xg2Var = xg2Var2;
            }
            Object objF1 = dm1Var.f1(xg2Var, i2, andIncrement, null);
            if (objF1 == em1.f21845m) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (objF1 != em1.f21847o) {
                if (objF1 == em1.f21846n) {
                    return dm1Var.R0(xg2Var, i2, andIncrement, n64Var);
                }
                xg2Var.m25422c();
                return objF1;
            }
            if (andIncrement < dm1Var.k0()) {
                xg2Var.m25422c();
            }
            xg2Var2 = xg2Var;
        }
        throw u2g.m50870a(dm1Var.d0());
    }

    public static /* synthetic */ Object X0(dm1 dm1Var, Object obj, n64 n64Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        xg2 xg2Var;
        xg2 xg2Var2 = (xg2) i0().get(dm1Var);
        while (true) {
            long andIncrement = j0().getAndIncrement(dm1Var);
            long j = andIncrement & 1152921504606846975L;
            boolean zU0 = dm1Var.u0(andIncrement);
            int i = em1.f21834b;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (xg2Var2.f28439c != j2) {
                xg2 xg2VarM23468W = dm1Var.m23468W(j2, xg2Var2);
                if (xg2VarM23468W != null) {
                    xg2Var = xg2VarM23468W;
                } else if (zU0) {
                    Object objG0 = dm1Var.G0(obj, n64Var);
                    if (objG0 == uq8.m51918f()) {
                        return objG0;
                    }
                }
            } else {
                xg2Var = xg2Var2;
            }
            int iH1 = dm1Var.h1(xg2Var, i2, obj, j, null, zU0);
            if (iH1 == 0) {
                xg2Var.m25422c();
                break;
            }
            if (iH1 == 1) {
                break;
            }
            if (iH1 != 2) {
                if (iH1 == 3) {
                    Object objY0 = dm1Var.Y0(xg2Var, i2, obj, j, n64Var);
                    if (objY0 == uq8.m51918f()) {
                        return objY0;
                    }
                } else if (iH1 != 4) {
                    if (iH1 == 5) {
                        xg2Var.m25422c();
                    }
                    xg2Var2 = xg2Var;
                } else {
                    if (j < dm1Var.g0()) {
                        xg2Var.m25422c();
                    }
                    Object objG02 = dm1Var.G0(obj, n64Var);
                    if (objG02 == uq8.m51918f()) {
                        return objG02;
                    }
                }
            } else if (zU0) {
                xg2Var.m31890t();
                Object objG03 = dm1Var.G0(obj, n64Var);
                if (objG03 == uq8.m51918f()) {
                    return objG03;
                }
            }
        }
        return y3i.f54824a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater e0() {
        return f20207q;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater f0() {
        return f20203e;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater i0() {
        return f20206h;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater j0() {
        return f20202d;
    }

    public static /* synthetic */ void o0(dm1 dm1Var, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        dm1Var.n0(j);
    }

    public final void A0() {
        long j;
        long jM25277w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20202d;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                jM25277w = em1.m25277w(j & 1152921504606846975L, 2);
            } else if (i != 1) {
                return;
            } else {
                jM25277w = em1.m25277w(j & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, jM25277w));
    }

    public final void B0(long j, xg2 xg2Var) {
        boolean z;
        xg2 xg2Var2;
        xg2 xg2Var3;
        while (xg2Var.f28439c < j && (xg2Var3 = (xg2) xg2Var.m25425f()) != null) {
            xg2Var = xg2Var3;
        }
        while (true) {
            if (!xg2Var.mo25428k() || (xg2Var2 = (xg2) xg2Var.m25425f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20208s;
                while (true) {
                    ibf ibfVar = (ibf) atomicReferenceFieldUpdater.get(this);
                    z = true;
                    if (ibfVar.f28439c >= xg2Var.f28439c) {
                        break;
                    }
                    if (!xg2Var.m31891u()) {
                        z = false;
                        break;
                    } else if (j9.m33417a(atomicReferenceFieldUpdater, this, ibfVar, xg2Var)) {
                        if (ibfVar.m31889p()) {
                            ibfVar.m25431n();
                        }
                    } else if (xg2Var.m31889p()) {
                        xg2Var.m25431n();
                    }
                }
                if (z) {
                    return;
                }
            } else {
                xg2Var = xg2Var2;
            }
        }
    }

    public final void C0(Throwable th, Object obj, q74 q74Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        xk7 xk7Var = this.f20212b;
        sq8.m48646e(xk7Var);
        lcc.m36947a(xk7Var, obj, q74Var);
    }

    public void D0() {
    }

    public final void E0(xb2 xb2Var) {
        vre.C17665a c17665a = vre.f50797b;
        xb2Var.resumeWith(vre.m53351b(wre.m54933a(d0())));
    }

    public final void F0(xbf xbfVar) {
        xbfVar.mo54178b(em1.m25280z());
    }

    public final Object G0(Object obj, n64 n64Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f3i f3iVarM36949c;
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        xk7 xk7Var = this.f20212b;
        if (xk7Var == null || (f3iVarM36949c = lcc.m36949c(xk7Var, obj, null, 2, null)) == null) {
            Throwable thH0 = h0();
            vre.C17665a c17665a = vre.f50797b;
            zb2Var.resumeWith(vre.m53351b(wre.m54933a(thH0)));
        } else {
            cl6.m21376a(f3iVarM36949c, h0());
            vre.C17665a c17665a2 = vre.f50797b;
            zb2Var.resumeWith(vre.m53351b(wre.m54933a(f3iVarM36949c)));
        }
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v == uq8.m51918f() ? objM59140v : y3i.f54824a;
    }

    /* renamed from: H */
    public final ql7 m23454H(final xk7 xk7Var, final Object obj) {
        return new ql7() { // from class: o.am1
            @Override // p001o.ql7
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return dm1.m23435J(xk7Var, obj, (Throwable) obj2, obj3, (q74) obj4);
            }
        };
    }

    public final void H0(Object obj, xb2 xb2Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        xk7 xk7Var = this.f20212b;
        if (xk7Var != null) {
            lcc.m36947a(xk7Var, obj, xb2Var.getContext());
        }
        Throwable thH0 = h0();
        vre.C17665a c17665a = vre.f50797b;
        xb2Var.resumeWith(vre.m53351b(wre.m54933a(thH0)));
    }

    /* renamed from: I */
    public final rb9 m23455I(xk7 xk7Var) {
        return new C12986b(this);
    }

    public void I0() {
    }

    public void J0() {
    }

    /* renamed from: K */
    public final boolean m23456K(long j) {
        return j < m23469Y() || j < g0() + ((long) this.f20211a);
    }

    /* renamed from: L */
    public boolean m23457L(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return m23460O(th, true);
    }

    /* renamed from: M */
    public final void m23458M(xg2 xg2Var, long j) {
        Object objM17202b = aj8.m17202b(null, 1, null);
        loop0: while (xg2Var != null) {
            for (int i = em1.f21834b - 1; -1 < i; i--) {
                if ((xg2Var.f28439c * em1.f21834b) + i < j) {
                    break loop0;
                }
                while (true) {
                    Object objM56233B = xg2Var.m56233B(i);
                    if (objM56233B != null && objM56233B != em1.f21837e) {
                        if (!(objM56233B instanceof y3j)) {
                            if (!(objM56233B instanceof x3j)) {
                                break;
                            }
                            if (xg2Var.m56239v(i, objM56233B, em1.m25280z())) {
                                objM17202b = aj8.m17203c(objM17202b, objM56233B);
                                xg2Var.m56234C(i, true);
                                break;
                            }
                        } else {
                            if (xg2Var.m56239v(i, objM56233B, em1.m25280z())) {
                                objM17202b = aj8.m17203c(objM17202b, ((y3j) objM56233B).f54825a);
                                xg2Var.m56234C(i, true);
                                break;
                            }
                        }
                    } else {
                        if (xg2Var.m56239v(i, objM56233B, em1.m25280z())) {
                            xg2Var.m31890t();
                            break;
                        }
                    }
                }
            }
            xg2Var = (xg2) xg2Var.m25427h();
        }
        if (objM17202b != null) {
            if (!(objM17202b instanceof ArrayList)) {
                U0((x3j) objM17202b);
                return;
            }
            sq8.m48647f(objM17202b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objM17202b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                U0((x3j) arrayList.get(size));
            }
        }
    }

    public final void M0(x3j x3jVar, xg2 xg2Var, int i) {
        J0();
        x3jVar.mo23483c(xg2Var, i);
    }

    /* renamed from: N */
    public final xg2 m23459N() {
        Object obj = f20208s.get(this);
        xg2 xg2Var = (xg2) f20206h.get(this);
        if (xg2Var.f28439c > ((xg2) obj).f28439c) {
            obj = xg2Var;
        }
        xg2 xg2Var2 = (xg2) f20207q.get(this);
        if (xg2Var2.f28439c > ((xg2) obj).f28439c) {
            obj = xg2Var2;
        }
        return (xg2) dq3.m23677b((eq3) obj);
    }

    public final void N0(x3j x3jVar, xg2 xg2Var, int i) {
        x3jVar.mo23483c(xg2Var, i + em1.f21834b);
    }

    /* renamed from: O */
    public boolean m23460O(Throwable th, boolean z) {
        if (z) {
            y0();
        }
        boolean zM33417a = j9.m33417a(f20209x, this, em1.f21851s, th);
        if (z) {
            z0();
        } else {
            A0();
        }
        m23463R();
        D0();
        if (zM33417a) {
            p0();
        }
        return zM33417a;
    }

    public final Object O0(Object obj, Object obj2) throws Throwable {
        if (obj2 != em1.m25280z()) {
            return obj2;
        }
        throw d0();
    }

    /* renamed from: P */
    public final void m23461P(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        T0(m23462Q(j));
    }

    public final Object P0(Object obj, Object obj2) {
        return vg2.m52736b(obj2 == em1.m25280z() ? vg2.f50294b.m52746a(a0()) : vg2.f50294b.m52748c(obj2));
    }

    /* renamed from: Q */
    public final xg2 m23462Q(long j) {
        xg2 xg2VarM23459N = m23459N();
        if (v0()) {
            long jX0 = x0(xg2VarM23459N);
            if (jX0 != -1) {
                m23464S(jX0);
            }
        }
        m23458M(xg2VarM23459N, j);
        return xg2VarM23459N;
    }

    /* renamed from: R */
    public final void m23463R() {
        mo23477n();
    }

    public final Object R0(xg2 xg2Var, int i, long j, n64 n64Var) {
        ql7 ql7Var;
        zb2 zb2VarM18561b = bc2.m18561b(tq8.m50336c(n64Var));
        try {
            Object objF1 = f1(xg2Var, i, j, zb2VarM18561b);
            if (objF1 == em1.f21845m) {
                M0(zb2VarM18561b, xg2Var, i);
            } else {
                if (objF1 == em1.f21847o) {
                    if (j < k0()) {
                        xg2Var.m25422c();
                    }
                    xg2 xg2Var2 = (xg2) e0().get(this);
                    while (true) {
                        if (s0()) {
                            E0(zb2VarM18561b);
                            break;
                        }
                        long andIncrement = f0().getAndIncrement(this);
                        int i2 = em1.f21834b;
                        long j2 = andIncrement / i2;
                        int i3 = (int) (andIncrement % i2);
                        if (xg2Var2.f28439c != j2) {
                            xg2 xg2VarM23467V = m23467V(j2, xg2Var2);
                            if (xg2VarM23467V != null) {
                                xg2Var2 = xg2VarM23467V;
                            }
                        }
                        objF1 = f1(xg2Var2, i3, andIncrement, zb2VarM18561b);
                        if (objF1 == em1.f21845m) {
                            zb2 zb2Var = zb2VarM18561b instanceof x3j ? zb2VarM18561b : null;
                            if (zb2Var != null) {
                                M0(zb2Var, xg2Var2, i3);
                            }
                        } else if (objF1 == em1.f21847o) {
                            if (andIncrement < k0()) {
                                xg2Var2.m25422c();
                            }
                        } else {
                            if (objF1 == em1.f21846n) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            xg2Var2.m25422c();
                            xk7 xk7Var = this.f20212b;
                            ql7Var = (ql7) (xk7Var != null ? m23455I(xk7Var) : null);
                        }
                    }
                } else {
                    xg2Var.m25422c();
                    xk7 xk7Var2 = this.f20212b;
                    ql7Var = (ql7) (xk7Var2 != null ? m23455I(xk7Var2) : null);
                }
                zb2VarM18561b.mo48684A(objF1, ql7Var);
            }
            Object objM59140v = zb2VarM18561b.m59140v();
            if (objM59140v == uq8.m51918f()) {
                n75.m40201c(n64Var);
            }
            return objM59140v;
        } catch (Throwable th) {
            zb2VarM18561b.m59124O();
            throw th;
        }
    }

    /* renamed from: S */
    public final void m23464S(long j) {
        f3i f3iVarM36949c;
        xg2 xg2Var = (xg2) f20207q.get(this);
        while (true) {
            long j2 = f20203e.get(this);
            if (j < Math.max(this.f20211a + j2, m23469Y())) {
                return;
            }
            if (f20203e.compareAndSet(this, j2, j2 + 1)) {
                int i = em1.f21834b;
                long j3 = j2 / i;
                int i2 = (int) (j2 % i);
                if (xg2Var.f28439c != j3) {
                    xg2 xg2VarM23467V = m23467V(j3, xg2Var);
                    if (xg2VarM23467V == null) {
                        continue;
                    } else {
                        xg2Var = xg2VarM23467V;
                    }
                }
                Object objF1 = f1(xg2Var, i2, j2, null);
                if (objF1 != em1.f21847o) {
                    xg2Var.m25422c();
                    xk7 xk7Var = this.f20212b;
                    if (xk7Var != null && (f3iVarM36949c = lcc.m36949c(xk7Var, objF1, null, 2, null)) != null) {
                        throw f3iVarM36949c;
                    }
                } else if (j2 < k0()) {
                    xg2Var.m25422c();
                }
            }
        }
    }

    public final void S0(xbf xbfVar, Object obj) {
        xg2 xg2Var = (xg2) e0().get(this);
        while (!s0()) {
            long andIncrement = f0().getAndIncrement(this);
            int i = em1.f21834b;
            long j = andIncrement / i;
            int i2 = (int) (andIncrement % i);
            if (xg2Var.f28439c != j) {
                xg2 xg2VarM23467V = m23467V(j, xg2Var);
                if (xg2VarM23467V == null) {
                    continue;
                } else {
                    xg2Var = xg2VarM23467V;
                }
            }
            Object objF1 = f1(xg2Var, i2, andIncrement, xbfVar);
            if (objF1 == em1.f21845m) {
                x3j x3jVar = xbfVar instanceof x3j ? (x3j) xbfVar : null;
                if (x3jVar != null) {
                    M0(x3jVar, xg2Var, i2);
                    return;
                }
                return;
            }
            if (objF1 != em1.f21847o) {
                if (objF1 == em1.f21846n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                xg2Var.m25422c();
                xbfVar.mo54178b(objF1);
                return;
            }
            if (andIncrement < k0()) {
                xg2Var.m25422c();
            }
        }
        F0(xbfVar);
    }

    /* renamed from: T */
    public final void m23465T() {
        if (w0()) {
            return;
        }
        xg2 xg2Var = (xg2) f20208s.get(this);
        while (true) {
            long andIncrement = f20204f.getAndIncrement(this);
            int i = em1.f21834b;
            long j = andIncrement / i;
            if (k0() <= andIncrement) {
                if (xg2Var.f28439c < j && xg2Var.m25425f() != null) {
                    B0(j, xg2Var);
                }
                o0(this, 0L, 1, null);
                return;
            }
            if (xg2Var.f28439c != j) {
                xg2 xg2VarM23466U = m23466U(j, xg2Var, andIncrement);
                if (xg2VarM23466U == null) {
                    continue;
                } else {
                    xg2Var = xg2VarM23466U;
                }
            }
            if (d1(xg2Var, (int) (andIncrement % i), andIncrement)) {
                o0(this, 0L, 1, null);
                return;
            }
            o0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (p001o.xg2) r12.m25427h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(xg2 xg2Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        xk7 xk7Var = this.f20212b;
        f3i f3iVarM36948b = null;
        Object objM17202b = aj8.m17202b(null, 1, null);
        loop0: do {
            int i = em1.f21834b - 1;
            while (true) {
                if (-1 >= i) {
                    break;
                }
                long j = (xg2Var.f28439c * em1.f21834b) + i;
                while (true) {
                    Object objM56233B = xg2Var.m56233B(i);
                    if (objM56233B == em1.f21841i) {
                        break loop0;
                    }
                    if (objM56233B != em1.f21836d) {
                        if (objM56233B != em1.f21837e && objM56233B != null) {
                            if (!(objM56233B instanceof x3j) && !(objM56233B instanceof y3j)) {
                                if (objM56233B != em1.f21839g && objM56233B != em1.f21838f) {
                                    if (objM56233B != em1.f21839g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j < g0()) {
                                    break loop0;
                                }
                                x3j x3jVar = objM56233B instanceof y3j ? ((y3j) objM56233B).f54825a : (x3j) objM56233B;
                                if (xg2Var.m56239v(i, objM56233B, em1.m25280z())) {
                                    if (xk7Var != null) {
                                        f3iVarM36948b = lcc.m36948b(xk7Var, xg2Var.m56232A(i), f3iVarM36948b);
                                    }
                                    objM17202b = aj8.m17203c(objM17202b, x3jVar);
                                    xg2Var.m56240w(i);
                                    xg2Var.m31890t();
                                }
                            }
                        } else {
                            if (xg2Var.m56239v(i, objM56233B, em1.m25280z())) {
                                xg2Var.m31890t();
                                break;
                            }
                        }
                    } else {
                        if (j < g0()) {
                            break loop0;
                        }
                        if (xg2Var.m56239v(i, objM56233B, em1.m25280z())) {
                            if (xk7Var != null) {
                                f3iVarM36948b = lcc.m36948b(xk7Var, xg2Var.m56232A(i), f3iVarM36948b);
                            }
                            xg2Var.m56240w(i);
                            xg2Var.m31890t();
                        }
                    }
                }
                i--;
            }
        } while (xg2Var != null);
        if (objM17202b != null) {
            if (objM17202b instanceof ArrayList) {
                sq8.m48647f(objM17202b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objM17202b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    V0((x3j) arrayList.get(size));
                }
            } else {
                V0((x3j) objM17202b);
            }
        }
        if (f3iVarM36948b != null) {
            throw f3iVarM36948b;
        }
    }

    /* renamed from: U */
    public final xg2 m23466U(long j, xg2 xg2Var, long j2) {
        Object objM23678c;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20208s;
        nl7 nl7Var = (nl7) em1.m25279y();
        do {
            objM23678c = dq3.m23678c(xg2Var, j, nl7Var);
            if (kbf.m35362c(objM23678c)) {
                break;
            }
            ibf ibfVarM35361b = kbf.m35361b(objM23678c);
            while (true) {
                ibf ibfVar = (ibf) atomicReferenceFieldUpdater.get(this);
                if (ibfVar.f28439c >= ibfVarM35361b.f28439c) {
                    break;
                }
                if (!ibfVarM35361b.m31891u()) {
                    z = false;
                    break;
                }
                if (j9.m33417a(atomicReferenceFieldUpdater, this, ibfVar, ibfVarM35361b)) {
                    if (ibfVar.m31889p()) {
                        ibfVar.m25431n();
                    }
                } else if (ibfVarM35361b.m31889p()) {
                    ibfVarM35361b.m25431n();
                }
            }
            z = true;
        } while (!z);
        if (kbf.m35362c(objM23678c)) {
            m23463R();
            B0(j, xg2Var);
            o0(this, 0L, 1, null);
            return null;
        }
        xg2 xg2Var2 = (xg2) kbf.m35361b(objM23678c);
        if (xg2Var2.f28439c <= j) {
            return xg2Var2;
        }
        long j3 = xg2Var2.f28439c;
        int i = em1.f21834b;
        if (f20204f.compareAndSet(this, j2 + 1, j3 * i)) {
            n0((xg2Var2.f28439c * i) - j2);
            return null;
        }
        o0(this, 0L, 1, null);
        return null;
    }

    public final void U0(x3j x3jVar) {
        W0(x3jVar, true);
    }

    /* renamed from: V */
    public final xg2 m23467V(long j, xg2 xg2Var) {
        Object objM23678c;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20207q;
        nl7 nl7Var = (nl7) em1.m25279y();
        do {
            objM23678c = dq3.m23678c(xg2Var, j, nl7Var);
            if (!kbf.m35362c(objM23678c)) {
                ibf ibfVarM35361b = kbf.m35361b(objM23678c);
                while (true) {
                    ibf ibfVar = (ibf) atomicReferenceFieldUpdater.get(this);
                    z = true;
                    if (ibfVar.f28439c >= ibfVarM35361b.f28439c) {
                        break;
                    }
                    if (!ibfVarM35361b.m31891u()) {
                        z = false;
                        break;
                    }
                    if (j9.m33417a(atomicReferenceFieldUpdater, this, ibfVar, ibfVarM35361b)) {
                        if (ibfVar.m31889p()) {
                            ibfVar.m25431n();
                        }
                    } else if (ibfVarM35361b.m31889p()) {
                        ibfVarM35361b.m25431n();
                    }
                }
            } else {
                break;
            }
        } while (!z);
        if (kbf.m35362c(objM23678c)) {
            m23463R();
            if (xg2Var.f28439c * em1.f21834b >= k0()) {
                return null;
            }
            xg2Var.m25422c();
            return null;
        }
        xg2 xg2Var2 = (xg2) kbf.m35361b(objM23678c);
        if (!w0() && j <= m23469Y() / em1.f21834b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20208s;
            while (true) {
                ibf ibfVar2 = (ibf) atomicReferenceFieldUpdater2.get(this);
                if (ibfVar2.f28439c >= xg2Var2.f28439c || !xg2Var2.m31891u()) {
                    break;
                }
                if (j9.m33417a(atomicReferenceFieldUpdater2, this, ibfVar2, xg2Var2)) {
                    if (ibfVar2.m31889p()) {
                        ibfVar2.m25431n();
                    }
                } else if (xg2Var2.m31889p()) {
                    xg2Var2.m25431n();
                }
            }
        }
        long j2 = xg2Var2.f28439c;
        if (j2 <= j) {
            return xg2Var2;
        }
        int i = em1.f21834b;
        j1(j2 * i);
        if (xg2Var2.f28439c * i >= k0()) {
            return null;
        }
        xg2Var2.m25422c();
        return null;
    }

    public final void V0(x3j x3jVar) {
        W0(x3jVar, false);
    }

    /* renamed from: W */
    public final xg2 m23468W(long j, xg2 xg2Var) {
        Object objM23678c;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20206h;
        nl7 nl7Var = (nl7) em1.m25279y();
        do {
            objM23678c = dq3.m23678c(xg2Var, j, nl7Var);
            if (!kbf.m35362c(objM23678c)) {
                ibf ibfVarM35361b = kbf.m35361b(objM23678c);
                while (true) {
                    ibf ibfVar = (ibf) atomicReferenceFieldUpdater.get(this);
                    z = true;
                    if (ibfVar.f28439c >= ibfVarM35361b.f28439c) {
                        break;
                    }
                    if (!ibfVarM35361b.m31891u()) {
                        z = false;
                        break;
                    }
                    if (j9.m33417a(atomicReferenceFieldUpdater, this, ibfVar, ibfVarM35361b)) {
                        if (ibfVar.m31889p()) {
                            ibfVar.m25431n();
                        }
                    } else if (ibfVarM35361b.m31889p()) {
                        ibfVarM35361b.m25431n();
                    }
                }
            } else {
                break;
            }
        } while (!z);
        if (kbf.m35362c(objM23678c)) {
            m23463R();
            if (xg2Var.f28439c * em1.f21834b >= g0()) {
                return null;
            }
            xg2Var.m25422c();
            return null;
        }
        xg2 xg2Var2 = (xg2) kbf.m35361b(objM23678c);
        long j2 = xg2Var2.f28439c;
        if (j2 <= j) {
            return xg2Var2;
        }
        int i = em1.f21834b;
        k1(j2 * i);
        if (xg2Var2.f28439c * i >= g0()) {
            return null;
        }
        xg2Var2.m25422c();
        return null;
    }

    public final void W0(x3j x3jVar, boolean z) {
        if (x3jVar instanceof xb2) {
            n64 n64Var = (n64) x3jVar;
            vre.C17665a c17665a = vre.f50797b;
            n64Var.resumeWith(vre.m53351b(wre.m54933a(z ? d0() : h0())));
        } else if (x3jVar instanceof C12985a) {
            ((C12985a) x3jVar).m23488j();
        } else {
            if (x3jVar instanceof xbf) {
                ((xbf) x3jVar).mo54179d(this, em1.m25280z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + x3jVar).toString());
        }
    }

    /* renamed from: Y */
    public final long m23469Y() {
        return f20204f.get(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Y0(xg2 xg2Var, int i, Object obj, long j, n64 n64Var) {
        Object objM53351b;
        Object objM59140v;
        xg2 xg2Var2;
        zb2 zb2VarM18561b = bc2.m18561b(tq8.m50336c(n64Var));
        try {
            int iH1 = h1(xg2Var, i, obj, j, zb2VarM18561b, false);
            if (iH1 == 0) {
                xg2Var.m25422c();
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(y3i.f54824a);
            } else {
                if (iH1 != 1) {
                    if (iH1 != 2) {
                        if (iH1 != 4) {
                            if (iH1 != 5) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            xg2Var.m25422c();
                            xg2 xg2Var3 = (xg2) i0().get(this);
                            while (true) {
                                long andIncrement = j0().getAndIncrement(this);
                                long j2 = andIncrement & 1152921504606846975L;
                                boolean zU0 = u0(andIncrement);
                                int i2 = em1.f21834b;
                                long j3 = j2 / i2;
                                int i3 = (int) (j2 % i2);
                                if (xg2Var3.f28439c != j3) {
                                    xg2 xg2VarM23468W = m23468W(j3, xg2Var3);
                                    if (xg2VarM23468W != null) {
                                        xg2Var2 = xg2VarM23468W;
                                    } else if (zU0) {
                                        break;
                                    }
                                } else {
                                    xg2Var2 = xg2Var3;
                                }
                                xg2 xg2Var4 = xg2Var2;
                                int iH12 = h1(xg2Var2, i3, obj, j2, zb2VarM18561b, zU0);
                                if (iH12 == 0) {
                                    xg2Var4.m25422c();
                                    vre.C17665a c17665a2 = vre.f50797b;
                                    objM53351b = vre.m53351b(y3i.f54824a);
                                    break;
                                }
                                if (iH12 == 1) {
                                    vre.C17665a c17665a3 = vre.f50797b;
                                    objM53351b = vre.m53351b(y3i.f54824a);
                                    break;
                                }
                                if (iH12 != 2) {
                                    if (iH12 == 3) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    if (iH12 != 4) {
                                        if (iH12 == 5) {
                                            xg2Var4.m25422c();
                                        }
                                        xg2Var3 = xg2Var4;
                                    } else if (j2 < g0()) {
                                        xg2Var4.m25422c();
                                    }
                                } else if (zU0) {
                                    xg2Var4.m31890t();
                                } else {
                                    zb2 zb2Var = zb2VarM18561b instanceof x3j ? zb2VarM18561b : null;
                                    if (zb2Var != null) {
                                        N0(zb2Var, xg2Var4, i3);
                                    }
                                }
                            }
                        } else if (j < g0()) {
                            xg2Var.m25422c();
                        }
                        H0(obj, zb2VarM18561b);
                    } else {
                        N0(zb2VarM18561b, xg2Var, i);
                    }
                    objM59140v = zb2VarM18561b.m59140v();
                    if (objM59140v == uq8.m51918f()) {
                        n75.m40201c(n64Var);
                    }
                    return objM59140v != uq8.m51918f() ? objM59140v : y3i.f54824a;
                }
                vre.C17665a c17665a4 = vre.f50797b;
                objM53351b = vre.m53351b(y3i.f54824a);
            }
            zb2VarM18561b.resumeWith(objM53351b);
            objM59140v = zb2VarM18561b.m59140v();
            if (objM59140v == uq8.m51918f()) {
            }
            if (objM59140v != uq8.m51918f()) {
            }
        } catch (Throwable th) {
            zb2VarM18561b.m59124O();
            throw th;
        }
    }

    public final boolean Z0(long j) {
        if (u0(j)) {
            return false;
        }
        return !m23456K(j & 1152921504606846975L);
    }

    public final Throwable a0() {
        return (Throwable) f20209x.get(this);
    }

    public final boolean a1(Object obj, Object obj2) {
        if (obj instanceof xbf) {
            return ((xbf) obj).mo54179d(this, obj2);
        }
        if (obj instanceof C12985a) {
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((C12985a) obj).m23487i(obj2);
        }
        if (obj instanceof xb2) {
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            xb2 xb2Var = (xb2) obj;
            xk7 xk7Var = this.f20212b;
            return em1.m25253B(xb2Var, obj2, (ql7) (xk7Var != null ? m23455I(xk7Var) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    @Override // p001o.fdf
    /* renamed from: b */
    public void mo23470b(xk7 xk7Var) {
        if (j9.m33417a(f20210y, this, null, xk7Var)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20210y;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != em1.f21849q) {
                if (obj == em1.f21850r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!j9.m33417a(f20210y, this, em1.f21849q, em1.f21850r));
        xk7Var.invoke(a0());
    }

    public final boolean b1(Object obj, xg2 xg2Var, int i) {
        if (obj instanceof xb2) {
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return em1.m25254C((xb2) obj, y3i.f54824a, null, 2, null);
        }
        if (!(obj instanceof xbf)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        cyh cyhVarM54189v = ((wbf) obj).m54189v(this, y3i.f54824a);
        if (cyhVarM54189v == cyh.REREGISTER) {
            xg2Var.m56240w(i);
        }
        return cyhVarM54189v == cyh.SUCCESSFUL;
    }

    public final Object c1(Object obj) {
        xg2 xg2Var;
        Object obj2 = em1.f21836d;
        xg2 xg2Var2 = (xg2) i0().get(this);
        while (true) {
            long andIncrement = j0().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zU0 = u0(andIncrement);
            int i = em1.f21834b;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (xg2Var2.f28439c != j2) {
                xg2 xg2VarM23468W = m23468W(j2, xg2Var2);
                if (xg2VarM23468W != null) {
                    xg2Var = xg2VarM23468W;
                } else if (zU0) {
                    return vg2.f50294b.m52746a(h0());
                }
            } else {
                xg2Var = xg2Var2;
            }
            int iH1 = h1(xg2Var, i2, obj, j, obj2, zU0);
            if (iH1 == 0) {
                xg2Var.m25422c();
                return vg2.f50294b.m52748c(y3i.f54824a);
            }
            if (iH1 == 1) {
                return vg2.f50294b.m52748c(y3i.f54824a);
            }
            if (iH1 == 2) {
                if (zU0) {
                    xg2Var.m31890t();
                    return vg2.f50294b.m52746a(h0());
                }
                x3j x3jVar = obj2 instanceof x3j ? (x3j) obj2 : null;
                if (x3jVar != null) {
                    N0(x3jVar, xg2Var, i2);
                }
                m23464S((xg2Var.f28439c * i) + i2);
                return vg2.f50294b.m52748c(y3i.f54824a);
            }
            if (iH1 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iH1 == 4) {
                if (j < g0()) {
                    xg2Var.m25422c();
                }
                return vg2.f50294b.m52746a(h0());
            }
            if (iH1 == 5) {
                xg2Var.m25422c();
            }
            xg2Var2 = xg2Var;
        }
    }

    public final Throwable d0() {
        Throwable thA0 = a0();
        return thA0 == null ? new yb3("Channel was closed") : thA0;
    }

    public final boolean d1(xg2 xg2Var, int i, long j) {
        Object objM56233B = xg2Var.m56233B(i);
        if (!(objM56233B instanceof x3j) || j < f20203e.get(this) || !xg2Var.m56239v(i, objM56233B, em1.f21839g)) {
            return e1(xg2Var, i, j);
        }
        if (b1(objM56233B, xg2Var, i)) {
            xg2Var.m56237F(i, em1.f21836d);
            return true;
        }
        xg2Var.m56237F(i, em1.f21842j);
        xg2Var.m56234C(i, false);
        return false;
    }

    public final boolean e1(xg2 xg2Var, int i, long j) {
        while (true) {
            Object objM56233B = xg2Var.m56233B(i);
            if (objM56233B instanceof x3j) {
                if (j < f20203e.get(this)) {
                    if (xg2Var.m56239v(i, objM56233B, new y3j((x3j) objM56233B))) {
                        return true;
                    }
                } else if (xg2Var.m56239v(i, objM56233B, em1.f21839g)) {
                    if (b1(objM56233B, xg2Var, i)) {
                        xg2Var.m56237F(i, em1.f21836d);
                        return true;
                    }
                    xg2Var.m56237F(i, em1.f21842j);
                    xg2Var.m56234C(i, false);
                    return false;
                }
            } else {
                if (objM56233B == em1.f21842j) {
                    return false;
                }
                if (objM56233B == null) {
                    if (xg2Var.m56239v(i, objM56233B, em1.f21837e)) {
                        return true;
                    }
                } else {
                    if (objM56233B == em1.f21836d || objM56233B == em1.f21840h || objM56233B == em1.f21841i || objM56233B == em1.f21843k || objM56233B == em1.m25280z()) {
                        return true;
                    }
                    if (objM56233B != em1.f21838f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objM56233B).toString());
                    }
                }
            }
        }
    }

    @Override // p001o.eee
    /* renamed from: f */
    public final void mo23471f(CancellationException cancellationException) {
        m23457L(cancellationException);
    }

    public final Object f1(xg2 xg2Var, int i, long j, Object obj) {
        Object objM56233B = xg2Var.m56233B(i);
        if (objM56233B == null) {
            if (j >= (f20202d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return em1.f21846n;
                }
                if (xg2Var.m56239v(i, objM56233B, obj)) {
                    m23465T();
                    return em1.f21845m;
                }
            }
        } else if (objM56233B == em1.f21836d && xg2Var.m56239v(i, objM56233B, em1.f21841i)) {
            m23465T();
            return xg2Var.m56235D(i);
        }
        return g1(xg2Var, i, j, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        return p001o.vg2.f50294b.m52748c(p001o.y3i.f54824a);
     */
    @Override // p001o.fdf
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo23472g(Object obj) {
        xg2 xg2Var;
        if (Z0(f20202d.get(this))) {
            return vg2.f50294b.m52747b();
        }
        Object obj2 = em1.f21842j;
        xg2 xg2Var2 = (xg2) i0().get(this);
        while (true) {
            long andIncrement = j0().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zU0 = u0(andIncrement);
            int i = em1.f21834b;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (xg2Var2.f28439c != j2) {
                xg2 xg2VarM23468W = m23468W(j2, xg2Var2);
                if (xg2VarM23468W != null) {
                    xg2Var = xg2VarM23468W;
                } else if (zU0) {
                    break;
                }
            } else {
                xg2Var = xg2Var2;
            }
            int iH1 = h1(xg2Var, i2, obj, j, obj2, zU0);
            if (iH1 == 0) {
                xg2Var.m25422c();
                break;
            }
            if (iH1 == 1) {
                break;
            }
            if (iH1 != 2) {
                if (iH1 == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (iH1 != 4) {
                    if (iH1 == 5) {
                        xg2Var.m25422c();
                    }
                    xg2Var2 = xg2Var;
                } else if (j < g0()) {
                    xg2Var.m25422c();
                }
            } else {
                if (!zU0) {
                    x3j x3jVar = obj2 instanceof x3j ? (x3j) obj2 : null;
                    if (x3jVar != null) {
                        N0(x3jVar, xg2Var, i2);
                    }
                    xg2Var.m31890t();
                    return vg2.f50294b.m52747b();
                }
                xg2Var.m31890t();
            }
        }
        return vg2.f50294b.m52746a(h0());
    }

    public final long g0() {
        return f20203e.get(this);
    }

    public final Object g1(xg2 xg2Var, int i, long j, Object obj) {
        while (true) {
            Object objM56233B = xg2Var.m56233B(i);
            if (objM56233B == null || objM56233B == em1.f21837e) {
                if (j < (f20202d.get(this) & 1152921504606846975L)) {
                    if (xg2Var.m56239v(i, objM56233B, em1.f21840h)) {
                        m23465T();
                        return em1.f21847o;
                    }
                } else {
                    if (obj == null) {
                        return em1.f21846n;
                    }
                    if (xg2Var.m56239v(i, objM56233B, obj)) {
                        m23465T();
                        return em1.f21845m;
                    }
                }
            } else {
                if (objM56233B != em1.f21836d) {
                    if (objM56233B != em1.f21842j && objM56233B != em1.f21840h) {
                        if (objM56233B == em1.m25280z()) {
                            m23465T();
                            return em1.f21847o;
                        }
                        if (objM56233B != em1.f21839g && xg2Var.m56239v(i, objM56233B, em1.f21838f)) {
                            boolean z = objM56233B instanceof y3j;
                            if (z) {
                                objM56233B = ((y3j) objM56233B).f54825a;
                            }
                            if (b1(objM56233B, xg2Var, i)) {
                                xg2Var.m56237F(i, em1.f21841i);
                                m23465T();
                                return xg2Var.m56235D(i);
                            }
                            xg2Var.m56237F(i, em1.f21842j);
                            xg2Var.m56234C(i, false);
                            if (z) {
                                m23465T();
                            }
                            return em1.f21847o;
                        }
                    }
                    return em1.f21847o;
                }
                if (xg2Var.m56239v(i, objM56233B, em1.f21841i)) {
                    m23465T();
                    return xg2Var.m56235D(i);
                }
            }
        }
    }

    public final Throwable h0() {
        Throwable thA0 = a0();
        return thA0 == null ? new zb3("Channel was closed") : thA0;
    }

    public final int h1(xg2 xg2Var, int i, Object obj, long j, Object obj2, boolean z) {
        xg2Var.m56238G(i, obj);
        if (z) {
            return i1(xg2Var, i, obj, j, obj2, z);
        }
        Object objM56233B = xg2Var.m56233B(i);
        if (objM56233B == null) {
            if (m23456K(j)) {
                if (xg2Var.m56239v(i, null, em1.f21836d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (xg2Var.m56239v(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM56233B instanceof x3j) {
            xg2Var.m56240w(i);
            if (a1(objM56233B, obj)) {
                xg2Var.m56237F(i, em1.f21841i);
                I0();
                return 0;
            }
            if (xg2Var.m56241x(i, em1.f21843k) != em1.f21843k) {
                xg2Var.m56234C(i, true);
            }
            return 5;
        }
        return i1(xg2Var, i, obj, j, obj2, z);
    }

    @Override // p001o.eee
    /* renamed from: i */
    public pbf mo23473i() {
        C12987c c12987c = C12987c.f20217a;
        sq8.m48647f(c12987c, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        ql7 ql7Var = (ql7) azh.m18052e(c12987c, 3);
        C12988d c12988d = C12988d.f20218a;
        sq8.m48647f(c12988d, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new qbf(this, ql7Var, (ql7) azh.m18052e(c12988d, 3), this.f20213c);
    }

    public final int i1(xg2 xg2Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM56233B = xg2Var.m56233B(i);
            if (objM56233B == null) {
                if (!m23456K(j) || z) {
                    if (z) {
                        if (xg2Var.m56239v(i, null, em1.f21842j)) {
                            xg2Var.m56234C(i, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (xg2Var.m56239v(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (xg2Var.m56239v(i, null, em1.f21836d)) {
                    return 1;
                }
            } else {
                if (objM56233B != em1.f21837e) {
                    if (objM56233B == em1.f21843k) {
                        xg2Var.m56240w(i);
                        return 5;
                    }
                    if (objM56233B == em1.f21840h) {
                        xg2Var.m56240w(i);
                        return 5;
                    }
                    if (objM56233B == em1.m25280z()) {
                        xg2Var.m56240w(i);
                        m23463R();
                        return 4;
                    }
                    xg2Var.m56240w(i);
                    if (objM56233B instanceof y3j) {
                        objM56233B = ((y3j) objM56233B).f54825a;
                    }
                    if (a1(objM56233B, obj)) {
                        xg2Var.m56237F(i, em1.f21841i);
                        I0();
                        return 0;
                    }
                    if (xg2Var.m56241x(i, em1.f21843k) != em1.f21843k) {
                        xg2Var.m56234C(i, true);
                    }
                    return 5;
                }
                if (xg2Var.m56239v(i, objM56233B, em1.f21836d)) {
                    return 1;
                }
            }
        }
    }

    @Override // p001o.eee
    public sg2 iterator() {
        return new C12985a();
    }

    @Override // p001o.eee
    /* renamed from: j */
    public pbf mo23474j() {
        C12989e c12989e = C12989e.f20219a;
        sq8.m48647f(c12989e, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        ql7 ql7Var = (ql7) azh.m18052e(c12989e, 3);
        C12990f c12990f = C12990f.f20220a;
        sq8.m48647f(c12990f, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new qbf(this, ql7Var, (ql7) azh.m18052e(c12990f, 3), this.f20213c);
    }

    public final void j1(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20203e;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
        } while (!f20203e.compareAndSet(this, j2, j));
    }

    public final long k0() {
        return f20202d.get(this) & 1152921504606846975L;
    }

    public final void k1(long j) {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20202d;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j) {
                return;
            }
        } while (!f20202d.compareAndSet(this, j2, em1.m25277w(j3, (int) (j2 >> 60))));
    }

    @Override // p001o.fdf
    /* renamed from: l */
    public Object mo23475l(Object obj, n64 n64Var) {
        return X0(this, obj, n64Var);
    }

    public final void l1(long j) {
        long j2;
        long j3;
        if (w0()) {
            return;
        }
        while (m23469Y() <= j) {
        }
        int i = em1.f21835c;
        for (int i2 = 0; i2 < i; i2++) {
            long jM23469Y = m23469Y();
            if (jM23469Y == (f20205g.get(this) & 4611686018427387903L) && jM23469Y == m23469Y()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20205g;
        do {
            j2 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, em1.m25276v(j2 & 4611686018427387903L, true)));
        while (true) {
            long jM23469Y2 = m23469Y();
            long j4 = f20205g.get(this);
            long j5 = j4 & 4611686018427387903L;
            boolean z = (Javac.SEALED & j4) != 0;
            if (jM23469Y2 == j5 && jM23469Y2 == m23469Y()) {
                break;
            } else if (!z) {
                f20205g.compareAndSet(this, j4, em1.m25276v(j5, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20205g;
        do {
            j3 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, em1.m25276v(j3 & 4611686018427387903L, false)));
    }

    @Override // p001o.eee
    /* renamed from: m */
    public Object mo23476m(n64 n64Var) {
        return Q0(this, n64Var);
    }

    public final boolean m0() {
        while (true) {
            xg2 xg2VarM23467V = (xg2) f20207q.get(this);
            long jG0 = g0();
            if (k0() <= jG0) {
                return false;
            }
            int i = em1.f21834b;
            long j = jG0 / i;
            if (xg2VarM23467V.f28439c == j || (xg2VarM23467V = m23467V(j, xg2VarM23467V)) != null) {
                xg2VarM23467V.m25422c();
                if (q0(xg2VarM23467V, (int) (jG0 % i), jG0)) {
                    return true;
                }
                f20203e.compareAndSet(this, jG0, 1 + jG0);
            } else if (((xg2) f20207q.get(this)).f28439c < j) {
                return false;
            }
        }
    }

    @Override // p001o.fdf
    /* renamed from: n */
    public boolean mo23477n() {
        return u0(f20202d.get(this));
    }

    public final void n0(long j) {
        if ((f20205g.addAndGet(this, j) & Javac.SEALED) != 0) {
            do {
            } while ((f20205g.get(this) & Javac.SEALED) != 0);
        }
    }

    public final void p0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20210y;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!j9.m33417a(atomicReferenceFieldUpdater, this, obj, obj == null ? em1.f21849q : em1.f21850r));
        if (obj == null) {
            return;
        }
        ((xk7) obj).invoke(a0());
    }

    @Override // p001o.fdf
    /* renamed from: q */
    public boolean mo23478q(Throwable th) {
        return m23460O(th, false);
    }

    public final boolean q0(xg2 xg2Var, int i, long j) {
        Object objM56233B;
        do {
            objM56233B = xg2Var.m56233B(i);
            if (objM56233B != null && objM56233B != em1.f21837e) {
                if (objM56233B == em1.f21836d) {
                    return true;
                }
                if (objM56233B == em1.f21842j || objM56233B == em1.m25280z() || objM56233B == em1.f21841i || objM56233B == em1.f21840h) {
                    return false;
                }
                if (objM56233B == em1.f21839g) {
                    return true;
                }
                return objM56233B != em1.f21838f && j == g0();
            }
        } while (!xg2Var.m56239v(i, objM56233B, em1.f21840h));
        m23465T();
        return false;
    }

    public final boolean r0(long j, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            m23462Q(j & 1152921504606846975L);
            if (z && m0()) {
                return false;
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException(("unexpected close status: " + i).toString());
            }
            m23461P(j & 1152921504606846975L);
        }
        return true;
    }

    public boolean s0() {
        return t0(f20202d.get(this));
    }

    public final boolean t0(long j) {
        return r0(j, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ca, code lost:
    
        r3 = (p001o.xg2) r3.m25425f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d1, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (f20202d.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f20211a + ',');
        sb.append("data=[");
        int i2 = 0;
        List listM21249n = ch3.m21249n(f20207q.get(this), f20206h.get(this), f20208s.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM21249n) {
            if (((xg2) obj) != em1.f21833a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((xg2) next).f28439c;
            do {
                Object next2 = it.next();
                long j2 = ((xg2) next2).f28439c;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        xg2 xg2Var = (xg2) next;
        long jG0 = g0();
        long jK0 = k0();
        loop2: while (true) {
            int i3 = em1.f21834b;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j3 = (xg2Var.f28439c * em1.f21834b) + i4;
                if (j3 >= jK0 && j3 >= jG0) {
                    break loop2;
                }
                Object objM56233B = xg2Var.m56233B(i4);
                Object objM56232A = xg2Var.m56232A(i4);
                if (objM56233B instanceof xb2) {
                    string = (j3 >= jG0 || j3 < jK0) ? (j3 >= jK0 || j3 < jG0) ? "cont" : "send" : "receive";
                } else if (objM56233B instanceof xbf) {
                    string = (j3 >= jG0 || j3 < jK0) ? (j3 >= jK0 || j3 < jG0) ? "select" : "onSend" : "onReceive";
                } else if (objM56233B instanceof y3j) {
                    string = "EB(" + objM56233B + ')';
                } else if (sq8.m48644c(objM56233B, em1.f21838f) || sq8.m48644c(objM56233B, em1.f21839g)) {
                    string = "resuming_sender";
                } else if (objM56233B == null || sq8.m48644c(objM56233B, em1.f21837e) || sq8.m48644c(objM56233B, em1.f21841i) || sq8.m48644c(objM56233B, em1.f21840h) || sq8.m48644c(objM56233B, em1.f21843k) || sq8.m48644c(objM56233B, em1.f21842j) || sq8.m48644c(objM56233B, em1.m25280z())) {
                    i4++;
                } else {
                    string = objM56233B.toString();
                }
                if (objM56232A != null) {
                    sb.append('(' + string + ',' + objM56232A + "),");
                } else {
                    sb.append(string + ',');
                }
                i4++;
            }
            i2 = 0;
        }
        if (h9g.i1(sb) == ',') {
            sq8.m48648g(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u0(long j) {
        return r0(j, false);
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0() {
        long jM23469Y = m23469Y();
        return jM23469Y == 0 || jM23469Y == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (p001o.xg2) r8.m25427h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long x0(xg2 xg2Var) {
        do {
            int i = em1.f21834b;
            while (true) {
                i--;
                if (-1 >= i) {
                    break;
                }
                long j = (xg2Var.f28439c * em1.f21834b) + i;
                if (j < g0()) {
                    return -1L;
                }
                while (true) {
                    Object objM56233B = xg2Var.m56233B(i);
                    if (objM56233B == null || objM56233B == em1.f21837e) {
                        if (xg2Var.m56239v(i, objM56233B, em1.m25280z())) {
                            xg2Var.m31890t();
                            break;
                        }
                    } else if (objM56233B == em1.f21836d) {
                        return j;
                    }
                }
            }
        } while (xg2Var != null);
        return -1L;
    }

    public final void y0() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20202d;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, em1.m25277w(1152921504606846975L & j, 1)));
    }

    public final void z0() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20202d;
        do {
            j = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, em1.m25277w(1152921504606846975L & j, 3)));
    }
}

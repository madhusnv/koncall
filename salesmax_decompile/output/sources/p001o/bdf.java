package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public class bdf {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15979c = AtomicReferenceFieldUpdater.newUpdater(bdf.class, Object.class, "head$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f15980d = AtomicLongFieldUpdater.newUpdater(bdf.class, "deqIdx$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15981e = AtomicReferenceFieldUpdater.newUpdater(bdf.class, Object.class, "tail$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f15982f = AtomicLongFieldUpdater.newUpdater(bdf.class, "enqIdx$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15983g = AtomicIntegerFieldUpdater.newUpdater(bdf.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a */
    public final int f15984a;

    /* renamed from: b */
    public final ql7 f15985b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* renamed from: o.bdf$a */
    public /* synthetic */ class C12359a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12359a f15986a = new C12359a();

        public C12359a() {
            super(2, ddf.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* renamed from: b */
        public final edf m18684b(long j, edf edfVar) {
            return ddf.m22836j(j, edfVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m18684b(((Number) obj).longValue(), (edf) obj2);
        }
    }

    /* renamed from: o.bdf$b */
    public /* synthetic */ class C12360b extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12360b f15987a = new C12360b();

        public C12360b() {
            super(2, ddf.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* renamed from: b */
        public final edf m18685b(long j, edf edfVar) {
            return ddf.m22836j(j, edfVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m18685b(((Number) obj).longValue(), (edf) obj2);
        }
    }

    public bdf(int i, int i2) {
        this.f15984a = i;
        if (!(i > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (!(i2 >= 0 && i2 <= i)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        edf edfVar = new edf(0L, null, 2);
        this.head$volatile = edfVar;
        this.tail$volatile = edfVar;
        this._availablePermits$volatile = i - i2;
        this.f15985b = new ql7() { // from class: o.adf
            @Override // p001o.ql7
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return bdf.m18673q(this.f14551a, (Throwable) obj, (y3i) obj2, (q74) obj3);
            }
        };
    }

    /* renamed from: q */
    public static final y3i m18673q(bdf bdfVar, Throwable th, y3i y3iVar, q74 q74Var) {
        bdfVar.release();
        return y3i.f54824a;
    }

    /* renamed from: a */
    public final Object m18674a(n64 n64Var) {
        if (m18679j() > 0) {
            return y3i.f54824a;
        }
        Object objM18676g = m18676g(n64Var);
        return objM18676g == uq8.m51918f() ? objM18676g : y3i.f54824a;
    }

    /* renamed from: f */
    public final void m18675f(xb2 xb2Var) {
        while (m18679j() <= 0) {
            sq8.m48647f(xb2Var, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m18677h((x3j) xb2Var)) {
                return;
            }
        }
        xb2Var.mo48684A(y3i.f54824a, this.f15985b);
    }

    /* renamed from: g */
    public final Object m18676g(n64 n64Var) {
        zb2 zb2VarM18561b = bc2.m18561b(tq8.m50336c(n64Var));
        try {
            if (!m18677h(zb2VarM18561b)) {
                m18675f(zb2VarM18561b);
            }
            Object objM59140v = zb2VarM18561b.m59140v();
            if (objM59140v == uq8.m51918f()) {
                n75.m40201c(n64Var);
            }
            return objM59140v == uq8.m51918f() ? objM59140v : y3i.f54824a;
        } catch (Throwable th) {
            zb2VarM18561b.m59124O();
            throw th;
        }
    }

    /* renamed from: h */
    public final boolean m18677h(x3j x3jVar) {
        Object objM23678c;
        boolean z;
        edf edfVar = (edf) f15981e.get(this);
        long andIncrement = f15982f.getAndIncrement(this);
        C12359a c12359a = C12359a.f15986a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15981e;
        long j = andIncrement / ddf.f19624f;
        do {
            objM23678c = dq3.m23678c(edfVar, j, c12359a);
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
        edf edfVar2 = (edf) kbf.m35361b(objM23678c);
        int i = (int) (andIncrement % ddf.f19624f);
        if (wg2.m54356a(edfVar2.m24828v(), i, null, x3jVar)) {
            x3jVar.mo23483c(edfVar2, i);
            return true;
        }
        if (!wg2.m54356a(edfVar2.m24828v(), i, ddf.f19620b, ddf.f19621c)) {
            return false;
        }
        if (x3jVar instanceof xb2) {
            sq8.m48647f(x3jVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((xb2) x3jVar).mo48684A(y3i.f54824a, this.f15985b);
            return true;
        }
        if (x3jVar instanceof xbf) {
            ((xbf) x3jVar).mo54178b(y3i.f54824a);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + x3jVar).toString());
    }

    /* renamed from: i */
    public final void m18678i() {
        int i;
        do {
            i = f15983g.get(this);
            if (i <= this.f15984a) {
                return;
            }
        } while (!f15983g.compareAndSet(this, i, this.f15984a));
    }

    /* renamed from: j */
    public final int m18679j() {
        int andDecrement;
        do {
            andDecrement = f15983g.getAndDecrement(this);
        } while (andDecrement > this.f15984a);
        return andDecrement;
    }

    /* renamed from: k */
    public final int m18680k() {
        return Math.max(f15983g.get(this), 0);
    }

    /* renamed from: r */
    public final boolean m18681r() {
        while (true) {
            int i = f15983g.get(this);
            if (i > this.f15984a) {
                m18678i();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (f15983g.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    public final void release() {
        do {
            int andIncrement = f15983g.getAndIncrement(this);
            if (andIncrement >= this.f15984a) {
                m18678i();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f15984a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m18683t());
    }

    /* renamed from: s */
    public final boolean m18682s(Object obj) {
        if (!(obj instanceof xb2)) {
            if (obj instanceof xbf) {
                return ((xbf) obj).mo54179d(this, y3i.f54824a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        xb2 xb2Var = (xb2) obj;
        Object objMo48693p = xb2Var.mo48693p(y3i.f54824a, null, this.f15985b);
        if (objMo48693p == null) {
            return false;
        }
        xb2Var.mo48686F(objMo48693p);
        return true;
    }

    /* renamed from: t */
    public final boolean m18683t() {
        Object objM23678c;
        boolean z;
        edf edfVar = (edf) f15979c.get(this);
        long andIncrement = f15980d.getAndIncrement(this);
        long j = andIncrement / ddf.f19624f;
        C12360b c12360b = C12360b.f15987a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15979c;
        do {
            objM23678c = dq3.m23678c(edfVar, j, c12360b);
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
        edf edfVar2 = (edf) kbf.m35361b(objM23678c);
        edfVar2.m25422c();
        if (edfVar2.f28439c > j) {
            return false;
        }
        int i = (int) (andIncrement % ddf.f19624f);
        Object andSet = edfVar2.m24828v().getAndSet(i, ddf.f19620b);
        if (andSet != null) {
            if (andSet == ddf.f19623e) {
                return false;
            }
            return m18682s(andSet);
        }
        int i2 = ddf.f19619a;
        for (int i3 = 0; i3 < i2; i3++) {
            if (edfVar2.m24828v().get(i) == ddf.f19621c) {
                return true;
            }
        }
        return !wg2.m54356a(edfVar2.m24828v(), i, ddf.f19620b, ddf.f19622d);
    }
}

package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p001o.mk5;

/* loaded from: classes6.dex */
public abstract class fk6 extends gk6 implements mk5 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23550f = AtomicReferenceFieldUpdater.newUpdater(fk6.class, Object.class, "_queue$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23551g = AtomicReferenceFieldUpdater.newUpdater(fk6.class, Object.class, "_delayed$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23552h = AtomicIntegerFieldUpdater.newUpdater(fk6.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: o.fk6$a */
    public final class C13471a extends AbstractRunnableC13473c {

        /* renamed from: c */
        public final xb2 f23553c;

        public C13471a(long j, xb2 xb2Var) {
            super(j);
            this.f23553c = xb2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23553c.mo48688e(fk6.this, y3i.f54824a);
        }

        @Override // p001o.fk6.AbstractRunnableC13473c
        public String toString() {
            return super.toString() + this.f23553c;
        }
    }

    /* renamed from: o.fk6$b */
    public static final class C13472b extends AbstractRunnableC13473c {

        /* renamed from: c */
        public final Runnable f23555c;

        public C13472b(long j, Runnable runnable) {
            super(j);
            this.f23555c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23555c.run();
        }

        @Override // p001o.fk6.AbstractRunnableC13473c
        public String toString() {
            return super.toString() + this.f23555c;
        }
    }

    /* renamed from: o.fk6$c */
    public static abstract class AbstractRunnableC13473c implements Runnable, Comparable, yu5, blh {
        private volatile Object _heap;

        /* renamed from: a */
        public long f23556a;

        /* renamed from: b */
        public int f23557b = -1;

        public AbstractRunnableC13473c(long j) {
            this.f23556a = j;
        }

        @Override // p001o.blh
        /* renamed from: a */
        public alh mo19336a() {
            Object obj = this._heap;
            if (obj instanceof alh) {
                return (alh) obj;
            }
            return null;
        }

        @Override // p001o.blh
        /* renamed from: d */
        public void mo19337d(alh alhVar) {
            if (!(this._heap != ik6.f28778a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = alhVar;
        }

        @Override // p001o.yu5
        public final void dispose() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == ik6.f28778a) {
                    return;
                }
                C13474d c13474d = obj instanceof C13474d ? (C13474d) obj : null;
                if (c13474d != null) {
                    c13474d.m17395h(this);
                }
                this._heap = ik6.f28778a;
                y3i y3iVar = y3i.f54824a;
            }
        }

        @Override // p001o.blh
        /* renamed from: e */
        public void mo19338e(int i) {
            this.f23557b = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(AbstractRunnableC13473c abstractRunnableC13473c) {
            long j = this.f23556a - abstractRunnableC13473c.f23556a;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        /* renamed from: h */
        public final int m26965h(long j, C13474d c13474d, fk6 fk6Var) {
            synchronized (this) {
                if (this._heap == ik6.f28778a) {
                    return 2;
                }
                synchronized (c13474d) {
                    AbstractRunnableC13473c abstractRunnableC13473c = (AbstractRunnableC13473c) c13474d.m17390b();
                    if (fk6Var.m26961J()) {
                        return 1;
                    }
                    if (abstractRunnableC13473c == null) {
                        c13474d.f23558c = j;
                    } else {
                        long j2 = abstractRunnableC13473c.f23556a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c13474d.f23558c > 0) {
                            c13474d.f23558c = j;
                        }
                    }
                    long j3 = this.f23556a;
                    long j4 = c13474d.f23558c;
                    if (j3 - j4 < 0) {
                        this.f23556a = j4;
                    }
                    c13474d.m17389a(this);
                    return 0;
                }
            }
        }

        /* renamed from: j */
        public final boolean m26966j(long j) {
            return j - this.f23556a >= 0;
        }

        @Override // p001o.blh
        /* renamed from: r */
        public int mo19339r() {
            return this.f23557b;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f23556a + ']';
        }
    }

    /* renamed from: o.fk6$d */
    public static final class C13474d extends alh {

        /* renamed from: c */
        public long f23558c;

        public C13474d(long j) {
            this.f23558c = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final boolean m26961J() {
        return f23552h.get(this) != 0;
    }

    public final yu5 B1(long j, Runnable runnable) {
        long jM32243c = ik6.m32243c(j);
        if (jM32243c >= 4611686018427387903L) {
            return e0c.f20709a;
        }
        v9.m52465a();
        long jNanoTime = System.nanoTime();
        C13472b c13472b = new C13472b(jM32243c + jNanoTime, runnable);
        x1(jNanoTime, c13472b);
        return c13472b;
    }

    @Override // p001o.mk5
    /* renamed from: D */
    public void mo26962D(long j, xb2 xb2Var) {
        long jM32243c = ik6.m32243c(j);
        if (jM32243c < 4611686018427387903L) {
            v9.m52465a();
            long jNanoTime = System.nanoTime();
            C13471a c13471a = new C13471a(jM32243c + jNanoTime, xb2Var);
            x1(jNanoTime, c13471a);
            bc2.m18560a(xb2Var, c13471a);
        }
    }

    public final void D1(boolean z) {
        f23552h.set(this, z ? 1 : 0);
    }

    public final boolean F1(AbstractRunnableC13473c abstractRunnableC13473c) {
        C13474d c13474d = (C13474d) f23551g.get(this);
        return (c13474d != null ? (AbstractRunnableC13473c) c13474d.m17393f() : null) == abstractRunnableC13473c;
    }

    @Override // p001o.ek6
    public long H0() {
        if (I0()) {
            return 0L;
        }
        b1();
        Runnable runnableV0 = V0();
        if (runnableV0 == null) {
            return z0();
        }
        runnableV0.run();
        return 0L;
    }

    @Override // p001o.z74
    /* renamed from: K */
    public final void mo22314K(q74 q74Var, Runnable runnable) {
        W0(runnable);
    }

    public final void S0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23550f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (j9.m33417a(f23550f, this, null, ik6.f28779b)) {
                    return;
                }
            } else if (obj instanceof mia) {
                ((mia) obj).m39122d();
                return;
            } else {
                if (obj == ik6.f28779b) {
                    return;
                }
                mia miaVar = new mia(8, true);
                sq8.m48647f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                miaVar.m39119a((Runnable) obj);
                if (j9.m33417a(f23550f, this, obj, miaVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable V0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23550f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof mia) {
                sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                mia miaVar = (mia) obj;
                Object objM39128m = miaVar.m39128m();
                if (objM39128m != mia.f35514h) {
                    return (Runnable) objM39128m;
                }
                j9.m33417a(f23550f, this, obj, miaVar.m39127l());
            } else {
                if (obj == ik6.f28779b) {
                    return null;
                }
                if (j9.m33417a(f23550f, this, obj, null)) {
                    sq8.m48647f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void W0(Runnable runnable) {
        b1();
        if (d1(runnable)) {
            P0();
        } else {
            wd5.f51804q.W0(runnable);
        }
    }

    public final void b1() {
        blh blhVarM17396i;
        C13474d c13474d = (C13474d) f23551g.get(this);
        if (c13474d == null || c13474d.m17392e()) {
            return;
        }
        v9.m52465a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c13474d) {
                blh blhVarM17390b = c13474d.m17390b();
                if (blhVarM17390b != null) {
                    AbstractRunnableC13473c abstractRunnableC13473c = (AbstractRunnableC13473c) blhVarM17390b;
                    blhVarM17396i = abstractRunnableC13473c.m26966j(jNanoTime) ? d1(abstractRunnableC13473c) : false ? c13474d.m17396i(0) : null;
                }
            }
        } while (((AbstractRunnableC13473c) blhVarM17396i) != null);
    }

    public final boolean d1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23550f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m26961J()) {
                return false;
            }
            if (obj == null) {
                if (j9.m33417a(f23550f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof mia) {
                sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                mia miaVar = (mia) obj;
                int iM39119a = miaVar.m39119a(runnable);
                if (iM39119a == 0) {
                    return true;
                }
                if (iM39119a == 1) {
                    j9.m33417a(f23550f, this, obj, miaVar.m39127l());
                } else if (iM39119a == 2) {
                    return false;
                }
            } else {
                if (obj == ik6.f28779b) {
                    return false;
                }
                mia miaVar2 = new mia(8, true);
                sq8.m48647f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                miaVar2.m39119a((Runnable) obj);
                miaVar2.m39119a(runnable);
                if (j9.m33417a(f23550f, this, obj, miaVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean q1() {
        if (!G0()) {
            return false;
        }
        C13474d c13474d = (C13474d) f23551g.get(this);
        if (c13474d != null && !c13474d.m17392e()) {
            return false;
        }
        Object obj = f23550f.get(this);
        if (obj != null) {
            if (obj instanceof mia) {
                return ((mia) obj).m39125j();
            }
            if (obj != ik6.f28779b) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.ek6
    public void shutdown() {
        pkh.f40203a.m43814c();
        D1(true);
        S0();
        while (H0() <= 0) {
        }
        v1();
    }

    @Override // p001o.mk5
    /* renamed from: t */
    public yu5 mo26963t(long j, Runnable runnable, q74 q74Var) {
        return mk5.C15347a.m39269a(this, j, runnable, q74Var);
    }

    public final void v1() {
        AbstractRunnableC13473c abstractRunnableC13473c;
        v9.m52465a();
        long jNanoTime = System.nanoTime();
        while (true) {
            C13474d c13474d = (C13474d) f23551g.get(this);
            if (c13474d == null || (abstractRunnableC13473c = (AbstractRunnableC13473c) c13474d.m17397j()) == null) {
                return;
            } else {
                O0(jNanoTime, abstractRunnableC13473c);
            }
        }
    }

    public final void w1() {
        f23550f.set(this, null);
        f23551g.set(this, null);
    }

    public final void x1(long j, AbstractRunnableC13473c abstractRunnableC13473c) {
        int iZ1 = z1(j, abstractRunnableC13473c);
        if (iZ1 == 0) {
            if (F1(abstractRunnableC13473c)) {
                P0();
            }
        } else if (iZ1 == 1) {
            O0(j, abstractRunnableC13473c);
        } else if (iZ1 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // p001o.ek6
    public long z0() {
        AbstractRunnableC13473c abstractRunnableC13473c;
        if (super.z0() == 0) {
            return 0L;
        }
        Object obj = f23550f.get(this);
        if (obj != null) {
            if (!(obj instanceof mia)) {
                return obj == ik6.f28779b ? Long.MAX_VALUE : 0L;
            }
            if (!((mia) obj).m39125j()) {
                return 0L;
            }
        }
        C13474d c13474d = (C13474d) f23551g.get(this);
        if (c13474d == null || (abstractRunnableC13473c = (AbstractRunnableC13473c) c13474d.m17393f()) == null) {
            return Long.MAX_VALUE;
        }
        long j = abstractRunnableC13473c.f23556a;
        v9.m52465a();
        return bce.m18602e(j - System.nanoTime(), 0L);
    }

    public final int z1(long j, AbstractRunnableC13473c abstractRunnableC13473c) {
        if (m26961J()) {
            return 1;
        }
        C13474d c13474d = (C13474d) f23551g.get(this);
        if (c13474d == null) {
            j9.m33417a(f23551g, this, null, new C13474d(j));
            Object obj = f23551g.get(this);
            sq8.m48646e(obj);
            c13474d = (C13474d) obj;
        }
        return abstractRunnableC13473c.m26965h(j, c13474d, this);
    }
}

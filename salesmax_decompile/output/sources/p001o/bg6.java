package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.ig6;
import p001o.ms6;
import p001o.u75;

/* loaded from: classes5.dex */
public class bg6 implements u75.InterfaceC17314b, ms6.InterfaceC15418f {
    public static final C12378c n0 = new C12378c();

    /* renamed from: H */
    public boolean f16116H;

    /* renamed from: L */
    public boolean f16117L;

    /* renamed from: M */
    public boolean f16118M;

    /* renamed from: Q */
    public boolean f16119Q;

    /* renamed from: X */
    public zne f16120X;

    /* renamed from: Y */
    public ez4 f16121Y;

    /* renamed from: Z */
    public boolean f16122Z;

    /* renamed from: a */
    public final C12380e f16123a;

    /* renamed from: b */
    public final h5g f16124b;

    /* renamed from: c */
    public final ig6.InterfaceC14285a f16125c;

    /* renamed from: d */
    public final ged f16126d;

    /* renamed from: e */
    public final C12378c f16127e;

    /* renamed from: f */
    public final cg6 f16128f;

    /* renamed from: g */
    public final ys7 f16129g;

    /* renamed from: h */
    public final ys7 f16130h;
    public xs7 h0;
    public boolean i0;
    public ig6 j0;
    public u75 k0;
    public volatile boolean l0;
    public boolean m0;

    /* renamed from: q */
    public final ys7 f16131q;

    /* renamed from: s */
    public final ys7 f16132s;

    /* renamed from: x */
    public final AtomicInteger f16133x;

    /* renamed from: y */
    public ic9 f16134y;

    /* renamed from: o.bg6$a */
    public class RunnableC12376a implements Runnable {

        /* renamed from: a */
        public final doe f16135a;

        public RunnableC12376a(doe doeVar) {
            this.f16135a = doeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f16135a.mo23652g()) {
                synchronized (bg6.this) {
                    if (bg6.this.f16123a.m18869d(this.f16135a)) {
                        bg6.this.m18852f(this.f16135a);
                    }
                    bg6.this.m18855i();
                }
            }
        }
    }

    /* renamed from: o.bg6$b */
    public class RunnableC12377b implements Runnable {

        /* renamed from: a */
        public final doe f16137a;

        public RunnableC12377b(doe doeVar) {
            this.f16137a = doeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f16137a.mo23652g()) {
                synchronized (bg6.this) {
                    if (bg6.this.f16123a.m18869d(this.f16137a)) {
                        bg6.this.j0.m32105a();
                        bg6.this.m18853g(this.f16137a);
                        bg6.this.m18864r(this.f16137a);
                    }
                    bg6.this.m18855i();
                }
            }
        }
    }

    /* renamed from: o.bg6$c */
    public static class C12378c {
        /* renamed from: a */
        public ig6 m18866a(zne zneVar, boolean z, ic9 ic9Var, ig6.InterfaceC14285a interfaceC14285a) {
            return new ig6(zneVar, z, true, ic9Var, interfaceC14285a);
        }
    }

    /* renamed from: o.bg6$d */
    public static final class C12379d {

        /* renamed from: a */
        public final doe f16139a;

        /* renamed from: b */
        public final Executor f16140b;

        public C12379d(doe doeVar, Executor executor) {
            this.f16139a = doeVar;
            this.f16140b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C12379d) {
                return this.f16139a.equals(((C12379d) obj).f16139a);
            }
            return false;
        }

        public int hashCode() {
            return this.f16139a.hashCode();
        }
    }

    /* renamed from: o.bg6$e */
    public static final class C12380e implements Iterable {

        /* renamed from: a */
        public final List f16141a;

        public C12380e() {
            this(new ArrayList(2));
        }

        /* renamed from: i */
        public static C12379d m18867i(doe doeVar) {
            return new C12379d(doeVar, ul6.m51707a());
        }

        /* renamed from: b */
        public void m18868b(doe doeVar, Executor executor) {
            this.f16141a.add(new C12379d(doeVar, executor));
        }

        public void clear() {
            this.f16141a.clear();
        }

        /* renamed from: d */
        public boolean m18869d(doe doeVar) {
            return this.f16141a.contains(m18867i(doeVar));
        }

        /* renamed from: e */
        public C12380e m18870e() {
            return new C12380e(new ArrayList(this.f16141a));
        }

        public boolean isEmpty() {
            return this.f16141a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f16141a.iterator();
        }

        /* renamed from: j */
        public void m18871j(doe doeVar) {
            this.f16141a.remove(m18867i(doeVar));
        }

        public int size() {
            return this.f16141a.size();
        }

        public C12380e(List list) {
            this.f16141a = list;
        }
    }

    public bg6(ys7 ys7Var, ys7 ys7Var2, ys7 ys7Var3, ys7 ys7Var4, cg6 cg6Var, ig6.InterfaceC14285a interfaceC14285a, ged gedVar) {
        this(ys7Var, ys7Var2, ys7Var3, ys7Var4, cg6Var, interfaceC14285a, gedVar, n0);
    }

    /* renamed from: a */
    public synchronized void m18847a(doe doeVar, Executor executor) {
        this.f16124b.mo29829c();
        this.f16123a.m18868b(doeVar, executor);
        boolean z = true;
        if (this.f16122Z) {
            m18857k(1);
            executor.execute(new RunnableC12377b(doeVar));
        } else if (this.i0) {
            m18857k(1);
            executor.execute(new RunnableC12376a(doeVar));
        } else {
            if (this.l0) {
                z = false;
            }
            bgd.m18883a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // p001o.u75.InterfaceC17314b
    /* renamed from: b */
    public void mo18848b(zne zneVar, ez4 ez4Var, boolean z) {
        synchronized (this) {
            this.f16120X = zneVar;
            this.f16121Y = ez4Var;
            this.m0 = z;
        }
        m18861o();
    }

    @Override // p001o.u75.InterfaceC17314b
    /* renamed from: c */
    public void mo18849c(xs7 xs7Var) {
        synchronized (this) {
            this.h0 = xs7Var;
        }
        m18860n();
    }

    @Override // p001o.ms6.InterfaceC15418f
    /* renamed from: d */
    public h5g mo18850d() {
        return this.f16124b;
    }

    @Override // p001o.u75.InterfaceC17314b
    /* renamed from: e */
    public void mo18851e(u75 u75Var) {
        m18856j().execute(u75Var);
    }

    /* renamed from: f */
    public void m18852f(doe doeVar) {
        try {
            doeVar.mo23651c(this.h0);
        } catch (Throwable th) {
            throw new b32(th);
        }
    }

    /* renamed from: g */
    public void m18853g(doe doeVar) {
        try {
            doeVar.mo23650b(this.j0, this.f16121Y, this.m0);
        } catch (Throwable th) {
            throw new b32(th);
        }
    }

    /* renamed from: h */
    public void m18854h() {
        if (m18859m()) {
            return;
        }
        this.l0 = true;
        this.k0.m51096g();
        this.f16128f.mo21184d(this, this.f16134y);
    }

    /* renamed from: i */
    public void m18855i() {
        ig6 ig6Var;
        synchronized (this) {
            this.f16124b.mo29829c();
            bgd.m18883a(m18859m(), "Not yet complete!");
            int iDecrementAndGet = this.f16133x.decrementAndGet();
            bgd.m18883a(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                ig6Var = this.j0;
                m18863q();
            } else {
                ig6Var = null;
            }
        }
        if (ig6Var != null) {
            ig6Var.m32108e();
        }
    }

    /* renamed from: j */
    public final ys7 m18856j() {
        return this.f16117L ? this.f16131q : this.f16118M ? this.f16132s : this.f16130h;
    }

    /* renamed from: k */
    public synchronized void m18857k(int i) {
        ig6 ig6Var;
        bgd.m18883a(m18859m(), "Not yet complete!");
        if (this.f16133x.getAndAdd(i) == 0 && (ig6Var = this.j0) != null) {
            ig6Var.m32105a();
        }
    }

    /* renamed from: l */
    public synchronized bg6 m18858l(ic9 ic9Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f16134y = ic9Var;
        this.f16116H = z;
        this.f16117L = z2;
        this.f16118M = z3;
        this.f16119Q = z4;
        return this;
    }

    /* renamed from: m */
    public final boolean m18859m() {
        return this.i0 || this.f16122Z || this.l0;
    }

    /* renamed from: n */
    public void m18860n() {
        synchronized (this) {
            this.f16124b.mo29829c();
            if (this.l0) {
                m18863q();
                return;
            }
            if (this.f16123a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.i0) {
                throw new IllegalStateException("Already failed once");
            }
            this.i0 = true;
            ic9 ic9Var = this.f16134y;
            C12380e c12380eM18870e = this.f16123a.m18870e();
            m18857k(c12380eM18870e.size() + 1);
            this.f16128f.mo21183a(this, ic9Var, null);
            Iterator it = c12380eM18870e.iterator();
            while (it.hasNext()) {
                C12379d c12379d = (C12379d) it.next();
                c12379d.f16140b.execute(new RunnableC12376a(c12379d.f16139a));
            }
            m18855i();
        }
    }

    /* renamed from: o */
    public void m18861o() {
        synchronized (this) {
            this.f16124b.mo29829c();
            if (this.l0) {
                this.f16120X.mo19618b();
                m18863q();
                return;
            }
            if (this.f16123a.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f16122Z) {
                throw new IllegalStateException("Already have resource");
            }
            this.j0 = this.f16127e.m18866a(this.f16120X, this.f16116H, this.f16134y, this.f16125c);
            this.f16122Z = true;
            C12380e c12380eM18870e = this.f16123a.m18870e();
            m18857k(c12380eM18870e.size() + 1);
            this.f16128f.mo21183a(this, this.f16134y, this.j0);
            Iterator it = c12380eM18870e.iterator();
            while (it.hasNext()) {
                C12379d c12379d = (C12379d) it.next();
                c12379d.f16140b.execute(new RunnableC12377b(c12379d.f16139a));
            }
            m18855i();
        }
    }

    /* renamed from: p */
    public boolean m18862p() {
        return this.f16119Q;
    }

    /* renamed from: q */
    public final synchronized void m18863q() {
        if (this.f16134y == null) {
            throw new IllegalArgumentException();
        }
        this.f16123a.clear();
        this.f16134y = null;
        this.j0 = null;
        this.f16120X = null;
        this.i0 = false;
        this.l0 = false;
        this.f16122Z = false;
        this.m0 = false;
        this.k0.m51088D(false);
        this.k0 = null;
        this.h0 = null;
        this.f16121Y = null;
        this.f16126d.mo28525a(this);
    }

    /* renamed from: r */
    public synchronized void m18864r(doe doeVar) {
        this.f16124b.mo29829c();
        this.f16123a.m18871j(doeVar);
        if (this.f16123a.isEmpty()) {
            m18854h();
            if ((this.f16122Z || this.i0) && this.f16133x.get() == 0) {
                m18863q();
            }
        }
    }

    /* renamed from: s */
    public synchronized void m18865s(u75 u75Var) {
        this.k0 = u75Var;
        (u75Var.m51095K() ? this.f16129g : m18856j()).execute(u75Var);
    }

    public bg6(ys7 ys7Var, ys7 ys7Var2, ys7 ys7Var3, ys7 ys7Var4, cg6 cg6Var, ig6.InterfaceC14285a interfaceC14285a, ged gedVar, C12378c c12378c) {
        this.f16123a = new C12380e();
        this.f16124b = h5g.m29827a();
        this.f16133x = new AtomicInteger();
        this.f16129g = ys7Var;
        this.f16130h = ys7Var2;
        this.f16131q = ys7Var3;
        this.f16132s = ys7Var4;
        this.f16128f = cg6Var;
        this.f16125c = interfaceC14285a;
        this.f16126d = gedVar;
        this.f16127e = c12378c;
    }
}

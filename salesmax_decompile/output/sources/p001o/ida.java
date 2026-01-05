package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AbstractC11951a;

/* loaded from: classes6.dex */
public final class ida extends z74 implements mk5 {

    /* renamed from: q */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28484q = AtomicIntegerFieldUpdater.newUpdater(ida.class, "runningWorkers$volatile");

    /* renamed from: c */
    public final /* synthetic */ mk5 f28485c;

    /* renamed from: d */
    public final z74 f28486d;

    /* renamed from: e */
    public final int f28487e;

    /* renamed from: f */
    public final String f28488f;

    /* renamed from: g */
    public final lia f28489g;

    /* renamed from: h */
    public final Object f28490h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: o.ida$a */
    public final class RunnableC14259a implements Runnable {

        /* renamed from: a */
        public Runnable f28491a;

        public RunnableC14259a(Runnable runnable) {
            this.f28491a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.f28491a.run();
                } catch (Throwable th) {
                    AbstractC11951a.m16250a(e66.f21035a, th);
                }
                Runnable runnableY0 = ida.this.y0();
                if (runnableY0 == null) {
                    return;
                }
                this.f28491a = runnableY0;
                i++;
                if (i >= 16 && ida.this.f28486d.k0(ida.this)) {
                    ida.this.f28486d.mo22314K(ida.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ida(z74 z74Var, int i, String str) {
        mk5 mk5Var = z74Var instanceof mk5 ? (mk5) z74Var : null;
        this.f28485c = mk5Var == null ? xd5.m56042a() : mk5Var;
        this.f28486d = z74Var;
        this.f28487e = i;
        this.f28488f = str;
        this.f28489g = new lia(false);
        this.f28490h = new Object();
    }

    @Override // p001o.mk5
    /* renamed from: D */
    public void mo26962D(long j, xb2 xb2Var) {
        this.f28485c.mo26962D(j, xb2Var);
    }

    @Override // p001o.z74
    /* renamed from: K */
    public void mo22314K(q74 q74Var, Runnable runnable) {
        Runnable runnableY0;
        this.f28489g.m37312a(runnable);
        if (f28484q.get(this) >= this.f28487e || !z0() || (runnableY0 = y0()) == null) {
            return;
        }
        this.f28486d.mo22314K(this, new RunnableC14259a(runnableY0));
    }

    @Override // p001o.z74
    /* renamed from: X */
    public void mo26180X(q74 q74Var, Runnable runnable) {
        Runnable runnableY0;
        this.f28489g.m37312a(runnable);
        if (f28484q.get(this) >= this.f28487e || !z0() || (runnableY0 = y0()) == null) {
            return;
        }
        this.f28486d.mo26180X(this, new RunnableC14259a(runnableY0));
    }

    @Override // p001o.z74
    public z74 l0(int i, String str) {
        jda.m33601a(i);
        return i >= this.f28487e ? jda.m33602b(this, str) : super.l0(i, str);
    }

    @Override // p001o.mk5
    /* renamed from: t */
    public yu5 mo26963t(long j, Runnable runnable, q74 q74Var) {
        return this.f28485c.mo26963t(j, runnable, q74Var);
    }

    @Override // p001o.z74
    public String toString() {
        String str = this.f28488f;
        if (str != null) {
            return str;
        }
        return this.f28486d + ".limitedParallelism(" + this.f28487e + ')';
    }

    public final Runnable y0() {
        while (true) {
            Runnable runnable = (Runnable) this.f28489g.m37315e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f28490h) {
                f28484q.decrementAndGet(this);
                if (this.f28489g.m37314c() == 0) {
                    return null;
                }
                f28484q.incrementAndGet(this);
            }
        }
    }

    public final boolean z0() {
        synchronized (this.f28490h) {
            if (f28484q.get(this) >= this.f28487e) {
                return false;
            }
            f28484q.incrementAndGet(this);
            return true;
        }
    }
}

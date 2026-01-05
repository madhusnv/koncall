package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class pbj {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f39779b = AtomicReferenceFieldUpdater.newUpdater(pbj.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f39780c = AtomicIntegerFieldUpdater.newUpdater(pbj.class, "producerIndex$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f39781d = AtomicIntegerFieldUpdater.newUpdater(pbj.class, "consumerIndex$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f39782e = AtomicIntegerFieldUpdater.newUpdater(pbj.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a */
    public final AtomicReferenceArray f39783a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* renamed from: a */
    public final xjg m43307a(xjg xjgVar, boolean z) {
        if (z) {
            return m43308b(xjgVar);
        }
        xjg xjgVar2 = (xjg) f39779b.getAndSet(this, xjgVar);
        if (xjgVar2 == null) {
            return null;
        }
        return m43308b(xjgVar2);
    }

    /* renamed from: b */
    public final xjg m43308b(xjg xjgVar) {
        if (m43310e() == 127) {
            return xjgVar;
        }
        if (xjgVar.f53854b) {
            f39782e.incrementAndGet(this);
        }
        int i = f39780c.get(this) & Opcodes.LAND;
        while (this.f39783a.get(i) != null) {
            Thread.yield();
        }
        this.f39783a.lazySet(i, xjgVar);
        f39780c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final void m43309c(xjg xjgVar) {
        if (xjgVar == null || !xjgVar.f53854b) {
            return;
        }
        f39782e.decrementAndGet(this);
    }

    /* renamed from: e */
    public final int m43310e() {
        return f39780c.get(this) - f39781d.get(this);
    }

    /* renamed from: i */
    public final int m43311i() {
        return f39779b.get(this) != null ? m43310e() + 1 : m43310e();
    }

    /* renamed from: j */
    public final void m43312j(jt7 jt7Var) {
        xjg xjgVar = (xjg) f39779b.getAndSet(this, null);
        if (xjgVar != null) {
            jt7Var.m37312a(xjgVar);
        }
        while (m43316n(jt7Var)) {
        }
    }

    /* renamed from: k */
    public final xjg m43313k() {
        xjg xjgVar = (xjg) f39779b.getAndSet(this, null);
        return xjgVar == null ? m43315m() : xjgVar;
    }

    /* renamed from: l */
    public final xjg m43314l() {
        return m43317o(true);
    }

    /* renamed from: m */
    public final xjg m43315m() {
        xjg xjgVar;
        while (true) {
            int i = f39781d.get(this);
            if (i - f39780c.get(this) == 0) {
                return null;
            }
            int i2 = i & Opcodes.LAND;
            if (f39781d.compareAndSet(this, i, i + 1) && (xjgVar = (xjg) this.f39783a.getAndSet(i2, null)) != null) {
                m43309c(xjgVar);
                return xjgVar;
            }
        }
    }

    /* renamed from: n */
    public final boolean m43316n(jt7 jt7Var) {
        xjg xjgVarM43315m = m43315m();
        if (xjgVarM43315m == null) {
            return false;
        }
        jt7Var.m37312a(xjgVarM43315m);
        return true;
    }

    /* renamed from: o */
    public final xjg m43317o(boolean z) {
        xjg xjgVar;
        do {
            xjgVar = (xjg) f39779b.get(this);
            if (xjgVar == null || xjgVar.f53854b != z) {
                int i = f39781d.get(this);
                int i2 = f39780c.get(this);
                while (i != i2) {
                    if (z && f39782e.get(this) == 0) {
                        return null;
                    }
                    i2--;
                    xjg xjgVarM43319q = m43319q(i2, z);
                    if (xjgVarM43319q != null) {
                        return xjgVarM43319q;
                    }
                }
                return null;
            }
        } while (!j9.m33417a(f39779b, this, xjgVar, null));
        return xjgVar;
    }

    /* renamed from: p */
    public final xjg m43318p(int i) {
        int i2 = f39781d.get(this);
        int i3 = f39780c.get(this);
        boolean z = i == 1;
        while (i2 != i3) {
            if (z && f39782e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            xjg xjgVarM43319q = m43319q(i2, z);
            if (xjgVarM43319q != null) {
                return xjgVarM43319q;
            }
            i2 = i4;
        }
        return null;
    }

    /* renamed from: q */
    public final xjg m43319q(int i, boolean z) {
        int i2 = i & Opcodes.LAND;
        xjg xjgVar = (xjg) this.f39783a.get(i2);
        if (xjgVar == null || xjgVar.f53854b != z || !wg2.m54356a(this.f39783a, i2, xjgVar, null)) {
            return null;
        }
        if (z) {
            f39782e.decrementAndGet(this);
        }
        return xjgVar;
    }

    /* renamed from: r */
    public final long m43320r(int i, gge ggeVar) {
        xjg xjgVarM43315m = i == 3 ? m43315m() : m43318p(i);
        if (xjgVarM43315m == null) {
            return m43321s(i, ggeVar);
        }
        ggeVar.f25106a = xjgVarM43315m;
        return -1L;
    }

    /* renamed from: s */
    public final long m43321s(int i, gge ggeVar) {
        xjg xjgVar;
        do {
            xjgVar = (xjg) f39779b.get(this);
            if (xjgVar == null) {
                return -2L;
            }
            if (((xjgVar.f53854b ? 1 : 2) & i) == 0) {
                return -2L;
            }
            long jMo29826a = d2h.f19051f.mo29826a() - xjgVar.f53853a;
            long j = d2h.f19047b;
            if (jMo29826a < j) {
                return j - jMo29826a;
            }
        } while (!j9.m33417a(f39779b, this, xjgVar, null));
        ggeVar.f25106a = xjgVar;
        return -1L;
    }
}

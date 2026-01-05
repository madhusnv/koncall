package p001o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public abstract class eq3 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22039a = AtomicReferenceFieldUpdater.newUpdater(eq3.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22040b = AtomicReferenceFieldUpdater.newUpdater(eq3.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public eq3(eq3 eq3Var) {
        this._prev$volatile = eq3Var;
    }

    /* renamed from: c */
    public final void m25422c() {
        f22040b.set(this, null);
    }

    /* renamed from: d */
    public final eq3 m25423d() {
        eq3 eq3VarM25427h = m25427h();
        while (eq3VarM25427h != null && eq3VarM25427h.mo25428k()) {
            eq3VarM25427h = (eq3) f22040b.get(eq3VarM25427h);
        }
        return eq3VarM25427h;
    }

    /* renamed from: e */
    public final eq3 m25424e() {
        eq3 eq3VarM25425f = m25425f();
        sq8.m48646e(eq3VarM25425f);
        while (eq3VarM25425f.mo25428k()) {
            eq3 eq3VarM25425f2 = eq3VarM25425f.m25425f();
            if (eq3VarM25425f2 == null) {
                return eq3VarM25425f;
            }
            eq3VarM25425f = eq3VarM25425f2;
        }
        return eq3VarM25425f;
    }

    /* renamed from: f */
    public final eq3 m25425f() {
        Object objM25426g = m25426g();
        if (objM25426g == dq3.f20402a) {
            return null;
        }
        return (eq3) objM25426g;
    }

    /* renamed from: g */
    public final Object m25426g() {
        return f22039a.get(this);
    }

    /* renamed from: h */
    public final eq3 m25427h() {
        return (eq3) f22040b.get(this);
    }

    /* renamed from: k */
    public abstract boolean mo25428k();

    /* renamed from: l */
    public final boolean m25429l() {
        return m25425f() == null;
    }

    /* renamed from: m */
    public final boolean m25430m() {
        return j9.m33417a(f22039a, this, null, dq3.f20402a);
    }

    /* renamed from: n */
    public final void m25431n() {
        Object obj;
        if (m25429l()) {
            return;
        }
        while (true) {
            eq3 eq3VarM25423d = m25423d();
            eq3 eq3VarM25424e = m25424e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22040b;
            do {
                obj = atomicReferenceFieldUpdater.get(eq3VarM25424e);
            } while (!j9.m33417a(atomicReferenceFieldUpdater, eq3VarM25424e, obj, ((eq3) obj) == null ? null : eq3VarM25423d));
            if (eq3VarM25423d != null) {
                f22039a.set(eq3VarM25423d, eq3VarM25424e);
            }
            if (!eq3VarM25424e.mo25428k() || eq3VarM25424e.m25429l()) {
                if (eq3VarM25423d == null || !eq3VarM25423d.mo25428k()) {
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public final boolean m25432o(eq3 eq3Var) {
        return j9.m33417a(f22039a, this, null, eq3Var);
    }
}

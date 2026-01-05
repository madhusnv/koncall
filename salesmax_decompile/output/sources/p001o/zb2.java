package p001o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.AbstractC11951a;
import p001o.tb2;

/* loaded from: classes6.dex */
public class zb2 extends bu5 implements xb2, k84, x3j {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56891f = AtomicIntegerFieldUpdater.newUpdater(zb2.class, "_decisionAndIndex$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56892g = AtomicReferenceFieldUpdater.newUpdater(zb2.class, Object.class, "_state$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56893h = AtomicReferenceFieldUpdater.newUpdater(zb2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d */
    public final n64 f56894d;

    /* renamed from: e */
    public final q74 f56895e;

    public zb2(n64 n64Var, int i) {
        super(i);
        this.f56894d = n64Var;
        this.f56895e = n64Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = xm.f53908a;
    }

    /* renamed from: Q */
    public static final y3i m59112Q(xk7 xk7Var, Throwable th, Object obj, q74 q74Var) {
        xk7Var.invoke(th);
        return y3i.f54824a;
    }

    /* renamed from: S */
    public static /* synthetic */ void m59113S(zb2 zb2Var, Object obj, int i, ql7 ql7Var, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            ql7Var = null;
        }
        zb2Var.m59126R(obj, i, ql7Var);
    }

    @Override // p001o.xb2
    /* renamed from: A */
    public void mo48684A(Object obj, ql7 ql7Var) {
        m59126R(obj, this.f16829c, ql7Var);
    }

    @Override // p001o.xb2
    /* renamed from: B */
    public void mo48685B(Object obj, final xk7 xk7Var) {
        m59126R(obj, this.f16829c, xk7Var != null ? new ql7() { // from class: o.yb2
            @Override // p001o.ql7
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return zb2.m59112Q(xk7Var, (Throwable) obj2, obj3, (q74) obj4);
            }
        } : null);
    }

    /* renamed from: E */
    public void m59116E() {
        yu5 yu5VarM59117G = m59117G();
        if (yu5VarM59117G != null && m59120J()) {
            yu5VarM59117G.dispose();
            f56893h.set(this, e0c.f20709a);
        }
    }

    @Override // p001o.xb2
    /* renamed from: F */
    public void mo48686F(Object obj) {
        m59138s(this.f16829c);
    }

    /* renamed from: G */
    public final yu5 m59117G() {
        p69 p69Var = (p69) getContext().get(p69.f39399t);
        if (p69Var == null) {
            return null;
        }
        yu5 yu5VarM16555m = a79.m16555m(p69Var, false, new b93(this), 1, null);
        j9.m33417a(f56893h, this, null, yu5VarM16555m);
        return yu5VarM16555m;
    }

    /* renamed from: H */
    public final void m59118H(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56892g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof xm) {
                if (j9.m33417a(f56892g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof tb2) || (obj2 instanceof ibf)) {
                m59122L(obj, obj2);
            } else {
                boolean z = obj2 instanceof lm3;
                if (z) {
                    lm3 lm3Var = (lm3) obj2;
                    if (!lm3Var.m37464c()) {
                        m59122L(obj, obj2);
                    }
                    if (obj2 instanceof fc2) {
                        if (!z) {
                            lm3Var = null;
                        }
                        Throwable th = lm3Var != null ? lm3Var.f34036a : null;
                        if (obj instanceof tb2) {
                            m59132l((tb2) obj, th);
                            return;
                        } else {
                            sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m59134n((ibf) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof jm3) {
                    jm3 jm3Var = (jm3) obj2;
                    if (jm3Var.f30681b != null) {
                        m59122L(obj, obj2);
                    }
                    if (obj instanceof ibf) {
                        return;
                    }
                    sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    tb2 tb2Var = (tb2) obj;
                    if (jm3Var.m34013c()) {
                        m59132l(tb2Var, jm3Var.f30684e);
                        return;
                    } else {
                        if (j9.m33417a(f56892g, this, obj2, jm3.m34011b(jm3Var, null, tb2Var, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof ibf) {
                        return;
                    }
                    sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (j9.m33417a(f56892g, this, obj2, new jm3(obj2, (tb2) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public final void m59119I(tb2 tb2Var) {
        m59118H(tb2Var);
    }

    /* renamed from: J */
    public boolean m59120J() {
        return !(m59141w() instanceof r0c);
    }

    /* renamed from: K */
    public final boolean m59121K() {
        if (cu5.m21809c(this.f16829c)) {
            n64 n64Var = this.f56894d;
            sq8.m48647f(n64Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((yt5) n64Var).m58194o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public final void m59122L(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: M */
    public String mo22433M() {
        return "CancellableContinuation";
    }

    /* renamed from: N */
    public final void m59123N(Throwable th) {
        if (m59135o(th)) {
            return;
        }
        cancel(th);
        m59137r();
    }

    /* renamed from: O */
    public final void m59124O() {
        Throwable thM58197s;
        n64 n64Var = this.f56894d;
        yt5 yt5Var = n64Var instanceof yt5 ? (yt5) n64Var : null;
        if (yt5Var == null || (thM58197s = yt5Var.m58197s(this)) == null) {
            return;
        }
        m59136q();
        cancel(thM58197s);
    }

    /* renamed from: P */
    public final boolean m59125P() {
        Object obj = f56892g.get(this);
        if ((obj instanceof jm3) && ((jm3) obj).f30683d != null) {
            m59136q();
            return false;
        }
        f56891f.set(this, 536870911);
        f56892g.set(this, xm.f53908a);
        return true;
    }

    /* renamed from: R */
    public final void m59126R(Object obj, int i, ql7 ql7Var) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56892g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof r0c)) {
                if (obj2 instanceof fc2) {
                    fc2 fc2Var = (fc2) obj2;
                    if (fc2Var.m26433e()) {
                        if (ql7Var != null) {
                            m59133m(ql7Var, fc2Var.f34036a, obj);
                            return;
                        }
                        return;
                    }
                }
                m59131k(obj);
                throw new qe9();
            }
        } while (!j9.m33417a(f56892g, this, obj2, m59127T((r0c) obj2, obj, i, ql7Var, null)));
        m59137r();
        m59138s(i);
    }

    /* renamed from: T */
    public final Object m59127T(r0c r0cVar, Object obj, int i, ql7 ql7Var, Object obj2) {
        if (obj instanceof lm3) {
            return obj;
        }
        if (!cu5.m21808b(i) && obj2 == null) {
            return obj;
        }
        if (ql7Var == null && !(r0cVar instanceof tb2) && obj2 == null) {
            return obj;
        }
        return new jm3(obj, r0cVar instanceof tb2 ? (tb2) r0cVar : null, ql7Var, obj2, null, 16, null);
    }

    /* renamed from: U */
    public final boolean m59128U() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56891f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f56891f.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    /* renamed from: V */
    public final lgg m59129V(Object obj, Object obj2, ql7 ql7Var) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56892g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof r0c)) {
                if ((obj3 instanceof jm3) && obj2 != null && ((jm3) obj3).f30683d == obj2) {
                    return ac2.f14466a;
                }
                return null;
            }
        } while (!j9.m33417a(f56892g, this, obj3, m59127T((r0c) obj3, obj, this.f16829c, ql7Var, obj2)));
        m59137r();
        return ac2.f14466a;
    }

    /* renamed from: W */
    public final boolean m59130W() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56891f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f56891f.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    @Override // p001o.xb2
    /* renamed from: a */
    public boolean mo48687a() {
        return m59141w() instanceof r0c;
    }

    @Override // p001o.bu5
    /* renamed from: b */
    public void mo19807b(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56892g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof r0c) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof lm3) {
                return;
            }
            if (obj2 instanceof jm3) {
                jm3 jm3Var = (jm3) obj2;
                if (!(!jm3Var.m34013c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (j9.m33417a(f56892g, this, obj2, jm3.m34011b(jm3Var, null, null, null, null, th, 15, null))) {
                    jm3Var.m34014d(this, th);
                    return;
                }
            } else if (j9.m33417a(f56892g, this, obj2, new jm3(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // p001o.x3j
    /* renamed from: c */
    public void mo23483c(ibf ibfVar, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56891f;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if (!((i2 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m59118H(ibfVar);
    }

    @Override // p001o.xb2
    public boolean cancel(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56892g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r0c)) {
                return false;
            }
        } while (!j9.m33417a(f56892g, this, obj, new fc2(this, th, (obj instanceof tb2) || (obj instanceof ibf))));
        r0c r0cVar = (r0c) obj;
        if (r0cVar instanceof tb2) {
            m59132l((tb2) obj, th);
        } else if (r0cVar instanceof ibf) {
            m59134n((ibf) obj, th);
        }
        m59137r();
        m59138s(this.f16829c);
        return true;
    }

    @Override // p001o.bu5
    /* renamed from: d */
    public final n64 mo19808d() {
        return this.f56894d;
    }

    @Override // p001o.xb2
    /* renamed from: e */
    public void mo48688e(z74 z74Var, Object obj) {
        n64 n64Var = this.f56894d;
        yt5 yt5Var = n64Var instanceof yt5 ? (yt5) n64Var : null;
        m59113S(this, obj, (yt5Var != null ? yt5Var.f55910d : null) == z74Var ? 4 : this.f16829c, null, 4, null);
    }

    @Override // p001o.bu5
    /* renamed from: f */
    public Throwable mo19809f(Object obj) {
        Throwable thMo19809f = super.mo19809f(obj);
        if (thMo19809f != null) {
            return thMo19809f;
        }
        return null;
    }

    @Override // p001o.bu5
    /* renamed from: g */
    public Object mo19810g(Object obj) {
        return obj instanceof jm3 ? ((jm3) obj).f30680a : obj;
    }

    @Override // p001o.k84
    public k84 getCallerFrame() {
        n64 n64Var = this.f56894d;
        if (n64Var instanceof k84) {
            return (k84) n64Var;
        }
        return null;
    }

    @Override // p001o.n64
    public q74 getContext() {
        return this.f56895e;
    }

    @Override // p001o.bu5
    /* renamed from: i */
    public Object mo19812i() {
        return m59141w();
    }

    /* renamed from: k */
    public final Void m59131k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: l */
    public final void m59132l(tb2 tb2Var, Throwable th) {
        try {
            tb2Var.mo23886a(th);
        } catch (Throwable th2) {
            AbstractC11951a.m16250a(getContext(), new qm3("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: m */
    public final void m59133m(ql7 ql7Var, Throwable th, Object obj) {
        try {
            ql7Var.invoke(th, obj, getContext());
        } catch (Throwable th2) {
            AbstractC11951a.m16250a(getContext(), new qm3("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: n */
    public final void m59134n(ibf ibfVar, Throwable th) {
        int i = f56891f.get(this) & 536870911;
        if (!(i != 536870911)) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            ibfVar.mo24827s(i, th, getContext());
        } catch (Throwable th2) {
            AbstractC11951a.m16250a(getContext(), new qm3("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: o */
    public final boolean m59135o(Throwable th) {
        if (!m59121K()) {
            return false;
        }
        n64 n64Var = this.f56894d;
        sq8.m48647f(n64Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((yt5) n64Var).m58195q(th);
    }

    @Override // p001o.xb2
    /* renamed from: p */
    public Object mo48693p(Object obj, Object obj2, ql7 ql7Var) {
        return m59129V(obj, obj2, ql7Var);
    }

    /* renamed from: q */
    public final void m59136q() {
        yu5 yu5VarM59139u = m59139u();
        if (yu5VarM59139u == null) {
            return;
        }
        yu5VarM59139u.dispose();
        f56893h.set(this, e0c.f20709a);
    }

    /* renamed from: r */
    public final void m59137r() {
        if (m59121K()) {
            return;
        }
        m59136q();
    }

    @Override // p001o.n64
    public void resumeWith(Object obj) {
        m59113S(this, rm3.m46956c(obj, this), this.f16829c, null, 4, null);
    }

    /* renamed from: s */
    public final void m59138s(int i) {
        if (m59128U()) {
            return;
        }
        cu5.m21807a(this, i);
    }

    /* renamed from: t */
    public Throwable mo22434t(p69 p69Var) {
        return p69Var.mo22431r();
    }

    public String toString() {
        return mo22433M() + '(' + o75.m41659c(this.f56894d) + "){" + m59142x() + "}@" + o75.m41658b(this);
    }

    /* renamed from: u */
    public final yu5 m59139u() {
        return (yu5) f56893h.get(this);
    }

    /* renamed from: v */
    public final Object m59140v() {
        p69 p69Var;
        boolean zM59121K = m59121K();
        if (m59130W()) {
            if (m59139u() == null) {
                m59117G();
            }
            if (zM59121K) {
                m59124O();
            }
            return uq8.m51918f();
        }
        if (zM59121K) {
            m59124O();
        }
        Object objM59141w = m59141w();
        if (objM59141w instanceof lm3) {
            throw ((lm3) objM59141w).f34036a;
        }
        if (!cu5.m21808b(this.f16829c) || (p69Var = (p69) getContext().get(p69.f39399t)) == null || p69Var.mo22428a()) {
            return mo19810g(objM59141w);
        }
        CancellationException cancellationExceptionMo22431r = p69Var.mo22431r();
        mo19807b(objM59141w, cancellationExceptionMo22431r);
        throw cancellationExceptionMo22431r;
    }

    /* renamed from: w */
    public final Object m59141w() {
        return f56892g.get(this);
    }

    /* renamed from: x */
    public final String m59142x() {
        Object objM59141w = m59141w();
        return objM59141w instanceof r0c ? "Active" : objM59141w instanceof fc2 ? "Cancelled" : "Completed";
    }

    @Override // p001o.xb2
    /* renamed from: y */
    public void mo48694y(xk7 xk7Var) {
        bc2.m18562c(this, new tb2.C17044a(xk7Var));
    }
}

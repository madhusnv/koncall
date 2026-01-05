package p001o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public final class yt5 extends bu5 implements k84, n64 {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55909h = AtomicReferenceFieldUpdater.newUpdater(yt5.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d */
    public final z74 f55910d;

    /* renamed from: e */
    public final n64 f55911e;

    /* renamed from: f */
    public Object f55912f;

    /* renamed from: g */
    public final Object f55913g;

    public yt5(z74 z74Var, n64 n64Var) {
        super(-1);
        this.f55910d = z74Var;
        this.f55911e = n64Var;
        this.f55912f = zt5.f57669a;
        this.f55913g = kkh.m35818g(getContext());
    }

    @Override // p001o.bu5
    /* renamed from: d */
    public n64 mo19808d() {
        return this;
    }

    @Override // p001o.k84
    public k84 getCallerFrame() {
        n64 n64Var = this.f55911e;
        if (n64Var instanceof k84) {
            return (k84) n64Var;
        }
        return null;
    }

    @Override // p001o.n64
    public q74 getContext() {
        return this.f55911e.getContext();
    }

    @Override // p001o.bu5
    /* renamed from: i */
    public Object mo19812i() {
        Object obj = this.f55912f;
        this.f55912f = zt5.f57669a;
        return obj;
    }

    /* renamed from: j */
    public final void m58190j() {
        while (f55909h.get(this) == zt5.f57670b) {
        }
    }

    /* renamed from: k */
    public final zb2 m58191k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55909h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f55909h.set(this, zt5.f57670b);
                return null;
            }
            if (obj instanceof zb2) {
                if (j9.m33417a(f55909h, this, obj, zt5.f57670b)) {
                    return (zb2) obj;
                }
            } else if (obj != zt5.f57670b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: l */
    public final void m58192l(q74 q74Var, Object obj) {
        this.f55912f = obj;
        this.f16829c = 1;
        this.f55910d.mo26180X(q74Var, this);
    }

    /* renamed from: m */
    public final zb2 m58193m() {
        Object obj = f55909h.get(this);
        if (obj instanceof zb2) {
            return (zb2) obj;
        }
        return null;
    }

    /* renamed from: o */
    public final boolean m58194o() {
        return f55909h.get(this) != null;
    }

    /* renamed from: q */
    public final boolean m58195q(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55909h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            lgg lggVar = zt5.f57670b;
            if (sq8.m48644c(obj, lggVar)) {
                if (j9.m33417a(f55909h, this, lggVar, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (j9.m33417a(f55909h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: r */
    public final void m58196r() {
        m58190j();
        zb2 zb2VarM58193m = m58193m();
        if (zb2VarM58193m != null) {
            zb2VarM58193m.m59136q();
        }
    }

    @Override // p001o.n64
    public void resumeWith(Object obj) {
        Object objM46955b = rm3.m46955b(obj);
        if (this.f55910d.k0(getContext())) {
            this.f55912f = objM46955b;
            this.f16829c = 0;
            this.f55910d.mo22314K(getContext(), this);
            return;
        }
        ek6 ek6VarM43813b = pkh.f40203a.m43813b();
        if (ek6VarM43813b.F0()) {
            this.f55912f = objM46955b;
            this.f16829c = 0;
            ek6VarM43813b.y0(this);
            return;
        }
        ek6VarM43813b.A0(true);
        try {
            q74 context = getContext();
            Object objM35820i = kkh.m35820i(context, this.f55913g);
            try {
                this.f55911e.resumeWith(obj);
                y3i y3iVar = y3i.f54824a;
                while (ek6VarM43813b.I0()) {
                }
            } finally {
                kkh.m35817f(context, objM35820i);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: s */
    public final Throwable m58197s(xb2 xb2Var) {
        lgg lggVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55909h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            lggVar = zt5.f57670b;
            if (obj != lggVar) {
                if (obj instanceof Throwable) {
                    if (j9.m33417a(f55909h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!j9.m33417a(f55909h, this, lggVar, xb2Var));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f55910d + ", " + o75.m41659c(this.f55911e) + ']';
    }
}

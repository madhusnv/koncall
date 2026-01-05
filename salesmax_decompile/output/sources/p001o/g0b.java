package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class g0b implements s0b {
    /* renamed from: e */
    public static g0b m27836e(r0b r0bVar) {
        Objects.requireNonNull(r0bVar, "onSubscribe is null");
        return fwe.m27594m(new h0b(r0bVar));
    }

    /* renamed from: f */
    public static g0b m27837f(idg idgVar) {
        Objects.requireNonNull(idgVar, "supplier is null");
        return fwe.m27594m(new j0b(idgVar));
    }

    /* renamed from: j */
    public static g0b m27838j(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return fwe.m27594m(new o0b(obj));
    }

    @Override // p001o.s0b
    /* renamed from: a */
    public final void mo27839a(q0b q0bVar) {
        Objects.requireNonNull(q0bVar, "observer is null");
        q0b q0bVarM27605x = fwe.m27605x(this, q0bVar);
        Objects.requireNonNull(q0bVarM27605x, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo26168l(q0bVarM27605x);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            zk6.m59526b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: d */
    public final Object m27840d() {
        vj1 vj1Var = new vj1();
        mo27839a(vj1Var);
        return vj1Var.m52872c();
    }

    /* renamed from: g */
    public final g0b m27841g(ggd ggdVar) {
        Objects.requireNonNull(ggdVar, "predicate is null");
        return fwe.m27594m(new k0b(this, ggdVar));
    }

    /* renamed from: h */
    public final g0b m27842h(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27594m(new n0b(this, rl7Var));
    }

    /* renamed from: i */
    public final xk3 m27843i(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27592k(new m0b(this, rl7Var));
    }

    /* renamed from: k */
    public final g0b m27844k(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27594m(new p0b(this, rl7Var));
    }

    /* renamed from: l */
    public abstract void mo26168l(q0b q0bVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final s47 m27845m() {
        return this instanceof nm7 ? ((nm7) this).mo26167c() : fwe.m27593l(new t0b(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public final x6c m27846n() {
        return this instanceof om7 ? ((om7) this).mo18256b() : fwe.m27595n(new u0b(this));
    }
}

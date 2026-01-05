package p001o;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public abstract class wtf implements xuf {
    /* renamed from: e */
    public static wtf m55005e(muf mufVar) {
        Objects.requireNonNull(mufVar, "source is null");
        return fwe.m27596o(new ytf(mufVar));
    }

    /* renamed from: g */
    public static wtf m55006g(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return m55007h(km7.m35919e(th));
    }

    /* renamed from: h */
    public static wtf m55007h(idg idgVar) {
        Objects.requireNonNull(idgVar, "supplier is null");
        return fwe.m27596o(new buf(idgVar));
    }

    /* renamed from: m */
    public static wtf m55008m(Callable callable) {
        Objects.requireNonNull(callable, "callable is null");
        return fwe.m27596o(new guf(callable));
    }

    /* renamed from: o */
    public static wtf m55009o(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return fwe.m27596o(new huf(obj));
    }

    /* renamed from: z */
    public static wtf m55010z(s47 s47Var) {
        return fwe.m27596o(new f67(s47Var, null));
    }

    @Override // p001o.xuf
    /* renamed from: a */
    public final void mo55011a(luf lufVar) {
        Objects.requireNonNull(lufVar, "observer is null");
        luf lufVarM27607z = fwe.m27607z(this, lufVar);
        Objects.requireNonNull(lufVarM27607z, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo18257v(lufVarM27607z);
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
    public final Object m55012d() {
        vj1 vj1Var = new vj1();
        mo55011a(vj1Var);
        return vj1Var.m52872c();
    }

    /* renamed from: f */
    public final wtf m55013f(gu3 gu3Var) {
        Objects.requireNonNull(gu3Var, "onError is null");
        return fwe.m27596o(new ztf(this, gu3Var));
    }

    /* renamed from: i */
    public final g0b m55014i(ggd ggdVar) {
        Objects.requireNonNull(ggdVar, "predicate is null");
        return fwe.m27594m(new l0b(this, ggdVar));
    }

    /* renamed from: j */
    public final wtf m55015j(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27596o(new cuf(this, rl7Var));
    }

    /* renamed from: k */
    public final xk3 m55016k(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27592k(new duf(this, rl7Var));
    }

    /* renamed from: l */
    public final x6c m55017l(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27595n(new euf(this, rl7Var));
    }

    /* renamed from: n */
    public final xk3 m55018n() {
        return fwe.m27592k(new jl3(this));
    }

    /* renamed from: p */
    public final wtf m55019p(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27596o(new juf(this, rl7Var));
    }

    /* renamed from: q */
    public final wtf m55020q(c5f c5fVar) {
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27596o(new kuf(this, c5fVar));
    }

    /* renamed from: r */
    public final s47 m55021r(long j) {
        return m55026x().m47694W(j);
    }

    /* renamed from: s */
    public final wtf m55022s(long j, ggd ggdVar) {
        return m55010z(m55026x().m47695X(j, ggdVar));
    }

    /* renamed from: t */
    public final su5 m55023t(gu3 gu3Var) {
        return m55024u(gu3Var, km7.f32435f);
    }

    /* renamed from: u */
    public final su5 m55024u(gu3 gu3Var, gu3 gu3Var2) {
        Objects.requireNonNull(gu3Var, "onSuccess is null");
        Objects.requireNonNull(gu3Var2, "onError is null");
        iu3 iu3Var = new iu3(gu3Var, gu3Var2);
        mo55011a(iu3Var);
        return iu3Var;
    }

    /* renamed from: v */
    public abstract void mo18257v(luf lufVar);

    /* renamed from: w */
    public final wtf m55025w(c5f c5fVar) {
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27596o(new yuf(this, c5fVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final s47 m55026x() {
        return this instanceof nm7 ? ((nm7) this).mo26167c() : fwe.m27593l(new zuf(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final x6c m55027y() {
        return this instanceof om7 ? ((om7) this).mo18256b() : fwe.m27595n(new avf(this));
    }
}

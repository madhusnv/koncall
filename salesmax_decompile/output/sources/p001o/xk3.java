package p001o;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public abstract class xk3 implements ql3 {
    /* renamed from: B */
    public static xk3 m56384B(long j, TimeUnit timeUnit) {
        return m56385C(j, timeUnit, i5f.m31597a());
    }

    /* renamed from: C */
    public static xk3 m56385C(long j, TimeUnit timeUnit, c5f c5fVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27592k(new tl3(j, timeUnit, c5fVar));
    }

    /* renamed from: D */
    public static NullPointerException m56386D(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: f */
    public static xk3 m56387f() {
        return fwe.m27592k(gl3.f25404a);
    }

    /* renamed from: g */
    public static xk3 m56388g(Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return fwe.m27592k(new zk3(iterable));
    }

    /* renamed from: h */
    public static xk3 m56389h(nl3 nl3Var) {
        Objects.requireNonNull(nl3Var, "source is null");
        return fwe.m27592k(new al3(nl3Var));
    }

    /* renamed from: i */
    public static xk3 m56390i(idg idgVar) {
        Objects.requireNonNull(idgVar, "supplier is null");
        return fwe.m27592k(new bl3(idgVar));
    }

    /* renamed from: p */
    public static xk3 m56391p(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return fwe.m27592k(new hl3(th));
    }

    /* renamed from: q */
    public static xk3 m56392q(jm jmVar) {
        Objects.requireNonNull(jmVar, "action is null");
        return fwe.m27592k(new il3(jmVar));
    }

    /* renamed from: r */
    public static xk3 m56393r(g3e g3eVar, int i, boolean z) {
        Objects.requireNonNull(g3eVar, "sources is null");
        k6c.m35038b(i, "maxConcurrency");
        return fwe.m27592k(new ll3(g3eVar, i, z));
    }

    /* renamed from: s */
    public static xk3 m56394s(g3e g3eVar, int i) {
        return m56393r(g3eVar, i, true);
    }

    /* renamed from: A */
    public final xk3 m56395A(long j, TimeUnit timeUnit, c5f c5fVar, ql3 ql3Var) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27592k(new sl3(this, j, timeUnit, c5fVar, ql3Var));
    }

    /* renamed from: E */
    public final wtf m56396E(idg idgVar) {
        Objects.requireNonNull(idgVar, "completionValueSupplier is null");
        return fwe.m27596o(new ul3(this, idgVar, null));
    }

    @Override // p001o.ql3
    /* renamed from: a */
    public final void mo45628a(ml3 ml3Var) {
        Objects.requireNonNull(ml3Var, "observer is null");
        try {
            ml3 ml3VarM27604w = fwe.m27604w(this, ml3Var);
            Objects.requireNonNull(ml3VarM27604w, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo17340x(ml3VarM27604w);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            zk6.m59526b(th);
            fwe.m27599r(th);
            throw m56386D(th);
        }
    }

    /* renamed from: c */
    public final xk3 m56397c(ql3 ql3Var) {
        Objects.requireNonNull(ql3Var, "next is null");
        return fwe.m27592k(new yk3(this, ql3Var));
    }

    /* renamed from: d */
    public final void m56398d() throws InterruptedException {
        vj1 vj1Var = new vj1();
        mo45628a(vj1Var);
        vj1Var.m52872c();
    }

    /* renamed from: e */
    public final boolean m56399e(long j, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit is null");
        vj1 vj1Var = new vj1();
        mo45628a(vj1Var);
        return vj1Var.m52871b(j, timeUnit);
    }

    /* renamed from: j */
    public final xk3 m56400j(jm jmVar) {
        gu3 gu3VarM35917c = km7.m35917c();
        gu3 gu3VarM35917c2 = km7.m35917c();
        jm jmVar2 = km7.f32432c;
        return m56403m(gu3VarM35917c, gu3VarM35917c2, jmVar, jmVar2, jmVar2, jmVar2);
    }

    /* renamed from: k */
    public final xk3 m56401k(jm jmVar) {
        gu3 gu3VarM35917c = km7.m35917c();
        gu3 gu3VarM35917c2 = km7.m35917c();
        jm jmVar2 = km7.f32432c;
        return m56403m(gu3VarM35917c, gu3VarM35917c2, jmVar2, jmVar2, jmVar2, jmVar);
    }

    /* renamed from: l */
    public final xk3 m56402l(gu3 gu3Var) {
        gu3 gu3VarM35917c = km7.m35917c();
        jm jmVar = km7.f32432c;
        return m56403m(gu3VarM35917c, gu3Var, jmVar, jmVar, jmVar, jmVar);
    }

    /* renamed from: m */
    public final xk3 m56403m(gu3 gu3Var, gu3 gu3Var2, jm jmVar, jm jmVar2, jm jmVar3, jm jmVar4) {
        Objects.requireNonNull(gu3Var, "onSubscribe is null");
        Objects.requireNonNull(gu3Var2, "onError is null");
        Objects.requireNonNull(jmVar, "onComplete is null");
        Objects.requireNonNull(jmVar2, "onTerminate is null");
        Objects.requireNonNull(jmVar3, "onAfterTerminate is null");
        Objects.requireNonNull(jmVar4, "onDispose is null");
        return fwe.m27592k(new ol3(this, gu3Var, gu3Var2, jmVar, jmVar2, jmVar3, jmVar4));
    }

    /* renamed from: n */
    public final xk3 m56404n(gu3 gu3Var) {
        gu3 gu3VarM35917c = km7.m35917c();
        jm jmVar = km7.f32432c;
        return m56403m(gu3Var, gu3VarM35917c, jmVar, jmVar, jmVar, jmVar);
    }

    /* renamed from: o */
    public final xk3 m56405o(jm jmVar) {
        gu3 gu3VarM35917c = km7.m35917c();
        gu3 gu3VarM35917c2 = km7.m35917c();
        jm jmVar2 = km7.f32432c;
        return m56403m(gu3VarM35917c, gu3VarM35917c2, jmVar2, jmVar, jmVar2, jmVar2);
    }

    /* renamed from: t */
    public final xk3 m56406t(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "fallbackSupplier is null");
        return fwe.m27592k(new pl3(this, rl7Var));
    }

    /* renamed from: u */
    public final su5 m56407u() {
        d66 d66Var = new d66();
        mo45628a(d66Var);
        return d66Var;
    }

    /* renamed from: v */
    public final su5 m56408v(jm jmVar) {
        Objects.requireNonNull(jmVar, "onComplete is null");
        a32 a32Var = new a32(jmVar);
        mo45628a(a32Var);
        return a32Var;
    }

    /* renamed from: w */
    public final su5 m56409w(jm jmVar, gu3 gu3Var) {
        Objects.requireNonNull(gu3Var, "onError is null");
        Objects.requireNonNull(jmVar, "onComplete is null");
        a32 a32Var = new a32(gu3Var, jmVar);
        mo45628a(a32Var);
        return a32Var;
    }

    /* renamed from: x */
    public abstract void mo17340x(ml3 ml3Var);

    /* renamed from: y */
    public final xk3 m56410y(c5f c5fVar) {
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27592k(new rl3(this, c5fVar));
    }

    /* renamed from: z */
    public final xk3 m56411z(long j, TimeUnit timeUnit) {
        return m56395A(j, timeUnit, i5f.m31597a(), null);
    }
}

package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.stream.Collector;

/* loaded from: classes6.dex */
public abstract class s47 implements g3e {

    /* renamed from: a */
    public static final int f44747a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    /* renamed from: C */
    public static s47 m47668C() {
        return fwe.m27593l(h57.f26215b);
    }

    /* renamed from: H */
    public static s47 m47669H(Callable callable) {
        Objects.requireNonNull(callable, "callable is null");
        return fwe.m27593l(new k57(callable));
    }

    /* renamed from: I */
    public static s47 m47670I(Future future) {
        Objects.requireNonNull(future, "future is null");
        return fwe.m27593l(new l57(future, 0L, null));
    }

    /* renamed from: J */
    public static s47 m47671J(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return fwe.m27593l(new m57(iterable));
    }

    /* renamed from: K */
    public static s47 m47672K(g3e g3eVar) {
        if (g3eVar instanceof s47) {
            return fwe.m27593l((s47) g3eVar);
        }
        Objects.requireNonNull(g3eVar, "publisher is null");
        return fwe.m27593l(new o57(g3eVar));
    }

    /* renamed from: L */
    public static s47 m47673L(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return fwe.m27593l(new q57(obj));
    }

    /* renamed from: O */
    public static s47 m47674O(Iterable iterable) {
        return m47671J(iterable).m47684F(km7.m35918d());
    }

    /* renamed from: V */
    public static s47 m47675V(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i2);
        }
        if (i2 == 0) {
            return m47668C();
        }
        if (i2 == 1) {
            return m47673L(Integer.valueOf(i));
        }
        if (i + (i2 - 1) <= 2147483647L) {
            return fwe.m27593l(new a67(i, i2));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    /* renamed from: l */
    public static int m47676l() {
        return f44747a;
    }

    /* renamed from: p */
    public static s47 m47677p(g3e g3eVar, g3e g3eVar2) {
        Objects.requireNonNull(g3eVar, "source1 is null");
        Objects.requireNonNull(g3eVar2, "source2 is null");
        return m47678q(g3eVar, g3eVar2);
    }

    /* renamed from: q */
    public static s47 m47678q(g3e... g3eVarArr) {
        Objects.requireNonNull(g3eVarArr, "sources is null");
        return g3eVarArr.length == 0 ? m47668C() : g3eVarArr.length == 1 ? m47672K(g3eVarArr[0]) : fwe.m27593l(new x47(g3eVarArr, false));
    }

    /* renamed from: v */
    public static s47 m47679v(y57 y57Var, la1 la1Var) {
        Objects.requireNonNull(y57Var, "source is null");
        Objects.requireNonNull(la1Var, "mode is null");
        return fwe.m27593l(new a57(y57Var, la1Var));
    }

    /* renamed from: A */
    public final s47 m47680A(gu3 gu3Var) {
        return m47714y(gu3Var, km7.f32436g, km7.f32432c);
    }

    /* renamed from: B */
    public final g0b m47681B(long j) {
        if (j >= 0) {
            return fwe.m27594m(new f57(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    /* renamed from: D */
    public final s47 m47682D(ggd ggdVar) {
        Objects.requireNonNull(ggdVar, "predicate is null");
        return fwe.m27593l(new i57(this, ggdVar));
    }

    /* renamed from: E */
    public final g0b m47683E() {
        return m47681B(0L);
    }

    /* renamed from: F */
    public final s47 m47684F(rl7 rl7Var) {
        return m47685G(rl7Var, false, m47676l(), m47676l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public final s47 m47685G(rl7 rl7Var, boolean z, int i, int i2) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        k6c.m35038b(i, "maxConcurrency");
        k6c.m35038b(i2, "bufferSize");
        if (!(this instanceof k4f)) {
            return fwe.m27593l(new j57(this, rl7Var, z, i, i2));
        }
        Object obj = ((k4f) this).get();
        return obj == null ? m47668C() : d67.m22359a(obj, rl7Var);
    }

    /* renamed from: M */
    public final s47 m47686M(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27593l(new r57(this, rl7Var));
    }

    /* renamed from: N */
    public final s47 m47687N() {
        return fwe.m27593l(new s57(this));
    }

    /* renamed from: P */
    public final s47 m47688P(c5f c5fVar) {
        return m47689Q(c5fVar, false, m47676l());
    }

    /* renamed from: Q */
    public final s47 m47689Q(c5f c5fVar, boolean z, int i) {
        Objects.requireNonNull(c5fVar, "scheduler is null");
        k6c.m35038b(i, "bufferSize");
        return fwe.m27593l(new t57(this, c5fVar, z, i));
    }

    /* renamed from: R */
    public final s47 m47690R() {
        return m47691S(m47676l(), false, true);
    }

    /* renamed from: S */
    public final s47 m47691S(int i, boolean z, boolean z2) {
        k6c.m35038b(i, "capacity");
        return fwe.m27593l(new u57(this, i, z2, z, km7.f32432c));
    }

    /* renamed from: T */
    public final s47 m47692T() {
        return fwe.m27593l(new v57(this));
    }

    /* renamed from: U */
    public final s47 m47693U() {
        return fwe.m27593l(new x57(this));
    }

    /* renamed from: W */
    public final s47 m47694W(long j) {
        if (j >= 0) {
            return j == 0 ? m47668C() : fwe.m27593l(new b67(this, j));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    /* renamed from: X */
    public final s47 m47695X(long j, ggd ggdVar) {
        if (j >= 0) {
            Objects.requireNonNull(ggdVar, "predicate is null");
            return fwe.m27593l(new c67(this, j, ggdVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    /* renamed from: Y */
    public final wtf m47696Y() {
        return fwe.m27596o(new f67(this, null));
    }

    /* renamed from: Z */
    public final su5 m47697Z(gu3 gu3Var, gu3 gu3Var2) {
        return a0(gu3Var, gu3Var2, km7.f32432c);
    }

    @Override // p001o.g3e
    /* renamed from: a */
    public final void mo28025a(qag qagVar) {
        if (qagVar instanceof h67) {
            b0((h67) qagVar);
        } else {
            Objects.requireNonNull(qagVar, "subscriber is null");
            b0(new g8g(qagVar));
        }
    }

    public final su5 a0(gu3 gu3Var, gu3 gu3Var2, jm jmVar) {
        Objects.requireNonNull(gu3Var, "onNext is null");
        Objects.requireNonNull(gu3Var2, "onError is null");
        Objects.requireNonNull(jmVar, "onComplete is null");
        mf9 mf9Var = new mf9(gu3Var, gu3Var2, jmVar, p57.INSTANCE);
        b0(mf9Var);
        return mf9Var;
    }

    public final void b0(h67 h67Var) {
        Objects.requireNonNull(h67Var, "subscriber is null");
        try {
            qag qagVarM27579A = fwe.m27579A(this, h67Var);
            Objects.requireNonNull(qagVarM27579A, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            c0(qagVarM27579A);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            zk6.m59526b(th);
            fwe.m27599r(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public final Object m47698c() throws InterruptedException {
        rj1 rj1Var = new rj1();
        b0(rj1Var);
        Object objM40673a = rj1Var.m40673a();
        if (objM40673a != null) {
            return objM40673a;
        }
        throw new NoSuchElementException();
    }

    public abstract void c0(qag qagVar);

    /* renamed from: d */
    public final Object m47699d(Object obj) throws InterruptedException {
        Objects.requireNonNull(obj, "defaultItem is null");
        rj1 rj1Var = new rj1();
        b0(rj1Var);
        Object objM40673a = rj1Var.m40673a();
        return objM40673a != null ? objM40673a : obj;
    }

    public final s47 d0(c5f c5fVar) {
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return e0(c5fVar, !(this instanceof a57));
    }

    public final s47 e0(c5f c5fVar, boolean z) {
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27593l(new g67(this, c5fVar, z));
    }

    public final s47 f0(ggd ggdVar) {
        Objects.requireNonNull(ggdVar, "stopPredicate is null");
        return fwe.m27593l(new i67(this, ggdVar));
    }

    /* renamed from: g */
    public final void m47700g(gu3 gu3Var) {
        m47701h(gu3Var, m47676l());
    }

    public final wtf g0() {
        return fwe.m27596o(new k67(this));
    }

    /* renamed from: h */
    public final void m47701h(gu3 gu3Var, int i) {
        Objects.requireNonNull(gu3Var, "onNext is null");
        Iterator it = m47703j(i).iterator();
        while (it.hasNext()) {
            try {
                gu3Var.accept(it.next());
            } catch (Throwable th) {
                zk6.m59526b(th);
                ((su5) it).dispose();
                throw xk6.m56420h(th);
            }
        }
    }

    public final x6c h0() {
        return fwe.m27595n(new d8c(this));
    }

    /* renamed from: i */
    public final Iterable m47702i() {
        return m47703j(m47676l());
    }

    /* renamed from: j */
    public final Iterable m47703j(int i) {
        k6c.m35038b(i, "bufferSize");
        return new sj1(this, i);
    }

    /* renamed from: k */
    public final Object m47704k() {
        return m47696Y().m55012d();
    }

    /* renamed from: m */
    public final wtf m47705m(Collector collector) {
        Objects.requireNonNull(collector, "collector is null");
        return fwe.m27596o(new w47(this, collector));
    }

    /* renamed from: n */
    public final wtf m47706n(idg idgVar, eh1 eh1Var) {
        Objects.requireNonNull(idgVar, "initialItemSupplier is null");
        Objects.requireNonNull(eh1Var, "collector is null");
        return fwe.m27596o(new u47(this, idgVar, eh1Var));
    }

    /* renamed from: o */
    public final wtf m47707o(Object obj, eh1 eh1Var) {
        Objects.requireNonNull(obj, "initialItem is null");
        return m47706n(km7.m35919e(obj), eh1Var);
    }

    /* renamed from: r */
    public final s47 m47708r(rl7 rl7Var) {
        return m47709s(rl7Var, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public final s47 m47709s(rl7 rl7Var, int i) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        k6c.m35038b(i, "prefetch");
        if (!(this instanceof k4f)) {
            return fwe.m27593l(new y47(this, rl7Var, i, lj6.IMMEDIATE));
        }
        Object obj = ((k4f) this).get();
        return obj == null ? m47668C() : d67.m22359a(obj, rl7Var);
    }

    /* renamed from: t */
    public final xk3 m47710t(rl7 rl7Var) {
        return m47711u(rl7Var, 2);
    }

    /* renamed from: u */
    public final xk3 m47711u(rl7 rl7Var, int i) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        k6c.m35038b(i, "prefetch");
        return fwe.m27592k(new z47(this, rl7Var, lj6.IMMEDIATE, i));
    }

    /* renamed from: w */
    public final s47 m47712w(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "selector is null");
        return fwe.m27593l(new b57(this, rl7Var));
    }

    /* renamed from: x */
    public final s47 m47713x(gu3 gu3Var, gu3 gu3Var2, jm jmVar, jm jmVar2) {
        Objects.requireNonNull(gu3Var, "onNext is null");
        Objects.requireNonNull(gu3Var2, "onError is null");
        Objects.requireNonNull(jmVar, "onComplete is null");
        Objects.requireNonNull(jmVar2, "onAfterTerminate is null");
        return fwe.m27593l(new c57(this, gu3Var, gu3Var2, jmVar, jmVar2));
    }

    /* renamed from: y */
    public final s47 m47714y(gu3 gu3Var, ila ilaVar, jm jmVar) {
        Objects.requireNonNull(gu3Var, "onSubscribe is null");
        Objects.requireNonNull(ilaVar, "onRequest is null");
        Objects.requireNonNull(jmVar, "onCancel is null");
        return fwe.m27593l(new d57(this, gu3Var, ilaVar, jmVar));
    }

    /* renamed from: z */
    public final s47 m47715z(gu3 gu3Var) {
        gu3 gu3VarM35917c = km7.m35917c();
        jm jmVar = km7.f32432c;
        return m47713x(gu3Var, gu3VarM35917c, jmVar, jmVar);
    }
}

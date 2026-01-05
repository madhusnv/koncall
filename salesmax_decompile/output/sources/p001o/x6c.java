package p001o;

import com.google.android.gms.common.api.Api;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes6.dex */
public abstract class x6c implements x8c {

    /* renamed from: o.x6c$a */
    public static /* synthetic */ class C18063a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53267a;

        static {
            int[] iArr = new int[la1.values().length];
            f53267a = iArr;
            try {
                iArr[la1.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53267a[la1.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53267a[la1.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53267a[la1.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static x6c A0(long j, TimeUnit timeUnit) {
        return B0(j, timeUnit, i5f.m31597a());
    }

    public static x6c B0(long j, TimeUnit timeUnit, c5f c5fVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27595n(new a9c(Math.max(j, 0L), timeUnit, c5fVar));
    }

    /* renamed from: G */
    public static x6c m55693G() {
        return fwe.m27595n(r7c.f43117a);
    }

    public static x6c G0(x8c x8cVar) {
        Objects.requireNonNull(x8cVar, "source is null");
        return x8cVar instanceof x6c ? fwe.m27595n((x6c) x8cVar) : fwe.m27595n(new e8c(x8cVar));
    }

    /* renamed from: H */
    public static x6c m55694H(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return m55695I(km7.m35919e(th));
    }

    public static x6c H0(Iterable iterable, rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return fwe.m27595n(new d9c(null, iterable, rl7Var, m55703k(), false));
    }

    /* renamed from: I */
    public static x6c m55695I(idg idgVar) {
        Objects.requireNonNull(idgVar, "supplier is null");
        return fwe.m27595n(new s7c(idgVar));
    }

    public static x6c I0(x8c x8cVar, x8c x8cVar2, jh1 jh1Var) {
        Objects.requireNonNull(x8cVar, "source1 is null");
        Objects.requireNonNull(x8cVar2, "source2 is null");
        Objects.requireNonNull(jh1Var, "zipper is null");
        return J0(km7.m35921g(jh1Var), false, m55703k(), x8cVar, x8cVar2);
    }

    public static x6c J0(rl7 rl7Var, boolean z, int i, x8c... x8cVarArr) {
        Objects.requireNonNull(x8cVarArr, "sources is null");
        if (x8cVarArr.length == 0) {
            return m55693G();
        }
        Objects.requireNonNull(rl7Var, "zipper is null");
        k6c.m35038b(i, "bufferSize");
        return fwe.m27595n(new d9c(x8cVarArr, null, rl7Var, i, z));
    }

    /* renamed from: T */
    public static x6c m55696T(Object... objArr) {
        Objects.requireNonNull(objArr, "items is null");
        return objArr.length == 0 ? m55693G() : objArr.length == 1 ? c0(objArr[0]) : fwe.m27595n(new z7c(objArr));
    }

    /* renamed from: U */
    public static x6c m55697U(Callable callable) {
        Objects.requireNonNull(callable, "callable is null");
        return fwe.m27595n(new a8c(callable));
    }

    /* renamed from: V */
    public static x6c m55698V(Future future) {
        Objects.requireNonNull(future, "future is null");
        return fwe.m27595n(new b8c(future, 0L, null));
    }

    /* renamed from: W */
    public static x6c m55699W(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return fwe.m27595n(new c8c(iterable));
    }

    /* renamed from: X */
    public static x6c m55700X(Optional optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (x6c) optional.map(new Function() { // from class: o.t6c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x6c.c0(obj);
            }
        }).orElseGet(new Supplier() { // from class: o.u6c
            @Override // java.util.function.Supplier
            public final Object get() {
                return x6c.m55693G();
            }
        });
    }

    /* renamed from: Y */
    public static x6c m55701Y(xuf xufVar) {
        Objects.requireNonNull(xufVar, "source is null");
        return fwe.m27595n(new avf(xufVar));
    }

    /* renamed from: Z */
    public static x6c m55702Z(long j, long j2, TimeUnit timeUnit) {
        return a0(j, j2, timeUnit, i5f.m31597a());
    }

    public static x6c a0(long j, long j2, TimeUnit timeUnit, c5f c5fVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27595n(new f8c(Math.max(0L, j), Math.max(0L, j2), timeUnit, c5fVar));
    }

    public static x6c c0(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return fwe.m27595n(new g8c(obj));
    }

    public static x6c e0(Iterable iterable) {
        return m55699W(iterable).m55717M(km7.m35918d());
    }

    public static x6c f0(x8c x8cVar) {
        Objects.requireNonNull(x8cVar, "sources is null");
        return fwe.m27595n(new v7c(x8cVar, km7.m35918d(), false, Api.BaseClientBuilder.API_PRIORITY_OTHER, m55703k()));
    }

    public static x6c g0(x8c x8cVar, x8c x8cVar2) {
        Objects.requireNonNull(x8cVar, "source1 is null");
        Objects.requireNonNull(x8cVar2, "source2 is null");
        return m55696T(x8cVar, x8cVar2).m55719O(km7.m35918d(), false, 2);
    }

    /* renamed from: k */
    public static int m55703k() {
        return s47.m47676l();
    }

    public static x6c k0(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i2);
        }
        if (i2 == 0) {
            return m55693G();
        }
        if (i2 == 1) {
            return c0(Integer.valueOf(i));
        }
        if (i + (i2 - 1) <= 2147483647L) {
            return fwe.m27595n(new o8c(i, i2));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    /* renamed from: n */
    public static x6c m55704n(Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return m55699W(iterable).m55734p(km7.m35918d(), false, m55703k());
    }

    /* renamed from: o */
    public static x6c m55705o(x8c... x8cVarArr) {
        Objects.requireNonNull(x8cVarArr, "sources is null");
        return x8cVarArr.length == 0 ? m55693G() : x8cVarArr.length == 1 ? G0(x8cVarArr[0]) : fwe.m27595n(new f7c(m55696T(x8cVarArr), km7.m35918d(), m55703k(), lj6.BOUNDARY));
    }

    /* renamed from: q */
    public static x6c m55706q(m8c m8cVar) {
        Objects.requireNonNull(m8cVar, "source is null");
        return fwe.m27595n(new g7c(m8cVar));
    }

    /* renamed from: t */
    public static x6c m55707t(idg idgVar) {
        Objects.requireNonNull(idgVar, "supplier is null");
        return fwe.m27595n(new i7c(idgVar));
    }

    /* renamed from: A */
    public final x6c m55708A(gu3 gu3Var) {
        gu3 gu3VarM35917c = km7.m35917c();
        jm jmVar = km7.f32432c;
        return m55742z(gu3VarM35917c, gu3Var, jmVar, jmVar);
    }

    /* renamed from: B */
    public final x6c m55709B(gu3 gu3Var, jm jmVar) {
        Objects.requireNonNull(gu3Var, "onSubscribe is null");
        Objects.requireNonNull(jmVar, "onDispose is null");
        return fwe.m27595n(new m7c(this, gu3Var, jmVar));
    }

    /* renamed from: C */
    public final x6c m55710C(gu3 gu3Var) {
        gu3 gu3VarM35917c = km7.m35917c();
        jm jmVar = km7.f32432c;
        return m55742z(gu3Var, gu3VarM35917c, jmVar, jmVar);
    }

    public final s47 C0(la1 la1Var) {
        Objects.requireNonNull(la1Var, "strategy is null");
        n57 n57Var = new n57(this);
        int i = C18063a.f53267a[la1Var.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? n57Var.m47690R() : fwe.m27593l(new w57(n57Var)) : n57Var : n57Var.m47693U() : n57Var.m47692T();
    }

    /* renamed from: D */
    public final x6c m55711D(gu3 gu3Var) {
        return m55709B(gu3Var, km7.f32432c);
    }

    public final wtf D0() {
        return E0(16);
    }

    /* renamed from: E */
    public final g0b m55712E(long j) {
        if (j >= 0) {
            return fwe.m27594m(new o7c(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    public final wtf E0(int i) {
        k6c.m35038b(i, "capacityHint");
        return fwe.m27596o(new c9c(this, i));
    }

    /* renamed from: F */
    public final wtf m55713F(long j) {
        if (j >= 0) {
            return fwe.m27596o(new p7c(this, j, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    public final wtf F0(rl7 rl7Var, rl7 rl7Var2) {
        Objects.requireNonNull(rl7Var, "keySelector is null");
        Objects.requireNonNull(rl7Var2, "valueSelector is null");
        return m55732l(cx7.asSupplier(), km7.m35922h(rl7Var, rl7Var2));
    }

    /* renamed from: J */
    public final x6c m55714J(ggd ggdVar) {
        Objects.requireNonNull(ggdVar, "predicate is null");
        return fwe.m27595n(new u7c(this, ggdVar));
    }

    /* renamed from: K */
    public final g0b m55715K() {
        return m55712E(0L);
    }

    public final x6c K0(x8c x8cVar, jh1 jh1Var) {
        Objects.requireNonNull(x8cVar, "other is null");
        return I0(this, x8cVar, jh1Var);
    }

    /* renamed from: L */
    public final wtf m55716L() {
        return m55713F(0L);
    }

    /* renamed from: M */
    public final x6c m55717M(rl7 rl7Var) {
        return m55718N(rl7Var, false);
    }

    /* renamed from: N */
    public final x6c m55718N(rl7 rl7Var, boolean z) {
        return m55719O(rl7Var, z, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: O */
    public final x6c m55719O(rl7 rl7Var, boolean z, int i) {
        return m55720P(rl7Var, z, i, m55703k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public final x6c m55720P(rl7 rl7Var, boolean z, int i, int i2) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        k6c.m35038b(i, "maxConcurrency");
        k6c.m35038b(i2, "bufferSize");
        if (!(this instanceof k4f)) {
            return fwe.m27595n(new v7c(this, rl7Var, z, i, i2));
        }
        Object obj = ((k4f) this).get();
        return obj == null ? m55693G() : t8c.m49562a(obj, rl7Var);
    }

    /* renamed from: Q */
    public final xk3 m55721Q(rl7 rl7Var) {
        return m55722R(rl7Var, false);
    }

    /* renamed from: R */
    public final xk3 m55722R(rl7 rl7Var, boolean z) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27592k(new x7c(this, rl7Var, z));
    }

    /* renamed from: S */
    public final x6c m55723S(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27595n(new y7c(this, rl7Var));
    }

    @Override // p001o.x8c
    /* renamed from: b */
    public final void mo55724b(m9c m9cVar) {
        Objects.requireNonNull(m9cVar, "observer is null");
        try {
            m9c m9cVarM27606y = fwe.m27606y(this, m9cVar);
            Objects.requireNonNull(m9cVarM27606y, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            x0(m9cVarM27606y);
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

    public final wtf b0() {
        return m55725c(km7.m35915a());
    }

    /* renamed from: c */
    public final wtf m55725c(ggd ggdVar) {
        Objects.requireNonNull(ggdVar, "predicate is null");
        return fwe.m27596o(new z6c(this, ggdVar));
    }

    /* renamed from: d */
    public final wtf m55726d(ggd ggdVar) {
        Objects.requireNonNull(ggdVar, "predicate is null");
        return fwe.m27596o(new b7c(this, ggdVar));
    }

    public final x6c d0(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        return fwe.m27595n(new j8c(this, rl7Var));
    }

    /* renamed from: f */
    public final Object m55727f() {
        qj1 qj1Var = new qj1();
        mo55724b(qj1Var);
        Object objM39177b = qj1Var.m39177b();
        if (objM39177b != null) {
            return objM39177b;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: g */
    public final Object m55728g() throws InterruptedException {
        uj1 uj1Var = new uj1();
        mo55724b(uj1Var);
        Object objM39177b = uj1Var.m39177b();
        if (objM39177b != null) {
            return objM39177b;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: h */
    public final Object m55729h() {
        Object objM27840d = q0().m27840d();
        if (objM27840d != null) {
            return objM27840d;
        }
        throw new NoSuchElementException();
    }

    public final x6c h0(c5f c5fVar) {
        return i0(c5fVar, false, m55703k());
    }

    /* renamed from: i */
    public final void m55730i(gu3 gu3Var, gu3 gu3Var2) {
        c7c.m20374a(this, gu3Var, gu3Var2, km7.f32432c);
    }

    public final x6c i0(c5f c5fVar, boolean z, int i) {
        Objects.requireNonNull(c5fVar, "scheduler is null");
        k6c.m35038b(i, "bufferSize");
        return fwe.m27595n(new k8c(this, c5fVar, z, i));
    }

    /* renamed from: j */
    public final void m55731j(gu3 gu3Var, gu3 gu3Var2, jm jmVar) {
        c7c.m20374a(this, gu3Var, gu3Var2, jmVar);
    }

    public final x6c j0(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "itemSupplier is null");
        return fwe.m27595n(new l8c(this, rl7Var));
    }

    /* renamed from: l */
    public final wtf m55732l(idg idgVar, eh1 eh1Var) {
        Objects.requireNonNull(idgVar, "initialItemSupplier is null");
        Objects.requireNonNull(eh1Var, "collector is null");
        return fwe.m27596o(new e7c(this, idgVar, eh1Var));
    }

    public final wtf l0(Object obj, jh1 jh1Var) {
        Objects.requireNonNull(obj, "seed is null");
        Objects.requireNonNull(jh1Var, "reducer is null");
        return fwe.m27596o(new p8c(this, obj, jh1Var));
    }

    /* renamed from: m */
    public final wtf m55733m(Object obj, eh1 eh1Var) {
        Objects.requireNonNull(obj, "initialItem is null");
        return m55732l(km7.m35919e(obj), eh1Var);
    }

    public final x6c m0(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "handler is null");
        return fwe.m27595n(new r8c(this, rl7Var));
    }

    public final x6c n0(long j, TimeUnit timeUnit) {
        return o0(j, timeUnit, i5f.m31597a());
    }

    public final x6c o0(long j, TimeUnit timeUnit, c5f c5fVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27595n(new s8c(this, j, timeUnit, c5fVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final x6c m55734p(rl7 rl7Var, boolean z, int i) {
        Objects.requireNonNull(rl7Var, "mapper is null");
        k6c.m35038b(i, "bufferSize");
        if (!(this instanceof k4f)) {
            return fwe.m27595n(new f7c(this, rl7Var, i, z ? lj6.END : lj6.BOUNDARY));
        }
        Object obj = ((k4f) this).get();
        return obj == null ? m55693G() : t8c.m49562a(obj, rl7Var);
    }

    public final wtf p0(Object obj) {
        Objects.requireNonNull(obj, "defaultItem is null");
        return fwe.m27596o(new v8c(this, obj));
    }

    public final g0b q0() {
        return fwe.m27594m(new u8c(this));
    }

    /* renamed from: r */
    public final x6c m55735r(long j, TimeUnit timeUnit) {
        return m55736s(j, timeUnit, i5f.m31597a());
    }

    public final x6c r0(long j) {
        if (j >= 0) {
            return j == 0 ? fwe.m27595n(this) : fwe.m27595n(new w8c(this, j));
        }
        throw new IllegalArgumentException("count >= 0 expected but it was " + j);
    }

    /* renamed from: s */
    public final x6c m55736s(long j, TimeUnit timeUnit, c5f c5fVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27595n(new h7c(this, j, timeUnit, c5fVar));
    }

    public final x6c s0(Comparator comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return D0().m55027y().d0(km7.m35920f(comparator)).m55723S(km7.m35918d());
    }

    public final x6c t0(Object obj) {
        return m55705o(c0(obj), this);
    }

    /* renamed from: u */
    public final x6c m55737u() {
        return m55738v(km7.m35918d());
    }

    public final su5 u0(gu3 gu3Var) {
        return w0(gu3Var, km7.f32435f, km7.f32432c);
    }

    /* renamed from: v */
    public final x6c m55738v(rl7 rl7Var) {
        Objects.requireNonNull(rl7Var, "keySelector is null");
        return fwe.m27595n(new j7c(this, rl7Var, k6c.m35037a()));
    }

    public final su5 v0(gu3 gu3Var, gu3 gu3Var2) {
        return w0(gu3Var, gu3Var2, km7.f32432c);
    }

    /* renamed from: w */
    public final x6c m55739w(jm jmVar) {
        Objects.requireNonNull(jmVar, "onFinally is null");
        return fwe.m27595n(new k7c(this, jmVar));
    }

    public final su5 w0(gu3 gu3Var, gu3 gu3Var2, jm jmVar) {
        Objects.requireNonNull(gu3Var, "onNext is null");
        Objects.requireNonNull(gu3Var2, "onError is null");
        Objects.requireNonNull(jmVar, "onComplete is null");
        lf9 lf9Var = new lf9(gu3Var, gu3Var2, jmVar, km7.m35917c());
        mo55724b(lf9Var);
        return lf9Var;
    }

    /* renamed from: x */
    public final x6c m55740x(jm jmVar) {
        return m55742z(km7.m35917c(), km7.m35917c(), jmVar, km7.f32432c);
    }

    public abstract void x0(m9c m9cVar);

    /* renamed from: y */
    public final x6c m55741y(jm jmVar) {
        return m55709B(km7.m35917c(), jmVar);
    }

    public final x6c y0(c5f c5fVar) {
        Objects.requireNonNull(c5fVar, "scheduler is null");
        return fwe.m27595n(new y8c(this, c5fVar));
    }

    /* renamed from: z */
    public final x6c m55742z(gu3 gu3Var, gu3 gu3Var2, jm jmVar, jm jmVar2) {
        Objects.requireNonNull(gu3Var, "onNext is null");
        Objects.requireNonNull(gu3Var2, "onError is null");
        Objects.requireNonNull(jmVar, "onComplete is null");
        Objects.requireNonNull(jmVar2, "onAfterTerminate is null");
        return fwe.m27595n(new l7c(this, gu3Var, gu3Var2, jmVar, jmVar2));
    }

    public final x6c z0(x8c x8cVar) {
        Objects.requireNonNull(x8cVar, "other is null");
        return fwe.m27595n(new z8c(this, x8cVar));
    }
}

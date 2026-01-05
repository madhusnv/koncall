package p001o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public abstract class km7 {

    /* renamed from: a */
    public static final rl7 f32430a = new C14877i();

    /* renamed from: b */
    public static final Runnable f32431b = new RunnableC14874f();

    /* renamed from: c */
    public static final jm f32432c = new C14871c();

    /* renamed from: d */
    public static final gu3 f32433d = new C14872d();

    /* renamed from: e */
    public static final gu3 f32434e = new C14875g();

    /* renamed from: f */
    public static final gu3 f32435f = new C14882n();

    /* renamed from: g */
    public static final ila f32436g = new C14873e();

    /* renamed from: h */
    public static final ggd f32437h = new C14884p();

    /* renamed from: i */
    public static final ggd f32438i = new C14876h();

    /* renamed from: j */
    public static final idg f32439j = new C14881m();

    /* renamed from: k */
    public static final gu3 f32440k = new C14880l();

    /* renamed from: o.km7$a */
    public static final class C14869a implements rl7 {

        /* renamed from: a */
        public final jh1 f32441a;

        public C14869a(jh1 jh1Var) {
            this.f32441a = jh1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f32441a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: o.km7$b */
    public static final class C14870b implements idg {

        /* renamed from: a */
        public final int f32442a;

        public C14870b(int i) {
            this.f32442a = i;
        }

        @Override // p001o.idg
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f32442a);
        }
    }

    /* renamed from: o.km7$c */
    public static final class C14871c implements jm {
        @Override // p001o.jm
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: o.km7$d */
    public static final class C14872d implements gu3 {
        @Override // p001o.gu3
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: o.km7$e */
    public static final class C14873e implements ila {
        @Override // p001o.ila
        public void accept(long j) {
        }
    }

    /* renamed from: o.km7$f */
    public static final class RunnableC14874f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: o.km7$g */
    public static final class C14875g implements gu3 {
        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            fwe.m27599r(th);
        }
    }

    /* renamed from: o.km7$h */
    public static final class C14876h implements ggd {
        @Override // p001o.ggd
        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: o.km7$i */
    public static final class C14877i implements rl7 {
        @Override // p001o.rl7
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: o.km7$j */
    public static final class CallableC14878j implements Callable, idg, rl7 {

        /* renamed from: a */
        public final Object f32443a;

        public CallableC14878j(Object obj) {
            this.f32443a = obj;
        }

        @Override // p001o.rl7
        public Object apply(Object obj) {
            return this.f32443a;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return this.f32443a;
        }

        @Override // p001o.idg
        public Object get() {
            return this.f32443a;
        }
    }

    /* renamed from: o.km7$k */
    public static final class C14879k implements rl7 {

        /* renamed from: a */
        public final Comparator f32444a;

        public C14879k(Comparator comparator) {
            this.f32444a = comparator;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List apply(List list) {
            Collections.sort(list, this.f32444a);
            return list;
        }
    }

    /* renamed from: o.km7$l */
    public static final class C14880l implements gu3 {
        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(rag ragVar) {
            ragVar.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: o.km7$m */
    public static final class C14881m implements idg {
        @Override // p001o.idg
        public Object get() {
            return null;
        }
    }

    /* renamed from: o.km7$n */
    public static final class C14882n implements gu3 {
        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            fwe.m27599r(new pbc(th));
        }
    }

    /* renamed from: o.km7$o */
    public static final class C14883o implements eh1 {

        /* renamed from: a */
        public final rl7 f32445a;

        /* renamed from: b */
        public final rl7 f32446b;

        public C14883o(rl7 rl7Var, rl7 rl7Var2) {
            this.f32445a = rl7Var;
            this.f32446b = rl7Var2;
        }

        @Override // p001o.eh1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map map, Object obj) {
            map.put(this.f32446b.apply(obj), this.f32445a.apply(obj));
        }
    }

    /* renamed from: o.km7$p */
    public static final class C14884p implements ggd {
        @Override // p001o.ggd
        public boolean test(Object obj) {
            return true;
        }
    }

    /* renamed from: a */
    public static ggd m35915a() {
        return f32438i;
    }

    /* renamed from: b */
    public static idg m35916b(int i) {
        return new C14870b(i);
    }

    /* renamed from: c */
    public static gu3 m35917c() {
        return f32433d;
    }

    /* renamed from: d */
    public static rl7 m35918d() {
        return f32430a;
    }

    /* renamed from: e */
    public static idg m35919e(Object obj) {
        return new CallableC14878j(obj);
    }

    /* renamed from: f */
    public static rl7 m35920f(Comparator comparator) {
        return new C14879k(comparator);
    }

    /* renamed from: g */
    public static rl7 m35921g(jh1 jh1Var) {
        return new C14869a(jh1Var);
    }

    /* renamed from: h */
    public static eh1 m35922h(rl7 rl7Var, rl7 rl7Var2) {
        return new C14883o(rl7Var2, rl7Var);
    }
}

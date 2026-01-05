package p001o;

/* loaded from: classes3.dex */
public final class wj6 {

    /* renamed from: c */
    public static final C17921a f52226c = new C17921a(null);

    /* renamed from: a */
    public final ob9 f52227a;

    /* renamed from: b */
    public final xk7 f52228b;

    /* renamed from: o.wj6$a */
    public static final class C17921a {
        public C17921a() {
        }

        public /* synthetic */ C17921a(id5 id5Var) {
            this();
        }
    }

    public wj6(ob9 ob9Var, xk7 xk7Var) {
        sq8.m48649h(ob9Var, "clazz");
        sq8.m48649h(xk7Var, "evaluator");
        this.f52227a = ob9Var;
        this.f52228b = xk7Var;
    }

    /* renamed from: a */
    public final ese m54621a(Throwable th) {
        sq8.m48649h(th, "ex");
        Throwable th2 = (Throwable) pb9.m43301a(this.f52227a, th);
        if (th2 != null) {
            return (ese) this.f52228b.invoke(th2);
        }
        return null;
    }
}

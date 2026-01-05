package p001o;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class pb7 {

    /* renamed from: c */
    public static final C16046a f39770c = new C16046a(null);

    /* renamed from: d */
    public static final qb7 f39771d = new qb7();

    /* renamed from: e */
    public static final CoroutineExceptionHandler f39772e = new C16047b(CoroutineExceptionHandler.f13954j);

    /* renamed from: a */
    public final bs0 f39773a;

    /* renamed from: b */
    public h84 f39774b;

    /* renamed from: o.pb7$a */
    public static final class C16046a {
        public C16046a() {
        }

        public /* synthetic */ C16046a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.pb7$b */
    public static final class C16047b extends i7 implements CoroutineExceptionHandler {
        public C16047b(CoroutineExceptionHandler.C11950a c11950a) {
            super(c11950a);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: Y */
        public void mo16249Y(q74 q74Var, Throwable th) {
        }
    }

    public pb7(bs0 bs0Var, q74 q74Var) {
        sq8.m48649h(bs0Var, "asyncTypefaceCache");
        sq8.m48649h(q74Var, "injectedContext");
        this.f39773a = bs0Var;
        this.f39774b = i84.m31707a(f39772e.plus(q74Var).plus(gdg.m28504a((p69) q74Var.get(p69.f39399t))));
    }

    /* renamed from: a */
    public rzh m43300a(pzh pzhVar, h9d h9dVar, xk7 xk7Var, xk7 xk7Var2) {
        sq8.m48649h(pzhVar, "typefaceRequest");
        sq8.m48649h(h9dVar, "platformFontLoader");
        sq8.m48649h(xk7Var, "onAsyncCompletion");
        sq8.m48649h(xk7Var2, "createDefaultTypeface");
        pzhVar.m44570c();
        return null;
    }

    public /* synthetic */ pb7(bs0 bs0Var, q74 q74Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? new bs0() : bs0Var, (i & 2) != 0 ? e66.f21035a : q74Var);
    }
}

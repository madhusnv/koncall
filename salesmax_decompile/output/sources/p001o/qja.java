package p001o;

/* loaded from: classes3.dex */
public interface qja {

    /* renamed from: a */
    public static final C16413a f42071a = C16413a.f42072a;

    /* renamed from: o.qja$a */
    public static final class C16413a {

        /* renamed from: a */
        public static final /* synthetic */ C16413a f42072a = new C16413a();

        /* renamed from: b */
        public static final qja f42073b = new a();

        /* renamed from: o.qja$a$a */
        public static final class a extends i8 {
        }

        /* renamed from: a */
        public final qja m45547a() {
            return f42073b;
        }
    }

    /* renamed from: o.qja$b */
    public static final class C16414b {
        /* renamed from: a */
        public static /* synthetic */ void m45548a(qja qjaVar, Throwable th, uk7 uk7Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            qjaVar.mo18187d(th, uk7Var);
        }

        /* renamed from: b */
        public static /* synthetic */ void m45549b(qja qjaVar, Throwable th, uk7 uk7Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            qjaVar.mo18185b(th, uk7Var);
        }

        /* renamed from: c */
        public static /* synthetic */ void m45550c(qja qjaVar, Throwable th, uk7 uk7Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            qjaVar.mo18189f(th, uk7Var);
        }

        /* renamed from: d */
        public static /* synthetic */ void m45551d(qja qjaVar, Throwable th, uk7 uk7Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            qjaVar.mo18186c(th, uk7Var);
        }
    }

    /* renamed from: a */
    hja mo18184a(fja fjaVar);

    /* renamed from: b */
    void mo18185b(Throwable th, uk7 uk7Var);

    /* renamed from: c */
    void mo18186c(Throwable th, uk7 uk7Var);

    /* renamed from: d */
    void mo18187d(Throwable th, uk7 uk7Var);

    /* renamed from: e */
    boolean mo18188e(fja fjaVar);

    /* renamed from: f */
    void mo18189f(Throwable th, uk7 uk7Var);
}

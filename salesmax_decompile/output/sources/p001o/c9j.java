package p001o;

import android.app.Activity;
import p001o.c9j;

/* loaded from: classes2.dex */
public final class c9j implements a9j {

    /* renamed from: d */
    public static final C12596a f17568d = new C12596a(null);

    /* renamed from: b */
    public final vaj f17569b;

    /* renamed from: c */
    public final u8j f17570c;

    /* renamed from: o.c9j$a */
    public static final class C12596a {
        public C12596a() {
        }

        public /* synthetic */ C12596a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.c9j$b */
    public static final class C12597b extends jgg implements nl7 {

        /* renamed from: a */
        public Object f17571a;

        /* renamed from: b */
        public Object f17572b;

        /* renamed from: c */
        public int f17573c;

        /* renamed from: d */
        public /* synthetic */ Object f17574d;

        /* renamed from: f */
        public final /* synthetic */ Activity f17576f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12597b(Activity activity, n64 n64Var) {
            super(2, n64Var);
            this.f17576f = activity;
        }

        /* renamed from: g */
        public static final void m20543g(jg2 jg2Var, taj tajVar) {
            sq8.m48648g(tajVar, "info");
            jg2Var.mo23472g(tajVar);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12597b c12597b = c9j.this.new C12597b(this.f17576f, n64Var);
            c12597b.f17574d = obj;
            return c12597b;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:17:0x0064, B:21:0x0076, B:23:0x007e), top: B:35:0x0064 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:35:0x0064). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C12597b c12597b;
            z37 z37Var;
            hu3 hu3Var;
            sg2 it;
            Object objMo23482a;
            Object objM51918f = uq8.m51918f();
            int i = this.f17573c;
            try {
                try {
                    if (i == 0) {
                        wre.m54934b(obj);
                        z37Var = (z37) this.f17574d;
                        final jg2 jg2VarM49824b = tg2.m49824b(10, wl1.DROP_OLDEST, null, 4, null);
                        hu3Var = new hu3() { // from class: o.d9j
                            @Override // p001o.hu3
                            public final void accept(Object obj2) {
                                c9j.C12597b.m20543g(jg2VarM49824b, (taj) obj2);
                            }
                        };
                        c9j.this.f17570c.mo34398a(this.f17576f, new ab4(), hu3Var);
                        it = jg2VarM49824b.iterator();
                    } else if (i == 1) {
                        it = (sg2) this.f17572b;
                        hu3Var = (hu3) this.f17571a;
                        z37 z37Var2 = (z37) this.f17574d;
                        wre.m54934b(obj);
                        z37 z37Var3 = z37Var2;
                        c12597b = this;
                        if (!((Boolean) obj).booleanValue()) {
                            taj tajVar = (taj) it.next();
                            c12597b.f17574d = z37Var3;
                            c12597b.f17571a = hu3Var;
                            c12597b.f17572b = it;
                            c12597b.f17573c = 2;
                            if (z37Var3.emit(tajVar, c12597b) == objM51918f) {
                                return objM51918f;
                            }
                            z37Var = z37Var3;
                            c12597b.f17574d = z37Var;
                            c12597b.f17571a = hu3Var;
                            c12597b.f17572b = it;
                            c12597b.f17573c = 1;
                            objMo23482a = it.mo23482a(c12597b);
                            if (objMo23482a != objM51918f) {
                                return objM51918f;
                            }
                            z37Var3 = z37Var;
                            obj = objMo23482a;
                            if (!((Boolean) obj).booleanValue()) {
                                c9j.this.f17570c.mo34399b(hu3Var);
                                return y3i.f54824a;
                            }
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (sg2) this.f17572b;
                        hu3Var = (hu3) this.f17571a;
                        z37 z37Var4 = (z37) this.f17574d;
                        wre.m54934b(obj);
                        z37Var = z37Var4;
                    }
                    c12597b.f17574d = z37Var;
                    c12597b.f17571a = hu3Var;
                    c12597b.f17572b = it;
                    c12597b.f17573c = 1;
                    objMo23482a = it.mo23482a(c12597b);
                    if (objMo23482a != objM51918f) {
                    }
                } catch (Throwable th) {
                    th = th;
                    c9j.this.f17570c.mo34399b(hu3Var);
                    throw th;
                }
                c12597b = this;
            } catch (Throwable th2) {
                th = th2;
                c12597b = this;
            }
        }

        @Override // p001o.nl7
        public final Object invoke(z37 z37Var, n64 n64Var) {
            return ((C12597b) create(z37Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public c9j(vaj vajVar, u8j u8jVar) {
        sq8.m48649h(vajVar, "windowMetricsCalculator");
        sq8.m48649h(u8jVar, "windowBackend");
        this.f17569b = vajVar;
        this.f17570c = u8jVar;
    }

    @Override // p001o.a9j
    /* renamed from: b */
    public v37 mo16704b(Activity activity) {
        sq8.m48649h(activity, "activity");
        return e47.m24281o(new C12597b(activity, null));
    }
}

package p001o;

import ai.salesmax.model.LeadsSummary;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;
import p001o.bs1;
import p001o.pu3;

/* loaded from: classes.dex */
public final class pu3 implements kha {

    /* renamed from: b */
    public static final C16191a f40574b = new C16191a(null);

    /* renamed from: c */
    public static final int f40575c = 8;

    /* renamed from: d */
    public static final pu3 f40576d = new pu3();

    /* renamed from: e */
    public static final dkf f40577e = dkf.f20145a.m23376a();

    /* renamed from: a */
    public final cha f40578a;

    /* renamed from: o.pu3$a */
    public static final class C16191a {
        public C16191a() {
        }

        public /* synthetic */ C16191a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final kha m44184a() {
            return m44185b();
        }

        /* renamed from: b */
        public final pu3 m44185b() {
            return pu3.f40576d;
        }
    }

    /* renamed from: o.pu3$b */
    public static final class C16192b extends cs1 {
        public C16192b() {
        }

        /* renamed from: g */
        public static final bs1 m44188g(pu3 pu3Var, String str, bs1 bs1Var) {
            sq8.m48649h(pu3Var, "this$0");
            sq8.m48649h(str, "$key");
            sq8.m48649h(bs1Var, "$oldValue");
            return pu3Var.m44181j(str, bs1Var);
        }

        /* renamed from: h */
        public static final bs1 m44189h(bs1 bs1Var) {
            sq8.m48649h(bs1Var, "$oldValue");
            return bs1Var;
        }

        @Override // p001o.cs1
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public bs1 mo21693a(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return pu3.m44178k(pu3.this, str, null, 2, null);
        }

        @Override // p001o.cs1
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public zfa mo21694b(String str, final bs1 bs1Var) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(bs1Var, "oldValue");
            zfa zfaVarM21445c = cn7.m21445c(ayh.H1(new qu3(pu3.this, str, bs1Var)).B2(new Supplier() { // from class: o.ru3
                @Override // java.util.function.Supplier
                public final Object get() {
                    return pu3.C16192b.m44189h(bs1Var);
                }
            }));
            sq8.m48646e(zfaVarM21445c);
            return zfaVarM21445c;
        }
    }

    /* renamed from: o.pu3$c */
    public static final class C16193c extends jgg implements nl7 {

        /* renamed from: a */
        public int f40580a;

        /* renamed from: b */
        public final /* synthetic */ Callable f40581b;

        /* renamed from: c */
        public final /* synthetic */ pu3 f40582c;

        /* renamed from: d */
        public final /* synthetic */ String f40583d;

        /* renamed from: o.pu3$c$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f40584a;

            /* renamed from: b */
            public /* synthetic */ Object f40585b;

            /* renamed from: c */
            public final /* synthetic */ Callable f40586c;

            /* renamed from: d */
            public final /* synthetic */ pu3 f40587d;

            /* renamed from: e */
            public final /* synthetic */ String f40588e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Callable callable, pu3 pu3Var, String str, n64 n64Var) {
                super(2, n64Var);
                this.f40586c = callable;
                this.f40587d = pu3Var;
                this.f40588e = str;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                a aVar = new a(this.f40586c, this.f40587d, this.f40588e, n64Var);
                aVar.f40585b = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // p001o.vb1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                bs1 bs1Var;
                uq8.m51918f();
                if (this.f40584a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                Callable callable = this.f40586c;
                if (callable != null) {
                    pu3 pu3Var = this.f40587d;
                    bs1Var = (bs1) pu3Var.f40578a.mo30508c(this.f40588e, callable);
                    if (bs1Var == null) {
                        pu3 pu3Var2 = this.f40587d;
                        bs1Var = (bs1) pu3Var2.f40578a.get(this.f40588e);
                    }
                }
                return new vw9(bs1Var.m19669b(), bs1Var.m19672e(), bs1Var.m19670c(), bs1Var.m19668a());
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16193c(Callable callable, pu3 pu3Var, String str, n64 n64Var) {
            super(2, n64Var);
            this.f40581b = callable;
            this.f40582c = pu3Var;
            this.f40583d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C16193c(this.f40581b, this.f40582c, this.f40583d, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f40580a;
            if (i == 0) {
                wre.m54934b(obj);
                z74 z74VarM25611b = eu5.m25611b();
                a aVar = new a(this.f40581b, this.f40582c, this.f40583d, null);
                this.f40580a = 1;
                obj = pm1.m43867g(z74VarM25611b, aVar, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16193c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.pu3$d */
    public static final class C16194d implements rl7 {

        /* renamed from: a */
        public static final C16194d f40589a = new C16194d();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional apply(LeadsSummary leadsSummary) {
            sq8.m48649h(leadsSummary, "it");
            return Optional.ofNullable(leadsSummary);
        }
    }

    public pu3() {
        cha chaVarM53305b = vr1.m53298y().m53326w(1000L).m53305b(new C16192b());
        sq8.m48648g(chaVarM53305b, "build(...)");
        this.f40578a = chaVarM53305b;
    }

    /* renamed from: k */
    public static /* synthetic */ bs1 m44178k(pu3 pu3Var, String str, bs1 bs1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            bs1Var = null;
        }
        return pu3Var.m44181j(str, bs1Var);
    }

    @Override // p001o.kha
    /* renamed from: a */
    public boolean mo26399a(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        bs1 bs1Var = (bs1) this.f40578a.mo30511g(str);
        return (bs1Var != null && bs1Var.m19673f()) && bs1Var.m19668a() != null;
    }

    @Override // p001o.kha
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public vw9 mo26400c(String str, Callable callable) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        StringBuilder sb = new StringBuilder();
        sb.append("Request to load lead for key: ");
        sb.append(str);
        return (vw9) qm1.m45641b(null, new C16193c(callable, this, str, null), 1, null);
    }

    @Override // p001o.kha
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo26401d(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f40578a.mo30509d(str);
    }

    /* renamed from: j */
    public final bs1 m44181j(String str, bs1 bs1Var) {
        Long lM19671d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        bs1.C12483a c12483a = new bs1.C12483a();
        if ((jCurrentTimeMillis - ((bs1Var == null || (lM19671d = bs1Var.m19671d()) == null) ? jCurrentTimeMillis : lM19671d.longValue())) - f40577e.m23373e(sif.CONTACT_CACHE_REFRESH_DELAY) <= 0) {
            boolean z = false;
            if (bs1Var != null && bs1Var.m19673f()) {
                z = true;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Retaining stale data to early to refresh: ");
                sb.append(str);
                return c12483a.m19676b(bs1Var.m19668a(), bs1Var.m19671d()).m19675a();
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading  fresh data for: ");
        sb2.append(str);
        try {
            Object objM55729h = lw9.f1(str).d0(C16194d.f40589a).z0(x6c.c0(Optional.empty())).m55729h();
            sq8.m48648g(objM55729h, "blockingSingle(...)");
            Optional optional = (Optional) objM55729h;
            if (!optional.isPresent()) {
                optional = null;
            }
            if (optional != null) {
                bs1.C12483a.m19674c(c12483a, (LeadsSummary) optional.get(), null, 2, null);
            }
        } catch (Throwable th) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception in loading lead with number ");
            sb3.append(str);
            if (th instanceof pv5) {
                c12483a.m19677d(Boolean.TRUE);
            } else {
                c12483a.m19678e(Boolean.TRUE);
                if (bs1Var != null) {
                    c12483a.m19676b(bs1Var.m19668a(), bs1Var.m19671d());
                    c12483a.m19677d(Boolean.valueOf(bs1Var.m19669b()));
                }
            }
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("TIme taken to fetch data: ");
        sb4.append(jCurrentTimeMillis3);
        return c12483a.m19675a();
    }

    /* renamed from: l */
    public final void m44182l(String str, bs1 bs1Var) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(bs1Var, "cacheLeadSummary");
        this.f40578a.put(str, bs1Var);
    }

    @Override // p001o.kha
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo26402e(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f40578a.mo21259e(str);
    }
}

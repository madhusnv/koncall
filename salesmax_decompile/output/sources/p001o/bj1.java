package p001o;

import p001o.p69;

/* loaded from: classes2.dex */
public final class bj1 {

    /* renamed from: a */
    public final d84 f16418a;

    /* renamed from: b */
    public final nl7 f16419b;

    /* renamed from: c */
    public final long f16420c;

    /* renamed from: d */
    public final h84 f16421d;

    /* renamed from: e */
    public final uk7 f16422e;

    /* renamed from: f */
    public p69 f16423f;

    /* renamed from: g */
    public p69 f16424g;

    /* renamed from: o.bj1$a */
    public static final class C12439a extends jgg implements nl7 {

        /* renamed from: a */
        public int f16425a;

        public C12439a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return bj1.this.new C12439a(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f16425a;
            if (i == 0) {
                wre.m54934b(obj);
                long j = bj1.this.f16420c;
                this.f16425a = 1;
                if (nk5.m40720b(j, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            if (!bj1.this.f16418a.hasActiveObservers()) {
                p69 p69Var = bj1.this.f16423f;
                if (p69Var != null) {
                    p69.C15966a.m42999a(p69Var, null, 1, null);
                }
                bj1.this.f16423f = null;
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C12439a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.bj1$b */
    public static final class C12440b extends jgg implements nl7 {

        /* renamed from: a */
        public int f16427a;

        /* renamed from: b */
        public /* synthetic */ Object f16428b;

        public C12440b(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12440b c12440b = bj1.this.new C12440b(n64Var);
            c12440b.f16428b = obj;
            return c12440b;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f16427a;
            if (i == 0) {
                wre.m54934b(obj);
                pga pgaVar = new pga(bj1.this.f16418a, ((h84) this.f16428b).mo6529D());
                nl7 nl7Var = bj1.this.f16419b;
                this.f16427a = 1;
                if (nl7Var.invoke(pgaVar, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            bj1.this.f16422e.invoke();
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C12440b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public bj1(d84 d84Var, nl7 nl7Var, long j, h84 h84Var, uk7 uk7Var) {
        sq8.m48649h(d84Var, "liveData");
        sq8.m48649h(nl7Var, "block");
        sq8.m48649h(h84Var, "scope");
        sq8.m48649h(uk7Var, "onDone");
        this.f16418a = d84Var;
        this.f16419b = nl7Var;
        this.f16420c = j;
        this.f16421d = h84Var;
        this.f16422e = uk7Var;
    }

    /* renamed from: g */
    public final void m19226g() {
        if (this.f16424g != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
        }
        this.f16424g = rm1.m46952d(this.f16421d, eu5.m25612c().v0(), null, new C12439a(null), 2, null);
    }

    /* renamed from: h */
    public final void m19227h() {
        p69 p69Var = this.f16424g;
        if (p69Var != null) {
            p69.C15966a.m42999a(p69Var, null, 1, null);
        }
        this.f16424g = null;
        if (this.f16423f != null) {
            return;
        }
        this.f16423f = rm1.m46952d(this.f16421d, null, null, new C12440b(null), 3, null);
    }
}

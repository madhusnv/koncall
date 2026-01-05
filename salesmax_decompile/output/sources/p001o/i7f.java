package p001o;

/* loaded from: classes3.dex */
public final class i7f implements jw7 {

    /* renamed from: a */
    public final t18 f28204a;

    /* renamed from: o.i7f$a */
    public static final class C14207a extends jgg implements nl7 {

        /* renamed from: a */
        public int f28205a;

        /* renamed from: c */
        public final /* synthetic */ jl6 f28207c;

        /* renamed from: d */
        public final /* synthetic */ y38 f28208d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14207a(jl6 jl6Var, y38 y38Var, n64 n64Var) {
            super(2, n64Var);
            this.f28207c = jl6Var;
            this.f28208d = y38Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return i7f.this.new C14207a(this.f28207c, this.f28208d, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f28205a;
            if (i == 0) {
                wre.m54934b(obj);
                t18 t18VarM31698f = i7f.this.m31698f();
                jl6 jl6Var = this.f28207c;
                y38 y38Var = this.f28208d;
                this.f28205a = 1;
                obj = t18VarM31698f.mo35244u(jl6Var, y38Var, this);
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
            return ((C14207a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public i7f(t18 t18Var) {
        sq8.m48649h(t18Var, "engine");
        this.f28204a = t18Var;
    }

    /* renamed from: b */
    public final Object m31694b(y38 y38Var, n64 n64Var) {
        return m31697e(new jl6(), y38Var, n64Var);
    }

    /* renamed from: c */
    public final Object m31695c(z38 z38Var, n64 n64Var) {
        return m31694b(z38Var.m58665b(), n64Var);
    }

    @Override // p001o.jw7
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo21441a(zdc zdcVar, n64 n64Var) {
        return m31697e(zdcVar.m59254c(), ((z38) zdcVar.m59255d()).m58665b(), n64Var);
    }

    /* renamed from: e */
    public final Object m31697e(jl6 jl6Var, y38 y38Var, n64 n64Var) {
        if (!z69.m58846k(this.f28204a.mo6529D()).mo22428a()) {
            throw new w18(null, 1, null);
        }
        q74 q74VarM43170g = p84.m43170g(this.f28204a, n64Var.getContext());
        return rm1.m46950b(this.f28204a, q74VarM43170g.plus(new a8f(q74VarM43170g)), null, new C14207a(jl6Var, y38Var, null), 2, null).mo21334s(n64Var);
    }

    /* renamed from: f */
    public final t18 m31698f() {
        return this.f28204a;
    }
}

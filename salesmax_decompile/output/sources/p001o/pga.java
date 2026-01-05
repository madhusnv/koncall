package p001o;

/* loaded from: classes2.dex */
public final class pga implements oga {

    /* renamed from: a */
    public d84 f40032a;

    /* renamed from: b */
    public final q74 f40033b;

    /* renamed from: o.pga$a */
    public static final class C16108a extends jgg implements nl7 {

        /* renamed from: a */
        public int f40034a;

        /* renamed from: c */
        public final /* synthetic */ Object f40036c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16108a(Object obj, n64 n64Var) {
            super(2, n64Var);
            this.f40036c = obj;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return pga.this.new C16108a(this.f40036c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f40034a;
            if (i == 0) {
                wre.m54934b(obj);
                d84 d84VarM43605a = pga.this.m43605a();
                this.f40034a = 1;
                if (d84VarM43605a.m22606d(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            pga.this.m43605a().setValue(this.f40036c);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16108a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public pga(d84 d84Var, q74 q74Var) {
        sq8.m48649h(d84Var, "target");
        sq8.m48649h(q74Var, "context");
        this.f40032a = d84Var;
        this.f40033b = q74Var.plus(eu5.m25612c().v0());
    }

    /* renamed from: a */
    public final d84 m43605a() {
        return this.f40032a;
    }

    @Override // p001o.oga
    public Object emit(Object obj, n64 n64Var) {
        Object objM43867g = pm1.m43867g(this.f40033b, new C16108a(obj, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }
}

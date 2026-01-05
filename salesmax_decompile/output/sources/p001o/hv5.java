package p001o;

/* loaded from: classes6.dex */
public final class hv5 implements v37 {

    /* renamed from: a */
    public final v37 f27666a;

    /* renamed from: b */
    public final xk7 f27667b;

    /* renamed from: c */
    public final nl7 f27668c;

    /* renamed from: o.hv5$a */
    public static final class C14104a implements z37 {

        /* renamed from: b */
        public final /* synthetic */ gge f27670b;

        /* renamed from: c */
        public final /* synthetic */ z37 f27671c;

        /* renamed from: o.hv5$a$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public /* synthetic */ Object f27672a;

            /* renamed from: c */
            public int f27674c;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f27672a = obj;
                this.f27674c |= Integer.MIN_VALUE;
                return C14104a.this.emit(null, this);
            }
        }

        public C14104a(gge ggeVar, z37 z37Var) {
            this.f27670b = ggeVar;
            this.f27671c = z37Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.z37
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, n64 n64Var) {
            a aVar;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f27674c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f27674c = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object obj2 = aVar.f27672a;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f27674c;
            if (i2 == 0) {
                wre.m54934b(obj2);
                Object objInvoke = hv5.this.f27667b.invoke(obj);
                Object obj3 = this.f27670b.f25106a;
                if (obj3 != y4c.f54875a && ((Boolean) hv5.this.f27668c.invoke(obj3, objInvoke)).booleanValue()) {
                    return y3i.f54824a;
                }
                this.f27670b.f25106a = objInvoke;
                z37 z37Var = this.f27671c;
                aVar.f27674c = 1;
                if (z37Var.emit(obj, aVar) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj2);
            }
            return y3i.f54824a;
        }
    }

    public hv5(v37 v37Var, xk7 xk7Var, nl7 nl7Var) {
        this.f27666a = v37Var;
        this.f27667b = xk7Var;
        this.f27668c = nl7Var;
    }

    @Override // p001o.v37
    /* renamed from: a */
    public Object mo9775a(z37 z37Var, n64 n64Var) {
        gge ggeVar = new gge();
        ggeVar.f25106a = y4c.f54875a;
        Object objMo9775a = this.f27666a.mo9775a(new C14104a(ggeVar, z37Var), n64Var);
        return objMo9775a == uq8.m51918f() ? objMo9775a : y3i.f54824a;
    }
}

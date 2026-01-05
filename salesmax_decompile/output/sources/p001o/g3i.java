package p001o;

/* loaded from: classes6.dex */
public final class g3i implements z37 {

    /* renamed from: a */
    public final q74 f24536a;

    /* renamed from: b */
    public final Object f24537b;

    /* renamed from: c */
    public final nl7 f24538c;

    /* renamed from: o.g3i$a */
    public static final class C13618a extends jgg implements nl7 {

        /* renamed from: a */
        public int f24539a;

        /* renamed from: b */
        public /* synthetic */ Object f24540b;

        /* renamed from: c */
        public final /* synthetic */ z37 f24541c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13618a(z37 z37Var, n64 n64Var) {
            super(2, n64Var);
            this.f24541c = z37Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13618a c13618a = new C13618a(this.f24541c, n64Var);
            c13618a.f24540b = obj;
            return c13618a;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f24539a;
            if (i == 0) {
                wre.m54934b(obj);
                Object obj2 = this.f24540b;
                z37 z37Var = this.f24541c;
                this.f24539a = 1;
                if (z37Var.emit(obj2, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(Object obj, n64 n64Var) {
            return ((C13618a) create(obj, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public g3i(z37 z37Var, q74 q74Var) {
        this.f24536a = q74Var;
        this.f24537b = kkh.m35818g(q74Var);
        this.f24538c = new C13618a(z37Var, null);
    }

    @Override // p001o.z37
    public Object emit(Object obj, n64 n64Var) {
        Object objM42204b = og2.m42204b(this.f24536a, obj, this.f24537b, this.f24538c, n64Var);
        return objM42204b == uq8.m51918f() ? objM42204b : y3i.f54824a;
    }
}

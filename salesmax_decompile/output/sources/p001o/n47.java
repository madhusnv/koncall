package p001o;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class n47 {

    /* renamed from: o.n47$a */
    public static final class C15486a implements v37 {

        /* renamed from: a */
        public final /* synthetic */ nl7 f36348a;

        /* renamed from: b */
        public final /* synthetic */ v37 f36349b;

        /* renamed from: o.n47$a$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public /* synthetic */ Object f36350a;

            /* renamed from: b */
            public int f36351b;

            /* renamed from: d */
            public Object f36353d;

            /* renamed from: e */
            public Object f36354e;

            /* renamed from: f */
            public Object f36355f;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f36350a = obj;
                this.f36351b |= Integer.MIN_VALUE;
                return C15486a.this.mo9775a(null, this);
            }
        }

        public C15486a(nl7 nl7Var, v37 v37Var) {
            this.f36348a = nl7Var;
            this.f36349b = v37Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.v37
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo9775a(z37 z37Var, n64 n64Var) throws Throwable {
            a aVar;
            Throwable th;
            wze wzeVar;
            C15486a c15486a;
            z37 z37Var2;
            v37 v37Var;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f36351b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f36351b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object obj = aVar.f36350a;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f36351b;
            if (i2 == 0) {
                wre.m54934b(obj);
                wze wzeVar2 = new wze(z37Var, aVar.getContext());
                try {
                    nl7 nl7Var = this.f36348a;
                    aVar.f36353d = this;
                    aVar.f36354e = z37Var;
                    aVar.f36355f = wzeVar2;
                    aVar.f36351b = 1;
                    bj8.m19245c(6);
                    Object objInvoke = nl7Var.invoke(wzeVar2, aVar);
                    bj8.m19245c(7);
                    if (objInvoke == objM51918f) {
                        return objM51918f;
                    }
                    c15486a = this;
                    z37Var2 = z37Var;
                    wzeVar = wzeVar2;
                    wzeVar.releaseIntercepted();
                    v37Var = c15486a.f36349b;
                    aVar.f36353d = null;
                    aVar.f36354e = null;
                    aVar.f36355f = null;
                    aVar.f36351b = 2;
                    if (v37Var.mo9775a(z37Var2, aVar) == objM51918f) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    wzeVar = wzeVar2;
                    wzeVar.releaseIntercepted();
                    throw th;
                }
            } else if (i2 == 1) {
                wzeVar = (wze) aVar.f36355f;
                z37Var2 = (z37) aVar.f36354e;
                c15486a = (C15486a) aVar.f36353d;
                try {
                    wre.m54934b(obj);
                    wzeVar.releaseIntercepted();
                    v37Var = c15486a.f36349b;
                    aVar.f36353d = null;
                    aVar.f36354e = null;
                    aVar.f36355f = null;
                    aVar.f36351b = 2;
                    if (v37Var.mo9775a(z37Var2, aVar) == objM51918f) {
                        return objM51918f;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    wzeVar.releaseIntercepted();
                    throw th;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final void m40051a(z37 z37Var) {
    }

    /* renamed from: b */
    public static final v37 m40052b(v37 v37Var, nl7 nl7Var) {
        return new C15486a(nl7Var, v37Var);
    }
}

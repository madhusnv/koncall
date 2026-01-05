package p001o;

/* loaded from: classes3.dex */
public final class ji9 implements ii9 {

    /* renamed from: a */
    public final nqb f30483a;

    /* renamed from: b */
    public xk7 f30484b;

    /* renamed from: c */
    public Object f30485c;

    /* renamed from: o.ji9$a */
    public static final class C14547a extends o64 {

        /* renamed from: a */
        public Object f30486a;

        /* renamed from: b */
        public Object f30487b;

        /* renamed from: c */
        public Object f30488c;

        /* renamed from: d */
        public /* synthetic */ Object f30489d;

        /* renamed from: f */
        public int f30491f;

        public C14547a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f30489d = obj;
            this.f30491f |= Integer.MIN_VALUE;
            return ji9.this.mo32174a(this);
        }
    }

    public ji9(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "initializer");
        this.f30483a = tqb.m50340b(false, 1, null);
        this.f30484b = xk7Var;
        this.f30485c = v0i.f49735a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.nqb] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v5, types: [o.nqb] */
    @Override // p001o.ii9
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo32174a(n64 n64Var) {
        C14547a c14547a;
        ji9 ji9Var;
        nqb nqbVar;
        ji9 ji9Var2;
        ji9 ji9Var3;
        nqb nqbVar2;
        if (n64Var instanceof C14547a) {
            c14547a = (C14547a) n64Var;
            int i = c14547a.f30491f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14547a.f30491f = i - Integer.MIN_VALUE;
            } else {
                c14547a = new C14547a(n64Var);
            }
        }
        Object objInvoke = c14547a.f30489d;
        Object objM51918f = uq8.m51918f();
        ?? r2 = c14547a.f30491f;
        try {
            if (r2 == 0) {
                wre.m54934b(objInvoke);
                nqb nqbVar3 = this.f30483a;
                c14547a.f30486a = this;
                c14547a.f30487b = nqbVar3;
                c14547a.f30491f = 1;
                if (nqbVar3.mo40922b(null, c14547a) == objM51918f) {
                    return objM51918f;
                }
                ji9Var = this;
                nqbVar = nqbVar3;
            } else {
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ji9Var3 = (ji9) c14547a.f30488c;
                    nqb nqbVar4 = (nqb) c14547a.f30487b;
                    ji9Var2 = (ji9) c14547a.f30486a;
                    wre.m54934b(objInvoke);
                    nqbVar2 = nqbVar4;
                    ji9Var3.f30485c = objInvoke;
                    ji9Var2.f30484b = null;
                    ji9Var = ji9Var2;
                    r2 = nqbVar2;
                    return ji9Var.f30485c;
                }
                nqb nqbVar5 = (nqb) c14547a.f30487b;
                ji9Var = (ji9) c14547a.f30486a;
                wre.m54934b(objInvoke);
                nqbVar = nqbVar5;
            }
            r2 = nqbVar;
            if (ji9Var.f30485c == v0i.f49735a) {
                xk7 xk7Var = ji9Var.f30484b;
                sq8.m48646e(xk7Var);
                c14547a.f30486a = ji9Var;
                c14547a.f30487b = nqbVar;
                c14547a.f30488c = ji9Var;
                c14547a.f30491f = 2;
                objInvoke = xk7Var.invoke(c14547a);
                if (objInvoke == objM51918f) {
                    return objM51918f;
                }
                ji9Var2 = ji9Var;
                ji9Var3 = ji9Var2;
                nqbVar2 = nqbVar;
                ji9Var3.f30485c = objInvoke;
                ji9Var2.f30484b = null;
                ji9Var = ji9Var2;
                r2 = nqbVar2;
            }
            return ji9Var.f30485c;
        } finally {
            r2.mo40923c(null);
        }
    }
}

package p001o;

/* loaded from: classes3.dex */
public final class llb implements ueb {

    /* renamed from: a */
    public final jlb f34013a;

    /* renamed from: o.llb$a */
    public static final class C15102a extends o64 {

        /* renamed from: a */
        public Object f34014a;

        /* renamed from: b */
        public /* synthetic */ Object f34015b;

        /* renamed from: d */
        public int f34017d;

        public C15102a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f34015b = obj;
            this.f34017d |= Integer.MIN_VALUE;
            return llb.this.mo36732b(null, null, this);
        }
    }

    public llb(jlb jlbVar) {
        sq8.m48649h(jlbVar, "transform");
        this.f34013a = jlbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.ueb
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo36732b(Object obj, jw7 jw7Var, n64 n64Var) {
        C15102a c15102a;
        if (n64Var instanceof C15102a) {
            c15102a = (C15102a) n64Var;
            int i = c15102a.f34017d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15102a.f34017d = i - Integer.MIN_VALUE;
            } else {
                c15102a = new C15102a(n64Var);
            }
        }
        Object objMo21638b = c15102a.f34015b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15102a.f34017d;
        if (i2 == 0) {
            wre.m54934b(objMo21638b);
            jlb jlbVar = this.f34013a;
            c15102a.f34014a = jw7Var;
            c15102a.f34017d = 1;
            objMo21638b = jlbVar.mo21638b(obj, c15102a);
            if (objMo21638b == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    wre.m54934b(objMo21638b);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jw7Var = (jw7) c15102a.f34014a;
            wre.m54934b(objMo21638b);
        }
        c15102a.f34014a = null;
        c15102a.f34017d = 2;
        objMo21638b = jw7Var.mo21441a(objMo21638b, c15102a);
        return objMo21638b == objM51918f ? objM51918f : objMo21638b;
    }
}

package p001o;

/* loaded from: classes3.dex */
public final class vn8 implements ueb {

    /* renamed from: a */
    public final un8 f50583a;

    /* renamed from: o.vn8$a */
    public static final class C17625a extends o64 {

        /* renamed from: a */
        public Object f50584a;

        /* renamed from: b */
        public Object f50585b;

        /* renamed from: c */
        public Object f50586c;

        /* renamed from: d */
        public /* synthetic */ Object f50587d;

        /* renamed from: f */
        public int f50589f;

        public C17625a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f50587d = obj;
            this.f50589f |= Integer.MIN_VALUE;
            return vn8.this.mo36732b(null, null, this);
        }
    }

    public vn8(un8 un8Var) {
        sq8.m48649h(un8Var, "interceptors");
        this.f50583a = un8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.ueb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo36732b(zdc zdcVar, jw7 jw7Var, n64 n64Var) {
        C17625a c17625a;
        vn8 vn8Var;
        vn8 vn8Var2;
        if (n64Var instanceof C17625a) {
            c17625a = (C17625a) n64Var;
            int i = c17625a.f50589f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17625a.f50589f = i - Integer.MIN_VALUE;
            } else {
                c17625a = new C17625a(n64Var);
            }
        }
        Object objM51813i = c17625a.f50587d;
        Object objM51918f = uq8.m51918f();
        int i2 = c17625a.f50589f;
        if (i2 == 0) {
            wre.m54934b(objM51813i);
            un8 un8Var = this.f50583a;
            y38 y38VarM16409e = a48.m16409e((z38) zdcVar.m59255d(), true);
            c17625a.f50584a = this;
            c17625a.f50585b = zdcVar;
            c17625a.f50586c = jw7Var;
            c17625a.f50589f = 1;
            objM51813i = un8Var.m51813i(y38VarM16409e, c17625a);
            if (objM51813i == objM51918f) {
                return objM51918f;
            }
            vn8Var = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vn8Var2 = (vn8) c17625a.f50584a;
                wre.m54934b(objM51813i);
                o18 o18Var = (o18) objM51813i;
                vn8Var2.f50583a.m51819o(o18Var);
                return o18Var;
            }
            jw7Var = (jw7) c17625a.f50586c;
            zdcVar = (zdc) c17625a.f50585b;
            vn8Var = (vn8) c17625a.f50584a;
            wre.m54934b(objM51813i);
        }
        zdc zdcVarM59252b = zdc.m59252b(zdcVar, null, f48.m26053c((y38) objM51813i), 1, null);
        vn8Var.f50583a.m51825u(a48.m16410f((z38) zdcVarM59252b.m59255d(), false, 1, null));
        c17625a.f50584a = vn8Var;
        c17625a.f50585b = null;
        c17625a.f50586c = null;
        c17625a.f50589f = 2;
        objM51813i = jw7Var.mo21441a(zdcVarM59252b, c17625a);
        if (objM51813i == objM51918f) {
            return objM51918f;
        }
        vn8Var2 = vn8Var;
        o18 o18Var2 = (o18) objM51813i;
        vn8Var2.f50583a.m51819o(o18Var2);
        return o18Var2;
    }
}

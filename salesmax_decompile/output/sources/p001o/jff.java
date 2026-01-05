package p001o;

import p001o.m48;

/* loaded from: classes3.dex */
public final class jff implements jw7 {

    /* renamed from: a */
    public final jw7 f30357a;

    /* renamed from: b */
    public final m48 f30358b;

    /* renamed from: c */
    public final un8 f30359c;

    /* renamed from: o.jff$a */
    public static final class C14522a extends o64 {

        /* renamed from: a */
        public Object f30360a;

        /* renamed from: b */
        public Object f30361b;

        /* renamed from: c */
        public /* synthetic */ Object f30362c;

        /* renamed from: e */
        public int f30364e;

        public C14522a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f30362c = obj;
            this.f30364e |= Integer.MIN_VALUE;
            return jff.this.mo21441a(null, this);
        }
    }

    public jff(jw7 jw7Var, m48 m48Var, un8 un8Var) {
        sq8.m48649h(jw7Var, "inner");
        sq8.m48649h(m48Var, "serializer");
        sq8.m48649h(un8Var, "interceptors");
        this.f30357a = jw7Var;
        this.f30358b = m48Var;
        this.f30359c = un8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6 A[PHI: r13
      0x00e6: PHI (r13v13 java.lang.Object) = (r13v9 java.lang.Object), (r13v1 java.lang.Object) binds: [B:33:0x00e3, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.jw7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo21441a(zdc zdcVar, n64 n64Var) {
        C14522a c14522a;
        jff jffVar;
        zdc zdcVarM59252b;
        zdc zdcVar2;
        z38 z38VarMo16700b;
        if (n64Var instanceof C14522a) {
            c14522a = (C14522a) n64Var;
            int i = c14522a.f30364e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14522a.f30364e = i - Integer.MIN_VALUE;
            } else {
                c14522a = new C14522a(n64Var);
            }
        }
        Object objM51811g = c14522a.f30362c;
        Object objM51918f = uq8.m51918f();
        int i2 = c14522a.f30364e;
        if (i2 == 0) {
            wre.m54934b(objM51811g);
            un8 un8Var = this.f30359c;
            Object objM59255d = zdcVar.m59255d();
            c14522a.f30360a = this;
            c14522a.f30361b = zdcVar;
            c14522a.f30364e = 1;
            objM51811g = un8Var.m51811g(objM59255d, c14522a);
            if (objM51811g == objM51918f) {
                return objM51918f;
            }
            jffVar = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        wre.m54934b(objM51811g);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdcVar2 = (zdc) c14522a.f30361b;
                jffVar = (jff) c14522a.f30360a;
                wre.m54934b(objM51811g);
                z38 z38Var = (z38) objM51811g;
                zdcVarM59252b = zdcVar2;
                z38VarMo16700b = z38Var;
                jffVar.f30359c.m51817m(a48.m16410f(z38VarMo16700b, false, 1, null));
                jw7 jw7Var = jffVar.f30357a;
                zdc zdcVar3 = new zdc(zdcVarM59252b.m59254c(), z38VarMo16700b);
                c14522a.f30360a = null;
                c14522a.f30361b = null;
                c14522a.f30364e = 3;
                objM51811g = jw7Var.mo21441a(zdcVar3, c14522a);
                return objM51811g == objM51918f ? objM51918f : objM51811g;
            }
            zdcVar = (zdc) c14522a.f30361b;
            jffVar = (jff) c14522a.f30360a;
            wre.m54934b(objM51811g);
        }
        zdcVarM59252b = zdc.m59252b(zdcVar, null, objM51811g, 1, null);
        jffVar.f30359c.m51823s(zdcVarM59252b.m59255d());
        jl6 jl6VarM59254c = zdcVar.m59254c();
        kx0 kx0VarM47571g = s38.f44646a.m47571g();
        Object objM59255d2 = zdcVarM59252b.m59255d();
        sq8.m48647f(objM59255d2, "null cannot be cast to non-null type kotlin.Any");
        jl6VarM59254c.mo34002p(kx0VarM47571g, objM59255d2);
        m48 m48Var = jffVar.f30358b;
        if (m48Var instanceof m48.InterfaceC15219a) {
            z38VarMo16700b = ((m48.InterfaceC15219a) m48Var).mo16700b(zdcVarM59252b.m59254c(), zdcVarM59252b.m59255d());
            jffVar.f30359c.m51817m(a48.m16410f(z38VarMo16700b, false, 1, null));
            jw7 jw7Var2 = jffVar.f30357a;
            zdc zdcVar32 = new zdc(zdcVarM59252b.m59254c(), z38VarMo16700b);
            c14522a.f30360a = null;
            c14522a.f30361b = null;
            c14522a.f30364e = 3;
            objM51811g = jw7Var2.mo21441a(zdcVar32, c14522a);
            if (objM51811g == objM51918f) {
            }
        } else {
            if (!(m48Var instanceof m48.InterfaceC15220b)) {
                throw new szb();
            }
            jl6 jl6VarM59254c2 = zdcVarM59252b.m59254c();
            Object objM59255d3 = zdcVarM59252b.m59255d();
            c14522a.f30360a = jffVar;
            c14522a.f30361b = zdcVarM59252b;
            c14522a.f30364e = 2;
            Object objMo38350a = ((m48.InterfaceC15220b) m48Var).mo38350a(jl6VarM59254c2, objM59255d3, c14522a);
            if (objMo38350a == objM51918f) {
                return objM51918f;
            }
            objM51811g = objMo38350a;
            zdcVar2 = zdcVarM59252b;
            z38 z38Var2 = (z38) objM51811g;
            zdcVarM59252b = zdcVar2;
            z38VarMo16700b = z38Var2;
            jffVar.f30359c.m51817m(a48.m16410f(z38VarMo16700b, false, 1, null));
            jw7 jw7Var22 = jffVar.f30357a;
            zdc zdcVar322 = new zdc(zdcVarM59252b.m59254c(), z38VarMo16700b);
            c14522a.f30360a = null;
            c14522a.f30361b = null;
            c14522a.f30364e = 3;
            objM51811g = jw7Var22.mo21441a(zdcVar322, c14522a);
            if (objM51811g == objM51918f) {
            }
        }
    }
}

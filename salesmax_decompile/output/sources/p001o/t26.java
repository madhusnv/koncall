package p001o;

import p001o.w79;

/* loaded from: classes2.dex */
public final class t26 implements l28 {

    /* renamed from: o.t26$a */
    public static final class C16979a extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f46256a;

        /* renamed from: c */
        public int f46258c;

        public C16979a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f46256a = obj;
            this.f46258c |= Integer.MIN_VALUE;
            return t26.this.mo36452a(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.l28
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo36452a(jl6 jl6Var, o18 o18Var, n64 n64Var) {
        C16979a c16979a;
        byte[] bArr;
        if (n64Var instanceof C16979a) {
            c16979a = (C16979a) n64Var;
            int i = c16979a.f46258c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16979a.f46258c = i - Integer.MIN_VALUE;
            } else {
                c16979a = new C16979a(n64Var);
            }
        }
        Object objM39980a = c16979a.f46256a;
        Object objM51918f = uq8.m51918f();
        int i2 = c16979a.f46258c;
        if (i2 == 0) {
            wre.m54934b(objM39980a);
            g48 g48VarM41347f = o18Var.m41347f();
            if (!t48.m49282c(g48VarM41347f.getStatus())) {
                c16979a.f46258c = 1;
                if (y26.m57132d(g48VarM41347f, c16979a) == objM51918f) {
                    return objM51918f;
                }
                throw new qe9();
            }
            m18 body = g48VarM41347f.getBody();
            c16979a.f46258c = 2;
            objM39980a = n18.m39980a(body, c16979a);
            if (objM39980a == objM51918f) {
                return objM51918f;
            }
            bArr = (byte[]) objM39980a;
            if (bArr != null) {
            }
        } else {
            if (i2 == 1) {
                wre.m54934b(objM39980a);
                throw new qe9();
            }
            if (i2 == 2) {
                wre.m54934b(objM39980a);
                bArr = (byte[]) objM39980a;
                if (bArr != null) {
                    throw new sc4("HTTP credentials response did not contain a payload", null, 2, null);
                }
                i89 i89Var = new i89(bArr);
                c16979a.f46258c = 3;
                objM39980a = v79.m52407a(i89Var, c16979a);
                if (objM39980a == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objM39980a);
            }
        }
        w79 w79Var = (w79) objM39980a;
        if (!(w79Var instanceof w79.C17794b)) {
            throw new sc4("HTTP credentials response was not of expected format", null, 2, null);
        }
        w79.C17794b c17794b = (w79.C17794b) w79Var;
        return mc4.m38705a(c17794b.m54038a(), c17794b.m54041d(), c17794b.m54042e(), c17794b.m54040c(), "EcsContainer", c17794b.m54039b());
    }
}

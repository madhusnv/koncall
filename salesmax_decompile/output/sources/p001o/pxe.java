package p001o;

/* loaded from: classes3.dex */
public final class pxe implements q48 {

    /* renamed from: a */
    public final q48 f40707a;

    /* renamed from: o.pxe$a */
    public static final class C16208a extends o64 {

        /* renamed from: a */
        public Object f40708a;

        /* renamed from: b */
        public /* synthetic */ Object f40709b;

        /* renamed from: d */
        public int f40711d;

        public C16208a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f40709b = obj;
            this.f40711d |= Integer.MIN_VALUE;
            return pxe.this.mo22493a(null, this);
        }
    }

    public pxe(q48 q48Var) {
        sq8.m48649h(q48Var, "httpSigner");
        this.f40707a = q48Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.q48
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo22493a(srf srfVar, n64 n64Var) {
        C16208a c16208a;
        String sessionToken;
        if (n64Var instanceof C16208a) {
            c16208a = (C16208a) n64Var;
            int i = c16208a.f40711d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16208a.f40711d = i - Integer.MIN_VALUE;
            } else {
                c16208a = new C16208a(n64Var);
            }
        }
        Object obj = c16208a.f40709b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16208a.f40711d;
        if (i2 == 0) {
            wre.m54934b(obj);
            ib8 ib8VarM48821d = srfVar.m48821d();
            ic4 ic4Var = ib8VarM48821d instanceof ic4 ? (ic4) ib8VarM48821d : null;
            if (ic4Var == null || (sessionToken = ic4Var.getSessionToken()) == null) {
                throw new IllegalStateException("No session token found on identity, required for S3 Express".toString());
            }
            a48.m16408d(srfVar.m48820c(), "X-Amz-S3session-Token", sessionToken);
            tob tobVarM50745j = tx0.m50745j(srfVar.m48822e());
            tobVarM50745j.mo34002p(x81.f53319a.m55802f(), ml1.m39301a(true));
            q48 q48Var = this.f40707a;
            srf srfVarM48818b = srf.m48818b(srfVar, null, null, tobVarM50745j, 3, null);
            c16208a.f40708a = srfVar;
            c16208a.f40711d = 1;
            if (q48Var.mo22493a(srfVarM48818b, c16208a) == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            srfVar = (srf) c16208a.f40708a;
            wre.m54934b(obj);
        }
        srfVar.m48820c().m58668e().m59809q("X-Amz-Security-Token");
        return y3i.f54824a;
    }
}

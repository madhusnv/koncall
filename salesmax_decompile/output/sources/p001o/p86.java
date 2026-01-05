package p001o;

import p001o.lhe;

/* loaded from: classes3.dex */
public final class p86 implements h86 {

    /* renamed from: a */
    public final lhe.C15078c f39576a;

    /* renamed from: o.p86$a */
    public static final class C16022a extends o64 {

        /* renamed from: a */
        public Object f39577a;

        /* renamed from: b */
        public /* synthetic */ Object f39578b;

        /* renamed from: d */
        public int f39580d;

        public C16022a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f39578b = obj;
            this.f39580d |= Integer.MIN_VALUE;
            return p86.this.mo29972a(null, this);
        }
    }

    public p86(lhe.C15078c c15078c) {
        sq8.m48649h(c15078c, "config");
        this.f39576a = c15078c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.h86
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        C16022a c16022a;
        if (n64Var instanceof C16022a) {
            c16022a = (C16022a) n64Var;
            int i = c16022a.f39580d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16022a.f39580d = i - Integer.MIN_VALUE;
            } else {
                c16022a = new C16022a(n64Var);
            }
        }
        Object objResolveEndpoint = c16022a.f39578b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16022a.f39580d;
        if (i2 == 0) {
            wre.m54934b(objResolveEndpoint);
            mhe mheVarM16697b = a96.m16697b(this.f39576a, rneVar);
            nhe nheVarM37234h = this.f39576a.m37234h();
            c16022a.f39577a = rneVar;
            c16022a.f39580d = 1;
            objResolveEndpoint = nheVarM37234h.resolveEndpoint(mheVarM16697b, c16022a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rneVar = (rne) c16022a.f39577a;
            wre.m54934b(objResolveEndpoint);
        }
        b86 b86Var = (b86) objResolveEndpoint;
        if (b86Var.m18275a().mo18192c(po1.m43956e())) {
            po1.m43953b(rneVar.m47005a(), pwf.SERVICE_ENDPOINT_OVERRIDE);
        }
        if (b86Var.m18275a().mo18192c(po1.m43954c())) {
            po1.m43953b(rneVar.m47005a(), pwf.ACCOUNT_ID_BASED_ENDPOINT);
        }
        qx0 qx0VarM18275a = b86Var.m18275a();
        x81 x81Var = x81.f53319a;
        if (qx0VarM18275a.mo18192c(x81Var.m55808l()) && sq8.m48644c(tx0.m50737b(b86Var.m18275a(), x81Var.m55808l()), "s3express")) {
            po1.m43953b(rneVar.m47005a(), e71.S3_EXPRESS_BUCKET);
        }
        return b86Var;
    }
}

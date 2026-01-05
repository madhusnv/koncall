package p001o;

import p001o.up3;

/* loaded from: classes3.dex */
public final class n86 implements h86 {

    /* renamed from: a */
    public final up3.C17430c f36553a;

    /* renamed from: o.n86$a */
    public static final class C15528a extends o64 {

        /* renamed from: a */
        public Object f36554a;

        /* renamed from: b */
        public /* synthetic */ Object f36555b;

        /* renamed from: d */
        public int f36557d;

        public C15528a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f36555b = obj;
            this.f36557d |= Integer.MIN_VALUE;
            return n86.this.mo29972a(null, this);
        }
    }

    public n86(up3.C17430c c17430c) {
        sq8.m48649h(c17430c, "config");
        this.f36553a = c17430c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.h86
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        C15528a c15528a;
        if (n64Var instanceof C15528a) {
            c15528a = (C15528a) n64Var;
            int i = c15528a.f36557d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15528a.f36557d = i - Integer.MIN_VALUE;
            } else {
                c15528a = new C15528a(n64Var);
            }
        }
        Object objResolveEndpoint = c15528a.f36555b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15528a.f36557d;
        if (i2 == 0) {
            wre.m54934b(objResolveEndpoint);
            vp3 vp3VarM57368b = y86.m57368b(this.f36553a, rneVar);
            wp3 wp3VarM51881h = this.f36553a.m51881h();
            c15528a.f36554a = rneVar;
            c15528a.f36557d = 1;
            objResolveEndpoint = wp3VarM51881h.resolveEndpoint(vp3VarM57368b, c15528a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rneVar = (rne) c15528a.f36554a;
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

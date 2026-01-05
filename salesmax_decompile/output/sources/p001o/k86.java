package p001o;

import p001o.z9g;

/* loaded from: classes2.dex */
public final class k86 implements h86 {

    /* renamed from: a */
    public final z9g.C18593c f31620a;

    /* renamed from: o.k86$a */
    public static final class C14731a extends o64 {

        /* renamed from: a */
        public Object f31621a;

        /* renamed from: b */
        public /* synthetic */ Object f31622b;

        /* renamed from: d */
        public int f31624d;

        public C14731a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f31622b = obj;
            this.f31624d |= Integer.MIN_VALUE;
            return k86.this.mo29972a(null, this);
        }
    }

    public k86(z9g.C18593c c18593c) {
        sq8.m48649h(c18593c, "config");
        this.f31620a = c18593c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.h86
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        C14731a c14731a;
        if (n64Var instanceof C14731a) {
            c14731a = (C14731a) n64Var;
            int i = c14731a.f31624d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14731a.f31624d = i - Integer.MIN_VALUE;
            } else {
                c14731a = new C14731a(n64Var);
            }
        }
        Object objResolveEndpoint = c14731a.f31622b;
        Object objM51918f = uq8.m51918f();
        int i2 = c14731a.f31624d;
        if (i2 == 0) {
            wre.m54934b(objResolveEndpoint);
            aag aagVarM52455b = v86.m52455b(this.f31620a, rneVar);
            bag bagVarM59012h = this.f31620a.m59012h();
            c14731a.f31621a = rneVar;
            c14731a.f31624d = 1;
            objResolveEndpoint = bagVarM59012h.resolveEndpoint(aagVarM52455b, c14731a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rneVar = (rne) c14731a.f31621a;
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

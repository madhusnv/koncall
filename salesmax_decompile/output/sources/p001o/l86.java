package p001o;

import p001o.cg3;

/* loaded from: classes3.dex */
public final class l86 implements h86 {

    /* renamed from: a */
    public final cg3.C12676c f33436a;

    /* renamed from: o.l86$a */
    public static final class C15032a extends o64 {

        /* renamed from: a */
        public Object f33437a;

        /* renamed from: b */
        public /* synthetic */ Object f33438b;

        /* renamed from: d */
        public int f33440d;

        public C15032a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f33438b = obj;
            this.f33440d |= Integer.MIN_VALUE;
            return l86.this.mo29972a(null, this);
        }
    }

    public l86(cg3.C12676c c12676c) {
        sq8.m48649h(c12676c, "config");
        this.f33436a = c12676c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.h86
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        C15032a c15032a;
        if (n64Var instanceof C15032a) {
            c15032a = (C15032a) n64Var;
            int i = c15032a.f33440d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15032a.f33440d = i - Integer.MIN_VALUE;
            } else {
                c15032a = new C15032a(n64Var);
            }
        }
        Object objResolveEndpoint = c15032a.f33438b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15032a.f33440d;
        if (i2 == 0) {
            wre.m54934b(objResolveEndpoint);
            dg3 dg3VarM54052b = w86.m54052b(this.f33436a, rneVar);
            eg3 eg3VarM21150h = this.f33436a.m21150h();
            c15032a.f33437a = rneVar;
            c15032a.f33440d = 1;
            objResolveEndpoint = eg3VarM21150h.resolveEndpoint(dg3VarM54052b, c15032a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rneVar = (rne) c15032a.f33437a;
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

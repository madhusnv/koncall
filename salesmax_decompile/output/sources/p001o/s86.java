package p001o;

import p001o.q1g;

/* loaded from: classes2.dex */
public final class s86 implements h86 {

    /* renamed from: a */
    public final q1g.C16272c f44959a;

    /* renamed from: o.s86$a */
    public static final class C16779a extends o64 {

        /* renamed from: a */
        public Object f44960a;

        /* renamed from: b */
        public /* synthetic */ Object f44961b;

        /* renamed from: d */
        public int f44963d;

        public C16779a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f44961b = obj;
            this.f44963d |= Integer.MIN_VALUE;
            return s86.this.mo29972a(null, this);
        }
    }

    public s86(q1g.C16272c c16272c) {
        sq8.m48649h(c16272c, "config");
        this.f44959a = c16272c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.h86
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        C16779a c16779a;
        if (n64Var instanceof C16779a) {
            c16779a = (C16779a) n64Var;
            int i = c16779a.f44963d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16779a.f44963d = i - Integer.MIN_VALUE;
            } else {
                c16779a = new C16779a(n64Var);
            }
        }
        Object objResolveEndpoint = c16779a.f44961b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16779a.f44963d;
        if (i2 == 0) {
            wre.m54934b(objResolveEndpoint);
            v1g v1gVarM22616b = d96.m22616b(this.f44959a, rneVar);
            w1g w1gVarM44714h = this.f44959a.m44714h();
            c16779a.f44960a = rneVar;
            c16779a.f44963d = 1;
            objResolveEndpoint = w1gVarM44714h.resolveEndpoint(v1gVarM22616b, c16779a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rneVar = (rne) c16779a.f44960a;
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

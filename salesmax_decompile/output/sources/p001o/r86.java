package p001o;

import p001o.njh;

/* loaded from: classes3.dex */
public final class r86 implements h86 {

    /* renamed from: a */
    public final njh.C15595c f43132a;

    /* renamed from: o.r86$a */
    public static final class C16552a extends o64 {

        /* renamed from: a */
        public Object f43133a;

        /* renamed from: b */
        public /* synthetic */ Object f43134b;

        /* renamed from: d */
        public int f43136d;

        public C16552a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f43134b = obj;
            this.f43136d |= Integer.MIN_VALUE;
            return r86.this.mo29972a(null, this);
        }
    }

    public r86(njh.C15595c c15595c) {
        sq8.m48649h(c15595c, "config");
        this.f43132a = c15595c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.h86
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        C16552a c16552a;
        if (n64Var instanceof C16552a) {
            c16552a = (C16552a) n64Var;
            int i = c16552a.f43136d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16552a.f43136d = i - Integer.MIN_VALUE;
            } else {
                c16552a = new C16552a(n64Var);
            }
        }
        Object objResolveEndpoint = c16552a.f43134b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16552a.f43136d;
        if (i2 == 0) {
            wre.m54934b(objResolveEndpoint);
            ojh ojhVarM20509b = c96.m20509b(this.f43132a, rneVar);
            pjh pjhVarM40691h = this.f43132a.m40691h();
            c16552a.f43133a = rneVar;
            c16552a.f43136d = 1;
            objResolveEndpoint = pjhVarM40691h.resolveEndpoint(ojhVarM20509b, c16552a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rneVar = (rne) c16552a.f43133a;
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

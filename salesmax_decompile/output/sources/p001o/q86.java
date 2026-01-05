package p001o;

import p001o.cxe;

/* loaded from: classes3.dex */
public final class q86 implements h86 {

    /* renamed from: a */
    public final cxe.C12766c f41461a;

    /* renamed from: o.q86$a */
    public static final class C16322a extends o64 {

        /* renamed from: a */
        public Object f41462a;

        /* renamed from: b */
        public /* synthetic */ Object f41463b;

        /* renamed from: d */
        public int f41465d;

        public C16322a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f41463b = obj;
            this.f41465d |= Integer.MIN_VALUE;
            return q86.this.mo29972a(null, this);
        }
    }

    public q86(cxe.C12766c c12766c) {
        sq8.m48649h(c12766c, "config");
        this.f41461a = c12766c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.h86
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        C16322a c16322a;
        if (n64Var instanceof C16322a) {
            c16322a = (C16322a) n64Var;
            int i = c16322a.f41465d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16322a.f41465d = i - Integer.MIN_VALUE;
            } else {
                c16322a = new C16322a(n64Var);
            }
        }
        Object objResolveEndpoint = c16322a.f41463b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16322a.f41465d;
        if (i2 == 0) {
            wre.m54934b(objResolveEndpoint);
            exe exeVarH2 = b96.H2(this.f41461a, rneVar);
            fxe fxeVarM21988m = this.f41461a.m21988m();
            c16322a.f41462a = rneVar;
            c16322a.f41465d = 1;
            objResolveEndpoint = fxeVarM21988m.resolveEndpoint(exeVarH2, c16322a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rneVar = (rne) c16322a.f41462a;
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

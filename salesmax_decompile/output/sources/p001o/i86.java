package p001o;

import p001o.xvh;

/* loaded from: classes3.dex */
public final class i86 implements h86 {

    /* renamed from: a */
    public final xvh.C18256c f28215a;

    /* renamed from: o.i86$a */
    public static final class C14210a extends o64 {

        /* renamed from: a */
        public Object f28216a;

        /* renamed from: b */
        public /* synthetic */ Object f28217b;

        /* renamed from: d */
        public int f28219d;

        public C14210a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f28217b = obj;
            this.f28219d |= Integer.MIN_VALUE;
            return i86.this.mo29972a(null, this);
        }
    }

    public i86(xvh.C18256c c18256c) {
        sq8.m48649h(c18256c, "config");
        this.f28215a = c18256c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.h86
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        C14210a c14210a;
        if (n64Var instanceof C14210a) {
            c14210a = (C14210a) n64Var;
            int i = c14210a.f28219d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14210a.f28219d = i - Integer.MIN_VALUE;
            } else {
                c14210a = new C14210a(n64Var);
            }
        }
        Object objResolveEndpoint = c14210a.f28217b;
        Object objM51918f = uq8.m51918f();
        int i2 = c14210a.f28219d;
        if (i2 == 0) {
            wre.m54934b(objResolveEndpoint);
            yvh yvhVarM49560b = t86.m49560b(this.f28215a, rneVar);
            zvh zvhVarM56884h = this.f28215a.m56884h();
            c14210a.f28216a = rneVar;
            c14210a.f28219d = 1;
            objResolveEndpoint = zvhVarM56884h.resolveEndpoint(yvhVarM49560b, c14210a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rneVar = (rne) c14210a.f28216a;
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

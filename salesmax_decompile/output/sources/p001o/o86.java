package p001o;

import p001o.mdd;

/* loaded from: classes3.dex */
public final class o86 implements h86 {

    /* renamed from: a */
    public final mdd.C15289c f37921a;

    /* renamed from: o.o86$a */
    public static final class C15732a extends o64 {

        /* renamed from: a */
        public Object f37922a;

        /* renamed from: b */
        public /* synthetic */ Object f37923b;

        /* renamed from: d */
        public int f37925d;

        public C15732a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f37923b = obj;
            this.f37925d |= Integer.MIN_VALUE;
            return o86.this.mo29972a(null, this);
        }
    }

    public o86(mdd.C15289c c15289c) {
        sq8.m48649h(c15289c, "config");
        this.f37921a = c15289c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.h86
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        C15732a c15732a;
        if (n64Var instanceof C15732a) {
            c15732a = (C15732a) n64Var;
            int i = c15732a.f37925d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15732a.f37925d = i - Integer.MIN_VALUE;
            } else {
                c15732a = new C15732a(n64Var);
            }
        }
        Object objResolveEndpoint = c15732a.f37923b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15732a.f37925d;
        if (i2 == 0) {
            wre.m54934b(objResolveEndpoint);
            ndd nddVarM58937b = z86.m58937b(this.f37921a, rneVar);
            odd oddVarM38773h = this.f37921a.m38773h();
            c15732a.f37922a = rneVar;
            c15732a.f37925d = 1;
            objResolveEndpoint = oddVarM38773h.resolveEndpoint(nddVarM58937b, c15732a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rneVar = (rne) c15732a.f37922a;
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

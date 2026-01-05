package p001o;

import p001o.kg3;

/* loaded from: classes3.dex */
public final class m86 implements h86 {

    /* renamed from: a */
    public final kg3.C14827c f34956a;

    /* renamed from: o.m86$a */
    public static final class C15249a extends o64 {

        /* renamed from: a */
        public Object f34957a;

        /* renamed from: b */
        public /* synthetic */ Object f34958b;

        /* renamed from: d */
        public int f34960d;

        public C15249a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f34958b = obj;
            this.f34960d |= Integer.MIN_VALUE;
            return m86.this.mo29972a(null, this);
        }
    }

    public m86(kg3.C14827c c14827c) {
        sq8.m48649h(c14827c, "config");
        this.f34956a = c14827c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.h86
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        C15249a c15249a;
        if (n64Var instanceof C15249a) {
            c15249a = (C15249a) n64Var;
            int i = c15249a.f34960d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15249a.f34960d = i - Integer.MIN_VALUE;
            } else {
                c15249a = new C15249a(n64Var);
            }
        }
        Object objResolveEndpoint = c15249a.f34958b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15249a.f34960d;
        if (i2 == 0) {
            wre.m54934b(objResolveEndpoint);
            lg3 lg3VarM55812b = x86.m55812b(this.f34956a, rneVar);
            mg3 mg3VarM35660h = this.f34956a.m35660h();
            c15249a.f34957a = rneVar;
            c15249a.f34960d = 1;
            objResolveEndpoint = mg3VarM35660h.resolveEndpoint(lg3VarM55812b, c15249a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rneVar = (rne) c15249a.f34957a;
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

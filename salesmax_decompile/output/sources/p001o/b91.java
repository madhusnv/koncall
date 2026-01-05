package p001o;

import p001o.sn8;

/* loaded from: classes2.dex */
public final class b91 implements sn8 {

    /* renamed from: a */
    public static final b91 f15688a = new b91();

    /* renamed from: o.b91$a */
    public static final class C12300a extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f15689a;

        /* renamed from: c */
        public int f15691c;

        public C12300a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f15689a = obj;
            this.f15691c |= Integer.MIN_VALUE;
            Object objMo68712modifyBeforeAttemptCompletiongIAlus = b91.this.mo68712modifyBeforeAttemptCompletiongIAlus(null, this);
            return objMo68712modifyBeforeAttemptCompletiongIAlus == uq8.m51918f() ? objMo68712modifyBeforeAttemptCompletiongIAlus : vre.m53350a(objMo68712modifyBeforeAttemptCompletiongIAlus);
        }
    }

    /* renamed from: o.b91$b */
    public static final class C12301b extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f15692a;

        /* renamed from: c */
        public int f15694c;

        public C12301b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f15692a = obj;
            this.f15694c |= Integer.MIN_VALUE;
            Object objMo68713modifyBeforeCompletiongIAlus = b91.this.mo68713modifyBeforeCompletiongIAlus(null, this);
            return objMo68713modifyBeforeCompletiongIAlus == uq8.m51918f() ? objMo68713modifyBeforeCompletiongIAlus : vre.m53350a(objMo68713modifyBeforeCompletiongIAlus);
        }
    }

    /* renamed from: a */
    public final void m18284a(dth dthVar, g48 g48Var) {
        if (dthVar == null || g48Var == null) {
            return;
        }
        String str = (String) g48Var.getHeaders().get("x-amz-request-id");
        if (str != null) {
            fth.m27472b(dthVar, "aws.request_id", str);
        }
        String str2 = (String) g48Var.getHeaders().get("x-amz-id-2");
        if (str2 != null) {
            fth.m27472b(dthVar, "aws.extended_request_id", str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.sn8
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo68712modifyBeforeAttemptCompletiongIAlus(ere ereVar, n64 n64Var) {
        C12300a c12300a;
        if (n64Var instanceof C12300a) {
            c12300a = (C12300a) n64Var;
            int i = c12300a.f15691c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12300a.f15691c = i - Integer.MIN_VALUE;
            } else {
                c12300a = new C12300a(n64Var);
            }
        }
        Object obj = c12300a.f15689a;
        Object objM51918f = uq8.m51918f();
        int i2 = c12300a.f15691c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return ((vre) obj).m53359j();
        }
        wre.m54934b(obj);
        m18284a(w74.m54033a(c12300a.getContext()), (g48) ereVar.mo24161d());
        c12300a.f15691c = 1;
        Object objM48563a = sn8.C16877a.m48563a(this, ereVar, c12300a);
        return objM48563a == objM51918f ? objM51918f : objM48563a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.sn8
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo68713modifyBeforeCompletiongIAlus(ere ereVar, n64 n64Var) {
        C12301b c12301b;
        if (n64Var instanceof C12301b) {
            c12301b = (C12301b) n64Var;
            int i = c12301b.f15694c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12301b.f15694c = i - Integer.MIN_VALUE;
            } else {
                c12301b = new C12301b(n64Var);
            }
        }
        Object obj = c12301b.f15692a;
        Object objM51918f = uq8.m51918f();
        int i2 = c12301b.f15694c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return ((vre) obj).m53359j();
        }
        wre.m54934b(obj);
        m18284a(w74.m54033a(c12301b.getContext()), (g48) ereVar.mo24161d());
        c12301b.f15694c = 1;
        Object objM48564b = sn8.C16877a.m48564b(this, ereVar, c12301b);
        return objM48564b == objM51918f ? objM51918f : objM48564b;
    }

    @Override // p001o.sn8
    public Object modifyBeforeDeserialization(e2e e2eVar, n64 n64Var) {
        return sn8.C16877a.m48565c(this, e2eVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeRetryLoop(c2e c2eVar, n64 n64Var) {
        return sn8.C16877a.m48566d(this, c2eVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeSerialization(eme emeVar, n64 n64Var) {
        return sn8.C16877a.m48567e(this, emeVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeSigning(c2e c2eVar, n64 n64Var) {
        return sn8.C16877a.m48568f(this, c2eVar, n64Var);
    }

    @Override // p001o.sn8
    public Object modifyBeforeTransmit(c2e c2eVar, n64 n64Var) {
        return sn8.C16877a.m48569g(this, c2eVar, n64Var);
    }

    @Override // p001o.sn8
    public void readAfterAttempt(ere ereVar) {
        sn8.C16877a.m48570h(this, ereVar);
    }

    @Override // p001o.sn8
    public void readAfterDeserialization(ere ereVar) {
        sn8.C16877a.m48571i(this, ereVar);
    }

    @Override // p001o.sn8
    public void readAfterExecution(ere ereVar) {
        sn8.C16877a.m48572j(this, ereVar);
    }

    @Override // p001o.sn8
    public void readAfterSerialization(c2e c2eVar) {
        sn8.C16877a.m48573k(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readAfterSigning(c2e c2eVar) {
        sn8.C16877a.m48574l(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readAfterTransmit(e2e e2eVar) {
        sn8.C16877a.m48575m(this, e2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeAttempt(c2e c2eVar) {
        sn8.C16877a.m48576n(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeDeserialization(e2e e2eVar) {
        sn8.C16877a.m48577o(this, e2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeExecution(eme emeVar) {
        sn8.C16877a.m48578p(this, emeVar);
    }

    @Override // p001o.sn8
    public void readBeforeSerialization(eme emeVar) {
        sn8.C16877a.m48579q(this, emeVar);
    }

    @Override // p001o.sn8
    public void readBeforeSigning(c2e c2eVar) {
        sn8.C16877a.m48580r(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeTransmit(c2e c2eVar) {
        sn8.C16877a.m48581s(this, c2eVar);
    }
}

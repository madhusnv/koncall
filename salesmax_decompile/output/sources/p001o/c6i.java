package p001o;

import p001o.sn8;

/* loaded from: classes2.dex */
public final class c6i implements sn8 {

    /* renamed from: o.c6i$a */
    public static final class C12580a extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f17416a;

        /* renamed from: c */
        public int f17418c;

        public C12580a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f17416a = obj;
            this.f17418c |= Integer.MIN_VALUE;
            Object objMo68713modifyBeforeCompletiongIAlus = c6i.this.mo68713modifyBeforeCompletiongIAlus(null, this);
            return objMo68713modifyBeforeCompletiongIAlus == uq8.m51918f() ? objMo68713modifyBeforeCompletiongIAlus : vre.m53350a(objMo68713modifyBeforeCompletiongIAlus);
        }
    }

    @Override // p001o.sn8
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public Object mo68712modifyBeforeAttemptCompletiongIAlus(ere ereVar, n64 n64Var) {
        return sn8.C16877a.m48563a(this, ereVar, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.sn8
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo68713modifyBeforeCompletiongIAlus(ere ereVar, n64 n64Var) {
        C12580a c12580a;
        if (n64Var instanceof C12580a) {
            c12580a = (C12580a) n64Var;
            int i = c12580a.f17418c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12580a.f17418c = i - Integer.MIN_VALUE;
            } else {
                c12580a = new C12580a(n64Var);
            }
        }
        Object obj = c12580a.f17416a;
        Object objM51918f = uq8.m51918f();
        int i2 = c12580a.f17418c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return ((vre) obj).m53359j();
        }
        wre.m54934b(obj);
        Throwable thM53354e = vre.m53354e(ereVar.mo25521e());
        if (thM53354e != null && (thM53354e instanceof b6i)) {
            b6i b6iVar = (b6i) thM53354e;
            if (b6iVar.m18201b() == w81.SIGV4_ASYMMETRIC) {
                return vre.m53351b(wre.m54933a(new b6i("SIGV4A support is not yet implemented for the default signer. For more information on how to enable it with the CRT signer, please refer to: https://a.co/3sf8533", b6iVar.m18201b(), thM53354e)));
            }
        }
        c12580a.f17418c = 1;
        Object objM48564b = sn8.C16877a.m48564b(this, ereVar, c12580a);
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

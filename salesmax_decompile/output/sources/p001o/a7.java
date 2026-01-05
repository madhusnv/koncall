package p001o;

import p001o.sn8;

/* loaded from: classes3.dex */
public abstract class a7 implements sn8 {

    /* renamed from: a */
    public String f14219a;

    /* renamed from: o.a7$a */
    public static final class C12102a extends o64 {

        /* renamed from: a */
        public Object f14220a;

        /* renamed from: b */
        public Object f14221b;

        /* renamed from: c */
        public /* synthetic */ Object f14222c;

        /* renamed from: e */
        public int f14224e;

        public C12102a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f14222c = obj;
            this.f14224e |= Integer.MIN_VALUE;
            return a7.m16529c(a7.this, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m16529c(a7 a7Var, c2e c2eVar, n64 n64Var) {
        C12102a c12102a;
        y38 y38VarMo16530a;
        if (n64Var instanceof C12102a) {
            c12102a = (C12102a) n64Var;
            int i = c12102a.f14224e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12102a.f14224e = i - Integer.MIN_VALUE;
            } else {
                c12102a = a7Var.new C12102a(n64Var);
            }
        }
        Object objMo16531b = c12102a.f14222c;
        Object objM51918f = uq8.m51918f();
        int i2 = c12102a.f14224e;
        if (i2 == 0) {
            wre.m54934b(objMo16531b);
            if (a7Var.f14219a == null) {
                c12102a.f14220a = a7Var;
                c12102a.f14221b = c2eVar;
                c12102a.f14224e = 1;
                objMo16531b = a7Var.mo16531b(c2eVar, c12102a);
                if (objMo16531b == objM51918f) {
                    return objM51918f;
                }
            }
            String str = a7Var.f14219a;
            return (str != null || (y38VarMo16530a = a7Var.mo16530a(c2eVar, str)) == null) ? (y38) c2eVar.mo20099c() : y38VarMo16530a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c2e c2eVar2 = (c2e) c12102a.f14221b;
        a7 a7Var2 = (a7) c12102a.f14220a;
        wre.m54934b(objMo16531b);
        c2eVar = c2eVar2;
        a7Var = a7Var2;
        a7Var.f14219a = (String) objMo16531b;
        String str2 = a7Var.f14219a;
        if (str2 != null) {
        }
    }

    /* renamed from: a */
    public abstract y38 mo16530a(c2e c2eVar, String str);

    /* renamed from: b */
    public abstract Object mo16531b(c2e c2eVar, n64 n64Var);

    @Override // p001o.sn8
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public Object mo68712modifyBeforeAttemptCompletiongIAlus(ere ereVar, n64 n64Var) {
        return sn8.C16877a.m48563a(this, ereVar, n64Var);
    }

    @Override // p001o.sn8
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    public Object mo68713modifyBeforeCompletiongIAlus(ere ereVar, n64 n64Var) {
        return sn8.C16877a.m48564b(this, ereVar, n64Var);
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
        return m16529c(this, c2eVar, n64Var);
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

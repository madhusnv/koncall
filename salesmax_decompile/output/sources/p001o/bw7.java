package p001o;

import p001o.sn8;
import p001o.vre;
import p001o.xej;

/* loaded from: classes3.dex */
public final class bw7 implements sn8 {

    /* renamed from: a */
    public static final bw7 f16923a = new bw7();

    /* renamed from: o.bw7$a */
    public static final class C12516a extends o64 {

        /* renamed from: a */
        public Object f16924a;

        /* renamed from: b */
        public Object f16925b;

        /* renamed from: c */
        public /* synthetic */ Object f16926c;

        /* renamed from: e */
        public int f16928e;

        public C12516a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f16926c = obj;
            this.f16928e |= Integer.MIN_VALUE;
            return bw7.this.modifyBeforeDeserialization(null, this);
        }
    }

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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.sn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object modifyBeforeDeserialization(e2e e2eVar, n64 n64Var) {
        C12516a c12516a;
        g48 g48Var;
        Object objM53351b;
        xej.C18137d c18137dM56197b;
        boolean z;
        if (n64Var instanceof C12516a) {
            c12516a = (C12516a) n64Var;
            int i = c12516a.f16928e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12516a.f16928e = i - Integer.MIN_VALUE;
            } else {
                c12516a = new C12516a(n64Var);
            }
        }
        Object objM39980a = c12516a.f16926c;
        Object objM51918f = uq8.m51918f();
        int i2 = c12516a.f16928e;
        if (i2 == 0) {
            wre.m54934b(objM39980a);
            g48Var = (g48) e2eVar.mo24161d();
            if (!t48.m49282c(g48Var.getStatus())) {
                return g48Var;
            }
            m18 body = g48Var.getBody();
            c12516a.f16924a = this;
            c12516a.f16925b = g48Var;
            c12516a.f16928e = 1;
            objM39980a = n18.m39980a(body, c12516a);
            if (objM39980a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g48Var = (g48) c12516a.f16925b;
            wre.m54934b(objM39980a);
        }
        g48 g48Var2 = g48Var;
        byte[] bArr = (byte[]) objM39980a;
        if (bArr == null) {
            return g48Var2;
        }
        rej rejVarM48286a = sej.m48286a(bArr);
        try {
            vre.C17665a c17665a = vre.f50797b;
            xej xejVarMo36943a = rejVarM48286a.mo36943a();
            do {
                z = xejVarMo36943a instanceof xej.C18134a;
                if (!z) {
                    xejVarMo36943a = rejVarM48286a.nextToken();
                }
                if (xejVarMo36943a == null) {
                    break;
                }
            } while (!z);
            objM53351b = vre.m53351b((xej.C18134a) xejVarMo36943a);
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        if (vre.m53356g(objM53351b)) {
            objM53351b = null;
        }
        xej.C18134a c18134a = (xej.C18134a) objM53351b;
        s48 s48VarM47809o = sq8.m48644c((c18134a == null || (c18137dM56197b = c18134a.m56197b()) == null) ? null : c18137dM56197b.m56200a(), "Error") ? s48.f44774c.m47809o() : null;
        return j48.m33189d(g48Var2, s48VarM47809o == null ? g48Var2.getStatus() : s48VarM47809o, null, m18.Companion.m38178a(bArr), 2, null);
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

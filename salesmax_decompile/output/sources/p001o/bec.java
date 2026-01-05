package p001o;

import p001o.fmh;
import p001o.sn8;

/* loaded from: classes3.dex */
public final class bec implements sn8 {

    /* renamed from: a */
    public final ydc f16052a;

    /* renamed from: b */
    public final String f16053b;

    /* renamed from: c */
    public final String f16054c;

    /* renamed from: d */
    public final fmh f16055d;

    /* renamed from: e */
    public ulh f16056e;

    /* renamed from: f */
    public ulh f16057f;

    /* renamed from: g */
    public ulh f16058g;

    /* renamed from: h */
    public ulh f16059h;

    /* renamed from: i */
    public int f16060i;

    /* renamed from: j */
    public final qx0 f16061j;

    public bec(ydc ydcVar, String str, String str2, fmh fmhVar) {
        sq8.m48649h(ydcVar, "metrics");
        sq8.m48649h(str, "service");
        sq8.m48649h(str2, "operation");
        sq8.m48649h(fmhVar, "timeSource");
        this.f16052a = ydcVar;
        this.f16053b = str;
        this.f16054c = str2;
        this.f16055d = fmhVar;
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.service", str);
        rx0Var.m47216b("rpc.method", str2);
        this.f16061j = rx0Var.m47215a();
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
        sq8.m48649h(ereVar, "context");
        this.f16052a.m57647h().mo40753a(1L, this.f16061j, this.f16052a.m57642c().mo40626b().mo28089a());
        this.f16060i++;
        ulh ulhVar = this.f16059h;
        if (ulhVar != null) {
            long jMo27104a = ulhVar.mo27104a();
            ry7.m47288a(this.f16052a.m57645f(), jMo27104a, this.f16061j, this.f16052a.m57642c().mo40626b().mo28089a());
            k16 k16Var = (k16) tx0.m50744i(ereVar.mo25341b(), zf6.f57128a.m59376a());
            if (k16Var != null) {
                ry7.m47289b(this.f16052a.m57646g(), k16.m34869O(jMo27104a, k16Var.m34896X()), this.f16061j, null, 4, null);
            }
        }
    }

    @Override // p001o.sn8
    public void readAfterDeserialization(ere ereVar) {
        sq8.m48649h(ereVar, "context");
        ulh ulhVar = this.f16058g;
        if (ulhVar != null) {
            ry7.m47288a(this.f16052a.m57641b(), ulhVar.mo27104a(), this.f16061j, this.f16052a.m57642c().mo40626b().mo28089a());
        }
    }

    @Override // p001o.sn8
    public void readAfterExecution(ere ereVar) {
        qx0 qx0Var;
        sq8.m48649h(ereVar, "context");
        x54 x54VarMo28089a = this.f16052a.m57642c().mo40626b().mo28089a();
        ulh ulhVar = this.f16056e;
        if (ulhVar != null) {
            ry7.m47288a(this.f16052a.m57648i(), ulhVar.mo27104a(), this.f16061j, x54VarMo28089a);
        }
        Throwable thM53354e = vre.m53354e(ereVar.mo25521e());
        if (thM53354e != null) {
            String strMo26337d = kge.m35689b(thM53354e.getClass()).mo26337d();
            if (strMo26337d != null) {
                rx0 rx0Var = new rx0();
                rx0Var.m47216b("exception.type", strMo26337d);
                tob tobVarM47215a = rx0Var.m47215a();
                tx0.m50739d(tobVarM47215a, this.f16061j);
                qx0Var = tobVarM47215a;
            } else {
                qx0Var = this.f16061j;
            }
            this.f16052a.m57649j().mo40753a(1L, qx0Var, x54VarMo28089a);
        }
    }

    @Override // p001o.sn8
    public void readAfterSerialization(c2e c2eVar) {
        sq8.m48649h(c2eVar, "context");
        ulh ulhVar = this.f16057f;
        if (ulhVar != null) {
            ry7.m47288a(this.f16052a.m57650k(), ulhVar.mo27104a(), this.f16061j, this.f16052a.m57642c().mo40626b().mo28089a());
        }
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
        sq8.m48649h(c2eVar, "context");
        this.f16059h = this.f16055d.mo27091a();
    }

    @Override // p001o.sn8
    public void readBeforeDeserialization(e2e e2eVar) {
        sq8.m48649h(e2eVar, "context");
        this.f16058g = this.f16055d.mo27091a();
    }

    @Override // p001o.sn8
    public void readBeforeExecution(eme emeVar) {
        sq8.m48649h(emeVar, "context");
        this.f16056e = this.f16055d.mo27091a();
    }

    @Override // p001o.sn8
    public void readBeforeSerialization(eme emeVar) {
        sq8.m48649h(emeVar, "context");
        this.f16057f = this.f16055d.mo27091a();
    }

    @Override // p001o.sn8
    public void readBeforeSigning(c2e c2eVar) {
        sn8.C16877a.m48580r(this, c2eVar);
    }

    @Override // p001o.sn8
    public void readBeforeTransmit(c2e c2eVar) {
        sn8.C16877a.m48581s(this, c2eVar);
    }

    public /* synthetic */ bec(ydc ydcVar, String str, String str2, fmh fmhVar, int i, id5 id5Var) {
        this(ydcVar, str, str2, (i & 8) != 0 ? fmh.C13489a.f23681a : fmhVar);
    }
}

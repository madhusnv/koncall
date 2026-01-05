package p001o;

import org.apache.http.protocol.HTTP;
import p001o.sn8;

/* loaded from: classes3.dex */
public final class r64 implements sn8 {

    /* renamed from: a */
    public final long f43049a;

    public r64(long j) {
        this.f43049a = j;
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
        y38 y38Var = (y38) c2eVar.mo20099c();
        Long contentLength = y38Var.getBody().getContentLength();
        if ((contentLength != null ? contentLength.longValue() : Long.MAX_VALUE) < this.f43049a) {
            return y38Var;
        }
        z38 z38VarM26053c = f48.m26053c(y38Var);
        a48.m16408d(z38VarM26053c, "Expect", HTTP.EXPECT_CONTINUE);
        return z38VarM26053c.m58665b();
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

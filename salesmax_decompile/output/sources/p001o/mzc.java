package p001o;

import androidx.media3.common.C2181a;
import p001o.hyh;

/* loaded from: classes2.dex */
public final class mzc implements qaf {

    /* renamed from: a */
    public C2181a f36134a;

    /* renamed from: b */
    public umh f36135b;

    /* renamed from: c */
    public uth f36136c;

    public mzc(String str) {
        this.f36134a = new C2181a.b().o0(str).m6748K();
    }

    @Override // p001o.qaf
    /* renamed from: a */
    public void mo29669a(zwc zwcVar) {
        m39918b();
        long jM51798e = this.f36135b.m51798e();
        long jM51799f = this.f36135b.m51799f();
        if (jM51798e == -9223372036854775807L || jM51799f == -9223372036854775807L) {
            return;
        }
        C2181a c2181a = this.f36134a;
        if (jM51799f != c2181a.f7948s) {
            C2181a c2181aM6748K = c2181a.m6707a().s0(jM51799f).m6748K();
            this.f36134a = c2181aM6748K;
            this.f36136c.mo7072b(c2181aM6748K);
        }
        int iM60020a = zwcVar.m60020a();
        this.f36136c.m52027e(zwcVar, iM60020a);
        this.f36136c.mo7071a(jM51798e, 1, iM60020a, 0, null);
    }

    /* renamed from: b */
    public final void m39918b() {
        op0.m42519i(this.f36135b);
        sqi.m48729h(this.f36136c);
    }

    @Override // p001o.qaf
    /* renamed from: c */
    public void mo29670c(umh umhVar, vq6 vq6Var, hyh.C14129d c14129d) {
        this.f36135b = umhVar;
        c14129d.m31294a();
        uth uthVarMo32487f = vq6Var.mo32487f(c14129d.m31296c(), 5);
        this.f36136c = uthVarMo32487f;
        uthVarMo32487f.mo7072b(this.f36134a);
    }
}

package p001o;

import androidx.media3.exoplayer.C2213j;
import java.io.IOException;
import p001o.x4b;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class bta implements x4b, x4b.InterfaceC18049a {

    /* renamed from: a */
    public final x8b.C18076b f16804a;

    /* renamed from: b */
    public final long f16805b;

    /* renamed from: c */
    public final ob0 f16806c;

    /* renamed from: d */
    public x8b f16807d;

    /* renamed from: e */
    public x4b f16808e;

    /* renamed from: f */
    public x4b.InterfaceC18049a f16809f;

    /* renamed from: g */
    public InterfaceC12501a f16810g;

    /* renamed from: h */
    public boolean f16811h;

    /* renamed from: q */
    public long f16812q = -9223372036854775807L;

    /* renamed from: o.bta$a */
    public interface InterfaceC12501a {
        /* renamed from: a */
        void m19780a(x8b.C18076b c18076b, IOException iOException);

        /* renamed from: b */
        void m19781b(x8b.C18076b c18076b);
    }

    public bta(x8b.C18076b c18076b, ob0 ob0Var, long j) {
        this.f16804a = c18076b;
        this.f16806c = ob0Var;
        this.f16805b = j;
    }

    /* renamed from: a */
    public void m19772a(x8b.C18076b c18076b) {
        long jM19775o = m19775o(this.f16805b);
        x4b x4bVarMo6931a = ((x8b) op0.m42515e(this.f16807d)).mo6931a(c18076b, this.f16806c, jM19775o);
        this.f16808e = x4bVarMo6931a;
        if (this.f16809f != null) {
            x4bVarMo6931a.mo7013q(this, jM19775o);
        }
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        x4b x4bVar = this.f16808e;
        return x4bVar != null && x4bVar.mo7002b();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        x4b x4bVar = this.f16808e;
        return x4bVar != null && x4bVar.mo7003c(c2213j);
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        return ((x4b) sqi.m48729h(this.f16808e)).mo7004d();
    }

    @Override // p001o.x4b
    /* renamed from: e */
    public long mo7005e(long j, abf abfVar) {
        return ((x4b) sqi.m48729h(this.f16808e)).mo7005e(j, abfVar);
    }

    @Override // p001o.x4b.InterfaceC18049a
    /* renamed from: f */
    public void mo7240f(x4b x4bVar) {
        ((x4b.InterfaceC18049a) sqi.m48729h(this.f16809f)).mo7240f(this);
        InterfaceC12501a interfaceC12501a = this.f16810g;
        if (interfaceC12501a != null) {
            interfaceC12501a.m19781b(this.f16804a);
        }
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        return ((x4b) sqi.m48729h(this.f16808e)).mo7006g();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
        ((x4b) sqi.m48729h(this.f16808e)).mo7007h(j);
    }

    @Override // p001o.x4b
    /* renamed from: i */
    public long mo7008i(long j) {
        return ((x4b) sqi.m48729h(this.f16808e)).mo7008i(j);
    }

    @Override // p001o.x4b
    /* renamed from: j */
    public long mo7009j() {
        return ((x4b) sqi.m48729h(this.f16808e)).mo7009j();
    }

    /* renamed from: l */
    public long m19773l() {
        return this.f16812q;
    }

    /* renamed from: m */
    public long m19774m() {
        return this.f16805b;
    }

    @Override // p001o.x4b
    /* renamed from: n */
    public void mo7011n() throws IOException {
        try {
            x4b x4bVar = this.f16808e;
            if (x4bVar != null) {
                x4bVar.mo7011n();
            } else {
                x8b x8bVar = this.f16807d;
                if (x8bVar != null) {
                    x8bVar.mo6934j();
                }
            }
        } catch (IOException e) {
            InterfaceC12501a interfaceC12501a = this.f16810g;
            if (interfaceC12501a == null) {
                throw e;
            }
            if (this.f16811h) {
                return;
            }
            this.f16811h = true;
            interfaceC12501a.m19780a(this.f16804a, e);
        }
    }

    /* renamed from: o */
    public final long m19775o(long j) {
        long j2 = this.f16812q;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // p001o.lef.InterfaceC15066a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo7010k(x4b x4bVar) {
        ((x4b.InterfaceC18049a) sqi.m48729h(this.f16809f)).mo7010k(this);
    }

    @Override // p001o.x4b
    /* renamed from: q */
    public void mo7013q(x4b.InterfaceC18049a interfaceC18049a, long j) {
        this.f16809f = interfaceC18049a;
        x4b x4bVar = this.f16808e;
        if (x4bVar != null) {
            x4bVar.mo7013q(this, m19775o(this.f16805b));
        }
    }

    /* renamed from: r */
    public void m19777r(long j) {
        this.f16812q = j;
    }

    @Override // p001o.x4b
    /* renamed from: s */
    public sth mo7014s() {
        return ((x4b) sqi.m48729h(this.f16808e)).mo7014s();
    }

    @Override // p001o.x4b
    /* renamed from: t */
    public void mo7015t(long j, boolean z) {
        ((x4b) sqi.m48729h(this.f16808e)).mo7015t(j, z);
    }

    @Override // p001o.x4b
    /* renamed from: u */
    public long mo7016u(ko6[] ko6VarArr, boolean[] zArr, t0f[] t0fVarArr, boolean[] zArr2, long j) {
        long j2 = this.f16812q;
        long j3 = (j2 == -9223372036854775807L || j != this.f16805b) ? j : j2;
        this.f16812q = -9223372036854775807L;
        return ((x4b) sqi.m48729h(this.f16808e)).mo7016u(ko6VarArr, zArr, t0fVarArr, zArr2, j3);
    }

    /* renamed from: v */
    public void m19778v() {
        if (this.f16808e != null) {
            ((x8b) op0.m42515e(this.f16807d)).mo6933e(this.f16808e);
        }
    }

    /* renamed from: w */
    public void m19779w(x8b x8bVar) {
        op0.m42517g(this.f16807d == null);
        this.f16807d = x8bVar;
    }
}

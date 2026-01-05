package p001o;

import androidx.media3.common.C2181a;
import p001o.hyh;
import p001o.knb;

/* loaded from: classes2.dex */
public final class jnb implements n46 {

    /* renamed from: e */
    public String f30793e;

    /* renamed from: f */
    public uth f30794f;

    /* renamed from: i */
    public boolean f30797i;

    /* renamed from: k */
    public int f30799k;

    /* renamed from: l */
    public int f30800l;

    /* renamed from: n */
    public int f30802n;

    /* renamed from: o */
    public int f30803o;

    /* renamed from: s */
    public int f30807s;

    /* renamed from: u */
    public boolean f30809u;

    /* renamed from: d */
    public int f30792d = 0;

    /* renamed from: a */
    public final zwc f30789a = new zwc(new byte[15], 2);

    /* renamed from: b */
    public final ywc f30790b = new ywc();

    /* renamed from: c */
    public final zwc f30791c = new zwc();

    /* renamed from: p */
    public knb.C14888b f30804p = new knb.C14888b();

    /* renamed from: q */
    public int f30805q = -2147483647;

    /* renamed from: r */
    public int f30806r = -1;

    /* renamed from: t */
    public long f30808t = -1;

    /* renamed from: j */
    public boolean f30798j = true;

    /* renamed from: m */
    public boolean f30801m = true;

    /* renamed from: g */
    public double f30795g = -9.223372036854776E18d;

    /* renamed from: h */
    public double f30796h = -9.223372036854776E18d;

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) throws byc {
        op0.m42519i(this.f30794f);
        while (zwcVar.m60020a() > 0) {
            int i = this.f30792d;
            if (i != 0) {
                if (i == 1) {
                    m34125f(zwcVar, this.f30789a, false);
                    if (this.f30789a.m60020a() != 0) {
                        this.f30801m = false;
                    } else if (m34128i()) {
                        this.f30789a.m60017U(0);
                        uth uthVar = this.f30794f;
                        zwc zwcVar2 = this.f30789a;
                        uthVar.m52027e(zwcVar2, zwcVar2.m60026g());
                        this.f30789a.m60013Q(2);
                        this.f30791c.m60013Q(this.f30804p.f32474c);
                        this.f30801m = true;
                        this.f30792d = 2;
                    } else if (this.f30789a.m60026g() < 15) {
                        zwc zwcVar3 = this.f30789a;
                        zwcVar3.m60016T(zwcVar3.m60026g() + 1);
                        this.f30801m = false;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    if (m34129j(this.f30804p.f32472a)) {
                        m34125f(zwcVar, this.f30791c, true);
                    }
                    m34131l(zwcVar);
                    int i2 = this.f30802n;
                    knb.C14888b c14888b = this.f30804p;
                    if (i2 == c14888b.f32474c) {
                        int i3 = c14888b.f32472a;
                        if (i3 == 1) {
                            m34127h(new ywc(this.f30791c.m60024e()));
                        } else if (i3 == 17) {
                            this.f30807s = knb.m35954f(new ywc(this.f30791c.m60024e()));
                        } else if (i3 == 2) {
                            m34126g();
                        }
                        this.f30792d = 1;
                    }
                }
            } else if (m34130k(zwcVar)) {
                this.f30792d = 1;
            }
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f30792d = 0;
        this.f30800l = 0;
        this.f30789a.m60013Q(2);
        this.f30802n = 0;
        this.f30803o = 0;
        this.f30805q = -2147483647;
        this.f30806r = -1;
        this.f30807s = 0;
        this.f30808t = -1L;
        this.f30809u = false;
        this.f30797i = false;
        this.f30801m = true;
        this.f30798j = true;
        this.f30795g = -9.223372036854776E18d;
        this.f30796h = -9.223372036854776E18d;
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f30793e = c14129d.m31295b();
        this.f30794f = vq6Var.mo32487f(c14129d.m31296c(), 1);
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f30799k = i;
        if (!this.f30798j && (this.f30803o != 0 || !this.f30801m)) {
            this.f30797i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f30797i) {
                this.f30796h = j;
            } else {
                this.f30795g = j;
            }
        }
    }

    /* renamed from: f */
    public final void m34125f(zwc zwcVar, zwc zwcVar2, boolean z) {
        int iM60025f = zwcVar.m60025f();
        int iMin = Math.min(zwcVar.m60020a(), zwcVar2.m60020a());
        zwcVar.m60031l(zwcVar2.m60024e(), zwcVar2.m60025f(), iMin);
        zwcVar2.m60018V(iMin);
        if (z) {
            zwcVar.m60017U(iM60025f);
        }
    }

    /* renamed from: g */
    public final void m34126g() {
        int i;
        if (this.f30809u) {
            this.f30798j = false;
            i = 1;
        } else {
            i = 0;
        }
        double d = ((this.f30806r - this.f30807s) * 1000000.0d) / this.f30805q;
        long jRound = Math.round(this.f30795g);
        if (this.f30797i) {
            this.f30797i = false;
            this.f30795g = this.f30796h;
        } else {
            this.f30795g += d;
        }
        this.f30794f.mo7071a(jRound, i, this.f30803o, 0, null);
        this.f30809u = false;
        this.f30807s = 0;
        this.f30803o = 0;
    }

    /* renamed from: h */
    public final void m34127h(ywc ywcVar) throws byc {
        knb.C14889c c14889cM35956h = knb.m35956h(ywcVar);
        this.f30805q = c14889cM35956h.f32476b;
        this.f30806r = c14889cM35956h.f32477c;
        long j = this.f30808t;
        long j2 = this.f30804p.f32473b;
        if (j != j2) {
            this.f30808t = j2;
            String str = "mhm1";
            if (c14889cM35956h.f32475a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(c14889cM35956h.f32475a));
            }
            byte[] bArr = c14889cM35956h.f32478d;
            this.f30794f.mo7072b(new C2181a.b().a0(this.f30793e).o0("audio/mhm1").p0(this.f30805q).m6752O(str).b0((bArr == null || bArr.length <= 0) ? null : nf8.m40501G(sqi.f45795f, bArr)).m6748K());
        }
        this.f30809u = true;
    }

    /* renamed from: i */
    public final boolean m34128i() throws byc {
        int iM60026g = this.f30789a.m60026g();
        this.f30790b.m58451o(this.f30789a.m60024e(), iM60026g);
        boolean zM35955g = knb.m35955g(this.f30790b, this.f30804p);
        if (zM35955g) {
            this.f30802n = 0;
            this.f30803o += this.f30804p.f32474c + iM60026g;
        }
        return zM35955g;
    }

    /* renamed from: j */
    public final boolean m34129j(int i) {
        return i == 1 || i == 17;
    }

    /* renamed from: k */
    public final boolean m34130k(zwc zwcVar) {
        int i = this.f30799k;
        if ((i & 2) == 0) {
            zwcVar.m60017U(zwcVar.m60026g());
            return false;
        }
        if ((i & 4) != 0) {
            return true;
        }
        while (zwcVar.m60020a() > 0) {
            int i2 = this.f30800l << 8;
            this.f30800l = i2;
            int iM60004H = i2 | zwcVar.m60004H();
            this.f30800l = iM60004H;
            if (knb.m35953e(iM60004H)) {
                zwcVar.m60017U(zwcVar.m60025f() - 3);
                this.f30800l = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final void m34131l(zwc zwcVar) {
        int iMin = Math.min(zwcVar.m60020a(), this.f30804p.f32474c - this.f30802n);
        this.f30794f.m52027e(zwcVar, iMin);
        this.f30802n += iMin;
    }
}

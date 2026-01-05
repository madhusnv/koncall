package p001o;

import androidx.media3.common.C2181a;
import p001o.fa;
import p001o.hyh;

/* loaded from: classes2.dex */
public final class ea implements n46 {

    /* renamed from: a */
    public final ywc f21231a;

    /* renamed from: b */
    public final zwc f21232b;

    /* renamed from: c */
    public final String f21233c;

    /* renamed from: d */
    public final int f21234d;

    /* renamed from: e */
    public String f21235e;

    /* renamed from: f */
    public uth f21236f;

    /* renamed from: g */
    public int f21237g;

    /* renamed from: h */
    public int f21238h;

    /* renamed from: i */
    public boolean f21239i;

    /* renamed from: j */
    public long f21240j;

    /* renamed from: k */
    public C2181a f21241k;

    /* renamed from: l */
    public int f21242l;

    /* renamed from: m */
    public long f21243m;

    public ea() {
        this(null, 0);
    }

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) {
        op0.m42519i(this.f21236f);
        while (zwcVar.m60020a() > 0) {
            int i = this.f21237g;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(zwcVar.m60020a(), this.f21242l - this.f21238h);
                        this.f21236f.m52027e(zwcVar, iMin);
                        int i2 = this.f21238h + iMin;
                        this.f21238h = i2;
                        if (i2 == this.f21242l) {
                            op0.m42517g(this.f21243m != -9223372036854775807L);
                            this.f21236f.mo7071a(this.f21243m, 1, this.f21242l, 0, null);
                            this.f21243m += this.f21240j;
                            this.f21237g = 0;
                        }
                    }
                } else if (m24651f(zwcVar, this.f21232b.m60024e(), 128)) {
                    m24652g();
                    this.f21232b.m60017U(0);
                    this.f21236f.m52027e(this.f21232b, 128);
                    this.f21237g = 2;
                }
            } else if (m24653h(zwcVar)) {
                this.f21237g = 1;
                this.f21232b.m60024e()[0] = 11;
                this.f21232b.m60024e()[1] = 119;
                this.f21238h = 2;
            }
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f21237g = 0;
        this.f21238h = 0;
        this.f21239i = false;
        this.f21243m = -9223372036854775807L;
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f21235e = c14129d.m31295b();
        this.f21236f = vq6Var.mo32487f(c14129d.m31296c(), 1);
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f21243m = j;
    }

    /* renamed from: f */
    public final boolean m24651f(zwc zwcVar, byte[] bArr, int i) {
        int iMin = Math.min(zwcVar.m60020a(), i - this.f21238h);
        zwcVar.m60031l(bArr, this.f21238h, iMin);
        int i2 = this.f21238h + iMin;
        this.f21238h = i2;
        return i2 == i;
    }

    /* renamed from: g */
    public final void m24652g() {
        this.f21231a.m58452p(0);
        fa.C13373b c13373bM26327f = fa.m26327f(this.f21231a);
        C2181a c2181a = this.f21241k;
        if (c2181a == null || c13373bM26327f.f23015d != c2181a.f7919B || c13373bM26327f.f23014c != c2181a.f7920C || !sqi.m48724c(c13373bM26327f.f23012a, c2181a.f7943n)) {
            C2181a.b bVarJ0 = new C2181a.b().a0(this.f21235e).o0(c13373bM26327f.f23012a).m6751N(c13373bM26327f.f23015d).p0(c13373bM26327f.f23014c).e0(this.f21233c).m0(this.f21234d).j0(c13373bM26327f.f23018g);
            if ("audio/ac3".equals(c13373bM26327f.f23012a)) {
                bVarJ0.m6750M(c13373bM26327f.f23018g);
            }
            C2181a c2181aM6748K = bVarJ0.m6748K();
            this.f21241k = c2181aM6748K;
            this.f21236f.mo7072b(c2181aM6748K);
        }
        this.f21242l = c13373bM26327f.f23016e;
        this.f21240j = (c13373bM26327f.f23017f * 1000000) / this.f21241k.f7920C;
    }

    /* renamed from: h */
    public final boolean m24653h(zwc zwcVar) {
        while (true) {
            if (zwcVar.m60020a() <= 0) {
                return false;
            }
            if (this.f21239i) {
                int iM60004H = zwcVar.m60004H();
                if (iM60004H == 119) {
                    this.f21239i = false;
                    return true;
                }
                this.f21239i = iM60004H == 11;
            } else {
                this.f21239i = zwcVar.m60004H() == 11;
            }
        }
    }

    public ea(String str, int i) {
        ywc ywcVar = new ywc(new byte[128]);
        this.f21231a = ywcVar;
        this.f21232b = new zwc(ywcVar.f56210a);
        this.f21237g = 0;
        this.f21243m = -9223372036854775807L;
        this.f21233c = str;
        this.f21234d = i;
    }
}

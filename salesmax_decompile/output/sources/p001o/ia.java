package p001o;

import androidx.media3.common.C2181a;
import p001o.hyh;
import p001o.ja;

/* loaded from: classes2.dex */
public final class ia implements n46 {

    /* renamed from: a */
    public final ywc f28302a;

    /* renamed from: b */
    public final zwc f28303b;

    /* renamed from: c */
    public final String f28304c;

    /* renamed from: d */
    public final int f28305d;

    /* renamed from: e */
    public String f28306e;

    /* renamed from: f */
    public uth f28307f;

    /* renamed from: g */
    public int f28308g;

    /* renamed from: h */
    public int f28309h;

    /* renamed from: i */
    public boolean f28310i;

    /* renamed from: j */
    public boolean f28311j;

    /* renamed from: k */
    public long f28312k;

    /* renamed from: l */
    public C2181a f28313l;

    /* renamed from: m */
    public int f28314m;

    /* renamed from: n */
    public long f28315n;

    public ia() {
        this(null, 0);
    }

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) {
        op0.m42519i(this.f28307f);
        while (zwcVar.m60020a() > 0) {
            int i = this.f28308g;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(zwcVar.m60020a(), this.f28314m - this.f28309h);
                        this.f28307f.m52027e(zwcVar, iMin);
                        int i2 = this.f28309h + iMin;
                        this.f28309h = i2;
                        if (i2 == this.f28314m) {
                            op0.m42517g(this.f28315n != -9223372036854775807L);
                            this.f28307f.mo7071a(this.f28315n, 1, this.f28314m, 0, null);
                            this.f28315n += this.f28312k;
                            this.f28308g = 0;
                        }
                    }
                } else if (m31782f(zwcVar, this.f28303b.m60024e(), 16)) {
                    m31783g();
                    this.f28303b.m60017U(0);
                    this.f28307f.m52027e(this.f28303b, 16);
                    this.f28308g = 2;
                }
            } else if (m31784h(zwcVar)) {
                this.f28308g = 1;
                this.f28303b.m60024e()[0] = -84;
                this.f28303b.m60024e()[1] = (byte) (this.f28311j ? 65 : 64);
                this.f28309h = 2;
            }
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f28308g = 0;
        this.f28309h = 0;
        this.f28310i = false;
        this.f28311j = false;
        this.f28315n = -9223372036854775807L;
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f28306e = c14129d.m31295b();
        this.f28307f = vq6Var.mo32487f(c14129d.m31296c(), 1);
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f28315n = j;
    }

    /* renamed from: f */
    public final boolean m31782f(zwc zwcVar, byte[] bArr, int i) {
        int iMin = Math.min(zwcVar.m60020a(), i - this.f28309h);
        zwcVar.m60031l(bArr, this.f28309h, iMin);
        int i2 = this.f28309h + iMin;
        this.f28309h = i2;
        return i2 == i;
    }

    /* renamed from: g */
    public final void m31783g() {
        this.f28302a.m58452p(0);
        ja.C14477b c14477bM33430d = ja.m33430d(this.f28302a);
        C2181a c2181a = this.f28313l;
        if (c2181a == null || c14477bM33430d.f30014c != c2181a.f7919B || c14477bM33430d.f30013b != c2181a.f7920C || !"audio/ac4".equals(c2181a.f7943n)) {
            C2181a c2181aM6748K = new C2181a.b().a0(this.f28306e).o0("audio/ac4").m6751N(c14477bM33430d.f30014c).p0(c14477bM33430d.f30013b).e0(this.f28304c).m0(this.f28305d).m6748K();
            this.f28313l = c2181aM6748K;
            this.f28307f.mo7072b(c2181aM6748K);
        }
        this.f28314m = c14477bM33430d.f30015d;
        this.f28312k = (c14477bM33430d.f30016e * 1000000) / this.f28313l.f7920C;
    }

    /* renamed from: h */
    public final boolean m31784h(zwc zwcVar) {
        int iM60004H;
        while (true) {
            if (zwcVar.m60020a() <= 0) {
                return false;
            }
            if (this.f28310i) {
                iM60004H = zwcVar.m60004H();
                this.f28310i = iM60004H == 172;
                if (iM60004H == 64 || iM60004H == 65) {
                    break;
                }
            } else {
                this.f28310i = zwcVar.m60004H() == 172;
            }
        }
        this.f28311j = iM60004H == 65;
        return true;
    }

    public ia(String str, int i) {
        ywc ywcVar = new ywc(new byte[16]);
        this.f28302a = ywcVar;
        this.f28303b = new zwc(ywcVar.f56210a);
        this.f28308g = 0;
        this.f28309h = 0;
        this.f28310i = false;
        this.f28311j = false;
        this.f28315n = -9223372036854775807L;
        this.f28304c = str;
        this.f28305d = i;
    }
}

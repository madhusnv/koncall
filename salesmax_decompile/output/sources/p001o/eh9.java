package p001o;

import androidx.media3.common.C2181a;
import java.util.Collections;
import p001o.hyh;
import p001o.w5;

/* loaded from: classes2.dex */
public final class eh9 implements n46 {

    /* renamed from: a */
    public final String f21661a;

    /* renamed from: b */
    public final int f21662b;

    /* renamed from: c */
    public final zwc f21663c;

    /* renamed from: d */
    public final ywc f21664d;

    /* renamed from: e */
    public uth f21665e;

    /* renamed from: f */
    public String f21666f;

    /* renamed from: g */
    public C2181a f21667g;

    /* renamed from: h */
    public int f21668h;

    /* renamed from: i */
    public int f21669i;

    /* renamed from: j */
    public int f21670j;

    /* renamed from: k */
    public int f21671k;

    /* renamed from: l */
    public long f21672l;

    /* renamed from: m */
    public boolean f21673m;

    /* renamed from: n */
    public int f21674n;

    /* renamed from: o */
    public int f21675o;

    /* renamed from: p */
    public int f21676p;

    /* renamed from: q */
    public boolean f21677q;

    /* renamed from: r */
    public long f21678r;

    /* renamed from: s */
    public int f21679s;

    /* renamed from: t */
    public long f21680t;

    /* renamed from: u */
    public int f21681u;

    /* renamed from: v */
    public String f21682v;

    public eh9(String str, int i) {
        this.f21661a = str;
        this.f21662b = i;
        zwc zwcVar = new zwc(1024);
        this.f21663c = zwcVar;
        this.f21664d = new ywc(zwcVar.m60024e());
        this.f21672l = -9223372036854775807L;
    }

    /* renamed from: f */
    public static long m25047f(ywc ywcVar) {
        return ywcVar.m58444h((ywcVar.m58444h(2) + 1) * 8);
    }

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) throws byc {
        op0.m42519i(this.f21665e);
        while (zwcVar.m60020a() > 0) {
            int i = this.f21668h;
            if (i != 0) {
                if (i == 1) {
                    int iM60004H = zwcVar.m60004H();
                    if ((iM60004H & 224) == 224) {
                        this.f21671k = iM60004H;
                        this.f21668h = 2;
                    } else if (iM60004H != 86) {
                        this.f21668h = 0;
                    }
                } else if (i == 2) {
                    int iM60004H2 = ((this.f21671k & (-225)) << 8) | zwcVar.m60004H();
                    this.f21670j = iM60004H2;
                    if (iM60004H2 > this.f21663c.m60024e().length) {
                        m25054m(this.f21670j);
                    }
                    this.f21669i = 0;
                    this.f21668h = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(zwcVar.m60020a(), this.f21670j - this.f21669i);
                    zwcVar.m60031l(this.f21664d.f56210a, this.f21669i, iMin);
                    int i2 = this.f21669i + iMin;
                    this.f21669i = i2;
                    if (i2 == this.f21670j) {
                        this.f21664d.m58452p(0);
                        m25048g(this.f21664d);
                        this.f21668h = 0;
                    }
                }
            } else if (zwcVar.m60004H() == 86) {
                this.f21668h = 1;
            }
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f21668h = 0;
        this.f21672l = -9223372036854775807L;
        this.f21673m = false;
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f21665e = vq6Var.mo32487f(c14129d.m31296c(), 1);
        this.f21666f = c14129d.m31295b();
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f21672l = j;
    }

    /* renamed from: g */
    public final void m25048g(ywc ywcVar) throws byc {
        if (!ywcVar.m58443g()) {
            this.f21673m = true;
            m25053l(ywcVar);
        } else if (!this.f21673m) {
            return;
        }
        if (this.f21674n != 0) {
            throw byc.m19921a(null, null);
        }
        if (this.f21675o != 0) {
            throw byc.m19921a(null, null);
        }
        m25052k(ywcVar, m25051j(ywcVar));
        if (this.f21677q) {
            ywcVar.m58454r((int) this.f21678r);
        }
    }

    /* renamed from: h */
    public final int m25049h(ywc ywcVar) throws byc {
        int iM58438b = ywcVar.m58438b();
        w5.C17781b c17781bM53966e = w5.m53966e(ywcVar, true);
        this.f21682v = c17781bM53966e.f51496c;
        this.f21679s = c17781bM53966e.f51494a;
        this.f21681u = c17781bM53966e.f51495b;
        return iM58438b - ywcVar.m58438b();
    }

    /* renamed from: i */
    public final void m25050i(ywc ywcVar) {
        int iM58444h = ywcVar.m58444h(3);
        this.f21676p = iM58444h;
        if (iM58444h == 0) {
            ywcVar.m58454r(8);
            return;
        }
        if (iM58444h == 1) {
            ywcVar.m58454r(9);
            return;
        }
        if (iM58444h == 3 || iM58444h == 4 || iM58444h == 5) {
            ywcVar.m58454r(6);
        } else {
            if (iM58444h != 6 && iM58444h != 7) {
                throw new IllegalStateException();
            }
            ywcVar.m58454r(1);
        }
    }

    /* renamed from: j */
    public final int m25051j(ywc ywcVar) throws byc {
        int iM58444h;
        if (this.f21676p != 0) {
            throw byc.m19921a(null, null);
        }
        int i = 0;
        do {
            iM58444h = ywcVar.m58444h(8);
            i += iM58444h;
        } while (iM58444h == 255);
        return i;
    }

    /* renamed from: k */
    public final void m25052k(ywc ywcVar, int i) {
        int iM58441e = ywcVar.m58441e();
        if ((iM58441e & 7) == 0) {
            this.f21663c.m60017U(iM58441e >> 3);
        } else {
            ywcVar.m58445i(this.f21663c.m60024e(), 0, i * 8);
            this.f21663c.m60017U(0);
        }
        this.f21665e.m52027e(this.f21663c, i);
        op0.m42517g(this.f21672l != -9223372036854775807L);
        this.f21665e.mo7071a(this.f21672l, 1, i, 0, null);
        this.f21672l += this.f21680t;
    }

    /* renamed from: l */
    public final void m25053l(ywc ywcVar) throws byc {
        boolean zM58443g;
        int iM58444h = ywcVar.m58444h(1);
        int iM58444h2 = iM58444h == 1 ? ywcVar.m58444h(1) : 0;
        this.f21674n = iM58444h2;
        if (iM58444h2 != 0) {
            throw byc.m19921a(null, null);
        }
        if (iM58444h == 1) {
            m25047f(ywcVar);
        }
        if (!ywcVar.m58443g()) {
            throw byc.m19921a(null, null);
        }
        this.f21675o = ywcVar.m58444h(6);
        int iM58444h3 = ywcVar.m58444h(4);
        int iM58444h4 = ywcVar.m58444h(3);
        if (iM58444h3 != 0 || iM58444h4 != 0) {
            throw byc.m19921a(null, null);
        }
        if (iM58444h == 0) {
            int iM58441e = ywcVar.m58441e();
            int iM25049h = m25049h(ywcVar);
            ywcVar.m58452p(iM58441e);
            byte[] bArr = new byte[(iM25049h + 7) / 8];
            ywcVar.m58445i(bArr, 0, iM25049h);
            C2181a c2181aM6748K = new C2181a.b().a0(this.f21666f).o0("audio/mp4a-latm").m6752O(this.f21682v).m6751N(this.f21681u).p0(this.f21679s).b0(Collections.singletonList(bArr)).e0(this.f21661a).m0(this.f21662b).m6748K();
            if (!c2181aM6748K.equals(this.f21667g)) {
                this.f21667g = c2181aM6748K;
                this.f21680t = 1024000000 / c2181aM6748K.f7920C;
                this.f21665e.mo7072b(c2181aM6748K);
            }
        } else {
            ywcVar.m58454r(((int) m25047f(ywcVar)) - m25049h(ywcVar));
        }
        m25050i(ywcVar);
        boolean zM58443g2 = ywcVar.m58443g();
        this.f21677q = zM58443g2;
        this.f21678r = 0L;
        if (zM58443g2) {
            if (iM58444h == 1) {
                this.f21678r = m25047f(ywcVar);
            } else {
                do {
                    zM58443g = ywcVar.m58443g();
                    this.f21678r = (this.f21678r << 8) + ywcVar.m58444h(8);
                } while (zM58443g);
            }
        }
        if (ywcVar.m58443g()) {
            ywcVar.m58454r(8);
        }
    }

    /* renamed from: m */
    public final void m25054m(int i) {
        this.f21663c.m60013Q(i);
        this.f21664d.m58450n(this.f21663c.m60024e());
    }
}

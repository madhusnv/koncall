package p001o;

import androidx.media3.common.C2181a;
import java.util.Arrays;
import java.util.Collections;
import p001o.hyh;
import p001o.w5;

/* loaded from: classes2.dex */
public final class n70 implements n46 {

    /* renamed from: w */
    public static final byte[] f36466w = {73, 68, 51};

    /* renamed from: a */
    public final boolean f36467a;

    /* renamed from: b */
    public final ywc f36468b;

    /* renamed from: c */
    public final zwc f36469c;

    /* renamed from: d */
    public final String f36470d;

    /* renamed from: e */
    public final int f36471e;

    /* renamed from: f */
    public String f36472f;

    /* renamed from: g */
    public uth f36473g;

    /* renamed from: h */
    public uth f36474h;

    /* renamed from: i */
    public int f36475i;

    /* renamed from: j */
    public int f36476j;

    /* renamed from: k */
    public int f36477k;

    /* renamed from: l */
    public boolean f36478l;

    /* renamed from: m */
    public boolean f36479m;

    /* renamed from: n */
    public int f36480n;

    /* renamed from: o */
    public int f36481o;

    /* renamed from: p */
    public int f36482p;

    /* renamed from: q */
    public boolean f36483q;

    /* renamed from: r */
    public long f36484r;

    /* renamed from: s */
    public int f36485s;

    /* renamed from: t */
    public long f36486t;

    /* renamed from: u */
    public uth f36487u;

    /* renamed from: v */
    public long f36488v;

    public n70(boolean z) {
        this(z, null, 0);
    }

    /* renamed from: m */
    public static boolean m40173m(int i) {
        return (i & 65526) == 65520;
    }

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) {
        m40174f();
        while (zwcVar.m60020a() > 0) {
            int i = this.f36475i;
            if (i == 0) {
                m40178j(zwcVar);
            } else if (i == 1) {
                m40175g(zwcVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (m40177i(zwcVar, this.f36468b.f56210a, this.f36478l ? 7 : 5)) {
                        m40181n();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    m40183p(zwcVar);
                }
            } else if (m40177i(zwcVar, this.f36469c.m60024e(), 10)) {
                m40182o();
            }
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f36486t = -9223372036854775807L;
        m40184q();
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f36472f = c14129d.m31295b();
        uth uthVarMo32487f = vq6Var.mo32487f(c14129d.m31296c(), 1);
        this.f36473g = uthVarMo32487f;
        this.f36487u = uthVarMo32487f;
        if (!this.f36467a) {
            this.f36474h = new nt5();
            return;
        }
        c14129d.m31294a();
        uth uthVarMo32487f2 = vq6Var.mo32487f(c14129d.m31296c(), 5);
        this.f36474h = uthVarMo32487f2;
        uthVarMo32487f2.mo7072b(new C2181a.b().a0(c14129d.m31295b()).o0("application/id3").m6748K());
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f36486t = j;
    }

    /* renamed from: f */
    public final void m40174f() {
        op0.m42515e(this.f36473g);
        sqi.m48729h(this.f36487u);
        sqi.m48729h(this.f36474h);
    }

    /* renamed from: g */
    public final void m40175g(zwc zwcVar) {
        if (zwcVar.m60020a() == 0) {
            return;
        }
        this.f36468b.f56210a[0] = zwcVar.m60024e()[zwcVar.m60025f()];
        this.f36468b.m58452p(2);
        int iM58444h = this.f36468b.m58444h(4);
        int i = this.f36481o;
        if (i != -1 && iM58444h != i) {
            m40184q();
            return;
        }
        if (!this.f36479m) {
            this.f36479m = true;
            this.f36480n = this.f36482p;
            this.f36481o = iM58444h;
        }
        m40187t();
    }

    /* renamed from: h */
    public final boolean m40176h(zwc zwcVar, int i) {
        zwcVar.m60017U(i + 1);
        if (!m40190w(zwcVar, this.f36468b.f56210a, 1)) {
            return false;
        }
        this.f36468b.m58452p(4);
        int iM58444h = this.f36468b.m58444h(1);
        int i2 = this.f36480n;
        if (i2 != -1 && iM58444h != i2) {
            return false;
        }
        if (this.f36481o != -1) {
            if (!m40190w(zwcVar, this.f36468b.f56210a, 1)) {
                return true;
            }
            this.f36468b.m58452p(2);
            if (this.f36468b.m58444h(4) != this.f36481o) {
                return false;
            }
            zwcVar.m60017U(i + 2);
        }
        if (!m40190w(zwcVar, this.f36468b.f56210a, 4)) {
            return true;
        }
        this.f36468b.m58452p(14);
        int iM58444h2 = this.f36468b.m58444h(13);
        if (iM58444h2 < 7) {
            return false;
        }
        byte[] bArrM60024e = zwcVar.m60024e();
        int iM60026g = zwcVar.m60026g();
        int i3 = i + iM58444h2;
        if (i3 >= iM60026g) {
            return true;
        }
        byte b = bArrM60024e[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == iM60026g) {
                return true;
            }
            return m40180l((byte) -1, bArrM60024e[i4]) && ((bArrM60024e[i4] & 8) >> 3) == iM58444h;
        }
        if (b != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == iM60026g) {
            return true;
        }
        if (bArrM60024e[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == iM60026g || bArrM60024e[i6] == 51;
    }

    /* renamed from: i */
    public final boolean m40177i(zwc zwcVar, byte[] bArr, int i) {
        int iMin = Math.min(zwcVar.m60020a(), i - this.f36476j);
        zwcVar.m60031l(bArr, this.f36476j, iMin);
        int i2 = this.f36476j + iMin;
        this.f36476j = i2;
        return i2 == i;
    }

    /* renamed from: j */
    public final void m40178j(zwc zwcVar) {
        byte[] bArrM60024e = zwcVar.m60024e();
        int iM60025f = zwcVar.m60025f();
        int iM60026g = zwcVar.m60026g();
        while (iM60025f < iM60026g) {
            int i = iM60025f + 1;
            int i2 = bArrM60024e[iM60025f] & 255;
            if (this.f36477k == 512 && m40180l((byte) -1, (byte) i2) && (this.f36479m || m40176h(zwcVar, i - 2))) {
                this.f36482p = (i2 & 8) >> 3;
                this.f36478l = (i2 & 1) == 0;
                if (this.f36479m) {
                    m40187t();
                } else {
                    m40185r();
                }
                zwcVar.m60017U(i);
                return;
            }
            int i3 = this.f36477k;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.f36477k = 768;
            } else if (i4 == 511) {
                this.f36477k = 512;
            } else if (i4 == 836) {
                this.f36477k = 1024;
            } else if (i4 == 1075) {
                m40188u();
                zwcVar.m60017U(i);
                return;
            } else if (i3 != 256) {
                this.f36477k = 256;
                i--;
            }
            iM60025f = i;
        }
        zwcVar.m60017U(iM60025f);
    }

    /* renamed from: k */
    public long m40179k() {
        return this.f36484r;
    }

    /* renamed from: l */
    public final boolean m40180l(byte b, byte b2) {
        return m40173m(((b & 255) << 8) | (b2 & 255));
    }

    /* renamed from: n */
    public final void m40181n() {
        this.f36468b.m58452p(0);
        if (this.f36483q) {
            this.f36468b.m58454r(10);
        } else {
            int iM58444h = this.f36468b.m58444h(2) + 1;
            if (iM58444h != 2) {
                ria.m46824h("AdtsReader", "Detected audio object type: " + iM58444h + ", but assuming AAC LC.");
                iM58444h = 2;
            }
            this.f36468b.m58454r(5);
            byte[] bArrM53963b = w5.m53963b(iM58444h, this.f36481o, this.f36468b.m58444h(3));
            w5.C17781b c17781bM53967f = w5.m53967f(bArrM53963b);
            C2181a c2181aM6748K = new C2181a.b().a0(this.f36472f).o0("audio/mp4a-latm").m6752O(c17781bM53967f.f51496c).m6751N(c17781bM53967f.f51495b).p0(c17781bM53967f.f51494a).b0(Collections.singletonList(bArrM53963b)).e0(this.f36470d).m0(this.f36471e).m6748K();
            this.f36484r = 1024000000 / c2181aM6748K.f7920C;
            this.f36473g.mo7072b(c2181aM6748K);
            this.f36483q = true;
        }
        this.f36468b.m58454r(4);
        int iM58444h2 = (this.f36468b.m58444h(13) - 2) - 5;
        if (this.f36478l) {
            iM58444h2 -= 2;
        }
        m40189v(this.f36473g, this.f36484r, 0, iM58444h2);
    }

    /* renamed from: o */
    public final void m40182o() {
        this.f36474h.m52027e(this.f36469c, 10);
        this.f36469c.m60017U(6);
        m40189v(this.f36474h, 0L, 10, this.f36469c.m60003G() + 10);
    }

    /* renamed from: p */
    public final void m40183p(zwc zwcVar) {
        int iMin = Math.min(zwcVar.m60020a(), this.f36485s - this.f36476j);
        this.f36487u.m52027e(zwcVar, iMin);
        int i = this.f36476j + iMin;
        this.f36476j = i;
        if (i == this.f36485s) {
            op0.m42517g(this.f36486t != -9223372036854775807L);
            this.f36487u.mo7071a(this.f36486t, 1, this.f36485s, 0, null);
            this.f36486t += this.f36488v;
            m40186s();
        }
    }

    /* renamed from: q */
    public final void m40184q() {
        this.f36479m = false;
        m40186s();
    }

    /* renamed from: r */
    public final void m40185r() {
        this.f36475i = 1;
        this.f36476j = 0;
    }

    /* renamed from: s */
    public final void m40186s() {
        this.f36475i = 0;
        this.f36476j = 0;
        this.f36477k = 256;
    }

    /* renamed from: t */
    public final void m40187t() {
        this.f36475i = 3;
        this.f36476j = 0;
    }

    /* renamed from: u */
    public final void m40188u() {
        this.f36475i = 2;
        this.f36476j = f36466w.length;
        this.f36485s = 0;
        this.f36469c.m60017U(0);
    }

    /* renamed from: v */
    public final void m40189v(uth uthVar, long j, int i, int i2) {
        this.f36475i = 4;
        this.f36476j = i;
        this.f36487u = uthVar;
        this.f36488v = j;
        this.f36485s = i2;
    }

    /* renamed from: w */
    public final boolean m40190w(zwc zwcVar, byte[] bArr, int i) {
        if (zwcVar.m60020a() < i) {
            return false;
        }
        zwcVar.m60031l(bArr, 0, i);
        return true;
    }

    public n70(boolean z, String str, int i) {
        this.f36468b = new ywc(new byte[7]);
        this.f36469c = new zwc(Arrays.copyOf(f36466w, 10));
        m40186s();
        this.f36480n = -1;
        this.f36481o = -1;
        this.f36484r = -9223372036854775807L;
        this.f36486t = -9223372036854775807L;
        this.f36467a = z;
        this.f36470d = str;
        this.f36471e = i;
    }
}

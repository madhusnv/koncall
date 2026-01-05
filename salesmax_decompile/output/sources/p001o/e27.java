package p001o;

import androidx.media3.common.Metadata;
import p001o.f27;
import p001o.g27;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class e27 implements tq6 {

    /* renamed from: o */
    public static final yq6 f20812o = new yq6() { // from class: o.d27
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return e27.m24149l();
        }
    };

    /* renamed from: a */
    public final byte[] f20813a;

    /* renamed from: b */
    public final zwc f20814b;

    /* renamed from: c */
    public final boolean f20815c;

    /* renamed from: d */
    public final f27.C13314a f20816d;

    /* renamed from: e */
    public vq6 f20817e;

    /* renamed from: f */
    public uth f20818f;

    /* renamed from: g */
    public int f20819g;

    /* renamed from: h */
    public Metadata f20820h;

    /* renamed from: i */
    public j27 f20821i;

    /* renamed from: j */
    public int f20822j;

    /* renamed from: k */
    public int f20823k;

    /* renamed from: l */
    public c27 f20824l;

    /* renamed from: m */
    public int f20825m;

    /* renamed from: n */
    public long f20826n;

    public e27() {
        this(0);
    }

    /* renamed from: l */
    public static /* synthetic */ tq6[] m24149l() {
        return new tq6[]{new e27()};
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        if (j == 0) {
            this.f20819g = 0;
        } else {
            c27 c27Var = this.f20824l;
            if (c27Var != null) {
                c27Var.m45455h(j2);
            }
        }
        this.f20826n = j2 != 0 ? -1L : 0L;
        this.f20825m = 0;
        this.f20814b.m60013Q(0);
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        g27.m27991c(uq6Var, false);
        return g27.m27989a(uq6Var);
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f20817e = vq6Var;
        this.f20818f = vq6Var.mo32487f(0, 1);
        vq6Var.mo32489p();
    }

    /* renamed from: e */
    public final long m24150e(zwc zwcVar, boolean z) {
        boolean zM25962d;
        op0.m42515e(this.f20821i);
        int iM60025f = zwcVar.m60025f();
        while (iM60025f <= zwcVar.m60026g() - 16) {
            zwcVar.m60017U(iM60025f);
            if (f27.m25962d(zwcVar, this.f20821i, this.f20823k, this.f20816d)) {
                zwcVar.m60017U(iM60025f);
                return this.f20816d.f22562a;
            }
            iM60025f++;
        }
        if (!z) {
            zwcVar.m60017U(iM60025f);
            return -1L;
        }
        while (iM60025f <= zwcVar.m60026g() - this.f20822j) {
            zwcVar.m60017U(iM60025f);
            try {
                zM25962d = f27.m25962d(zwcVar, this.f20821i, this.f20823k, this.f20816d);
            } catch (IndexOutOfBoundsException unused) {
                zM25962d = false;
            }
            if (zwcVar.m60025f() <= zwcVar.m60026g() ? zM25962d : false) {
                zwcVar.m60017U(iM60025f);
                return this.f20816d.f22562a;
            }
            iM60025f++;
        }
        zwcVar.m60017U(zwcVar.m60026g());
        return -1L;
    }

    /* renamed from: g */
    public final void m24151g(uq6 uq6Var) {
        this.f20823k = g27.m27990b(uq6Var);
        ((vq6) sqi.m48729h(this.f20817e)).mo32490r(m24152h(uq6Var.getPosition(), uq6Var.getLength()));
        this.f20819g = 5;
    }

    /* renamed from: h */
    public final zaf m24152h(long j, long j2) {
        op0.m42515e(this.f20821i);
        j27 j27Var = this.f20821i;
        if (j27Var.f29624k != null) {
            return new i27(j27Var, j);
        }
        if (j2 == -1 || j27Var.f29623j <= 0) {
            return new zaf.C18604b(j27Var.m33093f());
        }
        c27 c27Var = new c27(j27Var, this.f20823k, j, j2);
        this.f20824l = c27Var;
        return c27Var.m45449b();
    }

    /* renamed from: j */
    public final void m24153j(uq6 uq6Var) {
        byte[] bArr = this.f20813a;
        uq6Var.mo40498m(bArr, 0, bArr.length);
        uq6Var.mo40490c();
        this.f20819g = 2;
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) throws byc {
        int i = this.f20819g;
        if (i == 0) {
            m24156o(uq6Var);
            return 0;
        }
        if (i == 1) {
            m24153j(uq6Var);
            return 0;
        }
        if (i == 2) {
            m24158q(uq6Var);
            return 0;
        }
        if (i == 3) {
            m24157p(uq6Var);
            return 0;
        }
        if (i == 4) {
            m24151g(uq6Var);
            return 0;
        }
        if (i == 5) {
            return m24155n(uq6Var, uedVar);
        }
        throw new IllegalStateException();
    }

    /* renamed from: m */
    public final void m24154m() {
        ((uth) sqi.m48729h(this.f20818f)).mo7071a((this.f20826n * 1000000) / ((j27) sqi.m48729h(this.f20821i)).f29618e, 1, this.f20825m, 0, null);
    }

    /* renamed from: n */
    public final int m24155n(uq6 uq6Var, ued uedVar) {
        boolean z;
        op0.m42515e(this.f20818f);
        op0.m42515e(this.f20821i);
        c27 c27Var = this.f20824l;
        if (c27Var != null && c27Var.m45451d()) {
            return this.f20824l.m45450c(uq6Var, uedVar);
        }
        if (this.f20826n == -1) {
            this.f20826n = f27.m25967i(uq6Var, this.f20821i);
            return 0;
        }
        int iM60026g = this.f20814b.m60026g();
        if (iM60026g < 32768) {
            int i = uq6Var.read(this.f20814b.m60024e(), iM60026g, 32768 - iM60026g);
            z = i == -1;
            if (!z) {
                this.f20814b.m60016T(iM60026g + i);
            } else if (this.f20814b.m60020a() == 0) {
                m24154m();
                return -1;
            }
        } else {
            z = false;
        }
        int iM60025f = this.f20814b.m60025f();
        int i2 = this.f20825m;
        int i3 = this.f20822j;
        if (i2 < i3) {
            zwc zwcVar = this.f20814b;
            zwcVar.m60018V(Math.min(i3 - i2, zwcVar.m60020a()));
        }
        long jM24150e = m24150e(this.f20814b, z);
        int iM60025f2 = this.f20814b.m60025f() - iM60025f;
        this.f20814b.m60017U(iM60025f);
        this.f20818f.m52027e(this.f20814b, iM60025f2);
        this.f20825m += iM60025f2;
        if (jM24150e != -1) {
            m24154m();
            this.f20825m = 0;
            this.f20826n = jM24150e;
        }
        if (this.f20814b.m60020a() < 16) {
            int iM60020a = this.f20814b.m60020a();
            System.arraycopy(this.f20814b.m60024e(), this.f20814b.m60025f(), this.f20814b.m60024e(), 0, iM60020a);
            this.f20814b.m60017U(0);
            this.f20814b.m60016T(iM60020a);
        }
        return 0;
    }

    /* renamed from: o */
    public final void m24156o(uq6 uq6Var) {
        this.f20820h = g27.m27992d(uq6Var, !this.f20815c);
        this.f20819g = 1;
    }

    /* renamed from: p */
    public final void m24157p(uq6 uq6Var) {
        g27.C13613a c13613a = new g27.C13613a(this.f20821i);
        boolean zM27993e = false;
        while (!zM27993e) {
            zM27993e = g27.m27993e(uq6Var, c13613a);
            this.f20821i = (j27) sqi.m48729h(c13613a.f24481a);
        }
        op0.m42515e(this.f20821i);
        this.f20822j = Math.max(this.f20821i.f29616c, 6);
        ((uth) sqi.m48729h(this.f20818f)).mo7072b(this.f20821i.m33094g(this.f20813a, this.f20820h));
        this.f20819g = 4;
    }

    /* renamed from: q */
    public final void m24158q(uq6 uq6Var) throws byc {
        g27.m27997i(uq6Var);
        this.f20819g = 3;
    }

    @Override // p001o.tq6
    public void release() {
    }

    public e27(int i) {
        this.f20813a = new byte[42];
        this.f20814b = new zwc(new byte[32768], 0);
        this.f20815c = (i & 1) != 0;
        this.f20816d = new f27.C13314a();
        this.f20819g = 0;
    }
}

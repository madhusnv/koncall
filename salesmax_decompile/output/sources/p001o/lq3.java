package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes6.dex */
public final class lq3 {

    /* renamed from: v */
    public static final C15128a f34230v = new C15128a(null);

    /* renamed from: a */
    public fsi f34231a;

    /* renamed from: b */
    public final int f34232b;

    /* renamed from: c */
    public final float f34233c;

    /* renamed from: d */
    public final float f34234d;

    /* renamed from: e */
    public final wkf f34235e;

    /* renamed from: f */
    public long f34236f;

    /* renamed from: g */
    public final boolean f34237g;

    /* renamed from: h */
    public fsi f34238h;

    /* renamed from: i */
    public fsi f34239i;

    /* renamed from: j */
    public float f34240j;

    /* renamed from: k */
    public final float f34241k;

    /* renamed from: l */
    public final float f34242l;

    /* renamed from: m */
    public final float f34243m;

    /* renamed from: n */
    public float f34244n;

    /* renamed from: o */
    public float f34245o;

    /* renamed from: p */
    public float f34246p;

    /* renamed from: q */
    public fsi f34247q;

    /* renamed from: r */
    public int f34248r;

    /* renamed from: s */
    public float f34249s;

    /* renamed from: t */
    public int f34250t;

    /* renamed from: u */
    public boolean f34251u;

    /* renamed from: o.lq3$a */
    public static final class C15128a {
        public C15128a() {
        }

        public /* synthetic */ C15128a(id5 id5Var) {
            this();
        }
    }

    public lq3(fsi fsiVar, int i, float f, float f2, wkf wkfVar, long j, boolean z, fsi fsiVar2, fsi fsiVar3, float f3, float f4, float f5, float f6) {
        sq8.m48649h(fsiVar, "location");
        sq8.m48649h(wkfVar, "shape");
        sq8.m48649h(fsiVar2, "acceleration");
        sq8.m48649h(fsiVar3, "velocity");
        this.f34231a = fsiVar;
        this.f34232b = i;
        this.f34233c = f;
        this.f34234d = f2;
        this.f34235e = wkfVar;
        this.f34236f = j;
        this.f34237g = z;
        this.f34238h = fsiVar2;
        this.f34239i = fsiVar3;
        this.f34240j = f3;
        this.f34241k = f4;
        this.f34242l = f5;
        this.f34243m = f6;
        this.f34245o = f;
        this.f34246p = 60.0f;
        this.f34247q = new fsi(0.0f, 0.02f);
        this.f34248r = Constants.MAX_HOST_LENGTH;
        this.f34251u = true;
    }

    /* renamed from: a */
    public final void m37739a(fsi fsiVar) {
        sq8.m48649h(fsiVar, "force");
        this.f34238h.m27455b(fsiVar, 1.0f / this.f34234d);
    }

    /* renamed from: b */
    public final int m37740b() {
        return this.f34248r;
    }

    /* renamed from: c */
    public final int m37741c() {
        return this.f34250t;
    }

    /* renamed from: d */
    public final boolean m37742d() {
        return this.f34251u;
    }

    /* renamed from: e */
    public final fsi m37743e() {
        return this.f34231a;
    }

    /* renamed from: f */
    public final float m37744f() {
        return this.f34244n;
    }

    /* renamed from: g */
    public final float m37745g() {
        return this.f34249s;
    }

    /* renamed from: h */
    public final wkf m37746h() {
        return this.f34235e;
    }

    /* renamed from: i */
    public final float m37747i() {
        return this.f34233c;
    }

    /* renamed from: j */
    public final boolean m37748j() {
        return this.f34248r <= 0;
    }

    /* renamed from: k */
    public final void m37749k(float f, i74 i74Var) {
        sq8.m48649h(i74Var, "drawArea");
        m37739a(this.f34247q);
        m37750l(f, i74Var);
    }

    /* renamed from: l */
    public final void m37750l(float f, i74 i74Var) {
        this.f34246p = f > 0.0f ? 1.0f / f : 60.0f;
        if (this.f34231a.m27457d() > i74Var.getHeight()) {
            this.f34248r = 0;
            return;
        }
        this.f34239i.m27454a(this.f34238h);
        this.f34239i.m27458e(this.f34240j);
        this.f34231a.m27455b(this.f34239i, this.f34246p * f * this.f34243m);
        long j = this.f34236f - ((long) (1000 * f));
        this.f34236f = j;
        if (j <= 0) {
            m37751m(f);
        }
        float f2 = this.f34244n + (this.f34242l * f * this.f34246p);
        this.f34244n = f2;
        if (f2 >= 360.0f) {
            this.f34244n = 0.0f;
        }
        float fAbs = this.f34245o - ((Math.abs(this.f34241k) * f) * this.f34246p);
        this.f34245o = fAbs;
        if (fAbs < 0.0f) {
            this.f34245o = this.f34233c;
        }
        this.f34249s = Math.abs((this.f34245o / this.f34233c) - 0.5f) * 2;
        this.f34250t = (this.f34248r << 24) | (this.f34232b & 16777215);
        this.f34251u = i74Var.mo31626e((int) this.f34231a.m27456c(), (int) this.f34231a.m27457d());
    }

    /* renamed from: m */
    public final void m37751m(float f) {
        int iM18601d = 0;
        if (this.f34237g) {
            iM18601d = bce.m18601d(this.f34248r - ((int) ((5 * f) * this.f34246p)), 0);
        }
        this.f34248r = iM18601d;
    }

    public /* synthetic */ lq3(fsi fsiVar, int i, float f, float f2, wkf wkfVar, long j, boolean z, fsi fsiVar2, fsi fsiVar3, float f3, float f4, float f5, float f6, int i2, id5 id5Var) {
        this(fsiVar, i, f, f2, wkfVar, (i2 & 32) != 0 ? -1L : j, (i2 & 64) != 0 ? true : z, (i2 & 128) != 0 ? new fsi(0.0f, 0.0f) : fsiVar2, (i2 & 256) != 0 ? new fsi(0.0f, 0.0f, 3, null) : fsiVar3, f3, (i2 & 1024) != 0 ? 1.0f : f4, (i2 & 2048) != 0 ? 1.0f : f5, f6);
    }
}

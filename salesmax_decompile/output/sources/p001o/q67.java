package p001o;

import p001o.zaf;

/* loaded from: classes2.dex */
public final class q67 implements tq6 {

    /* renamed from: q */
    public static final yq6 f41347q = new yq6() { // from class: o.p67
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return q67.m44837h();
        }
    };

    /* renamed from: f */
    public vq6 f41353f;

    /* renamed from: h */
    public boolean f41355h;

    /* renamed from: i */
    public long f41356i;

    /* renamed from: j */
    public int f41357j;

    /* renamed from: k */
    public int f41358k;

    /* renamed from: l */
    public int f41359l;

    /* renamed from: m */
    public long f41360m;

    /* renamed from: n */
    public boolean f41361n;

    /* renamed from: o */
    public lz0 f41362o;

    /* renamed from: p */
    public dvi f41363p;

    /* renamed from: a */
    public final zwc f41348a = new zwc(4);

    /* renamed from: b */
    public final zwc f41349b = new zwc(9);

    /* renamed from: c */
    public final zwc f41350c = new zwc(11);

    /* renamed from: d */
    public final zwc f41351d = new zwc();

    /* renamed from: e */
    public final n6f f41352e = new n6f();

    /* renamed from: g */
    public int f41354g = 1;

    /* renamed from: h */
    public static /* synthetic */ tq6[] m44837h() {
        return new tq6[]{new q67()};
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        if (j == 0) {
            this.f41354g = 1;
            this.f41355h = false;
        } else {
            this.f41354g = 3;
        }
        this.f41357j = 0;
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        uq6Var.mo40498m(this.f41348a.m60024e(), 0, 3);
        this.f41348a.m60017U(0);
        if (this.f41348a.m60007K() != 4607062) {
            return false;
        }
        uq6Var.mo40498m(this.f41348a.m60024e(), 0, 2);
        this.f41348a.m60017U(0);
        if ((this.f41348a.m60010N() & 250) != 0) {
            return false;
        }
        uq6Var.mo40498m(this.f41348a.m60024e(), 0, 4);
        this.f41348a.m60017U(0);
        int iM60036q = this.f41348a.m60036q();
        uq6Var.mo40490c();
        uq6Var.mo40494h(iM60036q);
        uq6Var.mo40498m(this.f41348a.m60024e(), 0, 4);
        this.f41348a.m60017U(0);
        return this.f41348a.m60036q() == 0;
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f41353f = vq6Var;
    }

    /* renamed from: e */
    public final void m44838e() {
        if (this.f41361n) {
            return;
        }
        this.f41353f.mo32490r(new zaf.C18604b(-9223372036854775807L));
        this.f41361n = true;
    }

    /* renamed from: g */
    public final long m44839g() {
        if (this.f41355h) {
            return this.f41356i + this.f41360m;
        }
        if (this.f41352e.m40160d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f41360m;
    }

    /* renamed from: j */
    public final zwc m44840j(uq6 uq6Var) {
        if (this.f41359l > this.f41351d.m60021b()) {
            zwc zwcVar = this.f41351d;
            zwcVar.m60015S(new byte[Math.max(zwcVar.m60021b() * 2, this.f41359l)], 0);
        } else {
            this.f41351d.m60017U(0);
        }
        this.f41351d.m60016T(this.f41359l);
        uq6Var.readFully(this.f41351d.m60024e(), 0, this.f41359l);
        return this.f41351d;
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) {
        op0.m42519i(this.f41353f);
        while (true) {
            int i = this.f41354g;
            if (i != 1) {
                if (i == 2) {
                    m44844o(uq6Var);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (m44842m(uq6Var)) {
                        return 0;
                    }
                } else if (!m44843n(uq6Var)) {
                    return -1;
                }
            } else if (!m44841l(uq6Var)) {
                return -1;
            }
        }
    }

    /* renamed from: l */
    public final boolean m44841l(uq6 uq6Var) {
        if (!uq6Var.mo40492f(this.f41349b.m60024e(), 0, 9, true)) {
            return false;
        }
        this.f41349b.m60017U(0);
        this.f41349b.m60018V(4);
        int iM60004H = this.f41349b.m60004H();
        boolean z = (iM60004H & 4) != 0;
        boolean z2 = (iM60004H & 1) != 0;
        if (z && this.f41362o == null) {
            this.f41362o = new lz0(this.f41353f.mo32487f(8, 1));
        }
        if (z2 && this.f41363p == null) {
            this.f41363p = new dvi(this.f41353f.mo32487f(9, 2));
        }
        this.f41353f.mo32489p();
        this.f41357j = (this.f41349b.m60036q() - 9) + 4;
        this.f41354g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m44842m(uq6 uq6Var) {
        boolean zM59500a;
        boolean z;
        long jM44839g = m44839g();
        int i = this.f41358k;
        if (i == 8 && this.f41362o != null) {
            m44838e();
            zM59500a = this.f41362o.m59500a(m44840j(uq6Var), jM44839g);
        } else if (i == 9 && this.f41363p != null) {
            m44838e();
            zM59500a = this.f41363p.m59500a(m44840j(uq6Var), jM44839g);
        } else {
            if (i != 18 || this.f41361n) {
                uq6Var.mo40496k(this.f41359l);
                zM59500a = false;
                z = false;
                if (!this.f41355h && zM59500a) {
                    this.f41355h = true;
                    this.f41356i = this.f41352e.m40160d() != -9223372036854775807L ? -this.f41360m : 0L;
                }
                this.f41357j = 4;
                this.f41354g = 2;
                return z;
            }
            zM59500a = this.f41352e.m59500a(m44840j(uq6Var), jM44839g);
            long jM40160d = this.f41352e.m40160d();
            if (jM40160d != -9223372036854775807L) {
                this.f41353f.mo32490r(new wh8(this.f41352e.m40161e(), this.f41352e.m40162f(), jM40160d));
                this.f41361n = true;
            }
        }
        z = true;
        if (!this.f41355h) {
            this.f41355h = true;
            this.f41356i = this.f41352e.m40160d() != -9223372036854775807L ? -this.f41360m : 0L;
        }
        this.f41357j = 4;
        this.f41354g = 2;
        return z;
    }

    /* renamed from: n */
    public final boolean m44843n(uq6 uq6Var) {
        if (!uq6Var.mo40492f(this.f41350c.m60024e(), 0, 11, true)) {
            return false;
        }
        this.f41350c.m60017U(0);
        this.f41358k = this.f41350c.m60004H();
        this.f41359l = this.f41350c.m60007K();
        this.f41360m = this.f41350c.m60007K();
        this.f41360m = ((this.f41350c.m60004H() << 24) | this.f41360m) * 1000;
        this.f41350c.m60018V(3);
        this.f41354g = 4;
        return true;
    }

    /* renamed from: o */
    public final void m44844o(uq6 uq6Var) {
        uq6Var.mo40496k(this.f41357j);
        this.f41357j = 0;
        this.f41354g = 3;
    }

    @Override // p001o.tq6
    public void release() {
    }
}

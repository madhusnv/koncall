package p001o;

import p001o.hyh;

/* loaded from: classes2.dex */
public final class l6d implements hyh {

    /* renamed from: a */
    public final n46 f33311a;

    /* renamed from: b */
    public final ywc f33312b = new ywc(new byte[10]);

    /* renamed from: c */
    public int f33313c = 0;

    /* renamed from: d */
    public int f33314d;

    /* renamed from: e */
    public umh f33315e;

    /* renamed from: f */
    public boolean f33316f;

    /* renamed from: g */
    public boolean f33317g;

    /* renamed from: h */
    public boolean f33318h;

    /* renamed from: i */
    public int f33319i;

    /* renamed from: j */
    public int f33320j;

    /* renamed from: k */
    public boolean f33321k;

    /* renamed from: l */
    public long f33322l;

    public l6d(n46 n46Var) {
        this.f33311a = n46Var;
    }

    @Override // p001o.hyh
    /* renamed from: a */
    public void mo31288a(zwc zwcVar, int i) {
        op0.m42519i(this.f33315e);
        if ((i & 1) != 0) {
            int i2 = this.f33313c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    ria.m46824h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f33320j != -1) {
                        ria.m46824h("PesReader", "Unexpected start indicator: expected " + this.f33320j + " more bytes");
                    }
                    this.f33311a.mo24648c(zwcVar.m60026g() == 0);
                }
            }
            m36625h(1);
        }
        while (zwcVar.m60020a() > 0) {
            int i3 = this.f33313c;
            if (i3 == 0) {
                zwcVar.m60018V(zwcVar.m60020a());
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (m36622e(zwcVar, this.f33312b.f56210a, Math.min(10, this.f33319i)) && m36622e(zwcVar, null, this.f33319i)) {
                        m36624g();
                        i |= this.f33321k ? 4 : 0;
                        this.f33311a.mo24650e(this.f33322l, i);
                        m36625h(3);
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    int iM60020a = zwcVar.m60020a();
                    int i4 = this.f33320j;
                    int i5 = i4 == -1 ? 0 : iM60020a - i4;
                    if (i5 > 0) {
                        iM60020a -= i5;
                        zwcVar.m60016T(zwcVar.m60025f() + iM60020a);
                    }
                    this.f33311a.mo24646a(zwcVar);
                    int i6 = this.f33320j;
                    if (i6 != -1) {
                        int i7 = i6 - iM60020a;
                        this.f33320j = i7;
                        if (i7 == 0) {
                            this.f33311a.mo24648c(false);
                            m36625h(1);
                        }
                    }
                }
            } else if (m36622e(zwcVar, this.f33312b.f56210a, 9)) {
                m36625h(m36623f() ? 2 : 0);
            }
        }
    }

    @Override // p001o.hyh
    /* renamed from: b */
    public void mo31289b() {
        this.f33313c = 0;
        this.f33314d = 0;
        this.f33318h = false;
        this.f33311a.mo24647b();
    }

    @Override // p001o.hyh
    /* renamed from: c */
    public void mo31290c(umh umhVar, vq6 vq6Var, hyh.C14129d c14129d) {
        this.f33315e = umhVar;
        this.f33311a.mo24649d(vq6Var, c14129d);
    }

    /* renamed from: d */
    public boolean m36621d(boolean z) {
        return this.f33313c == 3 && this.f33320j == -1 && !(z && (this.f33311a instanceof wv7));
    }

    /* renamed from: e */
    public final boolean m36622e(zwc zwcVar, byte[] bArr, int i) {
        int iMin = Math.min(zwcVar.m60020a(), i - this.f33314d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zwcVar.m60018V(iMin);
        } else {
            zwcVar.m60031l(bArr, this.f33314d, iMin);
        }
        int i2 = this.f33314d + iMin;
        this.f33314d = i2;
        return i2 == i;
    }

    /* renamed from: f */
    public final boolean m36623f() {
        this.f33312b.m58452p(0);
        int iM58444h = this.f33312b.m58444h(24);
        if (iM58444h != 1) {
            ria.m46824h("PesReader", "Unexpected start code prefix: " + iM58444h);
            this.f33320j = -1;
            return false;
        }
        this.f33312b.m58454r(8);
        int iM58444h2 = this.f33312b.m58444h(16);
        this.f33312b.m58454r(5);
        this.f33321k = this.f33312b.m58443g();
        this.f33312b.m58454r(2);
        this.f33316f = this.f33312b.m58443g();
        this.f33317g = this.f33312b.m58443g();
        this.f33312b.m58454r(6);
        int iM58444h3 = this.f33312b.m58444h(8);
        this.f33319i = iM58444h3;
        if (iM58444h2 == 0) {
            this.f33320j = -1;
        } else {
            int i = ((iM58444h2 + 6) - 9) - iM58444h3;
            this.f33320j = i;
            if (i < 0) {
                ria.m46824h("PesReader", "Found negative packet payload size: " + this.f33320j);
                this.f33320j = -1;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m36624g() {
        this.f33312b.m58452p(0);
        this.f33322l = -9223372036854775807L;
        if (this.f33316f) {
            this.f33312b.m58454r(4);
            this.f33312b.m58454r(1);
            this.f33312b.m58454r(1);
            long jM58444h = (this.f33312b.m58444h(3) << 30) | (this.f33312b.m58444h(15) << 15) | this.f33312b.m58444h(15);
            this.f33312b.m58454r(1);
            if (!this.f33318h && this.f33317g) {
                this.f33312b.m58454r(4);
                this.f33312b.m58454r(1);
                this.f33312b.m58454r(1);
                this.f33312b.m58454r(1);
                this.f33315e.m51795b((this.f33312b.m58444h(3) << 30) | (this.f33312b.m58444h(15) << 15) | this.f33312b.m58444h(15));
                this.f33318h = true;
            }
            this.f33322l = this.f33315e.m51795b(jM58444h);
        }
    }

    /* renamed from: h */
    public final void m36625h(int i) {
        this.f33313c = i;
        this.f33314d = 0;
    }
}

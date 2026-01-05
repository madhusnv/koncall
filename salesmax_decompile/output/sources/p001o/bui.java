package p001o;

import p001o.em5;
import p001o.r8j;
import p001o.tt3;
import p001o.zt3;

/* loaded from: classes2.dex */
public class bui extends r8j {

    /* renamed from: k */
    public em5 f16845k;

    /* renamed from: l */
    public gt5 f16846l;

    /* renamed from: o.bui$a */
    public static /* synthetic */ class C12505a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16847a;

        static {
            int[] iArr = new int[r8j.EnumC16557b.values().length];
            f16847a = iArr;
            try {
                iArr[r8j.EnumC16557b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16847a[r8j.EnumC16557b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16847a[r8j.EnumC16557b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public bui(zt3 zt3Var) {
        super(zt3Var);
        em5 em5Var = new em5(this);
        this.f16845k = em5Var;
        this.f16846l = null;
        this.f43168h.f21864e = em5.EnumC13217a.TOP;
        this.f43169i.f21864e = em5.EnumC13217a.BOTTOM;
        em5Var.f21864e = em5.EnumC13217a.BASELINE;
        this.f43166f = 1;
    }

    @Override // p001o.r8j, p001o.cm5
    /* renamed from: a */
    public void mo19843a(cm5 cm5Var) {
        float f;
        float fM59864x;
        float fM59864x2;
        int i;
        int i2 = C12505a.f16847a[this.f43170j.ordinal()];
        if (i2 == 1) {
            m46363p(cm5Var);
        } else if (i2 == 2) {
            m46362o(cm5Var);
        } else if (i2 == 3) {
            zt3 zt3Var = this.f43162b;
            m46361n(cm5Var, zt3Var.f57632R, zt3Var.f57634T, 1);
            return;
        }
        gt5 gt5Var = this.f43165e;
        if (gt5Var.f21862c && !gt5Var.f21869j && this.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT) {
            zt3 zt3Var2 = this.f43162b;
            int i3 = zt3Var2.f57664x;
            if (i3 == 2) {
                zt3 zt3VarM59835M = zt3Var2.m59835M();
                if (zt3VarM59835M != null) {
                    if (zt3VarM59835M.f57646f.f43165e.f21869j) {
                        this.f43165e.mo25285d((int) ((r7.f21866g * this.f43162b.f57619E) + 0.5f));
                    }
                }
            } else if (i3 == 3 && zt3Var2.f57645e.f43165e.f21869j) {
                int iM59865y = zt3Var2.m59865y();
                if (iM59865y == -1) {
                    zt3 zt3Var3 = this.f43162b;
                    f = zt3Var3.f57645e.f43165e.f21866g;
                    fM59864x = zt3Var3.m59864x();
                } else if (iM59865y == 0) {
                    fM59864x2 = r7.f57645e.f43165e.f21866g * this.f43162b.m59864x();
                    i = (int) (fM59864x2 + 0.5f);
                    this.f43165e.mo25285d(i);
                } else if (iM59865y != 1) {
                    i = 0;
                    this.f43165e.mo25285d(i);
                } else {
                    zt3 zt3Var4 = this.f43162b;
                    f = zt3Var4.f57645e.f43165e.f21866g;
                    fM59864x = zt3Var4.m59864x();
                }
                fM59864x2 = f / fM59864x;
                i = (int) (fM59864x2 + 0.5f);
                this.f43165e.mo25285d(i);
            }
        }
        em5 em5Var = this.f43168h;
        if (em5Var.f21862c) {
            em5 em5Var2 = this.f43169i;
            if (em5Var2.f21862c) {
                if (em5Var.f21869j && em5Var2.f21869j && this.f43165e.f21869j) {
                    return;
                }
                if (!this.f43165e.f21869j && this.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                    zt3 zt3Var5 = this.f43162b;
                    if (zt3Var5.f57663w == 0 && !zt3Var5.m0()) {
                        em5 em5Var3 = (em5) this.f43168h.f21871l.get(0);
                        em5 em5Var4 = (em5) this.f43169i.f21871l.get(0);
                        int i4 = em5Var3.f21866g;
                        em5 em5Var5 = this.f43168h;
                        int i5 = i4 + em5Var5.f21865f;
                        int i6 = em5Var4.f21866g + this.f43169i.f21865f;
                        em5Var5.mo25285d(i5);
                        this.f43169i.mo25285d(i6);
                        this.f43165e.mo25285d(i6 - i5);
                        return;
                    }
                }
                if (!this.f43165e.f21869j && this.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT && this.f43161a == 1 && this.f43168h.f21871l.size() > 0 && this.f43169i.f21871l.size() > 0) {
                    em5 em5Var6 = (em5) this.f43168h.f21871l.get(0);
                    int i7 = (((em5) this.f43169i.f21871l.get(0)).f21866g + this.f43169i.f21865f) - (em5Var6.f21866g + this.f43168h.f21865f);
                    gt5 gt5Var2 = this.f43165e;
                    int i8 = gt5Var2.f25783m;
                    if (i7 < i8) {
                        gt5Var2.mo25285d(i7);
                    } else {
                        gt5Var2.mo25285d(i8);
                    }
                }
                if (this.f43165e.f21869j && this.f43168h.f21871l.size() > 0 && this.f43169i.f21871l.size() > 0) {
                    em5 em5Var7 = (em5) this.f43168h.f21871l.get(0);
                    em5 em5Var8 = (em5) this.f43169i.f21871l.get(0);
                    int i9 = em5Var7.f21866g + this.f43168h.f21865f;
                    int i10 = em5Var8.f21866g + this.f43169i.f21865f;
                    float fM59841T = this.f43162b.m59841T();
                    if (em5Var7 == em5Var8) {
                        i9 = em5Var7.f21866g;
                        i10 = em5Var8.f21866g;
                        fM59841T = 0.5f;
                    }
                    this.f43168h.mo25285d((int) (i9 + 0.5f + (((i10 - i9) - this.f43165e.f21866g) * fM59841T)));
                    this.f43169i.mo25285d(this.f43168h.f21866g + this.f43165e.f21866g);
                }
            }
        }
    }

    @Override // p001o.r8j
    /* renamed from: d */
    public void mo19844d() {
        zt3 zt3VarM59835M;
        zt3 zt3VarM59835M2;
        zt3 zt3Var = this.f43162b;
        if (zt3Var.f57641a) {
            this.f43165e.mo25285d(zt3Var.m59866z());
        }
        if (!this.f43165e.f21869j) {
            this.f43164d = this.f43162b.m59843V();
            if (this.f43162b.b0()) {
                this.f16846l = new hf1(this);
            }
            zt3.EnumC18702b enumC18702b = this.f43164d;
            if (enumC18702b != zt3.EnumC18702b.MATCH_CONSTRAINT) {
                if (enumC18702b == zt3.EnumC18702b.MATCH_PARENT && (zt3VarM59835M2 = this.f43162b.m59835M()) != null && zt3VarM59835M2.m59843V() == zt3.EnumC18702b.FIXED) {
                    int iM59866z = (zt3VarM59835M2.m59866z() - this.f43162b.f57632R.m50473f()) - this.f43162b.f57634T.m50473f();
                    m46353b(this.f43168h, zt3VarM59835M2.f57646f.f43168h, this.f43162b.f57632R.m50473f());
                    m46353b(this.f43169i, zt3VarM59835M2.f57646f.f43169i, -this.f43162b.f57634T.m50473f());
                    this.f43165e.mo25285d(iM59866z);
                    return;
                }
                if (this.f43164d == zt3.EnumC18702b.FIXED) {
                    this.f43165e.mo25285d(this.f43162b.m59866z());
                }
            }
        } else if (this.f43164d == zt3.EnumC18702b.MATCH_PARENT && (zt3VarM59835M = this.f43162b.m59835M()) != null && zt3VarM59835M.m59843V() == zt3.EnumC18702b.FIXED) {
            m46353b(this.f43168h, zt3VarM59835M.f57646f.f43168h, this.f43162b.f57632R.m50473f());
            m46353b(this.f43169i, zt3VarM59835M.f57646f.f43169i, -this.f43162b.f57634T.m50473f());
            return;
        }
        gt5 gt5Var = this.f43165e;
        boolean z = gt5Var.f21869j;
        if (z) {
            zt3 zt3Var2 = this.f43162b;
            if (zt3Var2.f57641a) {
                tt3[] tt3VarArr = zt3Var2.f57639Y;
                tt3 tt3Var = tt3VarArr[2];
                tt3 tt3Var2 = tt3Var.f47687f;
                if (tt3Var2 != null && tt3VarArr[3].f47687f != null) {
                    if (zt3Var2.m0()) {
                        this.f43168h.f21865f = this.f43162b.f57639Y[2].m50473f();
                        this.f43169i.f21865f = -this.f43162b.f57639Y[3].m50473f();
                    } else {
                        em5 em5VarM46356h = m46356h(this.f43162b.f57639Y[2]);
                        if (em5VarM46356h != null) {
                            m46353b(this.f43168h, em5VarM46356h, this.f43162b.f57639Y[2].m50473f());
                        }
                        em5 em5VarM46356h2 = m46356h(this.f43162b.f57639Y[3]);
                        if (em5VarM46356h2 != null) {
                            m46353b(this.f43169i, em5VarM46356h2, -this.f43162b.f57639Y[3].m50473f());
                        }
                        this.f43168h.f21861b = true;
                        this.f43169i.f21861b = true;
                    }
                    if (this.f43162b.b0()) {
                        m46353b(this.f16845k, this.f43168h, this.f43162b.m59858r());
                        return;
                    }
                    return;
                }
                if (tt3Var2 != null) {
                    em5 em5VarM46356h3 = m46356h(tt3Var);
                    if (em5VarM46356h3 != null) {
                        m46353b(this.f43168h, em5VarM46356h3, this.f43162b.f57639Y[2].m50473f());
                        m46353b(this.f43169i, this.f43168h, this.f43165e.f21866g);
                        if (this.f43162b.b0()) {
                            m46353b(this.f16845k, this.f43168h, this.f43162b.m59858r());
                            return;
                        }
                        return;
                    }
                    return;
                }
                tt3 tt3Var3 = tt3VarArr[3];
                if (tt3Var3.f47687f != null) {
                    em5 em5VarM46356h4 = m46356h(tt3Var3);
                    if (em5VarM46356h4 != null) {
                        m46353b(this.f43169i, em5VarM46356h4, -this.f43162b.f57639Y[3].m50473f());
                        m46353b(this.f43168h, this.f43169i, -this.f43165e.f21866g);
                    }
                    if (this.f43162b.b0()) {
                        m46353b(this.f16845k, this.f43168h, this.f43162b.m59858r());
                        return;
                    }
                    return;
                }
                tt3 tt3Var4 = tt3VarArr[4];
                if (tt3Var4.f47687f != null) {
                    em5 em5VarM46356h5 = m46356h(tt3Var4);
                    if (em5VarM46356h5 != null) {
                        m46353b(this.f16845k, em5VarM46356h5, 0);
                        m46353b(this.f43168h, this.f16845k, -this.f43162b.m59858r());
                        m46353b(this.f43169i, this.f43168h, this.f43165e.f21866g);
                        return;
                    }
                    return;
                }
                if ((zt3Var2 instanceof by7) || zt3Var2.m59835M() == null || this.f43162b.mo47185q(tt3.EnumC17197a.CENTER).f47687f != null) {
                    return;
                }
                m46353b(this.f43168h, this.f43162b.m59835M().f57646f.f43168h, this.f43162b.a0());
                m46353b(this.f43169i, this.f43168h, this.f43165e.f21866g);
                if (this.f43162b.b0()) {
                    m46353b(this.f16845k, this.f43168h, this.f43162b.m59858r());
                    return;
                }
                return;
            }
        }
        if (z || this.f43164d != zt3.EnumC18702b.MATCH_CONSTRAINT) {
            gt5Var.m25283b(this);
        } else {
            zt3 zt3Var3 = this.f43162b;
            int i = zt3Var3.f57664x;
            if (i == 2) {
                zt3 zt3VarM59835M3 = zt3Var3.m59835M();
                if (zt3VarM59835M3 != null) {
                    gt5 gt5Var2 = zt3VarM59835M3.f57646f.f43165e;
                    this.f43165e.f21871l.add(gt5Var2);
                    gt5Var2.f21870k.add(this.f43165e);
                    gt5 gt5Var3 = this.f43165e;
                    gt5Var3.f21861b = true;
                    gt5Var3.f21870k.add(this.f43168h);
                    this.f43165e.f21870k.add(this.f43169i);
                }
            } else if (i == 3 && !zt3Var3.m0()) {
                zt3 zt3Var4 = this.f43162b;
                if (zt3Var4.f57663w != 3) {
                    gt5 gt5Var4 = zt3Var4.f57645e.f43165e;
                    this.f43165e.f21871l.add(gt5Var4);
                    gt5Var4.f21870k.add(this.f43165e);
                    gt5 gt5Var5 = this.f43165e;
                    gt5Var5.f21861b = true;
                    gt5Var5.f21870k.add(this.f43168h);
                    this.f43165e.f21870k.add(this.f43169i);
                }
            }
        }
        zt3 zt3Var5 = this.f43162b;
        tt3[] tt3VarArr2 = zt3Var5.f57639Y;
        tt3 tt3Var5 = tt3VarArr2[2];
        tt3 tt3Var6 = tt3Var5.f47687f;
        if (tt3Var6 != null && tt3VarArr2[3].f47687f != null) {
            if (zt3Var5.m0()) {
                this.f43168h.f21865f = this.f43162b.f57639Y[2].m50473f();
                this.f43169i.f21865f = -this.f43162b.f57639Y[3].m50473f();
            } else {
                em5 em5VarM46356h6 = m46356h(this.f43162b.f57639Y[2]);
                em5 em5VarM46356h7 = m46356h(this.f43162b.f57639Y[3]);
                if (em5VarM46356h6 != null) {
                    em5VarM46356h6.m25283b(this);
                }
                if (em5VarM46356h7 != null) {
                    em5VarM46356h7.m25283b(this);
                }
                this.f43170j = r8j.EnumC16557b.CENTER;
            }
            if (this.f43162b.b0()) {
                m46354c(this.f16845k, this.f43168h, 1, this.f16846l);
            }
        } else if (tt3Var6 != null) {
            em5 em5VarM46356h8 = m46356h(tt3Var5);
            if (em5VarM46356h8 != null) {
                m46353b(this.f43168h, em5VarM46356h8, this.f43162b.f57639Y[2].m50473f());
                m46354c(this.f43169i, this.f43168h, 1, this.f43165e);
                if (this.f43162b.b0()) {
                    m46354c(this.f16845k, this.f43168h, 1, this.f16846l);
                }
                zt3.EnumC18702b enumC18702b2 = this.f43164d;
                zt3.EnumC18702b enumC18702b3 = zt3.EnumC18702b.MATCH_CONSTRAINT;
                if (enumC18702b2 == enumC18702b3 && this.f43162b.m59864x() > 0.0f) {
                    x08 x08Var = this.f43162b.f57645e;
                    if (x08Var.f43164d == enumC18702b3) {
                        x08Var.f43165e.f21870k.add(this.f43165e);
                        this.f43165e.f21871l.add(this.f43162b.f57645e.f43165e);
                        this.f43165e.f21860a = this;
                    }
                }
            }
        } else {
            tt3 tt3Var7 = tt3VarArr2[3];
            if (tt3Var7.f47687f != null) {
                em5 em5VarM46356h9 = m46356h(tt3Var7);
                if (em5VarM46356h9 != null) {
                    m46353b(this.f43169i, em5VarM46356h9, -this.f43162b.f57639Y[3].m50473f());
                    m46354c(this.f43168h, this.f43169i, -1, this.f43165e);
                    if (this.f43162b.b0()) {
                        m46354c(this.f16845k, this.f43168h, 1, this.f16846l);
                    }
                }
            } else {
                tt3 tt3Var8 = tt3VarArr2[4];
                if (tt3Var8.f47687f != null) {
                    em5 em5VarM46356h10 = m46356h(tt3Var8);
                    if (em5VarM46356h10 != null) {
                        m46353b(this.f16845k, em5VarM46356h10, 0);
                        m46354c(this.f43168h, this.f16845k, -1, this.f16846l);
                        m46354c(this.f43169i, this.f43168h, 1, this.f43165e);
                    }
                } else if (!(zt3Var5 instanceof by7) && zt3Var5.m59835M() != null) {
                    m46353b(this.f43168h, this.f43162b.m59835M().f57646f.f43168h, this.f43162b.a0());
                    m46354c(this.f43169i, this.f43168h, 1, this.f43165e);
                    if (this.f43162b.b0()) {
                        m46354c(this.f16845k, this.f43168h, 1, this.f16846l);
                    }
                    zt3.EnumC18702b enumC18702b4 = this.f43164d;
                    zt3.EnumC18702b enumC18702b5 = zt3.EnumC18702b.MATCH_CONSTRAINT;
                    if (enumC18702b4 == enumC18702b5 && this.f43162b.m59864x() > 0.0f) {
                        x08 x08Var2 = this.f43162b.f57645e;
                        if (x08Var2.f43164d == enumC18702b5) {
                            x08Var2.f43165e.f21870k.add(this.f43165e);
                            this.f43165e.f21871l.add(this.f43162b.f57645e.f43165e);
                            this.f43165e.f21860a = this;
                        }
                    }
                }
            }
        }
        if (this.f43165e.f21871l.size() == 0) {
            this.f43165e.f21862c = true;
        }
    }

    @Override // p001o.r8j
    /* renamed from: e */
    public void mo19845e() {
        em5 em5Var = this.f43168h;
        if (em5Var.f21869j) {
            this.f43162b.s1(em5Var.f21866g);
        }
    }

    @Override // p001o.r8j
    /* renamed from: f */
    public void mo19846f() {
        this.f43163c = null;
        this.f43168h.m25284c();
        this.f43169i.m25284c();
        this.f16845k.m25284c();
        this.f43165e.m25284c();
        this.f43167g = false;
    }

    @Override // p001o.r8j
    /* renamed from: m */
    public boolean mo19847m() {
        return this.f43164d != zt3.EnumC18702b.MATCH_CONSTRAINT || this.f43162b.f57664x == 0;
    }

    /* renamed from: q */
    public void m19848q() {
        this.f43167g = false;
        this.f43168h.m25284c();
        this.f43168h.f21869j = false;
        this.f43169i.m25284c();
        this.f43169i.f21869j = false;
        this.f16845k.m25284c();
        this.f16845k.f21869j = false;
        this.f43165e.f21869j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f43162b.m59862v();
    }
}

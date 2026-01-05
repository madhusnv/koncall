package p001o;

import p001o.em5;
import p001o.r8j;
import p001o.tt3;
import p001o.zt3;

/* loaded from: classes2.dex */
public class x08 extends r8j {

    /* renamed from: k */
    public static int[] f53011k = new int[2];

    /* renamed from: o.x08$a */
    public static /* synthetic */ class C18023a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53012a;

        static {
            int[] iArr = new int[r8j.EnumC16557b.values().length];
            f53012a = iArr;
            try {
                iArr[r8j.EnumC16557b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53012a[r8j.EnumC16557b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53012a[r8j.EnumC16557b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public x08(zt3 zt3Var) {
        super(zt3Var);
        this.f43168h.f21864e = em5.EnumC13217a.LEFT;
        this.f43169i.f21864e = em5.EnumC13217a.RIGHT;
        this.f43166f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02de  */
    @Override // p001o.r8j, p001o.cm5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo19843a(cm5 cm5Var) {
        float f;
        float fM59864x;
        float fM59864x2;
        int i;
        int i2 = C18023a.f53012a[this.f43170j.ordinal()];
        if (i2 == 1) {
            m46363p(cm5Var);
        } else if (i2 == 2) {
            m46362o(cm5Var);
        } else if (i2 == 3) {
            zt3 zt3Var = this.f43162b;
            m46361n(cm5Var, zt3Var.f57631Q, zt3Var.f57633S, 0);
            return;
        }
        if (!this.f43165e.f21869j && this.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT) {
            zt3 zt3Var2 = this.f43162b;
            int i3 = zt3Var2.f57663w;
            if (i3 == 2) {
                zt3 zt3VarM59835M = zt3Var2.m59835M();
                if (zt3VarM59835M != null) {
                    if (zt3VarM59835M.f57645e.f43165e.f21869j) {
                        this.f43165e.mo25285d((int) ((r0.f21866g * this.f43162b.f57616B) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = zt3Var2.f57664x;
                if (i4 == 0 || i4 == 3) {
                    bui buiVar = zt3Var2.f57646f;
                    em5 em5Var = buiVar.f43168h;
                    em5 em5Var2 = buiVar.f43169i;
                    boolean z = zt3Var2.f57631Q.f47687f != null;
                    boolean z2 = zt3Var2.f57632R.f47687f != null;
                    boolean z3 = zt3Var2.f57633S.f47687f != null;
                    boolean z4 = zt3Var2.f57634T.f47687f != null;
                    int iM59865y = zt3Var2.m59865y();
                    if (z && z2 && z3 && z4) {
                        float fM59864x3 = this.f43162b.m59864x();
                        if (em5Var.f21869j && em5Var2.f21869j) {
                            em5 em5Var3 = this.f43168h;
                            if (em5Var3.f21862c && this.f43169i.f21862c) {
                                m55522q(f53011k, ((em5) em5Var3.f21871l.get(0)).f21866g + this.f43168h.f21865f, ((em5) this.f43169i.f21871l.get(0)).f21866g - this.f43169i.f21865f, em5Var.f21866g + em5Var.f21865f, em5Var2.f21866g - em5Var2.f21865f, fM59864x3, iM59865y);
                                this.f43165e.mo25285d(f53011k[0]);
                                this.f43162b.f57646f.f43165e.mo25285d(f53011k[1]);
                                return;
                            }
                            return;
                        }
                        em5 em5Var4 = this.f43168h;
                        if (em5Var4.f21869j) {
                            em5 em5Var5 = this.f43169i;
                            if (em5Var5.f21869j) {
                                if (!em5Var.f21862c || !em5Var2.f21862c) {
                                    return;
                                }
                                m55522q(f53011k, em5Var4.f21866g + em5Var4.f21865f, em5Var5.f21866g - em5Var5.f21865f, ((em5) em5Var.f21871l.get(0)).f21866g + em5Var.f21865f, ((em5) em5Var2.f21871l.get(0)).f21866g - em5Var2.f21865f, fM59864x3, iM59865y);
                                this.f43165e.mo25285d(f53011k[0]);
                                this.f43162b.f57646f.f43165e.mo25285d(f53011k[1]);
                            }
                        }
                        em5 em5Var6 = this.f43168h;
                        if (!em5Var6.f21862c || !this.f43169i.f21862c || !em5Var.f21862c || !em5Var2.f21862c) {
                            return;
                        }
                        m55522q(f53011k, ((em5) em5Var6.f21871l.get(0)).f21866g + this.f43168h.f21865f, ((em5) this.f43169i.f21871l.get(0)).f21866g - this.f43169i.f21865f, ((em5) em5Var.f21871l.get(0)).f21866g + em5Var.f21865f, ((em5) em5Var2.f21871l.get(0)).f21866g - em5Var2.f21865f, fM59864x3, iM59865y);
                        this.f43165e.mo25285d(f53011k[0]);
                        this.f43162b.f57646f.f43165e.mo25285d(f53011k[1]);
                    } else if (z && z3) {
                        if (!this.f43168h.f21862c || !this.f43169i.f21862c) {
                            return;
                        }
                        float fM59864x4 = this.f43162b.m59864x();
                        int i5 = ((em5) this.f43168h.f21871l.get(0)).f21866g + this.f43168h.f21865f;
                        int i6 = ((em5) this.f43169i.f21871l.get(0)).f21866g - this.f43169i.f21865f;
                        if (iM59865y == -1 || iM59865y == 0) {
                            int iM46355g = m46355g(i6 - i5, 0);
                            int i7 = (int) ((iM46355g * fM59864x4) + 0.5f);
                            int iM46355g2 = m46355g(i7, 1);
                            if (i7 != iM46355g2) {
                                iM46355g = (int) ((iM46355g2 / fM59864x4) + 0.5f);
                            }
                            this.f43165e.mo25285d(iM46355g);
                            this.f43162b.f57646f.f43165e.mo25285d(iM46355g2);
                        } else if (iM59865y == 1) {
                            int iM46355g3 = m46355g(i6 - i5, 0);
                            int i8 = (int) ((iM46355g3 / fM59864x4) + 0.5f);
                            int iM46355g4 = m46355g(i8, 1);
                            if (i8 != iM46355g4) {
                                iM46355g3 = (int) ((iM46355g4 * fM59864x4) + 0.5f);
                            }
                            this.f43165e.mo25285d(iM46355g3);
                            this.f43162b.f57646f.f43165e.mo25285d(iM46355g4);
                        }
                    } else if (z2 && z4) {
                        if (!em5Var.f21862c || !em5Var2.f21862c) {
                            return;
                        }
                        float fM59864x5 = this.f43162b.m59864x();
                        int i9 = ((em5) em5Var.f21871l.get(0)).f21866g + em5Var.f21865f;
                        int i10 = ((em5) em5Var2.f21871l.get(0)).f21866g - em5Var2.f21865f;
                        if (iM59865y == -1) {
                            int iM46355g5 = m46355g(i10 - i9, 1);
                            int i11 = (int) ((iM46355g5 / fM59864x5) + 0.5f);
                            int iM46355g6 = m46355g(i11, 0);
                            if (i11 != iM46355g6) {
                                iM46355g5 = (int) ((iM46355g6 * fM59864x5) + 0.5f);
                            }
                            this.f43165e.mo25285d(iM46355g6);
                            this.f43162b.f57646f.f43165e.mo25285d(iM46355g5);
                        } else if (iM59865y == 0) {
                            int iM46355g7 = m46355g(i10 - i9, 1);
                            int i12 = (int) ((iM46355g7 * fM59864x5) + 0.5f);
                            int iM46355g8 = m46355g(i12, 0);
                            if (i12 != iM46355g8) {
                                iM46355g7 = (int) ((iM46355g8 / fM59864x5) + 0.5f);
                            }
                            this.f43165e.mo25285d(iM46355g8);
                            this.f43162b.f57646f.f43165e.mo25285d(iM46355g7);
                        } else if (iM59865y == 1) {
                        }
                    }
                } else {
                    int iM59865y2 = zt3Var2.m59865y();
                    if (iM59865y2 == -1) {
                        zt3 zt3Var3 = this.f43162b;
                        f = zt3Var3.f57646f.f43165e.f21866g;
                        fM59864x = zt3Var3.m59864x();
                    } else if (iM59865y2 == 0) {
                        fM59864x2 = r0.f57646f.f43165e.f21866g / this.f43162b.m59864x();
                        i = (int) (fM59864x2 + 0.5f);
                        this.f43165e.mo25285d(i);
                    } else if (iM59865y2 != 1) {
                        i = 0;
                        this.f43165e.mo25285d(i);
                    } else {
                        zt3 zt3Var4 = this.f43162b;
                        f = zt3Var4.f57646f.f43165e.f21866g;
                        fM59864x = zt3Var4.m59864x();
                    }
                    fM59864x2 = f * fM59864x;
                    i = (int) (fM59864x2 + 0.5f);
                    this.f43165e.mo25285d(i);
                }
            }
        }
        em5 em5Var7 = this.f43168h;
        if (em5Var7.f21862c) {
            em5 em5Var8 = this.f43169i;
            if (em5Var8.f21862c) {
                if (em5Var7.f21869j && em5Var8.f21869j && this.f43165e.f21869j) {
                    return;
                }
                if (!this.f43165e.f21869j && this.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                    zt3 zt3Var5 = this.f43162b;
                    if (zt3Var5.f57663w == 0 && !zt3Var5.k0()) {
                        em5 em5Var9 = (em5) this.f43168h.f21871l.get(0);
                        em5 em5Var10 = (em5) this.f43169i.f21871l.get(0);
                        int i13 = em5Var9.f21866g;
                        em5 em5Var11 = this.f43168h;
                        int i14 = i13 + em5Var11.f21865f;
                        int i15 = em5Var10.f21866g + this.f43169i.f21865f;
                        em5Var11.mo25285d(i14);
                        this.f43169i.mo25285d(i15);
                        this.f43165e.mo25285d(i15 - i14);
                        return;
                    }
                }
                if (!this.f43165e.f21869j && this.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT && this.f43161a == 1 && this.f43168h.f21871l.size() > 0 && this.f43169i.f21871l.size() > 0) {
                    int iMin = Math.min((((em5) this.f43169i.f21871l.get(0)).f21866g + this.f43169i.f21865f) - (((em5) this.f43168h.f21871l.get(0)).f21866g + this.f43168h.f21865f), this.f43165e.f25783m);
                    zt3 zt3Var6 = this.f43162b;
                    int i16 = zt3Var6.f57615A;
                    int iMax = Math.max(zt3Var6.f57666z, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    this.f43165e.mo25285d(iMax);
                }
                if (this.f43165e.f21869j) {
                    em5 em5Var12 = (em5) this.f43168h.f21871l.get(0);
                    em5 em5Var13 = (em5) this.f43169i.f21871l.get(0);
                    int i17 = em5Var12.f21866g + this.f43168h.f21865f;
                    int i18 = em5Var13.f21866g + this.f43169i.f21865f;
                    float fM59823A = this.f43162b.m59823A();
                    if (em5Var12 == em5Var13) {
                        i17 = em5Var12.f21866g;
                        i18 = em5Var13.f21866g;
                        fM59823A = 0.5f;
                    }
                    this.f43168h.mo25285d((int) (i17 + 0.5f + (((i18 - i17) - this.f43165e.f21866g) * fM59823A)));
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
            this.f43165e.mo25285d(zt3Var.m59846Y());
        }
        if (this.f43165e.f21869j) {
            zt3.EnumC18702b enumC18702b = this.f43164d;
            zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.MATCH_PARENT;
            if (enumC18702b == enumC18702b2 && (zt3VarM59835M = this.f43162b.m59835M()) != null && (zt3VarM59835M.m59825C() == zt3.EnumC18702b.FIXED || zt3VarM59835M.m59825C() == enumC18702b2)) {
                m46353b(this.f43168h, zt3VarM59835M.f57645e.f43168h, this.f43162b.f57631Q.m50473f());
                m46353b(this.f43169i, zt3VarM59835M.f57645e.f43169i, -this.f43162b.f57633S.m50473f());
                return;
            }
        } else {
            zt3.EnumC18702b enumC18702bM59825C = this.f43162b.m59825C();
            this.f43164d = enumC18702bM59825C;
            if (enumC18702bM59825C != zt3.EnumC18702b.MATCH_CONSTRAINT) {
                zt3.EnumC18702b enumC18702b3 = zt3.EnumC18702b.MATCH_PARENT;
                if (enumC18702bM59825C == enumC18702b3 && (zt3VarM59835M2 = this.f43162b.m59835M()) != null && (zt3VarM59835M2.m59825C() == zt3.EnumC18702b.FIXED || zt3VarM59835M2.m59825C() == enumC18702b3)) {
                    int iM59846Y = (zt3VarM59835M2.m59846Y() - this.f43162b.f57631Q.m50473f()) - this.f43162b.f57633S.m50473f();
                    m46353b(this.f43168h, zt3VarM59835M2.f57645e.f43168h, this.f43162b.f57631Q.m50473f());
                    m46353b(this.f43169i, zt3VarM59835M2.f57645e.f43169i, -this.f43162b.f57633S.m50473f());
                    this.f43165e.mo25285d(iM59846Y);
                    return;
                }
                if (this.f43164d == zt3.EnumC18702b.FIXED) {
                    this.f43165e.mo25285d(this.f43162b.m59846Y());
                }
            }
        }
        gt5 gt5Var = this.f43165e;
        if (gt5Var.f21869j) {
            zt3 zt3Var2 = this.f43162b;
            if (zt3Var2.f57641a) {
                tt3[] tt3VarArr = zt3Var2.f57639Y;
                tt3 tt3Var = tt3VarArr[0];
                tt3 tt3Var2 = tt3Var.f47687f;
                if (tt3Var2 != null && tt3VarArr[1].f47687f != null) {
                    if (zt3Var2.k0()) {
                        this.f43168h.f21865f = this.f43162b.f57639Y[0].m50473f();
                        this.f43169i.f21865f = -this.f43162b.f57639Y[1].m50473f();
                        return;
                    }
                    em5 em5VarM46356h = m46356h(this.f43162b.f57639Y[0]);
                    if (em5VarM46356h != null) {
                        m46353b(this.f43168h, em5VarM46356h, this.f43162b.f57639Y[0].m50473f());
                    }
                    em5 em5VarM46356h2 = m46356h(this.f43162b.f57639Y[1]);
                    if (em5VarM46356h2 != null) {
                        m46353b(this.f43169i, em5VarM46356h2, -this.f43162b.f57639Y[1].m50473f());
                    }
                    this.f43168h.f21861b = true;
                    this.f43169i.f21861b = true;
                    return;
                }
                if (tt3Var2 != null) {
                    em5 em5VarM46356h3 = m46356h(tt3Var);
                    if (em5VarM46356h3 != null) {
                        m46353b(this.f43168h, em5VarM46356h3, this.f43162b.f57639Y[0].m50473f());
                        m46353b(this.f43169i, this.f43168h, this.f43165e.f21866g);
                        return;
                    }
                    return;
                }
                tt3 tt3Var3 = tt3VarArr[1];
                if (tt3Var3.f47687f != null) {
                    em5 em5VarM46356h4 = m46356h(tt3Var3);
                    if (em5VarM46356h4 != null) {
                        m46353b(this.f43169i, em5VarM46356h4, -this.f43162b.f57639Y[1].m50473f());
                        m46353b(this.f43168h, this.f43169i, -this.f43165e.f21866g);
                        return;
                    }
                    return;
                }
                if ((zt3Var2 instanceof by7) || zt3Var2.m59835M() == null || this.f43162b.mo47185q(tt3.EnumC17197a.CENTER).f47687f != null) {
                    return;
                }
                m46353b(this.f43168h, this.f43162b.m59835M().f57645e.f43168h, this.f43162b.m59847Z());
                m46353b(this.f43169i, this.f43168h, this.f43165e.f21866g);
                return;
            }
        }
        if (this.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT) {
            zt3 zt3Var3 = this.f43162b;
            int i = zt3Var3.f57663w;
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
            } else if (i == 3) {
                if (zt3Var3.f57664x == 3) {
                    this.f43168h.f21860a = this;
                    this.f43169i.f21860a = this;
                    bui buiVar = zt3Var3.f57646f;
                    buiVar.f43168h.f21860a = this;
                    buiVar.f43169i.f21860a = this;
                    gt5Var.f21860a = this;
                    if (zt3Var3.m0()) {
                        this.f43165e.f21871l.add(this.f43162b.f57646f.f43165e);
                        this.f43162b.f57646f.f43165e.f21870k.add(this.f43165e);
                        bui buiVar2 = this.f43162b.f57646f;
                        buiVar2.f43165e.f21860a = this;
                        this.f43165e.f21871l.add(buiVar2.f43168h);
                        this.f43165e.f21871l.add(this.f43162b.f57646f.f43169i);
                        this.f43162b.f57646f.f43168h.f21870k.add(this.f43165e);
                        this.f43162b.f57646f.f43169i.f21870k.add(this.f43165e);
                    } else if (this.f43162b.k0()) {
                        this.f43162b.f57646f.f43165e.f21871l.add(this.f43165e);
                        this.f43165e.f21870k.add(this.f43162b.f57646f.f43165e);
                    } else {
                        this.f43162b.f57646f.f43165e.f21871l.add(this.f43165e);
                    }
                } else {
                    gt5 gt5Var4 = zt3Var3.f57646f.f43165e;
                    gt5Var.f21871l.add(gt5Var4);
                    gt5Var4.f21870k.add(this.f43165e);
                    this.f43162b.f57646f.f43168h.f21870k.add(this.f43165e);
                    this.f43162b.f57646f.f43169i.f21870k.add(this.f43165e);
                    gt5 gt5Var5 = this.f43165e;
                    gt5Var5.f21861b = true;
                    gt5Var5.f21870k.add(this.f43168h);
                    this.f43165e.f21870k.add(this.f43169i);
                    this.f43168h.f21871l.add(this.f43165e);
                    this.f43169i.f21871l.add(this.f43165e);
                }
            }
        }
        zt3 zt3Var4 = this.f43162b;
        tt3[] tt3VarArr2 = zt3Var4.f57639Y;
        tt3 tt3Var4 = tt3VarArr2[0];
        tt3 tt3Var5 = tt3Var4.f47687f;
        if (tt3Var5 != null && tt3VarArr2[1].f47687f != null) {
            if (zt3Var4.k0()) {
                this.f43168h.f21865f = this.f43162b.f57639Y[0].m50473f();
                this.f43169i.f21865f = -this.f43162b.f57639Y[1].m50473f();
                return;
            }
            em5 em5VarM46356h5 = m46356h(this.f43162b.f57639Y[0]);
            em5 em5VarM46356h6 = m46356h(this.f43162b.f57639Y[1]);
            if (em5VarM46356h5 != null) {
                em5VarM46356h5.m25283b(this);
            }
            if (em5VarM46356h6 != null) {
                em5VarM46356h6.m25283b(this);
            }
            this.f43170j = r8j.EnumC16557b.CENTER;
            return;
        }
        if (tt3Var5 != null) {
            em5 em5VarM46356h7 = m46356h(tt3Var4);
            if (em5VarM46356h7 != null) {
                m46353b(this.f43168h, em5VarM46356h7, this.f43162b.f57639Y[0].m50473f());
                m46354c(this.f43169i, this.f43168h, 1, this.f43165e);
                return;
            }
            return;
        }
        tt3 tt3Var6 = tt3VarArr2[1];
        if (tt3Var6.f47687f != null) {
            em5 em5VarM46356h8 = m46356h(tt3Var6);
            if (em5VarM46356h8 != null) {
                m46353b(this.f43169i, em5VarM46356h8, -this.f43162b.f57639Y[1].m50473f());
                m46354c(this.f43168h, this.f43169i, -1, this.f43165e);
                return;
            }
            return;
        }
        if ((zt3Var4 instanceof by7) || zt3Var4.m59835M() == null) {
            return;
        }
        m46353b(this.f43168h, this.f43162b.m59835M().f57645e.f43168h, this.f43162b.m59847Z());
        m46354c(this.f43169i, this.f43168h, 1, this.f43165e);
    }

    @Override // p001o.r8j
    /* renamed from: e */
    public void mo19845e() {
        em5 em5Var = this.f43168h;
        if (em5Var.f21869j) {
            this.f43162b.r1(em5Var.f21866g);
        }
    }

    @Override // p001o.r8j
    /* renamed from: f */
    public void mo19846f() {
        this.f43163c = null;
        this.f43168h.m25284c();
        this.f43169i.m25284c();
        this.f43165e.m25284c();
        this.f43167g = false;
    }

    @Override // p001o.r8j
    /* renamed from: m */
    public boolean mo19847m() {
        return this.f43164d != zt3.EnumC18702b.MATCH_CONSTRAINT || this.f43162b.f57663w == 0;
    }

    /* renamed from: q */
    public final void m55522q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* renamed from: r */
    public void m55523r() {
        this.f43167g = false;
        this.f43168h.m25284c();
        this.f43168h.f21869j = false;
        this.f43169i.m25284c();
        this.f43169i.f21869j = false;
        this.f43165e.f21869j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f43162b.m59862v();
    }
}

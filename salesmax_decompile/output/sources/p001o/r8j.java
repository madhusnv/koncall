package p001o;

import p001o.tt3;
import p001o.zt3;

/* loaded from: classes2.dex */
public abstract class r8j implements cm5 {

    /* renamed from: a */
    public int f43161a;

    /* renamed from: b */
    public zt3 f43162b;

    /* renamed from: c */
    public ove f43163c;

    /* renamed from: d */
    public zt3.EnumC18702b f43164d;

    /* renamed from: e */
    public gt5 f43165e = new gt5(this);

    /* renamed from: f */
    public int f43166f = 0;

    /* renamed from: g */
    public boolean f43167g = false;

    /* renamed from: h */
    public em5 f43168h = new em5(this);

    /* renamed from: i */
    public em5 f43169i = new em5(this);

    /* renamed from: j */
    public EnumC16557b f43170j = EnumC16557b.NONE;

    /* renamed from: o.r8j$a */
    public static /* synthetic */ class C16556a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43171a;

        static {
            int[] iArr = new int[tt3.EnumC17197a.values().length];
            f43171a = iArr;
            try {
                iArr[tt3.EnumC17197a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43171a[tt3.EnumC17197a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43171a[tt3.EnumC17197a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43171a[tt3.EnumC17197a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43171a[tt3.EnumC17197a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: o.r8j$b */
    public enum EnumC16557b {
        NONE,
        START,
        END,
        CENTER
    }

    public r8j(zt3 zt3Var) {
        this.f43162b = zt3Var;
    }

    @Override // p001o.cm5
    /* renamed from: a */
    public abstract void mo19843a(cm5 cm5Var);

    /* renamed from: b */
    public final void m46353b(em5 em5Var, em5 em5Var2, int i) {
        em5Var.f21871l.add(em5Var2);
        em5Var.f21865f = i;
        em5Var2.f21870k.add(em5Var);
    }

    /* renamed from: c */
    public final void m46354c(em5 em5Var, em5 em5Var2, int i, gt5 gt5Var) {
        em5Var.f21871l.add(em5Var2);
        em5Var.f21871l.add(this.f43165e);
        em5Var.f21867h = i;
        em5Var.f21868i = gt5Var;
        em5Var2.f21870k.add(em5Var);
        gt5Var.f21870k.add(em5Var);
    }

    /* renamed from: d */
    public abstract void mo19844d();

    /* renamed from: e */
    public abstract void mo19845e();

    /* renamed from: f */
    public abstract void mo19846f();

    /* renamed from: g */
    public final int m46355g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            zt3 zt3Var = this.f43162b;
            int i3 = zt3Var.f57615A;
            iMax = Math.max(zt3Var.f57666z, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            zt3 zt3Var2 = this.f43162b;
            int i4 = zt3Var2.f57618D;
            iMax = Math.max(zt3Var2.f57617C, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    /* renamed from: h */
    public final em5 m46356h(tt3 tt3Var) {
        tt3 tt3Var2 = tt3Var.f47687f;
        if (tt3Var2 == null) {
            return null;
        }
        zt3 zt3Var = tt3Var2.f47685d;
        int i = C16556a.f43171a[tt3Var2.f47686e.ordinal()];
        if (i == 1) {
            return zt3Var.f57645e.f43168h;
        }
        if (i == 2) {
            return zt3Var.f57645e.f43169i;
        }
        if (i == 3) {
            return zt3Var.f57646f.f43168h;
        }
        if (i == 4) {
            return zt3Var.f57646f.f16845k;
        }
        if (i != 5) {
            return null;
        }
        return zt3Var.f57646f.f43169i;
    }

    /* renamed from: i */
    public final em5 m46357i(tt3 tt3Var, int i) {
        tt3 tt3Var2 = tt3Var.f47687f;
        if (tt3Var2 == null) {
            return null;
        }
        zt3 zt3Var = tt3Var2.f47685d;
        r8j r8jVar = i == 0 ? zt3Var.f57645e : zt3Var.f57646f;
        int i2 = C16556a.f43171a[tt3Var2.f47686e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return r8jVar.f43169i;
        }
        return r8jVar.f43168h;
    }

    /* renamed from: j */
    public long mo46358j() {
        if (this.f43165e.f21869j) {
            return r0.f21866g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m46359k() {
        return this.f43167g;
    }

    /* renamed from: l */
    public final void m46360l(int i, int i2) {
        int i3 = this.f43161a;
        if (i3 == 0) {
            this.f43165e.mo25285d(m46355g(i2, i));
            return;
        }
        if (i3 == 1) {
            this.f43165e.mo25285d(Math.min(m46355g(this.f43165e.f25783m, i), i2));
            return;
        }
        if (i3 == 2) {
            zt3 zt3VarM59835M = this.f43162b.m59835M();
            if (zt3VarM59835M != null) {
                if ((i == 0 ? zt3VarM59835M.f57645e : zt3VarM59835M.f57646f).f43165e.f21869j) {
                    this.f43165e.mo25285d(m46355g((int) ((r9.f21866g * (i == 0 ? this.f43162b.f57616B : this.f43162b.f57619E)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 3) {
            return;
        }
        zt3 zt3Var = this.f43162b;
        r8j r8jVar = zt3Var.f57645e;
        zt3.EnumC18702b enumC18702b = r8jVar.f43164d;
        zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.MATCH_CONSTRAINT;
        if (enumC18702b == enumC18702b2 && r8jVar.f43161a == 3) {
            bui buiVar = zt3Var.f57646f;
            if (buiVar.f43164d == enumC18702b2 && buiVar.f43161a == 3) {
                return;
            }
        }
        if (i == 0) {
            r8jVar = zt3Var.f57646f;
        }
        if (r8jVar.f43165e.f21869j) {
            float fM59864x = zt3Var.m59864x();
            this.f43165e.mo25285d(i == 1 ? (int) ((r8jVar.f43165e.f21866g / fM59864x) + 0.5f) : (int) ((fM59864x * r8jVar.f43165e.f21866g) + 0.5f));
        }
    }

    /* renamed from: m */
    public abstract boolean mo19847m();

    /* renamed from: n */
    public void m46361n(cm5 cm5Var, tt3 tt3Var, tt3 tt3Var2, int i) {
        em5 em5VarM46356h = m46356h(tt3Var);
        em5 em5VarM46356h2 = m46356h(tt3Var2);
        if (em5VarM46356h.f21869j && em5VarM46356h2.f21869j) {
            int iM50473f = em5VarM46356h.f21866g + tt3Var.m50473f();
            int iM50473f2 = em5VarM46356h2.f21866g - tt3Var2.m50473f();
            int i2 = iM50473f2 - iM50473f;
            if (!this.f43165e.f21869j && this.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                m46360l(i, i2);
            }
            gt5 gt5Var = this.f43165e;
            if (gt5Var.f21869j) {
                if (gt5Var.f21866g == i2) {
                    this.f43168h.mo25285d(iM50473f);
                    this.f43169i.mo25285d(iM50473f2);
                    return;
                }
                float fM59823A = i == 0 ? this.f43162b.m59823A() : this.f43162b.m59841T();
                if (em5VarM46356h == em5VarM46356h2) {
                    iM50473f = em5VarM46356h.f21866g;
                    iM50473f2 = em5VarM46356h2.f21866g;
                    fM59823A = 0.5f;
                }
                this.f43168h.mo25285d((int) (iM50473f + 0.5f + (((iM50473f2 - iM50473f) - this.f43165e.f21866g) * fM59823A)));
                this.f43169i.mo25285d(this.f43168h.f21866g + this.f43165e.f21866g);
            }
        }
    }

    /* renamed from: o */
    public void m46362o(cm5 cm5Var) {
    }

    /* renamed from: p */
    public void m46363p(cm5 cm5Var) {
    }
}

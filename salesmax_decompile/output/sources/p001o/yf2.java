package p001o;

import java.util.ArrayList;
import p001o.zt3;

/* loaded from: classes2.dex */
public class yf2 {

    /* renamed from: a */
    public zt3 f55393a;

    /* renamed from: b */
    public zt3 f55394b;

    /* renamed from: c */
    public zt3 f55395c;

    /* renamed from: d */
    public zt3 f55396d;

    /* renamed from: e */
    public zt3 f55397e;

    /* renamed from: f */
    public zt3 f55398f;

    /* renamed from: g */
    public zt3 f55399g;

    /* renamed from: h */
    public ArrayList f55400h;

    /* renamed from: i */
    public int f55401i;

    /* renamed from: j */
    public int f55402j;

    /* renamed from: k */
    public float f55403k = 0.0f;

    /* renamed from: l */
    public int f55404l;

    /* renamed from: m */
    public int f55405m;

    /* renamed from: n */
    public int f55406n;

    /* renamed from: o */
    public boolean f55407o;

    /* renamed from: p */
    public int f55408p;

    /* renamed from: q */
    public boolean f55409q;

    /* renamed from: r */
    public boolean f55410r;

    /* renamed from: s */
    public boolean f55411s;

    /* renamed from: t */
    public boolean f55412t;

    /* renamed from: u */
    public boolean f55413u;

    /* renamed from: v */
    public boolean f55414v;

    public yf2(zt3 zt3Var, int i, boolean z) {
        this.f55393a = zt3Var;
        this.f55408p = i;
        this.f55409q = z;
    }

    /* renamed from: c */
    public static boolean m57717c(zt3 zt3Var, int i) {
        int i2;
        return zt3Var.m59845X() != 8 && zt3Var.b0[i] == zt3.EnumC18702b.MATCH_CONSTRAINT && ((i2 = zt3Var.f57665y[i]) == 0 || i2 == 3);
    }

    /* renamed from: a */
    public void m57718a() {
        if (!this.f55414v) {
            m57719b();
        }
        this.f55414v = true;
    }

    /* renamed from: b */
    public final void m57719b() {
        int i = this.f55408p * 2;
        zt3 zt3Var = this.f55393a;
        this.f55407o = true;
        zt3 zt3Var2 = zt3Var;
        boolean z = false;
        while (!z) {
            this.f55401i++;
            zt3[] zt3VarArr = zt3Var.P0;
            int i2 = this.f55408p;
            zt3 zt3Var3 = null;
            zt3VarArr[i2] = null;
            zt3Var.O0[i2] = null;
            if (zt3Var.m59845X() != 8) {
                this.f55404l++;
                zt3.EnumC18702b enumC18702bM59863w = zt3Var.m59863w(this.f55408p);
                zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.MATCH_CONSTRAINT;
                if (enumC18702bM59863w != enumC18702b) {
                    this.f55405m += zt3Var.m59829G(this.f55408p);
                }
                int iM50473f = this.f55405m + zt3Var.f57639Y[i].m50473f();
                this.f55405m = iM50473f;
                int i3 = i + 1;
                this.f55405m = iM50473f + zt3Var.f57639Y[i3].m50473f();
                int iM50473f2 = this.f55406n + zt3Var.f57639Y[i].m50473f();
                this.f55406n = iM50473f2;
                this.f55406n = iM50473f2 + zt3Var.f57639Y[i3].m50473f();
                if (this.f55394b == null) {
                    this.f55394b = zt3Var;
                }
                this.f55396d = zt3Var;
                zt3.EnumC18702b[] enumC18702bArr = zt3Var.b0;
                int i4 = this.f55408p;
                if (enumC18702bArr[i4] == enumC18702b) {
                    int i5 = zt3Var.f57665y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f55402j++;
                        float f = zt3Var.N0[i4];
                        if (f > 0.0f) {
                            this.f55403k += f;
                        }
                        if (m57717c(zt3Var, i4)) {
                            if (f < 0.0f) {
                                this.f55410r = true;
                            } else {
                                this.f55411s = true;
                            }
                            if (this.f55400h == null) {
                                this.f55400h = new ArrayList();
                            }
                            this.f55400h.add(zt3Var);
                        }
                        if (this.f55398f == null) {
                            this.f55398f = zt3Var;
                        }
                        zt3 zt3Var4 = this.f55399g;
                        if (zt3Var4 != null) {
                            zt3Var4.O0[this.f55408p] = zt3Var;
                        }
                        this.f55399g = zt3Var;
                    }
                    if (this.f55408p == 0) {
                        if (zt3Var.f57663w != 0 || zt3Var.f57666z != 0 || zt3Var.f57615A != 0) {
                            this.f55407o = false;
                        }
                    } else if (zt3Var.f57664x != 0 || zt3Var.f57617C != 0 || zt3Var.f57618D != 0) {
                        this.f55407o = false;
                    }
                    if (zt3Var.f0 != 0.0f) {
                        this.f55407o = false;
                        this.f55413u = true;
                    }
                }
            }
            if (zt3Var2 != zt3Var) {
                zt3Var2.P0[this.f55408p] = zt3Var;
            }
            tt3 tt3Var = zt3Var.f57639Y[i + 1].f47687f;
            if (tt3Var != null) {
                zt3 zt3Var5 = tt3Var.f47685d;
                tt3 tt3Var2 = zt3Var5.f57639Y[i].f47687f;
                if (tt3Var2 != null && tt3Var2.f47685d == zt3Var) {
                    zt3Var3 = zt3Var5;
                }
            }
            if (zt3Var3 == null) {
                zt3Var3 = zt3Var;
                z = true;
            }
            zt3Var2 = zt3Var;
            zt3Var = zt3Var3;
        }
        zt3 zt3Var6 = this.f55394b;
        if (zt3Var6 != null) {
            this.f55405m -= zt3Var6.f57639Y[i].m50473f();
        }
        zt3 zt3Var7 = this.f55396d;
        if (zt3Var7 != null) {
            this.f55405m -= zt3Var7.f57639Y[i + 1].m50473f();
        }
        this.f55395c = zt3Var;
        if (this.f55408p == 0 && this.f55409q) {
            this.f55397e = zt3Var;
        } else {
            this.f55397e = this.f55393a;
        }
        this.f55412t = this.f55411s && this.f55410r;
    }
}

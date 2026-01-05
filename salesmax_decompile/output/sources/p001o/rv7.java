package p001o;

import java.util.HashMap;
import p001o.tt3;
import p001o.zt3;

/* loaded from: classes2.dex */
public class rv7 extends zt3 {
    public float V0 = -1.0f;
    public int W0 = -1;
    public int X0 = -1;
    public boolean Y0 = true;
    public tt3 Z0 = this.f57632R;
    public int a1 = 0;
    public int b1 = 0;
    public boolean c1;

    /* renamed from: o.rv7$a */
    public static /* synthetic */ class C16673a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44130a;

        static {
            int[] iArr = new int[tt3.EnumC17197a.values().length];
            f44130a = iArr;
            try {
                iArr[tt3.EnumC17197a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44130a[tt3.EnumC17197a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44130a[tt3.EnumC17197a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44130a[tt3.EnumC17197a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44130a[tt3.EnumC17197a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44130a[tt3.EnumC17197a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44130a[tt3.EnumC17197a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44130a[tt3.EnumC17197a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44130a[tt3.EnumC17197a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public rv7() {
        this.f57640Z.clear();
        this.f57640Z.add(this.Z0);
        int length = this.f57639Y.length;
        for (int i = 0; i < length; i++) {
            this.f57639Y[i] = this.Z0;
        }
    }

    public float A1() {
        return this.V0;
    }

    public void B1(int i) {
        this.Z0.m50487t(i);
        this.c1 = true;
    }

    public void C1(int i) {
        if (i > -1) {
            this.V0 = -1.0f;
            this.W0 = i;
            this.X0 = -1;
        }
    }

    public void D1(int i) {
        if (i > -1) {
            this.V0 = -1.0f;
            this.W0 = -1;
            this.X0 = i;
        }
    }

    public void E1(float f) {
        if (f > -1.0f) {
            this.V0 = f;
            this.W0 = -1;
            this.X0 = -1;
        }
    }

    public void F1(int i) {
        if (this.a1 == i) {
            return;
        }
        this.a1 = i;
        this.f57640Z.clear();
        if (this.a1 == 1) {
            this.Z0 = this.f57631Q;
        } else {
            this.Z0 = this.f57632R;
        }
        this.f57640Z.add(this.Z0);
        int length = this.f57639Y.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f57639Y[i2] = this.Z0;
        }
    }

    @Override // p001o.zt3
    /* renamed from: g */
    public void mo47183g(sda sdaVar, boolean z) {
        au3 au3Var = (au3) m59835M();
        if (au3Var == null) {
            return;
        }
        tt3 tt3VarMo47185q = au3Var.mo47185q(tt3.EnumC17197a.LEFT);
        tt3 tt3VarMo47185q2 = au3Var.mo47185q(tt3.EnumC17197a.RIGHT);
        zt3 zt3Var = this.c0;
        boolean z2 = zt3Var != null && zt3Var.b0[0] == zt3.EnumC18702b.WRAP_CONTENT;
        if (this.a1 == 0) {
            tt3VarMo47185q = au3Var.mo47185q(tt3.EnumC17197a.TOP);
            tt3VarMo47185q2 = au3Var.mo47185q(tt3.EnumC17197a.BOTTOM);
            zt3 zt3Var2 = this.c0;
            z2 = zt3Var2 != null && zt3Var2.b0[1] == zt3.EnumC18702b.WRAP_CONTENT;
        }
        if (this.c1 && this.Z0.m50481n()) {
            fzf fzfVarM48251q = sdaVar.m48251q(this.Z0);
            sdaVar.m48240f(fzfVarM48251q, this.Z0.m50472e());
            if (this.W0 != -1) {
                if (z2) {
                    sdaVar.m48242h(sdaVar.m48251q(tt3VarMo47185q2), fzfVarM48251q, 0, 5);
                }
            } else if (this.X0 != -1 && z2) {
                fzf fzfVarM48251q2 = sdaVar.m48251q(tt3VarMo47185q2);
                sdaVar.m48242h(fzfVarM48251q, sdaVar.m48251q(tt3VarMo47185q), 0, 5);
                sdaVar.m48242h(fzfVarM48251q2, fzfVarM48251q, 0, 5);
            }
            this.c1 = false;
            return;
        }
        if (this.W0 != -1) {
            fzf fzfVarM48251q3 = sdaVar.m48251q(this.Z0);
            sdaVar.m48239e(fzfVarM48251q3, sdaVar.m48251q(tt3VarMo47185q), this.W0, 8);
            if (z2) {
                sdaVar.m48242h(sdaVar.m48251q(tt3VarMo47185q2), fzfVarM48251q3, 0, 5);
                return;
            }
            return;
        }
        if (this.X0 == -1) {
            if (this.V0 != -1.0f) {
                sdaVar.m48238d(sda.m48228s(sdaVar, sdaVar.m48251q(this.Z0), sdaVar.m48251q(tt3VarMo47185q2), this.V0));
                return;
            }
            return;
        }
        fzf fzfVarM48251q4 = sdaVar.m48251q(this.Z0);
        fzf fzfVarM48251q5 = sdaVar.m48251q(tt3VarMo47185q2);
        sdaVar.m48239e(fzfVarM48251q4, fzfVarM48251q5, -this.X0, 8);
        if (z2) {
            sdaVar.m48242h(fzfVarM48251q4, sdaVar.m48251q(tt3VarMo47185q), 0, 5);
            sdaVar.m48242h(fzfVarM48251q5, fzfVarM48251q4, 0, 5);
        }
    }

    @Override // p001o.zt3
    /* renamed from: h */
    public boolean mo47184h() {
        return true;
    }

    @Override // p001o.zt3
    /* renamed from: n */
    public void mo23956n(zt3 zt3Var, HashMap map) {
        super.mo23956n(zt3Var, map);
        rv7 rv7Var = (rv7) zt3Var;
        this.V0 = rv7Var.V0;
        this.W0 = rv7Var.W0;
        this.X0 = rv7Var.X0;
        this.Y0 = rv7Var.Y0;
        F1(rv7Var.a1);
    }

    @Override // p001o.zt3
    public boolean p0() {
        return this.c1;
    }

    @Override // p001o.zt3
    /* renamed from: q */
    public tt3 mo47185q(tt3.EnumC17197a enumC17197a) {
        int i = C16673a.f44130a[enumC17197a.ordinal()];
        if (i == 1 || i == 2) {
            if (this.a1 == 1) {
                return this.Z0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.a1 == 0) {
            return this.Z0;
        }
        return null;
    }

    @Override // p001o.zt3
    public boolean q0() {
        return this.c1;
    }

    @Override // p001o.zt3
    public void v1(sda sdaVar, boolean z) {
        if (m59835M() == null) {
            return;
        }
        int iM48257y = sdaVar.m48257y(this.Z0);
        if (this.a1 == 1) {
            r1(iM48257y);
            s1(0);
            Q0(m59835M().m59866z());
            p1(0);
            return;
        }
        r1(0);
        s1(iM48257y);
        p1(m59835M().m59846Y());
        Q0(0);
    }

    public tt3 w1() {
        return this.Z0;
    }

    public int x1() {
        return this.a1;
    }

    public int y1() {
        return this.W0;
    }

    public int z1() {
        return this.X0;
    }
}

package p001o;

import java.util.HashSet;
import p001o.rf1;
import p001o.zt3;

/* loaded from: classes2.dex */
public abstract class x0j extends dy7 {
    public int X0 = 0;
    public int Y0 = 0;
    public int Z0 = 0;
    public int a1 = 0;
    public int b1 = 0;
    public int c1 = 0;
    public int d1 = 0;
    public int e1 = 0;
    public boolean f1 = false;
    public int g1 = 0;
    public int h1 = 0;
    public rf1.C16598a i1 = new rf1.C16598a();
    public rf1.InterfaceC16599b j1 = null;

    public boolean A1(HashSet hashSet) {
        for (int i = 0; i < this.W0; i++) {
            if (hashSet.contains(this.V0[i])) {
                return true;
            }
        }
        return false;
    }

    public int B1() {
        return this.h1;
    }

    public int C1() {
        return this.g1;
    }

    public int D1() {
        return this.Y0;
    }

    public int E1() {
        return this.d1;
    }

    public int F1() {
        return this.e1;
    }

    public int G1() {
        return this.X0;
    }

    public abstract void H1(int i, int i2, int i3, int i4);

    public void I1(zt3 zt3Var, zt3.EnumC18702b enumC18702b, int i, zt3.EnumC18702b enumC18702b2, int i2) {
        while (this.j1 == null && m59835M() != null) {
            this.j1 = ((au3) m59835M()).O1();
        }
        rf1.C16598a c16598a = this.i1;
        c16598a.f43470a = enumC18702b;
        c16598a.f43471b = enumC18702b2;
        c16598a.f43472c = i;
        c16598a.f43473d = i2;
        this.j1.mo5626b(zt3Var, c16598a);
        zt3Var.p1(this.i1.f43474e);
        zt3Var.Q0(this.i1.f43475f);
        zt3Var.P0(this.i1.f43477h);
        zt3Var.F0(this.i1.f43476g);
    }

    public boolean J1() {
        zt3 zt3Var = this.c0;
        rf1.InterfaceC16599b interfaceC16599bO1 = zt3Var != null ? ((au3) zt3Var).O1() : null;
        if (interfaceC16599bO1 == null) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= this.W0) {
                return true;
            }
            zt3 zt3Var2 = this.V0[i];
            if (zt3Var2 != null && !(zt3Var2 instanceof rv7)) {
                zt3.EnumC18702b enumC18702bM59863w = zt3Var2.m59863w(0);
                zt3.EnumC18702b enumC18702bM59863w2 = zt3Var2.m59863w(1);
                zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.MATCH_CONSTRAINT;
                if (!(enumC18702bM59863w == enumC18702b && zt3Var2.f57663w != 1 && enumC18702bM59863w2 == enumC18702b && zt3Var2.f57664x != 1)) {
                    if (enumC18702bM59863w == enumC18702b) {
                        enumC18702bM59863w = zt3.EnumC18702b.WRAP_CONTENT;
                    }
                    if (enumC18702bM59863w2 == enumC18702b) {
                        enumC18702bM59863w2 = zt3.EnumC18702b.WRAP_CONTENT;
                    }
                    rf1.C16598a c16598a = this.i1;
                    c16598a.f43470a = enumC18702bM59863w;
                    c16598a.f43471b = enumC18702bM59863w2;
                    c16598a.f43472c = zt3Var2.m59846Y();
                    this.i1.f43473d = zt3Var2.m59866z();
                    interfaceC16599bO1.mo5626b(zt3Var2, this.i1);
                    zt3Var2.p1(this.i1.f43474e);
                    zt3Var2.Q0(this.i1.f43475f);
                    zt3Var2.F0(this.i1.f43476g);
                }
            }
            i++;
        }
    }

    public boolean K1() {
        return this.f1;
    }

    public void L1(boolean z) {
        this.f1 = z;
    }

    public void M1(int i, int i2) {
        this.g1 = i;
        this.h1 = i2;
    }

    public void N1(int i) {
        this.Z0 = i;
        this.X0 = i;
        this.a1 = i;
        this.Y0 = i;
        this.b1 = i;
        this.c1 = i;
    }

    public void O1(int i) {
        this.Y0 = i;
    }

    public void P1(int i) {
        this.c1 = i;
    }

    public void Q1(int i) {
        this.Z0 = i;
        this.d1 = i;
    }

    public void R1(int i) {
        this.a1 = i;
        this.e1 = i;
    }

    public void S1(int i) {
        this.b1 = i;
        this.d1 = i;
        this.e1 = i;
    }

    public void T1(int i) {
        this.X0 = i;
    }

    @Override // p001o.dy7, p001o.by7
    /* renamed from: b */
    public void mo19919b(au3 au3Var) {
        z1();
    }

    public void y1(boolean z) {
        int i = this.b1;
        if (i > 0 || this.c1 > 0) {
            if (z) {
                this.d1 = this.c1;
                this.e1 = i;
            } else {
                this.d1 = i;
                this.e1 = this.c1;
            }
        }
    }

    public void z1() {
        for (int i = 0; i < this.W0; i++) {
            zt3 zt3Var = this.V0[i];
            if (zt3Var != null) {
                zt3Var.Z0(true);
            }
        }
    }
}

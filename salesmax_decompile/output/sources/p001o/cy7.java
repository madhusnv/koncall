package p001o;

import java.util.Iterator;
import p001o.em5;

/* loaded from: classes2.dex */
public class cy7 extends r8j {
    public cy7(zt3 zt3Var) {
        super(zt3Var);
    }

    @Override // p001o.r8j, p001o.cm5
    /* renamed from: a */
    public void mo19843a(cm5 cm5Var) {
        ya1 ya1Var = (ya1) this.f43162b;
        int iA1 = ya1Var.A1();
        Iterator it = this.f43168h.f21871l.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = ((em5) it.next()).f21866g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iA1 == 0 || iA1 == 2) {
            this.f43168h.mo25285d(i2 + ya1Var.B1());
        } else {
            this.f43168h.mo25285d(i + ya1Var.B1());
        }
    }

    @Override // p001o.r8j
    /* renamed from: d */
    public void mo19844d() {
        zt3 zt3Var = this.f43162b;
        if (zt3Var instanceof ya1) {
            this.f43168h.f21861b = true;
            ya1 ya1Var = (ya1) zt3Var;
            int iA1 = ya1Var.A1();
            boolean zZ1 = ya1Var.z1();
            int i = 0;
            if (iA1 == 0) {
                this.f43168h.f21864e = em5.EnumC13217a.LEFT;
                while (i < ya1Var.W0) {
                    zt3 zt3Var2 = ya1Var.V0[i];
                    if (zZ1 || zt3Var2.m59845X() != 8) {
                        em5 em5Var = zt3Var2.f57645e.f43168h;
                        em5Var.f21870k.add(this.f43168h);
                        this.f43168h.f21871l.add(em5Var);
                    }
                    i++;
                }
                m22050q(this.f43162b.f57645e.f43168h);
                m22050q(this.f43162b.f57645e.f43169i);
                return;
            }
            if (iA1 == 1) {
                this.f43168h.f21864e = em5.EnumC13217a.RIGHT;
                while (i < ya1Var.W0) {
                    zt3 zt3Var3 = ya1Var.V0[i];
                    if (zZ1 || zt3Var3.m59845X() != 8) {
                        em5 em5Var2 = zt3Var3.f57645e.f43169i;
                        em5Var2.f21870k.add(this.f43168h);
                        this.f43168h.f21871l.add(em5Var2);
                    }
                    i++;
                }
                m22050q(this.f43162b.f57645e.f43168h);
                m22050q(this.f43162b.f57645e.f43169i);
                return;
            }
            if (iA1 == 2) {
                this.f43168h.f21864e = em5.EnumC13217a.TOP;
                while (i < ya1Var.W0) {
                    zt3 zt3Var4 = ya1Var.V0[i];
                    if (zZ1 || zt3Var4.m59845X() != 8) {
                        em5 em5Var3 = zt3Var4.f57646f.f43168h;
                        em5Var3.f21870k.add(this.f43168h);
                        this.f43168h.f21871l.add(em5Var3);
                    }
                    i++;
                }
                m22050q(this.f43162b.f57646f.f43168h);
                m22050q(this.f43162b.f57646f.f43169i);
                return;
            }
            if (iA1 != 3) {
                return;
            }
            this.f43168h.f21864e = em5.EnumC13217a.BOTTOM;
            while (i < ya1Var.W0) {
                zt3 zt3Var5 = ya1Var.V0[i];
                if (zZ1 || zt3Var5.m59845X() != 8) {
                    em5 em5Var4 = zt3Var5.f57646f.f43169i;
                    em5Var4.f21870k.add(this.f43168h);
                    this.f43168h.f21871l.add(em5Var4);
                }
                i++;
            }
            m22050q(this.f43162b.f57646f.f43168h);
            m22050q(this.f43162b.f57646f.f43169i);
        }
    }

    @Override // p001o.r8j
    /* renamed from: e */
    public void mo19845e() {
        zt3 zt3Var = this.f43162b;
        if (zt3Var instanceof ya1) {
            int iA1 = ((ya1) zt3Var).A1();
            if (iA1 == 0 || iA1 == 1) {
                this.f43162b.r1(this.f43168h.f21866g);
            } else {
                this.f43162b.s1(this.f43168h.f21866g);
            }
        }
    }

    @Override // p001o.r8j
    /* renamed from: f */
    public void mo19846f() {
        this.f43163c = null;
        this.f43168h.m25284c();
    }

    @Override // p001o.r8j
    /* renamed from: m */
    public boolean mo19847m() {
        return false;
    }

    /* renamed from: q */
    public final void m22050q(em5 em5Var) {
        this.f43168h.f21870k.add(em5Var);
        em5Var.f21871l.add(this.f43168h);
    }
}

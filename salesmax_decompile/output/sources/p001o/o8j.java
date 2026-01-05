package p001o;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class o8j extends zt3 {
    public ArrayList V0 = new ArrayList();

    /* renamed from: a */
    public void m41784a(zt3 zt3Var) {
        this.V0.add(zt3Var);
        if (zt3Var.m59835M() != null) {
            ((o8j) zt3Var.m59835M()).y1(zt3Var);
        }
        zt3Var.h1(this);
    }

    @Override // p001o.zt3
    public void v0() {
        this.V0.clear();
        super.v0();
    }

    public ArrayList w1() {
        return this.V0;
    }

    public abstract void x1();

    public void y1(zt3 zt3Var) {
        this.V0.remove(zt3Var);
        zt3Var.v0();
    }

    @Override // p001o.zt3
    public void z0(tr1 tr1Var) {
        super.z0(tr1Var);
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            ((zt3) this.V0.get(i)).z0(tr1Var);
        }
    }

    public void z1() {
        this.V0.clear();
    }
}

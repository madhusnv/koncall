package p001o;

/* loaded from: classes2.dex */
public class sv7 extends r8j {
    public sv7(zt3 zt3Var) {
        super(zt3Var);
        zt3Var.f57645e.mo19846f();
        zt3Var.f57646f.mo19846f();
        this.f43166f = ((rv7) zt3Var).x1();
    }

    @Override // p001o.r8j, p001o.cm5
    /* renamed from: a */
    public void mo19843a(cm5 cm5Var) {
        em5 em5Var = this.f43168h;
        if (em5Var.f21862c && !em5Var.f21869j) {
            this.f43168h.mo25285d((int) ((((em5) em5Var.f21871l.get(0)).f21866g * ((rv7) this.f43162b).A1()) + 0.5f));
        }
    }

    @Override // p001o.r8j
    /* renamed from: d */
    public void mo19844d() {
        rv7 rv7Var = (rv7) this.f43162b;
        int iY1 = rv7Var.y1();
        int iZ1 = rv7Var.z1();
        rv7Var.A1();
        if (rv7Var.x1() == 1) {
            if (iY1 != -1) {
                this.f43168h.f21871l.add(this.f43162b.c0.f57645e.f43168h);
                this.f43162b.c0.f57645e.f43168h.f21870k.add(this.f43168h);
                this.f43168h.f21865f = iY1;
            } else if (iZ1 != -1) {
                this.f43168h.f21871l.add(this.f43162b.c0.f57645e.f43169i);
                this.f43162b.c0.f57645e.f43169i.f21870k.add(this.f43168h);
                this.f43168h.f21865f = -iZ1;
            } else {
                em5 em5Var = this.f43168h;
                em5Var.f21861b = true;
                em5Var.f21871l.add(this.f43162b.c0.f57645e.f43169i);
                this.f43162b.c0.f57645e.f43169i.f21870k.add(this.f43168h);
            }
            m48956q(this.f43162b.f57645e.f43168h);
            m48956q(this.f43162b.f57645e.f43169i);
            return;
        }
        if (iY1 != -1) {
            this.f43168h.f21871l.add(this.f43162b.c0.f57646f.f43168h);
            this.f43162b.c0.f57646f.f43168h.f21870k.add(this.f43168h);
            this.f43168h.f21865f = iY1;
        } else if (iZ1 != -1) {
            this.f43168h.f21871l.add(this.f43162b.c0.f57646f.f43169i);
            this.f43162b.c0.f57646f.f43169i.f21870k.add(this.f43168h);
            this.f43168h.f21865f = -iZ1;
        } else {
            em5 em5Var2 = this.f43168h;
            em5Var2.f21861b = true;
            em5Var2.f21871l.add(this.f43162b.c0.f57646f.f43169i);
            this.f43162b.c0.f57646f.f43169i.f21870k.add(this.f43168h);
        }
        m48956q(this.f43162b.f57646f.f43168h);
        m48956q(this.f43162b.f57646f.f43169i);
    }

    @Override // p001o.r8j
    /* renamed from: e */
    public void mo19845e() {
        if (((rv7) this.f43162b).x1() == 1) {
            this.f43162b.r1(this.f43168h.f21866g);
        } else {
            this.f43162b.s1(this.f43168h.f21866g);
        }
    }

    @Override // p001o.r8j
    /* renamed from: f */
    public void mo19846f() {
        this.f43168h.m25284c();
    }

    @Override // p001o.r8j
    /* renamed from: m */
    public boolean mo19847m() {
        return false;
    }

    /* renamed from: q */
    public final void m48956q(em5 em5Var) {
        this.f43168h.f21870k.add(em5Var);
        em5Var.f21871l.add(this.f43168h);
    }
}

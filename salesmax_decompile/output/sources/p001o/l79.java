package p001o;

/* loaded from: classes2.dex */
public final class l79 implements tq6 {

    /* renamed from: a */
    public final tq6 f33352a;

    public l79(int i) {
        if ((i & 1) != 0) {
            this.f33352a = new quf(65496, 2, "image/jpeg");
        } else {
            this.f33352a = new o79();
        }
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f33352a.mo17261a(j, j2);
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        return this.f33352a.mo17262c(uq6Var);
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f33352a.mo17263d(vq6Var);
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) {
        return this.f33352a.mo17264k(uq6Var, uedVar);
    }

    @Override // p001o.tq6
    public void release() {
        this.f33352a.release();
    }
}

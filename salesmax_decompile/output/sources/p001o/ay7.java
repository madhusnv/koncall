package p001o;

/* loaded from: classes2.dex */
public final class ay7 implements tq6 {

    /* renamed from: a */
    public final zwc f15366a = new zwc(4);

    /* renamed from: b */
    public final quf f15367b = new quf(-1, -1, "image/heif");

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f15367b.mo17261a(j, j2);
    }

    /* renamed from: b */
    public final boolean m17968b(uq6 uq6Var, int i) {
        this.f15366a.m60013Q(4);
        uq6Var.mo40498m(this.f15366a.m60024e(), 0, 4);
        return this.f15366a.m60006J() == ((long) i);
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        uq6Var.mo40494h(4);
        return m17968b(uq6Var, 1718909296) && m17968b(uq6Var, 1751476579);
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f15367b.mo17263d(vq6Var);
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) {
        return this.f15367b.mo17264k(uq6Var, uedVar);
    }

    @Override // p001o.tq6
    public void release() {
    }
}

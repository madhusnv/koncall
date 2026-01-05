package p001o;

/* loaded from: classes6.dex */
public abstract class f5f extends ql6 {

    /* renamed from: d */
    public final int f22761d;

    /* renamed from: e */
    public final int f22762e;

    /* renamed from: f */
    public final long f22763f;

    /* renamed from: g */
    public final String f22764g;

    /* renamed from: h */
    public g84 f22765h = r0();

    public f5f(int i, int i2, long j, String str) {
        this.f22761d = i;
        this.f22762e = i2;
        this.f22763f = j;
        this.f22764g = str;
    }

    @Override // p001o.z74
    /* renamed from: K */
    public void mo22314K(q74 q74Var, Runnable runnable) {
        g84.m28168o(this.f22765h, runnable, false, false, 6, null);
    }

    @Override // p001o.z74
    /* renamed from: X */
    public void mo26180X(q74 q74Var, Runnable runnable) {
        g84.m28168o(this.f22765h, runnable, false, true, 2, null);
    }

    public final g84 r0() {
        return new g84(this.f22761d, this.f22762e, this.f22763f, this.f22764g);
    }

    public final void u0(Runnable runnable, boolean z, boolean z2) {
        this.f22765h.m28186k(runnable, z, z2);
    }
}

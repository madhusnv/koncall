package ug;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h0 extends d0 {

    /* renamed from: b */
    public boolean f35458b;

    public h0(n1 n1Var) {
        super(n1Var);
        ((n1) this.f482a).f35660E++;
    }

    /* renamed from: N */
    public final void m13936N() {
        if (!this.f35458b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: O */
    public final void m13937O() {
        if (this.f35458b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo13839P()) {
            return;
        }
        ((n1) this.f482a).f35662G.incrementAndGet();
        this.f35458b = true;
    }

    /* renamed from: P */
    public abstract boolean mo13839P();
}

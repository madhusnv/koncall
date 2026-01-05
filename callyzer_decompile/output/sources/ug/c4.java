package ug;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c4 extends y3 {

    /* renamed from: c */
    public boolean f35322c;

    public c4(h4 h4Var) {
        super(h4Var);
        this.f35959b.f35503t++;
    }

    /* renamed from: N */
    public final void m13858N() {
        if (!this.f35322c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: O */
    public final void m13859O() {
        if (this.f35322c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo13847P();
        this.f35959b.f35504v++;
        this.f35322c = true;
    }

    /* renamed from: P */
    public abstract void mo13847P();
}

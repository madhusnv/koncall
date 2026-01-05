package ug;

import ai.AbstractC0151h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t1 extends AbstractC0151h {

    /* renamed from: b */
    public boolean f35835b;

    public t1(n1 n1Var) {
        super(n1Var);
        ((n1) this.f482a).f35660E++;
    }

    /* renamed from: N */
    public abstract boolean mo13860N();

    /* renamed from: O */
    public final void m14144O() {
        if (!this.f35835b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: P */
    public final void m14145P() {
        if (this.f35835b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo13860N()) {
            return;
        }
        ((n1) this.f482a).f35662G.incrementAndGet();
        this.f35835b = true;
    }
}

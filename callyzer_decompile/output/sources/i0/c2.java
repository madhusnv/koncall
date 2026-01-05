package i0;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c2 implements d2 {

    /* renamed from: a */
    public final AtomicBoolean f16437a = new AtomicBoolean(false);

    /* renamed from: b */
    public final d2 f16438b;

    public c2(d2 d2Var) {
        this.f16438b = d2Var;
    }

    @Override // i0.d2
    /* renamed from: a */
    public final void mo2191a(g2 g2Var, e2 e2Var) {
        if (this.f16437a.get()) {
            return;
        }
        this.f16438b.mo2191a(g2Var, e2Var);
    }

    /* renamed from: b */
    public final void m7307b() {
        this.f16437a.set(true);
    }
}

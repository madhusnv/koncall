package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 extends d0 {

    /* renamed from: d */
    public final /* synthetic */ int f5189d = 1;

    /* renamed from: e */
    public final Object f5190e;

    public p0(b1 b1Var) {
        super(b1Var);
        this.f5190e = new AtomicBoolean(false);
    }

    @Override // c0.d0, java.lang.AutoCloseable
    public void close() throws Exception {
        switch (this.f5189d) {
            case 1:
                if (!((AtomicBoolean) this.f5190e).getAndSet(true)) {
                    super.close();
                    break;
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public p0(b1 b1Var, q0 q0Var) {
        super(b1Var);
        this.f5190e = new WeakReference(q0Var);
        m2179h(new o0(0, this));
    }
}

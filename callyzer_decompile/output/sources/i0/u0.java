package i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f16591a;

    /* renamed from: b */
    public final /* synthetic */ v0 f16592b;

    public /* synthetic */ u0(v0 v0Var, int i10) {
        this.f16591a = i10;
        this.f16592b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16591a) {
            case 0:
                v0 v0Var = this.f16592b;
                try {
                    v0Var.f16604e.get();
                    v0Var.m7420e(v0.f16599n.decrementAndGet(), v0.f16598m.get(), "Surface terminated");
                    return;
                } catch (Exception e2) {
                    v0Var.toString();
                    og.u1.m10943b("DeferrableSurface");
                    synchronized (v0Var.f16600a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", v0Var, Boolean.valueOf(v0Var.f16602c), Integer.valueOf(v0Var.f16601b)), e2);
                    }
                }
            case 1:
                this.f16592b.mo7416a();
                return;
            default:
                this.f16592b.m7417b();
                return;
        }
    }

    public /* synthetic */ u0(v0 v0Var, String str) {
        this.f16591a = 0;
        this.f16592b = v0Var;
    }
}

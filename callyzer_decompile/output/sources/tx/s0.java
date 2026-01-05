package tx;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class s0 extends t0 {

    /* renamed from: c */
    public final Runnable f34675c;

    public s0(long j6, Runnable runnable) {
        super(j6);
        this.f34675c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34675c.run();
    }

    @Override // tx.t0
    public final String toString() {
        return super.toString() + this.f34675c;
    }
}

package t8;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.q */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7071q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f34168a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f34169b;

    public /* synthetic */ RunnableC7071q(AtomicBoolean atomicBoolean, int i10) {
        this.f34168a = i10;
        this.f34169b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34168a) {
            case 0:
                this.f34169b.set(true);
                break;
            default:
                this.f34169b.set(true);
                break;
        }
    }
}

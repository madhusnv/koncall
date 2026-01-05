package w3;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: a */
    public final /* synthetic */ u0 f37959a;

    public t0(u0 u0Var) {
        this.f37959a = u0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        this.f37959a.f37971d.removeCallbacks(this);
        u0.F0(this.f37959a);
        u0 u0Var = this.f37959a;
        synchronized (u0Var.f37972e) {
            if (u0Var.f37977k) {
                u0Var.f37977k = false;
                ArrayList arrayList = u0Var.f37974g;
                u0Var.f37974g = u0Var.f37975h;
                u0Var.f37975h = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j6);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        u0.F0(this.f37959a);
        u0 u0Var = this.f37959a;
        synchronized (u0Var.f37972e) {
            if (u0Var.f37974g.isEmpty()) {
                u0Var.f37970c.removeFrameCallback(this);
                u0Var.f37977k = false;
            }
        }
    }
}

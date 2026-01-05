package k0;

import android.os.Handler;
import c9.C0914i;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k0.f */
/* loaded from: classes.dex */
public final class ExecutorC3896f implements Executor {

    /* renamed from: c */
    public static volatile ExecutorC3896f f19998c;

    /* renamed from: a */
    public final /* synthetic */ int f19999a;

    /* renamed from: b */
    public final Object f20000b;

    public ExecutorC3896f() {
        this.f19999a = 0;
        this.f20000b = Executors.newSingleThreadExecutor(new ThreadFactoryC3895e(0));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f19999a) {
            case 0:
                ((ExecutorService) this.f20000b).execute(runnable);
                break;
            default:
                ((Handler) ((C0914i) this.f20000b).f5587c).post(runnable);
                break;
        }
    }

    public ExecutorC3896f(C0914i c0914i) {
        this.f19999a = 1;
        this.f20000b = c0914i;
    }
}

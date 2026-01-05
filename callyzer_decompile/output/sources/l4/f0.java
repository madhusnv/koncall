package l4;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Choreographer f21900a;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.f21900a.postFrameCallback(new Choreographer.FrameCallback() { // from class: l4.g0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j6) {
                runnable.run();
            }
        });
    }
}

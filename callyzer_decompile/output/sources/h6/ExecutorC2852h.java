package h6;

import java.util.concurrent.Executor;
import p014p.C5785a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.h */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC2852h implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f15862a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15862a) {
            case 0:
                runnable.run();
                break;
            default:
                C5785a.m11334g().f28364a.f28366b.execute(runnable);
                break;
        }
    }
}

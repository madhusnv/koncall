package of;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.h */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC5353h implements Executor {

    /* renamed from: b */
    public static final /* synthetic */ ExecutorC5353h f26279b = new ExecutorC5353h(0);

    /* renamed from: c */
    public static final /* synthetic */ ExecutorC5353h f26280c = new ExecutorC5353h(1);

    /* renamed from: a */
    public final /* synthetic */ int f26281a;

    public /* synthetic */ ExecutorC5353h(int i10) {
        this.f26281a = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f26281a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}

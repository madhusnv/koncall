package k0;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k0.a */
/* loaded from: classes.dex */
public final class ExecutorC3891a implements Executor {

    /* renamed from: b */
    public static volatile ExecutorC3891a f19987b;

    /* renamed from: c */
    public static final /* synthetic */ ExecutorC3891a f19988c = new ExecutorC3891a(1);

    /* renamed from: a */
    public final /* synthetic */ int f19989a;

    public /* synthetic */ ExecutorC3891a(int i10) {
        this.f19989a = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f19989a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}

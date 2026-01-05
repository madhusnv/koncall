package al;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.m */
/* loaded from: classes.dex */
public enum EnumC0185m implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C0177e.m401a().f542a.post(runnable);
    }
}

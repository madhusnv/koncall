package xi;

import android.util.Log;
import b3.C0575g;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC4154l;
import pg.l8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xi.d */
/* loaded from: classes.dex */
public final class C8386d {

    /* renamed from: d */
    public static final C8385c f40062d = new C8385c();

    /* renamed from: a */
    public final ExecutorC8384b f40063a;

    /* renamed from: b */
    public final ExecutorC8384b f40064b;

    /* renamed from: c */
    public final ExecutorC8384b f40065c;

    public C8386d(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        AbstractC4154l.m8923f(backgroundExecutorService, "backgroundExecutorService");
        AbstractC4154l.m8923f(blockingExecutorService, "blockingExecutorService");
        this.f40063a = new ExecutorC8384b(backgroundExecutorService);
        this.f40064b = new ExecutorC8384b(backgroundExecutorService);
        l8.m11765f(null);
        this.f40065c = new ExecutorC8384b(blockingExecutorService);
    }

    /* renamed from: a */
    public static final void m15552a() {
        if (((Boolean) new C0575g(0, f40062d, C8385c.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 10).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    /* renamed from: b */
    public static final void m15553b() {
        if (((Boolean) new C0575g(0, f40062d, C8385c.class, "isBlockingThread", "isBlockingThread()Z", 0, 11).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }
}

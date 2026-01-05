package androidx.work;

import a1.C0004c;
import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import pg.i7;
import t8.AbstractC7075u;
import t8.AbstractC7076v;
import t8.C7069o;
import t8.h0;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class Worker extends AbstractC7076v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParams, "workerParams");
    }

    public abstract AbstractC7075u doWork();

    public C7069o getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // t8.AbstractC7076v
    public InterfaceFutureC8957d getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        AbstractC4154l.m8922e(backgroundExecutor, "backgroundExecutor");
        return i7.m11697b(new C0004c(backgroundExecutor, new h0(this, 0)));
    }

    @Override // t8.AbstractC7076v
    public final InterfaceFutureC8957d startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        AbstractC4154l.m8922e(backgroundExecutor, "backgroundExecutor");
        return i7.m11697b(new C0004c(backgroundExecutor, new h0(this, 1)));
    }
}

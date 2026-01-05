package t8;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import aw.C0467g;
import bt.C0765j;
import d9.C1673r;
import d9.C1674s;
import d9.ExecutorC1668m;
import e9.InterfaceC1970a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import mk.C4764c;
import og.ng;
import pg.i7;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.v */
/* loaded from: classes.dex */
public abstract class AbstractC7076v {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public AbstractC7076v(Context context, WorkerParameters workerParameters) {
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f2868f;
    }

    public InterfaceFutureC8957d getForegroundInfoAsync() {
        return i7.m11697b(new C4764c(10));
    }

    public final UUID getId() {
        return this.mWorkerParams.f2863a;
    }

    public final C7064j getInputData() {
        return this.mWorkerParams.f2864b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f2866d.f21923d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f2867e;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f2865c;
    }

    public InterfaceC1970a getTaskExecutor() {
        return this.mWorkerParams.f2870h;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f2866d.f21921b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f2866d.f21922c;
    }

    public i0 getWorkerFactory() {
        return this.mWorkerParams.f2871i;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final InterfaceFutureC8957d setForegroundAsync(C7069o c7069o) {
        C1673r c1673r = this.mWorkerParams.f2873k;
        Context applicationContext = getApplicationContext();
        return ng.m10785a((ExecutorC1668m) c1673r.f8203a.f5585a, "setForegroundAsync", new C0765j(c1673r, getId(), c7069o, applicationContext, 3));
    }

    public InterfaceFutureC8957d setProgressAsync(C7064j c7064j) {
        C1674s c1674s = this.mWorkerParams.f2872j;
        getApplicationContext();
        return ng.m10785a((ExecutorC1668m) c1674s.f8207b.f5585a, "updateProgress", new C0467g(5, c1674s, getId(), c7064j));
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract InterfaceFutureC8957d startWork();

    public final void stop(int i10) {
        if (this.mStopReason.compareAndSet(-256, i10)) {
            onStopped();
        }
    }

    public void onStopped() {
    }
}

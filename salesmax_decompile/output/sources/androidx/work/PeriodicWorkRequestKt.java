package androidx.work;

import androidx.work.PeriodicWorkRequest;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class PeriodicWorkRequestKt {
    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit timeUnit) {
        sq8.m48649h(timeUnit, "repeatIntervalTimeUnit");
        sq8.m48655n(4, "W");
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, j, timeUnit);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration duration) {
        sq8.m48649h(duration, "repeatInterval");
        sq8.m48655n(4, "W");
        return new PeriodicWorkRequest.Builder(ListenableWorker.class, duration);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        sq8.m48649h(timeUnit, "repeatIntervalTimeUnit");
        sq8.m48649h(timeUnit2, "flexTimeIntervalUnit");
        sq8.m48655n(4, "W");
        return new PeriodicWorkRequest.Builder(ListenableWorker.class, j, timeUnit, j2, timeUnit2);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration duration, Duration duration2) {
        sq8.m48649h(duration, "repeatInterval");
        sq8.m48649h(duration2, "flexTimeInterval");
        sq8.m48655n(4, "W");
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, duration, duration2);
    }
}

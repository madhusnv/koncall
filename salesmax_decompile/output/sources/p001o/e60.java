package p001o;

import ai.salesmax.location.LocationWorker;
import ai.salesmax.worker.AppVersionUpdateWorker;
import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e60 {

    /* renamed from: a */
    public static final C13111a f21028a = new C13111a(null);

    /* renamed from: b */
    public static final e60 f21029b = new e60();

    /* renamed from: o.e60$a */
    public static final class C13111a {
        public C13111a() {
        }

        public /* synthetic */ C13111a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final e60 m24371a() {
            return e60.f21029b;
        }
    }

    /* renamed from: b */
    public final Operation m24369b(Context context) {
        sq8.m48649h(context, "context");
        Data dataBuild = new Data.Builder().build();
        sq8.m48648g(dataBuild, "build(...)");
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        sbj sbjVar = sbj.f45162a;
        TimeUnit timeUnit = TimeUnit.HOURS;
        mbj mbjVar = mbj.LOCATION_RECONCILIATION;
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.KEEP;
        PeriodicWorkRequest periodicWorkRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) LocationWorker.class, 1L, timeUnit).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 10000L, TimeUnit.MILLISECONDS).setInputData(dataBuild).setConstraints(constraintsBuild).setInitialDelay(0L, timeUnit).addTag(mbjVar.name()).build();
        WorkManager workManager = WorkManager.getInstance(context);
        sq8.m48648g(workManager, "getInstance(...)");
        Operation operationEnqueueUniquePeriodicWork = workManager.enqueueUniquePeriodicWork(mbjVar.name(), existingPeriodicWorkPolicy, periodicWorkRequestBuild);
        sq8.m48648g(operationEnqueueUniquePeriodicWork, "enqueueUniquePeriodicWork(...)");
        uia.m51627b(uia.f48971a, "adhoc-worker-manager", "submitted work status: " + operationEnqueueUniquePeriodicWork, null, null, 12, null);
        return operationEnqueueUniquePeriodicWork;
    }

    /* renamed from: c */
    public final Operation m24370c(Context context) {
        sq8.m48649h(context, "context");
        Data dataBuild = new Data.Builder().build();
        sq8.m48648g(dataBuild, "build(...)");
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        sbj sbjVar = sbj.f45162a;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        mbj mbjVar = mbj.APP_VERSION_UPDATE;
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.KEEP;
        PeriodicWorkRequest periodicWorkRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) AppVersionUpdateWorker.class, 15L, timeUnit).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 10000L, TimeUnit.MILLISECONDS).setInputData(dataBuild).setConstraints(constraintsBuild).setInitialDelay(0L, timeUnit).addTag(mbjVar.name()).build();
        WorkManager workManager = WorkManager.getInstance(context);
        sq8.m48648g(workManager, "getInstance(...)");
        Operation operationEnqueueUniquePeriodicWork = workManager.enqueueUniquePeriodicWork(mbjVar.name(), existingPeriodicWorkPolicy, periodicWorkRequestBuild);
        sq8.m48648g(operationEnqueueUniquePeriodicWork, "enqueueUniquePeriodicWork(...)");
        uia.m51627b(uia.f48971a, "adhoc-worker-manager", "submitted work status: " + operationEnqueueUniquePeriodicWork, null, null, 12, null);
        return operationEnqueueUniquePeriodicWork;
    }
}

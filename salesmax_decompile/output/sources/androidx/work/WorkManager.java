package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.AbstractC2145n;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p001o.zfa;

@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes2.dex */
public abstract class WorkManager {

    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    @Deprecated
    public static WorkManager getInstance() {
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance();
        if (workManagerImpl != null) {
            return workManagerImpl;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static void initialize(Context context, Configuration configuration) {
        WorkManagerImpl.initialize(context, configuration);
    }

    public static boolean isInitialized() {
        return WorkManagerImpl.isInitialized();
    }

    public final WorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        return beginUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract WorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public final WorkContinuation beginWith(OneTimeWorkRequest oneTimeWorkRequest) {
        return beginWith(Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract WorkContinuation beginWith(List<OneTimeWorkRequest> list);

    public abstract Operation cancelAllWork();

    public abstract Operation cancelAllWorkByTag(String str);

    public abstract Operation cancelUniqueWork(String str);

    public abstract Operation cancelWorkById(UUID uuid);

    public abstract PendingIntent createCancelPendingIntent(UUID uuid);

    public final Operation enqueue(WorkRequest workRequest) {
        return enqueue(Collections.singletonList(workRequest));
    }

    public abstract Operation enqueue(List<? extends WorkRequest> list);

    public abstract Operation enqueueUniquePeriodicWork(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest);

    public Operation enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        return enqueueUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract Operation enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public abstract Configuration getConfiguration();

    public abstract zfa getLastCancelAllTimeMillis();

    public abstract AbstractC2145n getLastCancelAllTimeMillisLiveData();

    public abstract zfa getWorkInfoById(UUID uuid);

    public abstract AbstractC2145n getWorkInfoByIdLiveData(UUID uuid);

    public abstract zfa getWorkInfos(WorkQuery workQuery);

    public abstract zfa getWorkInfosByTag(String str);

    public abstract AbstractC2145n getWorkInfosByTagLiveData(String str);

    public abstract zfa getWorkInfosForUniqueWork(String str);

    public abstract AbstractC2145n getWorkInfosForUniqueWorkLiveData(String str);

    public abstract AbstractC2145n getWorkInfosLiveData(WorkQuery workQuery);

    public abstract Operation pruneWork();

    public abstract zfa updateWork(WorkRequest workRequest);

    public static WorkManager getInstance(Context context) {
        return WorkManagerImpl.getInstance(context);
    }
}

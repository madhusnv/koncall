package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ForegroundInfo;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p001o.zfa;

/* loaded from: classes2.dex */
public abstract class RemoteWorkManager {
    public static RemoteWorkManager getInstance(Context context) {
        RemoteWorkManager remoteWorkManager = WorkManagerImpl.getInstance(context).getRemoteWorkManager();
        if (remoteWorkManager != null) {
            return remoteWorkManager;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    public final RemoteWorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        return beginUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract RemoteWorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public final RemoteWorkContinuation beginWith(OneTimeWorkRequest oneTimeWorkRequest) {
        return beginWith(Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract RemoteWorkContinuation beginWith(List<OneTimeWorkRequest> list);

    public abstract zfa cancelAllWork();

    public abstract zfa cancelAllWorkByTag(String str);

    public abstract zfa cancelUniqueWork(String str);

    public abstract zfa cancelWorkById(UUID uuid);

    public abstract zfa enqueue(WorkContinuation workContinuation);

    public abstract zfa enqueue(WorkRequest workRequest);

    public abstract zfa enqueue(List<WorkRequest> list);

    public abstract zfa enqueueUniquePeriodicWork(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest);

    public final zfa enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        return enqueueUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract zfa enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public abstract zfa getWorkInfos(WorkQuery workQuery);

    public abstract zfa setForegroundAsync(String str, ForegroundInfo foregroundInfo);

    public abstract zfa setProgress(UUID uuid, Data data);
}

package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AutoResolveHelper {
    public static final int RESULT_ERROR = 1;
    private static final long zzb = TimeUnit.MINUTES.toMillis(10);
    static long zza = SystemClock.elapsedRealtime();

    private AutoResolveHelper() {
    }

    @RecentlyNullable
    public static Status getStatusFromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void putStatusIntoIntent(@RecentlyNonNull Intent intent, Status status) {
        if (status == null) {
            intent.removeExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        } else {
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
        }
    }

    public static <TResult extends AutoResolvableResult> void resolveTask(@RecentlyNonNull Task<TResult> task, @RecentlyNonNull Activity activity, int i) {
        zzc zzcVarZza = zzc.zza(task);
        FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
        int i2 = zzcVarZza.zzc;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i2);
        bundle.putInt("requestCode", i);
        bundle.putLong("initializationElapsedRealtime", zza);
        zzd zzdVar = new zzd();
        zzdVar.setArguments(bundle);
        int i3 = zzcVarZza.zzc;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i3);
        fragmentTransactionBeginTransaction.add(zzdVar, sb.toString()).commit();
    }

    public static <TResult> void zzd(@RecentlyNonNull Status status, TResult tresult, @RecentlyNonNull TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zze(Activity activity, int i, int i2, Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(i, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(i2);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(Activity activity, int i, Task<? extends AutoResolvableResult> task) throws PendingIntent.CanceledException {
        int i2;
        if (activity.isFinishing()) {
            return;
        }
        Exception exception = task.getException();
        if (exception instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exception).startResolutionForResult(activity, i);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (task.isSuccessful()) {
            task.getResult().putIntoIntent(intent);
            i2 = -1;
        } else {
            if (exception instanceof ApiException) {
                ApiException apiException = (ApiException) exception;
                putStatusIntoIntent(intent, new Status(apiException.getStatusCode(), apiException.getMessage(), (PendingIntent) null));
            } else {
                putStatusIntoIntent(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
            }
            i2 = 1;
        }
        zze(activity, i, i2, intent);
    }
}

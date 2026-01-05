package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p001o.ab4;

@KeepForSdk
/* loaded from: classes5.dex */
public class FcmBroadcastProcessor {
    private static final String EXTRA_BINARY_DATA = "rawData";
    private static final String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
        this.executor = new ab4();
    }

    private static Task<Integer> bindToMessagingService(Context context, Intent intent) {
        if (ServiceStarter.getInstance().hasWakeLockPermission(context)) {
            WakeLockHolder.sendWakefulServiceIntent(context, getServiceConnection(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            getServiceConnection(context, "com.google.firebase.MESSAGING_EVENT").sendIntent(intent);
        }
        return Tasks.forResult(-1);
    }

    private static WithinAppServiceConnection getServiceConnection(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            if (fcmServiceConn == null) {
                fcmServiceConn = new WithinAppServiceConnection(context, str);
            }
            withinAppServiceConnection = fcmServiceConn;
        }
        return withinAppServiceConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$startMessagingService$0(Context context, Intent intent) {
        return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$startMessagingService$1(Task task) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$startMessagingService$2(Context context, Intent intent, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? bindToMessagingService(context, intent).continueWith(new ab4(), new Continuation() { // from class: o.gt6
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return FcmBroadcastProcessor.lambda$startMessagingService$1(task2);
            }
        }) : task;
    }

    @VisibleForTesting
    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    @KeepForSdk
    public Task<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_BINARY_DATA_BASE_64);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(EXTRA_BINARY_DATA_BASE_64);
        }
        return startMessagingService(this.context, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> startMessagingService(final Context context, final Intent intent) {
        return (!(PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) || ((intent.getFlags() & 268435456) != 0)) ? Tasks.call(this.executor, new Callable() { // from class: o.et6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FcmBroadcastProcessor.lambda$startMessagingService$0(context, intent);
            }
        }).continueWithTask(this.executor, new Continuation() { // from class: o.ft6
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FcmBroadcastProcessor.lambda$startMessagingService$2(context, intent, task);
            }
        }) : bindToMessagingService(context, intent);
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }
}

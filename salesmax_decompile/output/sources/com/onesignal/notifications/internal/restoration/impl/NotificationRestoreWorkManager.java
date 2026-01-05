package com.onesignal.notifications.internal.restoration.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.common.OSWorkManagerHelper;
import com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor;
import com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager;
import java.util.concurrent.TimeUnit;
import p001o.id5;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationRestoreWorkManager implements INotificationRestoreWorkManager {
    public static final Companion Companion = new Companion(null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private boolean restored;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public static final class NotificationRestoreWorker extends CoroutineWorker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            sq8.m48649h(context, "context");
            sq8.m48649h(workerParameters, "workerParams");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(n64 n64Var) {
            C11816x846694d7 c11816x846694d7;
            if (n64Var instanceof C11816x846694d7) {
                c11816x846694d7 = (C11816x846694d7) n64Var;
                int i = c11816x846694d7.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c11816x846694d7.label = i - Integer.MIN_VALUE;
                } else {
                    c11816x846694d7 = new C11816x846694d7(this, n64Var);
                }
            }
            Object obj = c11816x846694d7.result;
            Object objM51918f = uq8.m51918f();
            int i2 = c11816x846694d7.label;
            if (i2 == 0) {
                wre.m54934b(obj);
                Context applicationContext = getApplicationContext();
                sq8.m48648g(applicationContext, "applicationContext");
                if (!OneSignal.initWithContext(applicationContext)) {
                    ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                    sq8.m48648g(resultSuccess, "success()");
                    return resultSuccess;
                }
                if (!NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, applicationContext, null, 2, null)) {
                    ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
                    sq8.m48648g(resultFailure, "failure()");
                    return resultFailure;
                }
                INotificationRestoreProcessor iNotificationRestoreProcessor = (INotificationRestoreProcessor) OneSignal.INSTANCE.getServices().getService(INotificationRestoreProcessor.class);
                c11816x846694d7.label = 1;
                if (iNotificationRestoreProcessor.process(c11816x846694d7) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success();
            sq8.m48648g(resultSuccess2, "success()");
            return resultSuccess2;
        }
    }

    @Override // com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager
    public void beginEnqueueingWork(Context context, boolean z) {
        sq8.m48649h(context, "context");
        synchronized (Boolean.valueOf(this.restored)) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            y3i y3iVar = y3i.f54824a;
            OSWorkManagerHelper.INSTANCE.getInstance(context).enqueueUniqueWork(NOTIFICATION_RESTORE_WORKER_IDENTIFIER, ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(NotificationRestoreWorker.class).setInitialDelay(z ? 15 : 0, TimeUnit.SECONDS).build());
        }
    }
}

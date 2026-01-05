package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import com.onesignal.common.AndroidUtils;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.OSWorkManagerHelper;
import com.onesignal.notifications.internal.generation.INotificationGenerationProcessor;
import com.onesignal.notifications.internal.generation.INotificationGenerationWorkManager;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes6.dex */
public final class NotificationGenerationWorkManager implements INotificationGenerationWorkManager {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String OS_ID_DATA_PARAM = "os_notif_id";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final boolean addNotificationIdProcessed(String str) {
            sq8.m48649h(str, "osNotificationId");
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(str)) {
                return true;
            }
            if (!NotificationGenerationWorkManager.notificationIds.contains(str)) {
                NotificationGenerationWorkManager.notificationIds.put(str, Boolean.TRUE);
                return true;
            }
            Logging.debug$default("OSNotificationWorkManager notification with notificationId: " + str + " already queued", null, 2, null);
            return false;
        }

        public final void removeNotificationIdProcessed(String str) {
            sq8.m48649h(str, "osNotificationId");
            if (AndroidUtils.INSTANCE.isStringNotEmpty(str)) {
                NotificationGenerationWorkManager.notificationIds.remove(str);
            }
        }
    }

    public static final class NotificationGenerationWorker extends CoroutineWorker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            sq8.m48649h(context, "context");
            sq8.m48649h(workerParameters, "workerParams");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(n64 n64Var) throws Throwable {
            C11773xc26fc5a1 c11773xc26fc5a1;
            String str;
            if (n64Var instanceof C11773xc26fc5a1) {
                c11773xc26fc5a1 = (C11773xc26fc5a1) n64Var;
                int i = c11773xc26fc5a1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c11773xc26fc5a1.label = i - Integer.MIN_VALUE;
                } else {
                    c11773xc26fc5a1 = new C11773xc26fc5a1(this, n64Var);
                }
            }
            C11773xc26fc5a1 c11773xc26fc5a12 = c11773xc26fc5a1;
            Object obj = c11773xc26fc5a12.result;
            String strM51918f = uq8.m51918f();
            int i2 = c11773xc26fc5a12.label;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) c11773xc26fc5a12.L$0;
                    try {
                        wre.m54934b(obj);
                        Companion companion = NotificationGenerationWorkManager.Companion;
                        sq8.m48646e(str);
                        companion.removeNotificationIdProcessed(str);
                        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                        sq8.m48648g(resultSuccess, "success()");
                        return resultSuccess;
                    } catch (JSONException e) {
                        e = e;
                        Logging.error("Error occurred doing work for job with id: " + str, e);
                        ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
                        sq8.m48648g(resultFailure, "failure()");
                        Companion companion2 = NotificationGenerationWorkManager.Companion;
                        sq8.m48646e(str);
                        companion2.removeNotificationIdProcessed(str);
                        return resultFailure;
                    }
                }
                wre.m54934b(obj);
                Context applicationContext = getApplicationContext();
                sq8.m48648g(applicationContext, "applicationContext");
                if (!OneSignal.initWithContext(applicationContext)) {
                    ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success();
                    sq8.m48648g(resultSuccess2, "success()");
                    return resultSuccess2;
                }
                INotificationGenerationProcessor iNotificationGenerationProcessor = (INotificationGenerationProcessor) OneSignal.INSTANCE.getServices().getService(INotificationGenerationProcessor.class);
                Data inputData = getInputData();
                sq8.m48648g(inputData, "inputData");
                String string = inputData.getString(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                if (string == null) {
                    ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
                    sq8.m48648g(resultFailure2, "failure()");
                    return resultFailure2;
                }
                try {
                    Logging.debug$default("NotificationWorker running doWork with data: " + inputData, null, 2, null);
                    int i3 = inputData.getInt(NotificationGenerationWorkManager.ANDROID_NOTIF_ID_WORKER_DATA_PARAM, 0);
                    JSONObject jSONObject = new JSONObject(inputData.getString(NotificationGenerationWorkManager.JSON_PAYLOAD_WORKER_DATA_PARAM));
                    long j = inputData.getLong("timestamp", System.currentTimeMillis() / 1000);
                    boolean z = inputData.getBoolean(NotificationGenerationWorkManager.IS_RESTORING_WORKER_DATA_PARAM, false);
                    Context applicationContext2 = getApplicationContext();
                    sq8.m48648g(applicationContext2, "applicationContext");
                    boolean z2 = z;
                    c11773xc26fc5a12.L$0 = string;
                    c11773xc26fc5a12.label = 1;
                    if (iNotificationGenerationProcessor.processNotificationData(applicationContext2, i3, jSONObject, z2, j, c11773xc26fc5a12) == strM51918f) {
                        return strM51918f;
                    }
                    str = string;
                    Companion companion3 = NotificationGenerationWorkManager.Companion;
                    sq8.m48646e(str);
                    companion3.removeNotificationIdProcessed(str);
                    ListenableWorker.Result resultSuccess3 = ListenableWorker.Result.success();
                    sq8.m48648g(resultSuccess3, "success()");
                    return resultSuccess3;
                } catch (JSONException e2) {
                    e = e2;
                    str = string;
                    Logging.error("Error occurred doing work for job with id: " + str, e);
                    ListenableWorker.Result resultFailure3 = ListenableWorker.Result.failure();
                    sq8.m48648g(resultFailure3, "failure()");
                    Companion companion22 = NotificationGenerationWorkManager.Companion;
                    sq8.m48646e(str);
                    companion22.removeNotificationIdProcessed(str);
                    return resultFailure3;
                } catch (Throwable th) {
                    th = th;
                    strM51918f = string;
                    Companion companion4 = NotificationGenerationWorkManager.Companion;
                    sq8.m48646e(strM51918f);
                    companion4.removeNotificationIdProcessed(strM51918f);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.onesignal.notifications.internal.generation.INotificationGenerationWorkManager
    public boolean beginEnqueueingWork(Context context, String str, int i, JSONObject jSONObject, long j, boolean z, boolean z2) throws Throwable {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "osNotificationId");
        String oSNotificationIdFromJson = NotificationFormatHelper.INSTANCE.getOSNotificationIdFromJson(jSONObject);
        if (oSNotificationIdFromJson == null) {
            Logging.debug$default("Notification beginEnqueueingWork with id null", null, 2, null);
            return false;
        }
        if (!Companion.addNotificationIdProcessed(oSNotificationIdFromJson)) {
            Logging.debug$default("Notification beginEnqueueingWork with id duplicated", null, 2, null);
            return true;
        }
        Data dataBuild = new Data.Builder().putString(OS_ID_DATA_PARAM, oSNotificationIdFromJson).putInt(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, i).putString(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject)).putLong("timestamp", j).putBoolean(IS_RESTORING_WORKER_DATA_PARAM, z).build();
        sq8.m48648g(dataBuild, "Builder()\n              …\n                .build()");
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(NotificationGenerationWorker.class).setInputData(dataBuild).build();
        Logging.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + jSONObject, null, 2, null);
        OSWorkManagerHelper.INSTANCE.getInstance(context).enqueueUniqueWork(str, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
        return true;
    }
}

package com.onesignal.notifications.internal.receivereceipt.impl;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.common.OSWorkManagerHelper;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptProcessor;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptWorkManager;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import java.util.concurrent.TimeUnit;
import p001o.id5;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes6.dex */
public final class ReceiveReceiptWorkManager implements IReceiveReceiptWorkManager {
    public static final Companion Companion = new Companion(null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final ISubscriptionManager _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public static final class ReceiveReceiptWorker extends CoroutineWorker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
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
            ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1;
            if (n64Var instanceof ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1) {
                receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 = (ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1) n64Var;
                int i = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label = i - Integer.MIN_VALUE;
                } else {
                    receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 = new ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1(this, n64Var);
                }
            }
            Object obj = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.result;
            Object objM51918f = uq8.m51918f();
            int i2 = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label;
            if (i2 == 0) {
                wre.m54934b(obj);
                Context applicationContext = getApplicationContext();
                sq8.m48648g(applicationContext, "applicationContext");
                if (!OneSignal.initWithContext(applicationContext)) {
                    ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                    sq8.m48648g(resultSuccess, "success()");
                    return resultSuccess;
                }
                String string = getInputData().getString(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                sq8.m48646e(string);
                String string2 = getInputData().getString(ReceiveReceiptWorkManager.OS_APP_ID);
                sq8.m48646e(string2);
                String string3 = getInputData().getString(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                sq8.m48646e(string3);
                IReceiveReceiptProcessor iReceiveReceiptProcessor = (IReceiveReceiptProcessor) OneSignal.INSTANCE.getServices().getService(IReceiveReceiptProcessor.class);
                receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label = 1;
                if (iReceiveReceiptProcessor.sendReceiveReceipt(string2, string3, string, receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1) == objM51918f) {
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

    public ReceiveReceiptWorkManager(IApplicationService iApplicationService, ConfigModelStore configModelStore, ISubscriptionManager iSubscriptionManager) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iSubscriptionManager, "_subscriptionManager");
        this._applicationService = iApplicationService;
        this._configModelStore = configModelStore;
        this._subscriptionManager = iSubscriptionManager;
        this.maxDelay = 25;
    }

    private final Constraints buildConstraints() {
        return new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptWorkManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void enqueueReceiveReceipt(String str) throws Throwable {
        sq8.m48649h(str, "notificationId");
        if (!this._configModelStore.getModel().getReceiveReceiptEnabled()) {
            Logging.debug$default("sendReceiveReceipt disabled", null, 2, null);
            return;
        }
        String appId = this._configModelStore.getModel().getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        if (id.length() == 0) {
            Logging.debug$default("ReceiveReceiptWorkManager: No push subscription or appId!", null, 2, null);
        } else {
            if (appId.length() == 0) {
            }
        }
        int randomDelay = AndroidUtils.INSTANCE.getRandomDelay(this.minDelay, this.maxDelay);
        Data dataBuild = new Data.Builder().putString(OS_NOTIFICATION_ID, str).putString(OS_APP_ID, appId).putString(OS_SUBSCRIPTION_ID, id).build();
        sq8.m48648g(dataBuild, "Builder()\n              …\n                .build()");
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(ReceiveReceiptWorker.class).setConstraints(buildConstraints()).setInitialDelay(randomDelay, TimeUnit.SECONDS).setInputData(dataBuild).build();
        Logging.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + randomDelay + " seconds", null, 2, null);
        WorkManager oSWorkManagerHelper = OSWorkManagerHelper.INSTANCE.getInstance(this._applicationService.getAppContext());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_receive_receipt");
        oSWorkManagerHelper.enqueueUniqueWork(sb.toString(), ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
    }
}

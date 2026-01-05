package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.google.firebase.messaging.Constants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p001o.o2c;

/* loaded from: classes5.dex */
class DisplayNotification {
    private static final int IMAGE_DOWNLOAD_TIMEOUT_SECONDS = 5;
    private final Context context;
    private final ExecutorService networkIoExecutor;
    private final NotificationParams params;

    public DisplayNotification(Context context, NotificationParams notificationParams, ExecutorService executorService) {
        this.networkIoExecutor = executorService;
        this.context = context;
        this.params = notificationParams;
    }

    private boolean isAppForeground() {
        if (((KeyguardManager) this.context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private void showNotification(CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfo) {
        ((NotificationManager) this.context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME)).notify(displayNotificationInfo.tag, displayNotificationInfo.id, displayNotificationInfo.notificationBuilder.m41409c());
    }

    private ImageDownload startImageDownloadInBackground() {
        ImageDownload imageDownloadCreate = ImageDownload.create(this.params.getString(Constants.MessageNotificationKeys.IMAGE_URL));
        if (imageDownloadCreate != null) {
            imageDownloadCreate.start(this.networkIoExecutor);
        }
        return imageDownloadCreate;
    }

    private void waitForAndApplyImageDownload(o2c.C15694f c15694f, ImageDownload imageDownload) {
        if (imageDownload == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(imageDownload.getTask(), 5L, TimeUnit.SECONDS);
            c15694f.m41425t(bitmap);
            c15694f.m41401E(new o2c.C15691c().m41370i(bitmap).m41369h(null));
        } catch (InterruptedException unused) {
            imageDownload.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to download image: ");
            sb.append(e.getCause());
        } catch (TimeoutException unused2) {
            imageDownload.close();
        }
    }

    public boolean handleNotification() throws PackageManager.NameNotFoundException {
        if (this.params.getBoolean(Constants.MessageNotificationKeys.NO_UI)) {
            return true;
        }
        if (isAppForeground()) {
            return false;
        }
        ImageDownload imageDownloadStartImageDownloadInBackground = startImageDownloadInBackground();
        CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfoCreateNotificationInfo = CommonNotificationBuilder.createNotificationInfo(this.context, this.params);
        waitForAndApplyImageDownload(displayNotificationInfoCreateNotificationInfo.notificationBuilder, imageDownloadStartImageDownloadInBackground);
        showNotification(displayNotificationInfoCreateNotificationInfo);
        return true;
    }
}

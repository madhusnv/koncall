package p001o;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes2.dex */
public abstract class c2c {
    /* renamed from: a */
    public static Notification m20097a(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(pc7.m43335a(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notification);
        builderRecoverBuilder.setChannelId(str);
        return builderRecoverBuilder.build();
    }

    /* renamed from: b */
    public static boolean m20098b(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }
}

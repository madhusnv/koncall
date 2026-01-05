package ai.salesmax.ui.service;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.work.PeriodicWorkRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.c64;
import p001o.hae;
import p001o.o2c;
import p001o.pc7;
import p001o.u6e;
import p001o.u9e;
import p001o.w7e;

/* loaded from: classes.dex */
public class NotificationReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public final PendingIntent m2654a(Context context, int i, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) NotificationReceiver.class);
        intent.putExtra("notificationId", i);
        intent.putExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, str);
        intent.putExtra(FirebaseAnalytics.Param.CONTENT, str2);
        intent.putExtra("action", str3);
        return PendingIntent.getBroadcast(context, 0, intent, 201326592);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        o2c.C15694f c15694fM41407a;
        if (context == null || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("notificationId", 0);
        String stringExtra = intent.getStringExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        String stringExtra2 = intent.getStringExtra(FirebaseAnalytics.Param.CONTENT);
        if ("snooze".equals(intent.getStringExtra("action"))) {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            Intent intent2 = new Intent(context, (Class<?>) NotificationReceiver.class);
            intent2.putExtra("notificationId", intExtra);
            intent2.putExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, stringExtra);
            intent2.putExtra(FirebaseAnalytics.Param.CONTENT, stringExtra2);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, 335544320);
            long jCurrentTimeMillis = System.currentTimeMillis() + PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
            if (Build.VERSION.SDK_INT < 31) {
                alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
                return;
            } else {
                if (alarmManager.canScheduleExactAlarms()) {
                    alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
                    return;
                }
                return;
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        int i = w7e.icon_transparent;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannelM43335a = pc7.m43335a("ai.salesmax.channel", "Permanent Notification", 2);
            notificationChannelM43335a.setDescription(String.format("This is notification to indicate %s Service is running", context.getString(hae.app_name)));
            notificationChannelM43335a.setImportance(4);
            o2c.C15694f c15694f = new o2c.C15694f(context, "ai.salesmax.channel");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannelM43335a);
            }
            c15694fM41407a = c15694f.m41399C(i).m41414i(c64.getColor(context, u6e.onesignal_bgimage_notif_body_color)).m41418m(stringExtra).m41417l(stringExtra2).m41431z(1).m41429x(false).m41400D(Uri.parse(context.getResources().getResourceName(u9e.notification1))).m41407a(w7e.ic_call, "Snooze", m2654a(context, intExtra, stringExtra, stringExtra2, "snooze")).m41405I(1);
        } else {
            c15694fM41407a = new o2c.C15694f(context, "channel").m41399C(i).m41418m(stringExtra).m41417l(stringExtra2).m41429x(false).m41400D(Uri.parse(context.getResources().getResourceName(u9e.notification1))).m41431z(1).m41405I(1).m41407a(w7e.ic_call, "Snooze", m2654a(context, intExtra, stringExtra, stringExtra2, "snooze"));
        }
        if (notificationManager != null) {
            notificationManager.notify(intExtra, c15694fM41407a.m41409c());
        }
    }
}

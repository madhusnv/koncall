package p001o;

import ai.salesmax.MainActivity;
import ai.salesmax.ui.service.CallStateManagerRestarterBroadcastReceiver;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.o2c;

/* loaded from: classes.dex */
public class v1c {

    /* renamed from: a */
    public PendingIntent f49760a;

    /* renamed from: a */
    public Notification m52230a(Context context, String str, String str2, int i) {
        if (this.f49760a == null) {
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.setFlags(603979776);
            this.f49760a = PendingIntent.getActivity(context, 0, intent, 67108864);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        if (Build.VERSION.SDK_INT < 26) {
            return new o2c.C15694f(context, "channel").m41399C(i).m41418m(str).m41417l(str2).m41429x(true).m41431z(2).m41412g(false).m41416k(this.f49760a).m41409c();
        }
        NotificationChannel notificationChannelM43335a = pc7.m43335a("ai.salesmax.channel", "Permanent Notification", 2);
        notificationChannelM43335a.setDescription(String.format("This is notification to indicate %s Service is running", context.getString(hae.app_name)));
        notificationChannelM43335a.setImportance(4);
        o2c.C15694f c15694f = new o2c.C15694f(context, "ai.salesmax.channel");
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannelM43335a);
        }
        Intent intent2 = new Intent(context, (Class<?>) CallStateManagerRestarterBroadcastReceiver.class);
        intent2.setAction("ai.salesmax.callstatemanager.NOTIFICATION_DISMISSED");
        return c15694f.m41399C(i).m41414i(c64.getColor(context, u6e.onesignal_bgimage_notif_body_color)).m41418m(str).m41417l(str2).m41429x(true).m41416k(this.f49760a).m41420o(PendingIntent.getBroadcast(context, 0, intent2, 67108864)).m41412g(false).m41409c();
    }
}

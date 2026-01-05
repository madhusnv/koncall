package p001o;

import ai.salesmax.MainActivity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import org.objectweb.asm.Opcodes;
import p001o.o2c;

/* loaded from: classes2.dex */
public abstract class arf {

    /* renamed from: a */
    public static final int f15174a = 0;

    /* renamed from: a */
    public static final Notification m17722a(NotificationManager notificationManager, String str, Context context) {
        sq8.m48649h(notificationManager, "<this>");
        sq8.m48649h(str, "messageBody");
        sq8.m48649h(context, "applicationContext");
        Notification notificationM41409c = new o2c.C15694f(context, context.getString(hae.default_notification_channel_id)).m41399C(r9e.ic_launcher).m41418m(context.getString(hae.notification_title)).m41417l(str).m41425t(gt7.m29470a(context, r9e.ic_launcher)).m41416k(PendingIntent.getActivity(context, f15174a, new Intent(context, (Class<?>) MainActivity.class), 134217728)).m41412g(true).m41431z(1).m41409c();
        sq8.m48648g(notificationM41409c, "build(...)");
        return notificationM41409c;
    }

    /* renamed from: b */
    public static final void m17723b(String str, String str2, Context context) {
        sq8.m48649h(str, "channelId");
        sq8.m48649h(str2, "channelName");
        sq8.m48649h(context, "appContext");
        if (Build.VERSION.SDK_INT >= 26) {
            qc7.m45085a();
            NotificationChannel notificationChannelM43335a = pc7.m43335a(str, str2, 4);
            notificationChannelM43335a.setShowBadge(false);
            notificationChannelM43335a.enableLights(true);
            notificationChannelM43335a.setLightColor(Opcodes.V_PREVIEW);
            notificationChannelM43335a.enableVibration(true);
            notificationChannelM43335a.setDescription(context.getString(hae.default_notification_channel_name));
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelM43335a);
        }
    }

    /* renamed from: c */
    public static final void m17724c(NotificationManager notificationManager, String str, Context context) {
        sq8.m48649h(notificationManager, "<this>");
        sq8.m48649h(str, "messageBody");
        sq8.m48649h(context, "applicationContext");
        notificationManager.notify(f15174a, m17722a(notificationManager, str, context));
    }
}

package p001o;

import ai.salesmax.MainActivity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.Optional;
import java.util.function.Consumer;
import p001o.o2c;

/* loaded from: classes.dex */
public class y1c {

    /* renamed from: a */
    public PendingIntent f54716a;

    /* renamed from: b */
    public Number f54717b = 1487;

    /* renamed from: c */
    public Notification m57109c(Context context, String str, String str2, int i, String str3, Long l) {
        if (this.f54716a == null) {
            final Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.setFlags(536870912);
            Optional.ofNullable(str3).ifPresent(new Consumer() { // from class: o.x1c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    intent.putExtra(ImagesContract.URL, (String) obj);
                }
            });
            intent.putExtra("notificationId", this.f54717b);
            this.f54716a = PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        if (Build.VERSION.SDK_INT < 26) {
            o2c.C15694f c15694fM41416k = new o2c.C15694f(context, "channel").m41399C(i).m41418m(str).m41417l(str2).m41429x(false).m41431z(1).m41405I(1).m41416k(this.f54716a);
            if (l != null) {
                c15694fM41416k.m41403G(l.longValue());
            }
            return c15694fM41416k.m41409c();
        }
        NotificationChannel notificationChannelM43335a = pc7.m43335a("ai.salesmax.channel", "Permanent Notification", 2);
        notificationChannelM43335a.setDescription(String.format("This is notification to indicate %s Service is running", context.getString(hae.app_name)));
        notificationChannelM43335a.setImportance(4);
        notificationChannelM43335a.setLockscreenVisibility(1);
        o2c.C15694f c15694f = new o2c.C15694f(context, "ai.salesmax.channel");
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannelM43335a);
        }
        c15694f.m41399C(i).m41414i(c64.getColor(context, u6e.onesignal_bgimage_notif_body_color)).m41418m(str).m41417l(str2).m41431z(1).m41429x(false).m41416k(this.f54716a).m41405I(1);
        if (l != null) {
            c15694f.m41403G(l.longValue());
        }
        return c15694f.m41409c();
    }
}

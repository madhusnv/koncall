package p001o;

import ai.salesmax.MainActivity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p001o.o2c;

/* loaded from: classes2.dex */
public final class c3c {

    /* renamed from: a */
    public final Context f17223a;

    /* renamed from: b */
    public final String f17224b;

    /* renamed from: c */
    public final int f17225c;

    public c3c(Context context) {
        sq8.m48649h(context, "context");
        this.f17223a = context;
        this.f17224b = "superfone_reminder_channel_id";
        this.f17225c = m20166a();
    }

    /* renamed from: a */
    public final int m20166a() {
        String str = new SimpleDateFormat("ddHHmmss", Locale.US).format(new Date());
        sq8.m48648g(str, "format(...)");
        return Integer.parseInt(str);
    }

    /* renamed from: b */
    public final void m20167b(String str, String str2) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        m20168c();
        Intent intent = new Intent(this.f17223a, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        PendingIntent activity = PendingIntent.getActivity(this.f17223a, 0, intent, 67108864);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f17223a.getResources(), w7e.logo_colored);
        Notification notificationM41409c = new o2c.C15694f(this.f17223a, this.f17224b).m41399C(w7e.ic_bell_icon).m41425t(bitmapDecodeResource).m41418m(str).m41417l(str2).m41401E(new o2c.C15691c().m41370i(bitmapDecodeResource)).m41416k(activity).m41431z(0).m41409c();
        sq8.m48648g(notificationM41409c, "build(...)");
        if (c64.checkSelfPermission(this.f17223a, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        e3c.m24211d(this.f17223a).m24217f(this.f17225c, notificationM41409c);
    }

    /* renamed from: c */
    public final void m20168c() {
        if (Build.VERSION.SDK_INT >= 26) {
            qc7.m45085a();
            String str = this.f17224b;
            NotificationChannel notificationChannelM43335a = pc7.m43335a(str, str, 3);
            notificationChannelM43335a.setDescription("Reminder Channel Description");
            Object systemService = this.f17223a.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannelM43335a);
        }
    }
}

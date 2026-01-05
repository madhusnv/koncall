package p001o;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.work.ForegroundInfo;
import p001o.o2c;

/* loaded from: classes.dex */
public final class rc7 {

    /* renamed from: a */
    public static final rc7 f43371a = new rc7();

    /* renamed from: a */
    public final ForegroundInfo m46509a(Context context) {
        sq8.m48649h(context, "context");
        m46510b(context);
        Notification notificationM41409c = new o2c.C15694f(context, "salesmax_sync").m41399C(w7e.icon_transparent).m41418m("Salesmax is syncing").m41431z(-1).m41429x(true).m41409c();
        sq8.m48648g(notificationM41409c, "build(...)");
        return new ForegroundInfo(42, notificationM41409c);
    }

    /* renamed from: b */
    public final void m46510b(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (notificationManager.getNotificationChannel("salesmax_sync") == null) {
                qc7.m45085a();
                notificationManager.createNotificationChannel(pc7.m43335a("salesmax_sync", "Salesmax background sync", 2));
            }
        }
    }
}

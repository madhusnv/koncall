package p001o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes2.dex */
public abstract class p4c {
    /* renamed from: a */
    public static void m42968a(Context context, String str, int i, int i2, int i3) {
        if (sqi.f45790a >= 26) {
            NotificationManager notificationManager = (NotificationManager) op0.m42515e((NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME));
            qc7.m45085a();
            NotificationChannel notificationChannelM43335a = pc7.m43335a(str, context.getString(i), i3);
            if (i2 != 0) {
                notificationChannelM43335a.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannelM43335a);
        }
    }
}

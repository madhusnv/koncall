package p001o;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class heg {

    /* renamed from: a */
    public static final heg f26749a = new heg();

    /* renamed from: a */
    public static final Uri m30315a(Cursor cursor) {
        sq8.m48649h(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        sq8.m48648g(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    /* renamed from: b */
    public static final boolean m30316b(ActivityManager activityManager) {
        sq8.m48649h(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}

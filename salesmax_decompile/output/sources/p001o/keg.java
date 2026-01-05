package p001o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class keg {

    /* renamed from: a */
    public static final keg f32114a = new keg();

    /* renamed from: a */
    public static final List m35550a(Cursor cursor) {
        sq8.m48649h(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        sq8.m48646e(notificationUris);
        return notificationUris;
    }

    /* renamed from: b */
    public static final void m35551b(Cursor cursor, ContentResolver contentResolver, List list) {
        sq8.m48649h(cursor, "cursor");
        sq8.m48649h(contentResolver, "cr");
        sq8.m48649h(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}

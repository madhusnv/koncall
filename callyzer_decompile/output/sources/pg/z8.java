package pg;

import android.database.Cursor;
import android.view.View;
import com.websoptimization.callyzerbiz.R;
import k6.C4018a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class z8 {
    /* renamed from: a */
    public static final int m11966a(Cursor cursor, String str) {
        AbstractC4154l.m8923f(cursor, "<this>");
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: b */
    public static final long m11967b(Cursor cursor, String str) {
        AbstractC4154l.m8923f(cursor, "<this>");
        return cursor.getLong(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: c */
    public static final C4018a m11968c(View view) {
        C4018a c4018a = (C4018a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c4018a != null) {
            return c4018a;
        }
        C4018a c4018a2 = new C4018a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c4018a2);
        return c4018a2;
    }

    /* renamed from: d */
    public static final String m11969d(Cursor cursor, String str) {
        AbstractC4154l.m8923f(cursor, "<this>");
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: e */
    public static final boolean m11970e(Cursor cursor, String str) {
        AbstractC4154l.m8923f(cursor, "<this>");
        return !m11971f(cursor, str);
    }

    /* renamed from: f */
    public static final boolean m11971f(Cursor cursor, String str) {
        AbstractC4154l.m8923f(cursor, "<this>");
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex == -1 || cursor.isNull(columnIndex);
    }
}

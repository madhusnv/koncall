package p001o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class rw5 {
    /* renamed from: a */
    public static void m47192a(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static String m47193b(Context context, Uri uri) {
        return m47199h(context, uri, "_display_name", null);
    }

    /* renamed from: c */
    public static String m47194c(Context context, Uri uri) {
        return m47199h(context, uri, "mime_type", null);
    }

    /* renamed from: d */
    public static boolean m47195d(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m47194c(context, uri));
    }

    /* renamed from: e */
    public static boolean m47196e(Context context, Uri uri) {
        String strM47194c = m47194c(context, uri);
        return ("vnd.android.document/directory".equals(strM47194c) || TextUtils.isEmpty(strM47194c)) ? false : true;
    }

    /* renamed from: f */
    public static long m47197f(Context context, Uri uri) {
        return m47198g(context, uri, "last_modified", 0L);
    }

    /* renamed from: g */
    public static long m47198g(Context context, Uri uri, String str, long j) throws Exception {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j : cursorQuery.getLong(0);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            return j;
        } finally {
            m47192a(cursorQuery);
        }
    }

    /* renamed from: h */
    public static String m47199h(Context context, Uri uri, String str, String str2) throws Exception {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            return str2;
        } finally {
            m47192a(cursorQuery);
        }
    }
}

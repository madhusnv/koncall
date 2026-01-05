package p001o;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes5.dex */
public abstract class w9b {
    /* renamed from: a */
    public static boolean m54117a(Uri uri) {
        return m54118b(uri) && !m54121e(uri);
    }

    /* renamed from: b */
    public static boolean m54118b(Uri uri) {
        return uri != null && FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m54119c(Uri uri) {
        return m54118b(uri) && m54121e(uri);
    }

    /* renamed from: d */
    public static boolean m54120d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    public static boolean m54121e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}

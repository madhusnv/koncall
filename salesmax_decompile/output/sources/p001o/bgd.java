package p001o;

import android.text.TextUtils;
import java.util.Collection;

/* loaded from: classes5.dex */
public abstract class bgd {
    /* renamed from: a */
    public static void m18883a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m18884b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static Collection m18885c(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection;
    }

    /* renamed from: d */
    public static Object m18886d(Object obj) {
        return m18887e(obj, "Argument must not be null");
    }

    /* renamed from: e */
    public static Object m18887e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}

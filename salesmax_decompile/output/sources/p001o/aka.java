package p001o;

import android.os.Build;
import android.util.Log;

/* loaded from: classes5.dex */
public abstract class aka {
    /* renamed from: a */
    public static String m17332a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m17333b(String str, String str2, Object obj) {
        if (Log.isLoggable(m17336e(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* renamed from: c */
    public static void m17334c(String str, String str2, Object... objArr) {
        if (Log.isLoggable(m17336e(str), 3)) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m17335d(String str, String str2, Throwable th) {
        m17336e(str);
    }

    /* renamed from: e */
    public static String m17336e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m17332a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m17337f(String str, String str2, Object obj) {
        if (Log.isLoggable(m17336e(str), 4)) {
            String.format(str2, obj);
        }
    }

    /* renamed from: g */
    public static void m17338g(String str, String str2, Object obj) {
        if (Log.isLoggable(m17336e(str), 5)) {
            String.format(str2, obj);
        }
    }
}

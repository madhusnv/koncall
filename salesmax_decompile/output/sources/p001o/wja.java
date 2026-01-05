package p001o;

import android.os.Build;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class wja {

    /* renamed from: a */
    public static int f52235a = 3;

    /* renamed from: a */
    public static void m54627a(String str, String str2) {
        m54633g(m54637k(str), 3);
    }

    /* renamed from: b */
    public static void m54628b(String str, String str2, Throwable th) {
        m54633g(m54637k(str), 3);
    }

    /* renamed from: c */
    public static void m54629c(String str, String str2) {
        m54633g(m54637k(str), 6);
    }

    /* renamed from: d */
    public static void m54630d(String str, String str2, Throwable th) {
        m54633g(m54637k(str), 6);
    }

    /* renamed from: e */
    public static void m54631e(String str, String str2) {
        m54633g(m54637k(str), 4);
    }

    /* renamed from: f */
    public static boolean m54632f(String str) {
        return m54633g(m54637k(str), 3);
    }

    /* renamed from: g */
    public static boolean m54633g(String str, int i) {
        return f52235a <= i || Log.isLoggable(str, i);
    }

    /* renamed from: h */
    public static boolean m54634h(String str) {
        return m54633g(m54637k(str), 2);
    }

    /* renamed from: i */
    public static void m54635i() {
        f52235a = 3;
    }

    /* renamed from: j */
    public static void m54636j(int i) {
        f52235a = i;
    }

    /* renamed from: k */
    public static String m54637k(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* renamed from: l */
    public static void m54638l(String str, String str2) {
        m54633g(m54637k(str), 5);
    }

    /* renamed from: m */
    public static void m54639m(String str, String str2, Throwable th) {
        m54633g(m54637k(str), 5);
    }
}

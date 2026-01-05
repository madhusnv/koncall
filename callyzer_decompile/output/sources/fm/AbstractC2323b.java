package fm;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fm.b */
/* loaded from: classes.dex */
public abstract class AbstractC2323b {

    /* renamed from: a */
    public static final boolean f10541a;

    /* renamed from: b */
    public static final Logger f10542b;

    /* renamed from: c */
    public static final Level f10543c = Level.FINE;

    static {
        try {
            f10541a = Boolean.getBoolean("jakarta.activation.debug") || Boolean.getBoolean("javax.activation.debug");
        } catch (Throwable unused) {
        }
        f10542b = Logger.getLogger("jakarta.activation");
    }

    /* renamed from: a */
    public static boolean m6004a() {
        return f10541a || f10542b.isLoggable(f10543c);
    }

    /* renamed from: b */
    public static void m6005b(String str) {
        if (f10541a) {
            System.out.println(str);
        }
        f10542b.log(f10543c, str);
    }

    /* renamed from: c */
    public static void m6006c(String str, Exception exc) {
        if (f10541a) {
            System.out.println(str + "; Exception: " + exc);
        }
        f10542b.log(f10543c, str, (Throwable) exc);
    }
}

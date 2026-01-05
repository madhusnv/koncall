package p001o;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class vsh {

    /* renamed from: a */
    public static long f50832a;

    /* renamed from: b */
    public static Method f50833b;

    /* renamed from: c */
    public static Method f50834c;

    /* renamed from: a */
    public static void m53384a(String str) {
        xsh.m56790a(m53391h(str));
    }

    /* renamed from: b */
    public static void m53385b() {
        xsh.m56791b();
    }

    /* renamed from: c */
    public static void m53386c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    /* renamed from: d */
    public static boolean m53387d() {
        return Build.VERSION.SDK_INT >= 29 ? ysh.m58186a() : m53388e();
    }

    /* renamed from: e */
    public static boolean m53388e() {
        try {
            if (f50833b == null) {
                f50832a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f50833b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f50833b.invoke(null, Long.valueOf(f50832a))).booleanValue();
        } catch (Exception e) {
            m53386c("isTagEnabled", e);
            return false;
        }
    }

    /* renamed from: f */
    public static void m53389f(String str, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            ysh.m58187b(m53391h(str), i);
        } else {
            m53390g(m53391h(str), i);
        }
    }

    /* renamed from: g */
    public static void m53390g(String str, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f50834c == null) {
                f50834c = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f50834c.invoke(null, Long.valueOf(f50832a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m53386c("traceCounter", e);
        }
    }

    /* renamed from: h */
    public static String m53391h(String str) {
        return str.length() <= 127 ? str : str.substring(0, Opcodes.LAND);
    }
}

package p001o;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class zsh {

    /* renamed from: a */
    public static long f57607a;

    /* renamed from: b */
    public static Method f57608b;

    /* renamed from: c */
    public static Method f57609c;

    /* renamed from: d */
    public static Method f57610d;

    /* renamed from: e */
    public static Method f57611e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f57607a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f57608b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f57609c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f57610d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f57611e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m59821a(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: b */
    public static void m59822b() {
        Trace.endSection();
    }
}

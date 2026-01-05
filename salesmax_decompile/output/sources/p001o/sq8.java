package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class sq8 {
    /* renamed from: a */
    public static boolean m48642a(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    /* renamed from: b */
    public static boolean m48643b(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    /* renamed from: c */
    public static boolean m48644c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static void m48645d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m48656o(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: e */
    public static void m48646e(Object obj) {
        if (obj == null) {
            m48659r();
        }
    }

    /* renamed from: f */
    public static void m48647f(Object obj, String str) {
        if (obj == null) {
            m48660s(str);
        }
    }

    /* renamed from: g */
    public static void m48648g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m48656o(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: h */
    public static void m48649h(Object obj, String str) {
        if (obj == null) {
            m48663v(str);
        }
    }

    /* renamed from: i */
    public static void m48650i(Object obj, String str) {
        if (obj == null) {
            m48662u(str);
        }
    }

    /* renamed from: j */
    public static int m48651j(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: k */
    public static int m48652k(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: l */
    public static String m48653l(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = sq8.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: m */
    public static void m48654m() {
        m48664w();
    }

    /* renamed from: n */
    public static void m48655n(int i, String str) {
        m48664w();
    }

    /* renamed from: o */
    public static Throwable m48656o(Throwable th) {
        return m48657p(th, sq8.class.getName());
    }

    /* renamed from: p */
    public static Throwable m48657p(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return th;
    }

    /* renamed from: q */
    public static String m48658q(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: r */
    public static void m48659r() {
        throw ((NullPointerException) m48656o(new NullPointerException()));
    }

    /* renamed from: s */
    public static void m48660s(String str) {
        throw ((NullPointerException) m48656o(new NullPointerException(str)));
    }

    /* renamed from: t */
    public static void m48661t() {
        throw ((re9) m48656o(new re9()));
    }

    /* renamed from: u */
    public static void m48662u(String str) {
        throw ((IllegalArgumentException) m48656o(new IllegalArgumentException(m48653l(str))));
    }

    /* renamed from: v */
    public static void m48663v(String str) {
        throw ((NullPointerException) m48656o(new NullPointerException(m48653l(str))));
    }

    /* renamed from: w */
    public static void m48664w() {
        m48665x("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: x */
    public static void m48665x(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: y */
    public static void m48666y(String str) {
        throw ((w3i) m48656o(new w3i(str)));
    }

    /* renamed from: z */
    public static void m48667z(String str) {
        m48666y("lateinit property " + str + " has not been initialized");
    }
}

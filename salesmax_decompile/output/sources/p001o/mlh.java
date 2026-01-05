package p001o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class mlh {

    /* renamed from: a */
    public static final Object f35666a;

    /* renamed from: b */
    public static final Method f35667b;

    /* renamed from: c */
    public static final Method f35668c;

    static {
        Object objM39318b = m39318b();
        f35666a = objM39318b;
        f35667b = objM39318b == null ? null : m39317a();
        f35668c = objM39318b != null ? m39320d(objM39318b) : null;
    }

    /* renamed from: a */
    public static Method m39317a() {
        return m39319c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: b */
    public static Object m39318b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m39319c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m39320d(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodM39319c = m39319c("getStackTraceDepth", Throwable.class);
            if (methodM39319c == null) {
                return null;
            }
            methodM39319c.invoke(obj, new Throwable());
            return methodM39319c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static RuntimeException m39321e(Throwable th) {
        m39326j(th);
        throw new RuntimeException(th);
    }

    /* renamed from: f */
    public static void m39322f(Throwable th, Class cls) throws Throwable {
        if (th != null) {
            m39325i(th, cls);
        }
    }

    /* renamed from: g */
    public static void m39323g(Throwable th) {
        if (th != null) {
            m39326j(th);
        }
    }

    /* renamed from: h */
    public static void m39324h(Throwable th, Class cls) throws Throwable {
        m39322f(th, cls);
        m39323g(th);
    }

    /* renamed from: i */
    public static void m39325i(Throwable th, Class cls) throws Throwable {
        dgd.m23062o(th);
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: j */
    public static void m39326j(Throwable th) {
        dgd.m23062o(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}

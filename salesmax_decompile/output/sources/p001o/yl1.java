package p001o;

import java.lang.ref.SoftReference;

/* loaded from: classes5.dex */
public abstract class yl1 {

    /* renamed from: a */
    public static final mkh f55674a;

    /* renamed from: b */
    public static final ThreadLocal f55675b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        f55674a = zEquals ? mkh.m39298a() : null;
        f55675b = new ThreadLocal();
    }

    /* renamed from: a */
    public static xl1 m57983a() {
        ThreadLocal threadLocal = f55675b;
        SoftReference softReference = (SoftReference) threadLocal.get();
        xl1 xl1Var = softReference == null ? null : (xl1) softReference.get();
        if (xl1Var == null) {
            xl1Var = new xl1();
            mkh mkhVar = f55674a;
            threadLocal.set(mkhVar != null ? mkhVar.m39300c(xl1Var) : new SoftReference(xl1Var));
        }
        return xl1Var;
    }
}

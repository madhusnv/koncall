package kotlin.jvm.internal;

import a2.AbstractC0030c;
import e1.x0;
import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.l */
/* loaded from: classes3.dex */
public abstract class AbstractC4154l {
    /* renamed from: a */
    public static boolean m8918a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m8919b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        m8927j(illegalStateException, AbstractC4154l.class.getName());
        throw illegalStateException;
    }

    /* renamed from: c */
    public static void m8920c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m8927j(nullPointerException, AbstractC4154l.class.getName());
        throw nullPointerException;
    }

    /* renamed from: d */
    public static void m8921d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m8927j(nullPointerException, AbstractC4154l.class.getName());
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m8922e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m8927j(nullPointerException, AbstractC4154l.class.getName());
        throw nullPointerException;
    }

    /* renamed from: f */
    public static void m8923f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC4154l.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        StringBuilder sbM127r = AbstractC0030c.m127r("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM127r.append(str);
        NullPointerException nullPointerException = new NullPointerException(sbM127r.toString());
        m8927j(nullPointerException, AbstractC4154l.class.getName());
        throw nullPointerException;
    }

    /* renamed from: g */
    public static int m8924g(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* renamed from: h */
    public static final x0 m8925h(Object[] array) {
        m8923f(array, "array");
        return new x0(array);
    }

    /* renamed from: i */
    public static void m8926i() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: j */
    public static void m8927j(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
    }

    /* renamed from: k */
    public static void m8928k(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(AbstractC5601a.m11238i("lateinit property ", str, " has not been initialized"));
        m8927j(uninitializedPropertyAccessException, AbstractC4154l.class.getName());
        throw uninitializedPropertyAccessException;
    }
}

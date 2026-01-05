package p001o;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class rc2 {

    /* renamed from: a */
    public static Method f43361a;

    /* renamed from: b */
    public static Method f43362b;

    /* renamed from: c */
    public static boolean f43363c;

    /* renamed from: o.rc2$a */
    public static class C16584a {
        /* renamed from: a */
        public static void m46503a(Canvas canvas) {
            canvas.disableZ();
        }

        /* renamed from: b */
        public static void m46504b(Canvas canvas) {
            canvas.enableZ();
        }
    }

    /* renamed from: a */
    public static void m46502a(Canvas canvas, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                C16584a.m46504b(canvas);
                return;
            } else {
                C16584a.m46503a(canvas);
                return;
            }
        }
        if (i == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f43363c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f43361a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f43362b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f43363c = true;
        }
        if (z) {
            try {
                Method method2 = f43361a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        if (z || (method = f43362b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}

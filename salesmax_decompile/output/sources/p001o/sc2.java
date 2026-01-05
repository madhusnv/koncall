package p001o;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class sc2 {

    /* renamed from: a */
    public static final sc2 f45165a = new sc2();

    /* renamed from: b */
    public static Method f45166b;

    /* renamed from: c */
    public static Method f45167c;

    /* renamed from: d */
    public static boolean f45168d;

    /* renamed from: a */
    public final void m48149a(Canvas canvas, boolean z) {
        Method method;
        sq8.m48649h(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            vc2.f50102a.m52512a(canvas, z);
            return;
        }
        if (!f45168d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f45166b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f45167c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f45166b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f45167c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f45166b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f45167c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f45168d = true;
        }
        if (z) {
            try {
                Method method4 = f45166b;
                if (method4 != null) {
                    sq8.m48646e(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f45167c) == null) {
            return;
        }
        sq8.m48646e(method);
        method.invoke(canvas, new Object[0]);
    }
}

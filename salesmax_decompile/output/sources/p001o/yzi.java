package p001o;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class yzi {

    /* renamed from: a */
    public static boolean f56343a;

    /* renamed from: b */
    public static Method f56344b;

    /* renamed from: c */
    public static final boolean f56345c;

    /* renamed from: o.yzi$a */
    public static class C18536a {
        /* renamed from: a */
        public static void m58587a(View view, Rect rect, Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f56345c = Build.VERSION.SDK_INT >= 27;
    }

    /* renamed from: a */
    public static void m58584a(View view, Rect rect, Rect rect2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            C18536a.m58587a(view, rect, rect2);
            return;
        }
        if (!f56343a) {
            f56343a = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f56344b = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f56344b.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
        Method method = f56344b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m58585b(View view) {
        return view.getLayoutDirection() == 1;
    }

    /* renamed from: c */
    public static void m58586c(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}

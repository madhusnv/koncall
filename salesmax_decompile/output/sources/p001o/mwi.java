package p001o;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class mwi {

    /* renamed from: a */
    public static boolean f36055a = true;

    /* renamed from: b */
    public static Method f36056b;

    /* renamed from: c */
    public static boolean f36057c;

    /* renamed from: o.mwi$a */
    public static class C15439a {
        /* renamed from: a */
        public static int m39751a(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        /* renamed from: b */
        public static void m39752b(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    /* renamed from: a */
    public static int m39748a(ViewGroup viewGroup, int i) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 29) {
            return C15439a.m39751a(viewGroup, i);
        }
        if (!f36057c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f36056b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f36057c = true;
        }
        Method method = f36056b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m39749b(ViewGroup viewGroup, boolean z) {
        if (f36055a) {
            try {
                C15439a.m39752b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f36055a = false;
            }
        }
    }

    /* renamed from: c */
    public static void m39750c(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C15439a.m39752b(viewGroup, z);
        } else {
            m39749b(viewGroup, z);
        }
    }
}

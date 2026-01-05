package p001o;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class es7 implements cs7 {

    /* renamed from: b */
    public static Class f22104b;

    /* renamed from: c */
    public static boolean f22105c;

    /* renamed from: d */
    public static Method f22106d;

    /* renamed from: e */
    public static boolean f22107e;

    /* renamed from: f */
    public static Method f22108f;

    /* renamed from: g */
    public static boolean f22109g;

    /* renamed from: a */
    public final View f22110a;

    public es7(View view) {
        this.f22110a = view;
    }

    /* renamed from: b */
    public static cs7 m25522b(View view, ViewGroup viewGroup, Matrix matrix) throws NoSuchMethodException, SecurityException {
        m25523c();
        Method method = f22106d;
        if (method != null) {
            try {
                return new es7((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m25523c() throws NoSuchMethodException, SecurityException {
        if (f22107e) {
            return;
        }
        try {
            m25524d();
            Method declaredMethod = f22104b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f22106d = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f22107e = true;
    }

    /* renamed from: d */
    public static void m25524d() {
        if (f22105c) {
            return;
        }
        try {
            f22104b = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException unused) {
        }
        f22105c = true;
    }

    /* renamed from: e */
    public static void m25525e() throws NoSuchMethodException, SecurityException {
        if (f22109g) {
            return;
        }
        try {
            m25524d();
            Method declaredMethod = f22104b.getDeclaredMethod("removeGhost", View.class);
            f22108f = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f22109g = true;
    }

    /* renamed from: f */
    public static void m25526f(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m25525e();
        Method method = f22108f;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // p001o.cs7
    /* renamed from: a */
    public void mo21705a(ViewGroup viewGroup, View view) {
    }

    @Override // p001o.cs7
    public void setVisibility(int i) {
        this.f22110a.setVisibility(i);
    }
}

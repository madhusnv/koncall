package p001o;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class c0j {

    /* renamed from: a */
    public static boolean f17084a = true;

    /* renamed from: b */
    public static Field f17085b;

    /* renamed from: c */
    public static boolean f17086c;

    /* renamed from: o.c0j$a */
    public static class C12530a {
        /* renamed from: a */
        public static float m20036a(View view) {
            return view.getTransitionAlpha();
        }

        /* renamed from: b */
        public static void m20037b(View view, float f) {
            view.setTransitionAlpha(f);
        }
    }

    /* renamed from: a */
    public void m20027a(View view) {
    }

    /* renamed from: b */
    public float mo20028b(View view) {
        if (f17084a) {
            try {
                return C12530a.m20036a(view);
            } catch (NoSuchMethodError unused) {
                f17084a = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void m20029c(View view) {
    }

    /* renamed from: d */
    public abstract void mo20030d(View view, Matrix matrix);

    /* renamed from: e */
    public abstract void mo20031e(View view, int i, int i2, int i3, int i4);

    /* renamed from: f */
    public void mo20032f(View view, float f) {
        if (f17084a) {
            try {
                C12530a.m20037b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f17084a = false;
            }
        }
        view.setAlpha(f);
    }

    /* renamed from: g */
    public void mo20033g(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f17086c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f17085b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f17086c = true;
        }
        Field field = f17085b;
        if (field != null) {
            try {
                f17085b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public abstract void mo20034h(View view, Matrix matrix);

    /* renamed from: i */
    public abstract void mo20035i(View view, Matrix matrix);
}

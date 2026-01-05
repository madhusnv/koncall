package p001o;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class spe {

    /* renamed from: a */
    public static Field f45737a;

    /* renamed from: b */
    public static boolean f45738b;

    /* renamed from: c */
    public static Class f45739c;

    /* renamed from: d */
    public static boolean f45740d;

    /* renamed from: e */
    public static Field f45741e;

    /* renamed from: f */
    public static boolean f45742f;

    /* renamed from: g */
    public static Field f45743g;

    /* renamed from: h */
    public static boolean f45744h;

    /* renamed from: a */
    public static void m48615a(Resources resources) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        m48616b(resources);
    }

    /* renamed from: b */
    public static void m48616b(Resources resources) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object obj;
        if (!f45744h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f45743g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f45744h = true;
        }
        Field field = f45743g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f45738b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f45737a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f45738b = true;
        }
        Field field2 = f45737a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            m48617c(obj2);
        }
    }

    /* renamed from: c */
    public static void m48617c(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!f45740d) {
            try {
                f45739c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f45740d = true;
        }
        Class cls = f45739c;
        if (cls == null) {
            return;
        }
        if (!f45742f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f45741e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f45742f = true;
        }
        Field field = f45741e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}

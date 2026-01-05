package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p001o.c64;
import p001o.m3d;
import p001o.w80;

/* renamed from: pub.devrel.easypermissions.a */
/* loaded from: classes6.dex */
public abstract class AbstractC18784a {

    /* renamed from: pub.devrel.easypermissions.a$a */
    public interface a {
        /* renamed from: a */
        void mo33237a(int i, List list);

        /* renamed from: f */
        void mo33240f(int i, List list);
    }

    /* renamed from: pub.devrel.easypermissions.a$b */
    public interface b {
        /* renamed from: d */
        void mo33238d(int i);

        /* renamed from: e */
        void mo33239e(int i);
    }

    /* renamed from: a */
    public static boolean m60206a(Context context, String... strArr) {
        if (context == null) {
            throw new IllegalArgumentException("Can't check permissions for null context");
        }
        for (String str : strArr) {
            if (c64.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m60207b(Object obj) {
        if (!obj.getClass().getSimpleName().endsWith("_")) {
            return false;
        }
        try {
            return Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static void m60208c(Object obj, int i, String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            iArr[i2] = 0;
        }
        m60209d(i, strArr, iArr, obj);
    }

    /* renamed from: d */
    public static void m60209d(int i, String[] strArr, int[] iArr, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (Object obj : objArr) {
            if (!arrayList.isEmpty() && (obj instanceof a)) {
                ((a) obj).mo33240f(i, arrayList);
            }
            if (!arrayList2.isEmpty() && (obj instanceof a)) {
                ((a) obj).mo33237a(i, arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                m60211f(obj, i);
            }
        }
    }

    /* renamed from: e */
    public static void m60210e(C18785b c18785b) {
        if (m60206a(c18785b.m60214a().mo37853b(), c18785b.m60216c())) {
            m60208c(c18785b.m60214a().m38239c(), c18785b.m60219f(), c18785b.m60216c());
        } else {
            c18785b.m60214a().m38241g(c18785b.m60218e(), c18785b.m60217d(), c18785b.m60215b(), c18785b.m60220g(), c18785b.m60219f(), c18785b.m60216c());
        }
    }

    /* renamed from: f */
    public static void m60211f(Object obj, int i) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> superclass = obj.getClass();
        if (m60207b(obj)) {
            superclass = superclass.getSuperclass();
        }
        while (superclass != null) {
            for (Method method : superclass.getDeclaredMethods()) {
                w80 w80Var = (w80) method.getAnnotation(w80.class);
                if (w80Var != null && w80Var.value() == i) {
                    if (method.getParameterTypes().length > 0) {
                        throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                    }
                    try {
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* renamed from: g */
    public static boolean m60212g(Activity activity, String... strArr) {
        return m3d.m38237d(activity).m38243k(strArr);
    }

    /* renamed from: h */
    public static boolean m60213h(Activity activity, List list) {
        return m3d.m38237d(activity).m38244l(list);
    }
}

package p013o;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a */
    public static final Method f25647a;

    /* renamed from: b */
    public static final Method f25648b;

    /* renamed from: c */
    public static final Method f25649c;

    /* renamed from: d */
    public static final boolean f25650d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f25647a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f25648b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f25649c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f25650d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}

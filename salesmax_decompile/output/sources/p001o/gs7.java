package p001o;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public abstract class gs7 {
    /* renamed from: a */
    public static cs7 m29445a(View view, ViewGroup viewGroup, Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? es7.m25522b(view, viewGroup, matrix) : fs7.m27417b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    public static void m29446b(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT == 28) {
            es7.m25526f(view);
        } else {
            fs7.m27421f(view);
        }
    }
}

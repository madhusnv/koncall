package c6;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.skydoves.balloon.internals.DefinitionKt;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a */
    public static final Method f5534a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f5534a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m2532a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f5534a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true) ? typedValue.getDimension(context.getResources().getDisplayMetrics()) : DefinitionKt.NO_Float_VALUE;
    }
}

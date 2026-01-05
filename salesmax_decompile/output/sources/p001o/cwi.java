package p001o;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class cwi {

    /* renamed from: a */
    public static Method f18748a;

    /* renamed from: o.cwi$a */
    public static class C12761a {
        /* renamed from: a */
        public static float m21954a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* renamed from: b */
        public static float m21955b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: o.cwi$b */
    public static class C12762b {
        /* renamed from: a */
        public static int m21956a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        /* renamed from: b */
        public static boolean m21957b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* renamed from: o.cwi$c */
    public static class C12763c {
        /* renamed from: a */
        public static int m21958a(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        /* renamed from: b */
        public static int m21959b(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f18748a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m21942a(Resources resources, int i, jdg jdgVar, int i2) {
        int dimensionPixelSize;
        return i != -1 ? (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize : ((Integer) jdgVar.get()).intValue();
    }

    /* renamed from: b */
    public static float m21943b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f18748a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static int m21944c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, CredentialsData.CREDENTIALS_TYPE_ANDROID);
    }

    /* renamed from: d */
    public static int m21945d(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return m21944c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* renamed from: e */
    public static int m21946e(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return m21944c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* renamed from: f */
    public static float m21947f(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? C12761a.m21954a(viewConfiguration) : m21943b(viewConfiguration, context);
    }

    /* renamed from: g */
    public static int m21948g(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? C12762b.m21956a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: h */
    public static int m21949h(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C12763c.m21958a(viewConfiguration, i, i2, i3);
        }
        if (!m21952k(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iM21945d = m21945d(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return m21942a(resources, iM21945d, new jdg() { // from class: o.bwi
            @Override // p001o.jdg
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    /* renamed from: i */
    public static int m21950i(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C12763c.m21959b(viewConfiguration, i, i2, i3);
        }
        if (!m21952k(i, i2, i3)) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Resources resources = context.getResources();
        int iM21946e = m21946e(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return m21942a(resources, iM21946e, new jdg() { // from class: o.awi
            @Override // p001o.jdg
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: j */
    public static float m21951j(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? C12761a.m21955b(viewConfiguration) : m21943b(viewConfiguration, context);
    }

    /* renamed from: k */
    public static boolean m21952k(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    /* renamed from: l */
    public static boolean m21953l(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C12762b.m21957b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iM21944c = m21944c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iM21944c != 0 && resources.getBoolean(iM21944c);
    }
}

package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes3.dex */
public abstract class gua {
    /* renamed from: a */
    public static int m29502a(int i, int i2) {
        return ni3.m40624p(i, (Color.alpha(i) * i2) / Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: b */
    public static int m29503b(Context context, int i, int i2) {
        Integer numM29507f = m29507f(context, i);
        return numM29507f != null ? numM29507f.intValue() : i2;
    }

    /* renamed from: c */
    public static int m29504c(Context context, int i, String str) {
        return m29514m(context, ota.m42661e(context, i, str));
    }

    /* renamed from: d */
    public static int m29505d(View view, int i) {
        return m29514m(view.getContext(), ota.m42662f(view, i));
    }

    /* renamed from: e */
    public static int m29506e(View view, int i, int i2) {
        return m29503b(view.getContext(), i, i2);
    }

    /* renamed from: f */
    public static Integer m29507f(Context context, int i) {
        TypedValue typedValueM42657a = ota.m42657a(context, i);
        if (typedValueM42657a != null) {
            return Integer.valueOf(m29514m(context, typedValueM42657a));
        }
        return null;
    }

    /* renamed from: g */
    public static ColorStateList m29508g(Context context, int i) {
        TypedValue typedValueM42657a = ota.m42657a(context, i);
        if (typedValueM42657a == null) {
            return null;
        }
        int i2 = typedValueM42657a.resourceId;
        if (i2 != 0) {
            return c64.getColorStateList(context, i2);
        }
        int i3 = typedValueM42657a.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    /* renamed from: h */
    public static boolean m29509h(int i) {
        return i != 0 && ni3.m40614f(i) > 0.5d;
    }

    /* renamed from: i */
    public static boolean m29510i(Context context) {
        return ota.m42658b(context, z5e.isLightTheme, true);
    }

    /* renamed from: j */
    public static int m29511j(int i, int i2) {
        return ni3.m40619k(i2, i);
    }

    /* renamed from: k */
    public static int m29512k(int i, int i2, float f) {
        return m29511j(i, ni3.m40624p(i2, Math.round(Color.alpha(i2) * f)));
    }

    /* renamed from: l */
    public static int m29513l(View view, int i, int i2, float f) {
        return m29512k(m29505d(view, i), m29505d(view, i2), f);
    }

    /* renamed from: m */
    public static int m29514m(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? c64.getColor(context, i) : typedValue.data;
    }
}

package p001o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public abstract class umb {
    /* renamed from: a */
    public static float m51780a(String[] strArr, int i) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* renamed from: b */
    public static String m51781b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    public static TimeInterpolator m51782c(String str) {
        if (!m51784e(str, "cubic-bezier")) {
            if (m51784e(str, ClientCookie.PATH_ATTR)) {
                return new PathInterpolator(e0d.m24040e(m51781b(str, ClientCookie.PATH_ATTR)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = m51781b(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(m51780a(strArrSplit, 0), m51780a(strArrSplit, 1), m51780a(strArrSplit, 2), m51780a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    /* renamed from: d */
    public static boolean m51783d(String str) {
        return m51784e(str, "cubic-bezier") || m51784e(str, ClientCookie.PATH_ATTR);
    }

    /* renamed from: e */
    public static boolean m51784e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    /* renamed from: f */
    public static int m51785f(Context context, int i, int i2) {
        return ota.m42659c(context, i, i2);
    }

    /* renamed from: g */
    public static TimeInterpolator m51786g(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return m51783d(strValueOf) ? m51782c(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    /* renamed from: h */
    public static z0g m51787h(Context context, int i, int i2) {
        TypedValue typedValueM42657a = ota.m42657a(context, i);
        TypedArray typedArrayObtainStyledAttributes = typedValueM42657a == null ? context.obtainStyledAttributes(null, ebe.MaterialSpring, 0, i2) : context.obtainStyledAttributes(typedValueM42657a.resourceId, ebe.MaterialSpring);
        z0g z0gVar = new z0g();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(ebe.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(ebe.MaterialSpring_damping, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            z0gVar.m58632h(f);
            z0gVar.m58630f(f2);
            return z0gVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

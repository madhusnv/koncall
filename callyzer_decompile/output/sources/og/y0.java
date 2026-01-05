package og;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import java.util.Locale;
import l4.C4367l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class y0 {
    /* renamed from: a */
    public static void m11051a(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* renamed from: b */
    public static void m11052b(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m11053c(int i10, int i11, int i12, String str) {
        if (i10 < i11) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i11 + ", " + i12 + "] (too low)");
        }
        if (i10 <= i12) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i11 + ", " + i12 + "] (too high)");
    }

    /* renamed from: d */
    public static void m11054d(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m11055e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* renamed from: f */
    public static void m11056f(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    public static ColorStateList m11057g(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListM11863a;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListM11863a = pg.s8.m11863a(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListM11863a;
    }

    /* renamed from: h */
    public static ColorStateList m11058h(Context context, C4367l c4367l, int i10) {
        int resourceId;
        ColorStateList colorStateListM11863a;
        TypedArray typedArray = (TypedArray) c4367l.f21922c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListM11863a = pg.s8.m11863a(context, resourceId)) == null) ? c4367l.m9140t(i10) : colorStateListM11863a;
    }

    /* renamed from: i */
    public static Drawable m11059i(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableM11864b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableM11864b = pg.s8.m11864b(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableM11864b;
    }

    /* renamed from: j */
    public static boolean m11060j(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}

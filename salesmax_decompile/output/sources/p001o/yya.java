package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* loaded from: classes3.dex */
public abstract class yya {
    /* renamed from: a */
    public static ColorStateList m58494a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM37352a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM37352a = lk0.m37352a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM37352a;
    }

    /* renamed from: b */
    public static ColorStateList m58495b(Context context, anh anhVar, int i) {
        int iM17539n;
        ColorStateList colorStateListM37352a;
        return (!anhVar.m17544s(i) || (iM17539n = anhVar.m17539n(i, 0)) == 0 || (colorStateListM37352a = lk0.m37352a(context, iM17539n)) == null) ? anhVar.m17528c(i) : colorStateListM37352a;
    }

    /* renamed from: c */
    public static int m58496c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    /* renamed from: d */
    public static int m58497d(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: e */
    public static Drawable m58498e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM37353b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM37353b = lk0.m37353b(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM37353b;
    }

    /* renamed from: f */
    public static float m58499f(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    /* renamed from: g */
    public static int m58500g(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: h */
    public static mgh m58501h(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new mgh(context, resourceId);
    }

    /* renamed from: i */
    public static int m58502i(Context context, int i, int i2) throws Resources.NotFoundException {
        if (i == 0) {
            return i2;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ebe.MaterialTextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(ebe.MaterialTextAppearance_lineHeight, typedValue);
        if (!value) {
            value = typedArrayObtainStyledAttributes.getValue(ebe.MaterialTextAppearance_android_lineHeight, typedValue);
        }
        typedArrayObtainStyledAttributes.recycle();
        return !value ? i2 : m58496c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    /* renamed from: j */
    public static int m58503j(Context context, int i, int i2) throws Resources.NotFoundException {
        if (i == 0) {
            return i2;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bbe.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(bbe.TextAppearance_android_textSize, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        return !value ? i2 : m58496c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    /* renamed from: k */
    public static boolean m58504k(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: l */
    public static boolean m58505l(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}

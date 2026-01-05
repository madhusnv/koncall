package p013o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import p009j.AbstractC3500a;
import pg.s8;
import u5.AbstractC7339a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a */
    public static final ThreadLocal f25658a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f25659b = {-16842910};

    /* renamed from: c */
    public static final int[] f25660c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f25661d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f25662e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f25663f = new int[0];

    /* renamed from: g */
    public static final int[] f25664g = new int[1];

    /* renamed from: a */
    public static void m10297a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC3500a.f18351h);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m10298b(Context context, int i10) {
        ColorStateList colorStateListM10300d = m10300d(context, i10);
        if (colorStateListM10300d != null && colorStateListM10300d.isStateful()) {
            return colorStateListM10300d.getColorForState(f25659b, colorStateListM10300d.getDefaultColor());
        }
        ThreadLocal threadLocal = f25658a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f6 = typedValue.getFloat();
        return AbstractC7339a.m13734d(m10299c(context, i10), Math.round(Color.alpha(r4) * f6));
    }

    /* renamed from: c */
    public static int m10299c(Context context, int i10) {
        int[] iArr = f25664g;
        iArr[0] = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m10300d(Context context, int i10) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f25664g;
        iArr[0] = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = s8.m11863a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

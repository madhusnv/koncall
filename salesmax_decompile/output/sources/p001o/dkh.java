package p001o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class dkh {

    /* renamed from: a */
    public static final ThreadLocal f20150a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f20151b = {-16842910};

    /* renamed from: c */
    public static final int[] f20152c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f20153d = {R.attr.state_activated};

    /* renamed from: e */
    public static final int[] f20154e = {R.attr.state_pressed};

    /* renamed from: f */
    public static final int[] f20155f = {R.attr.state_checked};

    /* renamed from: g */
    public static final int[] f20156g = {R.attr.state_selected};

    /* renamed from: h */
    public static final int[] f20157h = {-16842919, -16842908};

    /* renamed from: i */
    public static final int[] f20158i = new int[0];

    /* renamed from: j */
    public static final int[] f20159j = new int[1];

    /* renamed from: a */
    public static void m23377a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(bbe.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTheme_windowActionBar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m23378b(Context context, int i) {
        ColorStateList colorStateListM23381e = m23381e(context, i);
        if (colorStateListM23381e != null && colorStateListM23381e.isStateful()) {
            return colorStateListM23381e.getColorForState(f20151b, colorStateListM23381e.getDefaultColor());
        }
        TypedValue typedValueM23382f = m23382f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueM23382f, true);
        return m23380d(context, i, typedValueM23382f.getFloat());
    }

    /* renamed from: c */
    public static int m23379c(Context context, int i) {
        int[] iArr = f20159j;
        iArr[0] = i;
        anh anhVarM17524u = anh.m17524u(context, null, iArr);
        try {
            return anhVarM17524u.m17527b(0, 0);
        } finally {
            anhVarM17524u.m17546x();
        }
    }

    /* renamed from: d */
    public static int m23380d(Context context, int i, float f) {
        return ni3.m40624p(m23379c(context, i), Math.round(Color.alpha(r0) * f));
    }

    /* renamed from: e */
    public static ColorStateList m23381e(Context context, int i) {
        int[] iArr = f20159j;
        iArr[0] = i;
        anh anhVarM17524u = anh.m17524u(context, null, iArr);
        try {
            return anhVarM17524u.m17528c(0);
        } finally {
            anhVarM17524u.m17546x();
        }
    }

    /* renamed from: f */
    public static TypedValue m23382f() {
        ThreadLocal threadLocal = f20150a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}

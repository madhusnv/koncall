package p001o;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public abstract class gza {

    /* renamed from: a */
    public static final int[] f25994a = {R.attr.theme, z5e.theme};

    /* renamed from: b */
    public static final int[] f25995b = {x5e.materialThemeOverlay};

    /* renamed from: a */
    public static int m29677a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f25994a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    public static int[] m29678b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                iArr2[i3] = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    /* renamed from: c */
    public static int m29679c(Context context, AttributeSet attributeSet, int i, int i2) {
        return m29678b(context, attributeSet, f25995b, i, i2)[0];
    }

    /* renamed from: d */
    public static Context m29680d(Context context, AttributeSet attributeSet, int i, int i2) {
        return m29681e(context, attributeSet, i, i2, new int[0]);
    }

    /* renamed from: e */
    public static Context m29681e(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        int iM29679c = m29679c(context, attributeSet, i, i2);
        boolean z = (context instanceof i64) && ((i64) context).m31610c() == iM29679c;
        if (iM29679c == 0 || z) {
            return context;
        }
        i64 i64Var = new i64(context, iM29679c);
        for (int i3 : m29678b(context, attributeSet, iArr, i, i2)) {
            if (i3 != 0) {
                i64Var = new i64(i64Var, i3);
            }
        }
        int iM29677a = m29677a(context, attributeSet);
        if (iM29677a != 0) {
            i64Var.getTheme().applyStyle(iM29677a, true);
        }
        return i64Var;
    }
}

package p001o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes3.dex */
public abstract class bkh {

    /* renamed from: a */
    public static final int[] f16464a = {z5e.colorPrimary};

    /* renamed from: b */
    public static final int[] f16465b = {x5e.colorPrimaryVariant};

    /* renamed from: a */
    public static void m19297a(Context context) {
        m19301e(context, f16464a, "Theme.AppCompat");
    }

    /* renamed from: b */
    public static void m19298b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.ThemeEnforcement, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(ebe.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(x5e.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m19299c(context);
            }
        }
        m19297a(context);
    }

    /* renamed from: c */
    public static void m19299c(Context context) {
        m19301e(context, f16465b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    public static void m19300d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean zM19302f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.ThemeEnforcement, i, i2);
        if (!typedArrayObtainStyledAttributes.getBoolean(ebe.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zM19302f = typedArrayObtainStyledAttributes.getResourceId(ebe.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            zM19302f = m19302f(context, attributeSet, iArr, i, i2, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zM19302f) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    public static void m19301e(Context context, int[] iArr, String str) {
        if (m19304h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    public static boolean m19302f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i3, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    public static boolean m19303g(Context context) {
        return ota.m42658b(context, x5e.isMaterial3Theme, false);
    }

    /* renamed from: h */
    public static boolean m19304h(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: i */
    public static TypedArray m19305i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m19298b(context, attributeSet, i, i2);
        m19300d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: j */
    public static anh m19306j(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m19298b(context, attributeSet, i, i2);
        m19300d(context, attributeSet, iArr, i, i2, iArr2);
        return anh.m17525v(context, attributeSet, iArr, i, i2);
    }
}

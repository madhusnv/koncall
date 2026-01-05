package p001o;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes3.dex */
public abstract class gue {

    /* renamed from: a */
    public static final int[] f25805a = {R.attr.state_pressed};

    /* renamed from: b */
    public static final int[] f25806b = {R.attr.state_focused};

    /* renamed from: c */
    public static final int[] f25807c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d */
    public static final int[] f25808d = {R.attr.state_selected};

    /* renamed from: e */
    public static final int[] f25809e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f */
    public static final String f25810f = gue.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m29516a(ColorStateList colorStateList) {
        int[] iArr = f25806b;
        return new ColorStateList(new int[][]{f25808d, iArr, StateSet.NOTHING}, new int[]{m29518c(colorStateList, f25807c), m29518c(colorStateList, iArr), m29518c(colorStateList, f25805a)});
    }

    /* renamed from: b */
    public static int m29517b(int i) {
        return ni3.m40624p(i, Math.min(Color.alpha(i) * 2, Constants.MAX_HOST_LENGTH));
    }

    /* renamed from: c */
    public static int m29518c(ColorStateList colorStateList, int[] iArr) {
        return m29517b(colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0);
    }

    /* renamed from: d */
    public static ColorStateList m29519d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f25809e, 0));
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m29520e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}

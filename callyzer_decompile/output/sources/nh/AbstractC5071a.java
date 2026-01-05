package nh;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nh.a */
/* loaded from: classes.dex */
public abstract class AbstractC5071a {

    /* renamed from: a */
    public static final int[] f24867a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: a */
    public static ColorStateList m10006a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f24867a, 0));
        }
        return colorStateList;
    }
}

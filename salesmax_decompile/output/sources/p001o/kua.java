package p001o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* loaded from: classes3.dex */
public abstract class kua {
    /* renamed from: a */
    public static Rect m36245a(Context context, int i, int i2) {
        TypedArray typedArrayM19305i = bkh.m19305i(context, null, ebe.MaterialAlertDialog, i, i2, new int[0]);
        int dimensionPixelSize = typedArrayM19305i.getDimensionPixelSize(ebe.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(x6e.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayM19305i.getDimensionPixelSize(ebe.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(x6e.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayM19305i.getDimensionPixelSize(ebe.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(x6e.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayM19305i.getDimensionPixelSize(ebe.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(x6e.mtrl_alert_dialog_background_inset_bottom));
        typedArrayM19305i.recycle();
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int i3 = layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize;
        if (layoutDirection != 1) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(i3, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize4);
    }

    /* renamed from: b */
    public static InsetDrawable m36246b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}

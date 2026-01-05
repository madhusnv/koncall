package com.skydoves.balloon.extensions;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DrawableExtensionKt {
    public static final /* synthetic */ int getHeight(Drawable drawable) {
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0;
    }

    public static final int getIntrinsicHeight(Drawable[] drawableArr) {
        AbstractC4154l.m8923f(drawableArr, "<this>");
        int height = getHeight(drawableArr[0]);
        int height2 = getHeight(drawableArr[2]);
        return height < height2 ? height2 : height;
    }

    public static final /* synthetic */ int getSumOfIntrinsicWidth(Drawable[] drawableArr) {
        AbstractC4154l.m8923f(drawableArr, "<this>");
        return getWidth(drawableArr[2]) + getWidth(drawableArr[0]);
    }

    public static final /* synthetic */ int getWidth(Drawable drawable) {
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0;
    }

    public static final /* synthetic */ boolean isExistHorizontalDrawable(Drawable[] drawableArr) {
        AbstractC4154l.m8923f(drawableArr, "<this>");
        return (drawableArr[0] == null && drawableArr[2] == null) ? false : true;
    }

    public static final /* synthetic */ Drawable resize(Drawable drawable, Context context, Integer num, Integer num2) {
        AbstractC4154l.m8923f(drawable, "<this>");
        AbstractC4154l.m8923f(context, "context");
        if (num == null || num2 == null) {
            return drawable;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
        AbstractC4154l.m8922e(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, num.intValue(), num2.intValue());
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    public static final Drawable tint(Drawable drawable, Integer num) {
        AbstractC4154l.m8923f(drawable, "<this>");
        if (num != null) {
            drawable.setTintList(ColorStateList.valueOf(num.intValue()));
        }
        return drawable;
    }
}

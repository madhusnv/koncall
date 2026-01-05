package com.google.android.gms.cast.framework.media.widget;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.cast.internal.Logger;
import p001o.c64;
import p001o.fy5;
import p001o.ni3;

/* loaded from: classes5.dex */
public final class zzs {
    private static final Logger zza = new Logger("WidgetUtil");

    @TargetApi(17)
    public static Bitmap zza(Context context, Bitmap bitmap, float f, float f2) {
        Logger logger = zza;
        logger.m13795d("Begin blurring bitmap %s, original width = %d, original height = %d.", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        int iRound = Math.round(bitmap.getWidth() * 0.25f);
        int iRound2 = Math.round(bitmap.getHeight() * 0.25f);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, iRound2, false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, bitmapCreateScaledBitmap.getConfig());
        RenderScript renderScriptCreate = RenderScript.create(context);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, allocationCreateFromBitmap.getElement());
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.setRadius(7.5f);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmapCreateBitmap);
        renderScriptCreate.destroy();
        logger.m13795d("End blurring bitmap %s, original width = %d, original height = %d.", bitmapCreateScaledBitmap, Integer.valueOf(iRound), Integer.valueOf(iRound2));
        return bitmapCreateBitmap;
    }

    public static Drawable zzb(Context context, int i, int i2) {
        return zzd(context, i, i2, 0, R.color.white);
    }

    public static Drawable zzc(Context context, int i, int i2) {
        return zzd(context, i, i2, R.attr.colorForeground, 0);
    }

    private static Drawable zzd(Context context, int i, int i2, int i3, int i4) {
        int color;
        ColorStateList colorStateList;
        Drawable drawableM27744r = fy5.m27744r(context.getResources().getDrawable(i2).mutate());
        fy5.m27742p(drawableM27744r, PorterDuff.Mode.SRC_IN);
        if (i != 0) {
            colorStateList = c64.getColorStateList(context, i);
        } else {
            if (i3 != 0) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i3});
                color = typedArrayObtainStyledAttributes.getColor(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } else {
                color = c64.getColor(context, i4);
            }
            colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{color, ni3.m40624p(color, 128)});
        }
        fy5.m27741o(drawableM27744r, colorStateList);
        return drawableM27744r;
    }
}

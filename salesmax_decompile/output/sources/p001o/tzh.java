package p001o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes3.dex */
public abstract class tzh {
    /* renamed from: a */
    public static Typeface m50814a(Context context, Typeface typeface) {
        return m50815b(context.getResources().getConfiguration(), typeface);
    }

    /* renamed from: b */
    public static Typeface m50815b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, pza.m44556b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}

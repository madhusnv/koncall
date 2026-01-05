package com.skydoves.balloon.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC4154l;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ContextExtensionKt {
    public static final int contextColor(Context context, int i10) {
        AbstractC4154l.m8923f(context, "<this>");
        return context.getColor(i10);
    }

    public static final /* synthetic */ Drawable contextDrawable(Context context, int i10) {
        AbstractC4154l.m8923f(context, "<this>");
        return s8.m11864b(context, i10);
    }

    public static final /* synthetic */ float dimen(Context context, int i10) {
        AbstractC4154l.m8923f(context, "<this>");
        return context.getResources().getDimension(i10);
    }

    public static final /* synthetic */ int dimenPixel(Context context, int i10) {
        AbstractC4154l.m8923f(context, "<this>");
        return context.getResources().getDimensionPixelSize(i10);
    }

    public static final /* synthetic */ float px2Sp(Context context, float f6) {
        AbstractC4154l.m8923f(context, "<this>");
        return f6 / context.getResources().getDisplayMetrics().scaledDensity;
    }
}

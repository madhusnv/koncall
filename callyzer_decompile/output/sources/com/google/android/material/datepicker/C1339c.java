package com.google.android.material.datepicker;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import og.y0;
import ph.C5946a;
import ph.C5955j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C1339c {

    /* renamed from: a */
    public int f6845a;

    /* renamed from: b */
    public Object f6846b;

    /* renamed from: c */
    public Object f6847c;

    /* renamed from: d */
    public Object f6848d;

    /* renamed from: e */
    public Object f6849e;

    /* renamed from: f */
    public Object f6850f;

    /* renamed from: a */
    public static C1339c m4093a(Context context, int i10) {
        y0.m11051a("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, AbstractC0143a.f464m);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM11057g = y0.m11057g(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM11057g2 = y0.m11057g(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM11057g3 = y0.m11057g(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C5955j c5955jM9582a = C5955j.m11992a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C5946a(0)).m9582a();
        typedArrayObtainStyledAttributes.recycle();
        C1339c c1339c = new C1339c();
        y0.m11054d(rect.left);
        y0.m11054d(rect.top);
        y0.m11054d(rect.right);
        y0.m11054d(rect.bottom);
        c1339c.f6846b = rect;
        c1339c.f6847c = colorStateListM11057g2;
        c1339c.f6848d = colorStateListM11057g;
        c1339c.f6849e = colorStateListM11057g3;
        c1339c.f6845a = dimensionPixelSize;
        c1339c.f6850f = c5955jM9582a;
        return c1339c;
    }
}

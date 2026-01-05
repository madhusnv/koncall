package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p001o.bkh;
import p001o.ebe;
import p001o.gua;
import p001o.x5e;
import p001o.x6e;
import p001o.z5e;

/* loaded from: classes3.dex */
public final class LoadingIndicatorSpec {

    /* renamed from: a */
    public boolean f12705a;

    /* renamed from: b */
    public int f12706b;

    /* renamed from: c */
    public int f12707c;

    /* renamed from: d */
    public int f12708d;

    /* renamed from: e */
    public int[] f12709e;

    /* renamed from: f */
    public int f12710f;

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.loadingIndicatorStyle);
    }

    /* renamed from: a */
    public final void m14771a(Context context, TypedArray typedArray) throws Resources.NotFoundException {
        if (!typedArray.hasValue(ebe.LoadingIndicator_indicatorColor)) {
            this.f12709e = new int[]{gua.m29503b(context, z5e.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(ebe.LoadingIndicator_indicatorColor).type != 1) {
            this.f12709e = new int[]{typedArray.getColor(ebe.LoadingIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(ebe.LoadingIndicator_indicatorColor, -1));
        this.f12709e = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LoadingIndicator.f12702c);
    }

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        this.f12705a = false;
        this.f12709e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(x6e.m3_loading_indicator_shape_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(x6e.m3_loading_indicator_container_size);
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.LoadingIndicator, i, i2, new int[0]);
        this.f12706b = typedArrayM19305i.getDimensionPixelSize(ebe.LoadingIndicator_indicatorSize, dimensionPixelSize);
        this.f12707c = typedArrayM19305i.getDimensionPixelSize(ebe.LoadingIndicator_containerWidth, dimensionPixelSize2);
        this.f12708d = typedArrayM19305i.getDimensionPixelSize(ebe.LoadingIndicator_containerHeight, dimensionPixelSize2);
        m14771a(context, typedArrayM19305i);
        this.f12710f = typedArrayM19305i.getColor(ebe.LoadingIndicator_containerColor, 0);
        typedArrayM19305i.recycle();
    }
}

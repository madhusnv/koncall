package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p001o.bkh;
import p001o.ebe;
import p001o.je1;
import p001o.x5e;
import p001o.x6e;
import p001o.yya;

/* loaded from: classes3.dex */
public final class CircularProgressIndicatorSpec extends je1 {

    /* renamed from: o */
    public int f12815o;

    /* renamed from: p */
    public int f12816p;

    /* renamed from: q */
    public int f12817q;

    /* renamed from: r */
    public int f12818r;

    /* renamed from: s */
    public boolean f12819s;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f12814Q);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(x6e.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(x6e.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.CircularProgressIndicator, i, i2, new int[0]);
        this.f12815o = typedArrayM19305i.getInt(ebe.CircularProgressIndicator_indeterminateAnimationTypeCircular, 0);
        this.f12816p = Math.max(yya.m58497d(context, typedArrayM19305i, ebe.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f30233a * 2);
        this.f12817q = yya.m58497d(context, typedArrayM19305i, ebe.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f12818r = typedArrayM19305i.getInt(ebe.CircularProgressIndicator_indicatorDirectionCircular, 0);
        this.f12819s = typedArrayM19305i.getBoolean(ebe.CircularProgressIndicator_indeterminateTrackVisible, true);
        typedArrayM19305i.recycle();
        mo14912h();
    }
}

package com.razorpay;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.razorpay.a */
/* loaded from: classes6.dex */
final class C11896a extends Animation {

    /* renamed from: a */
    private int f13719a;

    /* renamed from: b */
    private int f13720b;

    /* renamed from: c */
    private View f13721c;

    public C11896a(View view, int i) {
        this.f13721c = view;
        this.f13719a = i;
        this.f13720b = view.getWidth();
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f13721c.getLayoutParams().width = this.f13720b + ((int) ((this.f13719a - r3) * f));
        this.f13721c.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}

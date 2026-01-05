package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import p001o.bkh;
import p001o.ebe;
import p001o.je1;
import p001o.x5e;

/* loaded from: classes3.dex */
public final class LinearProgressIndicatorSpec extends je1 {

    /* renamed from: o */
    public int f12821o;

    /* renamed from: p */
    public int f12822p;

    /* renamed from: q */
    public boolean f12823q;

    /* renamed from: r */
    public int f12824r;

    /* renamed from: s */
    public Integer f12825s;

    /* renamed from: t */
    public int f12826t;

    /* renamed from: u */
    public float f12827u;

    /* renamed from: v */
    public boolean f12828v;

    /* renamed from: w */
    public boolean f12829w;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.linearProgressIndicatorStyle);
    }

    @Override // p001o.je1
    /* renamed from: g */
    public boolean mo14911g() {
        return super.mo14911g() && m14913i() == m33607a();
    }

    @Override // p001o.je1
    /* renamed from: h */
    public void mo14912h() {
        super.mo14912h();
        if (this.f12824r < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f12821o == 0) {
            if ((m33607a() > 0 || (this.f12829w && m14913i() > 0)) && this.f30241i == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f30237e.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    /* renamed from: i */
    public int m14913i() {
        return !this.f12829w ? m33607a() : this.f12828v ? (int) (this.f30233a * this.f12827u) : this.f12826t;
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.f12820Q);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.LinearProgressIndicator, x5e.linearProgressIndicatorStyle, LinearProgressIndicator.f12820Q, new int[0]);
        this.f12821o = typedArrayM19305i.getInt(ebe.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f12822p = typedArrayM19305i.getInt(ebe.LinearProgressIndicator_indicatorDirectionLinear, 0);
        this.f12824r = Math.min(typedArrayM19305i.getDimensionPixelSize(ebe.LinearProgressIndicator_trackStopIndicatorSize, 0), this.f30233a);
        if (typedArrayM19305i.hasValue(ebe.LinearProgressIndicator_trackStopIndicatorPadding)) {
            this.f12825s = Integer.valueOf(typedArrayM19305i.getDimensionPixelSize(ebe.LinearProgressIndicator_trackStopIndicatorPadding, 0));
        }
        TypedValue typedValuePeekValue = typedArrayM19305i.peekValue(ebe.LinearProgressIndicator_trackInnerCornerRadius);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                this.f12826t = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayM19305i.getResources().getDisplayMetrics()), this.f30233a / 2);
                this.f12828v = false;
                this.f12829w = true;
            } else if (i3 == 6) {
                this.f12827u = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f12828v = true;
                this.f12829w = true;
            }
        }
        typedArrayM19305i.recycle();
        mo14912h();
        this.f12823q = this.f12822p == 1;
    }
}

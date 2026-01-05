package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p001o.je1;
import p001o.pae;
import p001o.uh8;
import p001o.w93;
import p001o.x5e;
import p001o.x93;
import p001o.xp5;
import p001o.y93;

/* loaded from: classes3.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* renamed from: Q */
    public static final int f12814Q = pae.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    public int getIndeterminateAnimationType() {
        return ((CircularProgressIndicatorSpec) this.f12798a).f12815o;
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f12798a).f12818r;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f12798a).f12817q;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f12798a).f12816p;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public CircularProgressIndicatorSpec mo14898i(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    /* renamed from: s */
    public final void m14908s() {
        w93 w93Var = new w93((CircularProgressIndicatorSpec) this.f12798a);
        setIndeterminateDrawable(uh8.m51571v(getContext(), (CircularProgressIndicatorSpec) this.f12798a, w93Var));
        setProgressDrawable(xp5.m56537A(getContext(), (CircularProgressIndicatorSpec) this.f12798a, w93Var));
    }

    public void setIndeterminateAnimationType(int i) {
        if (((CircularProgressIndicatorSpec) this.f12798a).f12815o == i) {
            return;
        }
        if (m14906q() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        je1 je1Var = this.f12798a;
        ((CircularProgressIndicatorSpec) je1Var).f12815o = i;
        ((CircularProgressIndicatorSpec) je1Var).mo14912h();
        getIndeterminateDrawable().m51573A(i == 1 ? new y93(getContext(), (CircularProgressIndicatorSpec) this.f12798a) : new x93((CircularProgressIndicatorSpec) this.f12798a));
        m14904o();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f12798a).f12818r = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        je1 je1Var = this.f12798a;
        if (((CircularProgressIndicatorSpec) je1Var).f12817q != i) {
            ((CircularProgressIndicatorSpec) je1Var).f12817q = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        je1 je1Var = this.f12798a;
        if (((CircularProgressIndicatorSpec) je1Var).f12816p != iMax) {
            ((CircularProgressIndicatorSpec) je1Var).f12816p = iMax;
            ((CircularProgressIndicatorSpec) je1Var).mo14912h();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f12798a).mo14912h();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f12814Q);
        m14908s();
    }
}

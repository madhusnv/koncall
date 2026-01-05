package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Objects;
import p001o.je1;
import p001o.oda;
import p001o.pae;
import p001o.pda;
import p001o.qda;
import p001o.uh8;
import p001o.x5e;
import p001o.xp5;

/* loaded from: classes3.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* renamed from: Q */
    public static final int f12820Q = pae.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f12798a).f12821o;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f12798a).f12822p;
    }

    public int getTrackInnerCornerRadius() {
        return ((LinearProgressIndicatorSpec) this.f12798a).f12826t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((LinearProgressIndicatorSpec) this.f12798a).f12825s;
    }

    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.f12798a).f12824r;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        je1 je1Var = this.f12798a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) je1Var;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) je1Var).f12822p != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) this.f12798a).f12822p != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) this.f12798a).f12822p != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.f12823q = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        uh8 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        xp5 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public LinearProgressIndicatorSpec mo14898i(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    /* renamed from: s */
    public final void m14910s() {
        oda odaVar = new oda((LinearProgressIndicatorSpec) this.f12798a);
        setIndeterminateDrawable(uh8.m51572w(getContext(), (LinearProgressIndicatorSpec) this.f12798a, odaVar));
        setProgressDrawable(xp5.m56538B(getContext(), (LinearProgressIndicatorSpec) this.f12798a, odaVar));
    }

    public void setIndeterminateAnimationType(int i) {
        if (((LinearProgressIndicatorSpec) this.f12798a).f12821o == i) {
            return;
        }
        if (m14906q() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        je1 je1Var = this.f12798a;
        ((LinearProgressIndicatorSpec) je1Var).f12821o = i;
        ((LinearProgressIndicatorSpec) je1Var).mo14912h();
        if (i == 0) {
            getIndeterminateDrawable().m51573A(new pda((LinearProgressIndicatorSpec) this.f12798a));
        } else {
            getIndeterminateDrawable().m51573A(new qda(getContext(), (LinearProgressIndicatorSpec) this.f12798a));
        }
        m14904o();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f12798a).mo14912h();
    }

    public void setIndicatorDirection(int i) {
        je1 je1Var = this.f12798a;
        ((LinearProgressIndicatorSpec) je1Var).f12822p = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) je1Var;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) this.f12798a).f12822p != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.f12823q = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i, boolean z) {
        je1 je1Var = this.f12798a;
        if (je1Var != null && ((LinearProgressIndicatorSpec) je1Var).f12821o == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i, z);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f12798a).mo14912h();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        je1 je1Var = this.f12798a;
        if (((LinearProgressIndicatorSpec) je1Var).f12826t != i) {
            ((LinearProgressIndicatorSpec) je1Var).f12826t = Math.round(Math.min(i, ((LinearProgressIndicatorSpec) je1Var).f30233a / 2.0f));
            je1 je1Var2 = this.f12798a;
            ((LinearProgressIndicatorSpec) je1Var2).f12828v = false;
            ((LinearProgressIndicatorSpec) je1Var2).f12829w = true;
            ((LinearProgressIndicatorSpec) je1Var2).mo14912h();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        je1 je1Var = this.f12798a;
        if (((LinearProgressIndicatorSpec) je1Var).f12827u != f) {
            ((LinearProgressIndicatorSpec) je1Var).f12827u = Math.min(f, 0.5f);
            je1 je1Var2 = this.f12798a;
            ((LinearProgressIndicatorSpec) je1Var2).f12828v = true;
            ((LinearProgressIndicatorSpec) je1Var2).f12829w = true;
            ((LinearProgressIndicatorSpec) je1Var2).mo14912h();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        if (Objects.equals(((LinearProgressIndicatorSpec) this.f12798a).f12825s, num)) {
            return;
        }
        ((LinearProgressIndicatorSpec) this.f12798a).f12825s = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        je1 je1Var = this.f12798a;
        if (((LinearProgressIndicatorSpec) je1Var).f12824r != i) {
            ((LinearProgressIndicatorSpec) je1Var).f12824r = Math.min(i, ((LinearProgressIndicatorSpec) je1Var).f30233a);
            ((LinearProgressIndicatorSpec) this.f12798a).mo14912h();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f12820Q);
        m14910s();
    }
}

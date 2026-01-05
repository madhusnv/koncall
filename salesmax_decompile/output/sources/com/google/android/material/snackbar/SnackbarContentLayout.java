package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p001o.gh0;
import p001o.gua;
import p001o.n8e;
import p001o.t54;
import p001o.umb;
import p001o.x5e;
import p001o.x6e;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements t54 {

    /* renamed from: a */
    public TextView f13001a;

    /* renamed from: b */
    public Button f13002b;

    /* renamed from: c */
    public final TimeInterpolator f13003c;

    /* renamed from: d */
    public int f13004d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    public static void m15186d(View view, int i, int i2) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    @Override // p001o.t54
    /* renamed from: a */
    public void mo15187a(int i, int i2) {
        this.f13001a.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.f13001a.animate().alpha(1.0f).setDuration(j).setInterpolator(this.f13003c).setStartDelay(j2).start();
        if (this.f13002b.getVisibility() == 0) {
            this.f13002b.setAlpha(0.0f);
            this.f13002b.animate().alpha(1.0f).setDuration(j).setInterpolator(this.f13003c).setStartDelay(j2).start();
        }
    }

    @Override // p001o.t54
    /* renamed from: b */
    public void mo15188b(int i, int i2) {
        this.f13001a.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.f13001a.animate().alpha(0.0f).setDuration(j).setInterpolator(this.f13003c).setStartDelay(j2).start();
        if (this.f13002b.getVisibility() == 0) {
            this.f13002b.setAlpha(1.0f);
            this.f13002b.animate().alpha(0.0f).setDuration(j).setInterpolator(this.f13003c).setStartDelay(j2).start();
        }
    }

    /* renamed from: c */
    public void m15189c(float f) {
        if (f != 1.0f) {
            this.f13002b.setTextColor(gua.m29512k(gua.m29505d(this, x5e.colorSurface), this.f13002b.getCurrentTextColor(), f));
        }
    }

    /* renamed from: e */
    public final boolean m15190e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f13001a.getPaddingTop() == i2 && this.f13001a.getPaddingBottom() == i3) {
            return z;
        }
        m15186d(this.f13001a, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f13002b;
    }

    public TextView getMessageView() {
        return this.f13001a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13001a = (TextView) findViewById(n8e.snackbar_text);
        this.f13002b = (Button) findViewById(n8e.snackbar_action);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        boolean z = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(x6e.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(x6e.design_snackbar_padding_vertical);
        Layout layout = this.f13001a.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f13004d <= 0 || this.f13002b.getMeasuredWidth() <= this.f13004d) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m15190e(0, dimensionPixelSize, dimensionPixelSize)) {
                z = false;
            }
        } else if (!m15190e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.f13004d = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13003c = umb.m51786g(context, x5e.motionEasingEmphasizedInterpolator, gh0.f25147b);
    }
}

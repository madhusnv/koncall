package com.google.android.material.snackbar;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a */
    public TextView f6935a;

    /* renamed from: b */
    public Button f6936b;

    /* renamed from: c */
    public final int f6937c;

    /* renamed from: d */
    public int f6938d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0143a.f472u);
        this.f6937c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f6938d = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final boolean m4115a(int i10, int i11, int i12) {
        boolean z6;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f6935a.getPaddingTop() == i11 && this.f6935a.getPaddingBottom() == i12) {
            return z6;
        }
        TextView textView = this.f6935a;
        Field field = v0.f5527a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i11, textView.getPaddingEnd(), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f6936b;
    }

    public TextView getMessageView() {
        return this.f6935a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6935a = (TextView) findViewById(R.id.snackbar_text);
        this.f6936b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        super.onMeasure(i10, i11);
        int i12 = this.f6937c;
        if (i12 > 0 && getMeasuredWidth() > i12) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            super.onMeasure(i10, i11);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z6 = this.f6935a.getLayout().getLineCount() > 1;
        if (!z6 || this.f6938d <= 0 || this.f6936b.getMeasuredWidth() <= this.f6938d) {
            if (!z6) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m4115a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m4115a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f6938d = i10;
    }
}

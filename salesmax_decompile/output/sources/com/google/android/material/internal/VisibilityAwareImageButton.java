package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a */
    public int f12701a;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public final void m14768b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f12701a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f12701a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m14768b(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12701a = getVisibility();
    }
}

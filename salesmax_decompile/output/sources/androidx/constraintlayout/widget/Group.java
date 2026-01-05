package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: j */
    public void mo5333j(ConstraintLayout constraintLayout) {
        m5594i(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: o */
    public void mo5306o(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo5306o(attributeSet);
        this.f6854e = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        m5593h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: r */
    public void mo5334r(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.v0.p1(0);
        layoutParams.v0.Q0(0);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m5593h();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m5593h();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

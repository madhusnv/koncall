package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import p001o.au3;
import p001o.by7;
import p001o.s8d;
import p001o.x0j;

/* loaded from: classes2.dex */
public class MotionPlaceholder extends VirtualLayout {

    /* renamed from: y */
    public s8d f6589y;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: o */
    public void mo5306o(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo5306o(attributeSet);
        this.f6853d = new s8d();
        m5601w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onMeasure(int i, int i2) {
        mo5311x(this.f6589y, i, i2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: v */
    public void mo5342v(au3 au3Var, by7 by7Var, SparseArray sparseArray) {
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    /* renamed from: x */
    public void mo5311x(x0j x0jVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (x0jVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            x0jVar.H1(mode, size, mode2, size2);
            setMeasuredDimension(x0jVar.C1(), x0jVar.B1());
        }
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

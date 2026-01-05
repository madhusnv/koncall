package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import p001o.mbe;

/* loaded from: classes2.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.InterfaceC1986i {

    /* renamed from: H */
    public View[] f6590H;

    /* renamed from: s */
    public boolean f6591s;

    /* renamed from: x */
    public boolean f6592x;

    /* renamed from: y */
    public float f6593y;

    public MotionHelper(Context context) {
        super(context);
        this.f6591s = false;
        this.f6592x = false;
    }

    /* renamed from: A */
    public void m5343A(MotionLayout motionLayout) {
    }

    /* renamed from: B */
    public void m5344B(Canvas canvas) {
    }

    /* renamed from: C */
    public void m5345C(Canvas canvas) {
    }

    /* renamed from: D */
    public void mo5339D(MotionLayout motionLayout, HashMap map) {
    }

    /* renamed from: a */
    public void mo5303a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    /* renamed from: b */
    public void mo5304b(MotionLayout motionLayout, int i) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1986i
    /* renamed from: c */
    public void mo5346c(MotionLayout motionLayout, int i, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1986i
    /* renamed from: d */
    public void mo5347d(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    public float getProgress() {
        return this.f6593y;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: o */
    public void mo5306o(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo5306o(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.MotionHelper_onShow) {
                    this.f6591s = typedArrayObtainStyledAttributes.getBoolean(index, this.f6591s);
                } else if (index == mbe.MotionHelper_onHide) {
                    this.f6592x = typedArrayObtainStyledAttributes.getBoolean(index, this.f6592x);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(View view, float f) {
    }

    /* renamed from: x */
    public boolean mo5341x() {
        return false;
    }

    /* renamed from: y */
    public boolean m5348y() {
        return this.f6592x;
    }

    /* renamed from: z */
    public boolean m5349z() {
        return this.f6591s;
    }

    public void setProgress(float f) {
        this.f6593y = f;
        int i = 0;
        if (this.f6851b > 0) {
            this.f6590H = m5598n((ConstraintLayout) getParent());
            while (i < this.f6851b) {
                setProgress(this.f6590H[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f6591s = false;
        this.f6592x = false;
        mo5306o(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, i);
        this.f6591s = false;
        this.f6592x = false;
        mo5306o(attributeSet);
    }
}

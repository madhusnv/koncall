package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.mbe;
import p001o.zt3;

/* loaded from: classes2.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: H */
    public ConstraintLayout f6579H;

    /* renamed from: L */
    public float f6580L;

    /* renamed from: M */
    public float f6581M;

    /* renamed from: Q */
    public float f6582Q;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public boolean m0;
    public View[] n0;
    public float o0;
    public float p0;
    public boolean q0;
    public boolean r0;

    /* renamed from: s */
    public float f6583s;

    /* renamed from: x */
    public float f6584x;

    /* renamed from: y */
    public float f6585y;

    public Layer(Context context) {
        super(context);
        this.f6583s = Float.NaN;
        this.f6584x = Float.NaN;
        this.f6585y = Float.NaN;
        this.f6580L = 1.0f;
        this.f6581M = 1.0f;
        this.f6582Q = Float.NaN;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        this.k0 = Float.NaN;
        this.l0 = Float.NaN;
        this.m0 = true;
        this.n0 = null;
        this.o0 = 0.0f;
        this.p0 = 0.0f;
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
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ConstraintLayout_Layout_android_visibility) {
                    this.q0 = true;
                } else if (index == mbe.ConstraintLayout_Layout_android_elevation) {
                    this.r0 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        this.f6579H = (ConstraintLayout) getParent();
        if (this.q0 || this.r0) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f6851b; i++) {
                View viewM5613q = this.f6579H.m5613q(this.f6850a[i]);
                if (viewM5613q != null) {
                    if (this.q0) {
                        viewM5613q.setVisibility(visibility);
                    }
                    if (this.r0 && elevation > 0.0f) {
                        viewM5613q.setTranslationZ(viewM5613q.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: r */
    public void mo5334r(ConstraintLayout constraintLayout) {
        m5337y();
        this.f6582Q = Float.NaN;
        this.h0 = Float.NaN;
        zt3 zt3VarM5623b = ((ConstraintLayout.LayoutParams) getLayoutParams()).m5623b();
        zt3VarM5623b.p1(0);
        zt3VarM5623b.Q0(0);
        m5336x();
        layout(((int) this.k0) - getPaddingLeft(), ((int) this.l0) - getPaddingTop(), ((int) this.i0) + getPaddingRight(), ((int) this.j0) + getPaddingBottom());
        m5338z();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m5593h();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.f6583s = f;
        m5338z();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f6584x = f;
        m5338z();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f6585y = f;
        m5338z();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f6580L = f;
        m5338z();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f6581M = f;
        m5338z();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.o0 = f;
        m5338z();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.p0 = f;
        m5338z();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m5593h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: t */
    public void mo5335t(ConstraintLayout constraintLayout) {
        this.f6579H = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f6585y = rotation;
        } else {
            if (Float.isNaN(this.f6585y)) {
                return;
            }
            this.f6585y = rotation;
        }
    }

    /* renamed from: x */
    public void m5336x() {
        if (this.f6579H == null) {
            return;
        }
        if (this.m0 || Float.isNaN(this.f6582Q) || Float.isNaN(this.h0)) {
            if (!Float.isNaN(this.f6583s) && !Float.isNaN(this.f6584x)) {
                this.h0 = this.f6584x;
                this.f6582Q = this.f6583s;
                return;
            }
            View[] viewArrM5598n = m5598n(this.f6579H);
            int left = viewArrM5598n[0].getLeft();
            int top = viewArrM5598n[0].getTop();
            int right = viewArrM5598n[0].getRight();
            int bottom = viewArrM5598n[0].getBottom();
            for (int i = 0; i < this.f6851b; i++) {
                View view = viewArrM5598n[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.i0 = right;
            this.j0 = bottom;
            this.k0 = left;
            this.l0 = top;
            if (Float.isNaN(this.f6583s)) {
                this.f6582Q = (left + right) / 2;
            } else {
                this.f6582Q = this.f6583s;
            }
            if (Float.isNaN(this.f6584x)) {
                this.h0 = (top + bottom) / 2;
            } else {
                this.h0 = this.f6584x;
            }
        }
    }

    /* renamed from: y */
    public final void m5337y() {
        int i;
        if (this.f6579H == null || (i = this.f6851b) == 0) {
            return;
        }
        View[] viewArr = this.n0;
        if (viewArr == null || viewArr.length != i) {
            this.n0 = new View[i];
        }
        for (int i2 = 0; i2 < this.f6851b; i2++) {
            this.n0[i2] = this.f6579H.m5613q(this.f6850a[i2]);
        }
    }

    /* renamed from: z */
    public final void m5338z() {
        if (this.f6579H == null) {
            return;
        }
        if (this.n0 == null) {
            m5337y();
        }
        m5336x();
        double radians = Float.isNaN(this.f6585y) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : Math.toRadians(this.f6585y);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.f6580L;
        float f2 = f * fCos;
        float f3 = this.f6581M;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f6851b; i++) {
            View view = this.n0[i];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f7 = left - this.f6582Q;
            float f8 = top - this.h0;
            float f9 = (((f2 * f7) + (f4 * f8)) - f7) + this.o0;
            float f10 = (((f7 * f5) + (f6 * f8)) - f8) + this.p0;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f6581M);
            view.setScaleX(this.f6580L);
            if (!Float.isNaN(this.f6585y)) {
                view.setRotation(this.f6585y);
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6583s = Float.NaN;
        this.f6584x = Float.NaN;
        this.f6585y = Float.NaN;
        this.f6580L = 1.0f;
        this.f6581M = 1.0f;
        this.f6582Q = Float.NaN;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        this.k0 = Float.NaN;
        this.l0 = Float.NaN;
        this.m0 = true;
        this.n0 = null;
        this.o0 = 0.0f;
        this.p0 = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6583s = Float.NaN;
        this.f6584x = Float.NaN;
        this.f6585y = Float.NaN;
        this.f6580L = 1.0f;
        this.f6581M = 1.0f;
        this.f6582Q = Float.NaN;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        this.k0 = Float.NaN;
        this.l0 = Float.NaN;
        this.m0 = true;
        this.n0 = null;
        this.o0 = 0.0f;
        this.p0 = 0.0f;
    }
}

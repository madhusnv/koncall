package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p001o.mbe;

/* loaded from: classes2.dex */
public class Constraints extends ViewGroup {

    /* renamed from: a */
    public C2005b f6937a;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: c */
    public final void m5631c() {
    }

    public C2005b getConstraintSet() {
        if (this.f6937a == null) {
            this.f6937a = new C2005b();
        }
        this.f6937a.m5684q(this);
        return this.f6937a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5631c();
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5631c();
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;
        public float J0;
        public float x0;
        public boolean y0;
        public float z0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.x0 = 1.0f;
            this.y0 = false;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.x0 = 1.0f;
            this.y0 = false;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ConstraintSet_android_alpha) {
                    this.x0 = typedArrayObtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == mbe.ConstraintSet_android_elevation) {
                    this.z0 = typedArrayObtainStyledAttributes.getFloat(index, this.z0);
                    this.y0 = true;
                } else if (index == mbe.ConstraintSet_android_rotationX) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == mbe.ConstraintSet_android_rotationY) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == mbe.ConstraintSet_android_rotation) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == mbe.ConstraintSet_android_scaleX) {
                    this.D0 = typedArrayObtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == mbe.ConstraintSet_android_scaleY) {
                    this.E0 = typedArrayObtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == mbe.ConstraintSet_android_transformPivotX) {
                    this.F0 = typedArrayObtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == mbe.ConstraintSet_android_transformPivotY) {
                    this.G0 = typedArrayObtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == mbe.ConstraintSet_android_translationX) {
                    this.H0 = typedArrayObtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == mbe.ConstraintSet_android_translationY) {
                    this.I0 = typedArrayObtainStyledAttributes.getFloat(index, this.I0);
                } else if (index == mbe.ConstraintSet_android_translationZ) {
                    this.J0 = typedArrayObtainStyledAttributes.getFloat(index, this.J0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

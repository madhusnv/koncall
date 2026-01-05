package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C2005b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import p001o.dy7;
import p001o.mbe;
import p001o.u37;
import p001o.x0j;
import p001o.zt3;

/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {

    /* renamed from: y */
    public u37 f6573y;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: o */
    public void mo5306o(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo5306o(attributeSet);
        this.f6573y = new u37();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ConstraintLayout_Layout_android_orientation) {
                    this.f6573y.I2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_android_padding) {
                    this.f6573y.N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_android_paddingStart) {
                    this.f6573y.S1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f6573y.P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f6573y.Q1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_android_paddingTop) {
                    this.f6573y.T1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_android_paddingRight) {
                    this.f6573y.R1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f6573y.O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f6573y.N2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f6573y.C2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f6573y.M2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f6573y.w2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f6573y.E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f6573y.y2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f6573y.G2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f6573y.A2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == mbe.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f6573y.v2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == mbe.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f6573y.D2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == mbe.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f6573y.x2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == mbe.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f6573y.F2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == mbe.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f6573y.K2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == mbe.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f6573y.z2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == mbe.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f6573y.J2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == mbe.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f6573y.B2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f6573y.L2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f6573y.H2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f6853d = this.f6573y;
        m5601w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onMeasure(int i, int i2) {
        mo5311x(this.f6573y, i, i2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: p */
    public void mo5309p(C2005b.a aVar, dy7 dy7Var, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        super.mo5309p(aVar, dy7Var, layoutParams, sparseArray);
        if (dy7Var instanceof u37) {
            u37 u37Var = (u37) dy7Var;
            int i = layoutParams.f6900Z;
            if (i != -1) {
                u37Var.I2(i);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo5310q(zt3 zt3Var, boolean z) {
        this.f6573y.y1(z);
    }

    public void setFirstHorizontalBias(float f) {
        this.f6573y.v2(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f6573y.w2(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f6573y.x2(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f6573y.y2(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f6573y.z2(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f6573y.A2(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f6573y.B2(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f6573y.C2(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f6573y.D2(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f6573y.E2(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f6573y.F2(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f6573y.G2(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f6573y.H2(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f6573y.I2(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f6573y.N1(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f6573y.O1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f6573y.Q1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f6573y.R1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f6573y.T1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f6573y.J2(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f6573y.K2(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f6573y.L2(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f6573y.M2(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f6573y.N2(i);
        requestLayout();
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

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

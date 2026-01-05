package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.C2005b;
import androidx.constraintlayout.widget.ConstraintLayout;
import p001o.au3;
import p001o.dy7;
import p001o.mbe;
import p001o.ya1;
import p001o.zt3;

/* loaded from: classes2.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: s */
    public int f6847s;

    /* renamed from: x */
    public int f6848x;

    /* renamed from: y */
    public ya1 f6849y;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f6849y.z1();
    }

    public int getMargin() {
        return this.f6849y.B1();
    }

    public int getType() {
        return this.f6847s;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: o */
    public void mo5306o(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo5306o(attributeSet);
        this.f6849y = new ya1();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == mbe.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f6849y.E1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == mbe.ConstraintLayout_Layout_barrierMargin) {
                    this.f6849y.G1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f6853d = this.f6849y;
        m5601w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: p */
    public void mo5309p(C2005b.a aVar, dy7 dy7Var, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        super.mo5309p(aVar, dy7Var, layoutParams, sparseArray);
        if (dy7Var instanceof ya1) {
            ya1 ya1Var = (ya1) dy7Var;
            m5589x(ya1Var, aVar.f6971e.h0, ((au3) dy7Var.m59835M()).V1());
            ya1Var.E1(aVar.f6971e.p0);
            ya1Var.G1(aVar.f6971e.i0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo5310q(zt3 zt3Var, boolean z) {
        m5589x(zt3Var, this.f6847s, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f6849y.E1(z);
    }

    public void setDpMargin(int i) {
        this.f6849y.G1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f6849y.G1(i);
    }

    public void setType(int i) {
        this.f6847s = i;
    }

    /* renamed from: x */
    public final void m5589x(zt3 zt3Var, int i, boolean z) {
        this.f6848x = i;
        if (z) {
            int i2 = this.f6847s;
            if (i2 == 5) {
                this.f6848x = 1;
            } else if (i2 == 6) {
                this.f6848x = 0;
            }
        } else {
            int i3 = this.f6847s;
            if (i3 == 5) {
                this.f6848x = 0;
            } else if (i3 == 6) {
                this.f6848x = 1;
            }
        }
        if (zt3Var instanceof ya1) {
            ((ya1) zt3Var).F1(this.f6848x);
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}

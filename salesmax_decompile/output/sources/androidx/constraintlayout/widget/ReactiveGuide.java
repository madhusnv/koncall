package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C2006c;
import androidx.constraintlayout.widget.ConstraintLayout;
import p001o.mbe;

/* loaded from: classes2.dex */
public class ReactiveGuide extends View implements C2006c.a {

    /* renamed from: a */
    public int f6942a;

    /* renamed from: b */
    public boolean f6943b;

    /* renamed from: c */
    public int f6944c;

    /* renamed from: d */
    public boolean f6945d;

    public ReactiveGuide(Context context) {
        super(context);
        this.f6942a = -1;
        this.f6943b = false;
        this.f6944c = 0;
        this.f6945d = true;
        super.setVisibility(8);
        m5635a(null);
    }

    /* renamed from: a */
    public final void m5635a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.ConstraintLayout_ReactiveGuide);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f6942a = typedArrayObtainStyledAttributes.getResourceId(index, this.f6942a);
                } else if (index == mbe.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f6943b = typedArrayObtainStyledAttributes.getBoolean(index, this.f6943b);
                } else if (index == mbe.f35122x2694048c) {
                    this.f6944c = typedArrayObtainStyledAttributes.getResourceId(index, this.f6944c);
                } else if (index == mbe.f35121xfdeff96) {
                    this.f6945d = typedArrayObtainStyledAttributes.getBoolean(index, this.f6945d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f6942a != -1) {
            ConstraintLayout.getSharedValues().m5716a(this.f6942a, this);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f6944c;
    }

    public int getAttributeId() {
        return this.f6942a;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f6943b = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f6944c = i;
    }

    public void setAttributeId(int i) {
        C2006c sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f6942a;
        if (i2 != -1) {
            sharedValues.m5717b(i2, this);
        }
        this.f6942a = i;
        if (i != -1) {
            sharedValues.m5716a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f6901a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f6902b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f6903c = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6942a = -1;
        this.f6943b = false;
        this.f6944c = 0;
        this.f6945d = true;
        super.setVisibility(8);
        m5635a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6942a = -1;
        this.f6943b = false;
        this.f6944c = 0;
        this.f6945d = true;
        super.setVisibility(8);
        m5635a(attributeSet);
    }
}

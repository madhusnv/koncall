package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p001o.mbe;
import p001o.x0j;

/* loaded from: classes2.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: s */
    public boolean f6946s;

    /* renamed from: x */
    public boolean f6947x;

    public VirtualLayout(Context context) {
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
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ConstraintLayout_Layout_android_visibility) {
                    this.f6946s = true;
                } else if (index == mbe.ConstraintLayout_Layout_android_elevation) {
                    this.f6947x = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        if (this.f6946s || this.f6947x) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f6851b; i++) {
                    View viewM5613q = constraintLayout.m5613q(this.f6850a[i]);
                    if (viewM5613q != null) {
                        if (this.f6946s) {
                            viewM5613q.setVisibility(visibility);
                        }
                        if (this.f6947x && elevation > 0.0f) {
                            viewM5613q.setTranslationZ(viewM5613q.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
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

    /* renamed from: x */
    public void mo5311x(x0j x0jVar, int i, int i2) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

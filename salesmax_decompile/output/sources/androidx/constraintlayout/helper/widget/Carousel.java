package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.C1988a;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;
import p001o.mbe;

/* loaded from: classes2.dex */
public class Carousel extends MotionHelper {

    /* renamed from: L */
    public final ArrayList f6564L;

    /* renamed from: M */
    public int f6565M;

    /* renamed from: Q */
    public int f6566Q;
    public MotionLayout h0;
    public int i0;
    public boolean j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public float o0;
    public int p0;
    public int q0;
    public int r0;
    public float s0;
    public int t0;
    public int u0;
    public int v0;
    public Runnable w0;

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a */
    public class RunnableC1976a implements Runnable {
        public RunnableC1976a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.h0.setProgress(0.0f);
            Carousel.this.m5302J();
            Carousel.m5300H(Carousel.this);
            int unused = Carousel.this.f6566Q;
            throw null;
        }
    }

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$b */
    public interface InterfaceC1977b {
    }

    public Carousel(Context context) {
        super(context);
        this.f6564L = new ArrayList();
        this.f6565M = 0;
        this.f6566Q = 0;
        this.i0 = -1;
        this.j0 = false;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = 0.9f;
        this.p0 = 0;
        this.q0 = 4;
        this.r0 = 1;
        this.s0 = 2.0f;
        this.t0 = -1;
        this.u0 = 200;
        this.v0 = -1;
        this.w0 = new RunnableC1976a();
    }

    /* renamed from: H */
    public static /* synthetic */ InterfaceC1977b m5300H(Carousel carousel) {
        carousel.getClass();
        return null;
    }

    /* renamed from: I */
    public final void m5301I(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.Carousel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.Carousel_carousel_firstView) {
                    this.i0 = typedArrayObtainStyledAttributes.getResourceId(index, this.i0);
                } else if (index == mbe.Carousel_carousel_backwardTransition) {
                    this.k0 = typedArrayObtainStyledAttributes.getResourceId(index, this.k0);
                } else if (index == mbe.Carousel_carousel_forwardTransition) {
                    this.l0 = typedArrayObtainStyledAttributes.getResourceId(index, this.l0);
                } else if (index == mbe.Carousel_carousel_emptyViewsBehavior) {
                    this.q0 = typedArrayObtainStyledAttributes.getInt(index, this.q0);
                } else if (index == mbe.Carousel_carousel_previousState) {
                    this.m0 = typedArrayObtainStyledAttributes.getResourceId(index, this.m0);
                } else if (index == mbe.Carousel_carousel_nextState) {
                    this.n0 = typedArrayObtainStyledAttributes.getResourceId(index, this.n0);
                } else if (index == mbe.Carousel_carousel_touchUp_dampeningFactor) {
                    this.o0 = typedArrayObtainStyledAttributes.getFloat(index, this.o0);
                } else if (index == mbe.Carousel_carousel_touchUpMode) {
                    this.r0 = typedArrayObtainStyledAttributes.getInt(index, this.r0);
                } else if (index == mbe.Carousel_carousel_touchUp_velocityThreshold) {
                    this.s0 = typedArrayObtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == mbe.Carousel_carousel_infinite) {
                    this.j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.j0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: J */
    public final void m5302J() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1986i
    /* renamed from: a */
    public void mo5303a(MotionLayout motionLayout, int i, int i2, float f) {
        this.v0 = i;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1986i
    /* renamed from: b */
    public void mo5304b(MotionLayout motionLayout, int i) {
        int i2 = this.f6566Q;
        this.f6565M = i2;
        if (i == this.n0) {
            this.f6566Q = i2 + 1;
        } else if (i == this.m0) {
            this.f6566Q = i2 - 1;
        }
        if (!this.j0) {
            throw null;
        }
        throw null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.f6566Q;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            this.f6564L.clear();
            for (int i = 0; i < this.f6851b; i++) {
                int i2 = this.f6850a[i];
                View viewM5613q = motionLayout.m5613q(i2);
                if (this.i0 == i2) {
                    this.p0 = i;
                }
                this.f6564L.add(viewM5613q);
            }
            this.h0 = motionLayout;
            if (this.r0 == 2) {
                C1988a.b bVarQ0 = motionLayout.q0(this.l0);
                if (bVarQ0 != null) {
                    bVarQ0.m5490G(5);
                }
                C1988a.b bVarQ02 = this.h0.q0(this.k0);
                if (bVarQ02 != null) {
                    bVarQ02.m5490G(5);
                }
            }
            m5302J();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6564L.clear();
    }

    public void setAdapter(InterfaceC1977b interfaceC1977b) {
    }

    public void setInfinite(boolean z) {
        this.j0 = z;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6564L = new ArrayList();
        this.f6565M = 0;
        this.f6566Q = 0;
        this.i0 = -1;
        this.j0 = false;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = 0.9f;
        this.p0 = 0;
        this.q0 = 4;
        this.r0 = 1;
        this.s0 = 2.0f;
        this.t0 = -1;
        this.u0 = 200;
        this.v0 = -1;
        this.w0 = new RunnableC1976a();
        m5301I(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6564L = new ArrayList();
        this.f6565M = 0;
        this.f6566Q = 0;
        this.i0 = -1;
        this.j0 = false;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = 0.9f;
        this.p0 = 0;
        this.q0 = 4;
        this.r0 = 1;
        this.s0 = 2.0f;
        this.t0 = -1;
        this.u0 = 200;
        this.v0 = -1;
        this.w0 = new RunnableC1976a();
        m5301I(context, attributeSet);
    }
}

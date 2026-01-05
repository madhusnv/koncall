package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import p001o.mbe;

/* loaded from: classes2.dex */
public class MotionTelltales extends MockView {

    /* renamed from: H */
    public MotionLayout f6842H;

    /* renamed from: L */
    public float[] f6843L;

    /* renamed from: M */
    public Matrix f6844M;

    /* renamed from: Q */
    public int f6845Q;
    public int h0;
    public float i0;

    /* renamed from: y */
    public Paint f6846y;

    public MotionTelltales(Context context) {
        super(context);
        this.f6846y = new Paint();
        this.f6843L = new float[2];
        this.f6844M = new Matrix();
        this.f6845Q = 0;
        this.h0 = -65281;
        this.i0 = 0.25f;
        m5588a(context, null);
    }

    /* renamed from: a */
    private void m5588a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.MotionTelltales);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.MotionTelltales_telltales_tailColor) {
                    this.h0 = typedArrayObtainStyledAttributes.getColor(index, this.h0);
                } else if (index == mbe.MotionTelltales_telltales_velocityMode) {
                    this.f6845Q = typedArrayObtainStyledAttributes.getInt(index, this.f6845Q);
                } else if (index == mbe.MotionTelltales_telltales_tailScale) {
                    this.i0 = typedArrayObtainStyledAttributes.getFloat(index, this.i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f6846y.setColor(this.h0);
        this.f6846y.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f6844M);
        if (this.f6842H == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f6842H = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f6842H.r0(this, f2, f, this.f6843L, this.f6845Q);
                this.f6844M.mapVectors(this.f6843L);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.f6843L;
                float f5 = fArr2[0];
                float f6 = this.i0;
                float f7 = f4 - (fArr2[1] * f6);
                this.f6844M.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f6846y);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f6811f = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6846y = new Paint();
        this.f6843L = new float[2];
        this.f6844M = new Matrix();
        this.f6845Q = 0;
        this.h0 = -65281;
        this.i0 = 0.25f;
        m5588a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6846y = new Paint();
        this.f6843L = new float[2];
        this.f6844M = new Matrix();
        this.f6845Q = 0;
        this.h0 = -65281;
        this.i0 = 0.25f;
        m5588a(context, attributeSet);
    }
}

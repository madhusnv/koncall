package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: a */
    public Path f12684a;

    /* renamed from: b */
    public float[] f12685b;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
        this.f12685b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* renamed from: a */
    public void m14747a() {
        this.f12684a = null;
        this.f12685b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        invalidate();
    }

    /* renamed from: b */
    public void m14748b(float f, float f2, float f3, float f4, float[] fArr) {
        m14750d(new RectF(f, f2, f3, f4), fArr);
    }

    /* renamed from: c */
    public void m14749c(Rect rect, float[] fArr) {
        m14748b(rect.left, rect.top, rect.right, rect.bottom, fArr);
    }

    /* renamed from: d */
    public void m14750d(RectF rectF, float[] fArr) {
        if (this.f12684a == null) {
            this.f12684a = new Path();
        }
        this.f12685b = fArr;
        this.f12684a.reset();
        this.f12684a.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.f12684a.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f12684a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f12684a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public void m14751e(float[] fArr) {
        m14748b(getLeft(), getTop(), getRight(), getBottom(), fArr);
    }

    public float[] getCornerRadii() {
        return this.f12685b;
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12685b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12685b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }
}

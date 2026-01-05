package lh;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p013o.b1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lh.e */
/* loaded from: classes.dex */
public abstract class AbstractC4469e extends b1 {

    /* renamed from: r */
    public Drawable f22275r;

    /* renamed from: s */
    public final Rect f22276s;

    /* renamed from: t */
    public final Rect f22277t;

    /* renamed from: v */
    public int f22278v;

    /* renamed from: w */
    public final boolean f22279w;

    /* renamed from: x */
    public boolean f22280x;

    public AbstractC4469e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f22276s = new Rect();
        this.f22277t = new Rect();
        this.f22278v = 119;
        this.f22279w = true;
        this.f22280x = false;
        AbstractC4475k.m9324a(context, attributeSet, 0, 0);
        int[] iArr = AbstractC0143a.f460i;
        AbstractC4475k.m9325b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f22278v = typedArrayObtainStyledAttributes.getInt(1, this.f22278v);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f22279w = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f22275r;
        if (drawable != null) {
            if (this.f22280x) {
                this.f22280x = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z6 = this.f22279w;
                Rect rect = this.f22276s;
                if (z6) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.f22278v;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f22277t;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f6, float f10) {
        super.drawableHotspotChanged(f6, f10);
        Drawable drawable = this.f22275r;
        if (drawable != null) {
            drawable.setHotspot(f6, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f22275r;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f22275r.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f22275r;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f22278v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22275r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p013o.b1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        this.f22280x = z6 | this.f22280x;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f22280x = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f22275r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f22275r);
            }
            this.f22275r = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f22278v == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f22278v != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f22278v = i10;
            if (i10 == 119 && this.f22275r != null) {
                this.f22275r.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f22275r;
    }
}

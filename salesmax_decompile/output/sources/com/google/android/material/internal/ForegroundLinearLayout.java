package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import org.objectweb.asm.Opcodes;
import p001o.bkh;
import p001o.ebe;

/* loaded from: classes3.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: Q */
    public Drawable f12690Q;
    public final Rect h0;
    public final Rect i0;
    public int j0;
    public boolean k0;
    public boolean l0;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f12690Q;
        if (drawable != null) {
            if (this.l0) {
                this.l0 = false;
                Rect rect = this.h0;
                Rect rect2 = this.i0;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.k0) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.j0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f12690Q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f12690Q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f12690Q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f12690Q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.j0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12690Q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.l0 = z | this.l0;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l0 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f12690Q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f12690Q);
            }
            this.f12690Q = drawable;
            this.l0 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.j0 == 119) {
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
    public void setForegroundGravity(int i) {
        if (this.j0 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.j0 = i;
            if (i == 119 && this.f12690Q != null) {
                this.f12690Q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12690Q;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h0 = new Rect();
        this.i0 = new Rect();
        this.j0 = Opcodes.DNEG;
        this.k0 = true;
        this.l0 = false;
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.ForegroundLinearLayout, i, 0, new int[0]);
        this.j0 = typedArrayM19305i.getInt(ebe.ForegroundLinearLayout_android_foregroundGravity, this.j0);
        Drawable drawable = typedArrayM19305i.getDrawable(ebe.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.k0 = typedArrayM19305i.getBoolean(ebe.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayM19305i.recycle();
    }
}

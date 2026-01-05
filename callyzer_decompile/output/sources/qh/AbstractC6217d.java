package qh;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c6.l0;
import c6.n0;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import lh.AbstractC4475k;
import og.y0;
import pg.m6;
import sh.AbstractC6844a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qh.d */
/* loaded from: classes.dex */
public abstract class AbstractC6217d extends FrameLayout {

    /* renamed from: f */
    public static final ViewOnTouchListenerC6216c f30200f = new ViewOnTouchListenerC6216c();

    /* renamed from: a */
    public int f30201a;

    /* renamed from: b */
    public final float f30202b;

    /* renamed from: c */
    public final float f30203c;

    /* renamed from: d */
    public ColorStateList f30204d;

    /* renamed from: e */
    public PorterDuff.Mode f30205e;

    public AbstractC6217d(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC6844a.m13042a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0143a.f472u);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            Field field = v0.f5527a;
            n0.m2459k(this, dimensionPixelSize);
        }
        this.f30201a = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f30202b = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(y0.m11057g(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC4475k.m9329f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f30203c = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f30200f);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(m6.m11787b(getBackgroundOverlayColorAlpha(), m6.m11786a(R.attr.colorSurface, this), m6.m11786a(R.attr.colorOnSurface, this)));
            ColorStateList colorStateList = this.f30204d;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            Field field2 = v0.f5527a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f30203c;
    }

    public int getAnimationMode() {
        return this.f30201a;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f30202b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Field field = v0.f5527a;
        l0.m2444c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
    }

    public void setAnimationMode(int i10) {
        this.f30201a = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f30204d != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f30204d);
            drawable.setTintMode(this.f30205e);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f30204d = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f30205e);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f30205e = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f30200f);
        super.setOnClickListener(onClickListener);
    }

    public void setOnAttachStateChangeListener(InterfaceC6214a interfaceC6214a) {
    }

    public void setOnLayoutChangeListener(InterfaceC6215b interfaceC6215b) {
    }
}

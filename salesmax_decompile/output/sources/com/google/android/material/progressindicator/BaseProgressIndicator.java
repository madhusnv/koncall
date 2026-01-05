package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import java.util.Arrays;
import p001o.bkh;
import p001o.dg0;
import p001o.ebe;
import p001o.ez5;
import p001o.gua;
import p001o.gza;
import p001o.je1;
import p001o.jh0;
import p001o.pae;
import p001o.uh8;
import p001o.xp5;
import p001o.yy5;
import p001o.z5e;

/* loaded from: classes3.dex */
public abstract class BaseProgressIndicator<S extends je1> extends ProgressBar {

    /* renamed from: M */
    public static final int f12795M = pae.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: H */
    public final dg0 f12796H;

    /* renamed from: L */
    public final dg0 f12797L;

    /* renamed from: a */
    public je1 f12798a;

    /* renamed from: b */
    public int f12799b;

    /* renamed from: c */
    public boolean f12800c;

    /* renamed from: d */
    public boolean f12801d;

    /* renamed from: e */
    public final int f12802e;

    /* renamed from: f */
    public final int f12803f;

    /* renamed from: g */
    public long f12804g;

    /* renamed from: h */
    public jh0 f12805h;

    /* renamed from: q */
    public boolean f12806q;

    /* renamed from: s */
    public int f12807s;

    /* renamed from: x */
    public final Runnable f12808x;

    /* renamed from: y */
    public final Runnable f12809y;

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$a */
    public class RunnableC11087a implements Runnable {
        public RunnableC11087a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.m14900k();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$b */
    public class RunnableC11088b implements Runnable {
        public RunnableC11088b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.m14899j();
            BaseProgressIndicator.this.f12804g = -1L;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$c */
    public class C11089c extends dg0 {
        public C11089c() {
        }

        @Override // p001o.dg0
        /* renamed from: b */
        public void mo14364b(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f12799b, BaseProgressIndicator.this.f12800c);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$d */
    public class C11090d extends dg0 {
        public C11090d() {
        }

        @Override // p001o.dg0
        /* renamed from: b */
        public void mo14364b(Drawable drawable) {
            super.mo14364b(drawable);
            if (BaseProgressIndicator.this.f12806q) {
                return;
            }
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setVisibility(baseProgressIndicator.f12807s);
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(gza.m29680d(context, attributeSet, i, f12795M), attributeSet, i);
        this.f12804g = -1L;
        this.f12806q = false;
        this.f12807s = 4;
        this.f12808x = new RunnableC11087a();
        this.f12809y = new RunnableC11088b();
        this.f12796H = new C11089c();
        this.f12797L = new C11090d();
        Context context2 = getContext();
        this.f12798a = mo14898i(context2, attributeSet);
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.BaseProgressIndicator, i, i2, new int[0]);
        this.f12802e = typedArrayM19305i.getInt(ebe.BaseProgressIndicator_showDelay, -1);
        this.f12803f = Math.min(typedArrayM19305i.getInt(ebe.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayM19305i.recycle();
        this.f12805h = new jh0();
        this.f12801d = true;
    }

    private ez5 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m51584y();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().m56547D();
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f12798a.f30240h;
    }

    public int[] getIndicatorColor() {
        return this.f12798a.f30237e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f12798a.f30241i;
    }

    public int getShowAnimationBehavior() {
        return this.f12798a.f30239g;
    }

    public int getTrackColor() {
        return this.f12798a.f30238f;
    }

    public int getTrackCornerRadius() {
        return this.f12798a.f30234b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f12798a.f30235c;
    }

    public int getTrackThickness() {
        return this.f12798a.f30233a;
    }

    public int getWaveAmplitude() {
        return this.f12798a.f30244l;
    }

    public int getWaveSpeed() {
        return this.f12798a.f30245m;
    }

    public int getWavelengthDeterminate() {
        return this.f12798a.f30242j;
    }

    public int getWavelengthIndeterminate() {
        return this.f12798a.f30243k;
    }

    /* renamed from: h */
    public void m14897h(boolean z) {
        if (this.f12801d) {
            ((yy5) getCurrentDrawable()).mo51580s(m14906q(), false, z);
        }
    }

    /* renamed from: i */
    public abstract je1 mo14898i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* renamed from: j */
    public final void m14899j() {
        ((yy5) getCurrentDrawable()).mo51580s(false, false, true);
        if (m14902m()) {
            setVisibility(4);
        }
    }

    /* renamed from: k */
    public final void m14900k() {
        if (this.f12803f > 0) {
            this.f12804g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: l */
    public boolean m14901l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m14902m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    /* renamed from: n */
    public final void m14903n() {
        m14904o();
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo51579o(this.f12797L);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo51579o(this.f12797L);
        }
    }

    /* renamed from: o */
    public void m14904o() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().m51583x().mo43473d(this.f12796H);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m14903n();
        if (m14906q()) {
            m14900k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f12809y);
        removeCallbacks(this.f12808x);
        ((yy5) getCurrentDrawable()).mo51576j();
        m14905p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().mo25868g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        ez5 currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        setMeasuredDimension(currentDrawingDelegate.mo25867f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.mo25867f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.mo25866e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.mo25866e() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m14897h(i == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m14897h(false);
    }

    /* renamed from: p */
    public final void m14905p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo51582u(this.f12797L);
            getIndeterminateDrawable().m51583x().mo43476h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo51582u(this.f12797L);
        }
    }

    /* renamed from: q */
    public boolean m14906q() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && m14901l();
    }

    public void setAnimatorDurationScaleProvider(jh0 jh0Var) {
        this.f12805h = jh0Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f56260c = jh0Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f56260c = jh0Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f12798a.f30240h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        yy5 yy5Var = (yy5) getCurrentDrawable();
        if (yy5Var != null) {
            yy5Var.mo51576j();
        }
        super.setIndeterminate(z);
        yy5 yy5Var2 = (yy5) getCurrentDrawable();
        if (yy5Var2 != null) {
            yy5Var2.mo51580s(m14906q(), false, false);
        }
        if ((yy5Var2 instanceof uh8) && m14906q()) {
            ((uh8) yy5Var2).m51583x().mo43475g();
        }
        this.f12806q = false;
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        je1 je1Var = this.f12798a;
        if (je1Var.f30246n != f) {
            je1Var.f30246n = f;
            getIndeterminateDrawable().m51583x().mo43472c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof uh8)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((yy5) drawable).mo51576j();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{gua.m29503b(getContext(), z5e.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f12798a.f30237e = iArr;
        getIndeterminateDrawable().m51583x().mo43472c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        je1 je1Var = this.f12798a;
        if (je1Var.f30241i != i) {
            je1Var.f30241i = i;
            je1Var.mo14912h();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i, false);
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f12799b = i;
            this.f12800c = z;
            this.f12806q = true;
            if (!getIndeterminateDrawable().isVisible() || this.f12805h.m33830a(getContext().getContentResolver()) == 0.0f) {
                this.f12796H.mo14364b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().m51583x().mo43474f();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof xp5)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            xp5 xp5Var = (xp5) drawable;
            xp5Var.mo51576j();
            super.setProgressDrawable(xp5Var);
            xp5Var.m56555N(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f12798a.f30239g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        je1 je1Var = this.f12798a;
        if (je1Var.f30238f != i) {
            je1Var.f30238f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        je1 je1Var = this.f12798a;
        if (je1Var.f30234b != i) {
            je1Var.f30234b = Math.min(i, je1Var.f30233a / 2);
            this.f12798a.f30236d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        je1 je1Var = this.f12798a;
        if (je1Var.f30235c != f) {
            je1Var.f30235c = Math.min(f, 0.5f);
            this.f12798a.f30236d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        je1 je1Var = this.f12798a;
        if (je1Var.f30233a != i) {
            je1Var.f30233a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f12807s = i;
    }

    public void setWaveAmplitude(int i) {
        je1 je1Var = this.f12798a;
        if (je1Var.f30244l != i) {
            je1Var.f30244l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i) {
        this.f12798a.f30245m = i;
        getProgressDrawable().m56553L(this.f12798a.f30245m != 0);
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        je1 je1Var = this.f12798a;
        if (je1Var.f30242j != i) {
            je1Var.f30242j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        je1 je1Var = this.f12798a;
        if (je1Var.f30243k != i) {
            je1Var.f30243k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public uh8 getIndeterminateDrawable() {
        return (uh8) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public xp5 getProgressDrawable() {
        return (xp5) super.getProgressDrawable();
    }
}

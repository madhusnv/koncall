package com.google.android.material.loadingindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import java.util.Arrays;
import p001o.eha;
import p001o.fha;
import p001o.gua;
import p001o.gza;
import p001o.jh0;
import p001o.pae;
import p001o.x5e;
import p001o.z5e;

/* loaded from: classes3.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {

    /* renamed from: c */
    public static final int f12702c = pae.Widget_Material3_LoadingIndicator;

    /* renamed from: a */
    public final eha f12703a;

    /* renamed from: b */
    public final LoadingIndicatorSpec f12704b;

    public LoadingIndicator(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public boolean m14769a() {
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

    /* renamed from: b */
    public boolean m14770b() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && m14769a();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    public int getContainerColor() {
        return this.f12704b.f12710f;
    }

    public int getContainerHeight() {
        return this.f12704b.f12708d;
    }

    public int getContainerWidth() {
        return this.f12704b.f12707c;
    }

    public eha getDrawable() {
        return this.f12703a;
    }

    public int[] getIndicatorColor() {
        return this.f12704b.f12709e;
    }

    public int getIndicatorSize() {
        return this.f12704b.f12706b;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        this.f12703a.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        fha fhaVarM25057c = this.f12703a.m25057c();
        int iM26702e = fhaVarM25057c.m26702e() + getPaddingLeft() + getPaddingRight();
        int iM26701d = fhaVarM25057c.m26701d() + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(size, iM26702e), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(iM26702e, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, iM26701d), 1073741824);
        } else if (mode2 == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(iM26701d, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12703a.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f12703a.m25059e(m14770b(), false, i == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f12703a.m25059e(m14770b(), false, i == 0);
    }

    public void setAnimatorDurationScaleProvider(jh0 jh0Var) {
        this.f12703a.f21683a = jh0Var;
    }

    public void setContainerColor(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f12704b;
        if (loadingIndicatorSpec.f12710f != i) {
            loadingIndicatorSpec.f12710f = i;
            invalidate();
        }
    }

    public void setContainerHeight(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f12704b;
        if (loadingIndicatorSpec.f12708d != i) {
            loadingIndicatorSpec.f12708d = i;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f12704b;
        if (loadingIndicatorSpec.f12707c != i) {
            loadingIndicatorSpec.f12707c = i;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{gua.m29503b(getContext(), z5e.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f12704b.f12709e = iArr;
        this.f12703a.m25056b().m23104h();
        invalidate();
    }

    public void setIndicatorSize(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f12704b;
        if (loadingIndicatorSpec.f12706b != i) {
            loadingIndicatorSpec.f12706b = i;
            requestLayout();
            invalidate();
        }
    }

    public LoadingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.loadingIndicatorStyle);
    }

    public LoadingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(gza.m29680d(context, attributeSet, i, f12702c), attributeSet, i);
        Context context2 = getContext();
        eha ehaVarM25055a = eha.m25055a(context2, new LoadingIndicatorSpec(context2, attributeSet, i));
        this.f12703a = ehaVarM25055a;
        ehaVarM25055a.setCallback(this);
        this.f12704b = ehaVarM25055a.m25057c().f23334a;
        setAnimatorDurationScaleProvider(new jh0());
    }
}

package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.C10884a;
import p001o.cbe;
import p001o.tpf;

/* loaded from: classes5.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a */
    public final Paint f11798a;

    /* renamed from: b */
    public final tpf f11799b;

    /* renamed from: c */
    public boolean f11800c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.f11798a = new Paint();
        this.f11799b = new tpf();
        this.f11800c = true;
        m13581a(context, null);
    }

    /* renamed from: a */
    public final void m13581a(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.f11799b.setCallback(this);
        if (attributeSet == null) {
            m13582b(new C10884a.a().m13592a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cbe.ShimmerFrameLayout, 0, 0);
        try {
            m13582b(((typedArrayObtainStyledAttributes.hasValue(cbe.ShimmerFrameLayout_shimmer_colored) && typedArrayObtainStyledAttributes.getBoolean(cbe.ShimmerFrameLayout_shimmer_colored, false)) ? new C10884a.c() : new C10884a.a()).mo13593c(typedArrayObtainStyledAttributes).m13592a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public ShimmerFrameLayout m13582b(C10884a c10884a) {
        this.f11799b.m50289d(c10884a);
        if (c10884a == null || !c10884a.f11815o) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f11798a);
        }
        return this;
    }

    /* renamed from: c */
    public void m13583c() {
        this.f11799b.m50290e();
    }

    /* renamed from: d */
    public void m13584d() {
        this.f11799b.m50291f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f11800c) {
            this.f11799b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11799b.m50287b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m13584d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f11799b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11799b;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11798a = new Paint();
        this.f11799b = new tpf();
        this.f11800c = true;
        m13581a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11798a = new Paint();
        this.f11799b = new tpf();
        this.f11800c = true;
        m13581a(context, attributeSet);
    }
}

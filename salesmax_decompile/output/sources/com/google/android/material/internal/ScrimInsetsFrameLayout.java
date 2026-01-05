package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p001o.bkh;
import p001o.cbc;
import p001o.ebe;
import p001o.pae;
import p001o.r9j;
import p001o.wvi;

/* loaded from: classes3.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a */
    public Drawable f12692a;

    /* renamed from: b */
    public Rect f12693b;

    /* renamed from: c */
    public Rect f12694c;

    /* renamed from: d */
    public boolean f12695d;

    /* renamed from: e */
    public boolean f12696e;

    /* renamed from: f */
    public boolean f12697f;

    /* renamed from: g */
    public boolean f12698g;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    public class C11070a implements cbc {
        public C11070a() {
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f12693b == null) {
                scrimInsetsFrameLayout.f12693b = new Rect();
            }
            ScrimInsetsFrameLayout.this.f12693b.set(r9jVar.m46395j(), r9jVar.m46397l(), r9jVar.m46396k(), r9jVar.m46394i());
            ScrimInsetsFrameLayout.this.mo14767e(r9jVar);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!r9jVar.m46398m() || ScrimInsetsFrameLayout.this.f12692a == null);
            ScrimInsetsFrameLayout.this.postInvalidateOnAnimation();
            return r9jVar.m46388c();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f12693b == null || this.f12692a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f12695d) {
            this.f12694c.set(0, 0, width, this.f12693b.top);
            this.f12692a.setBounds(this.f12694c);
            this.f12692a.draw(canvas);
        }
        if (this.f12696e) {
            this.f12694c.set(0, height - this.f12693b.bottom, width, height);
            this.f12692a.setBounds(this.f12694c);
            this.f12692a.draw(canvas);
        }
        if (this.f12697f) {
            Rect rect = this.f12694c;
            Rect rect2 = this.f12693b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f12692a.setBounds(this.f12694c);
            this.f12692a.draw(canvas);
        }
        if (this.f12698g) {
            Rect rect3 = this.f12694c;
            Rect rect4 = this.f12693b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f12692a.setBounds(this.f12694c);
            this.f12692a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public void mo14767e(r9j r9jVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f12692a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f12692a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f12696e = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.f12697f = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.f12698g = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f12695d = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f12692a = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12694c = new Rect();
        this.f12695d = true;
        this.f12696e = true;
        this.f12697f = true;
        this.f12698g = true;
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.ScrimInsetsFrameLayout, i, pae.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f12692a = typedArrayM19305i.getDrawable(ebe.ScrimInsetsFrameLayout_insetForeground);
        typedArrayM19305i.recycle();
        setWillNotDraw(true);
        wvi.x0(this, new C11070a());
    }
}

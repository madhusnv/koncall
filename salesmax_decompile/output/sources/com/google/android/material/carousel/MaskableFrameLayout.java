package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.material.carousel.MaskableFrameLayout;
import p001o.ca3;
import p001o.gh0;
import p001o.n74;
import p001o.nc2;
import p001o.o6;
import p001o.pza;
import p001o.rlf;
import p001o.slf;
import p001o.tbc;
import p001o.ykf;
import p001o.ysa;

/* loaded from: classes3.dex */
public class MaskableFrameLayout extends FrameLayout implements ysa, rlf {

    /* renamed from: a */
    public float f12276a;

    /* renamed from: b */
    public final RectF f12277b;

    /* renamed from: c */
    public final Rect f12278c;

    /* renamed from: d */
    public ykf f12279d;

    /* renamed from: e */
    public final slf f12280e;

    /* renamed from: f */
    public Boolean f12281f;

    /* renamed from: g */
    public View.OnHoverListener f12282g;

    /* renamed from: h */
    public boolean f12283h;

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m14281c(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* renamed from: d */
    public static /* synthetic */ n74 m14282d(n74 n74Var) {
        return n74Var instanceof o6 ? ca3.m20545b((o6) n74Var) : n74Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f12280e.m48493e(canvas, new nc2.InterfaceC15542a() { // from class: o.zsa
            @Override // p001o.nc2.InterfaceC15542a
            /* renamed from: a */
            public final void mo40312a(Canvas canvas2) {
                this.f57599a.m14281c(canvas2);
            }
        });
    }

    /* renamed from: e */
    public final void m14283e() {
        this.f12280e.m48494f(this, this.f12277b);
    }

    /* renamed from: f */
    public final void m14284f() {
        if (this.f12276a != -1.0f) {
            float fM28648b = gh0.m28648b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f12276a);
            setMaskRectF(new RectF(fM28648b, 0.0f, getWidth() - fM28648b, getHeight()));
        }
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.f12277b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public RectF getMaskRectF() {
        return this.f12277b;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.f12276a;
    }

    public ykf getShapeAppearanceModel() {
        return this.f12279d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f12281f;
        if (bool != null) {
            this.f12280e.m48496h(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f12281f = Boolean.valueOf(this.f12280e.m48491c());
        this.f12280e.m48496h(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.f12277b.isEmpty() && (action == 9 || action == 10 || action == 7)) {
            if (!this.f12277b.contains(motionEvent.getX(), motionEvent.getY())) {
                if (this.f12283h && this.f12282g != null) {
                    motionEvent.setAction(10);
                    this.f12282g.onHover(this, motionEvent);
                }
                this.f12283h = false;
                return false;
            }
        }
        if (this.f12282g != null) {
            if (!this.f12283h && action == 7) {
                motionEvent.setAction(9);
                this.f12283h = true;
            }
            if (action == 7 || action == 9) {
                this.f12283h = true;
            }
            this.f12282g.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.getBoundsInScreen(this.f12278c);
        if (getX() > 0.0f) {
            this.f12278c.left = (int) (r0.left + this.f12277b.left);
        }
        if (getY() > 0.0f) {
            this.f12278c.top = (int) (r0.top + this.f12277b.top);
        }
        Rect rect = this.f12278c;
        rect.right = rect.left + Math.round(this.f12277b.width());
        Rect rect2 = this.f12278c;
        rect2.bottom = rect2.top + Math.round(this.f12277b.height());
        accessibilityNodeInfo.setBoundsInScreen(this.f12278c);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f12277b.isEmpty()) {
            if (!this.f12277b.contains(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f12276a != -1.0f) {
            m14284f();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f12277b.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.f12277b.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setForceCompatClipping(boolean z) {
        this.f12280e.m48496h(this, z);
    }

    @Override // p001o.ysa
    public void setMaskRectF(RectF rectF) {
        this.f12277b.set(rectF);
        m14283e();
    }

    @Deprecated
    public void setMaskXPercentage(float f) {
        float fM44555a = pza.m44555a(f, 0.0f, 1.0f);
        if (this.f12276a != fM44555a) {
            this.f12276a = fM44555a;
            m14284f();
        }
    }

    @Override // android.view.View
    public void setOnHoverListener(View.OnHoverListener onHoverListener) {
        this.f12282g = onHoverListener;
    }

    public void setOnMaskChangedListener(tbc tbcVar) {
    }

    @Override // p001o.rlf
    public void setShapeAppearanceModel(ykf ykfVar) {
        ykf ykfVarM57946z = ykfVar.m57946z(new ykf.InterfaceC18427c() { // from class: o.ata
            @Override // p001o.ykf.InterfaceC18427c
            /* renamed from: a */
            public final n74 mo17823a(n74 n74Var) {
                return MaskableFrameLayout.m14282d(n74Var);
            }
        });
        this.f12279d = ykfVarM57946z;
        this.f12280e.m48495g(this, ykfVarM57946z);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12276a = -1.0f;
        this.f12277b = new RectF();
        this.f12278c = new Rect();
        this.f12280e = slf.m48489a(this);
        this.f12281f = null;
        this.f12283h = false;
        setShapeAppearanceModel(ykf.m57926f(context, attributeSet, i, 0, 0).m57970m());
    }
}

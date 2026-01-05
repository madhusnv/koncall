package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.material.circularreveal.InterfaceC11004c;

/* loaded from: classes3.dex */
public class CircularRevealRelativeLayout extends RelativeLayout implements InterfaceC11004c {

    /* renamed from: a */
    public final C11003b f12361a;

    public CircularRevealRelativeLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    /* renamed from: a */
    public void mo14416a() {
        this.f12361a.m14422a();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    /* renamed from: b */
    public void mo14417b() {
        this.f12361a.m14423b();
    }

    @Override // com.google.android.material.circularreveal.C11003b.a
    /* renamed from: c */
    public void mo14418c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.C11003b.a
    /* renamed from: d */
    public boolean mo14419d() {
        return super.isOpaque();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C11003b c11003b = this.f12361a;
        if (c11003b != null) {
            c11003b.m14424c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f12361a.m14426e();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    public int getCircularRevealScrimColor() {
        return this.f12361a.m14427f();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    public InterfaceC11004c.e getRevealInfo() {
        return this.f12361a.m14429h();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C11003b c11003b = this.f12361a;
        return c11003b != null ? c11003b.m14431j() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f12361a.m14432k(drawable);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    public void setCircularRevealScrimColor(int i) {
        this.f12361a.m14433l(i);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    public void setRevealInfo(InterfaceC11004c.e eVar) {
        this.f12361a.m14434m(eVar);
    }

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12361a = new C11003b(this);
    }
}

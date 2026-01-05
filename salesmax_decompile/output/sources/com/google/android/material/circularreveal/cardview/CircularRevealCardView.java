package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.C11003b;
import com.google.android.material.circularreveal.InterfaceC11004c;

/* loaded from: classes3.dex */
public class CircularRevealCardView extends MaterialCardView implements InterfaceC11004c {
    public final C11003b i0;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    /* renamed from: a */
    public void mo14416a() {
        this.i0.m14422a();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    /* renamed from: b */
    public void mo14417b() {
        this.i0.m14423b();
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
        C11003b c11003b = this.i0;
        if (c11003b != null) {
            c11003b.m14424c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.i0.m14426e();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    public int getCircularRevealScrimColor() {
        return this.i0.m14427f();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    public InterfaceC11004c.e getRevealInfo() {
        return this.i0.m14429h();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C11003b c11003b = this.i0;
        return c11003b != null ? c11003b.m14431j() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.i0.m14432k(drawable);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    public void setCircularRevealScrimColor(int i) {
        this.i0.m14433l(i);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC11004c
    public void setRevealInfo(InterfaceC11004c.e eVar) {
        this.i0.m14434m(eVar);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i0 = new C11003b(this);
    }
}

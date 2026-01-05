package com.skydoves.balloon.radius;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.skydoves.balloon.internals.DefinitionKt;
import com.skydoves.balloon.internals.ViewPropertyDelegate;
import com.skydoves.balloon.internals.ViewPropertyKt;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4156n;
import kotlin.jvm.internal.a0;
import lx.InterfaceC4574m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RadiusLayout extends FrameLayout {
    static final /* synthetic */ InterfaceC4574m[] $$delegatedProperties;
    private final Path path;
    private final ViewPropertyDelegate radius$delegate;

    static {
        C4156n c4156n = new C4156n(RadiusLayout.class, "radius", "getRadius()F", 0);
        a0.f21154a.getClass();
        $$delegatedProperties = new InterfaceC4574m[]{c4156n};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadiusLayout(Context context) {
        this(context, null, 0, 6, null);
        AbstractC4154l.m8923f(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        AbstractC4154l.m8923f(canvas, "canvas");
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
    }

    public final float getRadius() {
        return ((Number) this.radius$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.path.addRoundRect(new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, i10, i11), getRadius(), getRadius(), Path.Direction.CW);
    }

    public final void setRadius(float f6) {
        this.radius$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f6));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadiusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC4154l.m8923f(context, "context");
    }

    public /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC4148f abstractC4148f) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadiusLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC4154l.m8923f(context, "context");
        this.path = new Path();
        this.radius$delegate = ViewPropertyKt.viewProperty(this, Float.valueOf(DefinitionKt.NO_Float_VALUE));
    }
}

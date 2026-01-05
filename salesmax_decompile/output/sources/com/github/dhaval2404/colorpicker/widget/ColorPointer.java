package com.github.dhaval2404.colorpicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import p001o.c64;
import p001o.id5;
import p001o.q6e;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class ColorPointer extends View {

    /* renamed from: a */
    public float f11856a;

    /* renamed from: b */
    public PointF f11857b;

    /* renamed from: c */
    public Paint f11858c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPointer(Context context) {
        this(context, null, 0, 0, 14, null);
        sq8.m48649h(context, "context");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
        PointF pointF = this.f11857b;
        canvas.drawCircle(pointF.x, pointF.y, this.f11856a * 0.66f, this.f11858c);
    }

    public final void setCurrentPoint(PointF pointF) {
        sq8.m48649h(pointF, "point");
        this.f11857b = pointF;
        invalidate();
    }

    public final void setPointerRadius(float f) {
        this.f11856a = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPointer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        sq8.m48649h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPointer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        sq8.m48649h(context, "context");
    }

    public /* synthetic */ ColorPointer(Context context, AttributeSet attributeSet, int i, int i2, int i3, id5 id5Var) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPointer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        sq8.m48649h(context, "context");
        this.f11856a = 8.0f;
        this.f11857b = new PointF();
        setAlpha(0.5f);
        Paint paint = new Paint(1);
        paint.setColor(c64.getColor(context, q6e.colorPointer));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(8.0f);
        y3i y3iVar = y3i.f54824a;
        this.f11858c = paint;
    }
}

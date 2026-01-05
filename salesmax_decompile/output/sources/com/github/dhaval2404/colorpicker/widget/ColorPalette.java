package com.github.dhaval2404.colorpicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import org.objectweb.asm.Opcodes;
import p001o.bce;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ColorPalette extends View {

    /* renamed from: a */
    public float f11850a;

    /* renamed from: b */
    public float f11851b;

    /* renamed from: c */
    public float f11852c;

    /* renamed from: d */
    public Paint f11853d;

    /* renamed from: e */
    public Paint f11854e;

    /* renamed from: f */
    public int[] f11855f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPalette(Context context) {
        this(context, null, 0, 0, 14, null);
        sq8.m48649h(context, "context");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
        canvas.drawCircle(this.f11851b, this.f11852c, this.f11850a, this.f11853d);
        canvas.drawCircle(this.f11851b, this.f11852c, this.f11850a, this.f11854e);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float fM18604g = bce.m18604g((i - getPaddingLeft()) - getPaddingRight(), (i2 - getPaddingTop()) - getPaddingBottom()) * 0.5f;
        this.f11850a = fM18604g;
        if (fM18604g < 0.0f) {
            return;
        }
        this.f11851b = i * 0.5f;
        this.f11852c = i2 * 0.5f;
        this.f11853d.setShader(new SweepGradient(this.f11851b, this.f11852c, this.f11855f, (float[]) null));
        this.f11854e.setShader(new RadialGradient(this.f11851b, this.f11852c, this.f11850a, -1, 16777215, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPalette(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        sq8.m48649h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPalette(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        sq8.m48649h(context, "context");
    }

    public /* synthetic */ ColorPalette(Context context, AttributeSet attributeSet, int i, int i2, int i3, id5 id5Var) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPalette(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        sq8.m48649h(context, "context");
        this.f11853d = new Paint(1);
        this.f11854e = new Paint(1);
        this.f11855f = new int[]{Opcodes.V_PREVIEW, -65281, -16776961, -16711681, -16711936, -256, Opcodes.V_PREVIEW};
    }
}

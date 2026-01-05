package com.github.dhaval2404.colorpicker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.github.dhaval2404.colorpicker.widget.ColorPalette;
import com.github.dhaval2404.colorpicker.widget.ColorPointer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.objectweb.asm.Opcodes;
import p001o.bce;
import p001o.id5;
import p001o.li3;
import p001o.nl7;
import p001o.sh3;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ColorPickerView extends FrameLayout {

    /* renamed from: q */
    public static final C10887a f11840q = new C10887a(null);

    /* renamed from: a */
    public float f11841a;

    /* renamed from: b */
    public float f11842b;

    /* renamed from: c */
    public float f11843c;

    /* renamed from: d */
    public float f11844d;

    /* renamed from: e */
    public int f11845e;

    /* renamed from: f */
    public final PointF f11846f;

    /* renamed from: g */
    public ColorPointer f11847g;

    /* renamed from: h */
    public sh3 f11848h;

    /* renamed from: com.github.dhaval2404.colorpicker.ColorPickerView$a */
    public static final class C10887a {
        public C10887a() {
        }

        public /* synthetic */ C10887a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.github.dhaval2404.colorpicker.ColorPickerView$b */
    public static final class C10888b implements sh3 {

        /* renamed from: a */
        public final /* synthetic */ nl7 f11849a;

        public C10888b(nl7 nl7Var) {
            this.f11849a = nl7Var;
        }

        @Override // p001o.sh3
        /* renamed from: a */
        public void mo13634a(int i, String str) {
            sq8.m48649h(str, "colorHex");
            this.f11849a.invoke(Integer.valueOf(i), str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPickerView(Context context) {
        this(context, null, 0, 6, null);
        sq8.m48649h(context, "context");
    }

    /* renamed from: a */
    public final int m13630a(float f, float f2) {
        float f3 = f - this.f11842b;
        double d = f2 - this.f11843c;
        double dSqrt = Math.sqrt((f3 * f3) + (d * d));
        float[] fArr = {0.0f, 0.0f, 1.0f};
        fArr[0] = ((float) ((Math.atan2(d, -f3) / 3.141592653589793d) * 180.0f)) + Opcodes.GETFIELD;
        fArr[1] = bce.m18600c(0.0f, bce.m18603f(1.0f, (float) (dSqrt / this.f11841a)));
        return Color.HSVToColor(fArr);
    }

    /* renamed from: b */
    public final void m13631b(int i) {
        sh3 sh3Var = this.f11848h;
        if (sh3Var == null) {
            return;
        }
        sh3Var.mo13634a(i, li3.m37260a(i));
    }

    /* renamed from: c */
    public final void m13632c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int iM13630a = m13630a(x, y);
        this.f11845e = iM13630a;
        m13631b(iM13630a);
        m13633d(x, y);
    }

    /* renamed from: d */
    public final void m13633d(float f, float f2) {
        float f3 = f - this.f11842b;
        float f4 = f2 - this.f11843c;
        double d = f4;
        double dSqrt = Math.sqrt((f3 * f3) + (d * d));
        float f5 = this.f11841a;
        if (dSqrt > f5) {
            float f6 = (float) dSqrt;
            f3 *= f5 / f6;
            f4 *= f5 / f6;
        }
        PointF pointF = this.f11846f;
        pointF.x = f3 + this.f11842b;
        pointF.y = f4 + this.f11843c;
        this.f11847g.setCurrentPoint(pointF);
    }

    public final int getColor() {
        return this.f11845e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM18604g = bce.m18604g(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iM18604g, 1073741824), View.MeasureSpec.makeMeasureSpec(iM18604g, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
        float fM18604g = (bce.m18604g(paddingLeft, paddingTop) * 0.5f) - this.f11844d;
        this.f11841a = fM18604g;
        if (fM18604g < 0.0f) {
            return;
        }
        this.f11842b = paddingLeft * 0.5f;
        this.f11843c = paddingTop * 0.5f;
        setColor(this.f11845e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        sq8.m48649h(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 2) {
            return super.onTouchEvent(motionEvent);
        }
        m13632c(motionEvent);
        return true;
    }

    public final void setColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        double d = (float) ((fArr[0] / 180.0f) * 3.141592653589793d);
        m13633d((float) ((fArr[1] * this.f11841a * Math.cos(d)) + this.f11842b), (float) (((-r1) * Math.sin(d)) + this.f11843c));
        this.f11845e = i;
    }

    public final void setColorListener(nl7 nl7Var) {
        sq8.m48649h(nl7Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f11848h = new C10888b(nl7Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        sq8.m48649h(context, "context");
    }

    public /* synthetic */ ColorPickerView(Context context, AttributeSet attributeSet, int i, int i2, id5 id5Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        this.f11844d = getResources().getDisplayMetrics().density * 8.0f;
        this.f11845e = -65281;
        this.f11846f = new PointF();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Context context2 = getContext();
        sq8.m48648g(context2, "context");
        ColorPalette colorPalette = new ColorPalette(context2, null, 0, 0, 14, null);
        int i2 = (int) this.f11844d;
        colorPalette.setPadding(i2, i2, i2, i2);
        addView(colorPalette, layoutParams);
        Context context3 = getContext();
        sq8.m48648g(context3, "context");
        ColorPointer colorPointer = new ColorPointer(context3, null, 0, 0, 14, null);
        this.f11847g = colorPointer;
        colorPointer.setPointerRadius(this.f11844d);
        addView(this.f11847g, layoutParams);
    }
}

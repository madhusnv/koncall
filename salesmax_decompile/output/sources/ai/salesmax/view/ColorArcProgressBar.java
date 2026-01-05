package ai.salesmax.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Locale;
import org.objectweb.asm.Opcodes;
import p001o.sbe;

/* loaded from: classes2.dex */
public class ColorArcProgressBar extends View {
    public boolean A0;
    public float B0;

    /* renamed from: H */
    public Matrix f5020H;

    /* renamed from: L */
    public float f5021L;

    /* renamed from: M */
    public float f5022M;

    /* renamed from: Q */
    public int[] f5023Q;

    /* renamed from: a */
    public int f5024a;

    /* renamed from: b */
    public float f5025b;

    /* renamed from: c */
    public float f5026c;

    /* renamed from: d */
    public Paint f5027d;

    /* renamed from: e */
    public Paint f5028e;

    /* renamed from: f */
    public Paint f5029f;

    /* renamed from: g */
    public Paint f5030g;

    /* renamed from: h */
    public Paint f5031h;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public final float n0;
    public final float o0;
    public final float p0;

    /* renamed from: q */
    public Paint f5032q;
    public final int q0;
    public int r0;

    /* renamed from: s */
    public RectF f5033s;
    public int s0;
    public int t0;
    public String u0;
    public String v0;
    public final boolean w0;

    /* renamed from: x */
    public PaintFlagsDrawFilter f5034x;
    public boolean x0;

    /* renamed from: y */
    public SweepGradient f5035y;
    public boolean y0;
    public boolean z0;

    /* renamed from: ai.salesmax.view.ColorArcProgressBar$a */
    public class ViewTreeObserverOnPreDrawListenerC1671a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC1671a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ColorArcProgressBar.this.m3351c();
            ColorArcProgressBar.this.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    public ColorArcProgressBar(Context context) {
        super(context, null);
        this.f5024a = 500;
        this.f5021L = 270.0f;
        this.f5022M = 0.0f;
        this.f5023Q = new int[]{-16711936, -256, Opcodes.V_PREVIEW, Opcodes.V_PREVIEW};
        this.h0 = 60.0f;
        this.i0 = 0.0f;
        this.j0 = m3352d(2.0f);
        this.k0 = m3352d(10.0f);
        this.l0 = m3352d(60.0f);
        this.m0 = m3352d(15.0f);
        this.n0 = m3352d(13.0f);
        this.o0 = m3352d(13.0f);
        this.p0 = m3352d(5.0f);
        this.q0 = m3352d(8.0f);
        this.r0 = -16711936;
        this.s0 = -16711936;
        this.t0 = -16711936;
        this.w0 = true;
        m3354f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m3350g(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5022M = fFloatValue;
        this.i0 = fFloatValue / this.B0;
    }

    private int getScreenWidth() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    private void setIsNeedDial(boolean z) {
        this.z0 = z;
    }

    private void setIsNeedTitle(boolean z) {
        this.x0 = z;
    }

    private void setIsNeedUnit(boolean z) {
        this.y0 = z;
    }

    private void setTitle(String str) {
        this.u0 = str;
    }

    /* renamed from: c */
    public final void m3351c() {
        this.f5024a = (int) (getWidth() - (this.j0 * 2.0f));
        RectF rectF = new RectF();
        this.f5033s = rectF;
        float f = (int) ((this.j0 / 3.0f) * 2.0f);
        rectF.top = f;
        rectF.left = f;
        rectF.right = getWidth() - r1;
        this.f5033s.bottom = getHeight() - r1;
        this.f5025b = getWidth() / 2.0f;
        this.f5026c = getWidth() / 2.0f;
        Paint paint = new Paint();
        this.f5031h = paint;
        paint.setColor(this.r0);
        Paint paint2 = new Paint();
        this.f5027d = paint2;
        paint2.setAntiAlias(true);
        this.f5027d.setStyle(Paint.Style.STROKE);
        this.f5027d.setStrokeWidth(this.j0);
        this.f5027d.setColor(this.s0);
        this.f5027d.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint();
        this.f5028e = paint3;
        paint3.setAntiAlias(true);
        this.f5028e.setStyle(Paint.Style.STROKE);
        this.f5028e.setStrokeCap(Paint.Cap.ROUND);
        this.f5028e.setStrokeWidth(this.k0);
        this.f5028e.setColor(-16711936);
        Paint paint4 = new Paint();
        this.f5029f = paint4;
        paint4.setTextSize(this.l0);
        this.f5029f.setColor(-16777216);
        this.f5029f.setTextAlign(Paint.Align.CENTER);
        Paint paint5 = new Paint();
        this.f5030g = paint5;
        paint5.setTextSize(this.m0);
        this.f5030g.setColor(Color.parseColor("#676767"));
        this.f5030g.setTextAlign(Paint.Align.CENTER);
        Paint paint6 = new Paint();
        this.f5032q = paint6;
        paint6.setTextSize(this.n0);
        this.f5032q.setColor(Color.parseColor("#676767"));
        this.f5032q.setTextAlign(Paint.Align.CENTER);
        this.f5034x = new PaintFlagsDrawFilter(0, 3);
        this.f5035y = new SweepGradient(this.f5025b, this.f5026c, this.f5023Q, (float[]) null);
        this.f5020H = new Matrix();
    }

    /* renamed from: d */
    public final int m3352d(float f) {
        return (int) ((getContext().getResources().getDisplayMetrics().density * f) + ((f >= 0.0f ? 1 : -1) * 0.5f));
    }

    /* renamed from: e */
    public final void m3353e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sbe.ColorArcProgressBar);
        int color = typedArrayObtainStyledAttributes.getColor(sbe.ColorArcProgressBar_front_color1, -16711936);
        this.f5023Q = new int[]{color, typedArrayObtainStyledAttributes.getColor(sbe.ColorArcProgressBar_front_color2, color), typedArrayObtainStyledAttributes.getColor(sbe.ColorArcProgressBar_front_color3, color), typedArrayObtainStyledAttributes.getColor(sbe.ColorArcProgressBar_front_color4, color)};
        this.f5021L = typedArrayObtainStyledAttributes.getInteger(sbe.ColorArcProgressBar_total_angle, 270);
        this.j0 = typedArrayObtainStyledAttributes.getDimension(sbe.ColorArcProgressBar_back_width, m3352d(2.0f));
        this.k0 = typedArrayObtainStyledAttributes.getDimension(sbe.ColorArcProgressBar_front_width, m3352d(10.0f));
        this.x0 = typedArrayObtainStyledAttributes.getBoolean(sbe.ColorArcProgressBar_is_need_title, false);
        this.A0 = typedArrayObtainStyledAttributes.getBoolean(sbe.ColorArcProgressBar_is_need_content, false);
        this.y0 = typedArrayObtainStyledAttributes.getBoolean(sbe.ColorArcProgressBar_is_need_unit, false);
        this.z0 = typedArrayObtainStyledAttributes.getBoolean(sbe.ColorArcProgressBar_is_need_dial, false);
        this.v0 = typedArrayObtainStyledAttributes.getString(sbe.ColorArcProgressBar_string_unit);
        this.u0 = typedArrayObtainStyledAttributes.getString(sbe.ColorArcProgressBar_string_title);
        this.i0 = typedArrayObtainStyledAttributes.getFloat(sbe.ColorArcProgressBar_current_value, 0.0f);
        this.h0 = typedArrayObtainStyledAttributes.getFloat(sbe.ColorArcProgressBar_max_value, 60.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(sbe.ColorArcProgressBar_back_color, color);
        this.r0 = color2;
        this.s0 = color2;
        this.t0 = color2;
        setCurrentValues(this.i0);
        setMaxValues(this.h0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public final void m3354f() {
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1671a());
    }

    /* renamed from: h */
    public final void m3355h(float f, float f2, int i) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.setTarget(Float.valueOf(this.f5022M));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mh3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f35468a.m3350g(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.setDrawFilter(this.f5034x);
        if (this.z0) {
            for (int i = 0; i < 40; i++) {
                if (i <= 15 || i >= 25) {
                    if (i % 5 == 0) {
                        this.f5031h.setStrokeWidth(m3352d(2.0f));
                        this.f5031h.setColor(this.r0);
                        float f = this.f5025b;
                        float f2 = this.f5026c;
                        int i2 = this.f5024a;
                        float f3 = this.k0;
                        int i3 = this.q0;
                        canvas.drawLine(f, ((f2 - (i2 / 2.0f)) - (f3 / 2.0f)) - i3, f, (((f2 - (i2 / 2.0f)) - (f3 / 2.0f)) - i3) - this.o0, this.f5031h);
                    } else {
                        this.f5031h.setStrokeWidth(m3352d(1.4f));
                        this.f5031h.setColor(this.t0);
                        float f4 = this.f5025b;
                        float f5 = this.f5026c;
                        int i4 = this.f5024a;
                        float f6 = this.k0;
                        int i5 = this.q0;
                        float f7 = this.o0;
                        float f8 = this.p0;
                        canvas.drawLine(f4, (((f5 - (i4 / 2.0f)) - (f6 / 2.0f)) - i5) - ((f7 - f8) / 2.0f), f4, ((((f5 - (i4 / 2.0f)) - (f6 / 2.0f)) - i5) - ((f7 - f8) / 2.0f)) - f8, this.f5031h);
                    }
                    canvas.rotate(9.0f, this.f5025b, this.f5026c);
                } else {
                    canvas.rotate(9.0f, this.f5025b, this.f5026c);
                }
            }
        }
        canvas.drawArc(this.f5033s, 190.0f, this.f5021L, false, this.f5027d);
        this.f5020H.setRotate(130.0f, this.f5025b, this.f5026c);
        this.f5035y.setLocalMatrix(this.f5020H);
        this.f5028e.setShader(this.f5035y);
        canvas.drawArc(this.f5033s, 190.0f, this.f5022M, false, this.f5028e);
        if (this.A0) {
            canvas.drawText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(this.i0)), this.f5025b, this.f5026c + (this.l0 / 3.0f), this.f5029f);
        }
        if (this.y0) {
            canvas.drawText(this.v0, this.f5025b, this.f5026c + ((this.l0 * 2.0f) / 3.0f), this.f5030g);
        }
        if (this.x0) {
            canvas.drawText(this.u0, this.f5025b, this.f5026c - ((this.l0 * 2.0f) / 3.0f), this.f5032q);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float f = this.o0;
        float f2 = this.k0;
        int i3 = this.f5024a;
        int i4 = this.q0;
        setMeasuredDimension((int) ((f * 2.0f) + f2 + i3 + (i4 * 2)), (int) ((f * 2.0f) + f2 + i3 + (i4 * 2)));
    }

    public void setBgArcWidth(int i) {
        this.j0 = i;
    }

    public void setColors(int[] iArr) {
        this.f5023Q = iArr;
    }

    public void setCurrentValues(float f) {
        float f2 = this.h0;
        if (f > f2) {
            f = f2;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.i0 = f;
        m3355h(this.f5022M, f * this.B0, 1000);
    }

    public void setDiameter(int i) {
        this.f5024a = m3352d(i);
    }

    public void setHintSize(int i) {
        this.m0 = i;
    }

    public void setMaxValues(float f) {
        this.h0 = f;
        this.B0 = this.f5021L / f;
    }

    public void setProgressWidth(int i) {
        this.k0 = i;
    }

    public void setTextSize(int i) {
        this.l0 = i;
    }

    public void setUnit(String str) {
        this.v0 = str;
        invalidate();
    }

    public ColorArcProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5024a = 500;
        this.f5021L = 270.0f;
        this.f5022M = 0.0f;
        this.f5023Q = new int[]{-16711936, -256, Opcodes.V_PREVIEW, Opcodes.V_PREVIEW};
        this.h0 = 60.0f;
        this.i0 = 0.0f;
        this.j0 = m3352d(2.0f);
        this.k0 = m3352d(10.0f);
        this.l0 = m3352d(60.0f);
        this.m0 = m3352d(15.0f);
        this.n0 = m3352d(13.0f);
        this.o0 = m3352d(13.0f);
        this.p0 = m3352d(5.0f);
        this.q0 = m3352d(8.0f);
        this.r0 = -16711936;
        this.s0 = -16711936;
        this.t0 = -16711936;
        this.w0 = true;
        m3353e(context, attributeSet);
        m3354f();
    }

    public ColorArcProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5024a = 500;
        this.f5021L = 270.0f;
        this.f5022M = 0.0f;
        this.f5023Q = new int[]{-16711936, -256, Opcodes.V_PREVIEW, Opcodes.V_PREVIEW};
        this.h0 = 60.0f;
        this.i0 = 0.0f;
        this.j0 = m3352d(2.0f);
        this.k0 = m3352d(10.0f);
        this.l0 = m3352d(60.0f);
        this.m0 = m3352d(15.0f);
        this.n0 = m3352d(13.0f);
        this.o0 = m3352d(13.0f);
        this.p0 = m3352d(5.0f);
        this.q0 = m3352d(8.0f);
        this.r0 = -16711936;
        this.s0 = -16711936;
        this.t0 = -16711936;
        this.w0 = true;
        m3353e(context, attributeSet);
        m3354f();
    }
}

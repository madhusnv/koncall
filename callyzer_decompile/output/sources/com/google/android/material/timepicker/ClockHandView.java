package com.google.android.material.timepicker;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: a */
    public final ArrayList f6995a;

    /* renamed from: b */
    public final int f6996b;

    /* renamed from: c */
    public final float f6997c;

    /* renamed from: d */
    public final Paint f6998d;

    /* renamed from: e */
    public final RectF f6999e;

    /* renamed from: f */
    public final int f7000f;

    /* renamed from: g */
    public float f7001g;

    /* renamed from: h */
    public boolean f7002h;

    /* renamed from: j */
    public double f7003j;

    /* renamed from: k */
    public int f7004k;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f6995a = new ArrayList();
        Paint paint = new Paint();
        this.f6998d = paint;
        this.f6999e = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0143a.f456e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f7004k = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f6996b = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f7000f = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f6997c = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m4144a(DefinitionKt.NO_Float_VALUE);
        ViewConfiguration.get(context).getScaledTouchSlop();
        Field field = v0.f5527a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void m4144a(float f6) {
        float f10 = f6 % 360.0f;
        this.f7001g = f10;
        this.f7003j = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        float fCos = (this.f7004k * ((float) Math.cos(this.f7003j))) + (getWidth() / 2);
        float fSin = (this.f7004k * ((float) Math.sin(this.f7003j))) + height;
        float f11 = this.f6996b;
        this.f6999e.set(fCos - f11, fSin - f11, fCos + f11, fSin + f11);
        ArrayList arrayList = this.f6995a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC1367d) obj);
            if (Math.abs(clockFaceView.f6988I - f10) > 0.001f) {
                clockFaceView.f6988I = f10;
                clockFaceView.m4143f();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.f7004k * ((float) Math.cos(this.f7003j))) + width;
        float f6 = height;
        float fSin = (this.f7004k * ((float) Math.sin(this.f7003j))) + f6;
        Paint paint = this.f6998d;
        paint.setStrokeWidth(DefinitionKt.NO_Float_VALUE);
        canvas.drawCircle(fCos, fSin, this.f6996b, paint);
        double dSin = Math.sin(this.f7003j);
        double dCos = Math.cos(this.f7003j);
        paint.setStrokeWidth(this.f7000f);
        canvas.drawLine(width, f6, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(width, f6, this.f6997c, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        m4144a(this.f7001g);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked == 0) {
            this.f7002h = false;
            z6 = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.f7002h;
            z6 = false;
        } else {
            z10 = false;
            z6 = false;
        }
        boolean z12 = this.f7002h;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x3 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f6 = i10;
        boolean z13 = this.f7001g != f6;
        if (z6 && z13) {
            z11 = true;
        } else if (z13 || z10) {
            m4144a(f6);
            z11 = true;
        }
        this.f7002h = z12 | z11;
        return true;
    }
}

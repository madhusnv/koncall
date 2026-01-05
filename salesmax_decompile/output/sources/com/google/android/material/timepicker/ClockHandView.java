package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.ebe;
import p001o.gh0;
import p001o.oza;
import p001o.pae;
import p001o.umb;
import p001o.x5e;
import p001o.x6e;
import p001o.xzi;

/* loaded from: classes3.dex */
class ClockHandView extends View {

    /* renamed from: H */
    public final Paint f13156H;

    /* renamed from: L */
    public final RectF f13157L;

    /* renamed from: M */
    public final int f13158M;

    /* renamed from: Q */
    public float f13159Q;

    /* renamed from: a */
    public final int f13160a;

    /* renamed from: b */
    public final TimeInterpolator f13161b;

    /* renamed from: c */
    public final ValueAnimator f13162c;

    /* renamed from: d */
    public boolean f13163d;

    /* renamed from: e */
    public float f13164e;

    /* renamed from: f */
    public float f13165f;

    /* renamed from: g */
    public boolean f13166g;

    /* renamed from: h */
    public final int f13167h;
    public boolean h0;
    public InterfaceC11160b i0;
    public double j0;
    public int k0;
    public int l0;

    /* renamed from: q */
    public boolean f13168q;

    /* renamed from: s */
    public final List f13169s;

    /* renamed from: x */
    public final int f13170x;

    /* renamed from: y */
    public final float f13171y;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public class C11159a extends AnimatorListenerAdapter {
        public C11159a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public interface InterfaceC11160b {
        /* renamed from: a */
        void mo15501a(float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface InterfaceC11161c {
        /* renamed from: d */
        void mo15478d(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialClockStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m15480n(ValueAnimator valueAnimator) {
        m15498t(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* renamed from: b */
    public void m15481b(InterfaceC11161c interfaceC11161c) {
        this.f13169s.add(interfaceC11161c);
    }

    /* renamed from: c */
    public final void m15482c(float f, float f2) {
        this.l0 = oza.m42803b((float) (getWidth() / 2), (float) (getHeight() / 2), f, f2) > ((float) m15488i(2)) + xzi.m57071g(getContext(), 12) ? 1 : 2;
    }

    /* renamed from: d */
    public final void m15483d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fM15488i = m15488i(this.l0);
        float fCos = (((float) Math.cos(this.j0)) * fM15488i) + f;
        float f2 = height;
        float fSin = (fM15488i * ((float) Math.sin(this.j0))) + f2;
        this.f13156H.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f13170x, this.f13156H);
        double dSin = Math.sin(this.j0);
        double dCos = Math.cos(this.j0);
        this.f13156H.setStrokeWidth(this.f13158M);
        canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f13156H);
        canvas.drawCircle(f, f2, this.f13171y, this.f13156H);
    }

    /* renamed from: e */
    public int m15484e() {
        return this.l0;
    }

    /* renamed from: f */
    public RectF m15485f() {
        return this.f13157L;
    }

    /* renamed from: g */
    public final int m15486g(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: h */
    public float m15487h() {
        return this.f13159Q;
    }

    /* renamed from: i */
    public final int m15488i(int i) {
        return i == 2 ? Math.round(this.k0 * 0.66f) : this.k0;
    }

    /* renamed from: j */
    public int m15489j() {
        return this.f13170x;
    }

    /* renamed from: k */
    public final Pair m15490k(float f) {
        float fM15487h = m15487h();
        if (Math.abs(fM15487h - f) > 180.0f) {
            if (fM15487h > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (fM15487h < 180.0f && f > 180.0f) {
                fM15487h += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fM15487h), Float.valueOf(f));
    }

    /* renamed from: l */
    public final boolean m15491l(float f, float f2, boolean z, boolean z2, boolean z3) {
        float fM15486g = m15486g(f, f2);
        boolean z4 = false;
        boolean z5 = m15487h() != fM15486g;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f13163d) {
            z4 = true;
        }
        m15497s(fM15486g, z4);
        return true;
    }

    /* renamed from: m */
    public final void m15492m() {
        this.f13162c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13215a.m15480n(valueAnimator);
            }
        });
        this.f13162c.addListener(new C11159a());
    }

    /* renamed from: o */
    public void m15493o(boolean z) {
        this.f13163d = z;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m15483d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f13162c.isRunning()) {
            return;
        }
        m15496r(m15487h());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC11160b interfaceC11160b;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.f13164e = x;
            this.f13165f = y;
            this.f13166g = true;
            this.h0 = false;
            z = false;
            z2 = false;
            z3 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.f13164e);
            int i2 = (int) (y - this.f13165f);
            this.f13166g = (i * i) + (i2 * i2) > this.f13167h;
            boolean z4 = this.h0;
            z = actionMasked == 1;
            if (this.f13168q) {
                m15482c(x, y);
            }
            z3 = false;
            z2 = z4;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean zM15491l = m15491l(x, y, z2, z3, z) | this.h0;
        this.h0 = zM15491l;
        if (zM15491l && z && (interfaceC11160b = this.i0) != null) {
            interfaceC11160b.mo15501a(m15486g(x, y), this.f13166g);
        }
        return true;
    }

    /* renamed from: p */
    public void m15494p(int i) {
        this.k0 = i;
        invalidate();
    }

    /* renamed from: q */
    public void m15495q(int i) {
        this.l0 = i;
        invalidate();
    }

    /* renamed from: r */
    public void m15496r(float f) {
        m15497s(f, false);
    }

    /* renamed from: s */
    public void m15497s(float f, boolean z) {
        this.f13162c.cancel();
        if (!z) {
            m15498t(f, false);
            return;
        }
        Pair pairM15490k = m15490k(f);
        this.f13162c.setFloatValues(((Float) pairM15490k.first).floatValue(), ((Float) pairM15490k.second).floatValue());
        this.f13162c.setDuration(this.f13160a);
        this.f13162c.setInterpolator(this.f13161b);
        this.f13162c.start();
    }

    /* renamed from: t */
    public final void m15498t(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f13159Q = f2;
        this.j0 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM15488i = m15488i(this.l0);
        float fCos = width + (((float) Math.cos(this.j0)) * fM15488i);
        float fSin = height + (fM15488i * ((float) Math.sin(this.j0)));
        RectF rectF = this.f13157L;
        int i = this.f13170x;
        rectF.set(fCos - i, fSin - i, fCos + i, fSin + i);
        Iterator it = this.f13169s.iterator();
        while (it.hasNext()) {
            ((InterfaceC11161c) it.next()).mo15478d(f2, z);
        }
        invalidate();
    }

    /* renamed from: u */
    public void m15499u(boolean z) {
        if (this.f13168q && !z) {
            this.l0 = 1;
        }
        this.f13168q = z;
        invalidate();
    }

    /* renamed from: v */
    public void m15500v(InterfaceC11160b interfaceC11160b) {
        this.i0 = interfaceC11160b;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13162c = new ValueAnimator();
        this.f13169s = new ArrayList();
        Paint paint = new Paint();
        this.f13156H = paint;
        this.f13157L = new RectF();
        this.l0 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.ClockHandView, i, pae.Widget_MaterialComponents_TimePicker_Clock);
        this.f13160a = umb.m51785f(context, x5e.motionDurationLong2, 200);
        this.f13161b = umb.m51786g(context, x5e.motionEasingEmphasizedInterpolator, gh0.f25147b);
        this.k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ClockHandView_materialCircleRadius, 0);
        this.f13170x = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ClockHandView_selectorSize, 0);
        this.f13158M = getResources().getDimensionPixelSize(x6e.material_clock_hand_stroke_width);
        this.f13171y = r7.getDimensionPixelSize(x6e.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(ebe.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m15496r(0.0f);
        this.f13167h = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        m15492m();
    }
}

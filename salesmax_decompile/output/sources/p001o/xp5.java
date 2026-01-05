package p001o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p001o.ez5;

/* loaded from: classes3.dex */
public final class xp5 extends yy5 {
    public static final l37 q0 = new C18206a("indicatorLevel");

    /* renamed from: Y */
    public ez5 f54016Y;

    /* renamed from: Z */
    public final z0g f54017Z;
    public final y0g h0;
    public final ez5.C13289a i0;
    public float j0;
    public boolean k0;
    public final ValueAnimator l0;
    public ValueAnimator m0;
    public TimeInterpolator n0;
    public TimeInterpolator o0;
    public TimeInterpolator p0;

    /* renamed from: o.xp5$a */
    public class C18206a extends l37 {
        public C18206a(String str) {
            super(str);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(xp5 xp5Var) {
            return xp5Var.m56548E() * 10000.0f;
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(xp5 xp5Var, float f) {
            xp5Var.m56554M(f / 10000.0f);
            xp5Var.m56550I((int) f);
        }
    }

    public xp5(Context context, final je1 je1Var, ez5 ez5Var) {
        super(context, je1Var);
        this.k0 = false;
        m56552K(ez5Var);
        ez5.C13289a c13289a = new ez5.C13289a();
        this.i0 = c13289a;
        c13289a.f22439h = true;
        z0g z0gVar = new z0g();
        this.f54017Z = z0gVar;
        z0gVar.m58630f(1.0f);
        z0gVar.m58632h(50.0f);
        y0g y0gVar = new y0g(this, q0);
        this.h0 = y0gVar;
        y0gVar.m57093w(z0gVar);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.l0 = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.wp5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f52440a.m56540G(je1Var, valueAnimator2);
            }
        });
        if (je1Var.m33608b(true) && je1Var.f30245m != 0) {
            valueAnimator.start();
        }
        m58479p(1.0f);
    }

    /* renamed from: A */
    public static xp5 m56537A(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, w93 w93Var) {
        return new xp5(context, circularProgressIndicatorSpec, w93Var);
    }

    /* renamed from: B */
    public static xp5 m56538B(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, oda odaVar) {
        return new xp5(context, linearProgressIndicatorSpec, odaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m56539F(ValueAnimator valueAnimator) {
        this.i0.f22436e = this.n0.getInterpolation(this.m0.getAnimatedFraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m56540G(je1 je1Var, ValueAnimator valueAnimator) {
        if (je1Var.m33608b(true) && je1Var.f30245m != 0 && isVisible()) {
            invalidateSelf();
        }
    }

    /* renamed from: C */
    public final float m56546C(int i) {
        float f = i;
        return (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
    }

    /* renamed from: D */
    public ez5 m56547D() {
        return this.f54016Y;
    }

    /* renamed from: E */
    public final float m56548E() {
        return this.i0.f22433b;
    }

    /* renamed from: H */
    public final void m56549H() {
        if (this.m0 != null) {
            return;
        }
        Context context = this.f56258a;
        int i = x5e.motionEasingStandardInterpolator;
        TimeInterpolator timeInterpolator = gh0.f25146a;
        this.o0 = umb.m51786g(context, i, timeInterpolator);
        this.p0 = umb.m51786g(this.f56258a, x5e.motionEasingEmphasizedAccelerateInterpolator, timeInterpolator);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.m0 = valueAnimator;
        valueAnimator.setDuration(500L);
        this.m0.setFloatValues(0.0f, 1.0f);
        this.m0.setInterpolator(null);
        this.m0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.vp5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f50691a.m56539F(valueAnimator2);
            }
        });
    }

    /* renamed from: I */
    public final void m56550I(int i) {
        if (this.f56259b.m33608b(true)) {
            m56549H();
            float fM56546C = m56546C(i);
            if (fM56546C == this.j0) {
                if (this.m0.isRunning()) {
                    return;
                }
                m56551J(fM56546C);
                return;
            }
            if (this.m0.isRunning()) {
                this.m0.cancel();
            }
            this.j0 = fM56546C;
            if (fM56546C == 1.0f) {
                this.n0 = this.o0;
                this.m0.start();
            } else {
                this.n0 = this.p0;
                this.m0.reverse();
            }
        }
    }

    /* renamed from: J */
    public final void m56551J(float f) {
        this.i0.f22436e = f;
        invalidateSelf();
    }

    /* renamed from: K */
    public void m56552K(ez5 ez5Var) {
        this.f54016Y = ez5Var;
    }

    /* renamed from: L */
    public void m56553L(boolean z) {
        if (z && !this.l0.isRunning()) {
            this.l0.start();
        } else {
            if (z || !this.l0.isRunning()) {
                return;
            }
            this.l0.cancel();
        }
    }

    /* renamed from: M */
    public final void m56554M(float f) {
        this.i0.f22433b = f;
        invalidateSelf();
    }

    /* renamed from: N */
    public void m56555N(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f56257Q)) {
            canvas.save();
            this.f54016Y.m25869h(canvas, getBounds(), m58475h(), mo51578m(), mo51577l());
            this.i0.f22437f = m58476i();
            this.f56255L.setStyle(Paint.Style.FILL);
            this.f56255L.setAntiAlias(true);
            ez5.C13289a c13289a = this.i0;
            je1 je1Var = this.f56259b;
            c13289a.f22434c = je1Var.f30237e[0];
            int iM44555a = je1Var.f30241i;
            if (iM44555a > 0) {
                if (!(this.f54016Y instanceof oda)) {
                    iM44555a = (int) ((iM44555a * pza.m44555a(m56548E(), 0.0f, 0.01f)) / 0.01f);
                }
                this.f54016Y.mo25865d(canvas, this.f56255L, m56548E(), 1.0f, this.f56259b.f30238f, getAlpha(), iM44555a);
            } else {
                this.f54016Y.mo25865d(canvas, this.f56255L, 0.0f, 1.0f, je1Var.f30238f, getAlpha(), 0);
            }
            this.f54016Y.mo25864c(canvas, this.f56255L, this.i0, getAlpha());
            this.f54016Y.mo25863b(canvas, this.f56255L, this.f56259b.f30237e[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // p001o.yy5, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f54016Y.mo25866e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f54016Y.mo25867f();
    }

    @Override // p001o.yy5, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p001o.yy5, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // p001o.yy5
    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo51576j() {
        return super.mo51576j();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.h0.m57094x();
        m56554M(getLevel() / 10000.0f);
    }

    @Override // p001o.yy5
    /* renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo51577l() {
        return super.mo51577l();
    }

    @Override // p001o.yy5
    /* renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo51578m() {
        return super.mo51578m();
    }

    @Override // p001o.yy5
    /* renamed from: o */
    public /* bridge */ /* synthetic */ void mo51579o(dg0 dg0Var) {
        super.mo51579o(dg0Var);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        float fM56546C = m56546C(i);
        if (!this.k0) {
            this.h0.m49139m(m56548E() * 10000.0f);
            this.h0.m57089s(i);
            return true;
        }
        this.h0.m57094x();
        m56554M(i / 10000.0f);
        m56551J(fM56546C);
        return true;
    }

    @Override // p001o.yy5
    /* renamed from: s */
    public /* bridge */ /* synthetic */ boolean mo51580s(boolean z, boolean z2, boolean z3) {
        return super.mo51580s(z, z2, z3);
    }

    @Override // p001o.yy5, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // p001o.yy5, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p001o.yy5, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // p001o.yy5, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // p001o.yy5, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // p001o.yy5
    /* renamed from: t */
    public boolean mo51581t(boolean z, boolean z2, boolean z3) {
        boolean zMo51581t = super.mo51581t(z, z2, z3);
        float fM33830a = this.f56260c.m33830a(this.f56258a.getContentResolver());
        if (fM33830a == 0.0f) {
            this.k0 = true;
        } else {
            this.k0 = false;
            this.f54017Z.m58632h(50.0f / fM33830a);
        }
        return zMo51581t;
    }

    @Override // p001o.yy5
    /* renamed from: u */
    public /* bridge */ /* synthetic */ boolean mo51582u(dg0 dg0Var) {
        return super.mo51582u(dg0Var);
    }
}

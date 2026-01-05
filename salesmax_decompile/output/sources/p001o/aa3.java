package p001o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes2.dex */
public class aa3 extends Drawable implements Animatable {

    /* renamed from: g */
    public static final Interpolator f14339g = new LinearInterpolator();

    /* renamed from: h */
    public static final Interpolator f14340h = new at6();

    /* renamed from: q */
    public static final int[] f14341q = {-16777216};

    /* renamed from: a */
    public final C12120c f14342a;

    /* renamed from: b */
    public float f14343b;

    /* renamed from: c */
    public Resources f14344c;

    /* renamed from: d */
    public Animator f14345d;

    /* renamed from: e */
    public float f14346e;

    /* renamed from: f */
    public boolean f14347f;

    /* renamed from: o.aa3$a */
    public class C12118a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C12120c f14348a;

        public C12118a(C12120c c12120c) {
            this.f14348a = c12120c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            aa3.this.m16730n(fFloatValue, this.f14348a);
            aa3.this.m16718b(fFloatValue, this.f14348a, false);
            aa3.this.invalidateSelf();
        }
    }

    /* renamed from: o.aa3$b */
    public class C12119b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C12120c f14350a;

        public C12119b(C12120c c12120c) {
            this.f14350a = c12120c;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            aa3.this.m16718b(1.0f, this.f14350a, true);
            this.f14350a.m16731A();
            this.f14350a.m16743l();
            aa3 aa3Var = aa3.this;
            if (!aa3Var.f14347f) {
                aa3Var.f14346e += 1.0f;
                return;
            }
            aa3Var.f14347f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f14350a.m16755x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            aa3.this.f14346e = 0.0f;
        }
    }

    /* renamed from: o.aa3$c */
    public static class C12120c {

        /* renamed from: a */
        public final RectF f14352a = new RectF();

        /* renamed from: b */
        public final Paint f14353b;

        /* renamed from: c */
        public final Paint f14354c;

        /* renamed from: d */
        public final Paint f14355d;

        /* renamed from: e */
        public float f14356e;

        /* renamed from: f */
        public float f14357f;

        /* renamed from: g */
        public float f14358g;

        /* renamed from: h */
        public float f14359h;

        /* renamed from: i */
        public int[] f14360i;

        /* renamed from: j */
        public int f14361j;

        /* renamed from: k */
        public float f14362k;

        /* renamed from: l */
        public float f14363l;

        /* renamed from: m */
        public float f14364m;

        /* renamed from: n */
        public boolean f14365n;

        /* renamed from: o */
        public Path f14366o;

        /* renamed from: p */
        public float f14367p;

        /* renamed from: q */
        public float f14368q;

        /* renamed from: r */
        public int f14369r;

        /* renamed from: s */
        public int f14370s;

        /* renamed from: t */
        public int f14371t;

        /* renamed from: u */
        public int f14372u;

        public C12120c() {
            Paint paint = new Paint();
            this.f14353b = paint;
            Paint paint2 = new Paint();
            this.f14354c = paint2;
            Paint paint3 = new Paint();
            this.f14355d = paint3;
            this.f14356e = 0.0f;
            this.f14357f = 0.0f;
            this.f14358g = 0.0f;
            this.f14359h = 5.0f;
            this.f14367p = 1.0f;
            this.f14371t = Constants.MAX_HOST_LENGTH;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        public void m16731A() {
            this.f14362k = this.f14356e;
            this.f14363l = this.f14357f;
            this.f14364m = this.f14358g;
        }

        /* renamed from: a */
        public void m16732a(Canvas canvas, Rect rect) {
            RectF rectF = this.f14352a;
            float f = this.f14368q;
            float fMin = (this.f14359h / 2.0f) + f;
            if (f <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f14369r * this.f14367p) / 2.0f, this.f14359h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f2 = this.f14356e;
            float f3 = this.f14358g;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.f14357f + f3) * 360.0f) - f4;
            this.f14353b.setColor(this.f14372u);
            this.f14353b.setAlpha(this.f14371t);
            float f6 = this.f14359h / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f14355d);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f4, f5, false, this.f14353b);
            m16733b(canvas, f4, f5, rectF);
        }

        /* renamed from: b */
        public void m16733b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f14365n) {
                Path path = this.f14366o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f14366o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.f14369r * this.f14367p) / 2.0f;
                this.f14366o.moveTo(0.0f, 0.0f);
                this.f14366o.lineTo(this.f14369r * this.f14367p, 0.0f);
                Path path3 = this.f14366o;
                float f4 = this.f14369r;
                float f5 = this.f14367p;
                path3.lineTo((f4 * f5) / 2.0f, this.f14370s * f5);
                this.f14366o.offset((fMin + rectF.centerX()) - f3, rectF.centerY() + (this.f14359h / 2.0f));
                this.f14366o.close();
                this.f14354c.setColor(this.f14372u);
                this.f14354c.setAlpha(this.f14371t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f14366o, this.f14354c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        public int m16734c() {
            return this.f14371t;
        }

        /* renamed from: d */
        public float m16735d() {
            return this.f14357f;
        }

        /* renamed from: e */
        public int m16736e() {
            return this.f14360i[m16737f()];
        }

        /* renamed from: f */
        public int m16737f() {
            return (this.f14361j + 1) % this.f14360i.length;
        }

        /* renamed from: g */
        public float m16738g() {
            return this.f14356e;
        }

        /* renamed from: h */
        public int m16739h() {
            return this.f14360i[this.f14361j];
        }

        /* renamed from: i */
        public float m16740i() {
            return this.f14363l;
        }

        /* renamed from: j */
        public float m16741j() {
            return this.f14364m;
        }

        /* renamed from: k */
        public float m16742k() {
            return this.f14362k;
        }

        /* renamed from: l */
        public void m16743l() {
            m16751t(m16737f());
        }

        /* renamed from: m */
        public void m16744m() {
            this.f14362k = 0.0f;
            this.f14363l = 0.0f;
            this.f14364m = 0.0f;
            m16756y(0.0f);
            m16753v(0.0f);
            m16754w(0.0f);
        }

        /* renamed from: n */
        public void m16745n(int i) {
            this.f14371t = i;
        }

        /* renamed from: o */
        public void m16746o(float f, float f2) {
            this.f14369r = (int) f;
            this.f14370s = (int) f2;
        }

        /* renamed from: p */
        public void m16747p(float f) {
            if (f != this.f14367p) {
                this.f14367p = f;
            }
        }

        /* renamed from: q */
        public void m16748q(float f) {
            this.f14368q = f;
        }

        /* renamed from: r */
        public void m16749r(int i) {
            this.f14372u = i;
        }

        /* renamed from: s */
        public void m16750s(ColorFilter colorFilter) {
            this.f14353b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        public void m16751t(int i) {
            this.f14361j = i;
            this.f14372u = this.f14360i[i];
        }

        /* renamed from: u */
        public void m16752u(int[] iArr) {
            this.f14360i = iArr;
            m16751t(0);
        }

        /* renamed from: v */
        public void m16753v(float f) {
            this.f14357f = f;
        }

        /* renamed from: w */
        public void m16754w(float f) {
            this.f14358g = f;
        }

        /* renamed from: x */
        public void m16755x(boolean z) {
            if (this.f14365n != z) {
                this.f14365n = z;
            }
        }

        /* renamed from: y */
        public void m16756y(float f) {
            this.f14356e = f;
        }

        /* renamed from: z */
        public void m16757z(float f) {
            this.f14359h = f;
            this.f14353b.setStrokeWidth(f);
        }
    }

    public aa3(Context context) {
        this.f14344c = ((Context) fgd.m26663g(context)).getResources();
        C12120c c12120c = new C12120c();
        this.f14342a = c12120c;
        c12120c.m16752u(f14341q);
        m16727k(2.5f);
        m16729m();
    }

    /* renamed from: a */
    public final void m16717a(float f, C12120c c12120c) {
        m16730n(f, c12120c);
        float fFloor = (float) (Math.floor(c12120c.m16741j() / 0.8f) + 1.0d);
        c12120c.m16756y(c12120c.m16742k() + (((c12120c.m16740i() - 0.01f) - c12120c.m16742k()) * f));
        c12120c.m16753v(c12120c.m16740i());
        c12120c.m16754w(c12120c.m16741j() + ((fFloor - c12120c.m16741j()) * f));
    }

    /* renamed from: b */
    public void m16718b(float f, C12120c c12120c, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f14347f) {
            m16717a(f, c12120c);
            return;
        }
        if (f != 1.0f || z) {
            float fM16741j = c12120c.m16741j();
            if (f < 0.5f) {
                interpolation = c12120c.m16742k();
                interpolation2 = (f14340h.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fM16742k = c12120c.m16742k() + 0.79f;
                interpolation = fM16742k - (((1.0f - f14340h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fM16742k;
            }
            float f2 = fM16741j + (0.20999998f * f);
            float f3 = (f + this.f14346e) * 216.0f;
            c12120c.m16756y(interpolation);
            c12120c.m16753v(interpolation2);
            c12120c.m16754w(f2);
            m16724h(f3);
        }
    }

    /* renamed from: c */
    public final int m16719c(float f, int i, int i2) {
        return ((((i >> 24) & Constants.MAX_HOST_LENGTH) + ((int) ((((i2 >> 24) & Constants.MAX_HOST_LENGTH) - r0) * f))) << 24) | ((((i >> 16) & Constants.MAX_HOST_LENGTH) + ((int) ((((i2 >> 16) & Constants.MAX_HOST_LENGTH) - r1) * f))) << 16) | ((((i >> 8) & Constants.MAX_HOST_LENGTH) + ((int) ((((i2 >> 8) & Constants.MAX_HOST_LENGTH) - r2) * f))) << 8) | ((i & Constants.MAX_HOST_LENGTH) + ((int) (f * ((i2 & Constants.MAX_HOST_LENGTH) - r8))));
    }

    /* renamed from: d */
    public void m16720d(boolean z) {
        this.f14342a.m16755x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f14343b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f14342a.m16732a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m16721e(float f) {
        this.f14342a.m16747p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m16722f(int... iArr) {
        this.f14342a.m16752u(iArr);
        this.f14342a.m16751t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m16723g(float f) {
        this.f14342a.m16754w(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f14342a.m16734c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void m16724h(float f) {
        this.f14343b = f;
    }

    /* renamed from: i */
    public final void m16725i(float f, float f2, float f3, float f4) {
        C12120c c12120c = this.f14342a;
        float f5 = this.f14344c.getDisplayMetrics().density;
        c12120c.m16757z(f2 * f5);
        c12120c.m16748q(f * f5);
        c12120c.m16751t(0);
        c12120c.m16746o(f3 * f5, f4 * f5);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f14345d.isRunning();
    }

    /* renamed from: j */
    public void m16726j(float f, float f2) {
        this.f14342a.m16756y(f);
        this.f14342a.m16753v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m16727k(float f) {
        this.f14342a.m16757z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m16728l(int i) {
        if (i == 0) {
            m16725i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m16725i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: m */
    public final void m16729m() {
        C12120c c12120c = this.f14342a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C12118a(c12120c));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f14339g);
        valueAnimatorOfFloat.addListener(new C12119b(c12120c));
        this.f14345d = valueAnimatorOfFloat;
    }

    /* renamed from: n */
    public void m16730n(float f, C12120c c12120c) {
        if (f > 0.75f) {
            c12120c.m16749r(m16719c((f - 0.75f) / 0.25f, c12120c.m16739h(), c12120c.m16736e()));
        } else {
            c12120c.m16749r(c12120c.m16739h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f14342a.m16745n(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14342a.m16750s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f14345d.cancel();
        this.f14342a.m16731A();
        if (this.f14342a.m16735d() != this.f14342a.m16738g()) {
            this.f14347f = true;
            this.f14345d.setDuration(666L);
            this.f14345d.start();
        } else {
            this.f14342a.m16751t(0);
            this.f14342a.m16744m();
            this.f14345d.setDuration(1332L);
            this.f14345d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f14345d.cancel();
        m16724h(0.0f);
        this.f14342a.m16755x(false);
        this.f14342a.m16751t(0);
        this.f14342a.m16744m();
        invalidateSelf();
    }
}

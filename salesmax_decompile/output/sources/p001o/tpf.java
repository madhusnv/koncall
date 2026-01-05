package p001o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.shimmer.C10884a;

/* loaded from: classes5.dex */
public final class tpf extends Drawable {

    /* renamed from: a */
    public final ValueAnimator.AnimatorUpdateListener f47530a = new C17173a();

    /* renamed from: b */
    public final Paint f47531b;

    /* renamed from: c */
    public final Rect f47532c;

    /* renamed from: d */
    public final Matrix f47533d;

    /* renamed from: e */
    public ValueAnimator f47534e;

    /* renamed from: f */
    public C10884a f47535f;

    /* renamed from: o.tpf$a */
    public class C17173a implements ValueAnimator.AnimatorUpdateListener {
        public C17173a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            tpf.this.invalidateSelf();
        }
    }

    public tpf() {
        Paint paint = new Paint();
        this.f47531b = paint;
        this.f47532c = new Rect();
        this.f47533d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* renamed from: a */
    public boolean m50286a() {
        ValueAnimator valueAnimator = this.f47534e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* renamed from: b */
    public void m50287b() {
        C10884a c10884a;
        ValueAnimator valueAnimator = this.f47534e;
        if (valueAnimator == null || valueAnimator.isStarted() || (c10884a = this.f47535f) == null || !c10884a.f11816p || getCallback() == null) {
            return;
        }
        this.f47534e.start();
    }

    /* renamed from: c */
    public final float m50288c(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: d */
    public void m50289d(C10884a c10884a) {
        this.f47535f = c10884a;
        if (c10884a != null) {
            this.f47531b.setXfermode(new PorterDuffXfermode(this.f47535f.f11817q ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        m50292g();
        m50293h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fM50288c;
        float fM50288c2;
        if (this.f47535f == null || this.f47531b.getShader() == null) {
            return;
        }
        float fTan = (float) Math.tan(Math.toRadians(this.f47535f.f11814n));
        float fHeight = this.f47532c.height() + (this.f47532c.width() * fTan);
        float fWidth = this.f47532c.width() + (fTan * this.f47532c.height());
        ValueAnimator valueAnimator = this.f47534e;
        float f = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i = this.f47535f.f11804d;
        if (i != 1) {
            if (i == 2) {
                fM50288c2 = m50288c(fWidth, -fWidth, animatedFraction);
            } else if (i != 3) {
                fM50288c2 = m50288c(-fWidth, fWidth, animatedFraction);
            } else {
                fM50288c = m50288c(fHeight, -fHeight, animatedFraction);
            }
            f = fM50288c2;
            fM50288c = 0.0f;
        } else {
            fM50288c = m50288c(-fHeight, fHeight, animatedFraction);
        }
        this.f47533d.reset();
        this.f47533d.setRotate(this.f47535f.f11814n, this.f47532c.width() / 2.0f, this.f47532c.height() / 2.0f);
        this.f47533d.postTranslate(f, fM50288c);
        this.f47531b.getShader().setLocalMatrix(this.f47533d);
        canvas.drawRect(this.f47532c, this.f47531b);
    }

    /* renamed from: e */
    public void m50290e() {
        if (this.f47534e == null || m50286a() || getCallback() == null) {
            return;
        }
        this.f47534e.start();
    }

    /* renamed from: f */
    public void m50291f() {
        if (this.f47534e == null || !m50286a()) {
            return;
        }
        this.f47534e.cancel();
    }

    /* renamed from: g */
    public final void m50292g() {
        C10884a c10884a;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (c10884a = this.f47535f) == null) {
            return;
        }
        int iM13588d = c10884a.m13588d(iWidth);
        int iM13585a = this.f47535f.m13585a(iHeight);
        C10884a c10884a2 = this.f47535f;
        boolean z = true;
        if (c10884a2.f11807g != 1) {
            int i = c10884a2.f11804d;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                iM13588d = 0;
            }
            if (!z) {
                iM13585a = 0;
            }
            float f = iM13585a;
            C10884a c10884a3 = this.f47535f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iM13588d, f, c10884a3.f11802b, c10884a3.f11801a, Shader.TileMode.CLAMP);
        } else {
            float f2 = iM13585a / 2.0f;
            float fMax = (float) (Math.max(iM13588d, iM13585a) / Math.sqrt(2.0d));
            C10884a c10884a4 = this.f47535f;
            radialGradient = new RadialGradient(iM13588d / 2.0f, f2, fMax, c10884a4.f11802b, c10884a4.f11801a, Shader.TileMode.CLAMP);
        }
        this.f47531b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        C10884a c10884a = this.f47535f;
        return (c10884a == null || !(c10884a.f11815o || c10884a.f11817q)) ? -1 : -3;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [android.animation.ValueAnimator, java.lang.Class] */
    /* renamed from: h */
    public final void m50293h() {
        boolean zIsStarted;
        if (this.f47535f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f47534e;
        if (valueAnimator != null) {
            zIsStarted = valueAnimator.isStarted();
            this.f47534e.cancel();
            this.f47534e.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        C10884a c10884a = this.f47535f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (c10884a.f11821u / c10884a.f11820t) + 1.0f);
        this.f47534e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatMode(this.f47535f.f11819s);
        ?? r1 = this.f47534e;
        int i = this.f47535f.f11818r;
        r1.getName();
        ValueAnimator valueAnimator2 = this.f47534e;
        C10884a c10884a2 = this.f47535f;
        valueAnimator2.setDuration(c10884a2.f11820t + c10884a2.f11821u);
        this.f47534e.addUpdateListener(this.f47530a);
        if (zIsStarted) {
            this.f47534e.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f47532c.set(0, 0, rect.width(), rect.height());
        m50292g();
        m50287b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class yy5 extends Drawable implements Animatable {

    /* renamed from: X */
    public static final Property f56253X = new C18520c(Float.class, "growFraction");

    /* renamed from: H */
    public float f56254H;

    /* renamed from: M */
    public int f56256M;

    /* renamed from: a */
    public final Context f56258a;

    /* renamed from: b */
    public final je1 f56259b;

    /* renamed from: d */
    public ValueAnimator f56261d;

    /* renamed from: e */
    public ValueAnimator f56262e;

    /* renamed from: f */
    public boolean f56263f;

    /* renamed from: g */
    public boolean f56264g;

    /* renamed from: h */
    public float f56265h;

    /* renamed from: s */
    public List f56267s;

    /* renamed from: x */
    public dg0 f56268x;

    /* renamed from: y */
    public boolean f56269y;

    /* renamed from: q */
    public float f56266q = -1.0f;

    /* renamed from: L */
    public final Paint f56255L = new Paint();

    /* renamed from: Q */
    public Rect f56257Q = new Rect();

    /* renamed from: c */
    public jh0 f56260c = new jh0();

    /* renamed from: o.yy5$a */
    public class C18518a extends AnimatorListenerAdapter {
        public C18518a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            yy5.this.m58473f();
        }
    }

    /* renamed from: o.yy5$b */
    public class C18519b extends AnimatorListenerAdapter {
        public C18519b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            yy5.super.setVisible(false, false);
            yy5.this.m58472e();
        }
    }

    /* renamed from: o.yy5$c */
    public class C18520c extends Property {
        public C18520c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(yy5 yy5Var) {
            return Float.valueOf(yy5Var.m58475h());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(yy5 yy5Var, Float f) {
            yy5Var.m58479p(f.floatValue());
        }
    }

    public yy5(Context context, je1 je1Var) {
        this.f56258a = context;
        this.f56259b = je1Var;
        setAlpha(Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: d */
    public final void m58471d(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f56269y;
        this.f56269y = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f56269y = z;
    }

    /* renamed from: e */
    public final void m58472e() {
        dg0 dg0Var = this.f56268x;
        if (dg0Var != null) {
            dg0Var.mo14364b(this);
        }
        List list = this.f56267s;
        if (list == null || this.f56269y) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((dg0) it.next()).mo14364b(this);
        }
    }

    /* renamed from: f */
    public final void m58473f() {
        dg0 dg0Var = this.f56268x;
        if (dg0Var != null) {
            dg0Var.mo14365c(this);
        }
        List list = this.f56267s;
        if (list == null || this.f56269y) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((dg0) it.next()).mo14365c(this);
        }
    }

    /* renamed from: g */
    public final void m58474g(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f56269y;
        this.f56269y = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f56269y = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f56256M;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public float m58475h() {
        if (this.f56259b.m33610d() || this.f56259b.m33609c()) {
            return (this.f56264g || this.f56263f) ? this.f56265h : this.f56254H;
        }
        return 1.0f;
    }

    /* renamed from: i */
    public float m58476i() {
        float f = this.f56266q;
        if (f > 0.0f) {
            return f;
        }
        if (!this.f56259b.m33608b(m58477k()) || this.f56259b.f30245m == 0) {
            return 0.0f;
        }
        float fM33830a = this.f56260c.m33830a(this.f56258a.getContentResolver());
        if (fM33830a <= 0.0f) {
            return 0.0f;
        }
        float fUptimeMillis = (SystemClock.uptimeMillis() % r0) / ((int) ((((m58477k() ? this.f56259b.f30242j : this.f56259b.f30243k) * 1000.0f) / this.f56259b.f30245m) * fM33830a));
        return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
    }

    public boolean isRunning() {
        return mo51578m() || mo51577l();
    }

    /* renamed from: j */
    public boolean mo51576j() {
        return mo51580s(false, false, false);
    }

    /* renamed from: k */
    public final boolean m58477k() {
        return this instanceof xp5;
    }

    /* renamed from: l */
    public boolean mo51577l() {
        ValueAnimator valueAnimator = this.f56262e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f56264g;
    }

    /* renamed from: m */
    public boolean mo51578m() {
        ValueAnimator valueAnimator = this.f56261d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f56263f;
    }

    /* renamed from: n */
    public final void m58478n() {
        if (this.f56261d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<yy5, Float>) f56253X, 0.0f, 1.0f);
            this.f56261d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f56261d.setInterpolator(gh0.f25147b);
            m58481r(this.f56261d);
        }
        if (this.f56262e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<yy5, Float>) f56253X, 1.0f, 0.0f);
            this.f56262e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f56262e.setInterpolator(gh0.f25147b);
            m58480q(this.f56262e);
        }
    }

    /* renamed from: o */
    public void mo51579o(dg0 dg0Var) {
        if (this.f56267s == null) {
            this.f56267s = new ArrayList();
        }
        if (this.f56267s.contains(dg0Var)) {
            return;
        }
        this.f56267s.add(dg0Var);
    }

    /* renamed from: p */
    public void m58479p(float f) {
        if (this.f56254H != f) {
            this.f56254H = f;
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public final void m58480q(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f56262e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f56262e = valueAnimator;
        valueAnimator.addListener(new C18519b());
    }

    /* renamed from: r */
    public final void m58481r(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f56261d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f56261d = valueAnimator;
        valueAnimator.addListener(new C18518a());
    }

    /* renamed from: s */
    public boolean mo51580s(boolean z, boolean z2, boolean z3) {
        return mo51581t(z, z2, z3 && this.f56260c.m33830a(this.f56258a.getContentResolver()) > 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f56256M = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f56255L.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return mo51580s(z, z2, true);
    }

    public void start() {
        mo51581t(true, true, false);
    }

    public void stop() {
        mo51581t(false, true, false);
    }

    /* renamed from: t */
    public boolean mo51581t(boolean z, boolean z2, boolean z3) {
        m58478n();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.f56261d : this.f56262e;
        ValueAnimator valueAnimator2 = z ? this.f56262e : this.f56261d;
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                m58471d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m58474g(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z4 = !z || super.setVisible(z, false);
        if (!(z ? this.f56259b.m33610d() : this.f56259b.m33609c())) {
            m58474g(valueAnimator);
            return z4;
        }
        if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z4;
    }

    /* renamed from: u */
    public boolean mo51582u(dg0 dg0Var) {
        List list = this.f56267s;
        if (list == null || !list.contains(dg0Var)) {
            return false;
        }
        this.f56267s.remove(dg0Var);
        if (!this.f56267s.isEmpty()) {
            return true;
        }
        this.f56267s = null;
        return true;
    }
}

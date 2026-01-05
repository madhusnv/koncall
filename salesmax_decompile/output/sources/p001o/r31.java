package p001o;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public abstract class r31 implements View.OnTouchListener {

    /* renamed from: Y */
    public static final int f42851Y = ViewConfiguration.getTapTimeout();

    /* renamed from: H */
    public boolean f42852H;

    /* renamed from: L */
    public boolean f42853L;

    /* renamed from: M */
    public boolean f42854M;

    /* renamed from: Q */
    public boolean f42855Q;

    /* renamed from: X */
    public boolean f42856X;

    /* renamed from: c */
    public final View f42859c;

    /* renamed from: d */
    public Runnable f42860d;

    /* renamed from: g */
    public int f42863g;

    /* renamed from: h */
    public int f42864h;

    /* renamed from: y */
    public boolean f42868y;

    /* renamed from: a */
    public final C16531a f42857a = new C16531a();

    /* renamed from: b */
    public final Interpolator f42858b = new AccelerateInterpolator();

    /* renamed from: e */
    public float[] f42861e = {0.0f, 0.0f};

    /* renamed from: f */
    public float[] f42862f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: q */
    public float[] f42865q = {0.0f, 0.0f};

    /* renamed from: s */
    public float[] f42866s = {0.0f, 0.0f};

    /* renamed from: x */
    public float[] f42867x = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o.r31$a */
    public static class C16531a {

        /* renamed from: a */
        public int f42869a;

        /* renamed from: b */
        public int f42870b;

        /* renamed from: c */
        public float f42871c;

        /* renamed from: d */
        public float f42872d;

        /* renamed from: j */
        public float f42878j;

        /* renamed from: k */
        public int f42879k;

        /* renamed from: e */
        public long f42873e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f42877i = -1;

        /* renamed from: f */
        public long f42874f = 0;

        /* renamed from: g */
        public int f42875g = 0;

        /* renamed from: h */
        public int f42876h = 0;

        /* renamed from: a */
        public void m46178a() {
            if (this.f42874f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fM46184g = m46184g(m46182e(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f42874f;
            this.f42874f = jCurrentAnimationTimeMillis;
            float f = j * fM46184g;
            this.f42875g = (int) (this.f42871c * f);
            this.f42876h = (int) (f * this.f42872d);
        }

        /* renamed from: b */
        public int m46179b() {
            return this.f42875g;
        }

        /* renamed from: c */
        public int m46180c() {
            return this.f42876h;
        }

        /* renamed from: d */
        public int m46181d() {
            float f = this.f42871c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public final float m46182e(long j) {
            if (j < this.f42873e) {
                return 0.0f;
            }
            long j2 = this.f42877i;
            if (j2 < 0 || j < j2) {
                return r31.m46156e((j - r0) / this.f42869a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f42878j;
            return (1.0f - f) + (f * r31.m46156e((j - j2) / this.f42879k, 0.0f, 1.0f));
        }

        /* renamed from: f */
        public int m46183f() {
            float f = this.f42872d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: g */
        public final float m46184g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: h */
        public boolean m46185h() {
            return this.f42877i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f42877i + ((long) this.f42879k);
        }

        /* renamed from: i */
        public void m46186i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f42879k = r31.m46157f((int) (jCurrentAnimationTimeMillis - this.f42873e), 0, this.f42870b);
            this.f42878j = m46182e(jCurrentAnimationTimeMillis);
            this.f42877i = jCurrentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m46187j(int i) {
            this.f42870b = i;
        }

        /* renamed from: k */
        public void m46188k(int i) {
            this.f42869a = i;
        }

        /* renamed from: l */
        public void m46189l(float f, float f2) {
            this.f42871c = f;
            this.f42872d = f2;
        }

        /* renamed from: m */
        public void m46190m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f42873e = jCurrentAnimationTimeMillis;
            this.f42877i = -1L;
            this.f42874f = jCurrentAnimationTimeMillis;
            this.f42878j = 0.5f;
            this.f42875g = 0;
            this.f42876h = 0;
        }
    }

    /* renamed from: o.r31$b */
    public class RunnableC16532b implements Runnable {
        public RunnableC16532b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r31 r31Var = r31.this;
            if (r31Var.f42854M) {
                if (r31Var.f42852H) {
                    r31Var.f42852H = false;
                    r31Var.f42857a.m46190m();
                }
                C16531a c16531a = r31.this.f42857a;
                if (c16531a.m46185h() || !r31.this.m46176u()) {
                    r31.this.f42854M = false;
                    return;
                }
                r31 r31Var2 = r31.this;
                if (r31Var2.f42853L) {
                    r31Var2.f42853L = false;
                    r31Var2.m46160c();
                }
                c16531a.m46178a();
                r31.this.mo46165j(c16531a.m46179b(), c16531a.m46180c());
                wvi.e0(r31.this.f42859c, this);
            }
        }
    }

    public r31(View view) {
        this.f42859c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m46170o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m46171p(f3, f3);
        m46167l(1);
        m46169n(Float.MAX_VALUE, Float.MAX_VALUE);
        m46174s(0.2f, 0.2f);
        m46175t(1.0f, 1.0f);
        m46166k(f42851Y);
        m46173r(500);
        m46172q(500);
    }

    /* renamed from: e */
    public static float m46156e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    public static int m46157f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract boolean mo46158a(int i);

    /* renamed from: b */
    public abstract boolean mo46159b(int i);

    /* renamed from: c */
    public void m46160c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f42859c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* renamed from: d */
    public final float m46161d(int i, float f, float f2, float f3) {
        float fM46163h = m46163h(this.f42861e[i], f2, this.f42862f[i], f);
        if (fM46163h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f42865q[i];
        float f5 = this.f42866s[i];
        float f6 = this.f42867x[i];
        float f7 = f4 * f3;
        return fM46163h > 0.0f ? m46156e(fM46163h * f7, f5, f6) : -m46156e((-fM46163h) * f7, f5, f6);
    }

    /* renamed from: g */
    public final float m46162g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f42863g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f42854M && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float m46163h(float f, float f2, float f3, float f4) {
        float interpolation;
        float fM46156e = m46156e(f * f2, 0.0f, f3);
        float fM46162g = m46162g(f2 - f4, fM46156e) - m46162g(f4, fM46156e);
        if (fM46162g < 0.0f) {
            interpolation = -this.f42858b.getInterpolation(-fM46162g);
        } else {
            if (fM46162g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f42858b.getInterpolation(fM46162g);
        }
        return m46156e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    public final void m46164i() {
        if (this.f42852H) {
            this.f42854M = false;
        } else {
            this.f42857a.m46186i();
        }
    }

    /* renamed from: j */
    public abstract void mo46165j(int i, int i2);

    /* renamed from: k */
    public r31 m46166k(int i) {
        this.f42864h = i;
        return this;
    }

    /* renamed from: l */
    public r31 m46167l(int i) {
        this.f42863g = i;
        return this;
    }

    /* renamed from: m */
    public r31 m46168m(boolean z) {
        if (this.f42855Q && !z) {
            m46164i();
        }
        this.f42855Q = z;
        return this;
    }

    /* renamed from: n */
    public r31 m46169n(float f, float f2) {
        float[] fArr = this.f42862f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public r31 m46170o(float f, float f2) {
        float[] fArr = this.f42867x;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f42855Q) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m46164i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            }
            return this.f42856X && this.f42854M;
        }
        this.f42853L = true;
        this.f42868y = false;
        this.f42857a.m46189l(m46161d(0, motionEvent.getX(), view.getWidth(), this.f42859c.getWidth()), m46161d(1, motionEvent.getY(), view.getHeight(), this.f42859c.getHeight()));
        if (!this.f42854M && m46176u()) {
            m46177v();
        }
        if (this.f42856X) {
            return false;
        }
    }

    /* renamed from: p */
    public r31 m46171p(float f, float f2) {
        float[] fArr = this.f42866s;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public r31 m46172q(int i) {
        this.f42857a.m46187j(i);
        return this;
    }

    /* renamed from: r */
    public r31 m46173r(int i) {
        this.f42857a.m46188k(i);
        return this;
    }

    /* renamed from: s */
    public r31 m46174s(float f, float f2) {
        float[] fArr = this.f42861e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public r31 m46175t(float f, float f2) {
        float[] fArr = this.f42865q;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    public boolean m46176u() {
        C16531a c16531a = this.f42857a;
        int iM46183f = c16531a.m46183f();
        int iM46181d = c16531a.m46181d();
        return (iM46183f != 0 && mo46159b(iM46183f)) || (iM46181d != 0 && mo46158a(iM46181d));
    }

    /* renamed from: v */
    public final void m46177v() {
        int i;
        if (this.f42860d == null) {
            this.f42860d = new RunnableC16532b();
        }
        this.f42854M = true;
        this.f42852H = true;
        if (this.f42868y || (i = this.f42864h) <= 0) {
            this.f42860d.run();
        } else {
            wvi.f0(this.f42859c, this.f42860d, i);
        }
        this.f42868y = true;
    }
}

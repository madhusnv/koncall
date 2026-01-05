package p001o;

import android.view.Choreographer;

/* loaded from: classes3.dex */
public class pma extends xd1 implements Choreographer.FrameCallback {

    /* renamed from: s */
    public ama f40267s;

    /* renamed from: c */
    public float f40260c = 1.0f;

    /* renamed from: d */
    public boolean f40261d = false;

    /* renamed from: e */
    public long f40262e = 0;

    /* renamed from: f */
    public float f40263f = 0.0f;

    /* renamed from: g */
    public int f40264g = 0;

    /* renamed from: h */
    public float f40265h = -2.1474836E9f;

    /* renamed from: q */
    public float f40266q = 2.1474836E9f;

    /* renamed from: x */
    public boolean f40268x = false;

    /* renamed from: A */
    public void m43875A(float f) {
        if (this.f40263f == f) {
            return;
        }
        this.f40263f = zeb.m59348c(f, m43887n(), m43886m());
        this.f40262e = 0L;
        m56041g();
    }

    /* renamed from: B */
    public void m43876B(float f) {
        m43877C(this.f40265h, f);
    }

    /* renamed from: C */
    public void m43877C(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        ama amaVar = this.f40267s;
        float fM17452p = amaVar == null ? -3.4028235E38f : amaVar.m17452p();
        ama amaVar2 = this.f40267s;
        float fM17442f = amaVar2 == null ? Float.MAX_VALUE : amaVar2.m17442f();
        float fM59348c = zeb.m59348c(f, fM17452p, fM17442f);
        float fM59348c2 = zeb.m59348c(f2, fM17452p, fM17442f);
        if (fM59348c == this.f40265h && fM59348c2 == this.f40266q) {
            return;
        }
        this.f40265h = fM59348c;
        this.f40266q = fM59348c2;
        m43875A((int) zeb.m59348c(this.f40263f, fM59348c, fM59348c2));
    }

    /* renamed from: D */
    public void m43878D(int i) {
        m43877C(i, (int) this.f40266q);
    }

    /* renamed from: E */
    public void m43879E(float f) {
        this.f40260c = f;
    }

    /* renamed from: F */
    public final void m43880F() {
        if (this.f40267s == null) {
            return;
        }
        float f = this.f40263f;
        if (f < this.f40265h || f > this.f40266q) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f40265h), Float.valueOf(this.f40266q), Float.valueOf(this.f40263f)));
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        m56037a();
        m43893v();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        m43892u();
        if (this.f40267s == null || !isRunning()) {
            return;
        }
        ve9.m52656a("LottieValueAnimator#doFrame");
        float fM43885l = (this.f40262e != 0 ? j - r1 : 0L) / m43885l();
        float f = this.f40263f;
        if (m43889q()) {
            fM43885l = -fM43885l;
        }
        float f2 = f + fM43885l;
        this.f40263f = f2;
        boolean z = !zeb.m59350e(f2, m43887n(), m43886m());
        this.f40263f = zeb.m59348c(this.f40263f, m43887n(), m43886m());
        this.f40262e = j;
        m56041g();
        if (z) {
            if (getRepeatCount() == -1 || this.f40264g < getRepeatCount()) {
                m56039c();
                this.f40264g++;
                if (getRepeatMode() == 2) {
                    this.f40261d = !this.f40261d;
                    m43896y();
                } else {
                    this.f40263f = m43889q() ? m43886m() : m43887n();
                }
                this.f40262e = j;
            } else {
                this.f40263f = this.f40260c < 0.0f ? m43887n() : m43886m();
                m43893v();
                m56038b(m43889q());
            }
        }
        m43880F();
        ve9.m52657b("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fM43887n;
        float fM43886m;
        float fM43887n2;
        if (this.f40267s == null) {
            return 0.0f;
        }
        if (m43889q()) {
            fM43887n = m43886m() - this.f40263f;
            fM43886m = m43886m();
            fM43887n2 = m43887n();
        } else {
            fM43887n = this.f40263f - m43887n();
            fM43886m = m43886m();
            fM43887n2 = m43887n();
        }
        return fM43887n / (fM43886m - fM43887n2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m43883j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        ama amaVar = this.f40267s;
        if (amaVar == null) {
            return 0L;
        }
        return (long) amaVar.m17440d();
    }

    /* renamed from: h */
    public void m43881h() {
        this.f40267s = null;
        this.f40265h = -2.1474836E9f;
        this.f40266q = 2.1474836E9f;
    }

    /* renamed from: i */
    public void m43882i() {
        m43893v();
        m56038b(m43889q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f40268x;
    }

    /* renamed from: j */
    public float m43883j() {
        ama amaVar = this.f40267s;
        if (amaVar == null) {
            return 0.0f;
        }
        return (this.f40263f - amaVar.m17452p()) / (this.f40267s.m17442f() - this.f40267s.m17452p());
    }

    /* renamed from: k */
    public float m43884k() {
        return this.f40263f;
    }

    /* renamed from: l */
    public final float m43885l() {
        ama amaVar = this.f40267s;
        if (amaVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / amaVar.m17445i()) / Math.abs(this.f40260c);
    }

    /* renamed from: m */
    public float m43886m() {
        ama amaVar = this.f40267s;
        if (amaVar == null) {
            return 0.0f;
        }
        float f = this.f40266q;
        return f == 2.1474836E9f ? amaVar.m17442f() : f;
    }

    /* renamed from: n */
    public float m43887n() {
        ama amaVar = this.f40267s;
        if (amaVar == null) {
            return 0.0f;
        }
        float f = this.f40265h;
        return f == -2.1474836E9f ? amaVar.m17452p() : f;
    }

    /* renamed from: p */
    public float m43888p() {
        return this.f40260c;
    }

    /* renamed from: q */
    public final boolean m43889q() {
        return m43888p() < 0.0f;
    }

    /* renamed from: s */
    public void m43890s() {
        m43893v();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f40261d) {
            return;
        }
        this.f40261d = false;
        m43896y();
    }

    /* renamed from: t */
    public void m43891t() {
        this.f40268x = true;
        m56040f(m43889q());
        m43875A((int) (m43889q() ? m43886m() : m43887n()));
        this.f40262e = 0L;
        this.f40264g = 0;
        m43892u();
    }

    /* renamed from: u */
    public void m43892u() {
        if (isRunning()) {
            m43894w(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: v */
    public void m43893v() {
        m43894w(true);
    }

    /* renamed from: w */
    public void m43894w(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f40268x = false;
        }
    }

    /* renamed from: x */
    public void m43895x() {
        this.f40268x = true;
        m43892u();
        this.f40262e = 0L;
        if (m43889q() && m43884k() == m43887n()) {
            this.f40263f = m43886m();
        } else {
            if (m43889q() || m43884k() != m43886m()) {
                return;
            }
            this.f40263f = m43887n();
        }
    }

    /* renamed from: y */
    public void m43896y() {
        m43879E(-m43888p());
    }

    /* renamed from: z */
    public void m43897z(ama amaVar) {
        boolean z = this.f40267s == null;
        this.f40267s = amaVar;
        if (z) {
            m43877C((int) Math.max(this.f40265h, amaVar.m17452p()), (int) Math.min(this.f40266q, amaVar.m17442f()));
        } else {
            m43877C((int) amaVar.m17452p(), (int) amaVar.m17442f());
        }
        float f = this.f40263f;
        this.f40263f = 0.0f;
        m43875A((int) f);
        m56041g();
    }
}

package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.perf.util.Constants;
import p001o.wvi;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes2.dex */
public class C2402h extends RecyclerView.AbstractC2378o implements RecyclerView.InterfaceC2382s {

    /* renamed from: D */
    public static final int[] f10051D = {R.attr.state_pressed};

    /* renamed from: E */
    public static final int[] f10052E = new int[0];

    /* renamed from: A */
    public int f10053A;

    /* renamed from: B */
    public final Runnable f10054B;

    /* renamed from: C */
    public final RecyclerView.AbstractC2383t f10055C;

    /* renamed from: a */
    public final int f10056a;

    /* renamed from: b */
    public final int f10057b;

    /* renamed from: c */
    public final StateListDrawable f10058c;

    /* renamed from: d */
    public final Drawable f10059d;

    /* renamed from: e */
    public final int f10060e;

    /* renamed from: f */
    public final int f10061f;

    /* renamed from: g */
    public final StateListDrawable f10062g;

    /* renamed from: h */
    public final Drawable f10063h;

    /* renamed from: i */
    public final int f10064i;

    /* renamed from: j */
    public final int f10065j;

    /* renamed from: k */
    public int f10066k;

    /* renamed from: l */
    public int f10067l;

    /* renamed from: m */
    public float f10068m;

    /* renamed from: n */
    public int f10069n;

    /* renamed from: o */
    public int f10070o;

    /* renamed from: p */
    public float f10071p;

    /* renamed from: s */
    public RecyclerView f10074s;

    /* renamed from: z */
    public final ValueAnimator f10081z;

    /* renamed from: q */
    public int f10072q = 0;

    /* renamed from: r */
    public int f10073r = 0;

    /* renamed from: t */
    public boolean f10075t = false;

    /* renamed from: u */
    public boolean f10076u = false;

    /* renamed from: v */
    public int f10077v = 0;

    /* renamed from: w */
    public int f10078w = 0;

    /* renamed from: x */
    public final int[] f10079x = new int[2];

    /* renamed from: y */
    public final int[] f10080y = new int[2];

    /* renamed from: androidx.recyclerview.widget.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2402h.this.m9523s(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    public class b extends RecyclerView.AbstractC2383t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
        /* renamed from: b */
        public void mo964b(RecyclerView recyclerView, int i, int i2) {
            C2402h.this.m9514D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f10084a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10084a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10084a) {
                this.f10084a = false;
                return;
            }
            if (((Float) C2402h.this.f10081z.getAnimatedValue()).floatValue() == 0.0f) {
                C2402h c2402h = C2402h.this;
                c2402h.f10053A = 0;
                c2402h.m9511A(0);
            } else {
                C2402h c2402h2 = C2402h.this;
                c2402h2.f10053A = 2;
                c2402h2.m9528x();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C2402h.this.f10058c.setAlpha(iFloatValue);
            C2402h.this.f10059d.setAlpha(iFloatValue);
            C2402h.this.m9528x();
        }
    }

    public C2402h(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10081z = valueAnimatorOfFloat;
        this.f10053A = 0;
        this.f10054B = new a();
        this.f10055C = new b();
        this.f10058c = stateListDrawable;
        this.f10059d = drawable;
        this.f10062g = stateListDrawable2;
        this.f10063h = drawable2;
        this.f10060e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f10061f = Math.max(i, drawable.getIntrinsicWidth());
        this.f10064i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f10065j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f10056a = i2;
        this.f10057b = i3;
        stateListDrawable.setAlpha(Constants.MAX_HOST_LENGTH);
        drawable.setAlpha(Constants.MAX_HOST_LENGTH);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        m9516l(recyclerView);
    }

    /* renamed from: A */
    public void m9511A(int i) {
        if (i == 2 && this.f10077v != 2) {
            this.f10058c.setState(f10051D);
            m9517m();
        }
        if (i == 0) {
            m9528x();
        } else {
            m9513C();
        }
        if (this.f10077v == 2 && i != 2) {
            this.f10058c.setState(f10052E);
            m9529y(1200);
        } else if (i == 1) {
            m9529y(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f10077v = i;
    }

    /* renamed from: B */
    public final void m9512B() {
        this.f10074s.m9086h(this);
        this.f10074s.m9089k(this);
        this.f10074s.m9090l(this.f10055C);
    }

    /* renamed from: C */
    public void m9513C() {
        int i = this.f10053A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f10081z.cancel();
            }
        }
        this.f10053A = 1;
        ValueAnimator valueAnimator = this.f10081z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f10081z.setDuration(500L);
        this.f10081z.setStartDelay(0L);
        this.f10081z.start();
    }

    /* renamed from: D */
    public void m9514D(int i, int i2) {
        int iComputeVerticalScrollRange = this.f10074s.computeVerticalScrollRange();
        int i3 = this.f10073r;
        this.f10075t = iComputeVerticalScrollRange - i3 > 0 && i3 >= this.f10056a;
        int iComputeHorizontalScrollRange = this.f10074s.computeHorizontalScrollRange();
        int i4 = this.f10072q;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= this.f10056a;
        this.f10076u = z;
        boolean z2 = this.f10075t;
        if (!z2 && !z) {
            if (this.f10077v != 0) {
                m9511A(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f10067l = (int) ((f * (i2 + (f / 2.0f))) / iComputeVerticalScrollRange);
            this.f10066k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.f10076u) {
            float f2 = i4;
            this.f10070o = (int) ((f2 * (i + (f2 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f10069n = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = this.f10077v;
        if (i5 == 0 || i5 == 1) {
            m9511A(1);
        }
    }

    /* renamed from: E */
    public final void m9515E(float f) {
        int[] iArrM9522r = m9522r();
        float fMax = Math.max(iArrM9522r[0], Math.min(iArrM9522r[1], f));
        if (Math.abs(this.f10067l - fMax) < 2.0f) {
            return;
        }
        int iM9530z = m9530z(this.f10068m, fMax, iArrM9522r, this.f10074s.computeVerticalScrollRange(), this.f10074s.computeVerticalScrollOffset(), this.f10073r);
        if (iM9530z != 0) {
            this.f10074s.scrollBy(0, iM9530z);
        }
        this.f10068m = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2382s
    /* renamed from: a */
    public void mo728a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f10077v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM9527w = m9527w(motionEvent.getX(), motionEvent.getY());
            boolean zM9526v = m9526v(motionEvent.getX(), motionEvent.getY());
            if (zM9527w || zM9526v) {
                if (zM9526v) {
                    this.f10078w = 1;
                    this.f10071p = (int) motionEvent.getX();
                } else if (zM9527w) {
                    this.f10078w = 2;
                    this.f10068m = (int) motionEvent.getY();
                }
                m9511A(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f10077v == 2) {
            this.f10068m = 0.0f;
            this.f10071p = 0.0f;
            m9511A(1);
            this.f10078w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f10077v == 2) {
            m9513C();
            if (this.f10078w == 1) {
                m9524t(motionEvent.getX());
            }
            if (this.f10078w == 2) {
                m9515E(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2382s
    /* renamed from: c */
    public boolean mo729c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f10077v;
        if (i == 1) {
            boolean zM9527w = m9527w(motionEvent.getX(), motionEvent.getY());
            boolean zM9526v = m9526v(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zM9527w && !zM9526v) {
                return false;
            }
            if (zM9526v) {
                this.f10078w = 1;
                this.f10071p = (int) motionEvent.getX();
            } else if (zM9527w) {
                this.f10078w = 2;
                this.f10068m = (int) motionEvent.getY();
            }
            m9511A(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2382s
    /* renamed from: e */
    public void mo730e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2378o
    /* renamed from: k */
    public void mo9230k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2389z c2389z) {
        if (this.f10072q != this.f10074s.getWidth() || this.f10073r != this.f10074s.getHeight()) {
            this.f10072q = this.f10074s.getWidth();
            this.f10073r = this.f10074s.getHeight();
            m9511A(0);
        } else if (this.f10053A != 0) {
            if (this.f10075t) {
                m9520p(canvas);
            }
            if (this.f10076u) {
                m9519o(canvas);
            }
        }
    }

    /* renamed from: l */
    public void m9516l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10074s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m9518n();
        }
        this.f10074s = recyclerView;
        if (recyclerView != null) {
            m9512B();
        }
    }

    /* renamed from: m */
    public final void m9517m() {
        this.f10074s.removeCallbacks(this.f10054B);
    }

    /* renamed from: n */
    public final void m9518n() {
        this.f10074s.g1(this);
        this.f10074s.i1(this);
        this.f10074s.j1(this.f10055C);
        m9517m();
    }

    /* renamed from: o */
    public final void m9519o(Canvas canvas) {
        int i = this.f10073r;
        int i2 = this.f10064i;
        int i3 = this.f10070o;
        int i4 = this.f10069n;
        this.f10062g.setBounds(0, 0, i4, i2);
        this.f10063h.setBounds(0, 0, this.f10072q, this.f10065j);
        canvas.translate(0.0f, i - i2);
        this.f10063h.draw(canvas);
        canvas.translate(i3 - (i4 / 2), 0.0f);
        this.f10062g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: p */
    public final void m9520p(Canvas canvas) {
        int i = this.f10072q;
        int i2 = this.f10060e;
        int i3 = i - i2;
        int i4 = this.f10067l;
        int i5 = this.f10066k;
        int i6 = i4 - (i5 / 2);
        this.f10058c.setBounds(0, 0, i2, i5);
        this.f10059d.setBounds(0, 0, this.f10061f, this.f10073r);
        if (!m9525u()) {
            canvas.translate(i3, 0.0f);
            this.f10059d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f10058c.draw(canvas);
            canvas.translate(-i3, -i6);
            return;
        }
        this.f10059d.draw(canvas);
        canvas.translate(this.f10060e, i6);
        canvas.scale(-1.0f, 1.0f);
        this.f10058c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f10060e, -i6);
    }

    /* renamed from: q */
    public final int[] m9521q() {
        int[] iArr = this.f10080y;
        int i = this.f10057b;
        iArr[0] = i;
        iArr[1] = this.f10072q - i;
        return iArr;
    }

    /* renamed from: r */
    public final int[] m9522r() {
        int[] iArr = this.f10079x;
        int i = this.f10057b;
        iArr[0] = i;
        iArr[1] = this.f10073r - i;
        return iArr;
    }

    /* renamed from: s */
    public void m9523s(int i) {
        int i2 = this.f10053A;
        if (i2 == 1) {
            this.f10081z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f10053A = 3;
        ValueAnimator valueAnimator = this.f10081z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f10081z.setDuration(i);
        this.f10081z.start();
    }

    /* renamed from: t */
    public final void m9524t(float f) {
        int[] iArrM9521q = m9521q();
        float fMax = Math.max(iArrM9521q[0], Math.min(iArrM9521q[1], f));
        if (Math.abs(this.f10070o - fMax) < 2.0f) {
            return;
        }
        int iM9530z = m9530z(this.f10071p, fMax, iArrM9521q, this.f10074s.computeHorizontalScrollRange(), this.f10074s.computeHorizontalScrollOffset(), this.f10072q);
        if (iM9530z != 0) {
            this.f10074s.scrollBy(iM9530z, 0);
        }
        this.f10071p = fMax;
    }

    /* renamed from: u */
    public final boolean m9525u() {
        return wvi.m55139z(this.f10074s) == 1;
    }

    /* renamed from: v */
    public boolean m9526v(float f, float f2) {
        if (f2 >= this.f10073r - this.f10064i) {
            int i = this.f10070o;
            int i2 = this.f10069n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public boolean m9527w(float f, float f2) {
        if (!m9525u() ? f >= this.f10072q - this.f10060e : f <= this.f10060e) {
            int i = this.f10067l;
            int i2 = this.f10066k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public void m9528x() {
        this.f10074s.invalidate();
    }

    /* renamed from: y */
    public final void m9529y(int i) {
        m9517m();
        this.f10074s.postDelayed(this.f10054B, i);
    }

    /* renamed from: z */
    public final int m9530z(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }
}

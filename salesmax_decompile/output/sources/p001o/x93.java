package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import p001o.ez5;

/* loaded from: classes3.dex */
public final class x93 extends th8 {

    /* renamed from: k */
    public static final int[] f53378k = {0, 1350, 2700, 4050};

    /* renamed from: l */
    public static final int[] f53379l = {667, 2017, 3367, 4717};

    /* renamed from: m */
    public static final int[] f53380m = {1000, 2350, 3700, 5050};

    /* renamed from: n */
    public static final Property f53381n = new C18082c(Float.class, "animationFraction");

    /* renamed from: o */
    public static final Property f53382o = new C18083d(Float.class, "completeEndFraction");

    /* renamed from: c */
    public ObjectAnimator f53383c;

    /* renamed from: d */
    public ObjectAnimator f53384d;

    /* renamed from: e */
    public final at6 f53385e;

    /* renamed from: f */
    public final je1 f53386f;

    /* renamed from: g */
    public int f53387g;

    /* renamed from: h */
    public float f53388h;

    /* renamed from: i */
    public float f53389i;

    /* renamed from: j */
    public dg0 f53390j;

    /* renamed from: o.x93$a */
    public class C18080a extends AnimatorListenerAdapter {
        public C18080a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            x93 x93Var = x93.this;
            x93Var.f53387g = (x93Var.f53387g + 4) % x93.this.f53386f.f30237e.length;
        }
    }

    /* renamed from: o.x93$b */
    public class C18081b extends AnimatorListenerAdapter {
        public C18081b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            x93.this.mo43471a();
            x93 x93Var = x93.this;
            dg0 dg0Var = x93Var.f53390j;
            if (dg0Var != null) {
                dg0Var.mo14364b(x93Var.f47131a);
            }
        }
    }

    /* renamed from: o.x93$c */
    public class C18082c extends Property {
        public C18082c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(x93 x93Var) {
            return Float.valueOf(x93Var.m55862o());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(x93 x93Var, Float f) {
            x93Var.m55867t(f.floatValue());
        }
    }

    /* renamed from: o.x93$d */
    public class C18083d extends Property {
        public C18083d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(x93 x93Var) {
            return Float.valueOf(x93Var.m55863p());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(x93 x93Var, Float f) {
            x93Var.m55868u(f.floatValue());
        }
    }

    public x93(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f53387g = 0;
        this.f53390j = null;
        this.f53386f = circularProgressIndicatorSpec;
        this.f53385e = new at6();
    }

    @Override // p001o.th8
    /* renamed from: a */
    public void mo43471a() {
        ObjectAnimator objectAnimator = this.f53383c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p001o.th8
    /* renamed from: c */
    public void mo43472c() {
        m55869v();
        m55866s();
    }

    @Override // p001o.th8
    /* renamed from: d */
    public void mo43473d(dg0 dg0Var) {
        this.f53390j = dg0Var;
    }

    @Override // p001o.th8
    /* renamed from: f */
    public void mo43474f() {
        ObjectAnimator objectAnimator = this.f53384d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f47131a.isVisible()) {
            this.f53384d.start();
        } else {
            mo43471a();
        }
    }

    @Override // p001o.th8
    /* renamed from: g */
    public void mo43475g() {
        m55864q();
        m55866s();
        this.f53383c.start();
    }

    @Override // p001o.th8
    /* renamed from: h */
    public void mo43476h() {
        this.f53390j = null;
    }

    /* renamed from: o */
    public final float m55862o() {
        return this.f53388h;
    }

    /* renamed from: p */
    public final float m55863p() {
        return this.f53389i;
    }

    /* renamed from: q */
    public final void m55864q() {
        if (this.f53383c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<x93, Float>) f53381n, 0.0f, 1.0f);
            this.f53383c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f53386f.f30246n * 5400.0f));
            this.f53383c.setInterpolator(null);
            this.f53383c.setRepeatCount(-1);
            this.f53383c.addListener(new C18080a());
        }
        if (this.f53384d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<x93, Float>) f53382o, 0.0f, 1.0f);
            this.f53384d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f53386f.f30246n * 333.0f));
            this.f53384d.setInterpolator(this.f53385e);
            this.f53384d.addListener(new C18081b());
        }
    }

    /* renamed from: r */
    public final void m55865r(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float fM49881b = m49881b(i, f53380m[i2], 333);
            if (fM49881b > 0.0f && fM49881b < 1.0f) {
                int i3 = i2 + this.f53387g;
                int[] iArr = this.f53386f.f30237e;
                int length = i3 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i4 = iArr[length];
                int i5 = iArr[length2];
                ((ez5.C13289a) this.f47132b.get(0)).f22434c = go0.m29179b().evaluate(this.f53385e.getInterpolation(fM49881b), Integer.valueOf(i4), Integer.valueOf(i5)).intValue();
                return;
            }
        }
    }

    /* renamed from: s */
    public void m55866s() {
        this.f53387g = 0;
        ((ez5.C13289a) this.f47132b.get(0)).f22434c = this.f53386f.f30237e[0];
        this.f53389i = 0.0f;
    }

    /* renamed from: t */
    public void m55867t(float f) {
        this.f53388h = f;
        int i = (int) (f * 5400.0f);
        m55870w(i);
        m55865r(i);
        this.f47131a.invalidateSelf();
    }

    /* renamed from: u */
    public final void m55868u(float f) {
        this.f53389i = f;
    }

    /* renamed from: v */
    public final void m55869v() {
        m55864q();
        this.f53383c.setDuration((long) (this.f53386f.f30246n * 5400.0f));
        this.f53384d.setDuration((long) (this.f53386f.f30246n * 333.0f));
    }

    /* renamed from: w */
    public final void m55870w(int i) {
        ez5.C13289a c13289a = (ez5.C13289a) this.f47132b.get(0);
        float f = this.f53388h;
        c13289a.f22432a = (f * 1520.0f) - 20.0f;
        c13289a.f22433b = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            c13289a.f22433b += this.f53385e.getInterpolation(m49881b(i, f53378k[i2], 667)) * 250.0f;
            c13289a.f22432a += this.f53385e.getInterpolation(m49881b(i, f53379l[i2], 667)) * 250.0f;
        }
        float f2 = c13289a.f22432a;
        float f3 = c13289a.f22433b;
        c13289a.f22432a = (f2 + ((f3 - f2) * this.f53389i)) / 360.0f;
        c13289a.f22433b = f3 / 360.0f;
    }
}

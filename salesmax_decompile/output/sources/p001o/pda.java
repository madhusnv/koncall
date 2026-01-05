package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p001o.ez5;

/* loaded from: classes3.dex */
public final class pda extends th8 {

    /* renamed from: i */
    public static final Property f39905i = new C16074b(Float.class, "animationFraction");

    /* renamed from: c */
    public ObjectAnimator f39906c;

    /* renamed from: d */
    public at6 f39907d;

    /* renamed from: e */
    public final je1 f39908e;

    /* renamed from: f */
    public int f39909f;

    /* renamed from: g */
    public boolean f39910g;

    /* renamed from: h */
    public float f39911h;

    /* renamed from: o.pda$a */
    public class C16073a extends AnimatorListenerAdapter {
        public C16073a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            pda pdaVar = pda.this;
            pdaVar.f39909f = (pdaVar.f39909f + 1) % pda.this.f39908e.f30237e.length;
            pda.this.f39910g = true;
        }
    }

    /* renamed from: o.pda$b */
    public class C16074b extends Property {
        public C16074b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(pda pdaVar) {
            return Float.valueOf(pdaVar.m43477n());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(pda pdaVar, Float f) {
            pdaVar.m43481r(f.floatValue());
        }
    }

    public pda(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f39909f = 1;
        this.f39908e = linearProgressIndicatorSpec;
        this.f39907d = new at6();
    }

    @Override // p001o.th8
    /* renamed from: a */
    public void mo43471a() {
        ObjectAnimator objectAnimator = this.f39906c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p001o.th8
    /* renamed from: c */
    public void mo43472c() {
        m43482s();
        m43480q();
    }

    @Override // p001o.th8
    /* renamed from: d */
    public void mo43473d(dg0 dg0Var) {
    }

    @Override // p001o.th8
    /* renamed from: f */
    public void mo43474f() {
    }

    @Override // p001o.th8
    /* renamed from: g */
    public void mo43475g() {
        m43478o();
        m43480q();
        this.f39906c.start();
    }

    @Override // p001o.th8
    /* renamed from: h */
    public void mo43476h() {
    }

    /* renamed from: n */
    public final float m43477n() {
        return this.f39911h;
    }

    /* renamed from: o */
    public final void m43478o() {
        if (this.f39906c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<pda, Float>) f39905i, 0.0f, 1.0f);
            this.f39906c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f39908e.f30246n * 333.0f));
            this.f39906c.setInterpolator(null);
            this.f39906c.setRepeatCount(-1);
            this.f39906c.addListener(new C16073a());
        }
    }

    /* renamed from: p */
    public final void m43479p() {
        if (!this.f39910g || ((ez5.C13289a) this.f47132b.get(1)).f22433b >= 1.0f) {
            return;
        }
        ((ez5.C13289a) this.f47132b.get(2)).f22434c = ((ez5.C13289a) this.f47132b.get(1)).f22434c;
        ((ez5.C13289a) this.f47132b.get(1)).f22434c = ((ez5.C13289a) this.f47132b.get(0)).f22434c;
        ((ez5.C13289a) this.f47132b.get(0)).f22434c = this.f39908e.f30237e[this.f39909f];
        this.f39910g = false;
    }

    /* renamed from: q */
    public void m43480q() {
        this.f39910g = true;
        this.f39909f = 1;
        for (ez5.C13289a c13289a : this.f47132b) {
            je1 je1Var = this.f39908e;
            c13289a.f22434c = je1Var.f30237e[0];
            c13289a.f22435d = je1Var.f30241i / 2;
        }
    }

    /* renamed from: r */
    public void m43481r(float f) {
        this.f39911h = f;
        m43483t((int) (f * 333.0f));
        m43479p();
        this.f47131a.invalidateSelf();
    }

    /* renamed from: s */
    public final void m43482s() {
        m43478o();
        this.f39906c.setDuration((long) (this.f39908e.f30246n * 333.0f));
    }

    /* renamed from: t */
    public final void m43483t(int i) {
        ((ez5.C13289a) this.f47132b.get(0)).f22432a = 0.0f;
        float fM49881b = m49881b(i, 0, 667);
        ez5.C13289a c13289a = (ez5.C13289a) this.f47132b.get(0);
        ez5.C13289a c13289a2 = (ez5.C13289a) this.f47132b.get(1);
        float interpolation = this.f39907d.getInterpolation(fM49881b);
        c13289a2.f22432a = interpolation;
        c13289a.f22433b = interpolation;
        ez5.C13289a c13289a3 = (ez5.C13289a) this.f47132b.get(1);
        ez5.C13289a c13289a4 = (ez5.C13289a) this.f47132b.get(2);
        float interpolation2 = this.f39907d.getInterpolation(fM49881b + 0.49925038f);
        c13289a4.f22432a = interpolation2;
        c13289a3.f22433b = interpolation2;
        ((ez5.C13289a) this.f47132b.get(2)).f22433b = 1.0f;
    }
}

package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import p001o.ez5;

/* loaded from: classes3.dex */
public final class y93 extends th8 {

    /* renamed from: k */
    public static final TimeInterpolator f55083k = gh0.f25147b;

    /* renamed from: l */
    public static final int[] f55084l = {0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 3000, 4500};

    /* renamed from: m */
    public static final float[] f55085m = {0.1f, 0.87f};

    /* renamed from: n */
    public static final Property f55086n = new C18358c(Float.class, "animationFraction");

    /* renamed from: o */
    public static final Property f55087o = new C18359d(Float.class, "completeEndFraction");

    /* renamed from: c */
    public ObjectAnimator f55088c;

    /* renamed from: d */
    public ObjectAnimator f55089d;

    /* renamed from: e */
    public final TimeInterpolator f55090e;

    /* renamed from: f */
    public final je1 f55091f;

    /* renamed from: g */
    public int f55092g;

    /* renamed from: h */
    public float f55093h;

    /* renamed from: i */
    public float f55094i;

    /* renamed from: j */
    public dg0 f55095j;

    /* renamed from: o.y93$a */
    public class C18356a extends AnimatorListenerAdapter {
        public C18356a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            y93 y93Var = y93.this;
            y93Var.f55092g = (y93Var.f55092g + y93.f55084l.length) % y93.this.f55091f.f30237e.length;
        }
    }

    /* renamed from: o.y93$b */
    public class C18357b extends AnimatorListenerAdapter {
        public C18357b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            y93.this.mo43471a();
            y93 y93Var = y93.this;
            dg0 dg0Var = y93Var.f55095j;
            if (dg0Var != null) {
                dg0Var.mo14364b(y93Var.f47131a);
            }
        }
    }

    /* renamed from: o.y93$c */
    public class C18358c extends Property {
        public C18358c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(y93 y93Var) {
            return Float.valueOf(y93Var.m57379p());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(y93 y93Var, Float f) {
            y93Var.m57384u(f.floatValue());
        }
    }

    /* renamed from: o.y93$d */
    public class C18359d extends Property {
        public C18359d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(y93 y93Var) {
            return Float.valueOf(y93Var.m57380q());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(y93 y93Var, Float f) {
            y93Var.m57385v(f.floatValue());
        }
    }

    public y93(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f55092g = 0;
        this.f55095j = null;
        this.f55091f = circularProgressIndicatorSpec;
        this.f55090e = umb.m51786g(context, x5e.motionEasingStandardInterpolator, f55083k);
    }

    @Override // p001o.th8
    /* renamed from: a */
    public void mo43471a() {
        ObjectAnimator objectAnimator = this.f55088c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p001o.th8
    /* renamed from: c */
    public void mo43472c() {
        m57386w();
        m57383t();
    }

    @Override // p001o.th8
    /* renamed from: d */
    public void mo43473d(dg0 dg0Var) {
        this.f55095j = dg0Var;
    }

    @Override // p001o.th8
    /* renamed from: f */
    public void mo43474f() {
        ObjectAnimator objectAnimator = this.f55089d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f47131a.isVisible()) {
            this.f55089d.start();
        } else {
            mo43471a();
        }
    }

    @Override // p001o.th8
    /* renamed from: g */
    public void mo43475g() {
        m57381r();
        m57383t();
        this.f55088c.start();
    }

    @Override // p001o.th8
    /* renamed from: h */
    public void mo43476h() {
        this.f55095j = null;
    }

    /* renamed from: p */
    public final float m57379p() {
        return this.f55093h;
    }

    /* renamed from: q */
    public final float m57380q() {
        return this.f55094i;
    }

    /* renamed from: r */
    public final void m57381r() {
        if (this.f55088c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<y93, Float>) f55086n, 0.0f, 1.0f);
            this.f55088c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f55091f.f30246n * 6000.0f));
            this.f55088c.setInterpolator(null);
            this.f55088c.setRepeatCount(-1);
            this.f55088c.addListener(new C18356a());
        }
        if (this.f55089d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<y93, Float>) f55087o, 0.0f, 1.0f);
            this.f55089d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f55091f.f30246n * 500.0f));
            this.f55089d.addListener(new C18357b());
        }
    }

    /* renamed from: s */
    public final void m57382s(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f55084l;
            if (i2 >= iArr.length) {
                return;
            }
            float fM49881b = m49881b(i, iArr[i2], 100);
            if (fM49881b >= 0.0f && fM49881b <= 1.0f) {
                int i3 = i2 + this.f55092g;
                int[] iArr2 = this.f55091f.f30237e;
                int length = i3 % iArr2.length;
                int length2 = (length + 1) % iArr2.length;
                int i4 = iArr2[length];
                int i5 = iArr2[length2];
                ((ez5.C13289a) this.f47132b.get(0)).f22434c = go0.m29179b().evaluate(this.f55090e.getInterpolation(fM49881b), Integer.valueOf(i4), Integer.valueOf(i5)).intValue();
                return;
            }
            i2++;
        }
    }

    /* renamed from: t */
    public void m57383t() {
        this.f55092g = 0;
        ((ez5.C13289a) this.f47132b.get(0)).f22434c = this.f55091f.f30237e[0];
        this.f55094i = 0.0f;
    }

    /* renamed from: u */
    public void m57384u(float f) {
        this.f55093h = f;
        int i = (int) (f * 6000.0f);
        m57387x(i);
        m57382s(i);
        this.f47131a.invalidateSelf();
    }

    /* renamed from: v */
    public final void m57385v(float f) {
        this.f55094i = f;
    }

    /* renamed from: w */
    public final void m57386w() {
        m57381r();
        this.f55088c.setDuration((long) (this.f55091f.f30246n * 6000.0f));
        this.f55089d.setDuration((long) (this.f55091f.f30246n * 500.0f));
    }

    /* renamed from: x */
    public final void m57387x(int i) {
        ez5.C13289a c13289a = (ez5.C13289a) this.f47132b.get(0);
        float f = this.f55093h * 1080.0f;
        float interpolation = 0.0f;
        for (int i2 : f55084l) {
            interpolation += this.f55090e.getInterpolation(m49881b(i, i2, 500)) * 90.0f;
        }
        c13289a.f22438g = f + interpolation;
        float interpolation2 = this.f55090e.getInterpolation(m49881b(i, 0, 3000)) - this.f55090e.getInterpolation(m49881b(i, 3000, 3000));
        c13289a.f22432a = 0.0f;
        float[] fArr = f55085m;
        float fM42807f = oza.m42807f(fArr[0], fArr[1], interpolation2);
        c13289a.f22433b = fM42807f;
        float f2 = this.f55094i;
        if (f2 > 0.0f) {
            c13289a.f22433b = fM42807f * (1.0f - f2);
        }
    }
}

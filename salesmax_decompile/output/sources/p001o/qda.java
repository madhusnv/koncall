package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Iterator;
import p001o.ez5;

/* loaded from: classes3.dex */
public final class qda extends th8 {

    /* renamed from: k */
    public static final int[] f41704k = {533, 567, 850, 750};

    /* renamed from: l */
    public static final int[] f41705l = {1267, 1000, 333, 0};

    /* renamed from: m */
    public static final Property f41706m = new C16350c(Float.class, "animationFraction");

    /* renamed from: c */
    public ObjectAnimator f41707c;

    /* renamed from: d */
    public ObjectAnimator f41708d;

    /* renamed from: e */
    public final Interpolator[] f41709e;

    /* renamed from: f */
    public final je1 f41710f;

    /* renamed from: g */
    public int f41711g;

    /* renamed from: h */
    public boolean f41712h;

    /* renamed from: i */
    public float f41713i;

    /* renamed from: j */
    public dg0 f41714j;

    /* renamed from: o.qda$a */
    public class C16348a extends AnimatorListenerAdapter {
        public C16348a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            qda qdaVar = qda.this;
            qdaVar.f41711g = (qdaVar.f41711g + 1) % qda.this.f41710f.f30237e.length;
            qda.this.f41712h = true;
        }
    }

    /* renamed from: o.qda$b */
    public class C16349b extends AnimatorListenerAdapter {
        public C16349b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            qda.this.mo43471a();
            qda qdaVar = qda.this;
            dg0 dg0Var = qdaVar.f41714j;
            if (dg0Var != null) {
                dg0Var.mo14364b(qdaVar.f47131a);
            }
        }
    }

    /* renamed from: o.qda$c */
    public class C16350c extends Property {
        public C16350c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(qda qdaVar) {
            return Float.valueOf(qdaVar.m45193n());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(qda qdaVar, Float f) {
            qdaVar.m45197r(f.floatValue());
        }
    }

    public qda(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f41711g = 0;
        this.f41714j = null;
        this.f41710f = linearProgressIndicatorSpec;
        this.f41709e = new Interpolator[]{hh0.m30433a(context, p5e.linear_indeterminate_line1_head_interpolator), hh0.m30433a(context, p5e.linear_indeterminate_line1_tail_interpolator), hh0.m30433a(context, p5e.linear_indeterminate_line2_head_interpolator), hh0.m30433a(context, p5e.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // p001o.th8
    /* renamed from: a */
    public void mo43471a() {
        ObjectAnimator objectAnimator = this.f41707c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p001o.th8
    /* renamed from: c */
    public void mo43472c() {
        m45198s();
        m45196q();
    }

    @Override // p001o.th8
    /* renamed from: d */
    public void mo43473d(dg0 dg0Var) {
        this.f41714j = dg0Var;
    }

    @Override // p001o.th8
    /* renamed from: f */
    public void mo43474f() {
        ObjectAnimator objectAnimator = this.f41708d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        mo43471a();
        if (this.f47131a.isVisible()) {
            this.f41708d.setFloatValues(this.f41713i, 1.0f);
            this.f41708d.setDuration((long) ((1.0f - this.f41713i) * 1800.0f));
            this.f41708d.start();
        }
    }

    @Override // p001o.th8
    /* renamed from: g */
    public void mo43475g() {
        m45194o();
        m45196q();
        this.f41707c.start();
    }

    @Override // p001o.th8
    /* renamed from: h */
    public void mo43476h() {
        this.f41714j = null;
    }

    /* renamed from: n */
    public final float m45193n() {
        return this.f41713i;
    }

    /* renamed from: o */
    public final void m45194o() {
        if (this.f41707c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<qda, Float>) f41706m, 0.0f, 1.0f);
            this.f41707c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f41710f.f30246n * 1800.0f));
            this.f41707c.setInterpolator(null);
            this.f41707c.setRepeatCount(-1);
            this.f41707c.addListener(new C16348a());
        }
        if (this.f41708d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<qda, Float>) f41706m, 1.0f);
            this.f41708d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f41710f.f30246n * 1800.0f));
            this.f41708d.setInterpolator(null);
            this.f41708d.addListener(new C16349b());
        }
    }

    /* renamed from: p */
    public final void m45195p() {
        if (this.f41712h) {
            Iterator it = this.f47132b.iterator();
            while (it.hasNext()) {
                ((ez5.C13289a) it.next()).f22434c = this.f41710f.f30237e[this.f41711g];
            }
            this.f41712h = false;
        }
    }

    /* renamed from: q */
    public void m45196q() {
        this.f41711g = 0;
        Iterator it = this.f47132b.iterator();
        while (it.hasNext()) {
            ((ez5.C13289a) it.next()).f22434c = this.f41710f.f30237e[0];
        }
    }

    /* renamed from: r */
    public void m45197r(float f) {
        this.f41713i = f;
        m45199t((int) (f * 1800.0f));
        m45195p();
        this.f47131a.invalidateSelf();
    }

    /* renamed from: s */
    public final void m45198s() {
        m45194o();
        this.f41707c.setDuration((long) (this.f41710f.f30246n * 1800.0f));
        this.f41708d.setDuration((long) (this.f41710f.f30246n * 1800.0f));
    }

    /* renamed from: t */
    public final void m45199t(int i) {
        for (int i2 = 0; i2 < this.f47132b.size(); i2++) {
            ez5.C13289a c13289a = (ez5.C13289a) this.f47132b.get(i2);
            int[] iArr = f41705l;
            int i3 = i2 * 2;
            int i4 = iArr[i3];
            int[] iArr2 = f41704k;
            c13289a.f22432a = pza.m44555a(this.f41709e[i3].getInterpolation(m49881b(i, i4, iArr2[i3])), 0.0f, 1.0f);
            int i5 = i3 + 1;
            c13289a.f22433b = pza.m44555a(this.f41709e[i5].getInterpolation(m49881b(i, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
        }
    }
}

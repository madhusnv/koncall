package p001o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;

/* loaded from: classes5.dex */
public class y0j {

    /* renamed from: a */
    public final View f54684a;

    /* renamed from: b */
    public AnimatorSet f54685b;

    /* renamed from: c */
    public AnimatorSet f54686c;

    /* renamed from: d */
    public float f54687d;

    /* renamed from: e */
    public float f54688e;

    /* renamed from: o.y0j$a */
    public class C18294a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f54689a;

        /* renamed from: b */
        public final /* synthetic */ View f54690b;

        public C18294a(View view) {
            this.f54690b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f54689a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super/*java.lang.Boolean*/.booleanValue();
            if (!this.f54689a) {
                this.f54690b.setVisibility(4);
            }
            this.f54689a = false;
        }
    }

    /* renamed from: o.y0j$b */
    public static abstract class AbstractC18295b {

        /* renamed from: a */
        public final View f54692a;

        /* renamed from: b */
        public int f54693b = t5e.fastscroll__default_show;

        /* renamed from: c */
        public int f54694c = t5e.fastscroll__default_hide;

        /* renamed from: d */
        public int f54695d = 1000;

        /* renamed from: e */
        public float f54696e = 0.5f;

        /* renamed from: f */
        public float f54697f = 0.5f;

        public AbstractC18295b(View view) {
            this.f54692a = view;
        }

        /* renamed from: a */
        public abstract y0j mo57098a();

        /* renamed from: b */
        public AbstractC18295b m57099b(float f) {
            this.f54696e = f;
            return this;
        }

        /* renamed from: c */
        public AbstractC18295b m57100c(float f) {
            this.f54697f = f;
            return this;
        }
    }

    /* renamed from: o.y0j$c */
    public static class C18296c extends AbstractC18295b {
        public C18296c(View view) {
            super(view);
        }

        @Override // p001o.y0j.AbstractC18295b
        /* renamed from: a */
        public y0j mo57098a() {
            return new y0j(this.f54692a, this.f54693b, this.f54694c, this.f54696e, this.f54697f, this.f54695d);
        }
    }

    public y0j(View view, int i, int i2, float f, float f2, int i3) {
        this.f54684a = view;
        this.f54687d = f;
        this.f54688e = f2;
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
        this.f54685b = animatorSet;
        animatorSet.setStartDelay(i3);
        this.f54685b.setTarget(view);
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i);
        this.f54686c = animatorSet2;
        animatorSet2.setTarget(view);
        this.f54685b.addListener(new C18294a(view));
        m57097c();
    }

    /* renamed from: a */
    public void m57095a() {
        m57097c();
        this.f54685b.start();
    }

    /* renamed from: b */
    public void m57096b() {
        this.f54685b.getParent();
        if (this.f54684a.getVisibility() == 4) {
            this.f54684a.setVisibility(0);
            m57097c();
            this.f54686c.start();
        }
    }

    /* renamed from: c */
    public void m57097c() {
        this.f54684a.setPivotX(this.f54687d * r0.getMeasuredWidth());
        this.f54684a.setPivotY(this.f54688e * r0.getMeasuredHeight());
    }
}

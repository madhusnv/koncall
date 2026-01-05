package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class m4f implements z0j {

    /* renamed from: a */
    public float f34785a;

    /* renamed from: b */
    public float f34786b;

    /* renamed from: c */
    public float f34787c;

    /* renamed from: d */
    public float f34788d;

    /* renamed from: e */
    public boolean f34789e;

    /* renamed from: f */
    public boolean f34790f;

    /* renamed from: o.m4f$a */
    public class C15223a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f34791a;

        /* renamed from: b */
        public final /* synthetic */ float f34792b;

        /* renamed from: c */
        public final /* synthetic */ float f34793c;

        public C15223a(View view, float f, float f2) {
            this.f34791a = view;
            this.f34792b = f;
            this.f34793c = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34791a.setScaleX(this.f34792b);
            this.f34791a.setScaleY(this.f34793c);
        }
    }

    public m4f() {
        this(true);
    }

    /* renamed from: c */
    public static Animator m38354c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f * scaleY, f2 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new C15223a(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // p001o.z0j
    /* renamed from: a */
    public Animator mo38355a(ViewGroup viewGroup, View view) {
        if (this.f34790f) {
            return this.f34789e ? m38354c(view, this.f34785a, this.f34786b) : m38354c(view, this.f34788d, this.f34787c);
        }
        return null;
    }

    @Override // p001o.z0j
    /* renamed from: b */
    public Animator mo38356b(ViewGroup viewGroup, View view) {
        return this.f34789e ? m38354c(view, this.f34787c, this.f34788d) : m38354c(view, this.f34786b, this.f34785a);
    }

    /* renamed from: d */
    public void m38357d(float f) {
        this.f34787c = f;
    }

    /* renamed from: e */
    public void m38358e(float f) {
        this.f34786b = f;
    }

    /* renamed from: f */
    public void m38359f(boolean z) {
        this.f34790f = z;
    }

    public m4f(boolean z) {
        this.f34785a = 1.0f;
        this.f34786b = 1.1f;
        this.f34787c = 0.8f;
        this.f34788d = 1.0f;
        this.f34790f = true;
        this.f34789e = z;
    }
}

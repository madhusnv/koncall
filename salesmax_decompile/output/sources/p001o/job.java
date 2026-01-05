package p001o;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes3.dex */
public class job implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final InterfaceC14622a f30850a;

    /* renamed from: b */
    public final View[] f30851b;

    /* renamed from: o.job$a */
    public interface InterfaceC14622a {
        /* renamed from: a */
        void mo27241a(ValueAnimator valueAnimator, View view);
    }

    public job(InterfaceC14622a interfaceC14622a, View... viewArr) {
        this.f30850a = interfaceC14622a;
        this.f30851b = viewArr;
    }

    /* renamed from: e */
    public static job m34156e(View... viewArr) {
        return new job(new InterfaceC14622a() { // from class: o.iob
            @Override // p001o.job.InterfaceC14622a
            /* renamed from: a */
            public final void mo27241a(ValueAnimator valueAnimator, View view) {
                job.m34158g(valueAnimator, view);
            }
        }, viewArr);
    }

    /* renamed from: f */
    public static job m34157f(View... viewArr) {
        return new job(new InterfaceC14622a() { // from class: o.fob
            @Override // p001o.job.InterfaceC14622a
            /* renamed from: a */
            public final void mo27241a(ValueAnimator valueAnimator, View view) {
                job.m34159h(valueAnimator, view);
            }
        }, viewArr);
    }

    /* renamed from: g */
    public static void m34158g(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: h */
    public static void m34159h(ValueAnimator valueAnimator, View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    /* renamed from: i */
    public static void m34160i(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: j */
    public static void m34161j(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: k */
    public static job m34162k(View... viewArr) {
        return new job(new InterfaceC14622a() { // from class: o.gob
            @Override // p001o.job.InterfaceC14622a
            /* renamed from: a */
            public final void mo27241a(ValueAnimator valueAnimator, View view) {
                job.m34160i(valueAnimator, view);
            }
        }, viewArr);
    }

    /* renamed from: l */
    public static job m34163l(View... viewArr) {
        return new job(new InterfaceC14622a() { // from class: o.hob
            @Override // p001o.job.InterfaceC14622a
            /* renamed from: a */
            public final void mo27241a(ValueAnimator valueAnimator, View view) {
                job.m34161j(valueAnimator, view);
            }
        }, viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.f30851b) {
            this.f30850a.mo27241a(valueAnimator, view);
        }
    }
}

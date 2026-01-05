package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* loaded from: classes3.dex */
public class wya extends pta {

    /* renamed from: g */
    public final float f52883g;

    /* renamed from: h */
    public final float f52884h;

    /* renamed from: i */
    public float f52885i;

    /* renamed from: j */
    public Rect f52886j;

    /* renamed from: k */
    public Rect f52887k;

    /* renamed from: l */
    public float[] f52888l;

    /* renamed from: o.wya$a */
    public class C18005a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f52889a;

        public C18005a(View view) {
            this.f52889a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f52889a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public wya(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f52883g = resources.getDimension(x6e.m3_back_progress_main_container_min_edge_gap);
        this.f52884h = resources.getDimension(x6e.m3_back_progress_main_container_max_translation_y);
    }

    /* renamed from: r */
    public static /* synthetic */ Object m55402r(float f, Object obj, Object obj2) {
        return m55405u((float[]) obj, (float[]) obj2, f);
    }

    /* renamed from: s */
    public static /* synthetic */ void m55403s(ClippableRoundedCornerLayout clippableRoundedCornerLayout, ValueAnimator valueAnimator) {
        clippableRoundedCornerLayout.m14751e((float[]) valueAnimator.getAnimatedValue());
    }

    /* renamed from: t */
    public static float[] m55404t(float[] fArr, float f, float f2) {
        return new float[]{gh0.m28647a(fArr[0], f, f2), gh0.m28647a(fArr[1], f, f2), gh0.m28647a(fArr[2], f, f2), gh0.m28647a(fArr[3], f, f2), gh0.m28647a(fArr[4], f, f2), gh0.m28647a(fArr[5], f, f2), gh0.m28647a(fArr[6], f, f2), gh0.m28647a(fArr[7], f, f2)};
    }

    /* renamed from: u */
    public static float[] m55405u(float[] fArr, float[] fArr2, float f) {
        return new float[]{gh0.m28647a(fArr[0], fArr2[0], f), gh0.m28647a(fArr[1], fArr2[1], f), gh0.m28647a(fArr[2], fArr2[2], f), gh0.m28647a(fArr[3], fArr2[3], f), gh0.m28647a(fArr[4], fArr2[4], f), gh0.m28647a(fArr[5], fArr2[5], f), gh0.m28647a(fArr[6], fArr2[6], f), gh0.m28647a(fArr[7], fArr2[7], f)};
    }

    /* renamed from: h */
    public final float[] m55406h() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.f40541b.getRootWindowInsets()) == null) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        DisplayMetrics displayMetrics = this.f40541b.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        this.f40541b.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int width = this.f40541b.getWidth();
        int height = this.f40541b.getHeight();
        int iM55415q = (i3 == 0 && i4 == 0) ? m55415q(rootWindowInsets, 0) : 0;
        int i5 = width + i3;
        float f = iM55415q;
        float fM55415q = (i5 < i || i4 != 0) ? 0 : m55415q(rootWindowInsets, 1);
        float fM55415q2 = (i5 < i || i4 + height < i2) ? 0 : m55415q(rootWindowInsets, 2);
        float fM55415q3 = (i3 != 0 || i4 + height < i2) ? 0 : m55415q(rootWindowInsets, 3);
        return new float[]{f, f, fM55415q, fM55415q, fM55415q2, fM55415q2, fM55415q3, fM55415q3};
    }

    /* renamed from: i */
    public void m55407i(View view) {
        if (super.m44147b() == null) {
            return;
        }
        AnimatorSet animatorSetM55410l = m55410l(view);
        View view2 = this.f40541b;
        if (view2 instanceof ClippableRoundedCornerLayout) {
            animatorSetM55410l.playTogether(m55409k((ClippableRoundedCornerLayout) view2));
        }
        animatorSetM55410l.setDuration(this.f40544e);
        animatorSetM55410l.start();
        m55416v();
    }

    /* renamed from: j */
    public void m55408j() {
        this.f52888l = null;
    }

    /* renamed from: k */
    public final ValueAnimator m55409k(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: o.uya
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                return wya.m55402r(f, obj, obj2);
            }
        }, clippableRoundedCornerLayout.getCornerRadii(), m55412n());
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.vya
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                wya.m55403s(clippableRoundedCornerLayout, valueAnimator);
            }
        });
        return valueAnimatorOfObject;
    }

    /* renamed from: l */
    public final AnimatorSet m55410l(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40541b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f40541b, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f40541b, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f40541b, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new C18005a(view));
        return animatorSet;
    }

    /* renamed from: m */
    public void m55411m(long j, View view) {
        AnimatorSet animatorSetM55410l = m55410l(view);
        animatorSetM55410l.setDuration(j);
        animatorSetM55410l.start();
        m55416v();
    }

    /* renamed from: n */
    public float[] m55412n() {
        if (this.f52888l == null) {
            this.f52888l = m55406h();
        }
        return this.f52888l;
    }

    /* renamed from: o */
    public Rect m55413o() {
        return this.f52887k;
    }

    /* renamed from: p */
    public Rect m55414p() {
        return this.f52886j;
    }

    /* renamed from: q */
    public final int m55415q(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    /* renamed from: v */
    public final void m55416v() {
        this.f52885i = 0.0f;
        this.f52886j = null;
        this.f52887k = null;
    }

    /* renamed from: w */
    public void m55417w(float f, View view) {
        this.f52886j = xzi.m57067c(this.f40541b);
        if (view != null) {
            this.f52887k = xzi.m57066b(this.f40541b, view);
        }
        this.f52885i = f;
    }

    /* renamed from: x */
    public void m55418x(l91 l91Var, View view) {
        super.m44149d(l91Var);
        m55417w(l91Var.m36808c(), view);
    }

    /* renamed from: y */
    public void m55419y(float f, boolean z, float f2, float f3) {
        float fM44146a = m44146a(f);
        float width = this.f40541b.getWidth();
        float height = this.f40541b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fM28647a = gh0.m28647a(1.0f, 0.9f, fM44146a);
        float fM28647a2 = gh0.m28647a(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - this.f52883g), fM44146a) * (z ? 1 : -1);
        float fMin = Math.min(Math.max(0.0f, ((height - (fM28647a * height)) / 2.0f) - this.f52883g), this.f52884h);
        float f4 = f2 - this.f52885i;
        float fM28647a3 = gh0.m28647a(0.0f, fMin, Math.abs(f4) / height) * Math.signum(f4);
        if (Float.isNaN(fM28647a) || Float.isNaN(fM28647a2) || Float.isNaN(fM28647a3)) {
            return;
        }
        this.f40541b.setScaleX(fM28647a);
        this.f40541b.setScaleY(fM28647a);
        this.f40541b.setTranslationX(fM28647a2);
        this.f40541b.setTranslationY(fM28647a3);
        View view = this.f40541b;
        if (view instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) view).m14751e(m55404t(m55412n(), f3, fM44146a));
        }
    }

    /* renamed from: z */
    public void m55420z(l91 l91Var, View view, float f) {
        if (super.m44150e(l91Var) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        m55419y(l91Var.m36806a(), l91Var.m36807b() == 0, l91Var.m36808c(), f);
    }
}

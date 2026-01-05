package p001o;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public abstract class i0i {

    /* renamed from: a */
    public static final Map f27881a = new ConcurrentHashMap();

    /* renamed from: o.i0i$a */
    public class C14148a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f27882a;

        /* renamed from: b */
        public final /* synthetic */ float f27883b;

        /* renamed from: c */
        public final /* synthetic */ boolean f27884c;

        public C14148a(View view, float f, boolean z) {
            this.f27882a = view;
            this.f27883b = f;
            this.f27884c = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            i0i.f27881a.remove(this.f27882a);
            i0i.m31345f(this.f27882a, this.f27884c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationEnd(animator);
            this.f27882a.setAlpha(this.f27883b);
            this.f27882a.setVisibility(0);
        }
    }

    /* renamed from: d */
    public static void m31343d(View view) {
        ObjectAnimator objectAnimator;
        Map map = f27881a;
        if (!map.containsKey(view) || (objectAnimator = (ObjectAnimator) map.get(view)) == null) {
            return;
        }
        objectAnimator.end();
    }

    /* renamed from: e */
    public static /* synthetic */ void m31344e(int i, View view, ValueAnimator valueAnimator) {
        m31348i(view, (int) (i * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        view.requestLayout();
    }

    /* renamed from: f */
    public static void m31345f(View view, boolean z) {
        m31348i(view, z ? 0 : -2);
        view.setAlpha(z ? 0.0f : 1.0f);
        view.setVisibility(z ? 8 : 0);
    }

    /* renamed from: g */
    public static void m31346g(final View view, boolean z) {
        int height = view.getHeight();
        view.measure(-1, -2);
        final int measuredHeight = view.getMeasuredHeight();
        if (height < 0) {
            height = z ? measuredHeight : 0;
            m31348i(view, height);
        }
        float f = measuredHeight;
        float f2 = height / f;
        float f3 = z ? 0.0f : 1.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 == f3) {
            m31343d(view);
            m31345f(view, z);
            return;
        }
        long jAbs = ((int) ((f * Math.abs(f3 - f2)) / view.getContext().getResources().getDisplayMetrics().density)) * 2;
        if (jAbs < 150) {
            jAbs = 150;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f2, f3);
        objectAnimatorOfFloat.setDuration(jAbs);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.h0i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                i0i.m31344e(measuredHeight, view, valueAnimator);
            }
        });
        objectAnimatorOfFloat.addListener(new C14148a(view, f2, z));
        m31343d(view);
        f27881a.put(view, objectAnimatorOfFloat);
        objectAnimatorOfFloat.start();
    }

    /* renamed from: h */
    public static void m31347h(AppCompatButton appCompatButton, int i, int i2, int i3, int i4) {
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, new int[0]};
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{i3, i3, i});
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{i4, i4, i2});
        wvi.q0(appCompatButton, colorStateList);
        appCompatButton.setTextColor(colorStateList2);
    }

    /* renamed from: i */
    public static void m31348i(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    public static void m31349j(View view, boolean z) {
        if (z) {
            m31346g(view, false);
        } else {
            m31343d(view);
            m31345f(view, false);
        }
    }

    /* renamed from: k */
    public static void m31350k(View view, boolean z) {
        if (z) {
            m31346g(view, true);
        } else {
            m31343d(view);
            m31345f(view, true);
        }
    }
}

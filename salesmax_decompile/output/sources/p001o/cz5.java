package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes3.dex */
public abstract class cz5 {

    /* renamed from: a */
    public static final int f18872a = Color.alpha(-1728053248);

    /* renamed from: o.cz5$a */
    public class C12772a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ DrawerLayout f18873a;

        /* renamed from: b */
        public final /* synthetic */ View f18874b;

        public C12772a(DrawerLayout drawerLayout, View view) {
            this.f18873a = drawerLayout;
            this.f18874b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18873a.m6011i(this.f18874b, false);
            this.f18873a.setScrimColor(-1728053248);
        }
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m22127b(DrawerLayout drawerLayout, View view) {
        return new C12772a(drawerLayout, view);
    }

    /* renamed from: c */
    public static ValueAnimator.AnimatorUpdateListener m22128c(final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: o.bz5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cz5.m22129d(drawerLayout, valueAnimator);
            }
        };
    }

    /* renamed from: d */
    public static /* synthetic */ void m22129d(DrawerLayout drawerLayout, ValueAnimator valueAnimator) {
        drawerLayout.setScrimColor(ni3.m40624p(-1728053248, gh0.m28649c(f18872a, 0, valueAnimator.getAnimatedFraction())));
    }
}

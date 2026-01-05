package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.C11095a;
import com.google.android.material.search.SearchView;
import java.util.Objects;
import p001o.az5;
import p001o.fte;
import p001o.fy5;
import p001o.gh0;
import p001o.ish;
import p001o.job;
import p001o.l91;
import p001o.nfe;
import p001o.ps6;
import p001o.rs6;
import p001o.wya;
import p001o.xzi;

/* renamed from: com.google.android.material.search.a */
/* loaded from: classes3.dex */
public class C11095a {

    /* renamed from: a */
    public final SearchView f12855a;

    /* renamed from: b */
    public final View f12856b;

    /* renamed from: c */
    public final ClippableRoundedCornerLayout f12857c;

    /* renamed from: d */
    public final FrameLayout f12858d;

    /* renamed from: e */
    public final FrameLayout f12859e;

    /* renamed from: f */
    public final Toolbar f12860f;

    /* renamed from: g */
    public final Toolbar f12861g;

    /* renamed from: h */
    public final LinearLayout f12862h;

    /* renamed from: i */
    public final TextView f12863i;

    /* renamed from: j */
    public final EditText f12864j;

    /* renamed from: k */
    public final ImageButton f12865k;

    /* renamed from: l */
    public final View f12866l;

    /* renamed from: m */
    public final TouchObserverFrameLayout f12867m;

    /* renamed from: n */
    public final wya f12868n;

    /* renamed from: o */
    public AnimatorSet f12869o;

    /* renamed from: p */
    public SearchBar f12870p;

    /* renamed from: com.google.android.material.search.a$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!C11095a.this.f12855a.m14973s()) {
                C11095a.this.f12855a.m14952J();
            }
            C11095a.this.f12855a.setTransitionState(SearchView.EnumC11094b.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11095a.this.f12857c.setVisibility(0);
            C11095a.this.f12870p.m14926Z();
        }
    }

    /* renamed from: com.google.android.material.search.a$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C11095a.this.f12857c.setVisibility(8);
            if (!C11095a.this.f12855a.m14973s()) {
                C11095a.this.f12855a.m14970p();
            }
            C11095a.this.f12855a.setTransitionState(SearchView.EnumC11094b.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11095a.this.f12855a.setTransitionState(SearchView.EnumC11094b.HIDING);
        }
    }

    /* renamed from: com.google.android.material.search.a$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!C11095a.this.f12855a.m14973s()) {
                C11095a.this.f12855a.m14952J();
            }
            C11095a.this.f12855a.setTransitionState(SearchView.EnumC11094b.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11095a.this.f12857c.setVisibility(0);
            C11095a.this.f12855a.setTransitionState(SearchView.EnumC11094b.SHOWING);
        }
    }

    /* renamed from: com.google.android.material.search.a$d */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C11095a.this.f12857c.setVisibility(8);
            if (!C11095a.this.f12855a.m14973s()) {
                C11095a.this.f12855a.m14970p();
            }
            C11095a.this.f12855a.setTransitionState(SearchView.EnumC11094b.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11095a.this.f12855a.setTransitionState(SearchView.EnumC11094b.HIDING);
        }
    }

    /* renamed from: com.google.android.material.search.a$e */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f12875a;

        public e(boolean z) {
            this.f12875a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C11095a.this.b0(this.f12875a ? 1.0f : 0.0f);
            C11095a.this.f12857c.m14747a();
            if (this.f12875a) {
                return;
            }
            C11095a.this.f12868n.m55408j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11095a.this.b0(this.f12875a ? 0.0f : 1.0f);
        }
    }

    public C11095a(SearchView searchView) {
        this.f12855a = searchView;
        this.f12856b = searchView.f12840a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f12841b;
        this.f12857c = clippableRoundedCornerLayout;
        this.f12858d = searchView.f12844e;
        this.f12859e = searchView.f12845f;
        this.f12860f = searchView.f12846g;
        this.f12861g = searchView.f12847h;
        this.f12863i = searchView.f12848q;
        this.f12864j = searchView.f12850x;
        this.f12865k = searchView.f12851y;
        this.f12866l = searchView.f12836H;
        this.f12867m = searchView.f12837L;
        this.f12862h = searchView.f12849s;
        this.f12868n = new wya(clippableRoundedCornerLayout);
    }

    /* renamed from: R */
    public static /* synthetic */ void m14983R(ImageButton imageButton, ValueAnimator valueAnimator) {
        imageButton.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: S */
    public static /* synthetic */ void m14984S(az5 az5Var, ValueAnimator valueAnimator) {
        az5Var.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: T */
    public static /* synthetic */ void m14985T(ps6 ps6Var, ValueAnimator valueAnimator) {
        ps6Var.m44104a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m14986U(float f, float[] fArr, Rect rect, ValueAnimator valueAnimator) {
        this.f12857c.m14749c(rect, m14989X(f, fArr, valueAnimator.getAnimatedFraction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m14987V() {
        AnimatorSet animatorSetM15006E = m15006E(true);
        animatorSetM15006E.addListener(new a());
        animatorSetM15006E.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m14988W() {
        this.f12857c.setTranslationY(r0.getHeight());
        AnimatorSet animatorSetM15014M = m15014M(true);
        animatorSetM15014M.addListener(new c());
        animatorSetM15014M.start();
    }

    /* renamed from: X */
    public static float[] m14989X(float f, float[] fArr, float f2) {
        return new float[]{gh0.m28647a(f, fArr[0], f2), gh0.m28647a(f, fArr[1], f2), gh0.m28647a(f, fArr[2], f2), gh0.m28647a(f, fArr[3], f2), gh0.m28647a(f, fArr[4], f2), gh0.m28647a(f, fArr[5], f2), gh0.m28647a(f, fArr[6], f2), gh0.m28647a(f, fArr[7], f2)};
    }

    /* renamed from: Y */
    public static float[] m14990Y(float[] fArr, float[] fArr2) {
        return new float[]{Math.max(fArr[0], fArr2[0]), Math.max(fArr[1], fArr2[1]), Math.max(fArr[2], fArr2[2]), Math.max(fArr[3], fArr2[3]), Math.max(fArr[4], fArr2[4]), Math.max(fArr[5], fArr2[5]), Math.max(fArr[6], fArr2[6]), Math.max(fArr[7], fArr2[7])};
    }

    /* renamed from: A */
    public final Animator m15002A(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(fte.m27470a(z, gh0.f25147b));
        valueAnimatorOfFloat.addUpdateListener(job.m34157f(this.f12867m));
        return valueAnimatorOfFloat;
    }

    /* renamed from: B */
    public final Animator m15003B(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f12867m.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(fte.m27470a(z, gh0.f25147b));
        valueAnimatorOfFloat.addUpdateListener(job.m34163l(this.f12866l));
        return valueAnimatorOfFloat;
    }

    /* renamed from: C */
    public final Animator m15004C(boolean z) {
        Toolbar toolbar = this.f12861g;
        return m15015N(z, toolbar, m15007F(toolbar), m15009H());
    }

    /* renamed from: D */
    public final Animator m15005D(boolean z) {
        return m15016O(z, this.f12864j);
    }

    /* renamed from: E */
    public final AnimatorSet m15006E(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (!(this.f12869o != null)) {
            animatorSet.playTogether(m15030v(z), m15031w(z));
        }
        animatorSet.playTogether(m15012K(z), m15011J(z), m15032x(z), m15034z(z), m15010I(z), m15004C(z), m15028t(z), m15005D(z), m15013L(z));
        animatorSet.addListener(new e(z));
        return animatorSet;
    }

    /* renamed from: F */
    public final int m15007F(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        return xzi.m57079o(this.f12870p) ? this.f12870p.getLeft() - marginEnd : (this.f12870p.getRight() - this.f12855a.getWidth()) + marginEnd;
    }

    /* renamed from: G */
    public final int m15008G(View view) {
        int marginStart = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginStart();
        int paddingStart = this.f12870p.getPaddingStart();
        return xzi.m57079o(this.f12870p) ? ((this.f12870p.getWidth() - this.f12870p.getRight()) + marginStart) - paddingStart : (this.f12870p.getLeft() - marginStart) + paddingStart;
    }

    /* renamed from: H */
    public final int m15009H() {
        return ((this.f12870p.getTop() + (this.f12870p.getParent() != null ? ((View) this.f12870p.getParent()).getTop() : 0)) + (this.f12870p.getMeasuredHeight() / 2)) - (this.f12859e.getTop() + (this.f12859e.getMeasuredHeight() / 2));
    }

    /* renamed from: I */
    public final Animator m15010I(boolean z) {
        FrameLayout frameLayout = this.f12858d;
        return m15015N(z, frameLayout, m15007F(frameLayout), m15009H());
    }

    /* renamed from: J */
    public final Animator m15011J(boolean z) {
        Rect rectM55414p = this.f12868n.m55414p();
        Rect rectM55413o = this.f12868n.m55413o();
        if (rectM55414p == null) {
            rectM55414p = xzi.m57067c(this.f12855a);
        }
        if (rectM55413o == null) {
            rectM55413o = xzi.m57066b(this.f12857c, this.f12870p);
        }
        final Rect rect = new Rect(rectM55413o);
        final float cornerSize = this.f12870p.getCornerSize();
        final float[] fArrM14990Y = m14990Y(this.f12857c.getCornerRadii(), this.f12868n.m55412n());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new nfe(rect), rectM55413o, rectM55414p);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.jaf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f30061a.m14986U(cornerSize, fArrM14990Y, rect, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(z ? 300L : 250L);
        valueAnimatorOfObject.setInterpolator(fte.m27470a(z, gh0.f25147b));
        return valueAnimatorOfObject;
    }

    /* renamed from: K */
    public final Animator m15012K(boolean z) {
        TimeInterpolator timeInterpolator = z ? gh0.f25146a : gh0.f25147b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setStartDelay(z ? 100L : 0L);
        valueAnimatorOfFloat.setInterpolator(fte.m27470a(z, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(job.m34156e(this.f12856b));
        return valueAnimatorOfFloat;
    }

    /* renamed from: L */
    public final Animator m15013L(boolean z) {
        return m15016O(z, this.f12863i);
    }

    /* renamed from: M */
    public final AnimatorSet m15014M(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m15017P());
        m15022n(animatorSet);
        animatorSet.setInterpolator(fte.m27470a(z, gh0.f25147b));
        animatorSet.setDuration(z ? 350L : 300L);
        return animatorSet;
    }

    /* renamed from: N */
    public final Animator m15015N(boolean z, View view, int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(job.m34162k(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i2, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(job.m34163l(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(fte.m27470a(z, gh0.f25147b));
        return animatorSet;
    }

    /* renamed from: O */
    public final Animator m15016O(boolean z, View view) {
        TextView textView = this.f12870p.getTextView();
        int iMax = 0;
        if (!TextUtils.isEmpty(textView.getText()) && this.f12870p.getTextCentered() && textView.getHint() != textView.getText()) {
            String string = textView.getText().toString();
            Rect rect = new Rect();
            textView.getPaint().getTextBounds(string, 0, string.length(), rect);
            iMax = Math.max(0, (this.f12870p.getTextView().getMeasuredWidth() / 2) - (rect.width() / 2));
        }
        return m15015N(z, view, ((this.f12870p.getTextView().getLeft() + iMax) + this.f12870p.getLeft()) - (view.getLeft() + this.f12862h.getLeft()), m15009H());
    }

    /* renamed from: P */
    public final Animator m15017P() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f12857c.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(job.m34163l(this.f12857c));
        return valueAnimatorOfFloat;
    }

    /* renamed from: Q */
    public AnimatorSet m15018Q() {
        return this.f12870p != null ? i0() : j0();
    }

    /* renamed from: Z */
    public l91 m15019Z() {
        return this.f12868n.m44148c();
    }

    public final void a0(float f) {
        ActionMenuView actionMenuViewM32697a;
        if (!this.f12855a.m14976v() || (actionMenuViewM32697a = ish.m32697a(this.f12860f)) == null) {
            return;
        }
        actionMenuViewM32697a.setAlpha(f);
    }

    public final void b0(float f) {
        this.f12865k.setAlpha(f);
        this.f12866l.setAlpha(f);
        this.f12867m.setAlpha(f);
        a0(f);
    }

    public final void c0(Drawable drawable) {
        if (drawable instanceof az5) {
            ((az5) drawable).setProgress(1.0f);
        }
        if (drawable instanceof ps6) {
            ((ps6) drawable).m44104a(1.0f);
        }
    }

    public final void d0(Toolbar toolbar) {
        ActionMenuView actionMenuViewM32697a = ish.m32697a(toolbar);
        if (actionMenuViewM32697a != null) {
            for (int i = 0; i < actionMenuViewM32697a.getChildCount(); i++) {
                View childAt = actionMenuViewM32697a.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    public void e0(SearchBar searchBar) {
        this.f12870p = searchBar;
    }

    public final void f0() {
        Menu menu = this.f12861g.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.f12870p.getMenuResId() == -1 || !this.f12855a.m14976v()) {
            this.f12861g.setVisibility(8);
            return;
        }
        this.f12861g.mo4433x(this.f12870p.getMenuResId());
        d0(this.f12861g);
        this.f12861g.setVisibility(0);
    }

    public void g0() {
        if (this.f12870p != null) {
            k0();
        } else {
            l0();
        }
    }

    public void h0(l91 l91Var) {
        this.f12868n.m55418x(l91Var, this.f12870p);
    }

    public final AnimatorSet i0() {
        if (this.f12855a.m14973s()) {
            this.f12855a.m14970p();
        }
        AnimatorSet animatorSetM15006E = m15006E(false);
        animatorSetM15006E.addListener(new b());
        animatorSetM15006E.start();
        return animatorSetM15006E;
    }

    public final AnimatorSet j0() {
        if (this.f12855a.m14973s()) {
            this.f12855a.m14970p();
        }
        AnimatorSet animatorSetM15014M = m15014M(false);
        animatorSetM15014M.addListener(new d());
        animatorSetM15014M.start();
        return animatorSetM15014M;
    }

    public final void k0() {
        if (this.f12855a.m14973s()) {
            this.f12855a.m14952J();
        }
        this.f12855a.setTransitionState(SearchView.EnumC11094b.SHOWING);
        f0();
        this.f12864j.setText(this.f12870p.getText());
        EditText editText = this.f12864j;
        editText.setSelection(editText.getText().length());
        this.f12857c.setVisibility(4);
        this.f12857c.post(new Runnable() { // from class: o.gaf
            @Override // java.lang.Runnable
            public final void run() {
                this.f24839a.m14987V();
            }
        });
    }

    /* renamed from: l */
    public final void m15020l(AnimatorSet animatorSet) {
        ActionMenuView actionMenuViewM32697a = ish.m32697a(this.f12860f);
        if (actionMenuViewM32697a == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m15007F(actionMenuViewM32697a), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(job.m34162k(actionMenuViewM32697a));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(m15009H(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(job.m34163l(actionMenuViewM32697a));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    public final void l0() {
        if (this.f12855a.m14973s()) {
            final SearchView searchView = this.f12855a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: o.haf
                @Override // java.lang.Runnable
                public final void run() {
                    searchView.m14952J();
                }
            }, 150L);
        }
        this.f12857c.setVisibility(4);
        this.f12857c.post(new Runnable() { // from class: o.iaf
            @Override // java.lang.Runnable
            public final void run() {
                this.f28349a.m14988W();
            }
        });
    }

    /* renamed from: m */
    public final void m15021m(AnimatorSet animatorSet, final ImageButton imageButton) {
        SearchBar searchBar = this.f12870p;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.faf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C11095a.m14983R(imageButton, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    public void m0(l91 l91Var) {
        if (l91Var.m36806a() <= 0.0f) {
            return;
        }
        wya wyaVar = this.f12868n;
        SearchBar searchBar = this.f12870p;
        wyaVar.m55420z(l91Var, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.f12869o;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (l91Var.m36806a() * this.f12869o.getDuration()));
            return;
        }
        if (this.f12855a.m14973s()) {
            this.f12855a.m14970p();
        }
        if (this.f12855a.m14974t()) {
            AnimatorSet animatorSetM15030v = m15030v(false);
            this.f12869o = animatorSetM15030v;
            animatorSetM15030v.start();
            this.f12869o.pause();
        }
    }

    /* renamed from: n */
    public final void m15022n(AnimatorSet animatorSet) {
        ImageButton imageButtonM32700d = ish.m32700d(this.f12860f);
        if (imageButtonM32700d == null) {
            return;
        }
        Drawable drawableM27743q = fy5.m27743q(imageButtonM32700d.getDrawable());
        if (!this.f12855a.m14974t()) {
            c0(drawableM27743q);
            return;
        }
        m15024p(animatorSet, drawableM27743q);
        m15025q(animatorSet, drawableM27743q);
        m15021m(animatorSet, imageButtonM32700d);
    }

    /* renamed from: o */
    public final void m15023o(AnimatorSet animatorSet) {
        ImageButton imageButtonM32700d = ish.m32700d(this.f12860f);
        if (imageButtonM32700d == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m15008G(imageButtonM32700d), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(job.m34162k(imageButtonM32700d));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(m15009H(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(job.m34163l(imageButtonM32700d));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    /* renamed from: p */
    public final void m15024p(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof az5) {
            final az5 az5Var = (az5) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.eaf
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C11095a.m14984S(az5Var, valueAnimator);
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    /* renamed from: q */
    public final void m15025q(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof ps6) {
            final ps6 ps6Var = (ps6) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.daf
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C11095a.m14985T(ps6Var, valueAnimator);
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    /* renamed from: r */
    public void m15026r() {
        this.f12868n.m55407i(this.f12870p);
        AnimatorSet animatorSet = this.f12869o;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f12869o = null;
    }

    /* renamed from: s */
    public void m15027s() {
        this.f12868n.m55411m(m15018Q().getTotalDuration(), this.f12870p);
        if (this.f12869o != null) {
            m15031w(false).start();
            this.f12869o.resume();
        }
        this.f12869o = null;
    }

    /* renamed from: t */
    public final Animator m15028t(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(fte.m27470a(z, gh0.f25147b));
        if (this.f12855a.m14976v()) {
            valueAnimatorOfFloat.addUpdateListener(new rs6(ish.m32697a(this.f12861g), ish.m32697a(this.f12860f)));
        }
        return valueAnimatorOfFloat;
    }

    /* renamed from: u */
    public wya m15029u() {
        return this.f12868n;
    }

    /* renamed from: v */
    public final AnimatorSet m15030v(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        m15022n(animatorSet);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(fte.m27470a(z, gh0.f25147b));
        return animatorSet;
    }

    /* renamed from: w */
    public final AnimatorSet m15031w(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        m15023o(animatorSet);
        m15020l(animatorSet);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(fte.m27470a(z, gh0.f25147b));
        return animatorSet;
    }

    /* renamed from: x */
    public final Animator m15032x(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 50L : 42L);
        valueAnimatorOfFloat.setStartDelay(z ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(fte.m27470a(z, gh0.f25146a));
        valueAnimatorOfFloat.addUpdateListener(job.m34156e(this.f12865k));
        return valueAnimatorOfFloat;
    }

    /* renamed from: y */
    public final Animator m15033y(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 150L : 83L);
        valueAnimatorOfFloat.setStartDelay(z ? 75L : 0L);
        valueAnimatorOfFloat.setInterpolator(fte.m27470a(z, gh0.f25146a));
        valueAnimatorOfFloat.addUpdateListener(job.m34156e(this.f12866l, this.f12867m));
        return valueAnimatorOfFloat;
    }

    /* renamed from: z */
    public final Animator m15034z(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m15033y(z), m15003B(z), m15002A(z));
        return animatorSet;
    }
}

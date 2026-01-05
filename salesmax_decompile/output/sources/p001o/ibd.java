package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ibd {

    /* renamed from: A */
    public boolean f28397A;

    /* renamed from: B */
    public boolean f28398B;

    /* renamed from: a */
    public final PlayerControlView f28400a;

    /* renamed from: b */
    public final View f28401b;

    /* renamed from: c */
    public final ViewGroup f28402c;

    /* renamed from: d */
    public final ViewGroup f28403d;

    /* renamed from: e */
    public final ViewGroup f28404e;

    /* renamed from: f */
    public final ViewGroup f28405f;

    /* renamed from: g */
    public final ViewGroup f28406g;

    /* renamed from: h */
    public final ViewGroup f28407h;

    /* renamed from: i */
    public final ViewGroup f28408i;

    /* renamed from: j */
    public final View f28409j;

    /* renamed from: k */
    public final View f28410k;

    /* renamed from: l */
    public final AnimatorSet f28411l;

    /* renamed from: m */
    public final AnimatorSet f28412m;

    /* renamed from: n */
    public final AnimatorSet f28413n;

    /* renamed from: o */
    public final AnimatorSet f28414o;

    /* renamed from: p */
    public final AnimatorSet f28415p;

    /* renamed from: q */
    public final ValueAnimator f28416q;

    /* renamed from: r */
    public final ValueAnimator f28417r;

    /* renamed from: s */
    public final Runnable f28418s = new Runnable() { // from class: o.vad
        @Override // java.lang.Runnable
        public final void run() {
            this.f50080a.c0();
        }
    };

    /* renamed from: t */
    public final Runnable f28419t = new Runnable() { // from class: o.bbd
        @Override // java.lang.Runnable
        public final void run() {
            this.f15875a.m31869D();
        }
    };

    /* renamed from: u */
    public final Runnable f28420u = new Runnable() { // from class: o.cbd
        @Override // java.lang.Runnable
        public final void run() {
            this.f17758a.m31873H();
        }
    };

    /* renamed from: v */
    public final Runnable f28421v = new Runnable() { // from class: o.dbd
        @Override // java.lang.Runnable
        public final void run() {
            this.f19533a.m31872G();
        }
    };

    /* renamed from: w */
    public final Runnable f28422w = new Runnable() { // from class: o.ebd
        @Override // java.lang.Runnable
        public final void run() {
            this.f21327a.m31870E();
        }
    };

    /* renamed from: x */
    public final View.OnLayoutChangeListener f28423x = new View.OnLayoutChangeListener() { // from class: o.fbd
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f23098a.m31878R(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    };

    /* renamed from: C */
    public boolean f28399C = true;

    /* renamed from: z */
    public int f28425z = 0;

    /* renamed from: y */
    public final List f28424y = new ArrayList();

    /* renamed from: o.ibd$a */
    public class C14239a extends AnimatorListenerAdapter {
        public C14239a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (ibd.this.f28401b != null) {
                ibd.this.f28401b.setVisibility(4);
            }
            if (ibd.this.f28402c != null) {
                ibd.this.f28402c.setVisibility(4);
            }
            if (ibd.this.f28404e != null) {
                ibd.this.f28404e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(ibd.this.f28409j instanceof DefaultTimeBar) || ibd.this.f28397A) {
                return;
            }
            ((DefaultTimeBar) ibd.this.f28409j).m7624g(250L);
        }
    }

    /* renamed from: o.ibd$b */
    public class C14240b extends AnimatorListenerAdapter {
        public C14240b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (ibd.this.f28401b != null) {
                ibd.this.f28401b.setVisibility(0);
            }
            if (ibd.this.f28402c != null) {
                ibd.this.f28402c.setVisibility(0);
            }
            if (ibd.this.f28404e != null) {
                ibd.this.f28404e.setVisibility(ibd.this.f28397A ? 0 : 4);
            }
            if (!(ibd.this.f28409j instanceof DefaultTimeBar) || ibd.this.f28397A) {
                return;
            }
            ((DefaultTimeBar) ibd.this.f28409j).m7633t(250L);
        }
    }

    /* renamed from: o.ibd$c */
    public class C14241c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ PlayerControlView f28428a;

        public C14241c(PlayerControlView playerControlView) {
            this.f28428a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ibd.this.m31886Z(1);
            if (ibd.this.f28398B) {
                this.f28428a.post(ibd.this.f28418s);
                ibd.this.f28398B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ibd.this.m31886Z(3);
        }
    }

    /* renamed from: o.ibd$d */
    public class C14242d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ PlayerControlView f28430a;

        public C14242d(PlayerControlView playerControlView) {
            this.f28430a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ibd.this.m31886Z(2);
            if (ibd.this.f28398B) {
                this.f28430a.post(ibd.this.f28418s);
                ibd.this.f28398B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ibd.this.m31886Z(3);
        }
    }

    /* renamed from: o.ibd$e */
    public class C14243e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ PlayerControlView f28432a;

        public C14243e(PlayerControlView playerControlView) {
            this.f28432a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ibd.this.m31886Z(2);
            if (ibd.this.f28398B) {
                this.f28432a.post(ibd.this.f28418s);
                ibd.this.f28398B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ibd.this.m31886Z(3);
        }
    }

    /* renamed from: o.ibd$f */
    public class C14244f extends AnimatorListenerAdapter {
        public C14244f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ibd.this.m31886Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ibd.this.m31886Z(4);
        }
    }

    /* renamed from: o.ibd$g */
    public class C14245g extends AnimatorListenerAdapter {
        public C14245g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ibd.this.m31886Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ibd.this.m31886Z(4);
        }
    }

    /* renamed from: o.ibd$h */
    public class C14246h extends AnimatorListenerAdapter {
        public C14246h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (ibd.this.f28405f != null) {
                ibd.this.f28405f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (ibd.this.f28407h != null) {
                ibd.this.f28407h.setVisibility(0);
                ibd.this.f28407h.setTranslationX(ibd.this.f28407h.getWidth());
                ibd.this.f28407h.scrollTo(ibd.this.f28407h.getWidth(), 0);
            }
        }
    }

    /* renamed from: o.ibd$i */
    public class C14247i extends AnimatorListenerAdapter {
        public C14247i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (ibd.this.f28407h != null) {
                ibd.this.f28407h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (ibd.this.f28405f != null) {
                ibd.this.f28405f.setVisibility(0);
            }
        }
    }

    public ibd(PlayerControlView playerControlView) throws Resources.NotFoundException {
        this.f28400a = playerControlView;
        this.f28401b = playerControlView.findViewById(a8e.exo_controls_background);
        this.f28402c = (ViewGroup) playerControlView.findViewById(a8e.exo_center_controls);
        this.f28404e = (ViewGroup) playerControlView.findViewById(a8e.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(a8e.exo_bottom_bar);
        this.f28403d = viewGroup;
        this.f28408i = (ViewGroup) playerControlView.findViewById(a8e.exo_time);
        View viewFindViewById = playerControlView.findViewById(a8e.exo_progress);
        this.f28409j = viewFindViewById;
        this.f28405f = (ViewGroup) playerControlView.findViewById(a8e.exo_basic_controls);
        this.f28406g = (ViewGroup) playerControlView.findViewById(a8e.exo_extra_controls);
        this.f28407h = (ViewGroup) playerControlView.findViewById(a8e.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(a8e.exo_overflow_show);
        this.f28410k = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(a8e.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: o.gbd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f24875a.m31880T(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: o.gbd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f24875a.m31880T(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.hbd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f26585a.m31837J(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C14239a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.wad
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f51702a.m31838K(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new C14240b());
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(g7e.exo_styled_bottom_bar_height) - resources.getDimension(g7e.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(g7e.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f28411l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C14241c(playerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(m31841N(0.0f, dimension, viewFindViewById)).with(m31841N(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28412m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C14242d(playerControlView));
        animatorSet2.play(m31841N(dimension, dimension2, viewFindViewById)).with(m31841N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f28413n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C14243e(playerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(m31841N(0.0f, dimension2, viewFindViewById)).with(m31841N(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f28414o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C14244f());
        animatorSet4.play(valueAnimatorOfFloat2).with(m31841N(dimension, 0.0f, viewFindViewById)).with(m31841N(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f28415p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C14245g());
        animatorSet5.play(valueAnimatorOfFloat2).with(m31841N(dimension2, 0.0f, viewFindViewById)).with(m31841N(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f28416q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.zad
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f56856a.m31839L(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new C14246h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f28417r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.abd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14447a.m31840M(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new C14247i());
    }

    /* renamed from: B */
    public static int m31836B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m31837J(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f28401b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f28402c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f28404e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m31838K(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f28401b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f28402c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f28404e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m31839L(ValueAnimator valueAnimator) {
        m31887y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m31840M(ValueAnimator valueAnimator) {
        m31887y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: N */
    public static ObjectAnimator m31841N(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    /* renamed from: z */
    public static int m31866z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: A */
    public boolean m31867A(View view) {
        return view != null && this.f28424y.contains(view);
    }

    /* renamed from: C */
    public void m31868C() {
        int i = this.f28425z;
        if (i == 3 || i == 2) {
            return;
        }
        m31882V();
        if (!this.f28399C) {
            m31870E();
        } else if (this.f28425z == 1) {
            m31873H();
        } else {
            m31869D();
        }
    }

    /* renamed from: D */
    public final void m31869D() {
        this.f28413n.start();
    }

    /* renamed from: E */
    public final void m31870E() {
        m31886Z(2);
    }

    /* renamed from: F */
    public void m31871F() {
        int i = this.f28425z;
        if (i == 3 || i == 2) {
            return;
        }
        m31882V();
        m31870E();
    }

    /* renamed from: G */
    public final void m31872G() {
        this.f28411l.start();
        m31881U(this.f28420u, 2000L);
    }

    /* renamed from: H */
    public final void m31873H() {
        this.f28412m.start();
    }

    /* renamed from: I */
    public boolean m31874I() {
        return this.f28425z == 0 && this.f28400a.e0();
    }

    /* renamed from: O */
    public void m31875O() {
        this.f28400a.addOnLayoutChangeListener(this.f28423x);
    }

    /* renamed from: P */
    public void m31876P() {
        this.f28400a.removeOnLayoutChangeListener(this.f28423x);
    }

    /* renamed from: Q */
    public void m31877Q(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f28401b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* renamed from: R */
    public final void m31878R(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean zE0 = e0();
        if (this.f28397A != zE0) {
            this.f28397A = zE0;
            view.post(new Runnable() { // from class: o.xad
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    this.f53435a.d0();
                }
            });
        }
        boolean z = i3 - i != i7 - i5;
        if (this.f28397A || !z) {
            return;
        }
        view.post(new Runnable() { // from class: o.yad
            @Override // java.lang.Runnable
            public final void run() {
                this.f55159a.m31879S();
            }
        });
    }

    /* renamed from: S */
    public final void m31879S() {
        int i;
        if (this.f28405f == null || this.f28406g == null) {
            return;
        }
        int width = (this.f28400a.getWidth() - this.f28400a.getPaddingLeft()) - this.f28400a.getPaddingRight();
        while (true) {
            if (this.f28406g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f28406g.getChildCount() - 2;
            View childAt = this.f28406g.getChildAt(childCount);
            this.f28406g.removeViewAt(childCount);
            this.f28405f.addView(childAt, 0);
        }
        View view = this.f28410k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iM31836B = m31836B(this.f28408i);
        int childCount2 = this.f28405f.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount2; i2++) {
            iM31836B += m31836B(this.f28405f.getChildAt(i2));
        }
        if (iM31836B <= width) {
            ViewGroup viewGroup = this.f28407h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f28417r.isStarted()) {
                return;
            }
            this.f28416q.cancel();
            this.f28417r.start();
            return;
        }
        View view2 = this.f28410k;
        if (view2 != null) {
            view2.setVisibility(0);
            iM31836B += m31836B(this.f28410k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < childCount2; i3++) {
            View childAt2 = this.f28405f.getChildAt(i3);
            iM31836B -= m31836B(childAt2);
            arrayList.add(childAt2);
            if (iM31836B <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f28405f.removeViews(0, arrayList.size());
        for (i = 0; i < arrayList.size(); i++) {
            this.f28406g.addView((View) arrayList.get(i), this.f28406g.getChildCount() - 1);
        }
    }

    /* renamed from: T */
    public final void m31880T(View view) {
        m31883W();
        if (view.getId() == a8e.exo_overflow_show) {
            this.f28416q.start();
        } else if (view.getId() == a8e.exo_overflow_hide) {
            this.f28417r.start();
        }
    }

    /* renamed from: U */
    public final void m31881U(Runnable runnable, long j) {
        if (j >= 0) {
            this.f28400a.postDelayed(runnable, j);
        }
    }

    /* renamed from: V */
    public void m31882V() {
        this.f28400a.removeCallbacks(this.f28422w);
        this.f28400a.removeCallbacks(this.f28419t);
        this.f28400a.removeCallbacks(this.f28421v);
        this.f28400a.removeCallbacks(this.f28420u);
    }

    /* renamed from: W */
    public void m31883W() {
        if (this.f28425z == 3) {
            return;
        }
        m31882V();
        int showTimeoutMs = this.f28400a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f28399C) {
                m31881U(this.f28422w, showTimeoutMs);
            } else if (this.f28425z == 1) {
                m31881U(this.f28420u, 2000L);
            } else {
                m31881U(this.f28421v, showTimeoutMs);
            }
        }
    }

    /* renamed from: X */
    public void m31884X(boolean z) {
        this.f28399C = z;
    }

    /* renamed from: Y */
    public void m31885Y(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.f28424y.remove(view);
            return;
        }
        if (this.f28397A && a0(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f28424y.add(view);
    }

    /* renamed from: Z */
    public final void m31886Z(int i) {
        int i2 = this.f28425z;
        this.f28425z = i;
        if (i == 2) {
            this.f28400a.setVisibility(8);
        } else if (i2 == 2) {
            this.f28400a.setVisibility(0);
        }
        if (i2 != i) {
            this.f28400a.f0();
        }
    }

    public final boolean a0(View view) {
        int id = view.getId();
        return id == a8e.exo_bottom_bar || id == a8e.exo_prev || id == a8e.exo_next || id == a8e.exo_rew || id == a8e.exo_rew_with_amount || id == a8e.exo_ffwd || id == a8e.exo_ffwd_with_amount;
    }

    public void b0() {
        if (!this.f28400a.e0()) {
            this.f28400a.setVisibility(0);
            this.f28400a.o0();
            this.f28400a.k0();
        }
        c0();
    }

    public final void c0() {
        if (!this.f28399C) {
            m31886Z(0);
            m31883W();
            return;
        }
        int i = this.f28425z;
        if (i == 1) {
            this.f28414o.start();
        } else if (i == 2) {
            this.f28415p.start();
        } else if (i == 3) {
            this.f28398B = true;
        } else if (i == 4) {
            return;
        }
        m31883W();
    }

    public final void d0() throws Resources.NotFoundException {
        ViewGroup viewGroup = this.f28404e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f28397A ? 0 : 4);
        }
        if (this.f28409j != null) {
            int dimensionPixelSize = this.f28400a.getResources().getDimensionPixelSize(g7e.exo_styled_progress_margin_bottom);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f28409j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f28397A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f28409j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f28409j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.f28397A) {
                    defaultTimeBar.m7625h(true);
                } else {
                    int i = this.f28425z;
                    if (i == 1) {
                        defaultTimeBar.m7625h(false);
                    } else if (i != 3) {
                        defaultTimeBar.m7632s();
                    }
                }
            }
        }
        for (View view2 : this.f28424y) {
            view2.setVisibility((this.f28397A && a0(view2)) ? 4 : 0);
        }
    }

    public final boolean e0() {
        int width = (this.f28400a.getWidth() - this.f28400a.getPaddingLeft()) - this.f28400a.getPaddingRight();
        int height = (this.f28400a.getHeight() - this.f28400a.getPaddingBottom()) - this.f28400a.getPaddingTop();
        int iM31836B = m31836B(this.f28402c);
        ViewGroup viewGroup = this.f28402c;
        int paddingLeft = iM31836B - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f28402c.getPaddingRight() : 0);
        int iM31866z = m31866z(this.f28402c);
        ViewGroup viewGroup2 = this.f28402c;
        return width <= Math.max(paddingLeft, m31836B(this.f28408i) + m31836B(this.f28410k)) || height <= (iM31866z - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f28402c.getPaddingBottom() : 0)) + (m31866z(this.f28403d) * 2);
    }

    /* renamed from: y */
    public final void m31887y(float f) {
        if (this.f28407h != null) {
            this.f28407h.setTranslationX((int) (r0.getWidth() * (1.0f - f)));
        }
        ViewGroup viewGroup = this.f28408i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup2 = this.f28405f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
    }
}

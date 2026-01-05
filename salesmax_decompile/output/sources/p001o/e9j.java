package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p001o.r9j;

/* loaded from: classes2.dex */
public final class e9j {

    /* renamed from: a */
    public C13136e f21198a;

    /* renamed from: o.e9j$b */
    public static abstract class AbstractC13133b {

        /* renamed from: a */
        public WindowInsets f21201a;

        /* renamed from: b */
        public final int f21202b;

        public AbstractC13133b(int i) {
            this.f21202b = i;
        }

        /* renamed from: a */
        public final int m24620a() {
            return this.f21202b;
        }

        /* renamed from: b */
        public abstract void mo24621b(e9j e9jVar);

        /* renamed from: c */
        public abstract void mo24622c(e9j e9jVar);

        /* renamed from: d */
        public abstract r9j mo24623d(r9j r9jVar, List list);

        /* renamed from: e */
        public abstract C13132a mo24624e(e9j e9jVar, C13132a c13132a);
    }

    /* renamed from: o.e9j$c */
    public static class C13134c extends C13136e {

        /* renamed from: e */
        public static final Interpolator f21203e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f */
        public static final Interpolator f21204f = new zs6();

        /* renamed from: g */
        public static final Interpolator f21205g = new DecelerateInterpolator();

        /* renamed from: o.e9j$c$a */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public final AbstractC13133b f21206a;

            /* renamed from: b */
            public r9j f21207b;

            /* renamed from: o.e9j$c$a$a, reason: collision with other inner class name */
            public class C19588a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                public final /* synthetic */ e9j f21208a;

                /* renamed from: b */
                public final /* synthetic */ r9j f21209b;

                /* renamed from: c */
                public final /* synthetic */ r9j f21210c;

                /* renamed from: d */
                public final /* synthetic */ int f21211d;

                /* renamed from: e */
                public final /* synthetic */ View f21212e;

                public C19588a(e9j e9jVar, r9j r9jVar, r9j r9jVar2, int i, View view) {
                    this.f21208a = e9jVar;
                    this.f21209b = r9jVar;
                    this.f21210c = r9jVar2;
                    this.f21211d = i;
                    this.f21212e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f21208a.m24615e(valueAnimator.getAnimatedFraction());
                    C13134c.m24631k(this.f21212e, C13134c.m24635o(this.f21209b, this.f21210c, this.f21208a.m24613b(), this.f21211d), Collections.singletonList(this.f21208a));
                }
            }

            /* renamed from: o.e9j$c$a$b */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a */
                public final /* synthetic */ e9j f21214a;

                /* renamed from: b */
                public final /* synthetic */ View f21215b;

                public b(e9j e9jVar, View view) {
                    this.f21214a = e9jVar;
                    this.f21215b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f21214a.m24615e(1.0f);
                    C13134c.m24629i(this.f21215b, this.f21214a);
                }
            }

            /* renamed from: o.e9j$c$a$c */
            public class c implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ View f21217a;

                /* renamed from: b */
                public final /* synthetic */ e9j f21218b;

                /* renamed from: c */
                public final /* synthetic */ C13132a f21219c;

                /* renamed from: d */
                public final /* synthetic */ ValueAnimator f21220d;

                public c(View view, e9j e9jVar, C13132a c13132a, ValueAnimator valueAnimator) {
                    this.f21217a = view;
                    this.f21218b = e9jVar;
                    this.f21219c = c13132a;
                    this.f21220d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C13134c.m24632l(this.f21217a, this.f21218b, this.f21219c);
                    this.f21220d.start();
                }
            }

            public a(View view, AbstractC13133b abstractC13133b) {
                this.f21206a = abstractC13133b;
                r9j r9jVarM55094G = wvi.m55094G(view);
                this.f21207b = r9jVarM55094G != null ? new r9j.C16565b(r9jVarM55094G).m46408a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f21207b = r9j.m46385x(windowInsets, view);
                    return C13134c.m24633m(view, windowInsets);
                }
                r9j r9jVarM46385x = r9j.m46385x(windowInsets, view);
                if (this.f21207b == null) {
                    this.f21207b = wvi.m55094G(view);
                }
                if (this.f21207b == null) {
                    this.f21207b = r9jVarM46385x;
                    return C13134c.m24633m(view, windowInsets);
                }
                AbstractC13133b abstractC13133bM24634n = C13134c.m24634n(view);
                if (abstractC13133bM24634n != null && Objects.equals(abstractC13133bM24634n.f21201a, windowInsets)) {
                    return C13134c.m24633m(view, windowInsets);
                }
                int iM24625e = C13134c.m24625e(r9jVarM46385x, this.f21207b);
                if (iM24625e == 0) {
                    return C13134c.m24633m(view, windowInsets);
                }
                r9j r9jVar = this.f21207b;
                e9j e9jVar = new e9j(iM24625e, C13134c.m24627g(iM24625e, r9jVarM46385x, r9jVar), 160L);
                e9jVar.m24615e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(e9jVar.m24612a());
                C13132a c13132aM24626f = C13134c.m24626f(r9jVarM46385x, r9jVar, iM24625e);
                C13134c.m24630j(view, e9jVar, windowInsets, false);
                duration.addUpdateListener(new C19588a(e9jVar, r9jVarM46385x, r9jVar, iM24625e, view));
                duration.addListener(new b(e9jVar, view));
                pcc.m43344a(view, new c(view, e9jVar, c13132aM24626f, duration));
                this.f21207b = r9jVarM46385x;
                return C13134c.m24633m(view, windowInsets);
            }
        }

        public C13134c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        /* renamed from: e */
        public static int m24625e(r9j r9jVar, r9j r9jVar2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!r9jVar.m46391f(i2).equals(r9jVar2.m46391f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        /* renamed from: f */
        public static C13132a m24626f(r9j r9jVar, r9j r9jVar2, int i) {
            sj8 sj8VarM46391f = r9jVar.m46391f(i);
            sj8 sj8VarM46391f2 = r9jVar2.m46391f(i);
            return new C13132a(sj8.m48374b(Math.min(sj8VarM46391f.f45477a, sj8VarM46391f2.f45477a), Math.min(sj8VarM46391f.f45478b, sj8VarM46391f2.f45478b), Math.min(sj8VarM46391f.f45479c, sj8VarM46391f2.f45479c), Math.min(sj8VarM46391f.f45480d, sj8VarM46391f2.f45480d)), sj8.m48374b(Math.max(sj8VarM46391f.f45477a, sj8VarM46391f2.f45477a), Math.max(sj8VarM46391f.f45478b, sj8VarM46391f2.f45478b), Math.max(sj8VarM46391f.f45479c, sj8VarM46391f2.f45479c), Math.max(sj8VarM46391f.f45480d, sj8VarM46391f2.f45480d)));
        }

        /* renamed from: g */
        public static Interpolator m24627g(int i, r9j r9jVar, r9j r9jVar2) {
            return (i & 8) != 0 ? r9jVar.m46391f(r9j.C16576m.m46446b()).f45480d > r9jVar2.m46391f(r9j.C16576m.m46446b()).f45480d ? f21203e : f21204f : f21205g;
        }

        /* renamed from: h */
        public static View.OnApplyWindowInsetsListener m24628h(View view, AbstractC13133b abstractC13133b) {
            return new a(view, abstractC13133b);
        }

        /* renamed from: i */
        public static void m24629i(View view, e9j e9jVar) {
            AbstractC13133b abstractC13133bM24634n = m24634n(view);
            if (abstractC13133bM24634n != null) {
                abstractC13133bM24634n.mo24621b(e9jVar);
                if (abstractC13133bM24634n.m24620a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m24629i(viewGroup.getChildAt(i), e9jVar);
                }
            }
        }

        /* renamed from: j */
        public static void m24630j(View view, e9j e9jVar, WindowInsets windowInsets, boolean z) {
            AbstractC13133b abstractC13133bM24634n = m24634n(view);
            if (abstractC13133bM24634n != null) {
                abstractC13133bM24634n.f21201a = windowInsets;
                if (!z) {
                    abstractC13133bM24634n.mo24622c(e9jVar);
                    z = abstractC13133bM24634n.m24620a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m24630j(viewGroup.getChildAt(i), e9jVar, windowInsets, z);
                }
            }
        }

        /* renamed from: k */
        public static void m24631k(View view, r9j r9jVar, List list) {
            AbstractC13133b abstractC13133bM24634n = m24634n(view);
            if (abstractC13133bM24634n != null) {
                r9jVar = abstractC13133bM24634n.mo24623d(r9jVar, list);
                if (abstractC13133bM24634n.m24620a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m24631k(viewGroup.getChildAt(i), r9jVar, list);
                }
            }
        }

        /* renamed from: l */
        public static void m24632l(View view, e9j e9jVar, C13132a c13132a) {
            AbstractC13133b abstractC13133bM24634n = m24634n(view);
            if (abstractC13133bM24634n != null) {
                abstractC13133bM24634n.mo24624e(e9jVar, c13132a);
                if (abstractC13133bM24634n.m24620a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m24632l(viewGroup.getChildAt(i), e9jVar, c13132a);
                }
            }
        }

        /* renamed from: m */
        public static WindowInsets m24633m(View view, WindowInsets windowInsets) {
            return view.getTag(u8e.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: n */
        public static AbstractC13133b m24634n(View view) {
            Object tag = view.getTag(u8e.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f21206a;
            }
            return null;
        }

        /* renamed from: o */
        public static r9j m24635o(r9j r9jVar, r9j r9jVar2, float f, int i) {
            r9j.C16565b c16565b = new r9j.C16565b(r9jVar);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    c16565b.m46409b(i2, r9jVar.m46391f(i2));
                } else {
                    sj8 sj8VarM46391f = r9jVar.m46391f(i2);
                    sj8 sj8VarM46391f2 = r9jVar2.m46391f(i2);
                    float f2 = 1.0f - f;
                    c16565b.m46409b(i2, r9j.m46383o(sj8VarM46391f, (int) (((sj8VarM46391f.f45477a - sj8VarM46391f2.f45477a) * f2) + 0.5d), (int) (((sj8VarM46391f.f45478b - sj8VarM46391f2.f45478b) * f2) + 0.5d), (int) (((sj8VarM46391f.f45479c - sj8VarM46391f2.f45479c) * f2) + 0.5d), (int) (((sj8VarM46391f.f45480d - sj8VarM46391f2.f45480d) * f2) + 0.5d)));
                }
            }
            return c16565b.m46408a();
        }

        /* renamed from: p */
        public static void m24636p(View view, AbstractC13133b abstractC13133b) {
            Object tag = view.getTag(u8e.tag_on_apply_window_listener);
            if (abstractC13133b == null) {
                view.setTag(u8e.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerM24628h = m24628h(view, abstractC13133b);
            view.setTag(u8e.tag_window_insets_animation_callback, onApplyWindowInsetsListenerM24628h);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerM24628h);
            }
        }
    }

    /* renamed from: o.e9j$e */
    public static class C13136e {

        /* renamed from: a */
        public final int f21227a;

        /* renamed from: b */
        public float f21228b;

        /* renamed from: c */
        public final Interpolator f21229c;

        /* renamed from: d */
        public final long f21230d;

        public C13136e(int i, Interpolator interpolator, long j) {
            this.f21227a = i;
            this.f21229c = interpolator;
            this.f21230d = j;
        }

        /* renamed from: a */
        public long mo24641a() {
            return this.f21230d;
        }

        /* renamed from: b */
        public float mo24642b() {
            Interpolator interpolator = this.f21229c;
            return interpolator != null ? interpolator.getInterpolation(this.f21228b) : this.f21228b;
        }

        /* renamed from: c */
        public int mo24643c() {
            return this.f21227a;
        }

        /* renamed from: d */
        public void mo24644d(float f) {
            this.f21228b = f;
        }
    }

    public e9j(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f21198a = new C13135d(i, interpolator, j);
        } else {
            this.f21198a = new C13134c(i, interpolator, j);
        }
    }

    /* renamed from: d */
    public static void m24610d(View view, AbstractC13133b abstractC13133b) {
        if (Build.VERSION.SDK_INT >= 30) {
            C13135d.m24640h(view, abstractC13133b);
        } else {
            C13134c.m24636p(view, abstractC13133b);
        }
    }

    /* renamed from: f */
    public static e9j m24611f(WindowInsetsAnimation windowInsetsAnimation) {
        return new e9j(windowInsetsAnimation);
    }

    /* renamed from: a */
    public long m24612a() {
        return this.f21198a.mo24641a();
    }

    /* renamed from: b */
    public float m24613b() {
        return this.f21198a.mo24642b();
    }

    /* renamed from: c */
    public int m24614c() {
        return this.f21198a.mo24643c();
    }

    /* renamed from: e */
    public void m24615e(float f) {
        this.f21198a.mo24644d(f);
    }

    /* renamed from: o.e9j$d */
    public static class C13135d extends C13136e {

        /* renamed from: e */
        public final WindowInsetsAnimation f21222e;

        /* renamed from: o.e9j$d$a */
        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a */
            public final AbstractC13133b f21223a;

            /* renamed from: b */
            public List f21224b;

            /* renamed from: c */
            public ArrayList f21225c;

            /* renamed from: d */
            public final HashMap f21226d;

            public a(AbstractC13133b abstractC13133b) {
                super(abstractC13133b.m24620a());
                this.f21226d = new HashMap();
                this.f21223a = abstractC13133b;
            }

            /* renamed from: a */
            public final e9j m24645a(WindowInsetsAnimation windowInsetsAnimation) {
                e9j e9jVar = (e9j) this.f21226d.get(windowInsetsAnimation);
                if (e9jVar != null) {
                    return e9jVar;
                }
                e9j e9jVarM24611f = e9j.m24611f(windowInsetsAnimation);
                this.f21226d.put(windowInsetsAnimation, e9jVarM24611f);
                return e9jVarM24611f;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f21223a.mo24621b(m24645a(windowInsetsAnimation));
                this.f21226d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f21223a.mo24622c(m24645a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f21225c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f21225c = arrayList2;
                    this.f21224b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM43253a = p9j.m43253a(list.get(size));
                    e9j e9jVarM24645a = m24645a(windowInsetsAnimationM43253a);
                    e9jVarM24645a.m24615e(windowInsetsAnimationM43253a.getFraction());
                    this.f21225c.add(e9jVarM24645a);
                }
                return this.f21223a.mo24623d(r9j.m46384w(windowInsets), this.f21224b).m46406v();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f21223a.mo24624e(m24645a(windowInsetsAnimation), C13132a.m24616d(bounds)).m24619c();
            }
        }

        public C13135d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f21222e = windowInsetsAnimation;
        }

        /* renamed from: e */
        public static WindowInsetsAnimation.Bounds m24637e(C13132a c13132a) {
            m9j.m38605a();
            return l9j.m36820a(c13132a.m24617a().m48377e(), c13132a.m24618b().m48377e());
        }

        /* renamed from: f */
        public static sj8 m24638f(WindowInsetsAnimation.Bounds bounds) {
            return sj8.m48376d(bounds.getUpperBound());
        }

        /* renamed from: g */
        public static sj8 m24639g(WindowInsetsAnimation.Bounds bounds) {
            return sj8.m48376d(bounds.getLowerBound());
        }

        /* renamed from: h */
        public static void m24640h(View view, AbstractC13133b abstractC13133b) {
            view.setWindowInsetsAnimationCallback(abstractC13133b != null ? new a(abstractC13133b) : null);
        }

        @Override // p001o.e9j.C13136e
        /* renamed from: a */
        public long mo24641a() {
            return this.f21222e.getDurationMillis();
        }

        @Override // p001o.e9j.C13136e
        /* renamed from: b */
        public float mo24642b() {
            return this.f21222e.getInterpolatedFraction();
        }

        @Override // p001o.e9j.C13136e
        /* renamed from: c */
        public int mo24643c() {
            return this.f21222e.getTypeMask();
        }

        @Override // p001o.e9j.C13136e
        /* renamed from: d */
        public void mo24644d(float f) {
            this.f21222e.setFraction(f);
        }

        public C13135d(int i, Interpolator interpolator, long j) {
            this(k9j.m35209a(i, interpolator, j));
        }
    }

    /* renamed from: o.e9j$a */
    public static final class C13132a {

        /* renamed from: a */
        public final sj8 f21199a;

        /* renamed from: b */
        public final sj8 f21200b;

        public C13132a(sj8 sj8Var, sj8 sj8Var2) {
            this.f21199a = sj8Var;
            this.f21200b = sj8Var2;
        }

        /* renamed from: d */
        public static C13132a m24616d(WindowInsetsAnimation.Bounds bounds) {
            return new C13132a(bounds);
        }

        /* renamed from: a */
        public sj8 m24617a() {
            return this.f21199a;
        }

        /* renamed from: b */
        public sj8 m24618b() {
            return this.f21200b;
        }

        /* renamed from: c */
        public WindowInsetsAnimation.Bounds m24619c() {
            return C13135d.m24637e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f21199a + " upper=" + this.f21200b + "}";
        }

        public C13132a(WindowInsetsAnimation.Bounds bounds) {
            this.f21199a = C13135d.m24639g(bounds);
            this.f21200b = C13135d.m24638f(bounds);
        }
    }

    public e9j(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f21198a = new C13135d(windowInsetsAnimation);
        }
    }
}

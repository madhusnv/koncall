package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class xyi {

    /* renamed from: a */
    public final WeakReference f54491a;

    /* renamed from: o.xyi$a */
    public class C18266a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ zyi f54492a;

        /* renamed from: b */
        public final /* synthetic */ View f54493b;

        public C18266a(zyi zyiVar, View view) {
            this.f54492a = zyiVar;
            this.f54493b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f54492a.mo4478a(this.f54493b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54492a.mo3832b(this.f54493b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f54492a.mo3833c(this.f54493b);
        }
    }

    public xyi(View view) {
        this.f54491a = new WeakReference(view);
    }

    /* renamed from: b */
    public xyi m56973b(float f) {
        View view = (View) this.f54491a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void m56974c() {
        View view = (View) this.f54491a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long m56975d() {
        View view = (View) this.f54491a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: f */
    public xyi m56976f(long j) {
        View view = (View) this.f54491a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public xyi m56977g(Interpolator interpolator) {
        View view = (View) this.f54491a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public xyi m56978h(zyi zyiVar) {
        View view = (View) this.f54491a.get();
        if (view != null) {
            m56979i(view, zyiVar);
        }
        return this;
    }

    /* renamed from: i */
    public final void m56979i(View view, zyi zyiVar) {
        if (zyiVar != null) {
            view.animate().setListener(new C18266a(zyiVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: j */
    public xyi m56980j(long j) {
        View view = (View) this.f54491a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public xyi m56981k(final bzi bziVar) {
        final View view = (View) this.f54491a.get();
        if (view != null) {
            view.animate().setUpdateListener(bziVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: o.wyi
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bziVar.mo3930a(view);
                }
            } : null);
        }
        return this;
    }

    /* renamed from: l */
    public void m56982l() {
        View view = (View) this.f54491a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public xyi m56983m(float f) {
        View view = (View) this.f54491a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}

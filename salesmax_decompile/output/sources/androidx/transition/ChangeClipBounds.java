package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import p001o.g8e;
import p001o.ofe;
import p001o.svh;
import p001o.zzi;

/* loaded from: classes2.dex */
public class ChangeClipBounds extends Transition {
    public static final String[] E0 = {"android:clipBounds:clip"};
    public static final Rect F0 = new Rect();

    /* renamed from: androidx.transition.ChangeClipBounds$a */
    public static class C2485a extends AnimatorListenerAdapter implements Transition.InterfaceC2514i {

        /* renamed from: a */
        public final Rect f10309a;

        /* renamed from: b */
        public final Rect f10310b;

        /* renamed from: c */
        public final View f10311c;

        public C2485a(View view, Rect rect, Rect rect2) {
            this.f10311c = view;
            this.f10309a = rect;
            this.f10310b = rect2;
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: b */
        public void mo9820b(Transition transition) {
            this.f10311c.setClipBounds((Rect) this.f10311c.getTag(g8e.transition_clip));
            this.f10311c.setTag(g8e.transition_clip, null);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: d */
        public void mo9821d(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: e */
        public void mo9822e(Transition transition) {
            Rect clipBounds = this.f10311c.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.F0;
            }
            this.f10311c.setTag(g8e.transition_clip, clipBounds);
            this.f10311c.setClipBounds(this.f10310b);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                this.f10311c.setClipBounds(this.f10309a);
            } else {
                this.f10311c.setClipBounds(this.f10310b);
            }
        }
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void I0(svh svhVar, boolean z) {
        View view = svhVar.f46009b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z ? (Rect) view.getTag(g8e.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != F0 ? clipBounds : null;
        svhVar.f46008a.put("android:clipBounds:clip", rect);
        if (rect == null) {
            svhVar.f46008a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: R */
    public String[] mo9805R() {
        return E0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: U */
    public boolean mo9806U() {
        return true;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo9807k(svh svhVar) {
        I0(svhVar, false);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        I0(svhVar, true);
    }

    @Override // androidx.transition.Transition
    /* renamed from: t */
    public Animator mo9809t(ViewGroup viewGroup, svh svhVar, svh svhVar2) {
        if (svhVar == null || svhVar2 == null || !svhVar.f46008a.containsKey("android:clipBounds:clip") || !svhVar2.f46008a.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) svhVar.f46008a.get("android:clipBounds:clip");
        Rect rect2 = (Rect) svhVar2.f46008a.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) svhVar.f46008a.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) svhVar2.f46008a.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        svhVar2.f46009b.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(svhVar2.f46009b, (Property<View, V>) zzi.f57936c, new ofe(new Rect()), rect3, rect4);
        C2485a c2485a = new C2485a(svhVar2.f46009b, rect, rect2);
        objectAnimatorOfObject.addListener(c2485a);
        mo9876c(c2485a);
        return objectAnimatorOfObject;
    }
}

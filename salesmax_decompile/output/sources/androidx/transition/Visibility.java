package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import p001o.dzh;
import p001o.g8e;
import p001o.kag;
import p001o.mwi;
import p001o.svh;
import p001o.zzi;

/* loaded from: classes2.dex */
public abstract class Visibility extends Transition {
    public static final String[] F0 = {"android:visibility:visibility", "android:visibility:parent"};
    public int E0;

    /* renamed from: androidx.transition.Visibility$a */
    public static class C2519a extends AnimatorListenerAdapter implements Transition.InterfaceC2514i {

        /* renamed from: a */
        public final View f10392a;

        /* renamed from: b */
        public final int f10393b;

        /* renamed from: c */
        public final ViewGroup f10394c;

        /* renamed from: d */
        public final boolean f10395d;

        /* renamed from: e */
        public boolean f10396e;

        /* renamed from: f */
        public boolean f10397f = false;

        public C2519a(View view, int i, boolean z) {
            this.f10392a = view;
            this.f10393b = i;
            this.f10394c = (ViewGroup) view.getParent();
            this.f10395d = z;
            m9916c(true);
        }

        /* renamed from: a */
        public final void m9915a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (!this.f10397f) {
                zzi.m60174g(this.f10392a, this.f10393b);
                ViewGroup viewGroup = this.f10394c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m9916c(false);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: b */
        public void mo9820b(Transition transition) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            m9916c(true);
            if (this.f10397f) {
                return;
            }
            zzi.m60174g(this.f10392a, 0);
        }

        /* renamed from: c */
        public final void m9916c(boolean z) {
            ViewGroup viewGroup;
            if (!this.f10395d || this.f10396e == z || (viewGroup = this.f10394c) == null) {
                return;
            }
            this.f10396e = z;
            mwi.m39750c(viewGroup, z);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: d */
        public void mo9821d(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: e */
        public void mo9822e(Transition transition) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            m9916c(false);
            if (this.f10397f) {
                return;
            }
            zzi.m60174g(this.f10392a, this.f10393b);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
            transition.n0(this);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10397f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            m9915a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z) {
                return;
            }
            m9915a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z) {
                zzi.m60174g(this.f10392a, 0);
                ViewGroup viewGroup = this.f10394c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    public class C2520b extends AnimatorListenerAdapter implements Transition.InterfaceC2514i {

        /* renamed from: a */
        public final ViewGroup f10398a;

        /* renamed from: b */
        public final View f10399b;

        /* renamed from: c */
        public final View f10400c;

        /* renamed from: d */
        public boolean f10401d = true;

        public C2520b(ViewGroup viewGroup, View view, View view2) {
            this.f10398a = viewGroup;
            this.f10399b = view;
            this.f10400c = view2;
        }

        /* renamed from: a */
        public final void m9917a() {
            this.f10400c.setTag(g8e.save_overlay_view, null);
            this.f10398a.getOverlay().remove(this.f10399b);
            this.f10401d = false;
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: b */
        public void mo9820b(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: d */
        public void mo9821d(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: e */
        public void mo9822e(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
            transition.n0(this);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
            if (this.f10401d) {
                m9917a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m9917a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f10398a.getOverlay().remove(this.f10399b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f10399b.getParent() == null) {
                this.f10398a.getOverlay().add(this.f10399b);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                this.f10400c.setTag(g8e.save_overlay_view, this.f10399b);
                this.f10398a.getOverlay().add(this.f10399b);
                this.f10401d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            m9917a();
        }
    }

    /* renamed from: androidx.transition.Visibility$c */
    public static class C2521c {

        /* renamed from: a */
        public boolean f10403a;

        /* renamed from: b */
        public boolean f10404b;

        /* renamed from: c */
        public int f10405c;

        /* renamed from: d */
        public int f10406d;

        /* renamed from: e */
        public ViewGroup f10407e;

        /* renamed from: f */
        public ViewGroup f10408f;
    }

    public Visibility() {
        this.E0 = 3;
    }

    public final void I0(svh svhVar) {
        svhVar.f46008a.put("android:visibility:visibility", Integer.valueOf(svhVar.f46009b.getVisibility()));
        svhVar.f46008a.put("android:visibility:parent", svhVar.f46009b.getParent());
        int[] iArr = new int[2];
        svhVar.f46009b.getLocationOnScreen(iArr);
        svhVar.f46008a.put("android:visibility:screenLocation", iArr);
    }

    public int J0() {
        return this.E0;
    }

    public final C2521c L0(svh svhVar, svh svhVar2) {
        C2521c c2521c = new C2521c();
        c2521c.f10403a = false;
        c2521c.f10404b = false;
        if (svhVar == null || !svhVar.f46008a.containsKey("android:visibility:visibility")) {
            c2521c.f10405c = -1;
            c2521c.f10407e = null;
        } else {
            c2521c.f10405c = ((Integer) svhVar.f46008a.get("android:visibility:visibility")).intValue();
            c2521c.f10407e = (ViewGroup) svhVar.f46008a.get("android:visibility:parent");
        }
        if (svhVar2 == null || !svhVar2.f46008a.containsKey("android:visibility:visibility")) {
            c2521c.f10406d = -1;
            c2521c.f10408f = null;
        } else {
            c2521c.f10406d = ((Integer) svhVar2.f46008a.get("android:visibility:visibility")).intValue();
            c2521c.f10408f = (ViewGroup) svhVar2.f46008a.get("android:visibility:parent");
        }
        if (svhVar != null && svhVar2 != null) {
            int i = c2521c.f10405c;
            int i2 = c2521c.f10406d;
            if (i == i2 && c2521c.f10407e == c2521c.f10408f) {
                return c2521c;
            }
            if (i != i2) {
                if (i == 0) {
                    c2521c.f10404b = false;
                    c2521c.f10403a = true;
                } else if (i2 == 0) {
                    c2521c.f10404b = true;
                    c2521c.f10403a = true;
                }
            } else if (c2521c.f10408f == null) {
                c2521c.f10404b = false;
                c2521c.f10403a = true;
            } else if (c2521c.f10407e == null) {
                c2521c.f10404b = true;
                c2521c.f10403a = true;
            }
        } else if (svhVar == null && c2521c.f10406d == 0) {
            c2521c.f10404b = true;
            c2521c.f10403a = true;
        } else if (svhVar2 == null && c2521c.f10405c == 0) {
            c2521c.f10404b = false;
            c2521c.f10403a = true;
        }
        return c2521c;
    }

    public Animator M0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        return null;
    }

    public Animator N0(ViewGroup viewGroup, svh svhVar, int i, svh svhVar2, int i2) {
        if ((this.E0 & 1) != 1 || svhVar2 == null) {
            return null;
        }
        if (svhVar == null) {
            View view = (View) svhVar2.f46009b.getParent();
            if (L0(m9860F(view, false), m9871S(view, false)).f10403a) {
                return null;
            }
        }
        return M0(viewGroup, svhVar2.f46009b, svhVar, svhVar2);
    }

    public Animator O0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085 A[PHI: r2
      0x0085: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:36:0x0072, B:38:0x0075, B:40:0x007b, B:42:0x007f, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator P0(ViewGroup viewGroup, svh svhVar, int i, svh svhVar2, int i2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        View view;
        boolean z;
        boolean z2;
        View view2;
        if ((this.E0 & 2) != 2 || svhVar == null) {
            return null;
        }
        View view3 = svhVar.f46009b;
        View viewM9954a = svhVar2 != null ? svhVar2.f46009b : null;
        View view4 = (View) view3.getTag(g8e.save_overlay_view);
        if (view4 != null) {
            view2 = null;
            z2 = true;
        } else if (viewM9954a == null || viewM9954a.getParent() == null) {
            if (viewM9954a != null) {
                view = null;
                z = false;
            } else {
                viewM9954a = null;
                view = null;
                z = true;
            }
            if (z) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (L0(m9871S(view5, true), m9860F(view5, true)).f10403a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.k0) {
                            }
                        } else {
                            viewM9954a = AbstractC2525d.m9954a(viewGroup, view3, view5);
                        }
                    }
                    z2 = false;
                    View view6 = view;
                    view4 = viewM9954a;
                    view2 = view6;
                }
                view2 = view;
                z2 = false;
                view4 = view3;
            } else {
                z2 = false;
                View view62 = view;
                view4 = viewM9954a;
                view2 = view62;
            }
        } else {
            if (i2 == 4 || view3 == viewM9954a) {
                view = viewM9954a;
                z = false;
                viewM9954a = null;
            }
            if (z) {
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            zzi.m60174g(view2, 0);
            Animator animatorO0 = O0(viewGroup, view2, svhVar, svhVar2);
            if (animatorO0 != null) {
                C2519a c2519a = new C2519a(view2, i2, true);
                animatorO0.addListener(c2519a);
                m9864J().mo9876c(c2519a);
            } else {
                zzi.m60174g(view2, visibility);
            }
            return animatorO0;
        }
        if (!z2) {
            int[] iArr = (int[]) svhVar.f46008a.get("android:visibility:screenLocation");
            int i3 = iArr[0];
            int i4 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorO02 = O0(viewGroup, view4, svhVar, svhVar2);
        if (!z2) {
            if (animatorO02 == null) {
                viewGroup.getOverlay().remove(view4);
            } else {
                view3.setTag(g8e.save_overlay_view, view4);
                C2520b c2520b = new C2520b(viewGroup, view4, view3);
                animatorO02.addListener(c2520b);
                animatorO02.addPauseListener(c2520b);
                m9864J().mo9876c(c2520b);
            }
        }
        return animatorO02;
    }

    public void Q0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.E0 = i;
    }

    @Override // androidx.transition.Transition
    /* renamed from: R */
    public String[] mo9805R() {
        return F0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: V */
    public boolean mo9873V(svh svhVar, svh svhVar2) {
        if (svhVar == null && svhVar2 == null) {
            return false;
        }
        if (svhVar != null && svhVar2 != null && svhVar2.f46008a.containsKey("android:visibility:visibility") != svhVar.f46008a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C2521c c2521cL0 = L0(svhVar, svhVar2);
        if (c2521cL0.f10403a) {
            return c2521cL0.f10405c == 0 || c2521cL0.f10406d == 0;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo9807k(svh svhVar) {
        I0(svhVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        I0(svhVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: t */
    public Animator mo9809t(ViewGroup viewGroup, svh svhVar, svh svhVar2) {
        C2521c c2521cL0 = L0(svhVar, svhVar2);
        if (!c2521cL0.f10403a) {
            return null;
        }
        if (c2521cL0.f10407e == null && c2521cL0.f10408f == null) {
            return null;
        }
        return c2521cL0.f10404b ? N0(viewGroup, svhVar, c2521cL0.f10405c, svhVar2, c2521cL0.f10406d) : P0(viewGroup, svhVar, c2521cL0.f10405c, svhVar2, c2521cL0.f10406d);
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E0 = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kag.f31775e);
        int iM23978g = dzh.m23978g(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM23978g != 0) {
            Q0(iM23978g);
        }
    }
}

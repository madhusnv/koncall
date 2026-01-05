package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import x5.C8305a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a2 extends c2 {
    /* renamed from: t */
    public static boolean m1096t(Transition transition) {
        return (c2.m1124h(transition.getTargetIds()) && c2.m1124h(transition.getTargetNames()) && c2.m1124h(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: a */
    public final void mo1097a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: b */
    public final void mo1098b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                mo1098b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (m1096t(transition) || !c2.m1124h(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.addTarget((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: c */
    public final void mo1099c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: e */
    public final boolean mo1100e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: f */
    public final Object mo1101f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: i */
    public final void mo1102i() {
        j1.m1152K(4);
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: j */
    public final Object mo1103j(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: k */
    public final Object mo1104k(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: l */
    public final void mo1105l(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new x1(view, arrayList));
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: m */
    public final void mo1106m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new y1(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: n */
    public final void mo1107n(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            c2.m1123g(view, rect);
            ((Transition) obj).setEpicenterCallback(new w1(0, rect));
        }
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: o */
    public final void mo1108o(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new w1(1, rect));
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: p */
    public final void mo1109p(Object obj, C8305a c8305a, Runnable runnable) {
        ((Transition) obj).addListener(new z1(runnable));
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: q */
    public final void mo1110q(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c2.m1122d((View) arrayList.get(i10), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo1098b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: r */
    public final void mo1111r(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m1113u(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.c2
    /* renamed from: s */
    public final Object mo1112s(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: u */
    public final void m1113u(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                m1113u(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (m1096t(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i10 < size) {
            transition.addTarget((View) arrayList2.get(i10));
            i10++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }
}

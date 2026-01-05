package p001o;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class wi7 extends xi7 {

    /* renamed from: o.wi7$a */
    public class C17913a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f52181a;

        public C17913a(Rect rect) {
            this.f52181a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f52181a;
        }
    }

    /* renamed from: o.wi7$b */
    public class C17914b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f52183a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f52184b;

        public C17914b(View view, ArrayList arrayList) {
            this.f52183a = view;
            this.f52184b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f52183a.setVisibility(8);
            int size = this.f52184b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f52184b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: o.wi7$c */
    public class C17915c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f52186a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f52187b;

        /* renamed from: c */
        public final /* synthetic */ Object f52188c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f52189d;

        /* renamed from: e */
        public final /* synthetic */ Object f52190e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f52191f;

        public C17915c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f52186a = obj;
            this.f52187b = arrayList;
            this.f52188c = obj2;
            this.f52189d = arrayList2;
            this.f52190e = obj3;
            this.f52191f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f52186a;
            if (obj != null) {
                wi7.this.m54574D(obj, this.f52187b, null);
            }
            Object obj2 = this.f52188c;
            if (obj2 != null) {
                wi7.this.m54574D(obj2, this.f52189d, null);
            }
            Object obj3 = this.f52190e;
            if (obj3 != null) {
                wi7.this.m54574D(obj3, this.f52191f, null);
            }
        }
    }

    /* renamed from: o.wi7$d */
    public class C17916d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f52193a;

        public C17916d(Runnable runnable) {
            this.f52193a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f52193a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: o.wi7$e */
    public class C17917e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f52195a;

        public C17917e(Rect rect) {
            this.f52195a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f52195a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f52195a;
        }
    }

    /* renamed from: C */
    public static boolean m54573C(Transition transition) {
        return (xi7.m56330l(transition.getTargetIds()) && xi7.m56330l(transition.getTargetNames()) && xi7.m56330l(transition.getTargetTypes())) ? false : true;
    }

    @Override // p001o.xi7
    /* renamed from: A */
    public void mo9921A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m54574D(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p001o.xi7
    /* renamed from: B */
    public Object mo9922B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: D */
    public void m54574D(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m54574D(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m54573C(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    @Override // p001o.xi7
    /* renamed from: a */
    public void mo9924a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p001o.xi7
    /* renamed from: b */
    public void mo9925b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo9925b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m54573C(transition) || !xi7.m56330l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // p001o.xi7
    /* renamed from: e */
    public void mo9928e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p001o.xi7
    /* renamed from: g */
    public boolean mo9929g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p001o.xi7
    /* renamed from: h */
    public Object mo9930h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p001o.xi7
    /* renamed from: m */
    public boolean mo9932m() {
        FragmentManager.P0(4);
        return false;
    }

    @Override // p001o.xi7
    /* renamed from: n */
    public boolean mo9933n(Object obj) {
        if (!FragmentManager.P0(2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Predictive back not available for framework transition ");
        sb.append(obj);
        sb.append(". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // p001o.xi7
    /* renamed from: o */
    public Object mo9934o(Object obj, Object obj2, Object obj3) {
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

    @Override // p001o.xi7
    /* renamed from: p */
    public Object mo9935p(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p001o.xi7
    /* renamed from: r */
    public void mo9936r(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C17914b(view, arrayList));
    }

    @Override // p001o.xi7
    /* renamed from: s */
    public void mo9937s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new C17915c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p001o.xi7
    /* renamed from: u */
    public void mo9939u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C17917e(rect));
        }
    }

    @Override // p001o.xi7
    /* renamed from: v */
    public void mo9940v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m56331k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C17913a(rect));
        }
    }

    @Override // p001o.xi7
    /* renamed from: w */
    public void mo9941w(Fragment fragment, Object obj, ec2 ec2Var, Runnable runnable) {
        ((Transition) obj).addListener(new C17916d(runnable));
    }

    @Override // p001o.xi7
    /* renamed from: z */
    public void mo9943z(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xi7.m56328f(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo9925b(transitionSet, arrayList);
    }
}

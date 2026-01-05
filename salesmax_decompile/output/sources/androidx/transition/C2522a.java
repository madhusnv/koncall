package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.C2522a;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;
import p001o.ec2;
import p001o.qvh;
import p001o.xi7;

/* renamed from: androidx.transition.a */
/* loaded from: classes2.dex */
public class C2522a extends xi7 {

    /* renamed from: androidx.transition.a$a */
    public class a extends Transition.AbstractC2511f {

        /* renamed from: a */
        public final /* synthetic */ Rect f10409a;

        public a(Rect rect) {
            this.f10409a = rect;
        }

        @Override // androidx.transition.Transition.AbstractC2511f
        /* renamed from: a */
        public Rect mo9893a(Transition transition) {
            return this.f10409a;
        }
    }

    /* renamed from: androidx.transition.a$b */
    public class b implements Transition.InterfaceC2514i {

        /* renamed from: a */
        public final /* synthetic */ View f10411a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f10412b;

        public b(View view, ArrayList arrayList) {
            this.f10411a = view;
            this.f10412b = arrayList;
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: b */
        public void mo9820b(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: d */
        public void mo9821d(Transition transition) {
            transition.n0(this);
            transition.mo9876c(this);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: e */
        public void mo9822e(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
            transition.n0(this);
            this.f10411a.setVisibility(8);
            int size = this.f10412b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f10412b.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.a$c */
    public class c extends AbstractC2523b {

        /* renamed from: a */
        public final /* synthetic */ Object f10414a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f10415b;

        /* renamed from: c */
        public final /* synthetic */ Object f10416c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f10417d;

        /* renamed from: e */
        public final /* synthetic */ Object f10418e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f10419f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f10414a = obj;
            this.f10415b = arrayList;
            this.f10416c = obj2;
            this.f10417d = arrayList2;
            this.f10418e = obj3;
            this.f10419f = arrayList3;
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: d */
        public void mo9821d(Transition transition) {
            Object obj = this.f10414a;
            if (obj != null) {
                C2522a.this.m9923F(obj, this.f10415b, null);
            }
            Object obj2 = this.f10416c;
            if (obj2 != null) {
                C2522a.this.m9923F(obj2, this.f10417d, null);
            }
            Object obj3 = this.f10418e;
            if (obj3 != null) {
                C2522a.this.m9923F(obj3, this.f10419f, null);
            }
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
            transition.n0(this);
        }
    }

    /* renamed from: androidx.transition.a$d */
    public class d implements Transition.InterfaceC2514i {

        /* renamed from: a */
        public final /* synthetic */ Runnable f10421a;

        public d(Runnable runnable) {
            this.f10421a = runnable;
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
            this.f10421a.run();
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.a$e */
    public class e extends Transition.AbstractC2511f {

        /* renamed from: a */
        public final /* synthetic */ Rect f10423a;

        public e(Rect rect) {
            this.f10423a = rect;
        }

        @Override // androidx.transition.Transition.AbstractC2511f
        /* renamed from: a */
        public Rect mo9893a(Transition transition) {
            Rect rect = this.f10423a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f10423a;
        }
    }

    /* renamed from: D */
    public static boolean m9919D(Transition transition) {
        return (xi7.m56330l(transition.m9866M()) && xi7.m56330l(transition.m9867N()) && xi7.m56330l(transition.m9868O())) ? false : true;
    }

    /* renamed from: E */
    public static /* synthetic */ void m9920E(Runnable runnable, Transition transition, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            transition.cancel();
            runnable2.run();
        }
    }

    @Override // p001o.xi7
    /* renamed from: A */
    public void mo9921A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.m9869P().clear();
            transitionSet.m9869P().addAll(arrayList2);
            m9923F(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p001o.xi7
    /* renamed from: B */
    public Object mo9922B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.L0((Transition) obj);
        return transitionSet;
    }

    /* renamed from: F */
    public void m9923F(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int iO0 = transitionSet.O0();
            while (i < iO0) {
                m9923F(transitionSet.N0(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m9919D(transition)) {
            return;
        }
        List listM9869P = transition.m9869P();
        if (listM9869P.size() == arrayList.size() && listM9869P.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.mo9877f((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.o0((View) arrayList.get(size2));
            }
        }
    }

    @Override // p001o.xi7
    /* renamed from: a */
    public void mo9924a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo9877f(view);
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
            int iO0 = transitionSet.O0();
            while (i < iO0) {
                mo9925b(transitionSet.N0(i), arrayList);
                i++;
            }
            return;
        }
        if (m9919D(transition) || !xi7.m56330l(transition.m9869P())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.mo9877f((View) arrayList.get(i));
            i++;
        }
    }

    @Override // p001o.xi7
    /* renamed from: c */
    public void mo9926c(Object obj) {
        ((qvh) obj).mo9898a();
    }

    @Override // p001o.xi7
    /* renamed from: d */
    public void mo9927d(Object obj, Runnable runnable) {
        ((qvh) obj).mo9901i(runnable);
    }

    @Override // p001o.xi7
    /* renamed from: e */
    public void mo9928e(ViewGroup viewGroup, Object obj) {
        AbstractC2524c.m9945b(viewGroup, (Transition) obj);
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
    /* renamed from: j */
    public Object mo9931j(ViewGroup viewGroup, Object obj) {
        return AbstractC2524c.m9947d(viewGroup, (Transition) obj);
    }

    @Override // p001o.xi7
    /* renamed from: m */
    public boolean mo9932m() {
        return true;
    }

    @Override // p001o.xi7
    /* renamed from: n */
    public boolean mo9933n(Object obj) {
        boolean zMo9806U = ((Transition) obj).mo9806U();
        if (!zMo9806U) {
            StringBuilder sb = new StringBuilder();
            sb.append("Predictive back not available for AndroidX Transition ");
            sb.append(obj);
            sb.append(". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zMo9806U;
    }

    @Override // p001o.xi7
    /* renamed from: o */
    public Object mo9934o(Object obj, Object obj2, Object obj3) {
        Transition transitionX0 = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (transitionX0 != null && transition != null) {
            transitionX0 = new TransitionSet().L0(transitionX0).L0(transition).X0(1);
        } else if (transitionX0 == null) {
            transitionX0 = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return transitionX0;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transitionX0 != null) {
            transitionSet.L0(transitionX0);
        }
        transitionSet.L0(transition2);
        return transitionSet;
    }

    @Override // p001o.xi7
    /* renamed from: p */
    public Object mo9935p(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.L0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.L0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.L0((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p001o.xi7
    /* renamed from: r */
    public void mo9936r(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).mo9876c(new b(view, arrayList));
    }

    @Override // p001o.xi7
    /* renamed from: s */
    public void mo9937s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).mo9876c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p001o.xi7
    /* renamed from: t */
    public void mo9938t(Object obj, float f) {
        qvh qvhVar = (qvh) obj;
        if (qvhVar.isReady()) {
            long jMo9899c = (long) (f * qvhVar.mo9899c());
            if (jMo9899c == 0) {
                jMo9899c = 1;
            }
            if (jMo9899c == qvhVar.mo9899c()) {
                jMo9899c = qvhVar.mo9899c() - 1;
            }
            qvhVar.mo9900f(jMo9899c);
        }
    }

    @Override // p001o.xi7
    /* renamed from: u */
    public void mo9939u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).x0(new e(rect));
        }
    }

    @Override // p001o.xi7
    /* renamed from: v */
    public void mo9940v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m56331k(view, rect);
            ((Transition) obj).x0(new a(rect));
        }
    }

    @Override // p001o.xi7
    /* renamed from: w */
    public void mo9941w(Fragment fragment, Object obj, ec2 ec2Var, Runnable runnable) {
        mo9942x(fragment, obj, ec2Var, null, runnable);
    }

    @Override // p001o.xi7
    /* renamed from: x */
    public void mo9942x(Fragment fragment, Object obj, ec2 ec2Var, final Runnable runnable, final Runnable runnable2) {
        final Transition transition = (Transition) obj;
        ec2Var.m24746b(new ec2.InterfaceC13157a() { // from class: o.yi7
            @Override // p001o.ec2.InterfaceC13157a
            public final void onCancel() {
                C2522a.m9920E(runnable, transition, runnable2);
            }
        });
        transition.mo9876c(new d(runnable2));
    }

    @Override // p001o.xi7
    /* renamed from: z */
    public void mo9943z(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List listM9869P = transitionSet.m9869P();
        listM9869P.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xi7.m56328f(listM9869P, (View) arrayList.get(i));
        }
        listM9869P.add(view);
        arrayList.add(view);
        mo9925b(transitionSet, arrayList);
    }
}

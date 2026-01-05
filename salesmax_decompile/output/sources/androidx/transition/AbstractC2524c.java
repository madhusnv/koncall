package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p001o.qvh;
import p001o.vo0;
import p001o.w4f;

/* renamed from: androidx.transition.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2524c {

    /* renamed from: a */
    public static Transition f10425a = new AutoTransition();

    /* renamed from: b */
    public static ThreadLocal f10426b = new ThreadLocal();

    /* renamed from: c */
    public static ArrayList f10427c = new ArrayList();

    /* renamed from: androidx.transition.c$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public Transition f10428a;

        /* renamed from: b */
        public ViewGroup f10429b;

        /* renamed from: androidx.transition.c$a$a, reason: collision with other inner class name */
        public class C19579a extends AbstractC2523b {

            /* renamed from: a */
            public final /* synthetic */ vo0 f10430a;

            public C19579a(vo0 vo0Var) {
                this.f10430a = vo0Var;
            }

            @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
            /* renamed from: h */
            public void mo9823h(Transition transition) {
                ((ArrayList) this.f10430a.get(a.this.f10429b)).remove(transition);
                transition.n0(this);
            }
        }

        public a(Transition transition, ViewGroup viewGroup) {
            this.f10428a = transition;
            this.f10429b = viewGroup;
        }

        /* renamed from: a */
        public final void m9953a() {
            this.f10429b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f10429b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m9953a();
            if (!AbstractC2524c.f10427c.remove(this.f10429b)) {
                return true;
            }
            vo0 vo0VarM9948e = AbstractC2524c.m9948e();
            ArrayList arrayList = (ArrayList) vo0VarM9948e.get(this.f10429b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                vo0VarM9948e.put(this.f10429b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f10428a);
            this.f10428a.mo9876c(new C19579a(vo0VarM9948e));
            this.f10428a.m9882p(this.f10429b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).p0(this.f10429b);
                }
            }
            this.f10428a.l0(this.f10429b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m9953a();
            AbstractC2524c.f10427c.remove(this.f10429b);
            ArrayList arrayList = (ArrayList) AbstractC2524c.m9948e().get(this.f10429b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).p0(this.f10429b);
                }
            }
            this.f10428a.m9883q(true);
        }
    }

    /* renamed from: a */
    public static void m9944a(ViewGroup viewGroup) {
        m9945b(viewGroup, null);
    }

    /* renamed from: b */
    public static void m9945b(ViewGroup viewGroup, Transition transition) {
        if (f10427c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f10427c.add(viewGroup);
        if (transition == null) {
            transition = f10425a;
        }
        Transition transitionClone = transition.clone();
        m9952i(viewGroup, transitionClone);
        w4f.m53933g(viewGroup, null);
        m9951h(viewGroup, transitionClone);
    }

    /* renamed from: c */
    public static void m9946c(w4f w4fVar, Transition transition) {
        ViewGroup viewGroupM53936e = w4fVar.m53936e();
        if (f10427c.contains(viewGroupM53936e)) {
            return;
        }
        w4f w4fVarM53931c = w4f.m53931c(viewGroupM53936e);
        if (transition == null) {
            if (w4fVarM53931c != null) {
                w4fVarM53931c.m53935b();
            }
            w4fVar.m53934a();
            return;
        }
        f10427c.add(viewGroupM53936e);
        Transition transitionClone = transition.clone();
        if (w4fVarM53931c != null && w4fVarM53931c.m53937f()) {
            transitionClone.s0(true);
        }
        m9952i(viewGroupM53936e, transitionClone);
        w4fVar.m53934a();
        m9951h(viewGroupM53936e, transitionClone);
    }

    /* renamed from: d */
    public static qvh m9947d(ViewGroup viewGroup, Transition transition) {
        if (f10427c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!transition.mo9806U()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f10427c.add(viewGroup);
        Transition transitionClone = transition.clone();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.L0(transitionClone);
        m9952i(viewGroup, transitionSet);
        w4f.m53933g(viewGroup, null);
        m9951h(viewGroup, transitionSet);
        viewGroup.invalidate();
        return transitionSet.m9886v();
    }

    /* renamed from: e */
    public static vo0 m9948e() {
        vo0 vo0Var;
        WeakReference weakReference = (WeakReference) f10426b.get();
        if (weakReference != null && (vo0Var = (vo0) weakReference.get()) != null) {
            return vo0Var;
        }
        vo0 vo0Var2 = new vo0();
        f10426b.set(new WeakReference(vo0Var2));
        return vo0Var2;
    }

    /* renamed from: f */
    public static void m9949f(w4f w4fVar) {
        m9946c(w4fVar, f10425a);
    }

    /* renamed from: g */
    public static void m9950g(w4f w4fVar, Transition transition) {
        m9946c(w4fVar, transition);
    }

    /* renamed from: h */
    public static void m9951h(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        a aVar = new a(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: i */
    public static void m9952i(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) m9948e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).i0(viewGroup);
            }
        }
        if (transition != null) {
            transition.m9882p(viewGroup, true);
        }
        w4f w4fVarM53931c = w4f.m53931c(viewGroup);
        if (w4fVarM53931c != null) {
            w4fVarM53931c.m53935b();
        }
    }
}

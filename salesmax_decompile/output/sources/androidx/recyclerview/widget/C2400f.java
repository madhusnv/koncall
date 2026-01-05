package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.wvi;

/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes2.dex */
public class C2400f extends AbstractC2412r {

    /* renamed from: s */
    public static TimeInterpolator f9975s;

    /* renamed from: h */
    public ArrayList f9976h = new ArrayList();

    /* renamed from: i */
    public ArrayList f9977i = new ArrayList();

    /* renamed from: j */
    public ArrayList f9978j = new ArrayList();

    /* renamed from: k */
    public ArrayList f9979k = new ArrayList();

    /* renamed from: l */
    public ArrayList f9980l = new ArrayList();

    /* renamed from: m */
    public ArrayList f9981m = new ArrayList();

    /* renamed from: n */
    public ArrayList f9982n = new ArrayList();

    /* renamed from: o */
    public ArrayList f9983o = new ArrayList();

    /* renamed from: p */
    public ArrayList f9984p = new ArrayList();

    /* renamed from: q */
    public ArrayList f9985q = new ArrayList();

    /* renamed from: r */
    public ArrayList f9986r = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.f$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f9987a;

        public a(ArrayList arrayList) {
            this.f9987a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9987a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                C2400f.this.m9475T(jVar.f10021a, jVar.f10022b, jVar.f10023c, jVar.f10024d, jVar.f10025e);
            }
            this.f9987a.clear();
            C2400f.this.f9981m.remove(this.f9987a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f9989a;

        public b(ArrayList arrayList) {
            this.f9989a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9989a.iterator();
            while (it.hasNext()) {
                C2400f.this.m9474S((i) it.next());
            }
            this.f9989a.clear();
            C2400f.this.f9982n.remove(this.f9989a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f9991a;

        public c(ArrayList arrayList) {
            this.f9991a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9991a.iterator();
            while (it.hasNext()) {
                C2400f.this.m9473R((RecyclerView.d0) it.next());
            }
            this.f9991a.clear();
            C2400f.this.f9980l.remove(this.f9991a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$d */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.d0 f9993a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f9994b;

        /* renamed from: c */
        public final /* synthetic */ View f9995c;

        public d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9993a = d0Var;
            this.f9994b = viewPropertyAnimator;
            this.f9995c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9994b.setListener(null);
            this.f9995c.setAlpha(1.0f);
            C2400f.this.m9671H(this.f9993a);
            C2400f.this.f9985q.remove(this.f9993a);
            C2400f.this.m9478W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2400f.this.m9672I(this.f9993a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$e */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.d0 f9997a;

        /* renamed from: b */
        public final /* synthetic */ View f9998b;

        /* renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f9999c;

        public e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f9997a = d0Var;
            this.f9998b = view;
            this.f9999c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9998b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9999c.setListener(null);
            C2400f.this.m9665B(this.f9997a);
            C2400f.this.f9983o.remove(this.f9997a);
            C2400f.this.m9478W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2400f.this.m9666C(this.f9997a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.d0 f10001a;

        /* renamed from: b */
        public final /* synthetic */ int f10002b;

        /* renamed from: c */
        public final /* synthetic */ View f10003c;

        /* renamed from: d */
        public final /* synthetic */ int f10004d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f10005e;

        public f(RecyclerView.d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f10001a = d0Var;
            this.f10002b = i;
            this.f10003c = view;
            this.f10004d = i2;
            this.f10005e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f10002b != 0) {
                this.f10003c.setTranslationX(0.0f);
            }
            if (this.f10004d != 0) {
                this.f10003c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10005e.setListener(null);
            C2400f.this.m9669F(this.f10001a);
            C2400f.this.f9984p.remove(this.f10001a);
            C2400f.this.m9478W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2400f.this.m9670G(this.f10001a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$g */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ i f10007a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f10008b;

        /* renamed from: c */
        public final /* synthetic */ View f10009c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f10007a = iVar;
            this.f10008b = viewPropertyAnimator;
            this.f10009c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10008b.setListener(null);
            this.f10009c.setAlpha(1.0f);
            this.f10009c.setTranslationX(0.0f);
            this.f10009c.setTranslationY(0.0f);
            C2400f.this.m9667D(this.f10007a.f10015a, true);
            C2400f.this.f9986r.remove(this.f10007a.f10015a);
            C2400f.this.m9478W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2400f.this.m9668E(this.f10007a.f10015a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$h */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ i f10011a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f10012b;

        /* renamed from: c */
        public final /* synthetic */ View f10013c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f10011a = iVar;
            this.f10012b = viewPropertyAnimator;
            this.f10013c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10012b.setListener(null);
            this.f10013c.setAlpha(1.0f);
            this.f10013c.setTranslationX(0.0f);
            this.f10013c.setTranslationY(0.0f);
            C2400f.this.m9667D(this.f10011a.f10016b, false);
            C2400f.this.f9986r.remove(this.f10011a.f10016b);
            C2400f.this.m9478W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2400f.this.m9668E(this.f10011a.f10016b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$j */
    public static class j {

        /* renamed from: a */
        public RecyclerView.d0 f10021a;

        /* renamed from: b */
        public int f10022b;

        /* renamed from: c */
        public int f10023c;

        /* renamed from: d */
        public int f10024d;

        /* renamed from: e */
        public int f10025e;

        public j(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
            this.f10021a = d0Var;
            this.f10022b = i;
            this.f10023c = i2;
            this.f10024d = i3;
            this.f10025e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2412r
    /* renamed from: A */
    public boolean mo9472A(RecyclerView.d0 d0Var) {
        a0(d0Var);
        this.f9976h.add(d0Var);
        return true;
    }

    /* renamed from: R */
    public void m9473R(RecyclerView.d0 d0Var) {
        View view = d0Var.f9794a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f9983o.add(d0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(m9209l()).setListener(new e(d0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    /* renamed from: S */
    public void m9474S(i iVar) {
        RecyclerView.d0 d0Var = iVar.f10015a;
        View view = d0Var == null ? null : d0Var.f9794a;
        RecyclerView.d0 d0Var2 = iVar.f10016b;
        View view2 = d0Var2 != null ? d0Var2.f9794a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m9210m());
            this.f9986r.add(iVar.f10015a);
            duration.translationX(iVar.f10019e - iVar.f10017c);
            duration.translationY(iVar.f10020f - iVar.f10018d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f9986r.add(iVar.f10016b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m9210m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    /* renamed from: T */
    public void m9475T(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.f9794a;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f9984p.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(m9211n()).setListener(new f(d0Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }

    /* renamed from: U */
    public final void m9476U(RecyclerView.d0 d0Var) {
        View view = d0Var.f9794a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f9985q.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(m9212o()).alpha(0.0f).setListener(new d(d0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    /* renamed from: V */
    public void m9477V(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.d0) list.get(size)).f9794a.animate().cancel();
        }
    }

    /* renamed from: W */
    public void m9478W() {
        if (mo9213p()) {
            return;
        }
        m9206i();
    }

    /* renamed from: X */
    public final void m9479X(List list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (m9481Z(iVar, d0Var) && iVar.f10015a == null && iVar.f10016b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: Y */
    public final void m9480Y(i iVar) {
        RecyclerView.d0 d0Var = iVar.f10015a;
        if (d0Var != null) {
            m9481Z(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f10016b;
        if (d0Var2 != null) {
            m9481Z(iVar, d0Var2);
        }
    }

    /* renamed from: Z */
    public final boolean m9481Z(i iVar, RecyclerView.d0 d0Var) {
        boolean z = false;
        if (iVar.f10016b == d0Var) {
            iVar.f10016b = null;
        } else {
            if (iVar.f10015a != d0Var) {
                return false;
            }
            iVar.f10015a = null;
            z = true;
        }
        d0Var.f9794a.setAlpha(1.0f);
        d0Var.f9794a.setTranslationX(0.0f);
        d0Var.f9794a.setTranslationY(0.0f);
        m9667D(d0Var, z);
        return true;
    }

    public final void a0(RecyclerView.d0 d0Var) {
        if (f9975s == null) {
            f9975s = new ValueAnimator().getInterpolator();
        }
        d0Var.f9794a.animate().setInterpolator(f9975s);
        mo9207j(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m
    /* renamed from: g */
    public boolean mo9204g(RecyclerView.d0 d0Var, List list) {
        return !list.isEmpty() || super.mo9204g(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m
    /* renamed from: j */
    public void mo9207j(RecyclerView.d0 d0Var) {
        View view = d0Var.f9794a;
        view.animate().cancel();
        int size = this.f9978j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f9978j.get(size)).f10021a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m9669F(d0Var);
                this.f9978j.remove(size);
            }
        }
        m9479X(this.f9979k, d0Var);
        if (this.f9976h.remove(d0Var)) {
            view.setAlpha(1.0f);
            m9671H(d0Var);
        }
        if (this.f9977i.remove(d0Var)) {
            view.setAlpha(1.0f);
            m9665B(d0Var);
        }
        for (int size2 = this.f9982n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f9982n.get(size2);
            m9479X(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f9982n.remove(size2);
            }
        }
        for (int size3 = this.f9981m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f9981m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f10021a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m9669F(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f9981m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f9980l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f9980l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                m9665B(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f9980l.remove(size5);
                }
            }
        }
        this.f9985q.remove(d0Var);
        this.f9983o.remove(d0Var);
        this.f9986r.remove(d0Var);
        this.f9984p.remove(d0Var);
        m9478W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m
    /* renamed from: k */
    public void mo9208k() {
        int size = this.f9978j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f9978j.get(size);
            View view = jVar.f10021a.f9794a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m9669F(jVar.f10021a);
            this.f9978j.remove(size);
        }
        for (int size2 = this.f9976h.size() - 1; size2 >= 0; size2--) {
            m9671H((RecyclerView.d0) this.f9976h.get(size2));
            this.f9976h.remove(size2);
        }
        int size3 = this.f9977i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = (RecyclerView.d0) this.f9977i.get(size3);
            d0Var.f9794a.setAlpha(1.0f);
            m9665B(d0Var);
            this.f9977i.remove(size3);
        }
        for (int size4 = this.f9979k.size() - 1; size4 >= 0; size4--) {
            m9480Y((i) this.f9979k.get(size4));
        }
        this.f9979k.clear();
        if (mo9213p()) {
            for (int size5 = this.f9981m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f9981m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f10021a.f9794a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m9669F(jVar2.f10021a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f9981m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f9980l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f9980l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = (RecyclerView.d0) arrayList2.get(size8);
                    d0Var2.f9794a.setAlpha(1.0f);
                    m9665B(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f9980l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f9982n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f9982n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m9480Y((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f9982n.remove(arrayList3);
                    }
                }
            }
            m9477V(this.f9985q);
            m9477V(this.f9984p);
            m9477V(this.f9983o);
            m9477V(this.f9986r);
            m9206i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m
    /* renamed from: p */
    public boolean mo9213p() {
        return (this.f9977i.isEmpty() && this.f9979k.isEmpty() && this.f9978j.isEmpty() && this.f9976h.isEmpty() && this.f9984p.isEmpty() && this.f9985q.isEmpty() && this.f9983o.isEmpty() && this.f9986r.isEmpty() && this.f9981m.isEmpty() && this.f9980l.isEmpty() && this.f9982n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m
    /* renamed from: v */
    public void mo9219v() {
        boolean z = !this.f9976h.isEmpty();
        boolean z2 = !this.f9978j.isEmpty();
        boolean z3 = !this.f9979k.isEmpty();
        boolean z4 = !this.f9977i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f9976h.iterator();
            while (it.hasNext()) {
                m9476U((RecyclerView.d0) it.next());
            }
            this.f9976h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f9978j);
                this.f9981m.add(arrayList);
                this.f9978j.clear();
                a aVar = new a(arrayList);
                if (z) {
                    wvi.f0(((j) arrayList.get(0)).f10021a.f9794a, aVar, m9212o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f9979k);
                this.f9982n.add(arrayList2);
                this.f9979k.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    wvi.f0(((i) arrayList2.get(0)).f10015a.f9794a, bVar, m9212o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f9977i);
                this.f9980l.add(arrayList3);
                this.f9977i.clear();
                c cVar = new c(arrayList3);
                if (z || z2 || z3) {
                    wvi.f0(((RecyclerView.d0) arrayList3.get(0)).f9794a, cVar, (z ? m9212o() : 0L) + Math.max(z2 ? m9211n() : 0L, z3 ? m9210m() : 0L));
                } else {
                    cVar.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2412r
    /* renamed from: x */
    public boolean mo9482x(RecyclerView.d0 d0Var) {
        a0(d0Var);
        d0Var.f9794a.setAlpha(0.0f);
        this.f9977i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2412r
    /* renamed from: y */
    public boolean mo9483y(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
        if (d0Var == d0Var2) {
            return mo9484z(d0Var, i2, i3, i4, i5);
        }
        float translationX = d0Var.f9794a.getTranslationX();
        float translationY = d0Var.f9794a.getTranslationY();
        float alpha = d0Var.f9794a.getAlpha();
        a0(d0Var);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        d0Var.f9794a.setTranslationX(translationX);
        d0Var.f9794a.setTranslationY(translationY);
        d0Var.f9794a.setAlpha(alpha);
        if (d0Var2 != null) {
            a0(d0Var2);
            d0Var2.f9794a.setTranslationX(-i6);
            d0Var2.f9794a.setTranslationY(-i7);
            d0Var2.f9794a.setAlpha(0.0f);
        }
        this.f9979k.add(new i(d0Var, d0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2412r
    /* renamed from: z */
    public boolean mo9484z(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.f9794a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) d0Var.f9794a.getTranslationY());
        a0(d0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            m9669F(d0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.f9978j.add(new j(d0Var, translationX, translationY, i4, i5));
        return true;
    }

    /* renamed from: androidx.recyclerview.widget.f$i */
    public static class i {

        /* renamed from: a */
        public RecyclerView.d0 f10015a;

        /* renamed from: b */
        public RecyclerView.d0 f10016b;

        /* renamed from: c */
        public int f10017c;

        /* renamed from: d */
        public int f10018d;

        /* renamed from: e */
        public int f10019e;

        /* renamed from: f */
        public int f10020f;

        public i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f10015a = d0Var;
            this.f10016b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f10015a + ", newHolder=" + this.f10016b + ", fromX=" + this.f10017c + ", fromY=" + this.f10018d + ", toX=" + this.f10019e + ", toY=" + this.f10020f + '}';
        }

        public i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f10017c = i;
            this.f10018d = i2;
            this.f10019e = i3;
            this.f10020f = i4;
        }
    }
}

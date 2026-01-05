package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC2126l;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p001o.hh3;
import p001o.i0g;
import p001o.id5;
import p001o.kh3;
import p001o.l91;
import p001o.sq8;
import p001o.y3i;
import p001o.y8e;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes2.dex */
public abstract class AbstractC2126l {

    /* renamed from: g */
    public static final a f7613g = new a(null);

    /* renamed from: a */
    public final ViewGroup f7614a;

    /* renamed from: b */
    public final List f7615b;

    /* renamed from: c */
    public final List f7616c;

    /* renamed from: d */
    public boolean f7617d;

    /* renamed from: e */
    public boolean f7618e;

    /* renamed from: f */
    public boolean f7619f;

    /* renamed from: androidx.fragment.app.l$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final AbstractC2126l m6466a(ViewGroup viewGroup, FragmentManager fragmentManager) {
            sq8.m48649h(viewGroup, "container");
            sq8.m48649h(fragmentManager, "fragmentManager");
            i0g i0gVarH0 = fragmentManager.H0();
            sq8.m48648g(i0gVarH0, "fragmentManager.specialEffectsControllerFactory");
            return m6467b(viewGroup, i0gVarH0);
        }

        /* renamed from: b */
        public final AbstractC2126l m6467b(ViewGroup viewGroup, i0g i0gVar) {
            sq8.m48649h(viewGroup, "container");
            sq8.m48649h(i0gVar, "factory");
            Object tag = viewGroup.getTag(y8e.special_effects_controller_view_tag);
            if (tag instanceof AbstractC2126l) {
                return (AbstractC2126l) tag;
            }
            AbstractC2126l abstractC2126lMo6227a = i0gVar.mo6227a(viewGroup);
            sq8.m48648g(abstractC2126lMo6227a, "factory.createController(container)");
            viewGroup.setTag(y8e.special_effects_controller_view_tag, abstractC2126lMo6227a);
            return abstractC2126lMo6227a;
        }
    }

    /* renamed from: androidx.fragment.app.l$b */
    public static class b {

        /* renamed from: a */
        public final boolean f7620a;

        /* renamed from: b */
        public boolean f7621b;

        /* renamed from: c */
        public boolean f7622c;

        /* renamed from: a */
        public final void m6468a(ViewGroup viewGroup) {
            sq8.m48649h(viewGroup, "container");
            if (!this.f7622c) {
                mo6280c(viewGroup);
            }
            this.f7622c = true;
        }

        /* renamed from: b */
        public boolean mo6286b() {
            return this.f7620a;
        }

        /* renamed from: c */
        public abstract void mo6280c(ViewGroup viewGroup);

        /* renamed from: d */
        public abstract void mo6281d(ViewGroup viewGroup);

        /* renamed from: e */
        public void mo6287e(l91 l91Var, ViewGroup viewGroup) {
            sq8.m48649h(l91Var, "backEvent");
            sq8.m48649h(viewGroup, "container");
        }

        /* renamed from: f */
        public void mo6288f(ViewGroup viewGroup) {
            sq8.m48649h(viewGroup, "container");
        }

        /* renamed from: g */
        public final void m6469g(ViewGroup viewGroup) {
            sq8.m48649h(viewGroup, "container");
            if (!this.f7621b) {
                mo6288f(viewGroup);
            }
            this.f7621b = true;
        }
    }

    /* renamed from: androidx.fragment.app.l$c */
    public static final class c extends d {

        /* renamed from: l */
        public final C2122h f7623l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b bVar, d.a aVar, C2122h c2122h) {
            sq8.m48649h(bVar, "finalState");
            sq8.m48649h(aVar, "lifecycleImpact");
            sq8.m48649h(c2122h, "fragmentStateManager");
            Fragment fragmentM6378k = c2122h.m6378k();
            sq8.m48648g(fragmentM6378k, "fragmentStateManager.fragment");
            super(bVar, aVar, fragmentM6378k);
            this.f7623l = c2122h;
        }

        @Override // androidx.fragment.app.AbstractC2126l.d
        /* renamed from: d */
        public void mo6470d() {
            super.mo6470d();
            m6478h().mTransitioning = false;
            this.f7623l.m6380m();
        }

        @Override // androidx.fragment.app.AbstractC2126l.d
        /* renamed from: p */
        public void mo6471p() {
            if (m6484n()) {
                return;
            }
            super.mo6471p();
            if (m6479i() != d.a.ADDING) {
                if (m6479i() == d.a.REMOVING) {
                    Fragment fragmentM6378k = this.f7623l.m6378k();
                    sq8.m48648g(fragmentM6378k, "fragmentStateManager.fragment");
                    View viewRequireView = fragmentM6378k.requireView();
                    sq8.m48648g(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.P0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Clearing focus ");
                        sb.append(viewRequireView.findFocus());
                        sb.append(" on view ");
                        sb.append(viewRequireView);
                        sb.append(" for Fragment ");
                        sb.append(fragmentM6378k);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentM6378k2 = this.f7623l.m6378k();
            sq8.m48648g(fragmentM6378k2, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentM6378k2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentM6378k2.setFocusedView(viewFindFocus);
                if (FragmentManager.P0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("requestFocus: Saved focused view ");
                    sb2.append(viewFindFocus);
                    sb2.append(" for Fragment ");
                    sb2.append(fragmentM6378k2);
                }
            }
            View viewRequireView2 = m6478h().requireView();
            sq8.m48648g(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f7623l.m6369b();
                viewRequireView2.setAlpha(0.0f);
            }
            if ((viewRequireView2.getAlpha() == 0.0f) && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentM6378k2.getPostOnViewCreatedAlpha());
        }
    }

    /* renamed from: androidx.fragment.app.l$d */
    public static class d {

        /* renamed from: a */
        public b f7624a;

        /* renamed from: b */
        public a f7625b;

        /* renamed from: c */
        public final Fragment f7626c;

        /* renamed from: d */
        public final List f7627d;

        /* renamed from: e */
        public boolean f7628e;

        /* renamed from: f */
        public boolean f7629f;

        /* renamed from: g */
        public boolean f7630g;

        /* renamed from: h */
        public boolean f7631h;

        /* renamed from: i */
        public boolean f7632i;

        /* renamed from: j */
        public final List f7633j;

        /* renamed from: k */
        public final List f7634k;

        /* renamed from: androidx.fragment.app.l$d$a */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.l$d$b */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final a Companion = new a(null);

            /* renamed from: androidx.fragment.app.l$d$b$a */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(id5 id5Var) {
                    this();
                }

                /* renamed from: a */
                public final b m6488a(View view) {
                    sq8.m48649h(view, "<this>");
                    return (((view.getAlpha() > 0.0f ? 1 : (view.getAlpha() == 0.0f ? 0 : -1)) == 0) && view.getVisibility() == 0) ? b.INVISIBLE : m6489b(view.getVisibility());
                }

                /* renamed from: b */
                public final b m6489b(int i) {
                    if (i == 0) {
                        return b.VISIBLE;
                    }
                    if (i == 4) {
                        return b.INVISIBLE;
                    }
                    if (i == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i);
                }
            }

            /* renamed from: androidx.fragment.app.l$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C19560b {

                /* renamed from: a */
                public static final /* synthetic */ int[] f7635a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f7635a = iArr;
                }
            }

            public static final b from(int i) {
                return Companion.m6489b(i);
            }

            public final void applyState(View view, ViewGroup viewGroup) {
                sq8.m48649h(view, "view");
                sq8.m48649h(viewGroup, "container");
                int i = C19560b.f7635a[ordinal()];
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (FragmentManager.P0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup2);
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.P0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.P0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("SpecialEffectsController: Adding view ");
                            sb3.append(view);
                            sb3.append(" to Container ");
                            sb3.append(viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (FragmentManager.P0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Setting view ");
                        sb4.append(view);
                        sb4.append(" to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i != 4) {
                    return;
                }
                if (FragmentManager.P0(2)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("SpecialEffectsController: Setting view ");
                    sb5.append(view);
                    sb5.append(" to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* renamed from: androidx.fragment.app.l$d$c */
        public /* synthetic */ class c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f7636a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f7636a = iArr;
            }
        }

        public d(b bVar, a aVar, Fragment fragment) {
            sq8.m48649h(bVar, "finalState");
            sq8.m48649h(aVar, "lifecycleImpact");
            sq8.m48649h(fragment, "fragment");
            this.f7624a = bVar;
            this.f7625b = aVar;
            this.f7626c = fragment;
            this.f7627d = new ArrayList();
            this.f7632i = true;
            ArrayList arrayList = new ArrayList();
            this.f7633j = arrayList;
            this.f7634k = arrayList;
        }

        /* renamed from: a */
        public final void m6472a(Runnable runnable) {
            sq8.m48649h(runnable, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f7627d.add(runnable);
        }

        /* renamed from: b */
        public final void m6473b(b bVar) {
            sq8.m48649h(bVar, "effect");
            this.f7633j.add(bVar);
        }

        /* renamed from: c */
        public final void m6474c(ViewGroup viewGroup) {
            sq8.m48649h(viewGroup, "container");
            this.f7631h = false;
            if (this.f7628e) {
                return;
            }
            this.f7628e = true;
            if (this.f7633j.isEmpty()) {
                mo6470d();
                return;
            }
            Iterator it = kh3.Q0(this.f7634k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).m6468a(viewGroup);
            }
        }

        /* renamed from: d */
        public void mo6470d() {
            this.f7631h = false;
            if (this.f7629f) {
                return;
            }
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
            }
            this.f7629f = true;
            Iterator it = this.f7627d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        /* renamed from: e */
        public final void m6475e(b bVar) {
            sq8.m48649h(bVar, "effect");
            if (this.f7633j.remove(bVar) && this.f7633j.isEmpty()) {
                mo6470d();
            }
        }

        /* renamed from: f */
        public final List m6476f() {
            return this.f7634k;
        }

        /* renamed from: g */
        public final b m6477g() {
            return this.f7624a;
        }

        /* renamed from: h */
        public final Fragment m6478h() {
            return this.f7626c;
        }

        /* renamed from: i */
        public final a m6479i() {
            return this.f7625b;
        }

        /* renamed from: j */
        public final boolean m6480j() {
            return this.f7632i;
        }

        /* renamed from: k */
        public final boolean m6481k() {
            return this.f7628e;
        }

        /* renamed from: l */
        public final boolean m6482l() {
            return this.f7629f;
        }

        /* renamed from: m */
        public final boolean m6483m() {
            return this.f7630g;
        }

        /* renamed from: n */
        public final boolean m6484n() {
            return this.f7631h;
        }

        /* renamed from: o */
        public final void m6485o(b bVar, a aVar) {
            sq8.m48649h(bVar, "finalState");
            sq8.m48649h(aVar, "lifecycleImpact");
            int i = c.f7636a[aVar.ordinal()];
            if (i == 1) {
                if (this.f7624a == b.REMOVED) {
                    if (FragmentManager.P0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.f7626c);
                        sb.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        sb.append(this.f7625b);
                        sb.append(" to ADDING.");
                    }
                    this.f7624a = b.VISIBLE;
                    this.f7625b = a.ADDING;
                    this.f7632i = true;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.P0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.f7626c);
                    sb2.append(" mFinalState = ");
                    sb2.append(this.f7624a);
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append(this.f7625b);
                    sb2.append(" to REMOVING.");
                }
                this.f7624a = b.REMOVED;
                this.f7625b = a.REMOVING;
                this.f7632i = true;
                return;
            }
            if (i == 3 && this.f7624a != b.REMOVED) {
                if (FragmentManager.P0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.f7626c);
                    sb3.append(" mFinalState = ");
                    sb3.append(this.f7624a);
                    sb3.append(" -> ");
                    sb3.append(bVar);
                    sb3.append('.');
                }
                this.f7624a = bVar;
            }
        }

        /* renamed from: p */
        public void mo6471p() {
            this.f7631h = true;
        }

        /* renamed from: q */
        public final void m6486q(boolean z) {
            this.f7632i = z;
        }

        /* renamed from: r */
        public final void m6487r(boolean z) {
            this.f7630g = z;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f7624a + " lifecycleImpact = " + this.f7625b + " fragment = " + this.f7626c + '}';
        }
    }

    /* renamed from: androidx.fragment.app.l$e */
    public /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7637a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7637a = iArr;
        }
    }

    public AbstractC2126l(ViewGroup viewGroup) {
        sq8.m48649h(viewGroup, "container");
        this.f7614a = viewGroup;
        this.f7615b = new ArrayList();
        this.f7616c = new ArrayList();
    }

    /* renamed from: h */
    public static final void m6439h(AbstractC2126l abstractC2126l, c cVar) {
        sq8.m48649h(abstractC2126l, "this$0");
        sq8.m48649h(cVar, "$operation");
        if (abstractC2126l.f7615b.contains(cVar)) {
            d.b bVarM6477g = cVar.m6477g();
            View view = cVar.m6478h().mView;
            sq8.m48648g(view, "operation.fragment.mView");
            bVarM6477g.applyState(view, abstractC2126l.f7614a);
        }
    }

    /* renamed from: i */
    public static final void m6440i(AbstractC2126l abstractC2126l, c cVar) {
        sq8.m48649h(abstractC2126l, "this$0");
        sq8.m48649h(cVar, "$operation");
        abstractC2126l.f7615b.remove(cVar);
        abstractC2126l.f7616c.remove(cVar);
    }

    /* renamed from: u */
    public static final AbstractC2126l m6441u(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return f7613g.m6466a(viewGroup, fragmentManager);
    }

    /* renamed from: v */
    public static final AbstractC2126l m6442v(ViewGroup viewGroup, i0g i0gVar) {
        return f7613g.m6467b(viewGroup, i0gVar);
    }

    /* renamed from: A */
    public final void m6443A(l91 l91Var) {
        sq8.m48649h(l91Var, "backEvent");
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Processing Progress ");
            sb.append(l91Var.m36806a());
        }
        List list = this.f7616c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hh3.m30441A(arrayList, ((d) it.next()).m6476f());
        }
        List listQ0 = kh3.Q0(kh3.V0(arrayList));
        int size = listQ0.size();
        for (int i = 0; i < size; i++) {
            ((b) listQ0.get(i)).mo6287e(l91Var, this.f7614a);
        }
    }

    /* renamed from: B */
    public final void m6444B(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((d) list.get(i)).mo6471p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hh3.m30441A(arrayList, ((d) it.next()).m6476f());
        }
        List listQ0 = kh3.Q0(kh3.V0(arrayList));
        int size2 = listQ0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((b) listQ0.get(i2)).m6469g(this.f7614a);
        }
    }

    /* renamed from: C */
    public final void m6445C() {
        for (d dVar : this.f7615b) {
            if (dVar.m6479i() == d.a.ADDING) {
                View viewRequireView = dVar.m6478h().requireView();
                sq8.m48648g(viewRequireView, "fragment.requireView()");
                dVar.m6485o(d.b.Companion.m6489b(viewRequireView.getVisibility()), d.a.NONE);
            }
        }
    }

    /* renamed from: D */
    public final void m6446D(boolean z) {
        this.f7618e = z;
    }

    /* renamed from: c */
    public final void m6447c(d dVar) {
        sq8.m48649h(dVar, "operation");
        if (dVar.m6480j()) {
            d.b bVarM6477g = dVar.m6477g();
            View viewRequireView = dVar.m6478h().requireView();
            sq8.m48648g(viewRequireView, "operation.fragment.requireView()");
            bVarM6477g.applyState(viewRequireView, this.f7614a);
            dVar.m6486q(false);
        }
    }

    /* renamed from: d */
    public abstract void mo6279d(List list, boolean z);

    /* renamed from: e */
    public void m6448e(List list) {
        sq8.m48649h(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hh3.m30441A(arrayList, ((d) it.next()).m6476f());
        }
        List listQ0 = kh3.Q0(kh3.V0(arrayList));
        int size = listQ0.size();
        for (int i = 0; i < size; i++) {
            ((b) listQ0.get(i)).mo6281d(this.f7614a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m6447c((d) list.get(i2));
        }
        List listQ02 = kh3.Q0(list);
        int size3 = listQ02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            d dVar = (d) listQ02.get(i3);
            if (dVar.m6476f().isEmpty()) {
                dVar.mo6470d();
            }
        }
    }

    /* renamed from: f */
    public final void m6449f() {
        FragmentManager.P0(3);
        m6444B(this.f7616c);
        m6448e(this.f7616c);
    }

    /* renamed from: g */
    public final void m6450g(d.b bVar, d.a aVar, C2122h c2122h) {
        synchronized (this.f7615b) {
            Fragment fragmentM6378k = c2122h.m6378k();
            sq8.m48648g(fragmentM6378k, "fragmentStateManager.fragment");
            d dVarM6456o = m6456o(fragmentM6378k);
            if (dVarM6456o == null) {
                if (c2122h.m6378k().mTransitioning) {
                    Fragment fragmentM6378k2 = c2122h.m6378k();
                    sq8.m48648g(fragmentM6378k2, "fragmentStateManager.fragment");
                    dVarM6456o = m6457p(fragmentM6378k2);
                } else {
                    dVarM6456o = null;
                }
            }
            if (dVarM6456o != null) {
                dVarM6456o.m6485o(bVar, aVar);
                return;
            }
            final c cVar = new c(bVar, aVar, c2122h);
            this.f7615b.add(cVar);
            cVar.m6472a(new Runnable() { // from class: o.g0g
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2126l.m6439h(this.f24337a, cVar);
                }
            });
            cVar.m6472a(new Runnable() { // from class: o.h0g
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2126l.m6440i(this.f26063a, cVar);
                }
            });
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: j */
    public final void m6451j(d.b bVar, C2122h c2122h) {
        sq8.m48649h(bVar, "finalState");
        sq8.m48649h(c2122h, "fragmentStateManager");
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(c2122h.m6378k());
        }
        m6450g(bVar, d.a.ADDING, c2122h);
    }

    /* renamed from: k */
    public final void m6452k(C2122h c2122h) {
        sq8.m48649h(c2122h, "fragmentStateManager");
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(c2122h.m6378k());
        }
        m6450g(d.b.GONE, d.a.NONE, c2122h);
    }

    /* renamed from: l */
    public final void m6453l(C2122h c2122h) {
        sq8.m48649h(c2122h, "fragmentStateManager");
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(c2122h.m6378k());
        }
        m6450g(d.b.REMOVED, d.a.REMOVING, c2122h);
    }

    /* renamed from: m */
    public final void m6454m(C2122h c2122h) {
        sq8.m48649h(c2122h, "fragmentStateManager");
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(c2122h.m6378k());
        }
        m6450g(d.b.VISIBLE, d.a.NONE, c2122h);
    }

    /* renamed from: n */
    public final void m6455n() {
        boolean z;
        if (this.f7619f) {
            return;
        }
        if (!this.f7614a.isAttachedToWindow()) {
            m6458q();
            this.f7618e = false;
            return;
        }
        synchronized (this.f7615b) {
            List<d> listT0 = kh3.T0(this.f7616c);
            this.f7616c.clear();
            Iterator it = listT0.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                d dVar = (d) it.next();
                if (!(!this.f7615b.isEmpty()) || !dVar.m6478h().mTransitioning) {
                    z = false;
                }
                dVar.m6487r(z);
            }
            for (d dVar2 : listT0) {
                if (this.f7617d) {
                    if (FragmentManager.P0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Completing non-seekable operation ");
                        sb.append(dVar2);
                    }
                    dVar2.mo6470d();
                } else {
                    if (FragmentManager.P0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Cancelling operation ");
                        sb2.append(dVar2);
                    }
                    dVar2.m6474c(this.f7614a);
                }
                this.f7617d = false;
                if (!dVar2.m6482l()) {
                    this.f7616c.add(dVar2);
                }
            }
            if (!this.f7615b.isEmpty()) {
                m6445C();
                List listT02 = kh3.T0(this.f7615b);
                if (listT02.isEmpty()) {
                    return;
                }
                this.f7615b.clear();
                this.f7616c.addAll(listT02);
                FragmentManager.P0(2);
                mo6279d(listT02, this.f7618e);
                boolean zM6462w = m6462w(listT02);
                boolean zM6463x = m6463x(listT02);
                if (!zM6463x || zM6462w) {
                    z = false;
                }
                this.f7617d = z;
                if (FragmentManager.P0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: Operation seekable = ");
                    sb3.append(zM6462w);
                    sb3.append(" \ntransition = ");
                    sb3.append(zM6463x);
                }
                if (!zM6463x) {
                    m6444B(listT02);
                    m6448e(listT02);
                } else if (zM6462w) {
                    m6444B(listT02);
                    int size = listT02.size();
                    for (int i = 0; i < size; i++) {
                        m6447c((d) listT02.get(i));
                    }
                }
                this.f7618e = false;
                FragmentManager.P0(2);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: o */
    public final d m6456o(Fragment fragment) {
        Object next;
        Iterator it = this.f7615b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (sq8.m48644c(dVar.m6478h(), fragment) && !dVar.m6481k()) {
                break;
            }
        }
        return (d) next;
    }

    /* renamed from: p */
    public final d m6457p(Fragment fragment) {
        Object next;
        Iterator it = this.f7616c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (sq8.m48644c(dVar.m6478h(), fragment) && !dVar.m6481k()) {
                break;
            }
        }
        return (d) next;
    }

    /* renamed from: q */
    public final void m6458q() {
        FragmentManager.P0(2);
        boolean zIsAttachedToWindow = this.f7614a.isAttachedToWindow();
        synchronized (this.f7615b) {
            m6445C();
            m6444B(this.f7615b);
            List<d> listT0 = kh3.T0(this.f7616c);
            Iterator it = listT0.iterator();
            while (it.hasNext()) {
                ((d) it.next()).m6487r(false);
            }
            for (d dVar : listT0) {
                if (FragmentManager.P0(2)) {
                    String str = zIsAttachedToWindow ? "" : "Container " + this.f7614a + " is not attached to window. ";
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(str);
                    sb.append("Cancelling running operation ");
                    sb.append(dVar);
                }
                dVar.m6474c(this.f7614a);
            }
            List<d> listT02 = kh3.T0(this.f7615b);
            Iterator it2 = listT02.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).m6487r(false);
            }
            for (d dVar2 : listT02) {
                if (FragmentManager.P0(2)) {
                    String str2 = zIsAttachedToWindow ? "" : "Container " + this.f7614a + " is not attached to window. ";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(str2);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dVar2);
                }
                dVar2.m6474c(this.f7614a);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: r */
    public final void m6459r() {
        if (this.f7619f) {
            FragmentManager.P0(2);
            this.f7619f = false;
            m6455n();
        }
    }

    /* renamed from: s */
    public final d.a m6460s(C2122h c2122h) {
        sq8.m48649h(c2122h, "fragmentStateManager");
        Fragment fragmentM6378k = c2122h.m6378k();
        sq8.m48648g(fragmentM6378k, "fragmentStateManager.fragment");
        d dVarM6456o = m6456o(fragmentM6378k);
        d.a aVarM6479i = dVarM6456o != null ? dVarM6456o.m6479i() : null;
        d dVarM6457p = m6457p(fragmentM6378k);
        d.a aVarM6479i2 = dVarM6457p != null ? dVarM6457p.m6479i() : null;
        int i = aVarM6479i == null ? -1 : e.f7637a[aVarM6479i.ordinal()];
        return (i == -1 || i == 1) ? aVarM6479i2 : aVarM6479i;
    }

    /* renamed from: t */
    public final ViewGroup m6461t() {
        return this.f7614a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0048 A[SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m6462w(List list) {
        boolean z;
        boolean z2;
        Iterator it = list.iterator();
        loop0: while (true) {
            z = true;
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (!dVar.m6476f().isEmpty()) {
                    List listM6476f = dVar.m6476f();
                    if ((listM6476f instanceof Collection) && listM6476f.isEmpty()) {
                        z2 = true;
                        if (!z2) {
                        }
                    } else {
                        Iterator it2 = listM6476f.iterator();
                        while (it2.hasNext()) {
                            if (!((b) it2.next()).mo6286b()) {
                                z2 = false;
                                break;
                            }
                        }
                        z2 = true;
                        if (!z2) {
                            break;
                        }
                    }
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                hh3.m30441A(arrayList, ((d) it3.next()).m6476f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final boolean m6463x(List list) {
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!((d) it.next()).m6478h().mTransitioning) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: y */
    public final boolean m6464y() {
        return !this.f7615b.isEmpty();
    }

    /* renamed from: z */
    public final void m6465z() {
        Object objPrevious;
        synchronized (this.f7615b) {
            m6445C();
            List list = this.f7615b;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                d dVar = (d) objPrevious;
                d.b.a aVar = d.b.Companion;
                View view = dVar.m6478h().mView;
                sq8.m48648g(view, "operation.fragment.mView");
                d.b bVarM6488a = aVar.m6488a(view);
                d.b bVarM6477g = dVar.m6477g();
                d.b bVar = d.b.VISIBLE;
                if (bVarM6477g == bVar && bVarM6488a != bVar) {
                    break;
                }
            }
            d dVar2 = (d) objPrevious;
            Fragment fragmentM6478h = dVar2 != null ? dVar2.m6478h() : null;
            this.f7619f = fragmentM6478h != null ? fragmentM6478h.isPostponed() : false;
            y3i y3iVar = y3i.f54824a;
        }
    }
}

package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.sq8;
import p001o.y3i;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes2.dex */
public final class C2120f {

    /* renamed from: a */
    public final FragmentManager f7555a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f7556b;

    /* renamed from: androidx.fragment.app.f$a */
    public static final class a {

        /* renamed from: a */
        public final FragmentManager.AbstractC2104k f7557a;

        /* renamed from: b */
        public final boolean f7558b;

        public a(FragmentManager.AbstractC2104k abstractC2104k, boolean z) {
            sq8.m48649h(abstractC2104k, "callback");
            this.f7557a = abstractC2104k;
            this.f7558b = z;
        }

        /* renamed from: a */
        public final FragmentManager.AbstractC2104k m6351a() {
            return this.f7557a;
        }

        /* renamed from: b */
        public final boolean m6352b() {
            return this.f7558b;
        }
    }

    public C2120f(FragmentManager fragmentManager) {
        sq8.m48649h(fragmentManager, "fragmentManager");
        this.f7555a = fragmentManager;
        this.f7556b = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public final void m6335a(Fragment fragment, Bundle bundle, boolean z) {
        sq8.m48649h(fragment, "f");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6335a(fragment, bundle, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentActivityCreated(this.f7555a, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    public final void m6336b(Fragment fragment, boolean z) {
        sq8.m48649h(fragment, "f");
        Context contextM18966f = this.f7555a.C0().m18966f();
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6336b(fragment, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentAttached(this.f7555a, fragment, contextM18966f);
            }
        }
    }

    /* renamed from: c */
    public final void m6337c(Fragment fragment, Bundle bundle, boolean z) {
        sq8.m48649h(fragment, "f");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6337c(fragment, bundle, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentCreated(this.f7555a, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    public final void m6338d(Fragment fragment, boolean z) {
        sq8.m48649h(fragment, "f");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6338d(fragment, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentDestroyed(this.f7555a, fragment);
            }
        }
    }

    /* renamed from: e */
    public final void m6339e(Fragment fragment, boolean z) {
        sq8.m48649h(fragment, "f");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6339e(fragment, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentDetached(this.f7555a, fragment);
            }
        }
    }

    /* renamed from: f */
    public final void m6340f(Fragment fragment, boolean z) {
        sq8.m48649h(fragment, "f");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6340f(fragment, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentPaused(this.f7555a, fragment);
            }
        }
    }

    /* renamed from: g */
    public final void m6341g(Fragment fragment, boolean z) {
        sq8.m48649h(fragment, "f");
        Context contextM18966f = this.f7555a.C0().m18966f();
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6341g(fragment, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentPreAttached(this.f7555a, fragment, contextM18966f);
            }
        }
    }

    /* renamed from: h */
    public final void m6342h(Fragment fragment, Bundle bundle, boolean z) {
        sq8.m48649h(fragment, "f");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6342h(fragment, bundle, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentPreCreated(this.f7555a, fragment, bundle);
            }
        }
    }

    /* renamed from: i */
    public final void m6343i(Fragment fragment, boolean z) {
        sq8.m48649h(fragment, "f");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6343i(fragment, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentResumed(this.f7555a, fragment);
            }
        }
    }

    /* renamed from: j */
    public final void m6344j(Fragment fragment, Bundle bundle, boolean z) {
        sq8.m48649h(fragment, "f");
        sq8.m48649h(bundle, "outState");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6344j(fragment, bundle, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentSaveInstanceState(this.f7555a, fragment, bundle);
            }
        }
    }

    /* renamed from: k */
    public final void m6345k(Fragment fragment, boolean z) {
        sq8.m48649h(fragment, "f");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6345k(fragment, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentStarted(this.f7555a, fragment);
            }
        }
    }

    /* renamed from: l */
    public final void m6346l(Fragment fragment, boolean z) {
        sq8.m48649h(fragment, "f");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6346l(fragment, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentStopped(this.f7555a, fragment);
            }
        }
    }

    /* renamed from: m */
    public final void m6347m(Fragment fragment, View view, Bundle bundle, boolean z) {
        sq8.m48649h(fragment, "f");
        sq8.m48649h(view, "v");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6347m(fragment, view, bundle, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentViewCreated(this.f7555a, fragment, view, bundle);
            }
        }
    }

    /* renamed from: n */
    public final void m6348n(Fragment fragment, boolean z) {
        sq8.m48649h(fragment, "f");
        Fragment fragmentF0 = this.f7555a.F0();
        if (fragmentF0 != null) {
            FragmentManager parentFragmentManager = fragmentF0.getParentFragmentManager();
            sq8.m48648g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.E0().m6348n(fragment, true);
        }
        Iterator it = this.f7556b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z || aVar.m6352b()) {
                aVar.m6351a().onFragmentViewDestroyed(this.f7555a, fragment);
            }
        }
    }

    /* renamed from: o */
    public final void m6349o(FragmentManager.AbstractC2104k abstractC2104k, boolean z) {
        sq8.m48649h(abstractC2104k, "cb");
        this.f7556b.add(new a(abstractC2104k, z));
    }

    /* renamed from: p */
    public final void m6350p(FragmentManager.AbstractC2104k abstractC2104k) {
        sq8.m48649h(abstractC2104k, "cb");
        synchronized (this.f7556b) {
            int size = this.f7556b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((a) this.f7556b.get(i)).m6351a() == abstractC2104k) {
                    this.f7556b.remove(i);
                    break;
                }
                i++;
            }
            y3i y3iVar = y3i.f54824a;
        }
    }
}

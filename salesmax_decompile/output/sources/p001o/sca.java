package p001o;

import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2146o;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.za2;

/* loaded from: classes2.dex */
public final class sca {

    /* renamed from: a */
    public final Object f45213a = new Object();

    /* renamed from: b */
    public final Map f45214b = new HashMap();

    /* renamed from: c */
    public final Map f45215c = new HashMap();

    /* renamed from: d */
    public final ArrayDeque f45216d = new ArrayDeque();

    /* renamed from: e */
    public b92 f45217e;

    /* renamed from: o.sca$a */
    public static abstract class AbstractC16807a {
        /* renamed from: a */
        public static AbstractC16807a m48202a(xca xcaVar, za2.AbstractC18596b abstractC18596b) {
            return new v41(xcaVar, abstractC18596b);
        }

        /* renamed from: b */
        public abstract za2.AbstractC18596b mo48203b();

        /* renamed from: c */
        public abstract xca mo48204c();
    }

    /* renamed from: o.sca$b */
    public static class C16808b implements wca {

        /* renamed from: a */
        public final sca f45218a;

        /* renamed from: b */
        public final xca f45219b;

        public C16808b(xca xcaVar, sca scaVar) {
            this.f45219b = xcaVar;
            this.f45218a = scaVar;
        }

        /* renamed from: a */
        public xca m48205a() {
            return this.f45219b;
        }

        @InterfaceC2146o(AbstractC2139h.a.ON_DESTROY)
        public void onDestroy(xca xcaVar) {
            this.f45218a.m48200l(xcaVar);
        }

        @InterfaceC2146o(AbstractC2139h.a.ON_START)
        public void onStart(xca xcaVar) {
            this.f45218a.m48196h(xcaVar);
        }

        @InterfaceC2146o(AbstractC2139h.a.ON_STOP)
        public void onStop(xca xcaVar) {
            this.f45218a.m48197i(xcaVar);
        }
    }

    /* renamed from: a */
    public void m48189a(rca rcaVar, eyi eyiVar, List list, Collection collection, b92 b92Var) {
        synchronized (this.f45213a) {
            fgd.m26657a(!collection.isEmpty());
            this.f45217e = b92Var;
            xca xcaVarM46516m = rcaVar.m46516m();
            C16808b c16808bM48192d = m48192d(xcaVarM46516m);
            if (c16808bM48192d == null) {
                return;
            }
            Set set = (Set) this.f45215c.get(c16808bM48192d);
            b92 b92Var2 = this.f45217e;
            if (b92Var2 == null || b92Var2.mo18287c() != 2) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    rca rcaVar2 = (rca) fgd.m26663g((rca) this.f45214b.get((AbstractC16807a) it.next()));
                    if (!rcaVar2.equals(rcaVar) && !rcaVar2.m46518s().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                rcaVar.m46515e().c0(eyiVar);
                rcaVar.m46515e().a0(list);
                rcaVar.m46514b(collection);
                if (xcaVarM46516m.getLifecycle().mo6522b().isAtLeast(AbstractC2139h.b.STARTED)) {
                    m48196h(xcaVarM46516m);
                }
            } catch (za2.C18595a e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    /* renamed from: b */
    public rca m48190b(xca xcaVar, za2 za2Var) {
        synchronized (this.f45213a) {
            fgd.m26658b(this.f45214b.get(AbstractC16807a.m48202a(xcaVar, za2Var.m59058C())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            rca rcaVar = new rca(xcaVar, za2Var);
            if (za2Var.m59063I().isEmpty()) {
                rcaVar.m46520u();
            }
            if (xcaVar.getLifecycle().mo6522b() == AbstractC2139h.b.DESTROYED) {
                return rcaVar;
            }
            m48195g(rcaVar);
            return rcaVar;
        }
    }

    /* renamed from: c */
    public rca m48191c(xca xcaVar, za2.AbstractC18596b abstractC18596b) {
        rca rcaVar;
        synchronized (this.f45213a) {
            rcaVar = (rca) this.f45214b.get(AbstractC16807a.m48202a(xcaVar, abstractC18596b));
        }
        return rcaVar;
    }

    /* renamed from: d */
    public final C16808b m48192d(xca xcaVar) {
        synchronized (this.f45213a) {
            for (C16808b c16808b : this.f45215c.keySet()) {
                if (xcaVar.equals(c16808b.m48205a())) {
                    return c16808b;
                }
            }
            return null;
        }
    }

    /* renamed from: e */
    public Collection m48193e() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f45213a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f45214b.values());
        }
        return collectionUnmodifiableCollection;
    }

    /* renamed from: f */
    public final boolean m48194f(xca xcaVar) {
        synchronized (this.f45213a) {
            C16808b c16808bM48192d = m48192d(xcaVar);
            if (c16808bM48192d == null) {
                return false;
            }
            Iterator it = ((Set) this.f45215c.get(c16808bM48192d)).iterator();
            while (it.hasNext()) {
                if (!((rca) fgd.m26663g((rca) this.f45214b.get((AbstractC16807a) it.next()))).m46518s().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: g */
    public final void m48195g(rca rcaVar) {
        synchronized (this.f45213a) {
            xca xcaVarM46516m = rcaVar.m46516m();
            AbstractC16807a abstractC16807aM48202a = AbstractC16807a.m48202a(xcaVarM46516m, za2.m59038A((ore) rcaVar.mo28113a(), (ore) rcaVar.m46517r()));
            C16808b c16808bM48192d = m48192d(xcaVarM46516m);
            Set hashSet = c16808bM48192d != null ? (Set) this.f45215c.get(c16808bM48192d) : new HashSet();
            hashSet.add(abstractC16807aM48202a);
            this.f45214b.put(abstractC16807aM48202a, rcaVar);
            if (c16808bM48192d == null) {
                C16808b c16808b = new C16808b(xcaVarM46516m, this);
                this.f45215c.put(c16808b, hashSet);
                xcaVarM46516m.getLifecycle().mo6521a(c16808b);
            }
        }
    }

    /* renamed from: h */
    public void m48196h(xca xcaVar) {
        synchronized (this.f45213a) {
            if (m48194f(xcaVar)) {
                if (this.f45216d.isEmpty()) {
                    this.f45216d.push(xcaVar);
                } else {
                    b92 b92Var = this.f45217e;
                    if (b92Var == null || b92Var.mo18287c() != 2) {
                        xca xcaVar2 = (xca) this.f45216d.peek();
                        if (!xcaVar.equals(xcaVar2)) {
                            m48198j(xcaVar2);
                            this.f45216d.remove(xcaVar);
                            this.f45216d.push(xcaVar);
                        }
                    }
                }
                m48201m(xcaVar);
            }
        }
    }

    /* renamed from: i */
    public void m48197i(xca xcaVar) {
        synchronized (this.f45213a) {
            this.f45216d.remove(xcaVar);
            m48198j(xcaVar);
            if (!this.f45216d.isEmpty()) {
                m48201m((xca) this.f45216d.peek());
            }
        }
    }

    /* renamed from: j */
    public final void m48198j(xca xcaVar) {
        synchronized (this.f45213a) {
            C16808b c16808bM48192d = m48192d(xcaVar);
            if (c16808bM48192d == null) {
                return;
            }
            Iterator it = ((Set) this.f45215c.get(c16808bM48192d)).iterator();
            while (it.hasNext()) {
                ((rca) fgd.m26663g((rca) this.f45214b.get((AbstractC16807a) it.next()))).m46520u();
            }
        }
    }

    /* renamed from: k */
    public void m48199k() {
        synchronized (this.f45213a) {
            Iterator it = this.f45214b.keySet().iterator();
            while (it.hasNext()) {
                rca rcaVar = (rca) this.f45214b.get((AbstractC16807a) it.next());
                rcaVar.m46521v();
                m48197i(rcaVar.m46516m());
            }
        }
    }

    /* renamed from: l */
    public void m48200l(xca xcaVar) {
        synchronized (this.f45213a) {
            C16808b c16808bM48192d = m48192d(xcaVar);
            if (c16808bM48192d == null) {
                return;
            }
            m48197i(xcaVar);
            Iterator it = ((Set) this.f45215c.get(c16808bM48192d)).iterator();
            while (it.hasNext()) {
                this.f45214b.remove((AbstractC16807a) it.next());
            }
            this.f45215c.remove(c16808bM48192d);
            c16808bM48192d.m48205a().getLifecycle().mo6524d(c16808bM48192d);
        }
    }

    /* renamed from: m */
    public final void m48201m(xca xcaVar) {
        synchronized (this.f45213a) {
            Iterator it = ((Set) this.f45215c.get(m48192d(xcaVar))).iterator();
            while (it.hasNext()) {
                rca rcaVar = (rca) this.f45214b.get((AbstractC16807a) it.next());
                if (!((rca) fgd.m26663g(rcaVar)).m46518s().isEmpty()) {
                    rcaVar.m46522w();
                }
            }
        }
    }
}

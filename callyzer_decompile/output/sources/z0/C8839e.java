package z0;

import a0.C0001a;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import c0.d1;
import d7.EnumC1645q;
import d7.InterfaceC1649u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m0.C4612f;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z0.e */
/* loaded from: classes.dex */
public final class C8839e {

    /* renamed from: f */
    public static final Object f42547f = new Object();

    /* renamed from: g */
    public static C8839e f42548g;

    /* renamed from: a */
    public final Object f42549a = new Object();

    /* renamed from: b */
    public final HashMap f42550b = new HashMap();

    /* renamed from: c */
    public final HashMap f42551c = new HashMap();

    /* renamed from: d */
    public final ArrayDeque f42552d = new ArrayDeque();

    /* renamed from: e */
    public C0001a f42553e;

    /* renamed from: a */
    public final void m16295a(C8836b c8836b, d1 d1Var, C0001a c0001a) {
        boolean z6;
        synchronized (this.f42549a) {
            try {
                y0.m11052b(!((List) d1Var.f5069d).isEmpty());
                this.f42553e = c0001a;
                InterfaceC1649u interfaceC1649uM16290e = c8836b.m16290e();
                C8838d c8838dM16297c = m16297c(interfaceC1649uM16290e);
                if (c8838dM16297c == null) {
                    return;
                }
                Set set = (Set) this.f42551c.get(c8838dM16297c);
                C0001a c0001a2 = this.f42553e;
                if (c0001a2 == null || c0001a2.m4b() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        C8836b c8836b2 = (C8836b) this.f42550b.get((C8835a) it.next());
                        c8836b2.getClass();
                        if (!c8836b2.equals(c8836b) && !c8836b2.m16291g().isEmpty()) {
                            synchronized (c8836b2.f42540a) {
                                d1 d1Var2 = c8836b2.f42544e;
                                z6 = d1Var2 == null ? false : d1Var2.f5066a;
                            }
                            if (z6 || d1Var.f5066a) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            c8836b2.m16293s();
                        }
                    }
                }
                try {
                    c8836b.m16289d(d1Var);
                    if (interfaceC1649uM16290e.getLifecycle().mo5344b().isAtLeast(EnumC1645q.STARTED)) {
                        m16300f(interfaceC1649uM16290e);
                    }
                } catch (CameraUseCaseAdapter$CameraException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final C8836b m16296b(InterfaceC1649u interfaceC1649u, C4612f c4612f) {
        synchronized (this.f42549a) {
            try {
                y0.m11051a("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.f42550b.get(new C8835a(System.identityHashCode(interfaceC1649u), c4612f.f22837d)) == null);
                C8836b c8836b = new C8836b(interfaceC1649u, c4612f);
                if (((ArrayList) c4612f.m9497z()).isEmpty()) {
                    c8836b.m16292r();
                }
                if (interfaceC1649u.getLifecycle().mo5344b() == EnumC1645q.DESTROYED) {
                    return c8836b;
                }
                m16299e(c8836b);
                return c8836b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final C8838d m16297c(InterfaceC1649u interfaceC1649u) {
        synchronized (this.f42549a) {
            try {
                for (C8838d c8838d : this.f42551c.keySet()) {
                    if (interfaceC1649u.equals(c8838d.f42546b)) {
                        return c8838d;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final boolean m16298d(InterfaceC1649u interfaceC1649u) {
        synchronized (this.f42549a) {
            try {
                C8838d c8838dM16297c = m16297c(interfaceC1649u);
                if (c8838dM16297c == null) {
                    return false;
                }
                Iterator it = ((Set) this.f42551c.get(c8838dM16297c)).iterator();
                while (it.hasNext()) {
                    C8836b c8836b = (C8836b) this.f42550b.get((C8835a) it.next());
                    c8836b.getClass();
                    if (!c8836b.m16291g().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m16299e(C8836b c8836b) {
        synchronized (this.f42549a) {
            try {
                InterfaceC1649u interfaceC1649uM16290e = c8836b.m16290e();
                C8835a c8835a = new C8835a(System.identityHashCode(interfaceC1649uM16290e), c8836b.f42542c.f22837d);
                C8838d c8838dM16297c = m16297c(interfaceC1649uM16290e);
                Set hashSet = c8838dM16297c != null ? (Set) this.f42551c.get(c8838dM16297c) : new HashSet();
                hashSet.add(c8835a);
                this.f42550b.put(c8835a, c8836b);
                if (c8838dM16297c == null) {
                    C8838d c8838d = new C8838d(interfaceC1649uM16290e, this);
                    this.f42551c.put(c8838d, hashSet);
                    interfaceC1649uM16290e.getLifecycle().mo5343a(c8838d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public final void m16300f(InterfaceC1649u interfaceC1649u) {
        synchronized (this.f42549a) {
            try {
                if (m16298d(interfaceC1649u)) {
                    if (this.f42552d.isEmpty()) {
                        this.f42552d.push(interfaceC1649u);
                    } else {
                        C0001a c0001a = this.f42553e;
                        if (c0001a == null || c0001a.m4b() != 2) {
                            InterfaceC1649u interfaceC1649u2 = (InterfaceC1649u) this.f42552d.peek();
                            if (!interfaceC1649u.equals(interfaceC1649u2)) {
                                m16302h(interfaceC1649u2);
                                this.f42552d.remove(interfaceC1649u);
                                this.f42552d.push(interfaceC1649u);
                            }
                        }
                    }
                    m16306l(interfaceC1649u);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m16301g(InterfaceC1649u interfaceC1649u) {
        synchronized (this.f42549a) {
            try {
                this.f42552d.remove(interfaceC1649u);
                m16302h(interfaceC1649u);
                if (!this.f42552d.isEmpty()) {
                    m16306l((InterfaceC1649u) this.f42552d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public final void m16302h(InterfaceC1649u interfaceC1649u) {
        synchronized (this.f42549a) {
            try {
                C8838d c8838dM16297c = m16297c(interfaceC1649u);
                if (c8838dM16297c == null) {
                    return;
                }
                Iterator it = ((Set) this.f42551c.get(c8838dM16297c)).iterator();
                while (it.hasNext()) {
                    C8836b c8836b = (C8836b) this.f42550b.get((C8835a) it.next());
                    c8836b.getClass();
                    c8836b.m16292r();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set] */
    /* renamed from: i */
    public final void m16303i(HashSet hashSet) {
        HashSet hashSetKeySet = hashSet;
        synchronized (this.f42549a) {
            if (hashSet == null) {
                try {
                    hashSetKeySet = this.f42550b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = hashSetKeySet.iterator();
            while (it.hasNext()) {
                C8836b c8836b = (C8836b) this.f42550b.get((C8835a) it.next());
                if (c8836b != null) {
                    c8836b.m16293s();
                    m16301g(c8836b.m16290e());
                }
            }
        }
    }

    /* renamed from: j */
    public final void m16304j(C8836b c8836b) {
        synchronized (this.f42549a) {
            try {
                InterfaceC1649u interfaceC1649uM16290e = c8836b.m16290e();
                C8835a c8835a = new C8835a(System.identityHashCode(interfaceC1649uM16290e), c8836b.f42542c.f22837d);
                this.f42550b.remove(c8835a);
                HashSet hashSet = new HashSet();
                for (C8838d c8838d : this.f42551c.keySet()) {
                    if (interfaceC1649uM16290e.equals(c8838d.f42546b)) {
                        Set set = (Set) this.f42551c.get(c8838d);
                        set.remove(c8835a);
                        if (set.isEmpty()) {
                            hashSet.add(c8838d.f42546b);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m16305k((InterfaceC1649u) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public final void m16305k(InterfaceC1649u interfaceC1649u) {
        synchronized (this.f42549a) {
            try {
                C8838d c8838dM16297c = m16297c(interfaceC1649u);
                if (c8838dM16297c == null) {
                    return;
                }
                m16301g(interfaceC1649u);
                Iterator it = ((Set) this.f42551c.get(c8838dM16297c)).iterator();
                while (it.hasNext()) {
                    this.f42550b.remove((C8835a) it.next());
                }
                this.f42551c.remove(c8838dM16297c);
                c8838dM16297c.f42546b.getLifecycle().mo5346d(c8838dM16297c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public final void m16306l(InterfaceC1649u interfaceC1649u) {
        synchronized (this.f42549a) {
            try {
                Iterator it = ((Set) this.f42551c.get(m16297c(interfaceC1649u))).iterator();
                while (it.hasNext()) {
                    C8836b c8836b = (C8836b) this.f42550b.get((C8835a) it.next());
                    c8836b.getClass();
                    if (!c8836b.m16291g().isEmpty()) {
                        c8836b.m16294t();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

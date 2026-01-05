package p001o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public class wbf implements tb2, obf, xbf, x3j {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f51734f = AtomicReferenceFieldUpdater.newUpdater(wbf.class, Object.class, "state$volatile");

    /* renamed from: a */
    public final q74 f51735a;

    /* renamed from: c */
    public Object f51737c;
    private volatile /* synthetic */ Object state$volatile = ybf.f55195b;

    /* renamed from: b */
    public List f51736b = new ArrayList(2);

    /* renamed from: d */
    public int f51738d = -1;

    /* renamed from: e */
    public Object f51739e = ybf.f55198e;

    /* renamed from: o.wbf$a */
    public final class C17814a {

        /* renamed from: a */
        public final Object f51740a;

        /* renamed from: b */
        public final ql7 f51741b;

        /* renamed from: c */
        public final ql7 f51742c;

        /* renamed from: d */
        public final Object f51743d;

        /* renamed from: e */
        public final Object f51744e;

        /* renamed from: f */
        public final ql7 f51745f;

        /* renamed from: g */
        public Object f51746g;

        /* renamed from: h */
        public int f51747h = -1;

        public C17814a(Object obj, ql7 ql7Var, ql7 ql7Var2, Object obj2, Object obj3, ql7 ql7Var3) {
            this.f51740a = obj;
            this.f51741b = ql7Var;
            this.f51742c = ql7Var2;
            this.f51743d = obj2;
            this.f51744e = obj3;
            this.f51745f = ql7Var3;
        }

        /* renamed from: a */
        public final ql7 m54192a(xbf xbfVar, Object obj) {
            ql7 ql7Var = this.f51745f;
            if (ql7Var != null) {
                return (ql7) ql7Var.invoke(xbfVar, this.f51743d, obj);
            }
            return null;
        }

        /* renamed from: b */
        public final void m54193b() {
            Object obj = this.f51746g;
            wbf wbfVar = wbf.this;
            if (obj instanceof ibf) {
                ((ibf) obj).mo24827s(this.f51747h, null, wbfVar.getContext());
                return;
            }
            yu5 yu5Var = obj instanceof yu5 ? (yu5) obj : null;
            if (yu5Var != null) {
                yu5Var.dispose();
            }
        }

        /* renamed from: c */
        public final Object m54194c(Object obj, n64 n64Var) {
            Object obj2 = this.f51744e;
            if (this.f51743d == ybf.m57484h()) {
                sq8.m48647f(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((xk7) obj2).invoke(n64Var);
            }
            sq8.m48647f(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((nl7) obj2).invoke(obj, n64Var);
        }

        /* renamed from: d */
        public final Object m54195d(Object obj) {
            return this.f51742c.invoke(this.f51740a, this.f51743d, obj);
        }

        /* renamed from: e */
        public final boolean m54196e(wbf wbfVar) {
            this.f51741b.invoke(this.f51740a, wbfVar, this.f51743d);
            return wbfVar.f51739e == ybf.f55198e;
        }
    }

    /* renamed from: o.wbf$b */
    public static final class C17815b extends o64 {

        /* renamed from: a */
        public Object f51749a;

        /* renamed from: b */
        public /* synthetic */ Object f51750b;

        /* renamed from: d */
        public int f51752d;

        public C17815b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f51750b = obj;
            this.f51752d |= Integer.MIN_VALUE;
            return wbf.this.m54184o(this);
        }
    }

    public wbf(q74 q74Var) {
        this.f51735a = q74Var;
    }

    /* renamed from: n */
    public static /* synthetic */ Object m54175n(wbf wbfVar, n64 n64Var) {
        return wbfVar.m54186r() ? wbfVar.m54182l(n64Var) : wbfVar.m54184o(n64Var);
    }

    /* renamed from: t */
    public static /* synthetic */ void m54177t(wbf wbfVar, C17814a c17814a, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        wbfVar.m54187s(c17814a, z);
    }

    @Override // p001o.tb2
    /* renamed from: a */
    public void mo23886a(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f51734f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == ybf.f55196c) {
                return;
            }
        } while (!j9.m33417a(atomicReferenceFieldUpdater, this, obj, ybf.f55197d));
        List list = this.f51736b;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C17814a) it.next()).m54193b();
        }
        this.f51739e = ybf.f55198e;
        this.f51736b = null;
    }

    @Override // p001o.xbf
    /* renamed from: b */
    public void mo54178b(Object obj) {
        this.f51739e = obj;
    }

    @Override // p001o.x3j
    /* renamed from: c */
    public void mo23483c(ibf ibfVar, int i) {
        this.f51737c = ibfVar;
        this.f51738d = i;
    }

    @Override // p001o.xbf
    /* renamed from: d */
    public boolean mo54179d(Object obj, Object obj2) {
        return m54190w(obj, obj2) == 0;
    }

    @Override // p001o.obf
    /* renamed from: e */
    public void mo41924e(pbf pbfVar, nl7 nl7Var) {
        m54177t(this, new C17814a(pbfVar.mo45061d(), pbfVar.mo45058a(), pbfVar.mo45060c(), null, nl7Var, pbfVar.mo45059b()), false, 1, null);
    }

    @Override // p001o.xbf
    public q74 getContext() {
        return this.f51735a;
    }

    /* renamed from: j */
    public final void m54180j(Object obj) {
        List list = this.f51736b;
        sq8.m48646e(list);
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C17814a) it.next()).f51740a == obj) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
    }

    /* renamed from: k */
    public final void m54181k(C17814a c17814a) {
        List<C17814a> list = this.f51736b;
        if (list == null) {
            return;
        }
        for (C17814a c17814a2 : list) {
            if (c17814a2 != c17814a) {
                c17814a2.m54193b();
            }
        }
        f51734f.set(this, ybf.f55196c);
        this.f51739e = ybf.f55198e;
        this.f51736b = null;
    }

    /* renamed from: l */
    public final Object m54182l(n64 n64Var) {
        Object obj = f51734f.get(this);
        sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C17814a c17814a = (C17814a) obj;
        Object obj2 = this.f51739e;
        m54181k(c17814a);
        return c17814a.m54194c(c17814a.m54195d(obj2), n64Var);
    }

    /* renamed from: m */
    public Object m54183m(n64 n64Var) {
        return m54175n(this, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m54184o(n64 n64Var) {
        C17815b c17815b;
        wbf wbfVar;
        if (n64Var instanceof C17815b) {
            c17815b = (C17815b) n64Var;
            int i = c17815b.f51752d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17815b.f51752d = i - Integer.MIN_VALUE;
            } else {
                c17815b = new C17815b(n64Var);
            }
        }
        Object objM54182l = c17815b.f51750b;
        Object objM51918f = uq8.m51918f();
        int i2 = c17815b.f51752d;
        if (i2 == 0) {
            wre.m54934b(objM54182l);
            c17815b.f51749a = this;
            c17815b.f51752d = 1;
            if (m54191x(c17815b) == objM51918f) {
                return objM51918f;
            }
            wbfVar = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    wre.m54934b(objM54182l);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wbfVar = (wbf) c17815b.f51749a;
            wre.m54934b(objM54182l);
        }
        c17815b.f51749a = null;
        c17815b.f51752d = 2;
        objM54182l = wbfVar.m54182l(c17815b);
        return objM54182l == objM51918f ? objM51918f : objM54182l;
    }

    /* renamed from: p */
    public final C17814a m54185p(Object obj) {
        List list = this.f51736b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C17814a) next).f51740a == obj) {
                obj2 = next;
                break;
            }
        }
        C17814a c17814a = (C17814a) obj2;
        if (c17814a != null) {
            return c17814a;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* renamed from: r */
    public final boolean m54186r() {
        return f51734f.get(this) instanceof C17814a;
    }

    /* renamed from: s */
    public final void m54187s(C17814a c17814a, boolean z) {
        if (f51734f.get(this) instanceof C17814a) {
            return;
        }
        if (!z) {
            m54180j(c17814a.f51740a);
        }
        if (!c17814a.m54196e(this)) {
            f51734f.set(this, c17814a);
            return;
        }
        if (!z) {
            List list = this.f51736b;
            sq8.m48646e(list);
            list.add(c17814a);
        }
        c17814a.f51746g = this.f51737c;
        c17814a.f51747h = this.f51738d;
        this.f51737c = null;
        this.f51738d = -1;
    }

    /* renamed from: u */
    public final void m54188u(Object obj) {
        C17814a c17814aM54185p = m54185p(obj);
        sq8.m48646e(c17814aM54185p);
        c17814aM54185p.f51746g = null;
        c17814aM54185p.f51747h = -1;
        m54187s(c17814aM54185p, true);
    }

    /* renamed from: v */
    public final cyh m54189v(Object obj, Object obj2) {
        return ybf.m57477a(m54190w(obj, obj2));
    }

    /* renamed from: w */
    public final int m54190w(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f51734f.get(this);
            if (obj3 instanceof xb2) {
                C17814a c17814aM54185p = m54185p(obj);
                if (c17814aM54185p == null) {
                    continue;
                } else {
                    ql7 ql7VarM54192a = c17814aM54185p.m54192a(this, obj2);
                    if (j9.m33417a(f51734f, this, obj3, c17814aM54185p)) {
                        this.f51739e = obj2;
                        if (ybf.m57485i((xb2) obj3, ql7VarM54192a)) {
                            return 0;
                        }
                        this.f51739e = ybf.f55198e;
                        return 2;
                    }
                }
            } else {
                if (sq8.m48644c(obj3, ybf.f55196c) || (obj3 instanceof C17814a)) {
                    return 3;
                }
                if (sq8.m48644c(obj3, ybf.f55197d)) {
                    return 2;
                }
                if (sq8.m48644c(obj3, ybf.f55195b)) {
                    if (j9.m33417a(f51734f, this, obj3, bh3.m18963e(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (j9.m33417a(f51734f, this, obj3, kh3.y0((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r0 = r0.m59140v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r0 != p001o.uq8.m51918f()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        p001o.n75.m40201c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r0 != p001o.uq8.m51918f()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        return p001o.y3i.f54824a;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m54191x(n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f51734f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == ybf.f55195b) {
                if (j9.m33417a(f51734f, this, obj, zb2Var)) {
                    bc2.m18562c(zb2Var, this);
                    break;
                }
            } else if (obj instanceof List) {
                if (j9.m33417a(f51734f, this, obj, ybf.f55195b)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        m54188u(it.next());
                    }
                }
            } else {
                if (!(obj instanceof C17814a)) {
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                zb2Var.mo48684A(y3i.f54824a, ((C17814a) obj).m54192a(this, this.f51739e));
            }
        }
    }
}

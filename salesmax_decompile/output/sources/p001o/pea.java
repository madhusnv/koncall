package p001o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.yn8;

/* loaded from: classes6.dex */
public abstract class pea {

    /* renamed from: a */
    public static final pea f39958a;

    /* renamed from: b */
    public static final pea f39959b;

    /* renamed from: o.pea$b */
    public static final class C16089b extends pea {

        /* renamed from: c */
        public static final Class f39960c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C16089b() {
            super();
        }

        /* renamed from: f */
        public static List m43524f(Object obj, long j) {
            return (List) z4i.m58695G(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public static List m43525g(Object obj, long j, int i) {
            wi9 wi9Var;
            List listM43524f = m43524f(obj, j);
            if (listM43524f.isEmpty()) {
                List wi9Var2 = listM43524f instanceof yi9 ? new wi9(i) : ((listM43524f instanceof whd) && (listM43524f instanceof yn8.InterfaceC18446j)) ? ((yn8.InterfaceC18446j) listM43524f).mo17923a(i) : new ArrayList(i);
                z4i.m58710V(obj, j, wi9Var2);
                return wi9Var2;
            }
            if (f39960c.isAssignableFrom(listM43524f.getClass())) {
                ArrayList arrayList = new ArrayList(listM43524f.size() + i);
                arrayList.addAll(listM43524f);
                z4i.m58710V(obj, j, arrayList);
                wi9Var = arrayList;
            } else {
                if (!(listM43524f instanceof r4i)) {
                    if (!(listM43524f instanceof whd) || !(listM43524f instanceof yn8.InterfaceC18446j)) {
                        return listM43524f;
                    }
                    yn8.InterfaceC18446j interfaceC18446j = (yn8.InterfaceC18446j) listM43524f;
                    if (interfaceC18446j.mo28212k()) {
                        return listM43524f;
                    }
                    yn8.InterfaceC18446j interfaceC18446jMo17923a = interfaceC18446j.mo17923a(listM43524f.size() + i);
                    z4i.m58710V(obj, j, interfaceC18446jMo17923a);
                    return interfaceC18446jMo17923a;
                }
                wi9 wi9Var3 = new wi9(listM43524f.size() + i);
                wi9Var3.addAll((r4i) listM43524f);
                z4i.m58710V(obj, j, wi9Var3);
                wi9Var = wi9Var3;
            }
            return wi9Var;
        }

        @Override // p001o.pea
        /* renamed from: c */
        public void mo43521c(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) z4i.m58695G(obj, j);
            if (list instanceof yi9) {
                objUnmodifiableList = ((yi9) list).mo46222s();
            } else {
                if (f39960c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof whd) && (list instanceof yn8.InterfaceC18446j)) {
                    yn8.InterfaceC18446j interfaceC18446j = (yn8.InterfaceC18446j) list;
                    if (interfaceC18446j.mo28212k()) {
                        interfaceC18446j.mo28211f();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            z4i.m58710V(obj, j, objUnmodifiableList);
        }

        @Override // p001o.pea
        /* renamed from: d */
        public void mo43522d(Object obj, Object obj2, long j) {
            List listM43524f = m43524f(obj2, j);
            List listM43525g = m43525g(obj, j, listM43524f.size());
            int size = listM43525g.size();
            int size2 = listM43524f.size();
            if (size > 0 && size2 > 0) {
                listM43525g.addAll(listM43524f);
            }
            if (size > 0) {
                listM43524f = listM43525g;
            }
            z4i.m58710V(obj, j, listM43524f);
        }

        @Override // p001o.pea
        /* renamed from: e */
        public List mo43523e(Object obj, long j) {
            return m43525g(obj, j, 10);
        }
    }

    /* renamed from: o.pea$c */
    public static final class C16090c extends pea {
        public C16090c() {
            super();
        }

        /* renamed from: f */
        public static yn8.InterfaceC18446j m43526f(Object obj, long j) {
            return (yn8.InterfaceC18446j) z4i.m58695G(obj, j);
        }

        @Override // p001o.pea
        /* renamed from: c */
        public void mo43521c(Object obj, long j) {
            m43526f(obj, j).mo28211f();
        }

        @Override // p001o.pea
        /* renamed from: d */
        public void mo43522d(Object obj, Object obj2, long j) {
            yn8.InterfaceC18446j interfaceC18446jM43526f = m43526f(obj, j);
            yn8.InterfaceC18446j interfaceC18446jM43526f2 = m43526f(obj2, j);
            int size = interfaceC18446jM43526f.size();
            int size2 = interfaceC18446jM43526f2.size();
            if (size > 0 && size2 > 0) {
                if (!interfaceC18446jM43526f.mo28212k()) {
                    interfaceC18446jM43526f = interfaceC18446jM43526f.mo17923a(size2 + size);
                }
                interfaceC18446jM43526f.addAll(interfaceC18446jM43526f2);
            }
            if (size > 0) {
                interfaceC18446jM43526f2 = interfaceC18446jM43526f;
            }
            z4i.m58710V(obj, j, interfaceC18446jM43526f2);
        }

        @Override // p001o.pea
        /* renamed from: e */
        public List mo43523e(Object obj, long j) {
            yn8.InterfaceC18446j interfaceC18446jM43526f = m43526f(obj, j);
            if (interfaceC18446jM43526f.mo28212k()) {
                return interfaceC18446jM43526f;
            }
            int size = interfaceC18446jM43526f.size();
            yn8.InterfaceC18446j interfaceC18446jMo17923a = interfaceC18446jM43526f.mo17923a(size == 0 ? 10 : size * 2);
            z4i.m58710V(obj, j, interfaceC18446jMo17923a);
            return interfaceC18446jMo17923a;
        }
    }

    static {
        f39958a = new C16089b();
        f39959b = new C16090c();
    }

    public pea() {
    }

    /* renamed from: a */
    public static pea m43519a() {
        return f39958a;
    }

    /* renamed from: b */
    public static pea m43520b() {
        return f39959b;
    }

    /* renamed from: c */
    public abstract void mo43521c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo43522d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract List mo43523e(Object obj, long j);
}

package p001o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.xn8;

/* loaded from: classes4.dex */
public abstract class oea {

    /* renamed from: a */
    public static final oea f38227a;

    /* renamed from: b */
    public static final oea f38228b;

    /* renamed from: o.oea$b */
    public static final class C15778b extends oea {

        /* renamed from: c */
        public static final Class f38229c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C15778b() {
            super();
        }

        /* renamed from: f */
        public static List m42127f(Object obj, long j) {
            return (List) a5i.m16446A(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public static List m42128g(Object obj, long j, int i) {
            xi9 xi9Var;
            List listM42127f = m42127f(obj, j);
            if (listM42127f.isEmpty()) {
                List xi9Var2 = listM42127f instanceof zi9 ? new xi9(i) : ((listM42127f instanceof xhd) && (listM42127f instanceof xn8.InterfaceC18196d)) ? ((xn8.InterfaceC18196d) listM42127f).mo56352a(i) : new ArrayList(i);
                a5i.m16460O(obj, j, xi9Var2);
                return xi9Var2;
            }
            if (f38229c.isAssignableFrom(listM42127f.getClass())) {
                ArrayList arrayList = new ArrayList(listM42127f.size() + i);
                arrayList.addAll(listM42127f);
                a5i.m16460O(obj, j, arrayList);
                xi9Var = arrayList;
            } else {
                if (!(listM42127f instanceof s4i)) {
                    if (!(listM42127f instanceof xhd) || !(listM42127f instanceof xn8.InterfaceC18196d)) {
                        return listM42127f;
                    }
                    xn8.InterfaceC18196d interfaceC18196d = (xn8.InterfaceC18196d) listM42127f;
                    if (interfaceC18196d.mo29976k()) {
                        return listM42127f;
                    }
                    xn8.InterfaceC18196d interfaceC18196dMo56352a = interfaceC18196d.mo56352a(listM42127f.size() + i);
                    a5i.m16460O(obj, j, interfaceC18196dMo56352a);
                    return interfaceC18196dMo56352a;
                }
                xi9 xi9Var3 = new xi9(listM42127f.size() + i);
                xi9Var3.addAll((s4i) listM42127f);
                a5i.m16460O(obj, j, xi9Var3);
                xi9Var = xi9Var3;
            }
            return xi9Var;
        }

        @Override // p001o.oea
        /* renamed from: c */
        public void mo42124c(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) a5i.m16446A(obj, j);
            if (list instanceof zi9) {
                objUnmodifiableList = ((zi9) list).mo47845s();
            } else {
                if (f38229c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof xhd) && (list instanceof xn8.InterfaceC18196d)) {
                    xn8.InterfaceC18196d interfaceC18196d = (xn8.InterfaceC18196d) list;
                    if (interfaceC18196d.mo29976k()) {
                        interfaceC18196d.mo29975f();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            a5i.m16460O(obj, j, objUnmodifiableList);
        }

        @Override // p001o.oea
        /* renamed from: d */
        public void mo42125d(Object obj, Object obj2, long j) {
            List listM42127f = m42127f(obj2, j);
            List listM42128g = m42128g(obj, j, listM42127f.size());
            int size = listM42128g.size();
            int size2 = listM42127f.size();
            if (size > 0 && size2 > 0) {
                listM42128g.addAll(listM42127f);
            }
            if (size > 0) {
                listM42127f = listM42128g;
            }
            a5i.m16460O(obj, j, listM42127f);
        }

        @Override // p001o.oea
        /* renamed from: e */
        public List mo42126e(Object obj, long j) {
            return m42128g(obj, j, 10);
        }
    }

    /* renamed from: o.oea$c */
    public static final class C15779c extends oea {
        public C15779c() {
            super();
        }

        /* renamed from: f */
        public static xn8.InterfaceC18196d m42129f(Object obj, long j) {
            return (xn8.InterfaceC18196d) a5i.m16446A(obj, j);
        }

        @Override // p001o.oea
        /* renamed from: c */
        public void mo42124c(Object obj, long j) {
            m42129f(obj, j).mo29975f();
        }

        @Override // p001o.oea
        /* renamed from: d */
        public void mo42125d(Object obj, Object obj2, long j) {
            xn8.InterfaceC18196d interfaceC18196dM42129f = m42129f(obj, j);
            xn8.InterfaceC18196d interfaceC18196dM42129f2 = m42129f(obj2, j);
            int size = interfaceC18196dM42129f.size();
            int size2 = interfaceC18196dM42129f2.size();
            if (size > 0 && size2 > 0) {
                if (!interfaceC18196dM42129f.mo29976k()) {
                    interfaceC18196dM42129f = interfaceC18196dM42129f.mo56352a(size2 + size);
                }
                interfaceC18196dM42129f.addAll(interfaceC18196dM42129f2);
            }
            if (size > 0) {
                interfaceC18196dM42129f2 = interfaceC18196dM42129f;
            }
            a5i.m16460O(obj, j, interfaceC18196dM42129f2);
        }

        @Override // p001o.oea
        /* renamed from: e */
        public List mo42126e(Object obj, long j) {
            xn8.InterfaceC18196d interfaceC18196dM42129f = m42129f(obj, j);
            if (interfaceC18196dM42129f.mo29976k()) {
                return interfaceC18196dM42129f;
            }
            int size = interfaceC18196dM42129f.size();
            xn8.InterfaceC18196d interfaceC18196dMo56352a = interfaceC18196dM42129f.mo56352a(size == 0 ? 10 : size * 2);
            a5i.m16460O(obj, j, interfaceC18196dMo56352a);
            return interfaceC18196dMo56352a;
        }
    }

    static {
        f38227a = new C15778b();
        f38228b = new C15779c();
    }

    public oea() {
    }

    /* renamed from: a */
    public static oea m42122a() {
        return f38227a;
    }

    /* renamed from: b */
    public static oea m42123b() {
        return f38228b;
    }

    /* renamed from: c */
    public abstract void mo42124c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo42125d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract List mo42126e(Object obj, long j);
}

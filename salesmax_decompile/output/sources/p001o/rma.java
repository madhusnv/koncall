package p001o;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class rma implements wo0 {

    /* renamed from: a */
    public final mv7 f43802a = new mv7();

    /* renamed from: b */
    public final C16626b f43803b = new C16626b();

    /* renamed from: c */
    public final Map f43804c = new HashMap();

    /* renamed from: d */
    public final Map f43805d = new HashMap();

    /* renamed from: e */
    public final int f43806e;

    /* renamed from: f */
    public int f43807f;

    /* renamed from: o.rma$a */
    public static final class C16625a implements ced {

        /* renamed from: a */
        public final C16626b f43808a;

        /* renamed from: b */
        public int f43809b;

        /* renamed from: c */
        public Class f43810c;

        public C16625a(C16626b c16626b) {
            this.f43808a = c16626b;
        }

        @Override // p001o.ced
        /* renamed from: a */
        public void mo21086a() {
            this.f43808a.m26431c(this);
        }

        /* renamed from: b */
        public void m46978b(int i, Class cls) {
            this.f43809b = i;
            this.f43810c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C16625a)) {
                return false;
            }
            C16625a c16625a = (C16625a) obj;
            return this.f43809b == c16625a.f43809b && this.f43810c == c16625a.f43810c;
        }

        public int hashCode() {
            int i = this.f43809b * 31;
            Class cls = this.f43810c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f43809b + "array=" + this.f43810c + '}';
        }
    }

    /* renamed from: o.rma$b */
    public static final class C16626b extends fc1 {
        @Override // p001o.fc1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C16625a mo26429a() {
            return new C16625a(this);
        }

        /* renamed from: e */
        public C16625a m46980e(int i, Class cls) {
            C16625a c16625a = (C16625a) m26430b();
            c16625a.m46978b(i, cls);
            return c16625a;
        }
    }

    public rma(int i) {
        this.f43806e = i;
    }

    @Override // p001o.wo0
    /* renamed from: a */
    public synchronized void mo46962a(int i) {
        try {
            if (i >= 40) {
                mo46963b();
            } else if (i >= 20 || i == 15) {
                m46969h(this.f43806e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p001o.wo0
    /* renamed from: b */
    public synchronized void mo46963b() {
        m46969h(0);
    }

    @Override // p001o.wo0
    /* renamed from: c */
    public synchronized Object mo46964c(int i, Class cls) {
        Integer num;
        num = (Integer) m46974m(cls).ceilingKey(Integer.valueOf(i));
        return m46973l(m46977p(i, num) ? this.f43803b.m46980e(num.intValue(), cls) : this.f43803b.m46980e(i, cls), cls);
    }

    @Override // p001o.wo0
    /* renamed from: d */
    public synchronized Object mo46965d(int i, Class cls) {
        return m46973l(this.f43803b.m46980e(i, cls), cls);
    }

    @Override // p001o.wo0
    /* renamed from: e */
    public synchronized void mo46966e(Object obj) {
        Class<?> cls = obj.getClass();
        ko0 ko0VarM46971j = m46971j(cls);
        int iMo35968c = ko0VarM46971j.mo35968c(obj);
        int iMo35966a = ko0VarM46971j.mo35966a() * iMo35968c;
        if (m46976o(iMo35966a)) {
            C16625a c16625aM46980e = this.f43803b.m46980e(iMo35968c, cls);
            this.f43802a.m39720d(c16625aM46980e, obj);
            NavigableMap navigableMapM46974m = m46974m(cls);
            Integer num = (Integer) navigableMapM46974m.get(Integer.valueOf(c16625aM46980e.f43809b));
            Integer numValueOf = Integer.valueOf(c16625aM46980e.f43809b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM46974m.put(numValueOf, Integer.valueOf(iIntValue));
            this.f43807f += iMo35966a;
            m46968g();
        }
    }

    /* renamed from: f */
    public final void m46967f(int i, Class cls) {
        NavigableMap navigableMapM46974m = m46974m(cls);
        Integer num = (Integer) navigableMapM46974m.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM46974m.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM46974m.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* renamed from: g */
    public final void m46968g() {
        m46969h(this.f43806e);
    }

    /* renamed from: h */
    public final void m46969h(int i) {
        while (this.f43807f > i) {
            Object objM39721f = this.f43802a.m39721f();
            bgd.m18886d(objM39721f);
            ko0 ko0VarM46970i = m46970i(objM39721f);
            this.f43807f -= ko0VarM46970i.mo35968c(objM39721f) * ko0VarM46970i.mo35966a();
            m46967f(ko0VarM46970i.mo35968c(objM39721f), objM39721f.getClass());
            if (Log.isLoggable(ko0VarM46970i.mo35967b(), 2)) {
                ko0VarM46970i.mo35967b();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(ko0VarM46970i.mo35968c(objM39721f));
            }
        }
    }

    /* renamed from: i */
    public final ko0 m46970i(Object obj) {
        return m46971j(obj.getClass());
    }

    /* renamed from: j */
    public final ko0 m46971j(Class cls) {
        ko0 op1Var = (ko0) this.f43805d.get(cls);
        if (op1Var == null) {
            if (cls.equals(int[].class)) {
                op1Var = new rl8();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                op1Var = new op1();
            }
            this.f43805d.put(cls, op1Var);
        }
        return op1Var;
    }

    /* renamed from: k */
    public final Object m46972k(C16625a c16625a) {
        return this.f43802a.m39717a(c16625a);
    }

    /* renamed from: l */
    public final Object m46973l(C16625a c16625a, Class cls) {
        ko0 ko0VarM46971j = m46971j(cls);
        Object objM46972k = m46972k(c16625a);
        if (objM46972k != null) {
            this.f43807f -= ko0VarM46971j.mo35968c(objM46972k) * ko0VarM46971j.mo35966a();
            m46967f(ko0VarM46971j.mo35968c(objM46972k), cls);
        }
        if (objM46972k != null) {
            return objM46972k;
        }
        if (Log.isLoggable(ko0VarM46971j.mo35967b(), 2)) {
            ko0VarM46971j.mo35967b();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(c16625a.f43809b);
            sb.append(" bytes");
        }
        return ko0VarM46971j.newArray(c16625a.f43809b);
    }

    /* renamed from: m */
    public final NavigableMap m46974m(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f43804c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f43804c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: n */
    public final boolean m46975n() {
        int i = this.f43807f;
        return i == 0 || this.f43806e / i >= 2;
    }

    /* renamed from: o */
    public final boolean m46976o(int i) {
        return i <= this.f43806e / 2;
    }

    /* renamed from: p */
    public final boolean m46977p(int i, Integer num) {
        return num != null && (m46975n() || num.intValue() <= i * 8);
    }
}

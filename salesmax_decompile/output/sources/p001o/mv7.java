package p001o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class mv7 {

    /* renamed from: a */
    public final C15436a f36025a = new C15436a();

    /* renamed from: b */
    public final Map f36026b = new HashMap();

    /* renamed from: o.mv7$a */
    public static class C15436a {

        /* renamed from: a */
        public final Object f36027a;

        /* renamed from: b */
        public List f36028b;

        /* renamed from: c */
        public C15436a f36029c;

        /* renamed from: d */
        public C15436a f36030d;

        public C15436a() {
            this(null);
        }

        /* renamed from: a */
        public void m39722a(Object obj) {
            if (this.f36028b == null) {
                this.f36028b = new ArrayList();
            }
            this.f36028b.add(obj);
        }

        /* renamed from: b */
        public Object m39723b() {
            int iM39724c = m39724c();
            if (iM39724c > 0) {
                return this.f36028b.remove(iM39724c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m39724c() {
            List list = this.f36028b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C15436a(Object obj) {
            this.f36030d = this;
            this.f36029c = this;
            this.f36027a = obj;
        }
    }

    /* renamed from: e */
    public static void m39715e(C15436a c15436a) {
        C15436a c15436a2 = c15436a.f36030d;
        c15436a2.f36029c = c15436a.f36029c;
        c15436a.f36029c.f36030d = c15436a2;
    }

    /* renamed from: g */
    public static void m39716g(C15436a c15436a) {
        c15436a.f36029c.f36030d = c15436a;
        c15436a.f36030d.f36029c = c15436a;
    }

    /* renamed from: a */
    public Object m39717a(ced cedVar) {
        C15436a c15436a = (C15436a) this.f36026b.get(cedVar);
        if (c15436a == null) {
            c15436a = new C15436a(cedVar);
            this.f36026b.put(cedVar, c15436a);
        } else {
            cedVar.mo21086a();
        }
        m39718b(c15436a);
        return c15436a.m39723b();
    }

    /* renamed from: b */
    public final void m39718b(C15436a c15436a) {
        m39715e(c15436a);
        C15436a c15436a2 = this.f36025a;
        c15436a.f36030d = c15436a2;
        c15436a.f36029c = c15436a2.f36029c;
        m39716g(c15436a);
    }

    /* renamed from: c */
    public final void m39719c(C15436a c15436a) {
        m39715e(c15436a);
        C15436a c15436a2 = this.f36025a;
        c15436a.f36030d = c15436a2.f36030d;
        c15436a.f36029c = c15436a2;
        m39716g(c15436a);
    }

    /* renamed from: d */
    public void m39720d(ced cedVar, Object obj) {
        C15436a c15436a = (C15436a) this.f36026b.get(cedVar);
        if (c15436a == null) {
            c15436a = new C15436a(cedVar);
            m39719c(c15436a);
            this.f36026b.put(cedVar, c15436a);
        } else {
            cedVar.mo21086a();
        }
        c15436a.m39722a(obj);
    }

    /* renamed from: f */
    public Object m39721f() {
        for (C15436a c15436a = this.f36025a.f36030d; !c15436a.equals(this.f36025a); c15436a = c15436a.f36030d) {
            Object objM39723b = c15436a.m39723b();
            if (objM39723b != null) {
                return objM39723b;
            }
            m39715e(c15436a);
            this.f36026b.remove(c15436a.f36027a);
            ((ced) c15436a.f36027a).mo21086a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C15436a c15436a = this.f36025a.f36029c;
        boolean z = false;
        while (!c15436a.equals(this.f36025a)) {
            sb.append('{');
            sb.append(c15436a.f36027a);
            sb.append(':');
            sb.append(c15436a.m39724c());
            sb.append("}, ");
            c15436a = c15436a.f36029c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}

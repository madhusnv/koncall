package p001o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class wma {

    /* renamed from: a */
    public final Map f52341a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f52342b;

    /* renamed from: c */
    public long f52343c;

    /* renamed from: d */
    public long f52344d;

    /* renamed from: o.wma$a */
    public static final class C17931a {

        /* renamed from: a */
        public final Object f52345a;

        /* renamed from: b */
        public final int f52346b;

        public C17931a(Object obj, int i) {
            this.f52345a = obj;
            this.f52346b = i;
        }
    }

    public wma(long j) {
        this.f52342b = j;
        this.f52343c = j;
    }

    /* renamed from: b */
    public void m54706b() {
        m54712m(0L);
    }

    /* renamed from: f */
    public final void m54707f() {
        m54712m(this.f52343c);
    }

    /* renamed from: g */
    public synchronized Object m54708g(Object obj) {
        C17931a c17931a;
        c17931a = (C17931a) this.f52341a.get(obj);
        return c17931a != null ? c17931a.f52345a : null;
    }

    /* renamed from: h */
    public synchronized long m54709h() {
        return this.f52343c;
    }

    /* renamed from: i */
    public int mo19445i(Object obj) {
        return 1;
    }

    /* renamed from: j */
    public void mo19446j(Object obj, Object obj2) {
    }

    /* renamed from: k */
    public synchronized Object m54710k(Object obj, Object obj2) {
        int iMo19445i = mo19445i(obj2);
        long j = iMo19445i;
        if (j >= this.f52343c) {
            mo19446j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f52344d += j;
        }
        C17931a c17931a = (C17931a) this.f52341a.put(obj, obj2 == null ? null : new C17931a(obj2, iMo19445i));
        if (c17931a != null) {
            this.f52344d -= c17931a.f52346b;
            if (!c17931a.f52345a.equals(obj2)) {
                mo19446j(obj, c17931a.f52345a);
            }
        }
        m54707f();
        return c17931a != null ? c17931a.f52345a : null;
    }

    /* renamed from: l */
    public synchronized Object m54711l(Object obj) {
        C17931a c17931a = (C17931a) this.f52341a.remove(obj);
        if (c17931a == null) {
            return null;
        }
        this.f52344d -= c17931a.f52346b;
        return c17931a.f52345a;
    }

    /* renamed from: m */
    public synchronized void m54712m(long j) {
        while (this.f52344d > j) {
            Iterator it = this.f52341a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C17931a c17931a = (C17931a) entry.getValue();
            this.f52344d -= c17931a.f52346b;
            Object key = entry.getKey();
            it.remove();
            mo19446j(key, c17931a.f52345a);
        }
    }
}

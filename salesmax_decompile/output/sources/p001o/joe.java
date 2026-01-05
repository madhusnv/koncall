package p001o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class joe {

    /* renamed from: a */
    public final List f30855a = new ArrayList();

    /* renamed from: b */
    public final Map f30856b = new HashMap();

    /* renamed from: o.joe$a */
    public static class C14623a {

        /* renamed from: a */
        public final Class f30857a;

        /* renamed from: b */
        public final Class f30858b;

        /* renamed from: c */
        public final ioe f30859c;

        public C14623a(Class cls, Class cls2, ioe ioeVar) {
            this.f30857a = cls;
            this.f30858b = cls2;
            this.f30859c = ioeVar;
        }

        /* renamed from: a */
        public boolean m34169a(Class cls, Class cls2) {
            return this.f30857a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f30858b);
        }
    }

    /* renamed from: a */
    public synchronized void m34164a(String str, ioe ioeVar, Class cls, Class cls2) {
        m34166c(str).add(new C14623a(cls, cls2, ioeVar));
    }

    /* renamed from: b */
    public synchronized List m34165b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f30855a.iterator();
        while (it.hasNext()) {
            List<C14623a> list = (List) this.f30856b.get((String) it.next());
            if (list != null) {
                for (C14623a c14623a : list) {
                    if (c14623a.m34169a(cls, cls2)) {
                        arrayList.add(c14623a.f30859c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized List m34166c(String str) {
        List arrayList;
        if (!this.f30855a.contains(str)) {
            this.f30855a.add(str);
        }
        arrayList = (List) this.f30856b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f30856b.put(str, arrayList);
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized List m34167d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f30855a.iterator();
        while (it.hasNext()) {
            List<C14623a> list = (List) this.f30856b.get((String) it.next());
            if (list != null) {
                for (C14623a c14623a : list) {
                    if (c14623a.m34169a(cls, cls2) && !arrayList.contains(c14623a.f30858b)) {
                        arrayList.add(c14623a.f30858b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m34168e(List list) {
        ArrayList<String> arrayList = new ArrayList(this.f30855a);
        this.f30855a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f30855a.add((String) it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f30855a.add(str);
            }
        }
    }
}

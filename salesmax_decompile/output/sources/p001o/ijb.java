package p001o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001o.dhe;

/* loaded from: classes5.dex */
public class ijb {

    /* renamed from: a */
    public final eob f28742a;

    /* renamed from: b */
    public final C14305a f28743b;

    /* renamed from: o.ijb$a */
    public static class C14305a {

        /* renamed from: a */
        public final Map f28744a = new HashMap();

        /* renamed from: o.ijb$a$a */
        public static class a {

            /* renamed from: a */
            public final List f28745a;

            public a(List list) {
                this.f28745a = list;
            }
        }

        /* renamed from: a */
        public void m32212a() {
            this.f28744a.clear();
        }

        /* renamed from: b */
        public List m32213b(Class cls) {
            a aVar = (a) this.f28744a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f28745a;
        }

        /* renamed from: c */
        public void m32214c(Class cls, List list) {
            if (((a) this.f28744a.put(cls, new a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public ijb(ged gedVar) {
        this(new eob(gedVar));
    }

    /* renamed from: b */
    public static Class m32207b(Object obj) {
        return obj.getClass();
    }

    /* renamed from: a */
    public synchronized void m32208a(Class cls, Class cls2, hjb hjbVar) {
        this.f28742a.m25382b(cls, cls2, hjbVar);
        this.f28743b.m32212a();
    }

    /* renamed from: c */
    public synchronized List m32209c(Class cls) {
        return this.f28742a.m25386g(cls);
    }

    /* renamed from: d */
    public List m32210d(Object obj) {
        List listM32211e = m32211e(m32207b(obj));
        if (listM32211e.isEmpty()) {
            throw new dhe.C12918c(obj);
        }
        int size = listM32211e.size();
        List listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            gjb gjbVar = (gjb) listM32211e.get(i);
            if (gjbVar.mo18149a(obj)) {
                if (z) {
                    listEmptyList = new ArrayList(size - i);
                    z = false;
                }
                listEmptyList.add(gjbVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new dhe.C12918c(obj, listM32211e);
        }
        return listEmptyList;
    }

    /* renamed from: e */
    public final synchronized List m32211e(Class cls) {
        List listM32213b;
        listM32213b = this.f28743b.m32213b(cls);
        if (listM32213b == null) {
            listM32213b = Collections.unmodifiableList(this.f28742a.m25383c(cls));
            this.f28743b.m32214c(cls, listM32213b);
        }
        return listM32213b;
    }

    public ijb(eob eobVar) {
        this.f28743b = new C14305a();
        this.f28742a = eobVar;
    }
}

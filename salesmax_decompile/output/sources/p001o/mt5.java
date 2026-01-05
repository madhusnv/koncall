package p001o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class mt5 {

    /* renamed from: a */
    public final ged f35942a = new ied(10);

    /* renamed from: b */
    public final ktf f35943b = new ktf();

    /* renamed from: c */
    public final ArrayList f35944c = new ArrayList();

    /* renamed from: d */
    public final HashSet f35945d = new HashSet();

    /* renamed from: a */
    public void m39634a(Object obj, Object obj2) {
        if (!this.f35943b.containsKey(obj) || !this.f35943b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListM39639f = (ArrayList) this.f35943b.get(obj);
        if (arrayListM39639f == null) {
            arrayListM39639f = m39639f();
            this.f35943b.put(obj, arrayListM39639f);
        }
        arrayListM39639f.add(obj2);
    }

    /* renamed from: b */
    public void m39635b(Object obj) {
        if (this.f35943b.containsKey(obj)) {
            return;
        }
        this.f35943b.put(obj, null);
    }

    /* renamed from: c */
    public void m39636c() {
        int size = this.f35943b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f35943b.m36228o(i);
            if (arrayList != null) {
                m39644k(arrayList);
            }
        }
        this.f35943b.clear();
    }

    /* renamed from: d */
    public boolean m39637d(Object obj) {
        return this.f35943b.containsKey(obj);
    }

    /* renamed from: e */
    public final void m39638e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f35943b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m39638e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* renamed from: f */
    public final ArrayList m39639f() {
        ArrayList arrayList = (ArrayList) this.f35942a.mo28526b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    /* renamed from: g */
    public List m39640g(Object obj) {
        return (List) this.f35943b.get(obj);
    }

    /* renamed from: h */
    public List m39641h(Object obj) {
        int size = this.f35943b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f35943b.m36228o(i);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f35943b.m36227g(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList m39642i() {
        this.f35944c.clear();
        this.f35945d.clear();
        int size = this.f35943b.size();
        for (int i = 0; i < size; i++) {
            m39638e(this.f35943b.m36227g(i), this.f35944c, this.f35945d);
        }
        return this.f35944c;
    }

    /* renamed from: j */
    public boolean m39643j(Object obj) {
        int size = this.f35943b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f35943b.m36228o(i);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void m39644k(ArrayList arrayList) {
        arrayList.clear();
        this.f35942a.mo28525a(arrayList);
    }
}

package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 extends AbstractMap {

    /* renamed from: f */
    public static final /* synthetic */ int f2300f = 0;

    /* renamed from: a */
    public List f2301a;

    /* renamed from: b */
    public Map f2302b;

    /* renamed from: c */
    public boolean f2303c;

    /* renamed from: d */
    public volatile f1 f2304d;

    /* renamed from: e */
    public Map f2305e;

    /* renamed from: j */
    public static c1 m853j() {
        c1 c1Var = new c1();
        c1Var.f2301a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        c1Var.f2302b = map;
        c1Var.f2305e = map;
        return c1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m854b(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f2301a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f2301a
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.d1 r2 = (androidx.datastore.preferences.protobuf.d1) r2
            java.lang.Comparable r2 = r2.f2310a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f2301a
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.d1 r3 = (androidx.datastore.preferences.protobuf.d1) r3
            java.lang.Comparable r3 = r3.f2310a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c1.m854b(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m855d();
        if (!this.f2301a.isEmpty()) {
            this.f2301a.clear();
        }
        if (this.f2302b.isEmpty()) {
            return;
        }
        this.f2302b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m854b(comparable) >= 0 || this.f2302b.containsKey(comparable);
    }

    /* renamed from: d */
    public final void m855d() {
        if (this.f2303c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2304d == null) {
            this.f2304d = new f1(this, 0);
        }
        return this.f2304d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return super.equals(obj);
        }
        c1 c1Var = (c1) obj;
        int size = size();
        if (size == c1Var.size()) {
            int size2 = this.f2301a.size();
            if (size2 != c1Var.f2301a.size()) {
                return ((AbstractSet) entrySet()).equals(c1Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (m856f(i10).equals(c1Var.m856f(i10))) {
                }
            }
            if (size2 != size) {
                return this.f2302b.equals(c1Var.f2302b);
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Map.Entry m856f(int i10) {
        return (Map.Entry) this.f2301a.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM854b = m854b(comparable);
        return iM854b >= 0 ? ((d1) this.f2301a.get(iM854b)).f2311b : this.f2302b.get(comparable);
    }

    /* renamed from: h */
    public final Set m857h() {
        return this.f2302b.isEmpty() ? Collections.EMPTY_SET : this.f2302b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2301a.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((d1) this.f2301a.get(i10)).hashCode();
        }
        return this.f2302b.size() > 0 ? this.f2302b.hashCode() + iHashCode : iHashCode;
    }

    /* renamed from: i */
    public final SortedMap m858i() {
        m855d();
        if (this.f2302b.isEmpty() && !(this.f2302b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2302b = treeMap;
            this.f2305e = treeMap.descendingMap();
        }
        return (SortedMap) this.f2302b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m855d();
        int iM854b = m854b(comparable);
        if (iM854b >= 0) {
            return ((d1) this.f2301a.get(iM854b)).setValue(obj);
        }
        m855d();
        if (this.f2301a.isEmpty() && !(this.f2301a instanceof ArrayList)) {
            this.f2301a = new ArrayList(16);
        }
        int i10 = -(iM854b + 1);
        if (i10 >= 16) {
            return m858i().put(comparable, obj);
        }
        if (this.f2301a.size() == 16) {
            d1 d1Var = (d1) this.f2301a.remove(15);
            m858i().put(d1Var.f2310a, d1Var.f2311b);
        }
        this.f2301a.add(i10, new d1(this, comparable, obj));
        return null;
    }

    /* renamed from: n */
    public final Object m860n(int i10) {
        m855d();
        Object obj = ((d1) this.f2301a.remove(i10)).f2311b;
        if (!this.f2302b.isEmpty()) {
            Iterator it = m858i().entrySet().iterator();
            List list = this.f2301a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new d1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m855d();
        Comparable comparable = (Comparable) obj;
        int iM854b = m854b(comparable);
        if (iM854b >= 0) {
            return m860n(iM854b);
        }
        if (this.f2302b.isEmpty()) {
            return null;
        }
        return this.f2302b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2302b.size() + this.f2301a.size();
    }
}

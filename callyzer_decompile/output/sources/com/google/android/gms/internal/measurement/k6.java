package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k6 extends AbstractMap {

    /* renamed from: a */
    public Object[] f6265a;

    /* renamed from: b */
    public int f6266b;

    /* renamed from: c */
    public Map f6267c;

    /* renamed from: d */
    public boolean f6268d;

    /* renamed from: e */
    public volatile androidx.datastore.preferences.protobuf.f1 f6269e;

    /* renamed from: f */
    public Map f6270f;

    public k6() {
        Map map = Collections.EMPTY_MAP;
        this.f6267c = map;
        this.f6270f = map;
    }

    /* renamed from: b */
    public final l6 m3472b(int i10) {
        if (i10 < this.f6266b) {
            return (l6) this.f6265a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3477j();
        if (this.f6266b != 0) {
            this.f6265a = null;
            this.f6266b = 0;
        }
        if (this.f6267c.isEmpty()) {
            return;
        }
        this.f6267c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m3476i(comparable) >= 0 || this.f6267c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Set m3473d() {
        return this.f6267c.isEmpty() ? Collections.EMPTY_SET : this.f6267c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6269e == null) {
            this.f6269e = new androidx.datastore.preferences.protobuf.f1(this, 1);
        }
        return this.f6269e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return super.equals(obj);
        }
        k6 k6Var = (k6) obj;
        int size = size();
        if (size == k6Var.size()) {
            int i10 = this.f6266b;
            if (i10 != k6Var.f6266b) {
                return entrySet().equals(k6Var.entrySet());
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (m3472b(i11).equals(k6Var.m3472b(i11))) {
                }
            }
            if (i10 != size) {
                return this.f6267c.equals(k6Var.f6267c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m3477j();
        int iM3476i = m3476i(comparable);
        if (iM3476i >= 0) {
            return ((l6) this.f6265a[iM3476i]).setValue(obj);
        }
        m3477j();
        if (this.f6265a == null) {
            this.f6265a = new Object[16];
        }
        int i10 = -(iM3476i + 1);
        if (i10 >= 16) {
            return m3478l().put(comparable, obj);
        }
        if (this.f6266b == 16) {
            l6 l6Var = (l6) this.f6265a[15];
            this.f6266b = 15;
            m3478l().put(l6Var.f6284a, l6Var.f6285b);
        }
        Object[] objArr = this.f6265a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f6265a[i10] = new l6(this, comparable, obj);
        this.f6266b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM3476i = m3476i(comparable);
        return iM3476i >= 0 ? ((l6) this.f6265a[iM3476i]).f6285b : this.f6267c.get(comparable);
    }

    /* renamed from: h */
    public final Object m3475h(int i10) {
        m3477j();
        Object[] objArr = this.f6265a;
        Object obj = ((l6) objArr[i10]).f6285b;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f6266b - i10) - 1);
        this.f6266b--;
        if (!this.f6267c.isEmpty()) {
            Iterator it = m3478l().entrySet().iterator();
            Object[] objArr2 = this.f6265a;
            int i11 = this.f6266b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new l6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f6266b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f6266b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f6265a[i11].hashCode();
        }
        return this.f6267c.size() > 0 ? this.f6267c.hashCode() + iHashCode : iHashCode;
    }

    /* renamed from: i */
    public final int m3476i(Comparable comparable) {
        int i10 = this.f6266b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((l6) this.f6265a[i11]).f6284a);
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((l6) this.f6265a[i13]).f6284a);
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* renamed from: j */
    public final void m3477j() {
        if (this.f6268d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: l */
    public final SortedMap m3478l() {
        m3477j();
        if (this.f6267c.isEmpty() && !(this.f6267c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6267c = treeMap;
            this.f6270f = treeMap.descendingMap();
        }
        return (SortedMap) this.f6267c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m3477j();
        Comparable comparable = (Comparable) obj;
        int iM3476i = m3476i(comparable);
        if (iM3476i >= 0) {
            return m3475h(iM3476i);
        }
        if (this.f6267c.isEmpty()) {
            return null;
        }
        return this.f6267c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6267c.size() + this.f6266b;
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g2 extends AbstractMap {

    /* renamed from: g */
    public static final /* synthetic */ int f6536g = 0;

    /* renamed from: a */
    public Object[] f6537a;

    /* renamed from: b */
    public int f6538b;

    /* renamed from: c */
    public Map f6539c;

    /* renamed from: d */
    public boolean f6540d;

    /* renamed from: e */
    public volatile androidx.datastore.preferences.protobuf.f1 f6541e;

    /* renamed from: f */
    public Map f6542f;

    public g2() {
        Map map = Collections.EMPTY_MAP;
        this.f6539c = map;
        this.f6542f = map;
    }

    /* renamed from: b */
    public final Set m3884b() {
        return this.f6539c.isEmpty() ? Collections.EMPTY_SET : this.f6539c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3890l();
        if (this.f6538b != 0) {
            this.f6537a = null;
            this.f6538b = 0;
        }
        if (this.f6539c.isEmpty()) {
            return;
        }
        this.f6539c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m3887h(comparable) >= 0 || this.f6539c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m3890l();
        int iM3887h = m3887h(comparable);
        if (iM3887h >= 0) {
            return ((h2) this.f6537a[iM3887h]).setValue(obj);
        }
        m3890l();
        if (this.f6537a == null) {
            this.f6537a = new Object[16];
        }
        int i10 = -(iM3887h + 1);
        if (i10 >= 16) {
            return m3889j().put(comparable, obj);
        }
        if (this.f6538b == 16) {
            h2 h2Var = (h2) this.f6537a[15];
            this.f6538b = 15;
            m3889j().put(h2Var.f6551a, h2Var.f6552b);
        }
        Object[] objArr = this.f6537a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f6537a[i10] = new h2(this, comparable, obj);
        this.f6538b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6541e == null) {
            this.f6541e = new androidx.datastore.preferences.protobuf.f1(this, 2);
        }
        return this.f6541e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return super.equals(obj);
        }
        g2 g2Var = (g2) obj;
        int size = size();
        if (size == g2Var.size()) {
            int i10 = this.f6538b;
            if (i10 != g2Var.f6538b) {
                return entrySet().equals(g2Var.entrySet());
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (m3886f(i11).equals(g2Var.m3886f(i11))) {
                }
            }
            if (i10 != size) {
                return this.f6539c.equals(g2Var.f6539c);
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final h2 m3886f(int i10) {
        if (i10 < this.f6538b) {
            return (h2) this.f6537a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM3887h = m3887h(comparable);
        return iM3887h >= 0 ? ((h2) this.f6537a[iM3887h]).f6552b : this.f6539c.get(comparable);
    }

    /* renamed from: h */
    public final int m3887h(Comparable comparable) {
        int i10 = this.f6538b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((h2) this.f6537a[i11]).f6551a);
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((h2) this.f6537a[i13]).f6551a);
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

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f6538b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f6537a[i11].hashCode();
        }
        return this.f6539c.size() > 0 ? this.f6539c.hashCode() + iHashCode : iHashCode;
    }

    /* renamed from: i */
    public final Object m3888i(int i10) {
        m3890l();
        Object[] objArr = this.f6537a;
        Object obj = ((h2) objArr[i10]).f6552b;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f6538b - i10) - 1);
        this.f6538b--;
        if (!this.f6539c.isEmpty()) {
            Iterator it = m3889j().entrySet().iterator();
            Object[] objArr2 = this.f6537a;
            int i11 = this.f6538b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new h2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f6538b++;
            it.remove();
        }
        return obj;
    }

    /* renamed from: j */
    public final SortedMap m3889j() {
        m3890l();
        if (this.f6539c.isEmpty() && !(this.f6539c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6539c = treeMap;
            this.f6542f = treeMap.descendingMap();
        }
        return (SortedMap) this.f6539c;
    }

    /* renamed from: l */
    public final void m3890l() {
        if (this.f6540d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m3890l();
        Comparable comparable = (Comparable) obj;
        int iM3887h = m3887h(comparable);
        if (iM3887h >= 0) {
            return m3888i(iM3887h);
        }
        if (this.f6539c.isEmpty()) {
            return null;
        }
        return this.f6539c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6539c.size() + this.f6538b;
    }
}

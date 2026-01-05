package com.google.android.gms.internal.measurement;

import c5.C0868f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.d */
/* loaded from: classes.dex */
public final class C1288d implements Iterable, InterfaceC1298n, InterfaceC1294j {

    /* renamed from: a */
    public final TreeMap f6103a;

    /* renamed from: b */
    public final TreeMap f6104b;

    public C1288d() {
        this.f6103a = new TreeMap();
        this.f6104b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: a */
    public final Boolean mo3209a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: b */
    public final String mo3210b() {
        return m3225y(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: c */
    public final Iterator mo3211c() {
        return new C1287c(this, this.f6103a.keySet().iterator(), this.f6104b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: e */
    public final Double mo3212e() {
        TreeMap treeMap = this.f6103a;
        return treeMap.size() == 1 ? m3221u(0).mo3212e() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1288d)) {
            return false;
        }
        C1288d c1288d = (C1288d) obj;
        if (m3220t() != c1288d.m3220t()) {
            return false;
        }
        TreeMap treeMap = this.f6103a;
        if (treeMap.isEmpty()) {
            return c1288d.f6103a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!m3221u(iIntValue).equals(c1288d.m3221u(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1294j
    /* renamed from: h */
    public final InterfaceC1298n mo3213h(String str) {
        InterfaceC1298n interfaceC1298n;
        return "length".equals(str) ? new C1291g(Double.valueOf(m3220t())) : (!mo3216m(str) || (interfaceC1298n = (InterfaceC1298n) this.f6104b.get(str)) == null) ? InterfaceC1298n.f6309i : interfaceC1298n;
    }

    public final int hashCode() {
        return this.f6103a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0868f(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e5, code lost:
    
        if (og.qa.m10848c(r7, r2, (com.google.android.gms.internal.measurement.C1297m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m3220t() == r7.m3220t()) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC1298n mo3214j(java.lang.String r38, c9.C0919n r39, java.util.ArrayList r40) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1288d.mo3214j(java.lang.String, c9.n, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1294j
    /* renamed from: k */
    public final void mo3215k(String str, InterfaceC1298n interfaceC1298n) {
        TreeMap treeMap = this.f6104b;
        if (interfaceC1298n == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC1298n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1294j
    /* renamed from: m */
    public final boolean mo3216m(String str) {
        return "length".equals(str) || this.f6104b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: q */
    public final InterfaceC1298n mo3217q() {
        C1288d c1288d = new C1288d();
        for (Map.Entry entry : this.f6103a.entrySet()) {
            boolean z6 = entry.getValue() instanceof InterfaceC1294j;
            TreeMap treeMap = c1288d.f6103a;
            if (z6) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC1298n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC1298n) entry.getValue()).mo3217q());
            }
        }
        return c1288d;
    }

    /* renamed from: r */
    public final List m3218r() {
        ArrayList arrayList = new ArrayList(m3220t());
        for (int i10 = 0; i10 < m3220t(); i10++) {
            arrayList.add(m3221u(i10));
        }
        return arrayList;
    }

    /* renamed from: s */
    public final Iterator m3219s() {
        return this.f6103a.keySet().iterator();
    }

    /* renamed from: t */
    public final int m3220t() {
        TreeMap treeMap = this.f6103a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return m3225y(",");
    }

    /* renamed from: u */
    public final InterfaceC1298n m3221u(int i10) {
        InterfaceC1298n interfaceC1298n;
        if (i10 < m3220t()) {
            return (!m3223w(i10) || (interfaceC1298n = (InterfaceC1298n) this.f6103a.get(Integer.valueOf(i10))) == null) ? InterfaceC1298n.f6309i : interfaceC1298n;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    /* renamed from: v */
    public final void m3222v(int i10, InterfaceC1298n interfaceC1298n) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        TreeMap treeMap = this.f6103a;
        if (interfaceC1298n == null) {
            treeMap.remove(Integer.valueOf(i10));
        } else {
            treeMap.put(Integer.valueOf(i10), interfaceC1298n);
        }
    }

    /* renamed from: w */
    public final boolean m3223w(int i10) {
        if (i10 >= 0) {
            TreeMap treeMap = this.f6103a;
            if (i10 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: x */
    public final void m3224x(int i10) {
        TreeMap treeMap = this.f6103a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (treeMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            treeMap.put(numValueOf, InterfaceC1298n.f6309i);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            InterfaceC1298n interfaceC1298n = (InterfaceC1298n) treeMap.get(numValueOf2);
            if (interfaceC1298n != null) {
                treeMap.put(Integer.valueOf(i10 - 1), interfaceC1298n);
                treeMap.remove(numValueOf2);
            }
        }
    }

    /* renamed from: y */
    public final String m3225y(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f6103a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= m3220t()) {
                    break;
                }
                InterfaceC1298n interfaceC1298nM3221u = m3221u(i10);
                sb2.append(str2);
                if (!(interfaceC1298nM3221u instanceof C1302r) && !(interfaceC1298nM3221u instanceof C1296l)) {
                    sb2.append(interfaceC1298nM3221u.mo3210b());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public C1288d(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                m3222v(i10, (InterfaceC1298n) list.get(i10));
            }
        }
    }
}

package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.k */
/* loaded from: classes.dex */
public class C1295k implements InterfaceC1298n, InterfaceC1294j {

    /* renamed from: a */
    public final HashMap f6262a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: a */
    public final Boolean mo3209a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: b */
    public final String mo3210b() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: c */
    public final Iterator mo3211c() {
        return new C1293i(this.f6262a.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: e */
    public final Double mo3212e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1295k) {
            return this.f6262a.equals(((C1295k) obj).f6262a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1294j
    /* renamed from: h */
    public final InterfaceC1298n mo3213h(String str) {
        HashMap map = this.f6262a;
        return map.containsKey(str) ? (InterfaceC1298n) map.get(str) : InterfaceC1298n.f6309i;
    }

    public final int hashCode() {
        return this.f6262a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: j */
    public InterfaceC1298n mo3214j(String str, C0919n c0919n, ArrayList arrayList) {
        return "toString".equals(str) ? new C1301q(toString()) : InterfaceC1294j.m3343g(this, new C1301q(str), c0919n, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1294j
    /* renamed from: k */
    public final void mo3215k(String str, InterfaceC1298n interfaceC1298n) {
        HashMap map = this.f6262a;
        if (interfaceC1298n == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC1298n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1294j
    /* renamed from: m */
    public final boolean mo3216m(String str) {
        return this.f6262a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: q */
    public final InterfaceC1298n mo3217q() {
        C1295k c1295k = new C1295k();
        for (Map.Entry entry : this.f6262a.entrySet()) {
            boolean z6 = entry.getValue() instanceof InterfaceC1294j;
            HashMap map = c1295k.f6262a;
            if (z6) {
                map.put((String) entry.getKey(), (InterfaceC1298n) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((InterfaceC1298n) entry.getValue()).mo3217q());
            }
        }
        return c1295k;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap map = this.f6262a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}

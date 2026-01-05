package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.h */
/* loaded from: classes.dex */
public abstract class AbstractC1292h implements InterfaceC1298n, InterfaceC1294j {

    /* renamed from: a */
    public final String f6222a;

    /* renamed from: b */
    public final HashMap f6223b = new HashMap();

    public AbstractC1292h(String str) {
        this.f6222a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: a */
    public final Boolean mo3209a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: b */
    public final String mo3210b() {
        return this.f6222a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: c */
    public final Iterator mo3211c() {
        return new C1293i(this.f6223b.keySet().iterator());
    }

    /* renamed from: d */
    public abstract InterfaceC1298n mo3299d(C0919n c0919n, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: e */
    public final Double mo3212e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1292h)) {
            return false;
        }
        AbstractC1292h abstractC1292h = (AbstractC1292h) obj;
        String str = this.f6222a;
        if (str != null) {
            return str.equals(abstractC1292h.f6222a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1294j
    /* renamed from: h */
    public final InterfaceC1298n mo3213h(String str) {
        HashMap map = this.f6223b;
        return map.containsKey(str) ? (InterfaceC1298n) map.get(str) : InterfaceC1298n.f6309i;
    }

    public final int hashCode() {
        String str = this.f6222a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: j */
    public final InterfaceC1298n mo3214j(String str, C0919n c0919n, ArrayList arrayList) {
        return "toString".equals(str) ? new C1301q(this.f6222a) : InterfaceC1294j.m3343g(this, new C1301q(str), c0919n, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1294j
    /* renamed from: k */
    public final void mo3215k(String str, InterfaceC1298n interfaceC1298n) {
        HashMap map = this.f6223b;
        if (interfaceC1298n == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC1298n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1294j
    /* renamed from: m */
    public final boolean mo3216m(String str) {
        return this.f6223b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: q */
    public InterfaceC1298n mo3217q() {
        return this;
    }
}

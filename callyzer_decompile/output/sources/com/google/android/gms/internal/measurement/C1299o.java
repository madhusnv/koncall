package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.o */
/* loaded from: classes.dex */
public final class C1299o implements InterfaceC1298n {

    /* renamed from: a */
    public final String f6318a;

    /* renamed from: b */
    public final ArrayList f6319b;

    public C1299o(String str, ArrayList arrayList) {
        this.f6318a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f6319b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: a */
    public final Boolean mo3209a() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: b */
    public final String mo3210b() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: c */
    public final Iterator mo3211c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: e */
    public final Double mo3212e() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1299o)) {
            return false;
        }
        C1299o c1299o = (C1299o) obj;
        String str = c1299o.f6318a;
        String str2 = this.f6318a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f6319b.equals(c1299o.f6319b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6318a;
        return this.f6319b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: j */
    public final InterfaceC1298n mo3214j(String str, C0919n c0919n, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: q */
    public final InterfaceC1298n mo3217q() {
        return this;
    }
}

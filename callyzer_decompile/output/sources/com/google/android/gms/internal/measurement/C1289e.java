package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.e */
/* loaded from: classes.dex */
public final class C1289e implements InterfaceC1298n {

    /* renamed from: a */
    public final boolean f6119a;

    public C1289e(Boolean bool) {
        this.f6119a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: a */
    public final Boolean mo3209a() {
        return Boolean.valueOf(this.f6119a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: b */
    public final String mo3210b() {
        return Boolean.toString(this.f6119a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: c */
    public final Iterator mo3211c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: e */
    public final Double mo3212e() {
        return Double.valueOf(true != this.f6119a ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1289e) && this.f6119a == ((C1289e) obj).f6119a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f6119a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: j */
    public final InterfaceC1298n mo3214j(String str, C0919n c0919n, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z6 = this.f6119a;
        if (zEquals) {
            return new C1301q(Boolean.toString(z6));
        }
        throw new IllegalArgumentException(Boolean.toString(z6) + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: q */
    public final InterfaceC1298n mo3217q() {
        return new C1289e(Boolean.valueOf(this.f6119a));
    }

    public final String toString() {
        return String.valueOf(this.f6119a);
    }
}

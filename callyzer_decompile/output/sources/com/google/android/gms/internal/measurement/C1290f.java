package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.f */
/* loaded from: classes.dex */
public final class C1290f implements InterfaceC1298n {

    /* renamed from: a */
    public final InterfaceC1298n f6181a;

    /* renamed from: b */
    public final String f6182b;

    public C1290f(String str) {
        this.f6181a = InterfaceC1298n.f6309i;
        this.f6182b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: a */
    public final Boolean mo3209a() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: b */
    public final String mo3210b() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: c */
    public final Iterator mo3211c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: e */
    public final Double mo3212e() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1290f)) {
            return false;
        }
        C1290f c1290f = (C1290f) obj;
        return this.f6182b.equals(c1290f.f6182b) && this.f6181a.equals(c1290f.f6181a);
    }

    public final int hashCode() {
        return this.f6181a.hashCode() + (this.f6182b.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: j */
    public final InterfaceC1298n mo3214j(String str, C0919n c0919n, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: q */
    public final InterfaceC1298n mo3217q() {
        return new C1290f(this.f6182b, this.f6181a.mo3217q());
    }

    public C1290f(String str, InterfaceC1298n interfaceC1298n) {
        this.f6181a = interfaceC1298n;
        this.f6182b = str;
    }
}

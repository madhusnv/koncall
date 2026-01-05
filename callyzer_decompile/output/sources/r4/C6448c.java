package r4;

import d3.AbstractC1561o;
import d3.C1565s;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.c */
/* loaded from: classes.dex */
public final class C6448c implements InterfaceC6461p {

    /* renamed from: a */
    public final long f31103a;

    public C6448c(long j6) {
        this.f31103a = j6;
        if (j6 != 16) {
            return;
        }
        AbstractC4646a.m9525a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // r4.InterfaceC6461p
    /* renamed from: a */
    public final float mo12437a() {
        return C1565s.m5188d(this.f31103a);
    }

    @Override // r4.InterfaceC6461p
    /* renamed from: b */
    public final long mo12438b() {
        return this.f31103a;
    }

    @Override // r4.InterfaceC6461p
    /* renamed from: c */
    public final AbstractC1561o mo12439c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6448c) && C1565s.m5187c(this.f31103a, ((C6448c) obj).f31103a);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f31103a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C1565s.m5193i(this.f31103a)) + ')';
    }
}

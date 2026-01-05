package h1;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 implements InterfaceC2779j {

    /* renamed from: a */
    public final InterfaceC2779j f15356a;

    /* renamed from: b */
    public final long f15357b;

    public b1(InterfaceC2794y interfaceC2794y, long j6) {
        this.f15356a = interfaceC2794y;
        this.f15357b = j6;
    }

    @Override // h1.InterfaceC2779j
    /* renamed from: a */
    public final z1 mo6766a(x1 x1Var) {
        return new c1(this.f15356a.mo6766a(x1Var), this.f15357b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return b1Var.f15357b == this.f15357b && AbstractC4154l.m8918a(b1Var.f15356a, this.f15356a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f15357b) + (this.f15356a.hashCode() * 31);
    }
}

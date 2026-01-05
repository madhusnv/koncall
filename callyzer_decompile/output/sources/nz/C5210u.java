package nz;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.u */
/* loaded from: classes3.dex */
public final class C5210u {

    /* renamed from: a */
    public final InterfaceC5211v f25420a;

    /* renamed from: b */
    public final InterfaceC5211v f25421b;

    /* renamed from: c */
    public final Throwable f25422c;

    public /* synthetic */ C5210u(InterfaceC5211v interfaceC5211v, C5193d c5193d, Throwable th2, int i10) {
        this(interfaceC5211v, (i10 & 2) != 0 ? null : c5193d, (i10 & 4) != 0 ? null : th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5210u)) {
            return false;
        }
        C5210u c5210u = (C5210u) obj;
        return AbstractC4154l.m8918a(this.f25420a, c5210u.f25420a) && AbstractC4154l.m8918a(this.f25421b, c5210u.f25421b) && AbstractC4154l.m8918a(this.f25422c, c5210u.f25422c);
    }

    public final int hashCode() {
        int iHashCode = this.f25420a.hashCode() * 31;
        InterfaceC5211v interfaceC5211v = this.f25421b;
        int iHashCode2 = (iHashCode + (interfaceC5211v == null ? 0 : interfaceC5211v.hashCode())) * 31;
        Throwable th2 = this.f25422c;
        return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f25420a + ", nextPlan=" + this.f25421b + ", throwable=" + this.f25422c + ')';
    }

    public C5210u(InterfaceC5211v interfaceC5211v, InterfaceC5211v interfaceC5211v2, Throwable th2) {
        this.f25420a = interfaceC5211v;
        this.f25421b = interfaceC5211v2;
        this.f25422c = th2;
    }
}

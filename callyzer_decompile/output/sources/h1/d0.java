package h1;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 implements InterfaceC2779j {

    /* renamed from: a */
    public final InterfaceC2791v f15384a;

    /* renamed from: b */
    public final o0 f15385b;

    /* renamed from: c */
    public final long f15386c;

    public d0(InterfaceC2791v interfaceC2791v, o0 o0Var, long j6) {
        this.f15384a = interfaceC2791v;
        this.f15385b = o0Var;
        this.f15386c = j6;
    }

    @Override // h1.InterfaceC2779j
    /* renamed from: a */
    public final z1 mo6766a(x1 x1Var) {
        return new e2(this.f15384a.mo6766a(x1Var), this.f15385b, this.f15386c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (AbstractC4154l.m8918a(d0Var.f15384a, this.f15384a) && d0Var.f15385b == this.f15385b && d0Var.f15386c == this.f15386c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15386c) + ((this.f15385b.hashCode() + (this.f15384a.hashCode() * 31)) * 31);
    }
}

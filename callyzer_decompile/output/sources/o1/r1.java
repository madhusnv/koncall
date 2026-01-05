package o1;

import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r1 implements v1 {

    /* renamed from: a */
    public final v1 f25835a;

    /* renamed from: b */
    public final v1 f25836b;

    public r1(v1 v1Var, v1 v1Var2) {
        this.f25835a = v1Var;
        this.f25836b = v1Var2;
    }

    @Override // o1.v1
    /* renamed from: a */
    public final int mo6893a(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m) {
        return Math.max(this.f25835a.mo6893a(interfaceC6747c, enumC6757m), this.f25836b.mo6893a(interfaceC6747c, enumC6757m));
    }

    @Override // o1.v1
    /* renamed from: b */
    public final int mo6894b(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m) {
        return Math.max(this.f25835a.mo6894b(interfaceC6747c, enumC6757m), this.f25836b.mo6894b(interfaceC6747c, enumC6757m));
    }

    @Override // o1.v1
    /* renamed from: c */
    public final int mo6895c(InterfaceC6747c interfaceC6747c) {
        return Math.max(this.f25835a.mo6895c(interfaceC6747c), this.f25836b.mo6895c(interfaceC6747c));
    }

    @Override // o1.v1
    /* renamed from: d */
    public final int mo6896d(InterfaceC6747c interfaceC6747c) {
        return Math.max(this.f25835a.mo6896d(interfaceC6747c), this.f25836b.mo6896d(interfaceC6747c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return AbstractC4154l.m8918a(r1Var.f25835a, this.f25835a) && AbstractC4154l.m8918a(r1Var.f25836b, this.f25836b);
    }

    public final int hashCode() {
        return (this.f25836b.hashCode() * 31) + this.f25835a.hashCode();
    }

    public final String toString() {
        return "(" + this.f25835a + " ∪ " + this.f25836b + ')';
    }
}

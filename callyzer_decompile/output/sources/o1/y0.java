package o1;

import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 implements h1 {

    /* renamed from: a */
    public final v1 f25891a;

    /* renamed from: b */
    public final InterfaceC6747c f25892b;

    public y0(v1 v1Var, InterfaceC6747c interfaceC6747c) {
        this.f25891a = v1Var;
        this.f25892b = interfaceC6747c;
    }

    @Override // o1.h1
    /* renamed from: a */
    public final float mo10341a() {
        v1 v1Var = this.f25891a;
        InterfaceC6747c interfaceC6747c = this.f25892b;
        return interfaceC6747c.mo8433F(v1Var.mo6896d(interfaceC6747c));
    }

    @Override // o1.h1
    /* renamed from: b */
    public final float mo10342b(EnumC6757m enumC6757m) {
        v1 v1Var = this.f25891a;
        InterfaceC6747c interfaceC6747c = this.f25892b;
        return interfaceC6747c.mo8433F(v1Var.mo6893a(interfaceC6747c, enumC6757m));
    }

    @Override // o1.h1
    /* renamed from: c */
    public final float mo10343c(EnumC6757m enumC6757m) {
        v1 v1Var = this.f25891a;
        InterfaceC6747c interfaceC6747c = this.f25892b;
        return interfaceC6747c.mo8433F(v1Var.mo6894b(interfaceC6747c, enumC6757m));
    }

    @Override // o1.h1
    /* renamed from: d */
    public final float mo10344d() {
        v1 v1Var = this.f25891a;
        InterfaceC6747c interfaceC6747c = this.f25892b;
        return interfaceC6747c.mo8433F(v1Var.mo6895c(interfaceC6747c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return AbstractC4154l.m8918a(this.f25891a, y0Var.f25891a) && AbstractC4154l.m8918a(this.f25892b, y0Var.f25892b);
    }

    public final int hashCode() {
        return this.f25892b.hashCode() + (this.f25891a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f25891a + ", density=" + this.f25892b + ')';
    }
}

package o1;

import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements v1 {

    /* renamed from: a */
    public final v1 f25692a;

    /* renamed from: b */
    public final v1 f25693b;

    public a0(v1 v1Var, v1 v1Var2) {
        this.f25692a = v1Var;
        this.f25693b = v1Var2;
    }

    @Override // o1.v1
    /* renamed from: a */
    public final int mo6893a(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m) {
        int iMo6893a = this.f25692a.mo6893a(interfaceC6747c, enumC6757m) - this.f25693b.mo6893a(interfaceC6747c, enumC6757m);
        if (iMo6893a < 0) {
            return 0;
        }
        return iMo6893a;
    }

    @Override // o1.v1
    /* renamed from: b */
    public final int mo6894b(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m) {
        int iMo6894b = this.f25692a.mo6894b(interfaceC6747c, enumC6757m) - this.f25693b.mo6894b(interfaceC6747c, enumC6757m);
        if (iMo6894b < 0) {
            return 0;
        }
        return iMo6894b;
    }

    @Override // o1.v1
    /* renamed from: c */
    public final int mo6895c(InterfaceC6747c interfaceC6747c) {
        int iMo6895c = this.f25692a.mo6895c(interfaceC6747c) - this.f25693b.mo6895c(interfaceC6747c);
        if (iMo6895c < 0) {
            return 0;
        }
        return iMo6895c;
    }

    @Override // o1.v1
    /* renamed from: d */
    public final int mo6896d(InterfaceC6747c interfaceC6747c) {
        int iMo6896d = this.f25692a.mo6896d(interfaceC6747c) - this.f25693b.mo6896d(interfaceC6747c);
        if (iMo6896d < 0) {
            return 0;
        }
        return iMo6896d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return AbstractC4154l.m8918a(a0Var.f25692a, this.f25692a) && AbstractC4154l.m8918a(a0Var.f25693b, this.f25693b);
    }

    public final int hashCode() {
        return this.f25693b.hashCode() + (this.f25692a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f25692a + " - " + this.f25693b + ')';
    }
}

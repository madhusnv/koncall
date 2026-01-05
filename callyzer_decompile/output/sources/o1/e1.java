package o1;

import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 implements v1 {

    /* renamed from: a */
    public final v1 f25720a;

    /* renamed from: b */
    public final int f25721b;

    public e1(v1 v1Var, int i10) {
        this.f25720a = v1Var;
        this.f25721b = i10;
    }

    @Override // o1.v1
    /* renamed from: a */
    public final int mo6893a(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m) {
        if (((enumC6757m == EnumC6757m.Ltr ? 8 : 2) & this.f25721b) != 0) {
            return this.f25720a.mo6893a(interfaceC6747c, enumC6757m);
        }
        return 0;
    }

    @Override // o1.v1
    /* renamed from: b */
    public final int mo6894b(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m) {
        if (((enumC6757m == EnumC6757m.Ltr ? 4 : 1) & this.f25721b) != 0) {
            return this.f25720a.mo6894b(interfaceC6747c, enumC6757m);
        }
        return 0;
    }

    @Override // o1.v1
    /* renamed from: c */
    public final int mo6895c(InterfaceC6747c interfaceC6747c) {
        if ((this.f25721b & 16) != 0) {
            return this.f25720a.mo6895c(interfaceC6747c);
        }
        return 0;
    }

    @Override // o1.v1
    /* renamed from: d */
    public final int mo6896d(InterfaceC6747c interfaceC6747c) {
        if ((this.f25721b & 32) != 0) {
            return this.f25720a.mo6896d(interfaceC6747c);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return AbstractC4154l.m8918a(this.f25720a, e1Var.f25720a) && this.f25721b == e1Var.f25721b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25721b) + (this.f25720a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f25720a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i10 = this.f25721b;
        int i11 = AbstractC5244c.f25708c;
        if ((i10 & i11) == i11) {
            AbstractC5244c.m10333r(sb4, "Start");
        }
        int i12 = AbstractC5244c.f25710e;
        if ((i10 & i12) == i12) {
            AbstractC5244c.m10333r(sb4, "Left");
        }
        if ((i10 & 16) == 16) {
            AbstractC5244c.m10333r(sb4, "Top");
        }
        int i13 = AbstractC5244c.f25709d;
        if ((i10 & i13) == i13) {
            AbstractC5244c.m10333r(sb4, "End");
        }
        int i14 = AbstractC5244c.f25711f;
        if ((i10 & i14) == i14) {
            AbstractC5244c.m10333r(sb4, "Right");
        }
        if ((i10 & 32) == 32) {
            AbstractC5244c.m10333r(sb4, "Bottom");
        }
        String string = sb4.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        sb3.append(string);
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}

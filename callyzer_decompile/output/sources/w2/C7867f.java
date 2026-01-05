package w2;

import com.sun.mail.util.AbstractC1452a;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w2.f */
/* loaded from: classes.dex */
public final class C7867f implements InterfaceC7865d {

    /* renamed from: a */
    public final float f37658a;

    public C7867f(float f6) {
        this.f37658a = f6;
    }

    @Override // w2.InterfaceC7865d
    /* renamed from: a */
    public final int mo14847a(int i10, int i11, EnumC6757m enumC6757m) {
        return AbstractC1452a.m4554a(1, this.f37658a, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7867f) && Float.compare(this.f37658a, ((C7867f) obj).f37658a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37658a);
    }

    public final String toString() {
        return AbstractC1452a.m4562i(new StringBuilder("Horizontal(bias="), this.f37658a, ')');
    }
}

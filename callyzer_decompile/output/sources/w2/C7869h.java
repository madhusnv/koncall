package w2;

import com.sun.mail.util.AbstractC1452a;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w2.h */
/* loaded from: classes.dex */
public final class C7869h implements InterfaceC7865d {

    /* renamed from: a */
    public final float f37660a;

    public C7869h(float f6) {
        this.f37660a = f6;
    }

    @Override // w2.InterfaceC7865d
    /* renamed from: a */
    public final int mo14847a(int i10, int i11, EnumC6757m enumC6757m) {
        float f6 = (i11 - i10) / 2.0f;
        EnumC6757m enumC6757m2 = EnumC6757m.Ltr;
        float f10 = this.f37660a;
        if (enumC6757m != enumC6757m2) {
            f10 *= -1;
        }
        return AbstractC1452a.m4554a(1, f10, f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7869h) && Float.compare(this.f37660a, ((C7869h) obj).f37660a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37660a);
    }

    public final String toString() {
        return AbstractC1452a.m4562i(new StringBuilder("Horizontal(bias="), this.f37660a, ')');
    }
}

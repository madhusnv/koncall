package h2;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import pg.w9;
import s4.C6755k;
import s4.EnumC6757m;
import w2.C7867f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 implements h0 {

    /* renamed from: a */
    public final C7867f f15798a;

    public u0(C7867f c7867f) {
        this.f15798a = c7867f;
    }

    @Override // h2.h0
    /* renamed from: a */
    public final int mo6885a(C6755k c6755k, long j6, int i10, EnumC6757m enumC6757m) {
        int i11 = (int) (j6 >> 32);
        if (i10 < i11) {
            return w9.m11912c(this.f15798a.mo14847a(i10, i11, enumC6757m), 0, i11 - i10);
        }
        float f6 = (i11 - i10) / 2.0f;
        EnumC6757m enumC6757m2 = EnumC6757m.Ltr;
        float f10 = DefinitionKt.NO_Float_VALUE;
        if (enumC6757m != enumC6757m2) {
            f10 = DefinitionKt.NO_Float_VALUE * (-1);
        }
        return AbstractC1452a.m4554a(1, f10, f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && this.f15798a.equals(((u0) obj).f15798a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f15798a.f37658a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f15798a + ", margin=0)";
    }
}

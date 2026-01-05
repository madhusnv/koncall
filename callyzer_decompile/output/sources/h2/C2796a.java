package h2;

import com.sun.mail.util.AbstractC1452a;
import mm.AbstractC4801l;
import s4.C6755k;
import s4.EnumC6757m;
import w2.C7869h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.a */
/* loaded from: classes.dex */
public final class C2796a implements h0 {

    /* renamed from: a */
    public final C7869h f15676a;

    /* renamed from: b */
    public final C7869h f15677b;

    /* renamed from: c */
    public final int f15678c;

    public C2796a(C7869h c7869h, C7869h c7869h2, int i10) {
        this.f15676a = c7869h;
        this.f15677b = c7869h2;
        this.f15678c = i10;
    }

    @Override // h2.h0
    /* renamed from: a */
    public final int mo6885a(C6755k c6755k, long j6, int i10, EnumC6757m enumC6757m) {
        int iMo14847a = this.f15677b.mo14847a(0, c6755k.m12947d(), enumC6757m);
        int i11 = -this.f15676a.mo14847a(0, i10, enumC6757m);
        EnumC6757m enumC6757m2 = EnumC6757m.Ltr;
        int i12 = this.f15678c;
        if (enumC6757m != enumC6757m2) {
            i12 = -i12;
        }
        return AbstractC4801l.m9725C(c6755k.f32206a, iMo14847a, i11, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2796a)) {
            return false;
        }
        C2796a c2796a = (C2796a) obj;
        return this.f15676a.equals(c2796a.f15676a) && this.f15677b.equals(c2796a.f15677b) && this.f15678c == c2796a.f15678c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15678c) + AbstractC1452a.m4555b(this.f15677b.f37660a, Float.hashCode(this.f15676a.f37660a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Horizontal(menuAlignment=");
        sb2.append(this.f15676a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f15677b);
        sb2.append(", offset=");
        return AbstractC1452a.m4563j(sb2, this.f15678c, ')');
    }
}

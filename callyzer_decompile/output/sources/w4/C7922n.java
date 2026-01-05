package w4;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.n */
/* loaded from: classes.dex */
public final class C7922n {

    /* renamed from: a */
    public final boolean f38110a;

    /* renamed from: b */
    public final boolean f38111b;

    /* renamed from: c */
    public final EnumC7932x f38112c;

    /* renamed from: d */
    public final boolean f38113d;

    /* renamed from: e */
    public final boolean f38114e;

    public C7922n(int i10, boolean z6, boolean z10) {
        z6 = (i10 & 1) != 0 ? true : z6;
        z10 = (i10 & 2) != 0 ? true : z10;
        boolean z11 = (i10 & 4) != 0;
        EnumC7932x enumC7932x = EnumC7932x.Inherit;
        this.f38110a = z6;
        this.f38111b = z10;
        this.f38112c = enumC7932x;
        this.f38113d = z11;
        this.f38114e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7922n)) {
            return false;
        }
        C7922n c7922n = (C7922n) obj;
        return this.f38110a == c7922n.f38110a && this.f38111b == c7922n.f38111b && this.f38112c == c7922n.f38112c && this.f38113d == c7922n.f38113d && this.f38114e == c7922n.f38114e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38114e) + AbstractC1452a.m4558e((this.f38112c.hashCode() + AbstractC1452a.m4558e(Boolean.hashCode(this.f38110a) * 31, 31, this.f38111b)) * 31, 31, this.f38113d);
    }
}

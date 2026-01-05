package h2;

import com.sun.mail.util.AbstractC1452a;
import s4.C6755k;
import w2.C7870i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.b */
/* loaded from: classes.dex */
public final class C2797b implements i0 {

    /* renamed from: a */
    public final C7870i f15680a;

    /* renamed from: b */
    public final C7870i f15681b;

    /* renamed from: c */
    public final int f15682c;

    public C2797b(C7870i c7870i, C7870i c7870i2, int i10) {
        this.f15680a = c7870i;
        this.f15681b = c7870i2;
        this.f15682c = i10;
    }

    @Override // h2.i0
    /* renamed from: a */
    public final int mo6886a(C6755k c6755k, long j6, int i10) {
        int iM14849a = this.f15681b.m14849a(0, c6755k.m12945b());
        return c6755k.f32207b + iM14849a + (-this.f15680a.m14849a(0, i10)) + this.f15682c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2797b)) {
            return false;
        }
        C2797b c2797b = (C2797b) obj;
        return this.f15680a.equals(c2797b.f15680a) && this.f15681b.equals(c2797b.f15681b) && this.f15682c == c2797b.f15682c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15682c) + AbstractC1452a.m4555b(this.f15681b.f37661a, Float.hashCode(this.f15680a.f37661a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(menuAlignment=");
        sb2.append(this.f15680a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f15681b);
        sb2.append(", offset=");
        return AbstractC1452a.m4563j(sb2, this.f15682c, ')');
    }
}

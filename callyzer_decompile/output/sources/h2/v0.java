package h2;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import pg.w9;
import s4.C6755k;
import w2.C7870i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements i0 {

    /* renamed from: a */
    public final C7870i f15799a;

    /* renamed from: b */
    public final int f15800b;

    public v0(C7870i c7870i, int i10) {
        this.f15799a = c7870i;
        this.f15800b = i10;
    }

    @Override // h2.i0
    /* renamed from: a */
    public final int mo6886a(C6755k c6755k, long j6, int i10) {
        int i11 = (int) (j6 & 4294967295L);
        int i12 = this.f15800b;
        if (i10 < i11 - (i12 * 2)) {
            return w9.m11912c(this.f15799a.m14849a(i10, i11), i12, (i11 - i12) - i10);
        }
        return AbstractC1452a.m4554a(1, DefinitionKt.NO_Float_VALUE, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f15799a.equals(v0Var.f15799a) && this.f15800b == v0Var.f15800b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15800b) + (Float.hashCode(this.f15799a.f37661a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
        sb2.append(this.f15799a);
        sb2.append(", margin=");
        return AbstractC1452a.m4563j(sb2, this.f15800b, ')');
    }
}

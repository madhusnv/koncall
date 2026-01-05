package h4;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.k */
/* loaded from: classes.dex */
public final class C2834k {

    /* renamed from: a */
    public final int f15813a;

    /* renamed from: b */
    public final int f15814b;

    /* renamed from: c */
    public final boolean f15815c;

    public C2834k(int i10, int i11, boolean z6) {
        this.f15813a = i10;
        this.f15814b = i11;
        this.f15815c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2834k)) {
            return false;
        }
        C2834k c2834k = (C2834k) obj;
        return this.f15813a == c2834k.f15813a && this.f15814b == c2834k.f15814b && this.f15815c == c2834k.f15815c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15815c) + AbstractC1452a.m4556c(this.f15814b, Integer.hashCode(this.f15813a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidiRun(start=");
        sb2.append(this.f15813a);
        sb2.append(", end=");
        sb2.append(this.f15814b);
        sb2.append(", isRtl=");
        return m0.m7382o(sb2, this.f15815c, ')');
    }
}

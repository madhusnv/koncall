package td;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.i */
/* loaded from: classes.dex */
public final class C7132i {

    /* renamed from: a */
    public final int f34362a;

    /* renamed from: b */
    public final int f34363b;

    /* renamed from: c */
    public final int f34364c;

    /* renamed from: d */
    public final int f34365d;

    /* renamed from: e */
    public final int f34366e;

    public C7132i(int i10, int i11, int i12, int i13, int i14) {
        this.f34362a = i10;
        this.f34363b = i11;
        this.f34364c = i12;
        this.f34365d = i13;
        this.f34366e = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7132i)) {
            return false;
        }
        C7132i c7132i = (C7132i) obj;
        return this.f34362a == c7132i.f34362a && this.f34363b == c7132i.f34363b && this.f34364c == c7132i.f34364c && this.f34365d == c7132i.f34365d && this.f34366e == c7132i.f34366e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34366e) + AbstractC1452a.m4556c(this.f34365d, AbstractC1452a.m4556c(this.f34364c, AbstractC1452a.m4556c(this.f34363b, Integer.hashCode(this.f34362a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParsedTime(hour=");
        sb2.append(this.f34362a);
        sb2.append(", min=");
        sb2.append(this.f34363b);
        sb2.append(", sec=");
        sb2.append(this.f34364c);
        sb2.append(", ns=");
        sb2.append(this.f34365d);
        sb2.append(", offsetSec=");
        return AbstractC1452a.m4563j(sb2, this.f34366e, ')');
    }
}

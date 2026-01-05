package td;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.h */
/* loaded from: classes.dex */
public final class C7131h {

    /* renamed from: a */
    public final int f34354a;

    /* renamed from: b */
    public final int f34355b;

    /* renamed from: c */
    public final int f34356c;

    /* renamed from: d */
    public final int f34357d;

    /* renamed from: e */
    public final int f34358e;

    /* renamed from: f */
    public final int f34359f;

    /* renamed from: g */
    public final int f34360g;

    /* renamed from: h */
    public final int f34361h;

    public C7131h(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f34354a = i10;
        this.f34355b = i11;
        this.f34356c = i12;
        this.f34357d = i13;
        this.f34358e = i14;
        this.f34359f = i15;
        this.f34360g = i16;
        this.f34361h = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7131h)) {
            return false;
        }
        C7131h c7131h = (C7131h) obj;
        return this.f34354a == c7131h.f34354a && this.f34355b == c7131h.f34355b && this.f34356c == c7131h.f34356c && this.f34357d == c7131h.f34357d && this.f34358e == c7131h.f34358e && this.f34359f == c7131h.f34359f && this.f34360g == c7131h.f34360g && this.f34361h == c7131h.f34361h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34361h) + AbstractC1452a.m4556c(this.f34360g, AbstractC1452a.m4556c(this.f34359f, AbstractC1452a.m4556c(this.f34358e, AbstractC1452a.m4556c(this.f34357d, AbstractC1452a.m4556c(this.f34356c, AbstractC1452a.m4556c(this.f34355b, Integer.hashCode(this.f34354a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParsedDatetime(year=");
        sb2.append(this.f34354a);
        sb2.append(", month=");
        sb2.append(this.f34355b);
        sb2.append(", day=");
        sb2.append(this.f34356c);
        sb2.append(", hour=");
        sb2.append(this.f34357d);
        sb2.append(", min=");
        sb2.append(this.f34358e);
        sb2.append(", sec=");
        sb2.append(this.f34359f);
        sb2.append(", ns=");
        sb2.append(this.f34360g);
        sb2.append(", offsetSec=");
        return AbstractC1452a.m4563j(sb2, this.f34361h, ')');
    }
}

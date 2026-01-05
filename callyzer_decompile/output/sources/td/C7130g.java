package td;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.g */
/* loaded from: classes.dex */
public final class C7130g {

    /* renamed from: a */
    public final int f34351a;

    /* renamed from: b */
    public final int f34352b;

    /* renamed from: c */
    public final int f34353c;

    public C7130g(int i10, int i11, int i12) {
        this.f34351a = i10;
        this.f34352b = i11;
        this.f34353c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7130g)) {
            return false;
        }
        C7130g c7130g = (C7130g) obj;
        return this.f34351a == c7130g.f34351a && this.f34352b == c7130g.f34352b && this.f34353c == c7130g.f34353c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34353c) + AbstractC1452a.m4556c(this.f34352b, Integer.hashCode(this.f34351a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParsedDate(year=");
        sb2.append(this.f34351a);
        sb2.append(", month=");
        sb2.append(this.f34352b);
        sb2.append(", day=");
        return AbstractC1452a.m4563j(sb2, this.f34353c, ')');
    }
}

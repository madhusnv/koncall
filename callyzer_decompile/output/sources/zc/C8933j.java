package zc;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zc.j */
/* loaded from: classes.dex */
public final class C8933j {

    /* renamed from: a */
    public int f42899a = 0;

    /* renamed from: b */
    public int f42900b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8933j)) {
            return false;
        }
        C8933j c8933j = (C8933j) obj;
        return this.f42899a == c8933j.f42899a && this.f42900b == c8933j.f42900b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42900b) + (Integer.hashCode(this.f42899a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Span(start=");
        sb2.append(this.f42899a);
        sb2.append(", len=");
        return AbstractC1452a.m4563j(sb2, this.f42900b, ')');
    }
}

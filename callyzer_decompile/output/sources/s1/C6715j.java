package s1;

import com.sun.mail.util.AbstractC1452a;
import n1.AbstractC4941a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.j */
/* loaded from: classes.dex */
public final class C6715j {

    /* renamed from: a */
    public final int f32078a;

    /* renamed from: b */
    public final int f32079b;

    public C6715j(int i10, int i11) {
        this.f32078a = i10;
        this.f32079b = i11;
        if (!(i10 >= 0)) {
            AbstractC4941a.m9884a("negative start index");
        }
        if (i11 >= i10) {
            return;
        }
        AbstractC4941a.m9884a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6715j)) {
            return false;
        }
        C6715j c6715j = (C6715j) obj;
        return this.f32078a == c6715j.f32078a && this.f32079b == c6715j.f32079b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32079b) + (Integer.hashCode(this.f32078a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f32078a);
        sb2.append(", end=");
        return AbstractC1452a.m4563j(sb2, this.f32079b, ')');
    }
}

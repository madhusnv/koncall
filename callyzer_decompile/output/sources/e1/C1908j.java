package e1;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.j */
/* loaded from: classes.dex */
public final class C1908j {

    /* renamed from: a */
    public final long f8997a;

    /* renamed from: a */
    public static long m5567a(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1908j) {
            return this.f8997a == ((C1908j) obj).f8997a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8997a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j6 = this.f8997a;
        sb2.append((int) (j6 >> 32));
        sb2.append(", ");
        return AbstractC1452a.m4563j(sb2, (int) (j6 & 4294967295L), ')');
    }
}

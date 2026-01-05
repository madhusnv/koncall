package s4;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.j */
/* loaded from: classes.dex */
public final class C6754j {

    /* renamed from: a */
    public final long f32204a;

    /* renamed from: a */
    public static final boolean m12940a(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: b */
    public static final long m12941b(long j6, long j10) {
        return ((((int) (j6 >> 32)) - ((int) (j10 >> 32))) << 32) | ((((int) (j6 & 4294967295L)) - ((int) (j10 & 4294967295L))) & 4294967295L);
    }

    /* renamed from: c */
    public static final long m12942c(long j6, long j10) {
        return ((((int) (j6 >> 32)) + ((int) (j10 >> 32))) << 32) | ((((int) (j6 & 4294967295L)) + ((int) (j10 & 4294967295L))) & 4294967295L);
    }

    /* renamed from: d */
    public static String m12943d(long j6) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j6 >> 32));
        sb2.append(", ");
        return AbstractC1452a.m4563j(sb2, (int) (j6 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6754j) {
            return this.f32204a == ((C6754j) obj).f32204a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32204a);
    }

    public final String toString() {
        return m12943d(this.f32204a);
    }
}

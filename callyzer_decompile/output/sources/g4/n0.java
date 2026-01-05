package g4;

import com.sun.mail.util.AbstractC1452a;
import og.yf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: b */
    public static final long f13684b = yf.m11072a(0, 0);

    /* renamed from: c */
    public static final /* synthetic */ int f13685c = 0;

    /* renamed from: a */
    public final long f13686a;

    public /* synthetic */ n0(long j6) {
        this.f13686a = j6;
    }

    /* renamed from: a */
    public static final boolean m6454a(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: b */
    public static final boolean m6455b(long j6) {
        return ((int) (j6 >> 32)) == ((int) (j6 & 4294967295L));
    }

    /* renamed from: c */
    public static final int m6456c(long j6) {
        return m6457d(j6) - m6458e(j6);
    }

    /* renamed from: d */
    public static final int m6457d(long j6) {
        return Math.max((int) (j6 >> 32), (int) (j6 & 4294967295L));
    }

    /* renamed from: e */
    public static final int m6458e(long j6) {
        return Math.min((int) (j6 >> 32), (int) (j6 & 4294967295L));
    }

    /* renamed from: f */
    public static final boolean m6459f(long j6) {
        return ((int) (j6 >> 32)) > ((int) (j6 & 4294967295L));
    }

    /* renamed from: g */
    public static String m6460g(long j6) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j6 >> 32));
        sb2.append(", ");
        return AbstractC1452a.m4563j(sb2, (int) (j6 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            return this.f13686a == ((n0) obj).f13686a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13686a);
    }

    public final String toString() {
        return m6460g(this.f13686a);
    }
}

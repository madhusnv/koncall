package s4;

import og.af;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.o */
/* loaded from: classes.dex */
public final class C6759o {

    /* renamed from: b */
    public static final C6760p[] f32212b = {new C6760p(0), new C6760p(4294967296L), new C6760p(8589934592L)};

    /* renamed from: c */
    public static final long f32213c = af.m10535d(Float.NaN, 0);

    /* renamed from: a */
    public final long f32214a;

    /* renamed from: a */
    public static final boolean m12952a(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: b */
    public static final long m12953b(long j6) {
        return f32212b[(int) ((j6 & 1095216660480L) >>> 32)].f32215a;
    }

    /* renamed from: c */
    public static final float m12954c(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: d */
    public static String m12955d(long j6) {
        long jM12953b = m12953b(j6);
        if (C6760p.m12956a(jM12953b, 0L)) {
            return "Unspecified";
        }
        if (C6760p.m12956a(jM12953b, 4294967296L)) {
            return m12954c(j6) + ".sp";
        }
        if (!C6760p.m12956a(jM12953b, 8589934592L)) {
            return "Invalid";
        }
        return m12954c(j6) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6759o) {
            return this.f32214a == ((C6759o) obj).f32214a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32214a);
    }

    public final String toString() {
        return m12955d(this.f32214a);
    }
}

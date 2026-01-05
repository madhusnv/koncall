package p001o;

/* loaded from: classes6.dex */
public abstract class c5i {
    /* renamed from: a */
    public static final int m20310a(int i, int i2) {
        return sq8.m48651j(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public static final int m20311b(long j, long j2) {
        return sq8.m48652k(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* renamed from: c */
    public static final double m20312c(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    /* renamed from: d */
    public static final String m20313d(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, ph2.m43651a(i));
            sq8.m48648g(string, "toString(...)");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, ph2.m43651a(i));
        sq8.m48648g(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j4, ph2.m43651a(i));
        sq8.m48648g(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}

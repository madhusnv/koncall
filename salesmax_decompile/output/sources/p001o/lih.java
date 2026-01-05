package p001o;

/* loaded from: classes2.dex */
public abstract class lih {
    /* renamed from: a */
    public static final long m37333a(int i) {
        return m37334b(i, i);
    }

    /* renamed from: b */
    public static final long m37334b(int i, int i2) {
        return kih.m35756c(m37336d(i, i2));
    }

    /* renamed from: c */
    public static final long m37335c(long j, int i, int i2) {
        int iM18608k = bce.m18608k(kih.m35763j(j), i, i2);
        int iM18608k2 = bce.m18608k(kih.m35760g(j), i, i2);
        return (iM18608k == kih.m35763j(j) && iM18608k2 == kih.m35760g(j)) ? j : m37334b(iM18608k, iM18608k2);
    }

    /* renamed from: d */
    public static final long m37336d(int i, int i2) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        if (i2 >= 0) {
            return (i2 & 4294967295L) | (i << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }
}

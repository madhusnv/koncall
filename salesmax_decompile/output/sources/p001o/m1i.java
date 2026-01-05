package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes6.dex */
public abstract class m1i {
    /* renamed from: a */
    public static final String m38185a(short s, int i) {
        String string = Integer.toString(s & 65535, ph2.m43651a(i));
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public static final byte m38186b(String str) {
        sq8.m48649h(str, "<this>");
        wzh wzhVarM38187c = m38187c(str);
        if (wzhVarM38187c != null) {
            return wzhVarM38187c.m55515h();
        }
        d9g.m22637k(str);
        throw new qe9();
    }

    /* renamed from: c */
    public static final wzh m38187c(String str) {
        sq8.m48649h(str, "<this>");
        return m38188d(str, 10);
    }

    /* renamed from: d */
    public static final wzh m38188d(String str, int i) {
        sq8.m48649h(str, "<this>");
        j0i j0iVarM38191g = m38191g(str, i);
        if (j0iVarM38191g == null) {
            return null;
        }
        int iM33022h = j0iVarM38191g.m33022h();
        if (Integer.compare(iM33022h ^ Integer.MIN_VALUE, j0i.m33018c(Constants.MAX_HOST_LENGTH) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return wzh.m55510a(wzh.m55511c((byte) iM33022h));
    }

    /* renamed from: e */
    public static final int m38189e(String str) {
        sq8.m48649h(str, "<this>");
        j0i j0iVarM38190f = m38190f(str);
        if (j0iVarM38190f != null) {
            return j0iVarM38190f.m33022h();
        }
        d9g.m22637k(str);
        throw new qe9();
    }

    /* renamed from: f */
    public static final j0i m38190f(String str) {
        sq8.m48649h(str, "<this>");
        return m38191g(str, 10);
    }

    /* renamed from: g */
    public static final j0i m38191g(String str, int i) {
        int i2;
        sq8.m48649h(str, "<this>");
        ph2.m43651a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (sq8.m48651j(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int iM33018c = j0i.m33018c(i);
        int iM36449a = 119304647;
        while (i2 < length) {
            int iM43652b = ph2.m43652b(str.charAt(i2), i);
            if (iM43652b < 0) {
                return null;
            }
            if (Integer.compare(i3 ^ Integer.MIN_VALUE, iM36449a ^ Integer.MIN_VALUE) > 0) {
                if (iM36449a == 119304647) {
                    iM36449a = l1i.m36449a(-1, iM33018c);
                    if (Integer.compare(i3 ^ Integer.MIN_VALUE, iM36449a ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iM33018c2 = j0i.m33018c(i3 * iM33018c);
            int iM33018c3 = j0i.m33018c(j0i.m33018c(iM43652b) + iM33018c2);
            if (Integer.compare(iM33018c3 ^ Integer.MIN_VALUE, iM33018c2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i3 = iM33018c3;
        }
        return j0i.m33017a(i3);
    }

    /* renamed from: h */
    public static final long m38192h(String str) {
        sq8.m48649h(str, "<this>");
        p0i p0iVarM38193i = m38193i(str);
        if (p0iVarM38193i != null) {
            return p0iVarM38193i.m42846j();
        }
        d9g.m22637k(str);
        throw new qe9();
    }

    /* renamed from: i */
    public static final p0i m38193i(String str) {
        sq8.m48649h(str, "<this>");
        return m38194j(str, 10);
    }

    /* renamed from: j */
    public static final p0i m38194j(String str, int i) {
        sq8.m48649h(str, "<this>");
        ph2.m43651a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (sq8.m48651j(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jM42841c = p0i.m42841c(i);
        long j = 0;
        long jM34920a = 512409557603043100L;
        while (i2 < length) {
            if (ph2.m43652b(str.charAt(i2), i) < 0) {
                return null;
            }
            if (Long.compare(j ^ Long.MIN_VALUE, jM34920a ^ Long.MIN_VALUE) > 0) {
                if (jM34920a == 512409557603043100L) {
                    jM34920a = k1i.m34920a(-1L, jM42841c);
                    if (Long.compare(j ^ Long.MIN_VALUE, jM34920a ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jM42841c2 = p0i.m42841c(j * jM42841c);
            long jM42841c3 = p0i.m42841c(p0i.m42841c(j0i.m33018c(r13) & 4294967295L) + jM42841c2);
            if (Long.compare(jM42841c3 ^ Long.MIN_VALUE, jM42841c2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = jM42841c3;
        }
        return p0i.m42840a(j);
    }

    /* renamed from: k */
    public static final short m38195k(String str) {
        sq8.m48649h(str, "<this>");
        d1i d1iVarM38197m = m38197m(str);
        if (d1iVarM38197m != null) {
            return d1iVarM38197m.m22250h();
        }
        d9g.m22637k(str);
        throw new qe9();
    }

    /* renamed from: l */
    public static final short m38196l(String str, int i) {
        sq8.m48649h(str, "<this>");
        d1i d1iVarM38198n = m38198n(str, i);
        if (d1iVarM38198n != null) {
            return d1iVarM38198n.m22250h();
        }
        d9g.m22637k(str);
        throw new qe9();
    }

    /* renamed from: m */
    public static final d1i m38197m(String str) {
        sq8.m48649h(str, "<this>");
        return m38198n(str, 10);
    }

    /* renamed from: n */
    public static final d1i m38198n(String str, int i) {
        sq8.m48649h(str, "<this>");
        j0i j0iVarM38191g = m38191g(str, i);
        if (j0iVarM38191g == null) {
            return null;
        }
        int iM33022h = j0iVarM38191g.m33022h();
        if (Integer.compare(iM33022h ^ Integer.MIN_VALUE, j0i.m33018c(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return d1i.m22245a(d1i.m22246c((short) iM33022h));
    }
}

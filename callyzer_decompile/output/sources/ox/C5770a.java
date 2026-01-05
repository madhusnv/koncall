package ox;

import com.sun.mail.imap.IMAPStore;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import og.bb;
import og.cb;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ox.a */
/* loaded from: classes3.dex */
public final class C5770a implements Comparable {

    /* renamed from: b */
    public static final long f28333b;

    /* renamed from: c */
    public static final long f28334c;

    /* renamed from: d */
    public static final /* synthetic */ int f28335d = 0;

    /* renamed from: a */
    public final long f28336a;

    static {
        int i10 = AbstractC5771b.f28337a;
        f28333b = bb.m10546b(4611686018427387903L);
        f28334c = bb.m10546b(-4611686018427387903L);
    }

    /* renamed from: a */
    public static final long m11290a(long j6, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j6 + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return bb.m10546b(w9.m11913d(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return bb.m10548d((j13 * j11) + (j10 - (j12 * j11)));
    }

    /* renamed from: b */
    public static final void m11291b(StringBuilder sb2, int i10, int i11, int i12, String str, boolean z6) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strM10105P = AbstractC5178p.m10105P(i12, String.valueOf(i11));
            int i13 = -1;
            int length = strM10105P.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strM10105P.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z6 || i15 >= 3) {
                sb2.append((CharSequence) strM10105P, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strM10105P, 0, i15);
            }
        }
        sb2.append(str);
    }

    /* renamed from: c */
    public static int m11292c(long j6, long j10) {
        long j11 = j6 ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i10 = (((int) j6) & 1) - (((int) j10) & 1);
            return m11298i(j6) ? -i10 : i10;
        }
        if (j6 < j10) {
            return -1;
        }
        return j6 == j10 ? 0 : 1;
    }

    /* renamed from: d */
    public static final long m11293d(long j6) {
        return ((((int) j6) & 1) != 1 || m11297h(j6)) ? m11302m(j6, EnumC5772c.MILLISECONDS) : j6 >> 1;
    }

    /* renamed from: e */
    public static final long m11294e(long j6) {
        long j10 = j6 >> 1;
        if ((((int) j6) & 1) == 0) {
            return j10;
        }
        if (j10 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j10 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j10 * 1000000;
    }

    /* renamed from: f */
    public static final int m11295f(long j6) {
        if (m11297h(j6)) {
            return 0;
        }
        return (int) ((((int) j6) & 1) == 1 ? ((j6 >> 1) % IMAPStore.RESPONSE) * 1000000 : (j6 >> 1) % 1000000000);
    }

    /* renamed from: g */
    public static final EnumC5772c m11296g(long j6) {
        return (((int) j6) & 1) == 0 ? EnumC5772c.NANOSECONDS : EnumC5772c.MILLISECONDS;
    }

    /* renamed from: h */
    public static final boolean m11297h(long j6) {
        return j6 == f28333b || j6 == f28334c;
    }

    /* renamed from: i */
    public static final boolean m11298i(long j6) {
        return j6 < 0;
    }

    /* renamed from: j */
    public static final long m11299j(long j6, long j10) {
        if (m11297h(j6)) {
            if (!m11297h(j10) || (j10 ^ j6) >= 0) {
                return j6;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m11297h(j10)) {
            return j10;
        }
        int i10 = ((int) j6) & 1;
        if (i10 != (((int) j10) & 1)) {
            return i10 == 1 ? m11290a(j6 >> 1, j10 >> 1) : m11290a(j10 >> 1, j6 >> 1);
        }
        long j11 = (j6 >> 1) + (j10 >> 1);
        return i10 == 0 ? (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? bb.m10546b(j11 / 1000000) : bb.m10548d(j11) : bb.m10547c(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        return ox.C5770a.f28333b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ca, code lost:
    
        return ox.C5770a.f28334c;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m11300k(int r20, long r21) {
        /*
            r0 = r20
            r1 = r21
            boolean r3 = m11297h(r1)
            if (r3 == 0) goto L1c
            if (r0 == 0) goto L14
            if (r0 <= 0) goto Lf
            return r1
        Lf:
            long r0 = m11304o(r1)
            return r0
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Multiplying infinite duration by zero yields an undefined result."
            r0.<init>(r1)
            throw r0
        L1c:
            r3 = 0
            if (r0 != 0) goto L21
            return r3
        L21:
            r5 = 1
            long r6 = r1 >> r5
            long r8 = (long) r0
            long r10 = r6 * r8
            int r1 = (int) r1
            r1 = r1 & r5
            r12 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r14 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r1 != 0) goto La6
            r1 = -2147483647(0xffffffff80000001, double:NaN)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L4a
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L4a
            long r0 = og.bb.m10548d(r10)
            return r0
        L4a:
            long r1 = r10 / r8
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r2 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 != 0) goto L71
            r0 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 > 0) goto L6a
            r0 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6a
            long r0 = og.bb.m10548d(r10)
            return r0
        L6a:
            long r0 = (long) r2
            long r10 = r10 / r0
            long r0 = og.bb.m10546b(r10)
            return r0
        L71:
            long r1 = (long) r2
            long r10 = r6 / r1
            long r16 = r10 * r1
            long r16 = r6 - r16
            long r18 = r10 * r8
            long r16 = r16 * r8
            long r16 = r16 / r1
            long r1 = r16 + r18
            long r8 = r18 / r8
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto L9a
            long r8 = r1 ^ r18
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L9a
            kx.j r0 = new kx.j
            r0.<init>(r14, r12)
            long r0 = pg.w9.m11914e(r1, r0)
            long r0 = og.bb.m10546b(r0)
            return r0
        L9a:
            int r1 = java.lang.Long.signum(r6)
            int r0 = java.lang.Integer.signum(r0)
            int r0 = r0 * r1
            if (r0 <= 0) goto Lc8
            goto Lc5
        La6:
            long r1 = r10 / r8
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto Lba
            kx.j r0 = new kx.j
            r0.<init>(r14, r12)
            long r0 = pg.w9.m11914e(r10, r0)
            long r0 = og.bb.m10546b(r0)
            return r0
        Lba:
            int r1 = java.lang.Long.signum(r6)
            int r0 = java.lang.Integer.signum(r0)
            int r0 = r0 * r1
            if (r0 <= 0) goto Lc8
        Lc5:
            long r0 = ox.C5770a.f28333b
            return r0
        Lc8:
            long r0 = ox.C5770a.f28334c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ox.C5770a.m11300k(int, long):long");
    }

    /* renamed from: l */
    public static final double m11301l(long j6, EnumC5772c unit) {
        AbstractC4154l.m8923f(unit, "unit");
        if (j6 == f28333b) {
            return Double.POSITIVE_INFINITY;
        }
        if (j6 == f28334c) {
            return Double.NEGATIVE_INFINITY;
        }
        return cb.m10573a(j6 >> 1, m11296g(j6), unit);
    }

    /* renamed from: m */
    public static final long m11302m(long j6, EnumC5772c unit) {
        AbstractC4154l.m8923f(unit, "unit");
        if (j6 == f28333b) {
            return Long.MAX_VALUE;
        }
        if (j6 == f28334c) {
            return Long.MIN_VALUE;
        }
        return cb.m10574b(j6 >> 1, m11296g(j6), unit);
    }

    /* renamed from: n */
    public static String m11303n(long j6) {
        if (j6 == 0) {
            return "0s";
        }
        if (j6 == f28333b) {
            return "Infinity";
        }
        if (j6 == f28334c) {
            return "-Infinity";
        }
        boolean zM11298i = m11298i(j6);
        StringBuilder sb2 = new StringBuilder();
        if (zM11298i) {
            sb2.append('-');
        }
        if (m11298i(j6)) {
            j6 = m11304o(j6);
        }
        long jM11302m = m11302m(j6, EnumC5772c.DAYS);
        int i10 = 0;
        int iM11302m = m11297h(j6) ? 0 : (int) (m11302m(j6, EnumC5772c.HOURS) % 24);
        int iM11302m2 = m11297h(j6) ? 0 : (int) (m11302m(j6, EnumC5772c.MINUTES) % 60);
        int iM11302m3 = m11297h(j6) ? 0 : (int) (m11302m(j6, EnumC5772c.SECONDS) % 60);
        int iM11295f = m11295f(j6);
        boolean z6 = jM11302m != 0;
        boolean z10 = iM11302m != 0;
        boolean z11 = iM11302m2 != 0;
        boolean z12 = (iM11302m3 == 0 && iM11295f == 0) ? false : true;
        if (z6) {
            sb2.append(jM11302m);
            sb2.append('d');
            i10 = 1;
        }
        if (z10 || (z6 && (z11 || z12))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM11302m);
            sb2.append('h');
            i10 = i11;
        }
        if (z11 || (z12 && (z10 || z6))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM11302m2);
            sb2.append('m');
            i10 = i12;
        }
        if (z12) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iM11302m3 != 0 || z6 || z10 || z11) {
                m11291b(sb2, iM11302m3, iM11295f, 9, "s", false);
            } else if (iM11295f >= 1000000) {
                m11291b(sb2, iM11295f / 1000000, iM11295f % 1000000, 6, "ms", false);
            } else if (iM11295f >= 1000) {
                m11291b(sb2, iM11295f / IMAPStore.RESPONSE, iM11295f % IMAPStore.RESPONSE, 3, "us", false);
            } else {
                sb2.append(iM11295f);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zM11298i && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    /* renamed from: o */
    public static final long m11304o(long j6) {
        long j10 = ((-(j6 >> 1)) << 1) + (((int) j6) & 1);
        int i10 = AbstractC5771b.f28337a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m11292c(this.f28336a, ((C5770a) obj).f28336a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5770a) {
            return this.f28336a == ((C5770a) obj).f28336a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28336a);
    }

    public final String toString() {
        return m11303n(this.f28336a);
    }
}

package p001o;

import android.net.Uri;
import java.util.Arrays;
import p001o.s2b;

/* loaded from: classes2.dex */
public final class rv {

    /* renamed from: g */
    public static final rv f44094g = new rv(null, new C16672a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h */
    public static final C16672a f44095h = new C16672a(0).m47181i(0);

    /* renamed from: i */
    public static final String f44096i = sqi.B0(1);

    /* renamed from: j */
    public static final String f44097j = sqi.B0(2);

    /* renamed from: k */
    public static final String f44098k = sqi.B0(3);

    /* renamed from: l */
    public static final String f44099l = sqi.B0(4);

    /* renamed from: a */
    public final Object f44100a;

    /* renamed from: b */
    public final int f44101b;

    /* renamed from: c */
    public final long f44102c;

    /* renamed from: d */
    public final long f44103d;

    /* renamed from: e */
    public final int f44104e;

    /* renamed from: f */
    public final C16672a[] f44105f;

    /* renamed from: o.rv$a */
    public static final class C16672a {

        /* renamed from: j */
        public static final String f44106j = sqi.B0(0);

        /* renamed from: k */
        public static final String f44107k = sqi.B0(1);

        /* renamed from: l */
        public static final String f44108l = sqi.B0(2);

        /* renamed from: m */
        public static final String f44109m = sqi.B0(3);

        /* renamed from: n */
        public static final String f44110n = sqi.B0(4);

        /* renamed from: o */
        public static final String f44111o = sqi.B0(5);

        /* renamed from: p */
        public static final String f44112p = sqi.B0(6);

        /* renamed from: q */
        public static final String f44113q = sqi.B0(7);

        /* renamed from: r */
        public static final String f44114r = sqi.B0(8);

        /* renamed from: a */
        public final long f44115a;

        /* renamed from: b */
        public final int f44116b;

        /* renamed from: c */
        public final int f44117c;

        /* renamed from: d */
        public final Uri[] f44118d;

        /* renamed from: e */
        public final s2b[] f44119e;

        /* renamed from: f */
        public final int[] f44120f;

        /* renamed from: g */
        public final long[] f44121g;

        /* renamed from: h */
        public final long f44122h;

        /* renamed from: i */
        public final boolean f44123i;

        public C16672a(long j) {
            this(j, -1, -1, new int[0], new s2b[0], new long[0], 0L, false);
        }

        /* renamed from: b */
        public static long[] m47174b(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(i, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        /* renamed from: c */
        public static int[] m47175c(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(i, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* renamed from: d */
        public int m47176d() {
            return m47177e(-1);
        }

        /* renamed from: e */
        public int m47177e(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f44120f;
                if (i3 >= iArr.length || this.f44123i || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C16672a.class != obj.getClass()) {
                return false;
            }
            C16672a c16672a = (C16672a) obj;
            return this.f44115a == c16672a.f44115a && this.f44116b == c16672a.f44116b && this.f44117c == c16672a.f44117c && Arrays.equals(this.f44119e, c16672a.f44119e) && Arrays.equals(this.f44120f, c16672a.f44120f) && Arrays.equals(this.f44121g, c16672a.f44121g) && this.f44122h == c16672a.f44122h && this.f44123i == c16672a.f44123i;
        }

        /* renamed from: f */
        public boolean m47178f() {
            if (this.f44116b == -1) {
                return true;
            }
            for (int i = 0; i < this.f44116b; i++) {
                int i2 = this.f44120f[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final boolean m47179g() {
            return this.f44123i && this.f44115a == Long.MIN_VALUE && this.f44116b == -1;
        }

        /* renamed from: h */
        public boolean m47180h() {
            return this.f44116b == -1 || m47176d() < this.f44116b;
        }

        public int hashCode() {
            int i = ((this.f44116b * 31) + this.f44117c) * 31;
            long j = this.f44115a;
            int iHashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f44119e)) * 31) + Arrays.hashCode(this.f44120f)) * 31) + Arrays.hashCode(this.f44121g)) * 31;
            long j2 = this.f44122h;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f44123i ? 1 : 0);
        }

        /* renamed from: i */
        public C16672a m47181i(int i) {
            int[] iArrM47175c = m47175c(this.f44120f, i);
            long[] jArrM47174b = m47174b(this.f44121g, i);
            return new C16672a(this.f44115a, i, this.f44117c, iArrM47175c, (s2b[]) Arrays.copyOf(this.f44119e, i), jArrM47174b, this.f44122h, this.f44123i);
        }

        public C16672a(long j, int i, int i2, int[] iArr, s2b[] s2bVarArr, long[] jArr, long j2, boolean z) {
            int i3 = 0;
            op0.m42511a(iArr.length == s2bVarArr.length);
            this.f44115a = j;
            this.f44116b = i;
            this.f44117c = i2;
            this.f44120f = iArr;
            this.f44119e = s2bVarArr;
            this.f44121g = jArr;
            this.f44122h = j2;
            this.f44123i = z;
            this.f44118d = new Uri[s2bVarArr.length];
            while (true) {
                Uri[] uriArr = this.f44118d;
                if (i3 >= uriArr.length) {
                    return;
                }
                s2b s2bVar = s2bVarArr[i3];
                uriArr[i3] = s2bVar == null ? null : ((s2b.C16723h) op0.m42515e(s2bVar.f44480b)).f44572a;
                i3++;
            }
        }
    }

    public rv(Object obj, C16672a[] c16672aArr, long j, long j2, int i) {
        this.f44100a = obj;
        this.f44102c = j;
        this.f44103d = j2;
        this.f44101b = c16672aArr.length + i;
        this.f44105f = c16672aArr;
        this.f44104e = i;
    }

    /* renamed from: a */
    public C16672a m47168a(int i) {
        int i2 = this.f44104e;
        return i < i2 ? f44095h : this.f44105f[i - i2];
    }

    /* renamed from: b */
    public int m47169b(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = this.f44104e;
        while (i < this.f44101b && ((m47168a(i).f44115a != Long.MIN_VALUE && m47168a(i).f44115a <= j) || !m47168a(i).m47180h())) {
            i++;
        }
        if (i < this.f44101b) {
            return i;
        }
        return -1;
    }

    /* renamed from: c */
    public int m47170c(long j, long j2) {
        int i = this.f44101b - 1;
        int i2 = i - (m47171d(i) ? 1 : 0);
        while (i2 >= 0 && m47172e(j, j2, i2)) {
            i2--;
        }
        if (i2 < 0 || !m47168a(i2).m47178f()) {
            return -1;
        }
        return i2;
    }

    /* renamed from: d */
    public boolean m47171d(int i) {
        return i == this.f44101b - 1 && m47168a(i).m47179g();
    }

    /* renamed from: e */
    public final boolean m47172e(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        C16672a c16672aM47168a = m47168a(i);
        long j3 = c16672aM47168a.f44115a;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || (c16672aM47168a.f44123i && c16672aM47168a.f44116b == -1) || j < j2 : j < j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rv.class != obj.getClass()) {
            return false;
        }
        rv rvVar = (rv) obj;
        return sqi.m48724c(this.f44100a, rvVar.f44100a) && this.f44101b == rvVar.f44101b && this.f44102c == rvVar.f44102c && this.f44103d == rvVar.f44103d && this.f44104e == rvVar.f44104e && Arrays.equals(this.f44105f, rvVar.f44105f);
    }

    public int hashCode() {
        int i = this.f44101b * 31;
        Object obj = this.f44100a;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f44102c)) * 31) + ((int) this.f44103d)) * 31) + this.f44104e) * 31) + Arrays.hashCode(this.f44105f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f44100a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f44102c);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f44105f.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f44105f[i].f44115a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f44105f[i].f44120f.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f44105f[i].f44120f[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f44105f[i].f44121g[i2]);
                sb.append(')');
                if (i2 < this.f44105f[i].f44120f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f44105f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}

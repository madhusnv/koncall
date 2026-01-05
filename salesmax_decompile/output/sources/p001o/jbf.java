package p001o;

import androidx.media3.common.C2181a;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class jbf {

    /* renamed from: a */
    public final zbe f30107a;

    /* renamed from: b */
    public final long f30108b;

    /* renamed from: c */
    public final long f30109c;

    /* renamed from: o.jbf$a */
    public static abstract class AbstractC14487a extends jbf {

        /* renamed from: d */
        public final long f30110d;

        /* renamed from: e */
        public final long f30111e;

        /* renamed from: f */
        public final List f30112f;

        /* renamed from: g */
        public final long f30113g;

        /* renamed from: h */
        public final long f30114h;

        /* renamed from: i */
        public final long f30115i;

        public AbstractC14487a(zbe zbeVar, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
            super(zbeVar, j, j2);
            this.f30110d = j3;
            this.f30111e = j4;
            this.f30112f = list;
            this.f30115i = j5;
            this.f30113g = j6;
            this.f30114h = j7;
        }

        /* renamed from: c */
        public long m33482c(long j, long j2) {
            long jMo33486g = mo33486g(j);
            return jMo33486g != -1 ? jMo33486g : (int) (m33488i((j2 - this.f30114h) + this.f30115i, j) - m33483d(j, j2));
        }

        /* renamed from: d */
        public long m33483d(long j, long j2) {
            if (mo33486g(j) == -1) {
                long j3 = this.f30113g;
                if (j3 != -9223372036854775807L) {
                    return Math.max(m33484e(), m33488i((j2 - this.f30114h) - j3, j));
                }
            }
            return m33484e();
        }

        /* renamed from: e */
        public long m33484e() {
            return this.f30110d;
        }

        /* renamed from: f */
        public long m33485f(long j, long j2) {
            if (this.f30112f != null) {
                return -9223372036854775807L;
            }
            long jM33483d = m33483d(j, j2) + m33482c(j, j2);
            return (m33489j(jM33483d) + m33487h(jM33483d, j)) - this.f30115i;
        }

        /* renamed from: g */
        public abstract long mo33486g(long j);

        /* renamed from: h */
        public final long m33487h(long j, long j2) {
            List list = this.f30112f;
            if (list != null) {
                return (((C14490d) list.get((int) (j - this.f30110d))).f30121b * 1000000) / this.f30108b;
            }
            long jMo33486g = mo33486g(j2);
            return (jMo33486g == -1 || j != (m33484e() + jMo33486g) - 1) ? (this.f30111e * 1000000) / this.f30108b : j2 - m33489j(j);
        }

        /* renamed from: i */
        public long m33488i(long j, long j2) {
            long jM33484e = m33484e();
            long jMo33486g = mo33486g(j2);
            if (jMo33486g == 0) {
                return jM33484e;
            }
            if (this.f30112f == null) {
                long j3 = this.f30110d + (j / ((this.f30111e * 1000000) / this.f30108b));
                return j3 < jM33484e ? jM33484e : jMo33486g == -1 ? j3 : Math.min(j3, (jM33484e + jMo33486g) - 1);
            }
            long j4 = (jMo33486g + jM33484e) - 1;
            long j5 = jM33484e;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                long jM33489j = m33489j(j6);
                if (jM33489j < j) {
                    j5 = j6 + 1;
                } else {
                    if (jM33489j <= j) {
                        return j6;
                    }
                    j4 = j6 - 1;
                }
            }
            return j5 == jM33484e ? j5 : j4;
        }

        /* renamed from: j */
        public final long m33489j(long j) {
            List list = this.f30112f;
            return sqi.a1(list != null ? ((C14490d) list.get((int) (j - this.f30110d))).f30120a - this.f30109c : (j - this.f30110d) * this.f30111e, 1000000L, this.f30108b);
        }

        /* renamed from: k */
        public abstract zbe mo33490k(tle tleVar, long j);

        /* renamed from: l */
        public boolean mo33491l() {
            return this.f30112f != null;
        }
    }

    /* renamed from: o.jbf$b */
    public static final class C14488b extends AbstractC14487a {

        /* renamed from: j */
        public final List f30116j;

        public C14488b(zbe zbeVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
            super(zbeVar, j, j2, j3, j4, list, j5, j6, j7);
            this.f30116j = list2;
        }

        @Override // p001o.jbf.AbstractC14487a
        /* renamed from: g */
        public long mo33486g(long j) {
            return this.f30116j.size();
        }

        @Override // p001o.jbf.AbstractC14487a
        /* renamed from: k */
        public zbe mo33490k(tle tleVar, long j) {
            return (zbe) this.f30116j.get((int) (j - this.f30110d));
        }

        @Override // p001o.jbf.AbstractC14487a
        /* renamed from: l */
        public boolean mo33491l() {
            return true;
        }
    }

    /* renamed from: o.jbf$c */
    public static final class C14489c extends AbstractC14487a {

        /* renamed from: j */
        public final u8i f30117j;

        /* renamed from: k */
        public final u8i f30118k;

        /* renamed from: l */
        public final long f30119l;

        public C14489c(zbe zbeVar, long j, long j2, long j3, long j4, long j5, List list, long j6, u8i u8iVar, u8i u8iVar2, long j7, long j8) {
            super(zbeVar, j, j2, j3, j5, list, j6, j7, j8);
            this.f30117j = u8iVar;
            this.f30118k = u8iVar2;
            this.f30119l = j4;
        }

        @Override // p001o.jbf
        /* renamed from: a */
        public zbe mo33480a(tle tleVar) {
            u8i u8iVar = this.f30117j;
            if (u8iVar == null) {
                return super.mo33480a(tleVar);
            }
            C2181a c2181a = tleVar.f47375b;
            return new zbe(u8iVar.m51214a(c2181a.f7930a, 0L, c2181a.f7938i, 0L), 0L, -1L);
        }

        @Override // p001o.jbf.AbstractC14487a
        /* renamed from: g */
        public long mo33486g(long j) {
            if (this.f30112f != null) {
                return r0.size();
            }
            long j2 = this.f30119l;
            if (j2 != -1) {
                return (j2 - this.f30110d) + 1;
            }
            if (j != -9223372036854775807L) {
                return mh1.m39043a(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f30108b)), BigInteger.valueOf(this.f30111e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // p001o.jbf.AbstractC14487a
        /* renamed from: k */
        public zbe mo33490k(tle tleVar, long j) {
            List list = this.f30112f;
            long j2 = list != null ? ((C14490d) list.get((int) (j - this.f30110d))).f30120a : (j - this.f30110d) * this.f30111e;
            u8i u8iVar = this.f30118k;
            C2181a c2181a = tleVar.f47375b;
            return new zbe(u8iVar.m51214a(c2181a.f7930a, j, c2181a.f7938i, j2), 0L, -1L);
        }
    }

    /* renamed from: o.jbf$d */
    public static final class C14490d {

        /* renamed from: a */
        public final long f30120a;

        /* renamed from: b */
        public final long f30121b;

        public C14490d(long j, long j2) {
            this.f30120a = j;
            this.f30121b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C14490d.class != obj.getClass()) {
                return false;
            }
            C14490d c14490d = (C14490d) obj;
            return this.f30120a == c14490d.f30120a && this.f30121b == c14490d.f30121b;
        }

        public int hashCode() {
            return (((int) this.f30120a) * 31) + ((int) this.f30121b);
        }
    }

    public jbf(zbe zbeVar, long j, long j2) {
        this.f30107a = zbeVar;
        this.f30108b = j;
        this.f30109c = j2;
    }

    /* renamed from: a */
    public zbe mo33480a(tle tleVar) {
        return this.f30107a;
    }

    /* renamed from: b */
    public long m33481b() {
        return sqi.a1(this.f30109c, 1000000L, this.f30108b);
    }

    /* renamed from: o.jbf$e */
    public static class C14491e extends jbf {

        /* renamed from: d */
        public final long f30122d;

        /* renamed from: e */
        public final long f30123e;

        public C14491e(zbe zbeVar, long j, long j2, long j3, long j4) {
            super(zbeVar, j, j2);
            this.f30122d = j3;
            this.f30123e = j4;
        }

        /* renamed from: c */
        public zbe m33492c() {
            long j = this.f30123e;
            if (j <= 0) {
                return null;
            }
            return new zbe(null, this.f30122d, j);
        }

        public C14491e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}

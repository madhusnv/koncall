package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.inb;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class qdj implements cbf {

    /* renamed from: a */
    public final long f41731a;

    /* renamed from: b */
    public final int f41732b;

    /* renamed from: c */
    public final long f41733c;

    /* renamed from: d */
    public final int f41734d;

    /* renamed from: e */
    public final long f41735e;

    /* renamed from: f */
    public final long f41736f;

    /* renamed from: g */
    public final long[] f41737g;

    public qdj(long j, int i, long j2, int i2) {
        this(j, i, j2, i2, -1L, null);
    }

    /* renamed from: a */
    public static qdj m45209a(pdj pdjVar, long j) {
        long[] jArr;
        long jM43495a = pdjVar.m43495a();
        if (jM43495a == -9223372036854775807L) {
            return null;
        }
        long j2 = pdjVar.f39934c;
        if (j2 == -1 || (jArr = pdjVar.f39937f) == null) {
            inb.C14334a c14334a = pdjVar.f39932a;
            return new qdj(j, c14334a.f28965c, jM43495a, c14334a.f28968f);
        }
        inb.C14334a c14334a2 = pdjVar.f39932a;
        return new qdj(j, c14334a2.f28965c, jM43495a, c14334a2.f28968f, j2, jArr);
    }

    @Override // p001o.cbf
    /* renamed from: b */
    public long mo20725b(long j) {
        long j2 = j - this.f41731a;
        if (!mo25531h() || j2 <= this.f41732b) {
            return 0L;
        }
        long[] jArr = (long[]) op0.m42519i(this.f41737g);
        double d = (j2 * 256.0d) / this.f41735e;
        int iM48728g = sqi.m48728g(jArr, (long) d, true, true);
        long jM45210c = m45210c(iM48728g);
        long j3 = jArr[iM48728g];
        int i = iM48728g + 1;
        long jM45210c2 = m45210c(i);
        return jM45210c + Math.round((j3 == (iM48728g == 99 ? 256L : jArr[i]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (r0 - j3)) * (jM45210c2 - jM45210c));
    }

    /* renamed from: c */
    public final long m45210c(int i) {
        return (this.f41733c * i) / 100;
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        if (!mo25531h()) {
            return new zaf.C18603a(new bbf(0L, this.f41731a + this.f41732b));
        }
        long jM48737p = sqi.m48737p(j, 0L, this.f41733c);
        double d = (jM48737p * 100.0d) / this.f41733c;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) op0.m42519i(this.f41737g))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        return new zaf.C18603a(new bbf(jM48737p, this.f41731a + sqi.m48737p(Math.round((d2 / 256.0d) * this.f41735e), this.f41732b, this.f41735e - 1)));
    }

    @Override // p001o.cbf
    /* renamed from: g */
    public long mo20726g() {
        return this.f41736f;
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f41733c;
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return this.f41737g != null;
    }

    @Override // p001o.cbf
    /* renamed from: j */
    public int mo20727j() {
        return this.f41734d;
    }

    public qdj(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f41731a = j;
        this.f41732b = i;
        this.f41733c = j2;
        this.f41734d = i2;
        this.f41735e = j3;
        this.f41737g = jArr;
        this.f41736f = j3 != -1 ? j + j3 : -1L;
    }
}

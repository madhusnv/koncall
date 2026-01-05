package p001o;

import p001o.zaf;

/* loaded from: classes2.dex */
public class pt3 implements zaf {

    /* renamed from: a */
    public final long f40514a;

    /* renamed from: b */
    public final long f40515b;

    /* renamed from: c */
    public final int f40516c;

    /* renamed from: d */
    public final long f40517d;

    /* renamed from: e */
    public final int f40518e;

    /* renamed from: f */
    public final long f40519f;

    /* renamed from: g */
    public final boolean f40520g;

    public pt3(long j, long j2, int i, int i2, boolean z) {
        this.f40514a = j;
        this.f40515b = j2;
        this.f40516c = i2 == -1 ? 1 : i2;
        this.f40518e = i;
        this.f40520g = z;
        if (j == -1) {
            this.f40517d = -1L;
            this.f40519f = -9223372036854775807L;
        } else {
            this.f40517d = j - j2;
            this.f40519f = m44136d(j, j2, i);
        }
    }

    /* renamed from: d */
    public static long m44136d(long j, long j2, int i) {
        return ((Math.max(0L, j - j2) * 8) * 1000000) / i;
    }

    /* renamed from: a */
    public final long m44137a(long j) {
        int i = this.f40516c;
        long jMin = (((j * this.f40518e) / 8000000) / i) * i;
        long j2 = this.f40517d;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - i);
        }
        return this.f40515b + Math.max(jMin, 0L);
    }

    /* renamed from: c */
    public long m44138c(long j) {
        return m44136d(j, this.f40515b, this.f40518e);
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        if (this.f40517d == -1 && !this.f40520g) {
            return new zaf.C18603a(new bbf(0L, this.f40515b));
        }
        long jM44137a = m44137a(j);
        long jM44138c = m44138c(jM44137a);
        bbf bbfVar = new bbf(jM44138c, jM44137a);
        if (this.f40517d != -1 && jM44138c < j) {
            int i = this.f40516c;
            if (i + jM44137a < this.f40514a) {
                long j2 = jM44137a + i;
                return new zaf.C18603a(bbfVar, new bbf(m44138c(j2), j2));
            }
        }
        return new zaf.C18603a(bbfVar);
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f40519f;
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return this.f40517d != -1 || this.f40520g;
    }
}

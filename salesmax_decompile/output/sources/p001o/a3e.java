package p001o;

import com.google.android.gms.location.DeviceOrientationRequest;

/* loaded from: classes2.dex */
public final class a3e {

    /* renamed from: c */
    public boolean f14106c;

    /* renamed from: d */
    public boolean f14107d;

    /* renamed from: e */
    public boolean f14108e;

    /* renamed from: a */
    public final umh f14104a = new umh(0);

    /* renamed from: f */
    public long f14109f = -9223372036854775807L;

    /* renamed from: g */
    public long f14110g = -9223372036854775807L;

    /* renamed from: h */
    public long f14111h = -9223372036854775807L;

    /* renamed from: b */
    public final zwc f14105b = new zwc();

    /* renamed from: a */
    public static boolean m16386a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    /* renamed from: l */
    public static long m16387l(zwc zwcVar) {
        int iM60025f = zwcVar.m60025f();
        if (zwcVar.m60020a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zwcVar.m60031l(bArr, 0, 9);
        zwcVar.m60017U(iM60025f);
        if (m16386a(bArr)) {
            return m16388m(bArr);
        }
        return -9223372036854775807L;
    }

    /* renamed from: m */
    public static long m16388m(byte[] bArr) {
        byte b = bArr[0];
        long j = (((b & 56) >> 3) << 30) | ((b & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b2 = bArr[2];
        return j | (((b2 & 248) >> 3) << 15) | ((b2 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    /* renamed from: b */
    public final int m16389b(uq6 uq6Var) {
        this.f14105b.m60014R(sqi.f45795f);
        this.f14106c = true;
        uq6Var.mo40490c();
        return 0;
    }

    /* renamed from: c */
    public long m16390c() {
        return this.f14111h;
    }

    /* renamed from: d */
    public umh m16391d() {
        return this.f14104a;
    }

    /* renamed from: e */
    public boolean m16392e() {
        return this.f14106c;
    }

    /* renamed from: f */
    public final int m16393f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: g */
    public int m16394g(uq6 uq6Var, ued uedVar) {
        if (!this.f14108e) {
            return m16397j(uq6Var, uedVar);
        }
        if (this.f14110g == -9223372036854775807L) {
            return m16389b(uq6Var);
        }
        if (!this.f14107d) {
            return m16395h(uq6Var, uedVar);
        }
        long j = this.f14109f;
        if (j == -9223372036854775807L) {
            return m16389b(uq6Var);
        }
        this.f14111h = this.f14104a.m51796c(this.f14110g) - this.f14104a.m51795b(j);
        return m16389b(uq6Var);
    }

    /* renamed from: h */
    public final int m16395h(uq6 uq6Var, ued uedVar) {
        int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, uq6Var.getLength());
        long j = 0;
        if (uq6Var.getPosition() != j) {
            uedVar.f48772a = j;
            return 1;
        }
        this.f14105b.m60013Q(iMin);
        uq6Var.mo40490c();
        uq6Var.mo40498m(this.f14105b.m60024e(), 0, iMin);
        this.f14109f = m16396i(this.f14105b);
        this.f14107d = true;
        return 0;
    }

    /* renamed from: i */
    public final long m16396i(zwc zwcVar) {
        int iM60026g = zwcVar.m60026g();
        for (int iM60025f = zwcVar.m60025f(); iM60025f < iM60026g - 3; iM60025f++) {
            if (m16393f(zwcVar.m60024e(), iM60025f) == 442) {
                zwcVar.m60017U(iM60025f + 4);
                long jM16387l = m16387l(zwcVar);
                if (jM16387l != -9223372036854775807L) {
                    return jM16387l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: j */
    public final int m16397j(uq6 uq6Var, ued uedVar) {
        long length = uq6Var.getLength();
        int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, length);
        long j = length - iMin;
        if (uq6Var.getPosition() != j) {
            uedVar.f48772a = j;
            return 1;
        }
        this.f14105b.m60013Q(iMin);
        uq6Var.mo40490c();
        uq6Var.mo40498m(this.f14105b.m60024e(), 0, iMin);
        this.f14110g = m16398k(this.f14105b);
        this.f14108e = true;
        return 0;
    }

    /* renamed from: k */
    public final long m16398k(zwc zwcVar) {
        int iM60025f = zwcVar.m60025f();
        for (int iM60026g = zwcVar.m60026g() - 4; iM60026g >= iM60025f; iM60026g--) {
            if (m16393f(zwcVar.m60024e(), iM60026g) == 442) {
                zwcVar.m60017U(iM60026g + 4);
                long jM16387l = m16387l(zwcVar);
                if (jM16387l != -9223372036854775807L) {
                    return jM16387l;
                }
            }
        }
        return -9223372036854775807L;
    }
}

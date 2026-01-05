package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class o32 {

    /* renamed from: a */
    public final float f37685a;

    /* renamed from: b */
    public final float f37686b;

    /* renamed from: c */
    public final float f37687c;

    /* renamed from: d */
    public final float f37688d;

    /* renamed from: e */
    public final float f37689e;

    /* renamed from: f */
    public final float f37690f;

    /* renamed from: g */
    public final float f37691g;

    /* renamed from: h */
    public final float f37692h;

    /* renamed from: i */
    public final float f37693i;

    public o32(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f37685a = f;
        this.f37686b = f2;
        this.f37687c = f3;
        this.f37688d = f4;
        this.f37689e = f5;
        this.f37690f = f6;
        this.f37691g = f7;
        this.f37692h = f8;
        this.f37693i = f9;
    }

    /* renamed from: b */
    public static o32 m41479b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        o32 o32Var = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iM41494p = m41482e(f8, f2, f).m41494p();
            float fM42939b = p32.m42939b(iM41494p);
            float fAbs = Math.abs(f3 - fM42939b);
            if (fAbs < 0.2f) {
                o32 o32VarM41480c = m41480c(iM41494p);
                float fM41486a = o32VarM41480c.m41486a(m41482e(o32VarM41480c.m41491k(), o32VarM41480c.m41489i(), f));
                if (fM41486a <= 1.0f) {
                    o32Var = o32VarM41480c;
                    f5 = fAbs;
                    f7 = fM41486a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            }
            if (fM42939b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return o32Var;
    }

    /* renamed from: c */
    public static o32 m41480c(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        m41481d(i, n0j.f36189k, fArr, fArr2);
        return new o32(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    /* renamed from: d */
    public static void m41481d(int i, n0j n0jVar, float[] fArr, float[] fArr2) {
        p32.m42943f(i, fArr2);
        float[][] fArr3 = p32.f39276a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = f2 + (fArr4[1] * f3);
        float f5 = fArr2[2];
        float f6 = f4 + (fArr4[2] * f5);
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[0] * f) + (fArr5[1] * f3) + (fArr5[2] * f5);
        float[] fArr6 = fArr3[2];
        float f8 = (f * fArr6[0]) + (f3 * fArr6[1]) + (f5 * fArr6[2]);
        float f9 = n0jVar.m39972i()[0] * f6;
        float f10 = n0jVar.m39972i()[1] * f7;
        float f11 = n0jVar.m39972i()[2] * f8;
        float fPow = (float) Math.pow((n0jVar.m39966c() * Math.abs(f9)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((n0jVar.m39966c() * Math.abs(f10)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((n0jVar.m39966c() * Math.abs(f11)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) ((fSignum + fSignum2) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = (((fSignum * 20.0f) + f14) + (21.0f * fSignum3)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f16 * n0jVar.m39969f()) / n0jVar.m39964a(), n0jVar.m39965b() * n0jVar.m39973j())) * 100.0f;
        float fM39965b = (4.0f / n0jVar.m39965b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (n0jVar.m39964a() + 4.0f) * n0jVar.m39967d();
        float fSqrt = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, n0jVar.m39968e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * n0jVar.m39970g()) * n0jVar.m39971h()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float fM39967d = n0jVar.m39967d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r7 * n0jVar.m39965b()) / (n0jVar.m39964a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fM39967d) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fM39965b;
            fArr[2] = fM39967d;
            fArr[3] = fSqrt2;
            fArr[4] = f18;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    /* renamed from: e */
    public static o32 m41482e(float f, float f2, float f3) {
        return m41483f(f, f2, f3, n0j.f36189k);
    }

    /* renamed from: f */
    public static o32 m41483f(float f, float f2, float f3, n0j n0jVar) {
        float fM39965b = (4.0f / n0jVar.m39965b()) * ((float) Math.sqrt(f / 100.0d)) * (n0jVar.m39964a() + 4.0f) * n0jVar.m39967d();
        float fM39967d = f2 * n0jVar.m39967d();
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(r4))) * n0jVar.m39965b()) / (n0jVar.m39964a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((fM39967d * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new o32(f3, f2, f, fM39965b, fM39967d, fSqrt, f4, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* renamed from: m */
    public static int m41484m(float f, float f2, float f3) {
        return m41485n(f, f2, f3, n0j.f36189k);
    }

    /* renamed from: n */
    public static int m41485n(float f, float f2, float f3, n0j n0jVar) {
        if (f2 < 1.0d || Math.round(f3) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || Math.round(f3) >= 100.0d) {
            return p32.m42938a(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        o32 o32Var = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            o32 o32VarM41479b = m41479b(fMin, f5, f3);
            if (!z) {
                if (o32VarM41479b == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    o32Var = o32VarM41479b;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (o32VarM41479b != null) {
                    return o32VarM41479b.m41493o(n0jVar);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return o32Var == null ? p32.m42938a(f3) : o32Var.m41493o(n0jVar);
    }

    /* renamed from: a */
    public float m41486a(o32 o32Var) {
        float fM41492l = m41492l() - o32Var.m41492l();
        float fM41487g = m41487g() - o32Var.m41487g();
        float fM41488h = m41488h() - o32Var.m41488h();
        return (float) (Math.pow(Math.sqrt((fM41492l * fM41492l) + (fM41487g * fM41487g) + (fM41488h * fM41488h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    public float m41487g() {
        return this.f37692h;
    }

    /* renamed from: h */
    public float m41488h() {
        return this.f37693i;
    }

    /* renamed from: i */
    public float m41489i() {
        return this.f37686b;
    }

    /* renamed from: j */
    public float m41490j() {
        return this.f37685a;
    }

    /* renamed from: k */
    public float m41491k() {
        return this.f37687c;
    }

    /* renamed from: l */
    public float m41492l() {
        return this.f37691g;
    }

    /* renamed from: o */
    public int m41493o(n0j n0jVar) {
        float fPow = (float) Math.pow(((((double) m41489i()) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || ((double) m41491k()) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? 0.0f : m41489i() / ((float) Math.sqrt(m41491k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, n0jVar.m39968e()), 0.73d), 1.1111111111111112d);
        double dM41490j = (m41490j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dM41490j) + 3.8d)) * 0.25f;
        float fM39964a = n0jVar.m39964a() * ((float) Math.pow(m41491k() / 100.0d, (1.0d / n0jVar.m39965b()) / n0jVar.m39973j()));
        float fM39970g = fCos * 3846.1538f * n0jVar.m39970g() * n0jVar.m39971h();
        float fM39969f = fM39964a / n0jVar.m39969f();
        float fSin = (float) Math.sin(dM41490j);
        float fCos2 = (float) Math.cos(dM41490j);
        float f = (((0.305f + fM39969f) * 23.0f) * fPow) / (((fM39970g * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f2 = fCos2 * f;
        float f3 = f * fSin;
        float f4 = fM39969f * 460.0f;
        float f5 = (((451.0f * f2) + f4) + (288.0f * f3)) / 1403.0f;
        float f6 = ((f4 - (891.0f * f2)) - (261.0f * f3)) / 1403.0f;
        float fSignum = Math.signum(f5) * (100.0f / n0jVar.m39966c()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f5) * 27.13d) / (400.0d - Math.abs(f5))), 2.380952380952381d));
        float fSignum2 = Math.signum(f6) * (100.0f / n0jVar.m39966c()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f4 - (f2 * 220.0f)) - (f3 * 6300.0f)) / 1403.0f) * (100.0f / n0jVar.m39966c()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f7 = fSignum / n0jVar.m39972i()[0];
        float f8 = fSignum2 / n0jVar.m39972i()[1];
        float f9 = fSignum3 / n0jVar.m39972i()[2];
        float[][] fArr = p32.f39277b;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[0] * f7) + (fArr2[1] * f8) + (fArr2[2] * f9);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[0] * f7) + (fArr3[1] * f8) + (fArr3[2] * f9);
        float[] fArr4 = fArr[2];
        return ni3.m40611c(f10, f11, (f7 * fArr4[0]) + (f8 * fArr4[1]) + (f9 * fArr4[2]));
    }

    /* renamed from: p */
    public int m41494p() {
        return m41493o(n0j.f36189k);
    }
}

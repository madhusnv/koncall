package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.kt3;
import p001o.th3;

/* loaded from: classes2.dex */
public abstract class fi3 {
    /* renamed from: a */
    public static final double m26713a(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(m26729q(d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? -d : d, d2, d3, d4, d5, d6), d);
    }

    /* renamed from: b */
    public static final double m26714b(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(m26731s(d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? -d : d, d2, d3, d4, d5, d6), d);
    }

    /* renamed from: c */
    public static final ei3 m26715c(ei3 ei3Var, m8j m8jVar, sv svVar) {
        sq8.m48649h(ei3Var, "<this>");
        sq8.m48649h(m8jVar, "whitePoint");
        sq8.m48649h(svVar, "adaptation");
        if (!th3.m49873e(ei3Var.m25094e(), th3.f47123a.m49878b())) {
            return ei3Var;
        }
        zte zteVar = (zte) ei3Var;
        if (m26718f(zteVar.m59920J(), m8jVar)) {
            return ei3Var;
        }
        return new zte(zteVar, m26723k(m26717e(svVar.m48953b(), zteVar.m59920J().m38579c(), m8jVar.m38579c()), zteVar.m59919I()), m8jVar);
    }

    /* renamed from: d */
    public static /* synthetic */ ei3 m26716d(ei3 ei3Var, m8j m8jVar, sv svVar, int i, Object obj) {
        if ((i & 2) != 0) {
            svVar = sv.f45989b.m48954a();
        }
        return m26715c(ei3Var, m8jVar, svVar);
    }

    /* renamed from: e */
    public static final float[] m26717e(float[] fArr, float[] fArr2, float[] fArr3) {
        sq8.m48649h(fArr, "matrix");
        sq8.m48649h(fArr2, "srcWhitePoint");
        sq8.m48649h(fArr3, "dstWhitePoint");
        float[] fArrM26725m = m26725m(fArr, fArr2);
        float[] fArrM26725m2 = m26725m(fArr, fArr3);
        return m26723k(m26722j(fArr), m26724l(new float[]{fArrM26725m2[0] / fArrM26725m[0], fArrM26725m2[1] / fArrM26725m[1], fArrM26725m2[2] / fArrM26725m[2]}, fArr));
    }

    /* renamed from: f */
    public static final boolean m26718f(m8j m8jVar, m8j m8jVar2) {
        sq8.m48649h(m8jVar, "a");
        sq8.m48649h(m8jVar2, "b");
        if (m8jVar == m8jVar2) {
            return true;
        }
        return Math.abs(m8jVar.m38577a() - m8jVar2.m38577a()) < 0.001f && Math.abs(m8jVar.m38578b() - m8jVar2.m38578b()) < 0.001f;
    }

    /* renamed from: g */
    public static final boolean m26719g(float[] fArr, float[] fArr2) {
        sq8.m48649h(fArr, "a");
        sq8.m48649h(fArr2, "b");
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static final kt3 m26720h(ei3 ei3Var, ei3 ei3Var2, int i) {
        sq8.m48649h(ei3Var, "$this$connect");
        sq8.m48649h(ei3Var2, FirebaseAnalytics.Param.DESTINATION);
        ii3 ii3Var = ii3.f28698a;
        if (ei3Var == ii3Var.m32167h()) {
            if (ei3Var2 == ii3Var.m32167h()) {
                return kt3.f32675g.m36198d();
            }
            if (ei3Var2 == ii3Var.m32166g() && rie.m46840e(i, rie.f43686a.m46842b())) {
                return kt3.f32675g.m36199e();
            }
        } else if (ei3Var == ii3Var.m32166g() && ei3Var2 == ii3Var.m32167h() && rie.m46840e(i, rie.f43686a.m46842b())) {
            return kt3.f32675g.m36197c();
        }
        if (ei3Var == ei3Var2) {
            return kt3.f32675g.m36200f(ei3Var);
        }
        long jM25094e = ei3Var.m25094e();
        th3.C17111a c17111a = th3.f47123a;
        id5 id5Var = null;
        return (th3.m49873e(jM25094e, c17111a.m49878b()) && th3.m49873e(ei3Var2.m25094e(), c17111a.m49878b())) ? new kt3.C14920b((zte) ei3Var, (zte) ei3Var2, i, id5Var) : new kt3(ei3Var, ei3Var2, i, id5Var);
    }

    /* renamed from: i */
    public static /* synthetic */ kt3 m26721i(ei3 ei3Var, ei3 ei3Var2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ei3Var2 = ii3.f28698a.m32167h();
        }
        if ((i2 & 2) != 0) {
            i = rie.f43686a.m46842b();
        }
        return m26720h(ei3Var, ei3Var2, i);
    }

    /* renamed from: j */
    public static final float[] m26722j(float[] fArr) {
        sq8.m48649h(fArr, "m");
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    /* renamed from: k */
    public static final float[] m26723k(float[] fArr, float[] fArr2) {
        sq8.m48649h(fArr, "lhs");
        sq8.m48649h(fArr2, "rhs");
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = fArr[2] * f7;
        float f11 = fArr[5];
        float f12 = f10 + (fArr2[1] * f11);
        float f13 = fArr[8];
        float f14 = fArr[0];
        float f15 = fArr2[3] * f14;
        float f16 = fArr2[4];
        float f17 = f15 + (f2 * f16);
        float f18 = fArr2[5];
        float f19 = fArr[1];
        float f20 = fArr2[3];
        float f21 = fArr[2];
        float f22 = f14 * fArr2[6];
        float f23 = fArr[3];
        float f24 = fArr2[7];
        float f25 = f22 + (f23 * f24);
        float f26 = fArr2[8];
        float f27 = fArr2[6];
        return new float[]{f + (f2 * f3) + (f4 * f5), (f6 * f7) + (f3 * f8) + (f9 * f5), f12 + (f5 * f13), f17 + (f4 * f18), (f19 * f20) + (f8 * f16) + (f9 * f18), (f20 * f21) + (f11 * fArr2[4]) + (f18 * f13), f25 + (f4 * f26), (f19 * f27) + (fArr[4] * f24) + (f9 * f26), (f21 * f27) + (fArr[5] * fArr2[7]) + (f13 * f26)};
    }

    /* renamed from: l */
    public static final float[] m26724l(float[] fArr, float[] fArr2) {
        sq8.m48649h(fArr, "lhs");
        sq8.m48649h(fArr2, "rhs");
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }

    /* renamed from: m */
    public static final float[] m26725m(float[] fArr, float[] fArr2) {
        sq8.m48649h(fArr, "lhs");
        sq8.m48649h(fArr2, "rhs");
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    /* renamed from: n */
    public static final float m26726n(float[] fArr, float f, float f2, float f3) {
        sq8.m48649h(fArr, "lhs");
        return (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
    }

    /* renamed from: o */
    public static final float m26727o(float[] fArr, float f, float f2, float f3) {
        sq8.m48649h(fArr, "lhs");
        return (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
    }

    /* renamed from: p */
    public static final float m26728p(float[] fArr, float f, float f2, float f3) {
        sq8.m48649h(fArr, "lhs");
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    /* renamed from: q */
    public static final double m26729q(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    /* renamed from: r */
    public static final double m26730r(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    /* renamed from: s */
    public static final double m26731s(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d * d4;
    }

    /* renamed from: t */
    public static final double m26732t(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }
}

package h1;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.s */
/* loaded from: classes.dex */
public final class C2788s implements InterfaceC2792w {

    /* renamed from: a */
    public final float f15578a;

    /* renamed from: b */
    public final float f15579b;

    /* renamed from: c */
    public final float f15580c;

    /* renamed from: d */
    public final float f15581d;

    /* renamed from: e */
    public final float f15582e;

    /* renamed from: f */
    public final float f15583f;

    public C2788s(float f6, float f10, float f11, float f12) {
        int iM5152x;
        this.f15578a = f6;
        this.f15579b = f10;
        this.f15580c = f11;
        this.f15581d = f12;
        if (!((Float.isNaN(f6) || Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12)) ? false : true)) {
            n0.m6839a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f6 + ", " + f10 + ", " + f11 + ", " + f12 + '.');
        }
        float[] fArr = new float[5];
        float f13 = (f10 - DefinitionKt.NO_Float_VALUE) * 3.0f;
        float f14 = (f12 - f10) * 3.0f;
        float f15 = (1.0f - f12) * 3.0f;
        double d2 = f13;
        double d10 = f14;
        double d11 = f15;
        double d12 = d10 * 2.0d;
        double d13 = (d2 - d12) + d11;
        if (d13 == 0.0d) {
            iM5152x = d10 == d11 ? 0 : d3.h0.m5152x((float) ((d12 - d11) / (d12 - (d11 * 2.0d))), fArr, 0);
        } else {
            double d14 = -Math.sqrt((d10 * d10) - (d11 * d2));
            double d15 = (-d2) + d10;
            int iM5152x2 = d3.h0.m5152x((float) ((-(d14 + d15)) / d13), fArr, 0);
            int iM5152x3 = d3.h0.m5152x((float) ((d14 - d15) / d13), fArr, iM5152x2) + iM5152x2;
            if (iM5152x3 > 1) {
                float f16 = fArr[0];
                float f17 = fArr[1];
                if (f16 > f17) {
                    fArr[0] = f17;
                    fArr[1] = f16;
                } else if (f16 == f17) {
                    iM5152x = iM5152x3 - 1;
                }
                iM5152x = iM5152x3;
            } else {
                iM5152x = iM5152x3;
            }
        }
        float f18 = (f14 - f13) * 2.0f;
        int iM5152x4 = d3.h0.m5152x((-f18) / (((f15 - f14) * 2.0f) - f18), fArr, iM5152x) + iM5152x;
        float fMin = Math.min(DefinitionKt.NO_Float_VALUE, 1.0f);
        float fMax = Math.max(DefinitionKt.NO_Float_VALUE, 1.0f);
        for (int i10 = 0; i10 < iM5152x4; i10++) {
            float f19 = fArr[i10];
            float f20 = (((((((((f10 - f12) * 3.0f) + 1.0f) - DefinitionKt.NO_Float_VALUE) * f19) + (((f12 - (f10 * 2.0f)) + DefinitionKt.NO_Float_VALUE) * 3.0f)) * f19) + f13) * f19) + DefinitionKt.NO_Float_VALUE;
            fMin = Math.min(fMin, f20);
            fMax = Math.max(fMax, f20);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
        this.f15582e = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f15583f = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
      0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
      0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // h1.InterfaceC2792w
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float mo6654c(float r27) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C2788s.mo6654c(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2788s)) {
            return false;
        }
        C2788s c2788s = (C2788s) obj;
        return this.f15578a == c2788s.f15578a && this.f15579b == c2788s.f15579b && this.f15580c == c2788s.f15580c && this.f15581d == c2788s.f15581d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15581d) + AbstractC1452a.m4555b(this.f15580c, AbstractC1452a.m4555b(this.f15579b, Float.hashCode(this.f15578a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f15578a);
        sb2.append(", b=");
        sb2.append(this.f15579b);
        sb2.append(", c=");
        sb2.append(this.f15580c);
        sb2.append(", d=");
        return AbstractC1452a.m4562i(sb2, this.f15581d, ')');
    }
}

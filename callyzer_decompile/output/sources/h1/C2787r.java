package h1;

import com.skydoves.balloon.internals.DefinitionKt;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.r */
/* loaded from: classes.dex */
public final class C2787r {

    /* renamed from: a */
    public final float f15555a;

    /* renamed from: b */
    public final float f15556b;

    /* renamed from: c */
    public final float f15557c;

    /* renamed from: d */
    public final float f15558d;

    /* renamed from: e */
    public final float f15559e;

    /* renamed from: f */
    public final float f15560f;

    /* renamed from: g */
    public final float f15561g;

    /* renamed from: h */
    public float f15562h;

    /* renamed from: i */
    public float f15563i;

    /* renamed from: j */
    public final float[] f15564j;

    /* renamed from: k */
    public final float f15565k;

    /* renamed from: l */
    public final float f15566l;

    /* renamed from: m */
    public final float f15567m;

    /* renamed from: n */
    public final float f15568n;

    /* renamed from: o */
    public final float f15569o;

    /* renamed from: p */
    public final boolean f15570p;

    /* renamed from: q */
    public final float f15571q;

    /* renamed from: r */
    public final float f15572r;

    public C2787r(int i10, float f6, float f10, float f11, float f12, float f13, float f14) {
        boolean z6;
        int i11;
        float f15;
        float f16;
        this.f15555a = f6;
        this.f15556b = f10;
        this.f15557c = f11;
        this.f15558d = f12;
        this.f15559e = f13;
        this.f15560f = f14;
        float f17 = f13 - f11;
        float f18 = f14 - f12;
        float f19 = DefinitionKt.NO_Float_VALUE;
        int i12 = 1;
        boolean z10 = i10 == 1 || (i10 == 4 ? f18 > DefinitionKt.NO_Float_VALUE : !(i10 != 5 || f18 >= DefinitionKt.NO_Float_VALUE));
        float f20 = z10 ? -1.0f : 1.0f;
        this.f15567m = f20;
        float f21 = 1 / (f10 - f6);
        this.f15565k = f21;
        float[] fArr = new float[101];
        this.f15564j = fArr;
        boolean z11 = i10 == 3;
        if (z11 || Math.abs(f17) < 0.001f || Math.abs(f18) < 0.001f) {
            float fHypot = (float) Math.hypot(f18, f17);
            this.f15561g = fHypot;
            this.f15566l = fHypot * f21;
            this.f15571q = f17 * f21;
            this.f15572r = f18 * f21;
            this.f15568n = Float.NaN;
            this.f15569o = Float.NaN;
            z6 = true;
        } else {
            this.f15568n = f17 * f20;
            this.f15569o = f18 * (-f20);
            this.f15571q = z10 ? f13 : f11;
            this.f15572r = z10 ? f12 : f14;
            float f22 = f13 - f11;
            float f23 = f12 - f14;
            float[] fArr2 = AbstractC2773d.f15383i;
            int i13 = 90;
            float f24 = 90;
            float f25 = f23;
            float fHypot2 = 0.0f;
            float f26 = 0.0f;
            int i14 = 1;
            while (true) {
                i11 = i12;
                f15 = f19;
                double radians = (float) Math.toRadians((i14 * 90.0d) / i13);
                float fSin = ((float) Math.sin(radians)) * f22;
                float fCos = ((float) Math.cos(radians)) * f23;
                float f27 = fSin - f26;
                f16 = f24;
                fHypot2 += (float) Math.hypot(f27, fCos - f25);
                fArr2[i14] = fHypot2;
                i13 = 90;
                if (i14 == 90) {
                    break;
                }
                i14++;
                f25 = fCos;
                f24 = f16;
                f19 = f15;
                f26 = fSin;
                i12 = i11;
            }
            this.f15561g = fHypot2;
            int i15 = i11;
            while (true) {
                fArr2[i15] = fArr2[i15] / fHypot2;
                if (i15 == 90) {
                    break;
                } else {
                    i15++;
                }
            }
            int length = fArr.length;
            for (int i16 = 0; i16 < length; i16++) {
                float f28 = i16 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f28);
                if (iBinarySearch >= 0) {
                    fArr[i16] = iBinarySearch / f16;
                } else if (iBinarySearch == -1) {
                    fArr[i16] = f15;
                } else {
                    int i17 = -iBinarySearch;
                    int i18 = i17 - 2;
                    float f29 = i18;
                    float f30 = fArr2[i18];
                    fArr[i16] = (((f28 - f30) / (fArr2[i17 - 1] - f30)) + f29) / f16;
                }
            }
            this.f15566l = this.f15561g * this.f15565k;
            z6 = z11;
        }
        this.f15570p = z6;
    }

    /* renamed from: a */
    public final float m6849a() {
        float f6 = this.f15568n * this.f15563i;
        return f6 * this.f15567m * (this.f15566l / ((float) Math.hypot(f6, (-this.f15569o) * this.f15562h)));
    }

    /* renamed from: b */
    public final float m6850b() {
        float f6 = this.f15568n * this.f15563i;
        float f10 = (-this.f15569o) * this.f15562h;
        return f10 * this.f15567m * (this.f15566l / ((float) Math.hypot(f6, f10)));
    }

    /* renamed from: c */
    public final void m6851c(float f6) {
        float f10 = (this.f15567m == -1.0f ? this.f15556b - f6 : f6 - this.f15555a) * this.f15565k;
        float fM7368a = DefinitionKt.NO_Float_VALUE;
        if (f10 > DefinitionKt.NO_Float_VALUE) {
            fM7368a = 1.0f;
            if (f10 < 1.0f) {
                float f11 = f10 * 100;
                int i10 = (int) f11;
                float[] fArr = this.f15564j;
                float f12 = fArr[i10];
                fM7368a = i0.m0.m7368a(fArr[i10 + 1], f12, f11 - i10, f12);
            }
        }
        double d2 = fM7368a * 1.5707964f;
        this.f15562h = (float) Math.sin(d2);
        this.f15563i = (float) Math.cos(d2);
    }
}

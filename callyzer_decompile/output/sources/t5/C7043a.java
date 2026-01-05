package t5;

import android.graphics.Color;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t5.a */
/* loaded from: classes.dex */
public final class C7043a {

    /* renamed from: a */
    public final float f34060a;

    /* renamed from: b */
    public final float f34061b;

    /* renamed from: c */
    public final float f34062c;

    /* renamed from: d */
    public final float f34063d;

    /* renamed from: e */
    public final float f34064e;

    /* renamed from: f */
    public final float f34065f;

    public C7043a(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f34060a = f6;
        this.f34061b = f10;
        this.f34062c = f11;
        this.f34063d = f12;
        this.f34064e = f13;
        this.f34065f = f14;
    }

    /* renamed from: a */
    public static C7043a m13328a(int i10) {
        C7053k c7053k = C7053k.f34091k;
        float fM13334e = AbstractC7044b.m13334e(Color.red(i10));
        float fM13334e2 = AbstractC7044b.m13334e(Color.green(i10));
        float fM13334e3 = AbstractC7044b.m13334e(Color.blue(i10));
        float[][] fArr = AbstractC7044b.f34069d;
        float[] fArr2 = fArr[0];
        float f6 = (fArr2[2] * fM13334e3) + (fArr2[1] * fM13334e2) + (fArr2[0] * fM13334e);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * fM13334e3) + (fArr3[1] * fM13334e2) + (fArr3[0] * fM13334e);
        float[] fArr4 = fArr[2];
        float f11 = (fM13334e3 * fArr4[2]) + (fM13334e2 * fArr4[1]) + (fM13334e * fArr4[0]);
        float[][] fArr5 = AbstractC7044b.f34066a;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f6);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f6);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f6 * fArr8[0]);
        float[] fArr9 = c7053k.f34098g;
        float f15 = c7053k.f34100i;
        float f16 = c7053k.f34095d;
        float f17 = c7053k.f34092a;
        float f18 = fArr9[0] * f12;
        float f19 = fArr9[1] * f13;
        float f20 = fArr9[2] * f14;
        float f21 = c7053k.f34099h;
        float fPow = (float) Math.pow((Math.abs(f18) * f21) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f19) * f21) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f20) * f21) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float f22 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d2)) / 11.0f;
        float f23 = ((float) ((fSignum + fSignum2) - (d2 * 2.0d))) / 9.0f;
        float f24 = fSignum2 * 20.0f;
        float f25 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f24)) / 20.0f;
        float f26 = (((fSignum * 40.0f) + f24) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (fAtan2 < DefinitionKt.NO_Float_VALUE) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f27 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f26 * c7053k.f34093b) / f17, c7053k.f34101j * f16)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f28 = f17 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c7053k.f34097f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c7053k.f34096e) * c7053k.f34094c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        Math.sqrt((r0 * f16) / f28);
        float f29 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f15 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f27;
        return new C7043a(fAtan2, fPow5, fPow4, f29, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    /* renamed from: b */
    public static C7043a m13329b(float f6, float f10, float f11) {
        C7053k c7053k = C7053k.f34091k;
        float f12 = c7053k.f34095d;
        Math.sqrt(f6 / 100.0d);
        float f13 = c7053k.f34092a + 4.0f;
        float f14 = c7053k.f34100i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * c7053k.f34095d) / f13);
        float f15 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float fLog = ((float) Math.log((f14 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f11) / 180.0f;
        return new C7043a(f11, f10, f6, f15, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m13330c(t5.C7053k r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C7043a.m13330c(t5.k):int");
    }
}

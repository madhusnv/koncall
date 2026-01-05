package e3;

import com.skydoves.balloon.internals.DefinitionKt;
import d3.h0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.k */
/* loaded from: classes.dex */
public final class C1935k extends AbstractC1927c {

    /* renamed from: d */
    public final /* synthetic */ int f9141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1935k(String str, int i10, int i11, long j6) {
        super(str, i10, j6);
        this.f9141d = i11;
    }

    @Override // e3.AbstractC1927c
    /* renamed from: a */
    public final float mo5673a(int i10) {
        switch (this.f9141d) {
            case 0:
                return i10 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // e3.AbstractC1927c
    /* renamed from: b */
    public final float mo5674b(int i10) {
        switch (this.f9141d) {
            case 0:
                if (i10 == 0) {
                    return DefinitionKt.NO_Float_VALUE;
                }
                return -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // e3.AbstractC1927c
    /* renamed from: d */
    public final long mo5676d(float f6, float f10, float f11) {
        switch (this.f9141d) {
            case 0:
                if (f6 < DefinitionKt.NO_Float_VALUE) {
                    f6 = 0.0f;
                }
                if (f6 > 100.0f) {
                    f6 = 100.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                if (f10 > 128.0f) {
                    f10 = 128.0f;
                }
                float f12 = (f6 + 16.0f) / 116.0f;
                float f13 = (f10 * 0.002f) + f12;
                float f14 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
                float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
                float f16 = f14 * AbstractC1934j.f9140e[0];
                return (Float.floatToRawIntBits(f15 * r7[1]) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32);
            default:
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                if (f6 > 2.0f) {
                    f6 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f10 <= 2.0f ? f10 : 2.0f) & 4294967295L);
        }
    }

    @Override // e3.AbstractC1927c
    /* renamed from: e */
    public final float mo5677e(float f6, float f10, float f11) {
        switch (this.f9141d) {
            case 0:
                if (f6 < DefinitionKt.NO_Float_VALUE) {
                    f6 = 0.0f;
                }
                if (f6 > 100.0f) {
                    f6 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f12 = ((f6 + 16.0f) / 116.0f) - (f11 * 0.005f);
                return (f12 > 0.20689656f ? f12 * f12 * f12 : 0.12841855f * (f12 - 0.13793103f)) * AbstractC1934j.f9140e[2];
            default:
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    return 2.0f;
                }
                return f11;
        }
    }

    @Override // e3.AbstractC1927c
    /* renamed from: f */
    public final long mo5678f(float f6, float f10, float f11, float f12, AbstractC1927c abstractC1927c) {
        switch (this.f9141d) {
            case 0:
                float[] fArr = AbstractC1934j.f9140e;
                float f13 = f6 / fArr[0];
                float f14 = f10 / fArr[1];
                float f15 = f11 / fArr[2];
                float fCbrt = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
                float f16 = (116.0f * fCbrt2) - 16.0f;
                float f17 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f16 < DefinitionKt.NO_Float_VALUE) {
                    f16 = 0.0f;
                }
                if (f16 > 100.0f) {
                    f16 = 100.0f;
                }
                if (f17 < -128.0f) {
                    f17 = -128.0f;
                }
                if (f17 > 128.0f) {
                    f17 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return h0.m5130b(f16, f17, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f12, abstractC1927c);
            default:
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                if (f6 > 2.0f) {
                    f6 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                return h0.m5130b(f6, f10, f11 <= 2.0f ? f11 : 2.0f, f12, abstractC1927c);
        }
    }
}

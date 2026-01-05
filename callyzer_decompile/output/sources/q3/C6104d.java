package q3;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.imap.IMAPStore;
import kotlin.NoWhenBranchMatchedException;
import og.uc;
import s3.AbstractC6744a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q3.d */
/* loaded from: classes.dex */
public final class C6104d {

    /* renamed from: a */
    public final boolean f29802a;

    /* renamed from: b */
    public final EnumC6102b f29803b;

    /* renamed from: c */
    public final int f29804c;

    /* renamed from: d */
    public final C6101a[] f29805d;

    /* renamed from: e */
    public int f29806e;

    /* renamed from: f */
    public final float[] f29807f;

    /* renamed from: g */
    public final float[] f29808g;

    /* renamed from: h */
    public final float[] f29809h;

    public C6104d(boolean z6, EnumC6102b enumC6102b) {
        this.f29802a = z6;
        this.f29803b = enumC6102b;
        if (z6 && enumC6102b.equals(EnumC6102b.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = AbstractC6103c.f29801a[enumC6102b.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 3;
        }
        this.f29804c = i11;
        this.f29805d = new C6101a[20];
        this.f29807f = new float[20];
        this.f29808g = new float[20];
        this.f29809h = new float[3];
    }

    /* renamed from: a */
    public final void m12139a(float f6, long j6) {
        int i10 = (this.f29806e + 1) % 20;
        this.f29806e = i10;
        C6101a[] c6101aArr = this.f29805d;
        C6101a c6101a = c6101aArr[i10];
        if (c6101a != null) {
            c6101a.f29799a = j6;
            c6101a.f29800b = f6;
        } else {
            C6101a c6101a2 = new C6101a();
            c6101a2.f29799a = j6;
            c6101a2.f29800b = f6;
            c6101aArr[i10] = c6101a2;
        }
    }

    /* renamed from: b */
    public final float m12140b(float f6) {
        EnumC6102b enumC6102b;
        float[] fArr;
        float[] fArr2;
        float f10;
        boolean z6;
        int i10;
        float fSignum;
        float f11 = f6;
        float f12 = DefinitionKt.NO_Float_VALUE;
        if (f11 <= DefinitionKt.NO_Float_VALUE) {
            AbstractC6744a.m12907b("maximumVelocity should be a positive value. You specified=" + f11);
        }
        int i11 = this.f29806e;
        C6101a[] c6101aArr = this.f29805d;
        C6101a c6101a = c6101aArr[i11];
        if (c6101a == null) {
            f10 = 0.0f;
        } else {
            int i12 = 0;
            C6101a c6101a2 = c6101a;
            while (true) {
                C6101a c6101a3 = c6101aArr[i11];
                boolean z10 = this.f29802a;
                enumC6102b = this.f29803b;
                fArr = this.f29807f;
                fArr2 = this.f29808g;
                if (c6101a3 == null) {
                    f10 = f12;
                    z6 = z10;
                    i10 = 1;
                    break;
                }
                long j6 = c6101a.f29799a;
                f10 = f12;
                int i13 = i11;
                long j10 = c6101a3.f29799a;
                float f13 = j6 - j10;
                z6 = z10;
                i10 = 1;
                float fAbs = Math.abs(j10 - c6101a2.f29799a);
                c6101a2 = (enumC6102b == EnumC6102b.Lsq2 || z6) ? c6101a3 : c6101a;
                if (f13 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i12] = c6101a3.f29800b;
                fArr2[i12] = -f13;
                i11 = (i13 == 0 ? 20 : i13) - 1;
                i12++;
                if (i12 >= 20) {
                    break;
                }
                f12 = f10;
            }
            if (i12 >= this.f29804c) {
                int i14 = AbstractC6103c.f29801a[enumC6102b.ordinal()];
                if (i14 == i10) {
                    int i15 = i12 - i10;
                    float f14 = fArr2[i15];
                    int i16 = i15;
                    float fAbs2 = f10;
                    while (i16 > 0) {
                        int i17 = i16 - 1;
                        float f15 = fArr2[i17];
                        if (f14 != f15) {
                            float f16 = (z6 ? -fArr[i17] : fArr[i16] - fArr[i17]) / (f14 - f15);
                            fAbs2 += Math.abs(f16) * (f16 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i16 == i15) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i16--;
                        f14 = f15;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        float[] fArr3 = this.f29809h;
                        uc.m10974d(fArr2, fArr, i12, fArr3);
                        fSignum = fArr3[i10];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f10;
                    }
                }
                f12 = fSignum * IMAPStore.RESPONSE;
            } else {
                f12 = f10;
            }
        }
        if (f12 == f10 || Float.isNaN(f12)) {
            return f10;
        }
        if (f12 <= f10) {
            f11 = -f11;
            if (f12 >= f11) {
                return f12;
            }
        } else if (f12 <= f11) {
            f11 = f12;
        }
        return f11;
    }

    public C6104d() {
        this(true, EnumC6102b.Impulse);
    }
}

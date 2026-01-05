package e3;

import com.skydoves.balloon.internals.DefinitionKt;
import d3.h0;
import d6.C1612b;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.q */
/* loaded from: classes.dex */
public final class C1941q extends AbstractC1927c {

    /* renamed from: r */
    public static final C1612b f9154r = new C1612b(20);

    /* renamed from: d */
    public final C1943s f9155d;

    /* renamed from: e */
    public final float f9156e;

    /* renamed from: f */
    public final float f9157f;

    /* renamed from: g */
    public final C1942r f9158g;

    /* renamed from: h */
    public final float[] f9159h;

    /* renamed from: i */
    public final float[] f9160i;

    /* renamed from: j */
    public final float[] f9161j;

    /* renamed from: k */
    public final InterfaceC1933i f9162k;

    /* renamed from: l */
    public final C1940p f9163l;

    /* renamed from: m */
    public final C1937m f9164m;

    /* renamed from: n */
    public final InterfaceC1933i f9165n;

    /* renamed from: o */
    public final C1940p f9166o;

    /* renamed from: p */
    public final C1937m f9167p;

    /* renamed from: q */
    public final boolean f9168q;

    public C1941q(String str, float[] fArr, C1943s c1943s, final C1942r c1942r, int i10) {
        InterfaceC1933i interfaceC1933i;
        InterfaceC1933i interfaceC1933i2;
        double d2 = c1942r.f9169a;
        boolean z6 = d2 == -3.0d;
        double d10 = c1942r.f9175g;
        double d11 = c1942r.f9174f;
        if (z6) {
            final int i11 = 4;
            interfaceC1933i = new InterfaceC1933i() { // from class: e3.o
                @Override // e3.InterfaceC1933i
                /* renamed from: a */
                public final double mo5263a(double d12) {
                    int i12 = i11;
                    C1942r c1942r2 = c1942r;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = C1928d.f9103a;
                            return C1928d.m5679a(c1942r2, d12);
                        case 1:
                            float[] fArr3 = C1928d.f9103a;
                            return C1928d.m5681c(c1942r2, d12);
                        case 2:
                            double d13 = c1942r2.f9170b;
                            return d12 >= c1942r2.f9173e ? Math.pow((d13 * d12) + c1942r2.f9171c, c1942r2.f9169a) : d12 * c1942r2.f9172d;
                        case 3:
                            double d14 = c1942r2.f9170b;
                            double d15 = c1942r2.f9171c;
                            double d16 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e ? Math.pow((d14 * d12) + d15, c1942r2.f9169a) + c1942r2.f9174f : (d16 * d12) + c1942r2.f9175g;
                        case 4:
                            float[] fArr4 = C1928d.f9103a;
                            return C1928d.m5680b(c1942r2, d12);
                        case 5:
                            float[] fArr5 = C1928d.f9103a;
                            return C1928d.m5682d(c1942r2, d12);
                        case 6:
                            double d17 = c1942r2.f9170b;
                            double d18 = c1942r2.f9171c;
                            double d19 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d19 ? (Math.pow(d12, 1.0d / c1942r2.f9169a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = c1942r2.f9170b;
                            double d21 = c1942r2.f9171c;
                            double d22 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d22 ? (Math.pow(d12 - c1942r2.f9174f, 1.0d / c1942r2.f9169a) - d21) / d20 : (d12 - c1942r2.f9175g) / d22;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            final int i12 = 5;
            interfaceC1933i = new InterfaceC1933i() { // from class: e3.o
                @Override // e3.InterfaceC1933i
                /* renamed from: a */
                public final double mo5263a(double d12) {
                    int i122 = i12;
                    C1942r c1942r2 = c1942r;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = C1928d.f9103a;
                            return C1928d.m5679a(c1942r2, d12);
                        case 1:
                            float[] fArr3 = C1928d.f9103a;
                            return C1928d.m5681c(c1942r2, d12);
                        case 2:
                            double d13 = c1942r2.f9170b;
                            return d12 >= c1942r2.f9173e ? Math.pow((d13 * d12) + c1942r2.f9171c, c1942r2.f9169a) : d12 * c1942r2.f9172d;
                        case 3:
                            double d14 = c1942r2.f9170b;
                            double d15 = c1942r2.f9171c;
                            double d16 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e ? Math.pow((d14 * d12) + d15, c1942r2.f9169a) + c1942r2.f9174f : (d16 * d12) + c1942r2.f9175g;
                        case 4:
                            float[] fArr4 = C1928d.f9103a;
                            return C1928d.m5680b(c1942r2, d12);
                        case 5:
                            float[] fArr5 = C1928d.f9103a;
                            return C1928d.m5682d(c1942r2, d12);
                        case 6:
                            double d17 = c1942r2.f9170b;
                            double d18 = c1942r2.f9171c;
                            double d19 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d19 ? (Math.pow(d12, 1.0d / c1942r2.f9169a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = c1942r2.f9170b;
                            double d21 = c1942r2.f9171c;
                            double d22 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d22 ? (Math.pow(d12 - c1942r2.f9174f, 1.0d / c1942r2.f9169a) - d21) / d20 : (d12 - c1942r2.f9175g) / d22;
                    }
                }
            };
        } else if (d11 == 0.0d && d10 == 0.0d) {
            final int i13 = 6;
            interfaceC1933i = new InterfaceC1933i() { // from class: e3.o
                @Override // e3.InterfaceC1933i
                /* renamed from: a */
                public final double mo5263a(double d12) {
                    int i122 = i13;
                    C1942r c1942r2 = c1942r;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = C1928d.f9103a;
                            return C1928d.m5679a(c1942r2, d12);
                        case 1:
                            float[] fArr3 = C1928d.f9103a;
                            return C1928d.m5681c(c1942r2, d12);
                        case 2:
                            double d13 = c1942r2.f9170b;
                            return d12 >= c1942r2.f9173e ? Math.pow((d13 * d12) + c1942r2.f9171c, c1942r2.f9169a) : d12 * c1942r2.f9172d;
                        case 3:
                            double d14 = c1942r2.f9170b;
                            double d15 = c1942r2.f9171c;
                            double d16 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e ? Math.pow((d14 * d12) + d15, c1942r2.f9169a) + c1942r2.f9174f : (d16 * d12) + c1942r2.f9175g;
                        case 4:
                            float[] fArr4 = C1928d.f9103a;
                            return C1928d.m5680b(c1942r2, d12);
                        case 5:
                            float[] fArr5 = C1928d.f9103a;
                            return C1928d.m5682d(c1942r2, d12);
                        case 6:
                            double d17 = c1942r2.f9170b;
                            double d18 = c1942r2.f9171c;
                            double d19 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d19 ? (Math.pow(d12, 1.0d / c1942r2.f9169a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = c1942r2.f9170b;
                            double d21 = c1942r2.f9171c;
                            double d22 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d22 ? (Math.pow(d12 - c1942r2.f9174f, 1.0d / c1942r2.f9169a) - d21) / d20 : (d12 - c1942r2.f9175g) / d22;
                    }
                }
            };
        } else {
            final int i14 = 7;
            interfaceC1933i = new InterfaceC1933i() { // from class: e3.o
                @Override // e3.InterfaceC1933i
                /* renamed from: a */
                public final double mo5263a(double d12) {
                    int i122 = i14;
                    C1942r c1942r2 = c1942r;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = C1928d.f9103a;
                            return C1928d.m5679a(c1942r2, d12);
                        case 1:
                            float[] fArr3 = C1928d.f9103a;
                            return C1928d.m5681c(c1942r2, d12);
                        case 2:
                            double d13 = c1942r2.f9170b;
                            return d12 >= c1942r2.f9173e ? Math.pow((d13 * d12) + c1942r2.f9171c, c1942r2.f9169a) : d12 * c1942r2.f9172d;
                        case 3:
                            double d14 = c1942r2.f9170b;
                            double d15 = c1942r2.f9171c;
                            double d16 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e ? Math.pow((d14 * d12) + d15, c1942r2.f9169a) + c1942r2.f9174f : (d16 * d12) + c1942r2.f9175g;
                        case 4:
                            float[] fArr4 = C1928d.f9103a;
                            return C1928d.m5680b(c1942r2, d12);
                        case 5:
                            float[] fArr5 = C1928d.f9103a;
                            return C1928d.m5682d(c1942r2, d12);
                        case 6:
                            double d17 = c1942r2.f9170b;
                            double d18 = c1942r2.f9171c;
                            double d19 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d19 ? (Math.pow(d12, 1.0d / c1942r2.f9169a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = c1942r2.f9170b;
                            double d21 = c1942r2.f9171c;
                            double d22 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d22 ? (Math.pow(d12 - c1942r2.f9174f, 1.0d / c1942r2.f9169a) - d21) / d20 : (d12 - c1942r2.f9175g) / d22;
                    }
                }
            };
        }
        if (d2 == -3.0d) {
            final int i15 = 0;
            interfaceC1933i2 = new InterfaceC1933i() { // from class: e3.o
                @Override // e3.InterfaceC1933i
                /* renamed from: a */
                public final double mo5263a(double d12) {
                    int i122 = i15;
                    C1942r c1942r2 = c1942r;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = C1928d.f9103a;
                            return C1928d.m5679a(c1942r2, d12);
                        case 1:
                            float[] fArr3 = C1928d.f9103a;
                            return C1928d.m5681c(c1942r2, d12);
                        case 2:
                            double d13 = c1942r2.f9170b;
                            return d12 >= c1942r2.f9173e ? Math.pow((d13 * d12) + c1942r2.f9171c, c1942r2.f9169a) : d12 * c1942r2.f9172d;
                        case 3:
                            double d14 = c1942r2.f9170b;
                            double d15 = c1942r2.f9171c;
                            double d16 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e ? Math.pow((d14 * d12) + d15, c1942r2.f9169a) + c1942r2.f9174f : (d16 * d12) + c1942r2.f9175g;
                        case 4:
                            float[] fArr4 = C1928d.f9103a;
                            return C1928d.m5680b(c1942r2, d12);
                        case 5:
                            float[] fArr5 = C1928d.f9103a;
                            return C1928d.m5682d(c1942r2, d12);
                        case 6:
                            double d17 = c1942r2.f9170b;
                            double d18 = c1942r2.f9171c;
                            double d19 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d19 ? (Math.pow(d12, 1.0d / c1942r2.f9169a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = c1942r2.f9170b;
                            double d21 = c1942r2.f9171c;
                            double d22 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d22 ? (Math.pow(d12 - c1942r2.f9174f, 1.0d / c1942r2.f9169a) - d21) / d20 : (d12 - c1942r2.f9175g) / d22;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            final int i16 = 1;
            interfaceC1933i2 = new InterfaceC1933i() { // from class: e3.o
                @Override // e3.InterfaceC1933i
                /* renamed from: a */
                public final double mo5263a(double d12) {
                    int i122 = i16;
                    C1942r c1942r2 = c1942r;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = C1928d.f9103a;
                            return C1928d.m5679a(c1942r2, d12);
                        case 1:
                            float[] fArr3 = C1928d.f9103a;
                            return C1928d.m5681c(c1942r2, d12);
                        case 2:
                            double d13 = c1942r2.f9170b;
                            return d12 >= c1942r2.f9173e ? Math.pow((d13 * d12) + c1942r2.f9171c, c1942r2.f9169a) : d12 * c1942r2.f9172d;
                        case 3:
                            double d14 = c1942r2.f9170b;
                            double d15 = c1942r2.f9171c;
                            double d16 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e ? Math.pow((d14 * d12) + d15, c1942r2.f9169a) + c1942r2.f9174f : (d16 * d12) + c1942r2.f9175g;
                        case 4:
                            float[] fArr4 = C1928d.f9103a;
                            return C1928d.m5680b(c1942r2, d12);
                        case 5:
                            float[] fArr5 = C1928d.f9103a;
                            return C1928d.m5682d(c1942r2, d12);
                        case 6:
                            double d17 = c1942r2.f9170b;
                            double d18 = c1942r2.f9171c;
                            double d19 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d19 ? (Math.pow(d12, 1.0d / c1942r2.f9169a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = c1942r2.f9170b;
                            double d21 = c1942r2.f9171c;
                            double d22 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d22 ? (Math.pow(d12 - c1942r2.f9174f, 1.0d / c1942r2.f9169a) - d21) / d20 : (d12 - c1942r2.f9175g) / d22;
                    }
                }
            };
        } else if (d11 == 0.0d && d10 == 0.0d) {
            final int i17 = 2;
            interfaceC1933i2 = new InterfaceC1933i() { // from class: e3.o
                @Override // e3.InterfaceC1933i
                /* renamed from: a */
                public final double mo5263a(double d12) {
                    int i122 = i17;
                    C1942r c1942r2 = c1942r;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = C1928d.f9103a;
                            return C1928d.m5679a(c1942r2, d12);
                        case 1:
                            float[] fArr3 = C1928d.f9103a;
                            return C1928d.m5681c(c1942r2, d12);
                        case 2:
                            double d13 = c1942r2.f9170b;
                            return d12 >= c1942r2.f9173e ? Math.pow((d13 * d12) + c1942r2.f9171c, c1942r2.f9169a) : d12 * c1942r2.f9172d;
                        case 3:
                            double d14 = c1942r2.f9170b;
                            double d15 = c1942r2.f9171c;
                            double d16 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e ? Math.pow((d14 * d12) + d15, c1942r2.f9169a) + c1942r2.f9174f : (d16 * d12) + c1942r2.f9175g;
                        case 4:
                            float[] fArr4 = C1928d.f9103a;
                            return C1928d.m5680b(c1942r2, d12);
                        case 5:
                            float[] fArr5 = C1928d.f9103a;
                            return C1928d.m5682d(c1942r2, d12);
                        case 6:
                            double d17 = c1942r2.f9170b;
                            double d18 = c1942r2.f9171c;
                            double d19 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d19 ? (Math.pow(d12, 1.0d / c1942r2.f9169a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = c1942r2.f9170b;
                            double d21 = c1942r2.f9171c;
                            double d22 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d22 ? (Math.pow(d12 - c1942r2.f9174f, 1.0d / c1942r2.f9169a) - d21) / d20 : (d12 - c1942r2.f9175g) / d22;
                    }
                }
            };
        } else {
            final int i18 = 3;
            interfaceC1933i2 = new InterfaceC1933i() { // from class: e3.o
                @Override // e3.InterfaceC1933i
                /* renamed from: a */
                public final double mo5263a(double d12) {
                    int i122 = i18;
                    C1942r c1942r2 = c1942r;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = C1928d.f9103a;
                            return C1928d.m5679a(c1942r2, d12);
                        case 1:
                            float[] fArr3 = C1928d.f9103a;
                            return C1928d.m5681c(c1942r2, d12);
                        case 2:
                            double d13 = c1942r2.f9170b;
                            return d12 >= c1942r2.f9173e ? Math.pow((d13 * d12) + c1942r2.f9171c, c1942r2.f9169a) : d12 * c1942r2.f9172d;
                        case 3:
                            double d14 = c1942r2.f9170b;
                            double d15 = c1942r2.f9171c;
                            double d16 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e ? Math.pow((d14 * d12) + d15, c1942r2.f9169a) + c1942r2.f9174f : (d16 * d12) + c1942r2.f9175g;
                        case 4:
                            float[] fArr4 = C1928d.f9103a;
                            return C1928d.m5680b(c1942r2, d12);
                        case 5:
                            float[] fArr5 = C1928d.f9103a;
                            return C1928d.m5682d(c1942r2, d12);
                        case 6:
                            double d17 = c1942r2.f9170b;
                            double d18 = c1942r2.f9171c;
                            double d19 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d19 ? (Math.pow(d12, 1.0d / c1942r2.f9169a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = c1942r2.f9170b;
                            double d21 = c1942r2.f9171c;
                            double d22 = c1942r2.f9172d;
                            return d12 >= c1942r2.f9173e * d22 ? (Math.pow(d12 - c1942r2.f9174f, 1.0d / c1942r2.f9169a) - d21) / d20 : (d12 - c1942r2.f9175g) / d22;
                    }
                }
            };
        }
        this(str, fArr, c1943s, null, interfaceC1933i, interfaceC1933i2, DefinitionKt.NO_Float_VALUE, 1.0f, c1942r, i10);
    }

    @Override // e3.AbstractC1927c
    /* renamed from: a */
    public final float mo5673a(int i10) {
        return this.f9157f;
    }

    @Override // e3.AbstractC1927c
    /* renamed from: b */
    public final float mo5674b(int i10) {
        return this.f9156e;
    }

    @Override // e3.AbstractC1927c
    /* renamed from: c */
    public final boolean mo5675c() {
        return this.f9168q;
    }

    @Override // e3.AbstractC1927c
    /* renamed from: d */
    public final long mo5676d(float f6, float f10, float f11) {
        double d2 = f6;
        C1937m c1937m = this.f9167p;
        float fMo5263a = (float) c1937m.mo5263a(d2);
        float fMo5263a2 = (float) c1937m.mo5263a(f10);
        float fMo5263a3 = (float) c1937m.mo5263a(f11);
        float[] fArr = this.f9160i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f12 = (fArr[6] * fMo5263a3) + (fArr[3] * fMo5263a2) + (fArr[0] * fMo5263a);
        float f13 = (fArr[7] * fMo5263a3) + (fArr[4] * fMo5263a2) + (fArr[1] * fMo5263a);
        return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    @Override // e3.AbstractC1927c
    /* renamed from: e */
    public final float mo5677e(float f6, float f10, float f11) {
        double d2 = f6;
        C1937m c1937m = this.f9167p;
        float fMo5263a = (float) c1937m.mo5263a(d2);
        float fMo5263a2 = (float) c1937m.mo5263a(f10);
        float fMo5263a3 = (float) c1937m.mo5263a(f11);
        float[] fArr = this.f9160i;
        return (fArr[8] * fMo5263a3) + (fArr[5] * fMo5263a2) + (fArr[2] * fMo5263a);
    }

    @Override // e3.AbstractC1927c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1941q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1941q c1941q = (C1941q) obj;
        C1942r c1942r = c1941q.f9158g;
        if (Float.compare(c1941q.f9156e, this.f9156e) != 0 || Float.compare(c1941q.f9157f, this.f9157f) != 0 || !AbstractC4154l.m8918a(this.f9155d, c1941q.f9155d) || !Arrays.equals(this.f9159h, c1941q.f9159h)) {
            return false;
        }
        C1942r c1942r2 = this.f9158g;
        if (c1942r2 != null) {
            return AbstractC4154l.m8918a(c1942r2, c1942r);
        }
        if (c1942r == null) {
            return true;
        }
        if (AbstractC4154l.m8918a(this.f9162k, c1941q.f9162k)) {
            return AbstractC4154l.m8918a(this.f9165n, c1941q.f9165n);
        }
        return false;
    }

    @Override // e3.AbstractC1927c
    /* renamed from: f */
    public final long mo5678f(float f6, float f10, float f11, float f12, AbstractC1927c abstractC1927c) {
        float[] fArr = this.f9161j;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f6);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f6);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f6);
        C1937m c1937m = this.f9164m;
        return h0.m5130b((float) c1937m.mo5263a(f13), (float) c1937m.mo5263a(f14), (float) c1937m.mo5263a(f15), f12, abstractC1927c);
    }

    @Override // e3.AbstractC1927c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f9159h) + ((this.f9155d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f6 = this.f9156e;
        int iFloatToIntBits = (iHashCode + (f6 == DefinitionKt.NO_Float_VALUE ? 0 : Float.floatToIntBits(f6))) * 31;
        float f10 = this.f9157f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f10 == DefinitionKt.NO_Float_VALUE ? 0 : Float.floatToIntBits(f10))) * 31;
        C1942r c1942r = this.f9158g;
        int iHashCode2 = iFloatToIntBits2 + (c1942r != null ? c1942r.hashCode() : 0);
        if (c1942r == null) {
            return this.f9165n.hashCode() + ((this.f9162k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0263 A[EDGE_INSN: B:68:0x0263->B:69:0x0265 BREAK  A[LOOP:1: B:61:0x022b->B:67:0x025c], EDGE_INSN: B:75:0x0263->B:68:0x0263 BREAK  A[LOOP:0: B:46:0x01f4->B:52:0x0211]] */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1941q(java.lang.String r33, float[] r34, e3.C1943s r35, float[] r36, e3.InterfaceC1933i r37, e3.InterfaceC1933i r38, float r39, float r40, e3.C1942r r41, int r42) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.C1941q.<init>(java.lang.String, float[], e3.s, float[], e3.i, e3.i, float, float, e3.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1941q(String str, float[] fArr, C1943s c1943s, final double d2, float f6, float f10, int i10) {
        InterfaceC1933i interfaceC1933i;
        InterfaceC1933i interfaceC1933i2 = f9154r;
        if (d2 == 1.0d) {
            interfaceC1933i = interfaceC1933i2;
        } else {
            final int i11 = 0;
            interfaceC1933i = new InterfaceC1933i() { // from class: e3.n
                @Override // e3.InterfaceC1933i
                /* renamed from: a */
                public final double mo5263a(double d10) {
                    switch (i11) {
                        case 0:
                            if (d10 < 0.0d) {
                                d10 = 0.0d;
                            }
                            return Math.pow(d10, 1.0d / d2);
                        default:
                            if (d10 < 0.0d) {
                                d10 = 0.0d;
                            }
                            return Math.pow(d10, d2);
                    }
                }
            };
        }
        if (d2 != 1.0d) {
            final int i12 = 1;
            interfaceC1933i2 = new InterfaceC1933i() { // from class: e3.n
                @Override // e3.InterfaceC1933i
                /* renamed from: a */
                public final double mo5263a(double d10) {
                    switch (i12) {
                        case 0:
                            if (d10 < 0.0d) {
                                d10 = 0.0d;
                            }
                            return Math.pow(d10, 1.0d / d2);
                        default:
                            if (d10 < 0.0d) {
                                d10 = 0.0d;
                            }
                            return Math.pow(d10, d2);
                    }
                }
            };
        }
        this(str, fArr, c1943s, null, interfaceC1933i, interfaceC1933i2, f6, f10, new C1942r(d2, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }
}

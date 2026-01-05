package d3;

import c3.C0846a;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5179q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a */
    public final float[] f7732a;

    public /* synthetic */ b0(float[] fArr) {
        this.f7732a = fArr;
    }

    /* renamed from: a */
    public static float[] m5094a() {
        return new float[]{1.0f, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1.0f, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1.0f, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1.0f};
    }

    /* renamed from: b */
    public static final long m5095b(long j6, float[] fArr) {
        if (fArr.length < 16) {
            return j6;
        }
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[7];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        float f18 = 1 / (((f14 * fIntBitsToFloat2) + (f11 * fIntBitsToFloat)) + f17);
        if ((Float.floatToRawIntBits(f18) & Integer.MAX_VALUE) >= 2139095040) {
            f18 = DefinitionKt.NO_Float_VALUE;
        }
        float f19 = f13 * fIntBitsToFloat2;
        return (Float.floatToRawIntBits((((f12 * fIntBitsToFloat2) + (f6 * fIntBitsToFloat)) + f15) * f18) << 32) | (Float.floatToRawIntBits((f19 + (f10 * fIntBitsToFloat) + f16) * f18) & 4294967295L);
    }

    /* renamed from: c */
    public static final void m5096c(float[] fArr, C0846a c0846a) {
        if (fArr.length < 16) {
            return;
        }
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[7];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        float f18 = c0846a.f5348b;
        float f19 = c0846a.f5349c;
        float f20 = c0846a.f5350d;
        float f21 = c0846a.f5351e;
        float f22 = f11 * f18;
        float f23 = f14 * f19;
        float f24 = 1.0f / ((f22 + f23) + f17);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f24) & Integer.MAX_VALUE;
        float f25 = DefinitionKt.NO_Float_VALUE;
        if (iFloatToRawIntBits >= 2139095040) {
            f24 = 0.0f;
        }
        float f26 = f6 * f18;
        float f27 = f12 * f19;
        float f28 = (f26 + f27 + f15) * f24;
        float f29 = f18 * f10;
        float f30 = f19 * f13;
        float f31 = (f29 + f30 + f16) * f24;
        float f32 = f14 * f21;
        float f33 = 1.0f / ((f22 + f32) + f17);
        if ((Float.floatToRawIntBits(f33) & Integer.MAX_VALUE) >= 2139095040) {
            f33 = 0.0f;
        }
        float f34 = f12 * f21;
        float f35 = (f26 + f34 + f15) * f33;
        float f36 = f13 * f21;
        float f37 = (f29 + f36 + f16) * f33;
        float f38 = f11 * f20;
        float f39 = 1.0f / ((f23 + f38) + f17);
        if ((Float.floatToRawIntBits(f39) & Integer.MAX_VALUE) >= 2139095040) {
            f39 = 0.0f;
        }
        float f40 = f6 * f20;
        float f41 = (f40 + f27 + f15) * f39;
        float f42 = f20 * f10;
        float f43 = (f30 + f42 + f16) * f39;
        float f44 = 1.0f / ((f38 + f32) + f17);
        if ((Float.floatToRawIntBits(f44) & Integer.MAX_VALUE) < 2139095040) {
            f25 = f44;
        }
        float f45 = (f40 + f34 + f15) * f25;
        float f46 = (f42 + f36 + f16) * f25;
        c0846a.f5348b = Math.min(f28, Math.min(f35, Math.min(f41, f45)));
        c0846a.f5349c = Math.min(f31, Math.min(f37, Math.min(f43, f46)));
        c0846a.f5350d = Math.max(f28, Math.max(f35, Math.max(f41, f45)));
        c0846a.f5351e = Math.max(f31, Math.max(f37, Math.max(f43, f46)));
    }

    /* renamed from: d */
    public static final void m5097d(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* renamed from: e */
    public static final void m5098e(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f6 = fArr[0];
            float f10 = fArr2[0];
            float f11 = fArr[1];
            float f12 = fArr2[4];
            float f13 = fArr[2];
            float f14 = fArr2[8];
            float f15 = f13 * f14;
            float f16 = fArr[3];
            float f17 = fArr2[12];
            float f18 = f16 * f17;
            float f19 = f18 + f15 + (f11 * f12) + (f6 * f10);
            float f20 = fArr2[1];
            float f21 = fArr2[5];
            float f22 = fArr2[9];
            float f23 = f13 * f22;
            float f24 = fArr2[13];
            float f25 = f16 * f24;
            float f26 = f25 + f23 + (f11 * f21) + (f6 * f20);
            float f27 = fArr2[2];
            float f28 = fArr2[6];
            float f29 = fArr2[10];
            float f30 = f13 * f29;
            float f31 = fArr2[14];
            float f32 = f16 * f31;
            float f33 = f32 + f30 + (f11 * f28) + (f6 * f27);
            float f34 = fArr2[3];
            float f35 = fArr2[7];
            float f36 = fArr2[11];
            float f37 = f13 * f36;
            float f38 = fArr2[15];
            float f39 = f16 * f38;
            float f40 = f39 + f37 + (f11 * f35) + (f6 * f34);
            float f41 = fArr[4];
            float f42 = fArr[5];
            float f43 = fArr[6];
            float f44 = (f43 * f14) + (f42 * f12) + (f41 * f10);
            float f45 = fArr[7];
            float f46 = (f45 * f17) + f44;
            float f47 = (f45 * f24) + (f43 * f22) + (f42 * f21) + (f41 * f20);
            float f48 = (f45 * f31) + (f43 * f29) + (f42 * f28) + (f41 * f27);
            float f49 = f43 * f36;
            float f50 = f45 * f38;
            float f51 = f50 + f49 + (f42 * f35) + (f41 * f34);
            float f52 = fArr[8];
            float f53 = fArr[9];
            float f54 = fArr[10];
            float f55 = (f54 * f14) + (f53 * f12) + (f52 * f10);
            float f56 = fArr[11];
            float f57 = (f56 * f17) + f55;
            float f58 = (f56 * f24) + (f54 * f22) + (f53 * f21) + (f52 * f20);
            float f59 = (f56 * f31) + (f54 * f29) + (f53 * f28) + (f52 * f27);
            float f60 = f54 * f36;
            float f61 = f56 * f38;
            float f62 = f61 + f60 + (f53 * f35) + (f52 * f34);
            float f63 = fArr[12];
            float f64 = fArr[13];
            float f65 = (f12 * f64) + (f10 * f63);
            float f66 = fArr[14];
            float f67 = (f14 * f66) + f65;
            float f68 = fArr[15];
            float f69 = (f17 * f68) + f67;
            float f70 = f22 * f66;
            float f71 = f24 * f68;
            float f72 = f71 + f70 + (f21 * f64) + (f20 * f63);
            float f73 = f29 * f66;
            float f74 = f31 * f68;
            float f75 = f74 + f73 + (f28 * f64) + (f27 * f63);
            float f76 = f66 * f36;
            float f77 = f68 * f38;
            fArr[0] = f19;
            fArr[1] = f26;
            fArr[2] = f33;
            fArr[3] = f40;
            fArr[4] = f46;
            fArr[5] = f47;
            fArr[6] = f48;
            fArr[7] = f51;
            fArr[8] = f57;
            fArr[9] = f58;
            fArr[10] = f59;
            fArr[11] = f62;
            fArr[12] = f69;
            fArr[13] = f72;
            fArr[14] = f75;
            fArr[15] = f77 + f76 + (f64 * f35) + (f63 * f34);
        }
    }

    /* renamed from: f */
    public static final void m5099f(float[] fArr, float f6, float f10) {
        if (fArr.length < 16) {
            return;
        }
        float f11 = (fArr[8] * DefinitionKt.NO_Float_VALUE) + (fArr[4] * f10) + (fArr[0] * f6) + fArr[12];
        float f12 = (fArr[9] * DefinitionKt.NO_Float_VALUE) + (fArr[5] * f10) + (fArr[1] * f6) + fArr[13];
        float f13 = (fArr[10] * DefinitionKt.NO_Float_VALUE) + (fArr[6] * f10) + (fArr[2] * f6) + fArr[14];
        float f14 = (fArr[11] * DefinitionKt.NO_Float_VALUE) + (fArr[7] * f10) + (fArr[3] * f6) + fArr[15];
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        fArr[15] = f14;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return AbstractC4154l.m8918a(this.f7732a, ((b0) obj).f7732a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7732a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |");
        float[] fArr = this.f7732a;
        sb2.append(fArr[0]);
        sb2.append(' ');
        sb2.append(fArr[1]);
        sb2.append(' ');
        sb2.append(fArr[2]);
        sb2.append(' ');
        sb2.append(fArr[3]);
        sb2.append("|\n            |");
        sb2.append(fArr[4]);
        sb2.append(' ');
        sb2.append(fArr[5]);
        sb2.append(' ');
        sb2.append(fArr[6]);
        sb2.append(' ');
        sb2.append(fArr[7]);
        sb2.append("|\n            |");
        sb2.append(fArr[8]);
        sb2.append(' ');
        sb2.append(fArr[9]);
        sb2.append(' ');
        sb2.append(fArr[10]);
        sb2.append(' ');
        sb2.append(fArr[11]);
        sb2.append("|\n            |");
        sb2.append(fArr[12]);
        sb2.append(' ');
        sb2.append(fArr[13]);
        sb2.append(' ');
        sb2.append(fArr[14]);
        sb2.append(' ');
        sb2.append(fArr[15]);
        sb2.append("|\n        ");
        return AbstractC5179q.m10122d(sb2.toString());
    }
}

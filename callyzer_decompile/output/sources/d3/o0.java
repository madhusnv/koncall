package d3;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import og.d2;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 extends j0 {

    /* renamed from: c */
    public final long f7802c;

    /* renamed from: d */
    public final List f7803d;

    public o0(long j6, List list) {
        this.f7802c = j6;
        this.f7803d = list;
    }

    @Override // d3.j0
    /* renamed from: b */
    public final Shader mo5177b(long j6) {
        long jFloatToRawIntBits;
        int i10;
        int[] iArr;
        int i11;
        float[] fArr;
        long j10 = this.f7802c;
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            jFloatToRawIntBits = d2.m10602e(j6);
        } else {
            int i12 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
                i12 = (int) (j6 >> 32);
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i12);
            int i13 = (int) (j10 & 4294967295L);
            if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
                i13 = (int) (j6 & 4294967295L);
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat(i13);
            jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        List list = this.f7803d;
        if (list.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
        int i14 = 1;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 0;
        } else {
            int iM10832g = pe.m10832g(list);
            i10 = 0;
            for (int i15 = 1; i15 < iM10832g; i15++) {
                if (C1565s.m5188d(((C1565s) list.get(i15)).f7819a) == DefinitionKt.NO_Float_VALUE) {
                    i10++;
                }
            }
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            iArr = new int[size];
            for (int i16 = 0; i16 < size; i16++) {
                iArr[i16] = h0.m5149u(((C1565s) list.get(i16)).f7819a);
            }
        } else {
            iArr = new int[list.size() + i10];
            int iM10832g2 = pe.m10832g(list);
            int size2 = list.size();
            int i17 = 0;
            int i18 = 0;
            while (i17 < size2) {
                long j11 = ((C1565s) list.get(i17)).f7819a;
                if (C1565s.m5188d(j11) == DefinitionKt.NO_Float_VALUE) {
                    if (i17 == 0) {
                        i11 = i18 + 1;
                        iArr[i18] = h0.m5149u(C1565s.m5186b(DefinitionKt.NO_Float_VALUE, 14, ((C1565s) list.get(i14)).f7819a));
                    } else {
                        int i19 = i18;
                        if (i17 == iM10832g2) {
                            i18 = i19 + 1;
                            iArr[i19] = h0.m5149u(C1565s.m5186b(DefinitionKt.NO_Float_VALUE, 14, ((C1565s) list.get(i17 - 1)).f7819a));
                        } else {
                            iArr[i19] = h0.m5149u(C1565s.m5186b(DefinitionKt.NO_Float_VALUE, 14, ((C1565s) list.get(i17 - 1)).f7819a));
                            i11 = i19 + 2;
                            iArr[i19 + 1] = h0.m5149u(C1565s.m5186b(DefinitionKt.NO_Float_VALUE, 14, ((C1565s) list.get(i17 + 1)).f7819a));
                        }
                    }
                    i18 = i11;
                } else {
                    int i20 = i18;
                    i18 = i20 + 1;
                    iArr[i20] = h0.m5149u(j11);
                }
                i17++;
                i14 = 1;
            }
        }
        if (i10 == 0) {
            fArr = null;
        } else {
            fArr = new float[list.size() + i10];
            fArr[0] = 0.0f;
            int iM10832g3 = pe.m10832g(list);
            int i21 = 1;
            for (int i22 = 1; i22 < iM10832g3; i22++) {
                long j12 = ((C1565s) list.get(i22)).f7819a;
                float fM10832g = i22 / pe.m10832g(list);
                int i23 = i21 + 1;
                fArr[i21] = fM10832g;
                if (C1565s.m5188d(j12) == DefinitionKt.NO_Float_VALUE) {
                    i21 += 2;
                    fArr[i23] = fM10832g;
                } else {
                    i21 = i23;
                }
            }
            fArr[i21] = 1.0f;
        }
        return new SweepGradient(fIntBitsToFloat3, fIntBitsToFloat4, iArr, fArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return C0847b.m2271b(this.f7802c, o0Var.f7802c) && this.f7803d.equals(o0Var.f7803d);
    }

    public final int hashCode() {
        return AbstractC1452a.m4559f(this.f7803d, Long.hashCode(this.f7802c) * 31, 31);
    }

    public final String toString() {
        String str;
        long j6 = this.f7802c;
        if ((9223372034707292159L & j6) != 9205357640488583168L) {
            str = "center=" + ((Object) C0847b.m2278i(j6)) + ", ";
        } else {
            str = "";
        }
        return AbstractC5601a.m11240k(", stops=null)", i0.m0.m7383p("SweepGradient(", str, "colors="), this.f7803d);
    }
}

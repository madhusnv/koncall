package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes3.dex */
public abstract class e4e {

    /* renamed from: o.e4e$a */
    public static final class C13099a implements Comparable {

        /* renamed from: a */
        public int f20962a = -1;

        /* renamed from: b */
        public double f20963b = -1.0d;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C13099a c13099a) {
            return Double.valueOf(this.f20963b).compareTo(Double.valueOf(c13099a.f20963b));
        }
    }

    /* renamed from: a */
    public static Map m24298a(int[] iArr, int[] iArr2, int i) {
        int[] iArr3;
        int i2;
        int i3;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length][];
        int[] iArr4 = new int[iArr.length];
        icd icdVar = new icd();
        int i4 = 0;
        for (int i5 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i5));
            if (num == null) {
                dArr[i4] = icdVar.mo30234c(i5);
                iArr4[i4] = i5;
                i4++;
                linkedHashMap.put(Integer.valueOf(i5), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i5), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr5 = new int[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            iArr5[i6] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr4[i6]))).intValue();
        }
        int iMin = Math.min(i, i4);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr2 = new double[iMin][];
        int i7 = 0;
        for (int i8 = 0; i8 < iArr2.length; i8++) {
            dArr2[i8] = icdVar.mo30234c(iArr2[i8]);
            i7++;
        }
        int i9 = iMin - i7;
        if (i9 > 0) {
            for (int i10 = 0; i10 < i9; i10++) {
            }
        }
        int[] iArr6 = new int[i4];
        for (int i11 = 0; i11 < i4; i11++) {
            iArr6[i11] = random.nextInt(iMin);
        }
        int[][] iArr7 = new int[iMin][];
        for (int i12 = 0; i12 < iMin; i12++) {
            iArr7[i12] = new int[iMin];
        }
        C13099a[][] c13099aArr = new C13099a[iMin][];
        for (int i13 = 0; i13 < iMin; i13++) {
            c13099aArr[i13] = new C13099a[iMin];
            for (int i14 = 0; i14 < iMin; i14++) {
                c13099aArr[i13][i14] = new C13099a();
            }
        }
        int[] iArr8 = new int[iMin];
        int i15 = 0;
        while (true) {
            if (i15 >= 10) {
                iArr3 = iArr8;
                i2 = 0;
                break;
            }
            int i16 = 0;
            while (i16 < iMin) {
                int i17 = i16 + 1;
                int i18 = i17;
                while (i18 < iMin) {
                    int[] iArr9 = iArr8;
                    double dMo30232a = icdVar.mo30232a(dArr2[i16], dArr2[i18]);
                    C13099a c13099a = c13099aArr[i18][i16];
                    c13099a.f20963b = dMo30232a;
                    c13099a.f20962a = i16;
                    C13099a c13099a2 = c13099aArr[i16][i18];
                    c13099a2.f20963b = dMo30232a;
                    c13099a2.f20962a = i18;
                    i18++;
                    iArr8 = iArr9;
                }
                int[] iArr10 = iArr8;
                Arrays.sort(c13099aArr[i16]);
                for (int i19 = 0; i19 < iMin; i19++) {
                    iArr7[i16][i19] = c13099aArr[i16][i19].f20962a;
                }
                iArr8 = iArr10;
                i16 = i17;
            }
            int[] iArr11 = iArr8;
            int i20 = 0;
            int i21 = 0;
            while (i20 < i4) {
                double[] dArr3 = dArr[i20];
                int i22 = iArr6[i20];
                double dMo30232a2 = icdVar.mo30232a(dArr3, dArr2[i22]);
                int[][] iArr12 = iArr7;
                int[] iArr13 = iArr5;
                double d = dMo30232a2;
                int i23 = -1;
                int i24 = 0;
                while (i24 < iMin) {
                    C13099a[][] c13099aArr2 = c13099aArr;
                    int i25 = i4;
                    if (c13099aArr[i22][i24].f20963b < 4.0d * dMo30232a2) {
                        double dMo30232a3 = icdVar.mo30232a(dArr3, dArr2[i24]);
                        if (dMo30232a3 < d) {
                            i23 = i24;
                            d = dMo30232a3;
                        }
                    }
                    i24++;
                    i4 = i25;
                    c13099aArr = c13099aArr2;
                }
                C13099a[][] c13099aArr3 = c13099aArr;
                int i26 = i4;
                if (i23 != -1 && Math.abs(Math.sqrt(d) - Math.sqrt(dMo30232a2)) > 3.0d) {
                    i21++;
                    iArr6[i20] = i23;
                }
                i20++;
                iArr7 = iArr12;
                iArr5 = iArr13;
                i4 = i26;
                c13099aArr = c13099aArr3;
            }
            int[] iArr14 = iArr5;
            int[][] iArr15 = iArr7;
            C13099a[][] c13099aArr4 = c13099aArr;
            int i27 = i4;
            if (i21 == 0 && i15 != 0) {
                i2 = 0;
                iArr3 = iArr11;
                break;
            }
            double[] dArr4 = new double[iMin];
            double[] dArr5 = new double[iMin];
            double[] dArr6 = new double[iMin];
            char c = 0;
            Arrays.fill(iArr11, 0);
            int i28 = 0;
            while (true) {
                i3 = i27;
                if (i28 >= i3) {
                    break;
                }
                int i29 = iArr6[i28];
                double[] dArr7 = dArr[i28];
                int i30 = iArr14[i28];
                iArr11[i29] = iArr11[i29] + i30;
                double d2 = i30;
                dArr4[i29] = dArr4[i29] + (dArr7[c] * d2);
                dArr5[i29] = dArr5[i29] + (dArr7[1] * d2);
                dArr6[i29] = dArr6[i29] + (dArr7[2] * d2);
                i28++;
                i15 = i15;
                i27 = i3;
                c = 0;
            }
            int i31 = i15;
            for (int i32 = 0; i32 < iMin; i32++) {
                int i33 = iArr11[i32];
                if (i33 == 0) {
                    dArr2[i32] = new double[]{FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE};
                } else {
                    double d3 = i33;
                    double d4 = dArr4[i32] / d3;
                    double d5 = dArr5[i32] / d3;
                    double d6 = dArr6[i32] / d3;
                    double[] dArr8 = dArr2[i32];
                    dArr8[0] = d4;
                    dArr8[1] = d5;
                    dArr8[2] = d6;
                }
            }
            iArr7 = iArr15;
            i15 = i31 + 1;
            iArr8 = iArr11;
            i4 = i3;
            iArr5 = iArr14;
            c13099aArr = c13099aArr4;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i34 = i2; i34 < iMin; i34++) {
            int i35 = iArr3[i34];
            if (i35 != 0) {
                int iMo30233b = icdVar.mo30233b(dArr2[i34]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(iMo30233b))) {
                    linkedHashMap2.put(Integer.valueOf(iMo30233b), Integer.valueOf(i35));
                }
            }
        }
        return linkedHashMap2;
    }
}

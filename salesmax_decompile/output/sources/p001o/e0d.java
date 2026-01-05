package p001o;

import android.graphics.Path;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;

/* loaded from: classes2.dex */
public abstract class e0d {

    /* renamed from: o.e0d$a */
    public static class C13068a {

        /* renamed from: a */
        public int f20710a;

        /* renamed from: b */
        public boolean f20711b;
    }

    /* renamed from: a */
    public static void m24036a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new C13069b(c, fArr));
    }

    /* renamed from: b */
    public static boolean m24037b(C13069b[] c13069bArr, C13069b[] c13069bArr2) {
        if (c13069bArr == null || c13069bArr2 == null || c13069bArr.length != c13069bArr2.length) {
            return false;
        }
        for (int i = 0; i < c13069bArr.length; i++) {
            if (c13069bArr[i].f20712a != c13069bArr2[i].f20712a || c13069bArr[i].f20713b.length != c13069bArr2[i].f20713b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static float[] m24038c(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    /* renamed from: d */
    public static C13069b[] m24039d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            int iM24044i = m24044i(str, i2);
            String strTrim = str.substring(i, iM24044i).trim();
            if (!strTrim.isEmpty()) {
                m24036a(arrayList, strTrim.charAt(0), m24043h(strTrim));
            }
            i = iM24044i;
            i2 = iM24044i + 1;
        }
        if (i2 - i == 1 && i < str.length()) {
            m24036a(arrayList, str.charAt(i), new float[0]);
        }
        return (C13069b[]) arrayList.toArray(new C13069b[0]);
    }

    /* renamed from: e */
    public static Path m24040e(String str) {
        Path path = new Path();
        try {
            C13069b.m24054h(m24039d(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    /* renamed from: f */
    public static C13069b[] m24041f(C13069b[] c13069bArr) {
        C13069b[] c13069bArr2 = new C13069b[c13069bArr.length];
        for (int i = 0; i < c13069bArr.length; i++) {
            c13069bArr2[i] = new C13069b(c13069bArr[i]);
        }
        return c13069bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m24042g(String str, int i, C13068a c13068a) {
        c13068a.f20711b = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ' ') {
                z = false;
                z3 = true;
                if (z3) {
                }
            } else {
                if (cCharAt != 'E' && cCharAt != 'e') {
                    switch (cCharAt) {
                        case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            break;
                        case '-':
                            if (i2 != i && !z) {
                                c13068a.f20711b = true;
                                z = false;
                                z3 = true;
                                break;
                            }
                            z = false;
                            break;
                        case '.':
                            if (z2) {
                                c13068a.f20711b = true;
                                z = false;
                                z3 = true;
                                break;
                            } else {
                                z = false;
                                z2 = true;
                                break;
                            }
                        default:
                            z = false;
                            break;
                    }
                } else {
                    z = true;
                }
                if (z3) {
                }
            }
            c13068a.f20710a = i2;
        }
        c13068a.f20710a = i2;
    }

    /* renamed from: h */
    public static float[] m24043h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C13068a c13068a = new C13068a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                m24042g(str, i, c13068a);
                int i3 = c13068a.f20710a;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = c13068a.f20711b ? i3 : i3 + 1;
            }
            return m24038c(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, e);
        }
    }

    /* renamed from: i */
    public static int m24044i(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: j */
    public static void m24045j(C13069b[] c13069bArr, Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (C13069b c13069b : c13069bArr) {
            C13069b.m24051e(path, fArr, c, c13069b.f20712a, c13069b.f20713b);
            c = c13069b.f20712a;
        }
    }

    /* renamed from: k */
    public static void m24046k(C13069b[] c13069bArr, C13069b[] c13069bArr2) {
        for (int i = 0; i < c13069bArr2.length; i++) {
            c13069bArr[i].f20712a = c13069bArr2[i].f20712a;
            for (int i2 = 0; i2 < c13069bArr2[i].f20713b.length; i2++) {
                c13069bArr[i].f20713b[i2] = c13069bArr2[i].f20713b[i2];
            }
        }
    }

    /* renamed from: o.e0d$b */
    public static class C13069b {

        /* renamed from: a */
        public char f20712a;

        /* renamed from: b */
        public final float[] f20713b;

        public C13069b(char c, float[] fArr) {
            this.f20712a = c;
            this.f20713b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: e */
        public static void m24051e(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            boolean z = false;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case 'A':
                case Opcodes.LADD /* 97 */:
                    i = 7;
                    i2 = i;
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                case Opcodes.DADD /* 99 */:
                    i = 6;
                    i2 = i;
                    break;
                case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                case 'V':
                case 'h':
                case Opcodes.FNEG /* 118 */:
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case Opcodes.BASTORE /* 84 */:
                case 'l':
                case Opcodes.LDIV /* 109 */:
                case 't':
                default:
                    i2 = 2;
                    break;
                case Opcodes.FASTORE /* 81 */:
                case Opcodes.AASTORE /* 83 */:
                case Opcodes.LREM /* 113 */:
                case Opcodes.DREM /* 115 */:
                    i2 = 4;
                    break;
                case Opcodes.DUP_X1 /* 90 */:
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i2 = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i4 = 0;
            char c4 = c;
            while (i4 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i3 = i4;
                        int i5 = i3 + 2;
                        int i6 = i3 + 3;
                        int i7 = i3 + 4;
                        int i8 = i3 + 5;
                        path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8]);
                        f15 = fArr2[i7];
                        float f19 = fArr2[i8];
                        float f20 = fArr2[i5];
                        float f21 = fArr2[i6];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c3 == 'H') {
                        i3 = i4;
                        int i9 = i3 + 0;
                        path.lineTo(fArr2[i9], f16);
                        f15 = fArr2[i9];
                    } else if (c3 == 'Q') {
                        i3 = i4;
                        int i10 = i3 + 0;
                        int i11 = i3 + 1;
                        int i12 = i3 + 2;
                        int i13 = i3 + 3;
                        path.quadTo(fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                        float f22 = fArr2[i10];
                        float f23 = fArr2[i11];
                        f15 = fArr2[i12];
                        f16 = fArr2[i13];
                        f11 = f22;
                        f12 = f23;
                    } else if (c3 == 'V') {
                        i3 = i4;
                        int i14 = i3 + 0;
                        path.lineTo(f15, fArr2[i14]);
                        f16 = fArr2[i14];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 == 'h') {
                                int i15 = i4 + 0;
                                path.rLineTo(fArr2[i15], 0.0f);
                                f15 += fArr2[i15];
                            } else if (c3 != 'q') {
                                if (c3 == 'v') {
                                    int i16 = i4 + 0;
                                    path.rLineTo(0.0f, fArr2[i16]);
                                    f4 = fArr2[i16];
                                } else if (c3 == 'L') {
                                    int i17 = i4 + 0;
                                    int i18 = i4 + 1;
                                    path.lineTo(fArr2[i17], fArr2[i18]);
                                    f15 = fArr2[i17];
                                    f16 = fArr2[i18];
                                } else if (c3 == 'M') {
                                    f15 = fArr2[i4 + 0];
                                    f16 = fArr2[i4 + 1];
                                    if (i4 > 0) {
                                        path.lineTo(f15, f16);
                                    } else {
                                        path.moveTo(f15, f16);
                                        i3 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 'S') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    float f24 = f16;
                                    int i19 = i4 + 0;
                                    int i20 = i4 + 1;
                                    int i21 = i4 + 2;
                                    int i22 = i4 + 3;
                                    path.cubicTo(f15, f24, fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                                    f = fArr2[i19];
                                    f2 = fArr2[i20];
                                    f15 = fArr2[i21];
                                    f16 = fArr2[i22];
                                    f11 = f;
                                    f12 = f2;
                                } else if (c3 == 'T') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int i23 = i4 + 0;
                                    int i24 = i4 + 1;
                                    path.quadTo(f15, f16, fArr2[i23], fArr2[i24]);
                                    float f25 = fArr2[i23];
                                    float f26 = fArr2[i24];
                                    i3 = i4;
                                    f12 = f16;
                                    f11 = f15;
                                    f15 = f25;
                                    f16 = f26;
                                } else if (c3 == 'l') {
                                    int i25 = i4 + 0;
                                    int i26 = i4 + 1;
                                    path.rLineTo(fArr2[i25], fArr2[i26]);
                                    f15 += fArr2[i25];
                                    f4 = fArr2[i26];
                                } else if (c3 == 'm') {
                                    float f27 = fArr2[i4 + 0];
                                    f15 += f27;
                                    float f28 = fArr2[i4 + 1];
                                    f16 += f28;
                                    if (i4 > 0) {
                                        path.rLineTo(f27, f28);
                                    } else {
                                        path.rMoveTo(f27, f28);
                                        i3 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 's') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        float f29 = f15 - f11;
                                        f5 = f16 - f12;
                                        f6 = f29;
                                    } else {
                                        f6 = 0.0f;
                                        f5 = 0.0f;
                                    }
                                    int i27 = i4 + 0;
                                    int i28 = i4 + 1;
                                    int i29 = i4 + 2;
                                    int i30 = i4 + 3;
                                    path.rCubicTo(f6, f5, fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                    f = fArr2[i27] + f15;
                                    f2 = fArr2[i28] + f16;
                                    f15 += fArr2[i29];
                                    f3 = fArr2[i30];
                                } else if (c3 == 't') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f7 = f15 - f11;
                                        f8 = f16 - f12;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i31 = i4 + 0;
                                    int i32 = i4 + 1;
                                    path.rQuadTo(f7, f8, fArr2[i31], fArr2[i32]);
                                    float f30 = f7 + f15;
                                    float f31 = f8 + f16;
                                    f15 += fArr2[i31];
                                    f16 += fArr2[i32];
                                    f12 = f31;
                                    f11 = f30;
                                }
                                f16 += f4;
                            } else {
                                int i33 = i4 + 0;
                                int i34 = i4 + 1;
                                int i35 = i4 + 2;
                                int i36 = i4 + 3;
                                path.rQuadTo(fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                f = fArr2[i33] + f15;
                                f2 = fArr2[i34] + f16;
                                f15 += fArr2[i35];
                                f3 = fArr2[i36];
                            }
                            i3 = i4;
                        } else {
                            int i37 = i4 + 2;
                            int i38 = i4 + 3;
                            int i39 = i4 + 4;
                            int i40 = i4 + 5;
                            path.rCubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                            f = fArr2[i37] + f15;
                            f2 = fArr2[i38] + f16;
                            f15 += fArr2[i39];
                            f3 = fArr2[i40];
                        }
                        f16 += f3;
                        f11 = f;
                        f12 = f2;
                        i3 = i4;
                    } else {
                        int i41 = i4 + 5;
                        int i42 = i4 + 6;
                        i3 = i4;
                        m24053g(path, f15, f16, fArr2[i41] + f15, fArr2[i42] + f16, fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f15 += fArr2[i41];
                        f16 += fArr2[i42];
                    }
                    i4 = i3 + i2;
                    c4 = c2;
                    c3 = c4;
                    z = false;
                } else {
                    i3 = i4;
                    int i43 = i3 + 5;
                    int i44 = i3 + 6;
                    m24053g(path, f15, f16, fArr2[i43], fArr2[i44], fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f15 = fArr2[i43];
                    f16 = fArr2[i44];
                }
                f12 = f16;
                f11 = f15;
                i4 = i3 + i2;
                c4 = c2;
                c3 = c4;
                z = false;
            }
            fArr[z ? 1 : 0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        /* renamed from: f */
        public static void m24052f(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = (d12 * dSin2) - (d13 * dCos2);
            double d15 = d11 * dSin;
            double d16 = d4 * dCos;
            double d17 = (dSin2 * d15) + (dCos2 * d16);
            double d18 = d9 / iCeil;
            double d19 = d17;
            double d20 = d14;
            int i = 0;
            double d21 = d5;
            double d22 = d6;
            double d23 = d8;
            while (i < iCeil) {
                double d24 = d23 + d18;
                double dSin3 = Math.sin(d24);
                double dCos3 = Math.cos(d24);
                double d25 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
                double d26 = d2 + (d10 * dSin * dCos3) + (d16 * dSin3);
                double d27 = (d12 * dSin3) - (d13 * dCos3);
                double d28 = (dSin3 * d15) + (dCos3 * d16);
                double d29 = d24 - d23;
                double dTan = Math.tan(d29 / 2.0d);
                double dSin4 = (Math.sin(d29) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d21 + (d20 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d22 + (d19 * dSin4)), (float) (d25 - (dSin4 * d27)), (float) (d26 - (dSin4 * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                dSin = dSin;
                d21 = d25;
                d15 = d15;
                dCos = dCos;
                d23 = d24;
                d19 = d28;
                d20 = d27;
                iCeil = iCeil;
                d22 = d26;
                d10 = d3;
            }
        }

        /* renamed from: g */
        public static void m24053g(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * dCos;
            double d5 = f2;
            double d6 = f5;
            double d7 = (d4 + (d5 * dSin)) / d6;
            double d8 = ((-f) * dSin) + (d5 * dCos);
            double d9 = f6;
            double d10 = d8 / d9;
            double d11 = f4;
            double d12 = ((f3 * dCos) + (d11 * dSin)) / d6;
            double d13 = (((-f3) * dSin) + (d11 * dCos)) / d9;
            double d14 = d7 - d12;
            double d15 = d10 - d13;
            double d16 = (d7 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                StringBuilder sb = new StringBuilder();
                sb.append("Points are too far apart ");
                sb.append(d18);
                float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
                m24053g(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d19);
            double d20 = d14 * dSqrt;
            double d21 = dSqrt * d15;
            if (z == z2) {
                d = d16 - d21;
                d2 = d17 + d20;
            } else {
                d = d16 + d21;
                d2 = d17 - d20;
            }
            double dAtan2 = Math.atan2(d10 - d2, d7 - d);
            double dAtan22 = Math.atan2(d13 - d2, d12 - d) - dAtan2;
            if (z2 != (dAtan22 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
                dAtan22 = dAtan22 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d22 = d * d6;
            double d23 = d2 * d9;
            m24052f(path, (d22 * dCos) - (d23 * dSin), (d22 * dSin) + (d23 * dCos), d6, d9, d3, d5, radians, dAtan2, dAtan22);
        }

        /* renamed from: h */
        public static void m24054h(C13069b[] c13069bArr, Path path) {
            e0d.m24045j(c13069bArr, path);
        }

        public C13069b(C13069b c13069b) {
            this.f20712a = c13069b.f20712a;
            float[] fArr = c13069b.f20713b;
            this.f20713b = e0d.m24038c(fArr, 0, fArr.length);
        }
    }
}

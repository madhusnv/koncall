package og;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class za {

    /* renamed from: a */
    public static final /* synthetic */ int f27042a = 0;

    /* renamed from: a */
    public static int m11080a(byte[] bArr, int i10, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        int iM11085f = m11085f(bArr, i10, m0Var);
        int i11 = m0Var.f6598a;
        if (i11 < 0) {
            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iM11085f) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            m0Var.f6600c = com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0.f6641b;
            return iM11085f;
        }
        m0Var.f6600c = com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0.m3947w(iM11085f, i11, bArr);
        return iM11085f + i11;
    }

    /* renamed from: b */
    public static int m11081b(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* renamed from: c */
    public static int m11082c(com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2 e2Var, int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1 k1Var, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        Object objMo3842a = e2Var.mo3842a();
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2 e2Var2 = e2Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var2 = m0Var;
        int iM11090k = m11090k(objMo3842a, e2Var2, bArr2, i11, i13, m0Var2);
        e2Var2.mo3844c(objMo3842a);
        m0Var2.f6600c = objMo3842a;
        k1Var.add(objMo3842a);
        while (iM11090k < i13) {
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var3 = m0Var2;
            int i14 = i13;
            int iM11085f = m11085f(bArr2, iM11090k, m0Var3);
            if (i10 != m0Var3.f6598a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2 e2Var3 = e2Var2;
            Object objMo3842a2 = e2Var3.mo3842a();
            iM11090k = m11090k(objMo3842a2, e2Var3, bArr3, iM11085f, i14, m0Var3);
            e2Var2 = e2Var3;
            bArr2 = bArr3;
            i13 = i14;
            m0Var2 = m0Var3;
            e2Var2.mo3844c(objMo3842a2);
            m0Var2.f6600c = objMo3842a2;
            k1Var.add(objMo3842a2);
        }
        return iM11090k;
    }

    /* renamed from: d */
    public static int m11083d(byte[] bArr, int i10, com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1 k1Var, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.f1 f1Var = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.f1) k1Var;
        int iM11085f = m11085f(bArr, i10, m0Var);
        int i11 = m0Var.f6598a + iM11085f;
        while (iM11085f < i11) {
            iM11085f = m11085f(bArr, iM11085f, m0Var);
            f1Var.m3852c(m0Var.f6598a);
        }
        if (iM11085f == i11) {
            return iM11085f;
        }
        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: e */
    public static int m11084e(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2 i2Var, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        if ((i10 >>> 3) == 0) {
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM11088i = m11088i(bArr, i11, m0Var);
            i2Var.m3904c(i10, Long.valueOf(m0Var.f6599b));
            return iM11088i;
        }
        if (i13 == 1) {
            i2Var.m3904c(i10, Long.valueOf(m11092m(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM11085f = m11085f(bArr, i11, m0Var);
            int i14 = m0Var.f6598a;
            if (i14 < 0) {
                throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iM11085f) {
                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                i2Var.m3904c(i10, com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0.f6641b);
            } else {
                i2Var.m3904c(i10, com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0.m3947w(iM11085f, i14, bArr));
            }
            return iM11085f + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzer("Protocol message contained an invalid tag (zero).");
            }
            i2Var.m3904c(i10, Integer.valueOf(m11081b(i11, bArr)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2 i2VarM3902b = com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2.m3902b();
        int i16 = m0Var.f6602e + 1;
        m0Var.f6602e = i16;
        if (i16 >= 100) {
            throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iM11085f2 = m11085f(bArr, i11, m0Var);
            int i18 = m0Var.f6598a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iM11085f2;
                break;
            }
            i11 = m11084e(i18, bArr, iM11085f2, i12, i2VarM3902b, m0Var);
            i17 = i18;
        }
        m0Var.f6602e--;
        if (i11 > i12 || i17 != i15) {
            throw new zzer("Failed to parse the message.");
        }
        i2Var.m3904c(i10, i2VarM3902b);
        return i11;
    }

    /* renamed from: f */
    public static int m11085f(byte[] bArr, int i10, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return m11086g(b10, bArr, i11, m0Var);
        }
        m0Var.f6598a = b10;
        return i11;
    }

    /* renamed from: g */
    public static int m11086g(int i10, byte[] bArr, int i11, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            m0Var.f6598a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            m0Var.f6598a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            m0Var.f6598a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            m0Var.f6598a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                m0Var.f6598a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* renamed from: h */
    public static int m11087h(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1 k1Var, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.f1 f1Var = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.f1) k1Var;
        int iM11085f = m11085f(bArr, i11, m0Var);
        f1Var.m3852c(m0Var.f6598a);
        while (iM11085f < i12) {
            int iM11085f2 = m11085f(bArr, iM11085f, m0Var);
            if (i10 != m0Var.f6598a) {
                break;
            }
            iM11085f = m11085f(bArr, iM11085f2, m0Var);
            f1Var.m3852c(m0Var.f6598a);
        }
        return iM11085f;
    }

    /* renamed from: i */
    public static int m11088i(byte[] bArr, int i10, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        long j6 = bArr[i10];
        int i11 = i10 + 1;
        if (j6 >= 0) {
            m0Var.f6599b = j6;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j10 = (j6 & 127) | ((b10 & 127) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j10 |= (r10 & 127) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        m0Var.f6599b = j10;
        return i12;
    }

    /* renamed from: j */
    public static int m11089j(Object obj, com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2 e2Var, byte[] bArr, int i10, int i11, int i12, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1 v1Var = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1) e2Var;
        int i13 = m0Var.f6602e + 1;
        m0Var.f6602e = i13;
        if (i13 >= 100) {
            throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM3993t = v1Var.m3993t(obj, bArr, i10, i11, i12, m0Var);
        m0Var.f6602e--;
        m0Var.f6600c = obj;
        return iM3993t;
    }

    /* renamed from: k */
    public static int m11090k(Object obj, com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2 e2Var, byte[] bArr, int i10, int i11, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        int iM11086g = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iM11086g = m11086g(i12, bArr, iM11086g, m0Var);
            i12 = m0Var.f6598a;
        }
        int i13 = iM11086g;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = m0Var.f6602e + 1;
        m0Var.f6602e = i14;
        if (i14 >= 100) {
            throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        e2Var.mo3845d(obj, bArr, i13, i15, m0Var);
        m0Var.f6602e--;
        m0Var.f6600c = obj;
        return i15;
    }

    /* renamed from: l */
    public static int m11091l(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 m0Var) {
        if ((i10 >>> 3) == 0) {
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return m11088i(bArr, i11, m0Var);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return m11085f(bArr, i11, m0Var) + m0Var.f6598a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = m11085f(bArr, i11, m0Var);
            i15 = m0Var.f6598a;
            if (i15 == i14) {
                break;
            }
            i11 = m11091l(i15, bArr, i11, i12, m0Var);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzer("Failed to parse the message.");
        }
        return i11;
    }

    /* renamed from: m */
    public static long m11092m(int i10, byte[] bArr) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}

package og;

import com.google.android.gms.internal.measurement.zzmr;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ua {
    /* renamed from: a */
    public static int m10953a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* renamed from: b */
    public static int m10954b(byte[] bArr, int i10, com.google.android.gms.internal.measurement.w4 w4Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return m10955c(b10, bArr, i11, w4Var);
        }
        w4Var.f6429a = b10;
        return i11;
    }

    /* renamed from: c */
    public static int m10955c(int i10, byte[] bArr, int i11, com.google.android.gms.internal.measurement.w4 w4Var) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            w4Var.f6429a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            w4Var.f6429a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            w4Var.f6429a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            w4Var.f6429a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                w4Var.f6429a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* renamed from: d */
    public static int m10956d(byte[] bArr, int i10, com.google.android.gms.internal.measurement.w4 w4Var) {
        long j6 = bArr[i10];
        int i11 = i10 + 1;
        if (j6 >= 0) {
            w4Var.f6430b = j6;
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
        w4Var.f6430b = j10;
        return i12;
    }

    /* renamed from: e */
    public static boolean m10957e(C5367h c5367h, Collection collection) {
        collection.getClass();
        if (collection instanceof d0) {
            collection = ((d0) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= c5367h.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= c5367h.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = c5367h.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    /* renamed from: f */
    public static int m10958f(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* renamed from: g */
    public static long m10959g(int i10, byte[] bArr) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    /* renamed from: h */
    public static int m10960h(byte[] bArr, int i10, com.google.android.gms.internal.measurement.w4 w4Var) {
        int iM10954b = m10954b(bArr, i10, w4Var);
        int i11 = w4Var.f6429a;
        if (i11 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            w4Var.f6431c = "";
            return iM10954b;
        }
        int i12 = com.google.android.gms.internal.measurement.t6.f6394a;
        int length = bArr.length;
        if ((((length - iM10954b) - i11) | iM10954b | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iM10954b), Integer.valueOf(i11)));
        }
        int i13 = iM10954b + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (iM10954b < i13) {
            byte b10 = bArr[iM10954b];
            if (b10 < 0) {
                break;
            }
            iM10954b++;
            cArr[i14] = (char) b10;
            i14++;
        }
        while (iM10954b < i13) {
            int i15 = iM10954b + 1;
            byte b11 = bArr[iM10954b];
            if (b11 >= 0) {
                cArr[i14] = (char) b11;
                i14++;
                iM10954b = i15;
                while (iM10954b < i13) {
                    byte b12 = bArr[iM10954b];
                    if (b12 >= 0) {
                        iM10954b++;
                        cArr[i14] = (char) b12;
                        i14++;
                    }
                }
            } else {
                if (b11 >= -32) {
                    if (b11 >= -16) {
                        if (i15 >= i13 - 2) {
                            throw new zzmr("Protocol message had invalid UTF-8.");
                        }
                        byte b13 = bArr[i15];
                        int i16 = iM10954b + 3;
                        byte b14 = bArr[iM10954b + 2];
                        iM10954b += 4;
                        byte b15 = bArr[i16];
                        if (!ya.m11064b(b13)) {
                            if ((((b13 + 112) + (b11 << 28)) >> 30) == 0 && !ya.m11064b(b14) && !ya.m11064b(b15)) {
                                int i17 = ((b13 & 63) << 12) | ((b11 & 7) << 18) | ((b14 & 63) << 6) | (b15 & 63);
                                cArr[i14] = (char) ((i17 >>> 10) + 55232);
                                cArr[i14 + 1] = (char) ((i17 & 1023) + 56320);
                                i14 += 2;
                            }
                        }
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    if (i15 >= i13 - 1) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    int i18 = i14 + 1;
                    int i19 = iM10954b + 2;
                    byte b16 = bArr[i15];
                    iM10954b += 3;
                    byte b17 = bArr[i19];
                    if (!ya.m11064b(b16)) {
                        if (b11 == -32) {
                            if (b16 >= -96) {
                                b11 = -32;
                            }
                        }
                        if (b11 == -19) {
                            if (b16 < -96) {
                                b11 = -19;
                            }
                        }
                        if (!ya.m11064b(b17)) {
                            cArr[i14] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                            i14 = i18;
                        }
                    }
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                if (i15 >= i13) {
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                int i20 = i14 + 1;
                iM10954b += 2;
                byte b18 = bArr[i15];
                if (b11 < -62 || ya.m11064b(b18)) {
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                cArr[i14] = (char) ((b18 & 63) | ((b11 & 31) << 6));
                i14 = i20;
            }
        }
        w4Var.f6431c = new String(cArr, 0, i14);
        return i13;
    }

    /* renamed from: i */
    public static int m10961i(byte[] bArr, int i10, com.google.android.gms.internal.measurement.w4 w4Var) {
        int iM10954b = m10954b(bArr, i10, w4Var);
        int i11 = w4Var.f6429a;
        if (i11 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iM10954b) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            w4Var.f6431c = com.google.android.gms.internal.measurement.z4.f6468c;
            return iM10954b;
        }
        w4Var.f6431c = com.google.android.gms.internal.measurement.z4.m3801e(iM10954b, i11, bArr);
        return iM10954b + i11;
    }

    /* renamed from: j */
    public static int m10962j(Object obj, com.google.android.gms.internal.measurement.i6 i6Var, byte[] bArr, int i10, int i11, com.google.android.gms.internal.measurement.w4 w4Var) {
        int iM10955c = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iM10955c = m10955c(i12, bArr, iM10955c, w4Var);
            i12 = w4Var.f6429a;
        }
        int i13 = iM10955c;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = w4Var.f6432d + 1;
        w4Var.f6432d = i14;
        if (i14 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        i6Var.mo3170h(obj, bArr, i13, i15, w4Var);
        w4Var.f6432d--;
        w4Var.f6431c = obj;
        return i15;
    }

    /* renamed from: k */
    public static int m10963k(Object obj, com.google.android.gms.internal.measurement.i6 i6Var, byte[] bArr, int i10, int i11, int i12, com.google.android.gms.internal.measurement.w4 w4Var) {
        com.google.android.gms.internal.measurement.b6 b6Var = (com.google.android.gms.internal.measurement.b6) i6Var;
        int i13 = w4Var.f6432d + 1;
        w4Var.f6432d = i13;
        if (i13 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM3178s = b6Var.m3178s(obj, bArr, i10, i11, i12, w4Var);
        w4Var.f6432d--;
        w4Var.f6431c = obj;
        return iM3178s;
    }

    /* renamed from: l */
    public static int m10964l(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.measurement.o5 o5Var, com.google.android.gms.internal.measurement.w4 w4Var) {
        com.google.android.gms.internal.measurement.j5 j5Var = (com.google.android.gms.internal.measurement.j5) o5Var;
        int iM10954b = m10954b(bArr, i11, w4Var);
        j5Var.m3404e(w4Var.f6429a);
        while (iM10954b < i12) {
            int iM10954b2 = m10954b(bArr, iM10954b, w4Var);
            if (i10 != w4Var.f6429a) {
                break;
            }
            iM10954b = m10954b(bArr, iM10954b2, w4Var);
            j5Var.m3404e(w4Var.f6429a);
        }
        return iM10954b;
    }

    /* renamed from: m */
    public static int m10965m(byte[] bArr, int i10, com.google.android.gms.internal.measurement.o5 o5Var, com.google.android.gms.internal.measurement.w4 w4Var) {
        com.google.android.gms.internal.measurement.j5 j5Var = (com.google.android.gms.internal.measurement.j5) o5Var;
        int iM10954b = m10954b(bArr, i10, w4Var);
        int i11 = w4Var.f6429a + iM10954b;
        while (iM10954b < i11) {
            iM10954b = m10954b(bArr, iM10954b, w4Var);
            j5Var.m3404e(w4Var.f6429a);
        }
        if (iM10954b == i11) {
            return iM10954b;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: n */
    public static int m10966n(com.google.android.gms.internal.measurement.i6 i6Var, int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.measurement.o5 o5Var, com.google.android.gms.internal.measurement.w4 w4Var) {
        com.google.android.gms.internal.measurement.i5 i5VarZza = i6Var.zza();
        com.google.android.gms.internal.measurement.i6 i6Var2 = i6Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        com.google.android.gms.internal.measurement.w4 w4Var2 = w4Var;
        int iM10962j = m10962j(i5VarZza, i6Var2, bArr2, i11, i13, w4Var2);
        i6Var2.mo3169g(i5VarZza);
        w4Var2.f6431c = i5VarZza;
        o5Var.add(i5VarZza);
        while (iM10962j < i13) {
            com.google.android.gms.internal.measurement.w4 w4Var3 = w4Var2;
            int i14 = i13;
            int iM10954b = m10954b(bArr2, iM10962j, w4Var3);
            if (i10 != w4Var3.f6429a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.android.gms.internal.measurement.i6 i6Var3 = i6Var2;
            com.google.android.gms.internal.measurement.i5 i5VarZza2 = i6Var3.zza();
            iM10962j = m10962j(i5VarZza2, i6Var3, bArr3, iM10954b, i14, w4Var3);
            i6Var2 = i6Var3;
            bArr2 = bArr3;
            i13 = i14;
            w4Var2 = w4Var3;
            i6Var2.mo3169g(i5VarZza2);
            w4Var2.f6431c = i5VarZza2;
            o5Var.add(i5VarZza2);
        }
        return iM10962j;
    }

    /* renamed from: o */
    public static int m10967o(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.measurement.m6 m6Var, com.google.android.gms.internal.measurement.w4 w4Var) {
        if ((i10 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM10956d = m10956d(bArr, i11, w4Var);
            m6Var.m3497d(i10, Long.valueOf(w4Var.f6430b));
            return iM10956d;
        }
        if (i13 == 1) {
            m6Var.m3497d(i10, Long.valueOf(m10959g(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM10954b = m10954b(bArr, i11, w4Var);
            int i14 = w4Var.f6429a;
            if (i14 < 0) {
                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iM10954b) {
                throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                m6Var.m3497d(i10, com.google.android.gms.internal.measurement.z4.f6468c);
            } else {
                m6Var.m3497d(i10, com.google.android.gms.internal.measurement.z4.m3801e(iM10954b, i14, bArr));
            }
            return iM10954b + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzmr("Protocol message contained an invalid tag (zero).");
            }
            m6Var.m3497d(i10, Integer.valueOf(m10958f(i11, bArr)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        com.google.android.gms.internal.measurement.m6 m6VarM3494a = com.google.android.gms.internal.measurement.m6.m3494a();
        int i16 = w4Var.f6432d + 1;
        w4Var.f6432d = i16;
        if (i16 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iM10954b2 = m10954b(bArr, i11, w4Var);
            int i18 = w4Var.f6429a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iM10954b2;
                break;
            }
            i11 = m10967o(i18, bArr, iM10954b2, i12, m6VarM3494a, w4Var);
            i17 = i18;
        }
        w4Var.f6432d--;
        if (i11 > i12 || i17 != i15) {
            throw new zzmr("Failed to parse the message.");
        }
        m6Var.m3497d(i10, m6VarM3494a);
        return i11;
    }

    /* renamed from: p */
    public static int m10968p(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.measurement.w4 w4Var) {
        if ((i10 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return m10956d(bArr, i11, w4Var);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return m10954b(bArr, i11, w4Var) + w4Var.f6429a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = m10954b(bArr, i11, w4Var);
            i15 = w4Var.f6429a;
            if (i15 == i14) {
                break;
            }
            i11 = m10968p(i15, bArr, i11, i12, w4Var);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzmr("Failed to parse the message.");
        }
        return i11;
    }
}

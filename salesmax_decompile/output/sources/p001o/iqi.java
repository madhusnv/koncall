package p001o;

/* loaded from: classes4.dex */
public abstract class iqi {

    /* renamed from: a */
    public static final AbstractC14349b f29101a;

    /* renamed from: o.iqi$a */
    public static class C14348a {
        /* renamed from: h */
        public static void m32580h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws bt8 {
            if (m32585m(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m32585m(b3) || m32585m(b4)) {
                throw bt8.m19718c();
            }
            int iM32590r = ((b & 7) << 18) | (m32590r(b2) << 12) | (m32590r(b3) << 6) | m32590r(b4);
            cArr[i] = m32584l(iM32590r);
            cArr[i + 1] = m32589q(iM32590r);
        }

        /* renamed from: i */
        public static void m32581i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* renamed from: j */
        public static void m32582j(byte b, byte b2, byte b3, char[] cArr, int i) throws bt8 {
            if (m32585m(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m32585m(b3)))) {
                throw bt8.m19718c();
            }
            cArr[i] = (char) (((b & 15) << 12) | (m32590r(b2) << 6) | m32590r(b3));
        }

        /* renamed from: k */
        public static void m32583k(byte b, byte b2, char[] cArr, int i) throws bt8 {
            if (b < -62 || m32585m(b2)) {
                throw bt8.m19718c();
            }
            cArr[i] = (char) (((b & 31) << 6) | m32590r(b2));
        }

        /* renamed from: l */
        public static char m32584l(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        /* renamed from: m */
        public static boolean m32585m(byte b) {
            return b > -65;
        }

        /* renamed from: n */
        public static boolean m32586n(byte b) {
            return b >= 0;
        }

        /* renamed from: o */
        public static boolean m32587o(byte b) {
            return b < -16;
        }

        /* renamed from: p */
        public static boolean m32588p(byte b) {
            return b < -32;
        }

        /* renamed from: q */
        public static char m32589q(int i) {
            return (char) ((i & 1023) + 56320);
        }

        /* renamed from: r */
        public static int m32590r(byte b) {
            return b & 63;
        }
    }

    /* renamed from: o.iqi$b */
    public static abstract class AbstractC14349b {
        /* renamed from: a */
        public abstract String mo32591a(byte[] bArr, int i, int i2);

        /* renamed from: b */
        public abstract int mo32592b(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: c */
        public final boolean m32593c(byte[] bArr, int i, int i2) {
            return mo32594d(0, bArr, i, i2) == 0;
        }

        /* renamed from: d */
        public abstract int mo32594d(int i, byte[] bArr, int i2, int i3);
    }

    /* renamed from: o.iqi$c */
    public static final class C14350c extends AbstractC14349b {
        /* renamed from: e */
        public static int m32595e(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m32596f(bArr, i, i2);
        }

        /* renamed from: f */
        public static int m32596f(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return iqi.m32570l(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = i4 + 1;
                            if (bArr[i4] <= -65) {
                                i3 = i5 + 1;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return iqi.m32570l(bArr, i3, i2);
                    }
                    int i6 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i = i6 + 1;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }

        @Override // p001o.iqi.AbstractC14349b
        /* renamed from: a */
        public String mo32591a(byte[] bArr, int i, int i2) throws bt8 {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!C14348a.m32586n(b)) {
                    break;
                }
                i++;
                C14348a.m32581i(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (C14348a.m32586n(b2)) {
                    int i7 = i5 + 1;
                    C14348a.m32581i(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = bArr[i6];
                        if (!C14348a.m32586n(b3)) {
                            break;
                        }
                        i6++;
                        C14348a.m32581i(b3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (C14348a.m32588p(b2)) {
                    if (i6 >= i3) {
                        throw bt8.m19718c();
                    }
                    C14348a.m32583k(b2, bArr[i6], cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (C14348a.m32587o(b2)) {
                    if (i6 >= i3 - 1) {
                        throw bt8.m19718c();
                    }
                    int i8 = i6 + 1;
                    C14348a.m32582j(b2, bArr[i6], bArr[i8], cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw bt8.m19718c();
                    }
                    int i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    int i10 = i9 + 1;
                    C14348a.m32580h(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // p001o.iqi.AbstractC14349b
        /* renamed from: b */
        public int mo32592b(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char cCharAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                if (cCharAt2 >= 128 || i8 >= i6) {
                    if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                        i8 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                    throw new C14351d(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
                            if (i10 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = i8 + 1;
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    int i12 = i11 + 1;
                                    bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i12 + 1;
                                    bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 = i13 + 1;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new C14351d(i7 - 1, length);
                        }
                        int i14 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i7++;
                } else {
                    i3 = i8 + 1;
                    bArr[i8] = (byte) cCharAt2;
                }
                i8 = i3;
                i7++;
            }
            return i8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // p001o.iqi.AbstractC14349b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo32594d(int i, byte[] bArr, int i2, int i3) {
            byte b;
            int i4;
            int i5;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i6 = i2 + 1;
                        byte b4 = bArr[i2];
                        if (i6 >= i3) {
                            return iqi.m32568j(b2, b4);
                        }
                        i2 = i6;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = bArr[i2];
                    if (i4 >= i3) {
                        return iqi.m32568j(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i7 = i4 + 1;
                    byte b6 = bArr[i4];
                    if (i7 >= i3) {
                        return iqi.m32569k(b2, b5, b6);
                    }
                    b = b6;
                    i4 = i7;
                }
                if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                    i2 = i4 + 1;
                }
                return -1;
                i2 = i5;
            }
            return m32595e(bArr, i2, i3);
        }
    }

    /* renamed from: o.iqi$d */
    public static class C14351d extends IllegalArgumentException {
        public C14351d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* renamed from: o.iqi$e */
    public static final class C14352e extends AbstractC14349b {
        /* renamed from: e */
        public static boolean m32597e() {
            return a5i.m16448C() && a5i.m16449D();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
        
            return -1;
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m32598f(byte[] bArr, long j, int i) {
            long j2;
            int iM32599g = m32599g(bArr, j, i);
            int i2 = i - iM32599g;
            long j3 = j + iM32599g;
            while (true) {
                byte bM16481s = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    bM16481s = a5i.m16481s(bArr, j3);
                    if (bM16481s < 0) {
                        j3 = j4;
                        break;
                    }
                    i2--;
                    j3 = j4;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bM16481s >= -32) {
                    if (bM16481s >= -16) {
                        if (i3 >= 3) {
                            i2 = i3 - 3;
                            long j5 = j3 + 1;
                            byte bM16481s2 = a5i.m16481s(bArr, j3);
                            if (bM16481s2 <= -65 && (((bM16481s << 28) + (bM16481s2 + 112)) >> 30) == 0) {
                                long j6 = j5 + 1;
                                if (a5i.m16481s(bArr, j5) > -65) {
                                    break;
                                }
                                j2 = 1 + j6;
                                if (a5i.m16481s(bArr, j6) > -65) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            return m32600h(bArr, bM16481s, j3, i3);
                        }
                    } else {
                        if (i3 < 2) {
                            return m32600h(bArr, bM16481s, j3, i3);
                        }
                        i2 = i3 - 2;
                        long j7 = j3 + 1;
                        byte bM16481s3 = a5i.m16481s(bArr, j3);
                        if (bM16481s3 > -65 || ((bM16481s == -32 && bM16481s3 < -96) || (bM16481s == -19 && bM16481s3 >= -96))) {
                            break;
                        }
                        j2 = 1 + j7;
                        if (a5i.m16481s(bArr, j7) > -65) {
                            break;
                        }
                    }
                } else if (i3 != 0) {
                    i2 = i3 - 1;
                    if (bM16481s < -62) {
                        break;
                    }
                    j2 = 1 + j3;
                    if (a5i.m16481s(bArr, j3) > -65) {
                        break;
                    }
                } else {
                    return bM16481s;
                }
                j3 = j2;
            }
            return -1;
        }

        /* renamed from: g */
        public static int m32599g(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (a5i.m16481s(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        /* renamed from: h */
        public static int m32600h(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return iqi.m32567i(i);
            }
            if (i2 == 1) {
                return iqi.m32568j(i, a5i.m16481s(bArr, j));
            }
            if (i2 == 2) {
                return iqi.m32569k(i, a5i.m16481s(bArr, j), a5i.m16481s(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // p001o.iqi.AbstractC14349b
        /* renamed from: a */
        public String mo32591a(byte[] bArr, int i, int i2) throws bt8 {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte bM16481s = a5i.m16481s(bArr, i);
                if (!C14348a.m32586n(bM16481s)) {
                    break;
                }
                i++;
                C14348a.m32581i(bM16481s, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte bM16481s2 = a5i.m16481s(bArr, i);
                if (C14348a.m32586n(bM16481s2)) {
                    int i7 = i5 + 1;
                    C14348a.m32581i(bM16481s2, cArr, i5);
                    while (i6 < i3) {
                        byte bM16481s3 = a5i.m16481s(bArr, i6);
                        if (!C14348a.m32586n(bM16481s3)) {
                            break;
                        }
                        i6++;
                        C14348a.m32581i(bM16481s3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (C14348a.m32588p(bM16481s2)) {
                    if (i6 >= i3) {
                        throw bt8.m19718c();
                    }
                    C14348a.m32583k(bM16481s2, a5i.m16481s(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (C14348a.m32587o(bM16481s2)) {
                    if (i6 >= i3 - 1) {
                        throw bt8.m19718c();
                    }
                    int i8 = i6 + 1;
                    C14348a.m32582j(bM16481s2, a5i.m16481s(bArr, i6), a5i.m16481s(bArr, i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw bt8.m19718c();
                    }
                    int i9 = i6 + 1;
                    byte bM16481s4 = a5i.m16481s(bArr, i6);
                    int i10 = i9 + 1;
                    C14348a.m32580h(bM16481s2, bM16481s4, a5i.m16481s(bArr, i9), a5i.m16481s(bArr, i10), cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // p001o.iqi.AbstractC14349b
        /* renamed from: b */
        public int mo32592b(CharSequence charSequence, byte[] bArr, int i, int i2) {
            char c;
            long j;
            long j2;
            long j3;
            char c2;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                a5i.m16453H(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 < c && j4 < j5) {
                    long j6 = j4 + j;
                    a5i.m16453H(bArr, j4, (byte) cCharAt2);
                    j3 = j;
                    j2 = j6;
                    c2 = c;
                } else if (cCharAt2 < 2048 && j4 <= j5 - 2) {
                    long j7 = j4 + j;
                    a5i.m16453H(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    long j8 = j7 + j;
                    a5i.m16453H(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                    long j9 = j;
                    c2 = 128;
                    j2 = j8;
                    j3 = j9;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        if (j4 > j5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                throw new C14351d(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                long j10 = j4 + 1;
                                a5i.m16453H(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j11 = j10 + 1;
                                c2 = 128;
                                a5i.m16453H(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = j11 + 1;
                                a5i.m16453H(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j12 + 1;
                                a5i.m16453H(bArr, j12, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C14351d(i4 - 1, length);
                    }
                    long j13 = j4 + j;
                    a5i.m16453H(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j14 = j13 + j;
                    a5i.m16453H(bArr, j13, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    a5i.m16453H(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
                    j2 = j14 + 1;
                    j3 = 1;
                    c2 = 128;
                }
                i4++;
                c = c2;
                long j15 = j3;
                j4 = j2;
                j = j15;
            }
            return (int) j4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (p001o.a5i.m16481s(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (p001o.a5i.m16481s(r12, r0) > (-65)) goto L59;
         */
        @Override // p001o.iqi.AbstractC14349b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo32594d(int i, byte[] bArr, int i2, int i3) {
            byte bM16481s;
            long j;
            if ((i2 | i3 | (bArr.length - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long j2 = i2;
            long j3 = i3;
            if (i != 0) {
                if (j2 >= j3) {
                    return i;
                }
                byte b = (byte) i;
                if (b < -32) {
                    if (b >= -62) {
                        long j4 = 1 + j2;
                        if (a5i.m16481s(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bM16481s2 = (byte) (~(i >> 8));
                    if (bM16481s2 == 0) {
                        long j5 = j2 + 1;
                        bM16481s2 = a5i.m16481s(bArr, j2);
                        if (j5 >= j3) {
                            return iqi.m32568j(b, bM16481s2);
                        }
                        j2 = j5;
                    }
                    if (bM16481s2 <= -65 && ((b != -32 || bM16481s2 >= -96) && (b != -19 || bM16481s2 < -96))) {
                        j = j2 + 1;
                    }
                    return -1;
                }
                byte bM16481s3 = (byte) (~(i >> 8));
                if (bM16481s3 == 0) {
                    long j6 = j2 + 1;
                    bM16481s3 = a5i.m16481s(bArr, j2);
                    if (j6 >= j3) {
                        return iqi.m32568j(b, bM16481s3);
                    }
                    bM16481s = 0;
                    j2 = j6;
                } else {
                    bM16481s = (byte) (i >> 16);
                }
                if (bM16481s == 0) {
                    long j7 = j2 + 1;
                    bM16481s = a5i.m16481s(bArr, j2);
                    if (j7 >= j3) {
                        return iqi.m32569k(b, bM16481s3, bM16481s);
                    }
                    j2 = j7;
                }
                if (bM16481s3 <= -65 && (((b << 28) + (bM16481s3 + 112)) >> 30) == 0 && bM16481s <= -65) {
                    j = j2 + 1;
                }
                return -1;
                j2 = j;
            }
            return m32598f(bArr, j2, (int) (j3 - j2));
        }
    }

    static {
        f29101a = (!C14352e.m32597e() || cd0.m20878c()) ? new C14350c() : new C14352e();
    }

    /* renamed from: e */
    public static String m32563e(byte[] bArr, int i, int i2) {
        return f29101a.mo32591a(bArr, i, i2);
    }

    /* renamed from: f */
    public static int m32564f(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f29101a.mo32592b(charSequence, bArr, i, i2);
    }

    /* renamed from: g */
    public static int m32565g(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iM32566h = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iM32566h += m32566h(charSequence, i);
                    break;
                }
                iM32566h += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iM32566h >= length) {
            return iM32566h;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iM32566h + 4294967296L));
    }

    /* renamed from: h */
    public static int m32566h(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new C14351d(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    /* renamed from: i */
    public static int m32567i(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: j */
    public static int m32568j(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: k */
    public static int m32569k(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: l */
    public static int m32570l(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m32567i(b);
        }
        if (i3 == 1) {
            return m32568j(b, bArr[i]);
        }
        if (i3 == 2) {
            return m32569k(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: m */
    public static boolean m32571m(byte[] bArr) {
        return f29101a.m32593c(bArr, 0, bArr.length);
    }

    /* renamed from: n */
    public static boolean m32572n(byte[] bArr, int i, int i2) {
        return f29101a.m32593c(bArr, i, i2);
    }
}

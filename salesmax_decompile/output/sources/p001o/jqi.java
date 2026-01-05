package p001o;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public abstract class jqi {

    /* renamed from: a */
    public static final AbstractC14630b f30967a;

    /* renamed from: o.jqi$a */
    public static class C14629a {
        /* renamed from: h */
        public static void m34311h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws ct8 {
            if (m34316m(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m34316m(b3) || m34316m(b4)) {
                throw ct8.m21766d();
            }
            int iM34321r = ((b & 7) << 18) | (m34321r(b2) << 12) | (m34321r(b3) << 6) | m34321r(b4);
            cArr[i] = m34315l(iM34321r);
            cArr[i + 1] = m34320q(iM34321r);
        }

        /* renamed from: i */
        public static void m34312i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* renamed from: j */
        public static void m34313j(byte b, byte b2, byte b3, char[] cArr, int i) throws ct8 {
            if (m34316m(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m34316m(b3)))) {
                throw ct8.m21766d();
            }
            cArr[i] = (char) (((b & 15) << 12) | (m34321r(b2) << 6) | m34321r(b3));
        }

        /* renamed from: k */
        public static void m34314k(byte b, byte b2, char[] cArr, int i) throws ct8 {
            if (b < -62 || m34316m(b2)) {
                throw ct8.m21766d();
            }
            cArr[i] = (char) (((b & 31) << 6) | m34321r(b2));
        }

        /* renamed from: l */
        public static char m34315l(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        /* renamed from: m */
        public static boolean m34316m(byte b) {
            return b > -65;
        }

        /* renamed from: n */
        public static boolean m34317n(byte b) {
            return b >= 0;
        }

        /* renamed from: o */
        public static boolean m34318o(byte b) {
            return b < -16;
        }

        /* renamed from: p */
        public static boolean m34319p(byte b) {
            return b < -32;
        }

        /* renamed from: q */
        public static char m34320q(int i) {
            return (char) ((i & 1023) + 56320);
        }

        /* renamed from: r */
        public static int m34321r(byte b) {
            return b & 63;
        }
    }

    /* renamed from: o.jqi$b */
    public static abstract class AbstractC14630b {
        /* renamed from: j */
        public static int m34322j(ByteBuffer byteBuffer, int i, int i2) {
            int iM34295l = i + jqi.m34295l(byteBuffer, i, i2);
            while (iM34295l < i2) {
                int i3 = iM34295l + 1;
                byte b = byteBuffer.get(iM34295l);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        i3++;
                    } else {
                        if (b >= -16) {
                            if (i3 >= i2 - 2) {
                                return jqi.m34299p(byteBuffer, b, i3, i2 - i3);
                            }
                            int i4 = i3 + 1;
                            byte b2 = byteBuffer.get(i3);
                            if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                                int i5 = i4 + 1;
                                if (byteBuffer.get(i4) <= -65) {
                                    i3 = i5 + 1;
                                    if (byteBuffer.get(i5) > -65) {
                                    }
                                }
                            }
                            return -1;
                        }
                        if (i3 >= i2 - 1) {
                            return jqi.m34299p(byteBuffer, b, i3, i2 - i3);
                        }
                        int i6 = i3 + 1;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(i6) > -65))) {
                            return -1;
                        }
                        iM34295l = i6 + 1;
                    }
                }
                iM34295l = i3;
            }
            return 0;
        }

        /* renamed from: a */
        public final String m34323a(ByteBuffer byteBuffer, int i, int i2) {
            if (byteBuffer.hasArray()) {
                return mo34324b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            return byteBuffer.isDirect() ? mo34326d(byteBuffer, i, i2) : m34325c(byteBuffer, i, i2);
        }

        /* renamed from: b */
        public abstract String mo34324b(byte[] bArr, int i, int i2);

        /* renamed from: c */
        public final String m34325c(ByteBuffer byteBuffer, int i, int i2) throws ct8 {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!C14629a.m34317n(b)) {
                    break;
                }
                i++;
                C14629a.m34312i(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (C14629a.m34317n(b2)) {
                    int i7 = i5 + 1;
                    C14629a.m34312i(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = byteBuffer.get(i6);
                        if (!C14629a.m34317n(b3)) {
                            break;
                        }
                        i6++;
                        C14629a.m34312i(b3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (C14629a.m34319p(b2)) {
                    if (i6 >= i3) {
                        throw ct8.m21766d();
                    }
                    C14629a.m34314k(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (C14629a.m34318o(b2)) {
                    if (i6 >= i3 - 1) {
                        throw ct8.m21766d();
                    }
                    int i8 = i6 + 1;
                    C14629a.m34313j(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw ct8.m21766d();
                    }
                    int i9 = i6 + 1;
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i9 + 1;
                    C14629a.m34311h(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }

        /* renamed from: d */
        public abstract String mo34326d(ByteBuffer byteBuffer, int i, int i2);

        /* renamed from: e */
        public abstract int mo34327e(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: f */
        public final boolean m34328f(ByteBuffer byteBuffer, int i, int i2) {
            return m34330h(0, byteBuffer, i, i2) == 0;
        }

        /* renamed from: g */
        public final boolean m34329g(byte[] bArr, int i, int i2) {
            return mo34331i(0, bArr, i, i2) == 0;
        }

        /* renamed from: h */
        public final int m34330h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? mo34333l(i, byteBuffer, i2, i3) : m34332k(i, byteBuffer, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return mo34331i(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
        }

        /* renamed from: i */
        public abstract int mo34331i(int i, byte[] bArr, int i2, int i3);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int m34332k(int i, ByteBuffer byteBuffer, int i2, int i3) {
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
                        byte b4 = byteBuffer.get(i2);
                        if (i6 >= i3) {
                            return jqi.m34297n(b2, b4);
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
                    b5 = byteBuffer.get(i2);
                    if (i4 >= i3) {
                        return jqi.m34297n(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i7 = i4 + 1;
                    byte b6 = byteBuffer.get(i4);
                    if (i7 >= i3) {
                        return jqi.m34298o(b2, b5, b6);
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
            return m34322j(byteBuffer, i2, i3);
        }

        /* renamed from: l */
        public abstract int mo34333l(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* renamed from: o.jqi$c */
    public static final class C14631c extends AbstractC14630b {
        /* renamed from: m */
        public static int m34334m(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m34335n(bArr, i, i2);
        }

        /* renamed from: n */
        public static int m34335n(byte[] bArr, int i, int i2) {
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
                            return jqi.m34300q(bArr, i3, i2);
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
                        return jqi.m34300q(bArr, i3, i2);
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

        @Override // p001o.jqi.AbstractC14630b
        /* renamed from: b */
        public String mo34324b(byte[] bArr, int i, int i2) throws ct8 {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!C14629a.m34317n(b)) {
                    break;
                }
                i++;
                C14629a.m34312i(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (C14629a.m34317n(b2)) {
                    int i7 = i5 + 1;
                    C14629a.m34312i(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = bArr[i6];
                        if (!C14629a.m34317n(b3)) {
                            break;
                        }
                        i6++;
                        C14629a.m34312i(b3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (C14629a.m34319p(b2)) {
                    if (i6 >= i3) {
                        throw ct8.m21766d();
                    }
                    C14629a.m34314k(b2, bArr[i6], cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (C14629a.m34318o(b2)) {
                    if (i6 >= i3 - 1) {
                        throw ct8.m21766d();
                    }
                    int i8 = i6 + 1;
                    C14629a.m34313j(b2, bArr[i6], bArr[i8], cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw ct8.m21766d();
                    }
                    int i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    int i10 = i9 + 1;
                    C14629a.m34311h(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // p001o.jqi.AbstractC14630b
        /* renamed from: d */
        public String mo34326d(ByteBuffer byteBuffer, int i, int i2) {
            return m34325c(byteBuffer, i, i2);
        }

        @Override // p001o.jqi.AbstractC14630b
        /* renamed from: e */
        public int mo34327e(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                                    throw new C14632d(i7, length);
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
                            throw new C14632d(i7 - 1, length);
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
        @Override // p001o.jqi.AbstractC14630b
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo34331i(int i, byte[] bArr, int i2, int i3) {
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
                            return jqi.m34297n(b2, b4);
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
                        return jqi.m34297n(b2, b5);
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
                        return jqi.m34298o(b2, b5, b6);
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
            return m34334m(bArr, i2, i3);
        }

        @Override // p001o.jqi.AbstractC14630b
        /* renamed from: l */
        public int mo34333l(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return m34332k(i, byteBuffer, i2, i3);
        }
    }

    /* renamed from: o.jqi$d */
    public static class C14632d extends IllegalArgumentException {
        public C14632d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* renamed from: o.jqi$e */
    public static final class C14633e extends AbstractC14630b {
        /* renamed from: m */
        public static boolean m34336m() {
            return z4i.m58697I() && z4i.m58698J();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
        
            return -1;
         */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m34337n(long j, int i) {
            long j2;
            int iM34339p = m34339p(j, i);
            long j3 = j + iM34339p;
            int i2 = i - iM34339p;
            while (true) {
                byte bM58735w = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    bM58735w = z4i.m58735w(j3);
                    if (bM58735w < 0) {
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
                if (bM58735w >= -32) {
                    if (bM58735w >= -16) {
                        if (i3 >= 3) {
                            i2 = i3 - 3;
                            long j5 = j3 + 1;
                            byte bM58735w2 = z4i.m58735w(j3);
                            if (bM58735w2 <= -65 && (((bM58735w << 28) + (bM58735w2 + 112)) >> 30) == 0) {
                                long j6 = j5 + 1;
                                if (z4i.m58735w(j5) > -65) {
                                    break;
                                }
                                j2 = 1 + j6;
                                if (z4i.m58735w(j6) > -65) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            return m34341r(j3, bM58735w, i3);
                        }
                    } else {
                        if (i3 < 2) {
                            return m34341r(j3, bM58735w, i3);
                        }
                        i2 = i3 - 2;
                        long j7 = j3 + 1;
                        byte bM58735w3 = z4i.m58735w(j3);
                        if (bM58735w3 > -65 || ((bM58735w == -32 && bM58735w3 < -96) || (bM58735w == -19 && bM58735w3 >= -96))) {
                            break;
                        }
                        j2 = 1 + j7;
                        if (z4i.m58735w(j7) > -65) {
                            break;
                        }
                    }
                } else if (i3 != 0) {
                    i2 = i3 - 1;
                    if (bM58735w < -62) {
                        break;
                    }
                    j2 = 1 + j3;
                    if (z4i.m58735w(j3) > -65) {
                        break;
                    }
                } else {
                    return bM58735w;
                }
                j3 = j2;
            }
            return -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
        
            return -1;
         */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m34338o(byte[] bArr, long j, int i) {
            long j2;
            int iM34340q = m34340q(bArr, j, i);
            int i2 = i - iM34340q;
            long j3 = j + iM34340q;
            while (true) {
                byte bM58736x = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    bM58736x = z4i.m58736x(bArr, j3);
                    if (bM58736x < 0) {
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
                if (bM58736x >= -32) {
                    if (bM58736x >= -16) {
                        if (i3 >= 3) {
                            i2 = i3 - 3;
                            long j5 = j3 + 1;
                            byte bM58736x2 = z4i.m58736x(bArr, j3);
                            if (bM58736x2 <= -65 && (((bM58736x << 28) + (bM58736x2 + 112)) >> 30) == 0) {
                                long j6 = j5 + 1;
                                if (z4i.m58736x(bArr, j5) > -65) {
                                    break;
                                }
                                j2 = 1 + j6;
                                if (z4i.m58736x(bArr, j6) > -65) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            return m34342s(bArr, bM58736x, j3, i3);
                        }
                    } else {
                        if (i3 < 2) {
                            return m34342s(bArr, bM58736x, j3, i3);
                        }
                        i2 = i3 - 2;
                        long j7 = j3 + 1;
                        byte bM58736x3 = z4i.m58736x(bArr, j3);
                        if (bM58736x3 > -65 || ((bM58736x == -32 && bM58736x3 < -96) || (bM58736x == -19 && bM58736x3 >= -96))) {
                            break;
                        }
                        j2 = 1 + j7;
                        if (z4i.m58736x(bArr, j7) > -65) {
                            break;
                        }
                    }
                } else if (i3 != 0) {
                    i2 = i3 - 1;
                    if (bM58736x < -62) {
                        break;
                    }
                    j2 = 1 + j3;
                    if (z4i.m58736x(bArr, j3) > -65) {
                        break;
                    }
                } else {
                    return bM58736x;
                }
                j3 = j2;
            }
            return -1;
        }

        /* renamed from: p */
        public static int m34339p(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = 8 - (((int) j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (z4i.m58735w(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (z4i.m58692D(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* renamed from: q */
        public static int m34340q(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (z4i.m58736x(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        /* renamed from: r */
        public static int m34341r(long j, int i, int i2) {
            if (i2 == 0) {
                return jqi.m34296m(i);
            }
            if (i2 == 1) {
                return jqi.m34297n(i, z4i.m58735w(j));
            }
            if (i2 == 2) {
                return jqi.m34298o(i, z4i.m58735w(j), z4i.m58735w(j + 1));
            }
            throw new AssertionError();
        }

        /* renamed from: s */
        public static int m34342s(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return jqi.m34296m(i);
            }
            if (i2 == 1) {
                return jqi.m34297n(i, z4i.m58736x(bArr, j));
            }
            if (i2 == 2) {
                return jqi.m34298o(i, z4i.m58736x(bArr, j), z4i.m58736x(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // p001o.jqi.AbstractC14630b
        /* renamed from: b */
        public String mo34324b(byte[] bArr, int i, int i2) throws ct8 {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte bM58736x = z4i.m58736x(bArr, i);
                if (!C14629a.m34317n(bM58736x)) {
                    break;
                }
                i++;
                C14629a.m34312i(bM58736x, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte bM58736x2 = z4i.m58736x(bArr, i);
                if (C14629a.m34317n(bM58736x2)) {
                    int i7 = i5 + 1;
                    C14629a.m34312i(bM58736x2, cArr, i5);
                    while (i6 < i3) {
                        byte bM58736x3 = z4i.m58736x(bArr, i6);
                        if (!C14629a.m34317n(bM58736x3)) {
                            break;
                        }
                        i6++;
                        C14629a.m34312i(bM58736x3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (C14629a.m34319p(bM58736x2)) {
                    if (i6 >= i3) {
                        throw ct8.m21766d();
                    }
                    C14629a.m34314k(bM58736x2, z4i.m58736x(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (C14629a.m34318o(bM58736x2)) {
                    if (i6 >= i3 - 1) {
                        throw ct8.m21766d();
                    }
                    int i8 = i6 + 1;
                    C14629a.m34313j(bM58736x2, z4i.m58736x(bArr, i6), z4i.m58736x(bArr, i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw ct8.m21766d();
                    }
                    int i9 = i6 + 1;
                    byte bM58736x4 = z4i.m58736x(bArr, i6);
                    int i10 = i9 + 1;
                    C14629a.m34311h(bM58736x2, bM58736x4, z4i.m58736x(bArr, i9), z4i.m58736x(bArr, i10), cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // p001o.jqi.AbstractC14630b
        /* renamed from: d */
        public String mo34326d(ByteBuffer byteBuffer, int i, int i2) throws ct8 {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long jM58723k = z4i.m58723k(byteBuffer) + i;
            long j = i2 + jM58723k;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (jM58723k < j) {
                byte bM58735w = z4i.m58735w(jM58723k);
                if (!C14629a.m34317n(bM58735w)) {
                    break;
                }
                jM58723k++;
                C14629a.m34312i(bM58735w, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (jM58723k < j) {
                long j2 = jM58723k + 1;
                byte bM58735w2 = z4i.m58735w(jM58723k);
                if (C14629a.m34317n(bM58735w2)) {
                    int i5 = i4 + 1;
                    C14629a.m34312i(bM58735w2, cArr, i4);
                    while (j2 < j) {
                        byte bM58735w3 = z4i.m58735w(j2);
                        if (!C14629a.m34317n(bM58735w3)) {
                            break;
                        }
                        j2++;
                        C14629a.m34312i(bM58735w3, cArr, i5);
                        i5++;
                    }
                    i4 = i5;
                    jM58723k = j2;
                } else if (C14629a.m34319p(bM58735w2)) {
                    if (j2 >= j) {
                        throw ct8.m21766d();
                    }
                    C14629a.m34314k(bM58735w2, z4i.m58735w(j2), cArr, i4);
                    i4++;
                    jM58723k = j2 + 1;
                } else if (C14629a.m34318o(bM58735w2)) {
                    if (j2 >= j - 1) {
                        throw ct8.m21766d();
                    }
                    long j3 = j2 + 1;
                    C14629a.m34313j(bM58735w2, z4i.m58735w(j2), z4i.m58735w(j3), cArr, i4);
                    jM58723k = j3 + 1;
                    i4++;
                } else {
                    if (j2 >= j - 2) {
                        throw ct8.m21766d();
                    }
                    long j4 = j2 + 1;
                    long j5 = j4 + 1;
                    C14629a.m34311h(bM58735w2, z4i.m58735w(j2), z4i.m58735w(j4), z4i.m58735w(j5), cArr, i4);
                    i4 = i4 + 1 + 1;
                    jM58723k = j5 + 1;
                }
            }
            return new String(cArr, 0, i4);
        }

        @Override // p001o.jqi.AbstractC14630b
        /* renamed from: e */
        public int mo34327e(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                z4i.m58703O(bArr, j4, (byte) cCharAt);
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
                    z4i.m58703O(bArr, j4, (byte) cCharAt2);
                    j3 = j;
                    j2 = j6;
                    c2 = c;
                } else if (cCharAt2 < 2048 && j4 <= j5 - 2) {
                    long j7 = j4 + j;
                    z4i.m58703O(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    long j8 = j7 + j;
                    z4i.m58703O(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                    long j9 = j;
                    c2 = 128;
                    j2 = j8;
                    j3 = j9;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        if (j4 > j5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                throw new C14632d(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                long j10 = j4 + 1;
                                z4i.m58703O(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j11 = j10 + 1;
                                c2 = 128;
                                z4i.m58703O(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = j11 + 1;
                                z4i.m58703O(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j12 + 1;
                                z4i.m58703O(bArr, j12, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C14632d(i4 - 1, length);
                    }
                    long j13 = j4 + j;
                    z4i.m58703O(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j14 = j13 + j;
                    z4i.m58703O(bArr, j13, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    z4i.m58703O(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
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
        
            if (p001o.z4i.m58736x(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (p001o.z4i.m58736x(r12, r0) > (-65)) goto L59;
         */
        @Override // p001o.jqi.AbstractC14630b
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo34331i(int i, byte[] bArr, int i2, int i3) {
            byte bM58736x;
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
                        if (z4i.m58736x(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bM58736x2 = (byte) (~(i >> 8));
                    if (bM58736x2 == 0) {
                        long j5 = j2 + 1;
                        bM58736x2 = z4i.m58736x(bArr, j2);
                        if (j5 >= j3) {
                            return jqi.m34297n(b, bM58736x2);
                        }
                        j2 = j5;
                    }
                    if (bM58736x2 <= -65 && ((b != -32 || bM58736x2 >= -96) && (b != -19 || bM58736x2 < -96))) {
                        j = j2 + 1;
                    }
                    return -1;
                }
                byte bM58736x3 = (byte) (~(i >> 8));
                if (bM58736x3 == 0) {
                    long j6 = j2 + 1;
                    bM58736x3 = z4i.m58736x(bArr, j2);
                    if (j6 >= j3) {
                        return jqi.m34297n(b, bM58736x3);
                    }
                    bM58736x = 0;
                    j2 = j6;
                } else {
                    bM58736x = (byte) (i >> 16);
                }
                if (bM58736x == 0) {
                    long j7 = j2 + 1;
                    bM58736x = z4i.m58736x(bArr, j2);
                    if (j7 >= j3) {
                        return jqi.m34298o(b, bM58736x3, bM58736x);
                    }
                    j2 = j7;
                }
                if (bM58736x3 <= -65 && (((b << 28) + (bM58736x3 + 112)) >> 30) == 0 && bM58736x <= -65) {
                    j = j2 + 1;
                }
                return -1;
                j2 = j;
            }
            return m34338o(bArr, j2, (int) (j3 - j2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (p001o.z4i.m58735w(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (p001o.z4i.m58735w(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (p001o.z4i.m58735w(r0) > (-65)) goto L57;
         */
        @Override // p001o.jqi.AbstractC14630b
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo34333l(int i, ByteBuffer byteBuffer, int i2, int i3) {
            byte bM58735w;
            long j;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long jM58723k = z4i.m58723k(byteBuffer) + i2;
            long j2 = (i3 - i2) + jM58723k;
            if (i != 0) {
                if (jM58723k >= j2) {
                    return i;
                }
                byte b = (byte) i;
                if (b < -32) {
                    if (b >= -62) {
                        j = 1 + jM58723k;
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bM58735w2 = (byte) (~(i >> 8));
                    if (bM58735w2 == 0) {
                        long j3 = jM58723k + 1;
                        bM58735w2 = z4i.m58735w(jM58723k);
                        if (j3 >= j2) {
                            return jqi.m34297n(b, bM58735w2);
                        }
                        jM58723k = j3;
                    }
                    if (bM58735w2 <= -65 && ((b != -32 || bM58735w2 >= -96) && (b != -19 || bM58735w2 < -96))) {
                        j = 1 + jM58723k;
                    }
                    return -1;
                }
                byte bM58735w3 = (byte) (~(i >> 8));
                if (bM58735w3 == 0) {
                    long j4 = jM58723k + 1;
                    bM58735w3 = z4i.m58735w(jM58723k);
                    if (j4 >= j2) {
                        return jqi.m34297n(b, bM58735w3);
                    }
                    bM58735w = 0;
                    jM58723k = j4;
                } else {
                    bM58735w = (byte) (i >> 16);
                }
                if (bM58735w == 0) {
                    long j5 = jM58723k + 1;
                    bM58735w = z4i.m58735w(jM58723k);
                    if (j5 >= j2) {
                        return jqi.m34298o(b, bM58735w3, bM58735w);
                    }
                    jM58723k = j5;
                }
                if (bM58735w3 <= -65 && (((b << 28) + (bM58735w3 + 112)) >> 30) == 0 && bM58735w <= -65) {
                    j = 1 + jM58723k;
                }
                return -1;
                jM58723k = j;
            }
            return m34337n(jM58723k, (int) (j2 - jM58723k));
        }
    }

    static {
        f30967a = (!C14633e.m34336m() || bd0.m18627c()) ? new C14631c() : new C14633e();
    }

    /* renamed from: g */
    public static String m34290g(ByteBuffer byteBuffer, int i, int i2) {
        return f30967a.m34323a(byteBuffer, i, i2);
    }

    /* renamed from: h */
    public static String m34291h(byte[] bArr, int i, int i2) {
        return f30967a.mo34324b(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m34292i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f30967a.mo34327e(charSequence, bArr, i, i2);
    }

    /* renamed from: j */
    public static int m34293j(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iM34294k = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iM34294k += m34294k(charSequence, i);
                    break;
                }
                iM34294k += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iM34294k >= length) {
            return iM34294k;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iM34294k + 4294967296L));
    }

    /* renamed from: k */
    public static int m34294k(CharSequence charSequence, int i) {
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
                        throw new C14632d(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    /* renamed from: l */
    public static int m34295l(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    /* renamed from: m */
    public static int m34296m(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: n */
    public static int m34297n(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: o */
    public static int m34298o(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: p */
    public static int m34299p(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return m34296m(i);
        }
        if (i3 == 1) {
            return m34297n(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return m34298o(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    /* renamed from: q */
    public static int m34300q(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m34296m(b);
        }
        if (i3 == 1) {
            return m34297n(b, bArr[i]);
        }
        if (i3 == 2) {
            return m34298o(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: r */
    public static boolean m34301r(ByteBuffer byteBuffer) {
        return f30967a.m34328f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: s */
    public static boolean m34302s(byte[] bArr) {
        return f30967a.m34329g(bArr, 0, bArr.length);
    }

    /* renamed from: t */
    public static boolean m34303t(byte[] bArr, int i, int i2) {
        return f30967a.m34329g(bArr, i, i2);
    }
}

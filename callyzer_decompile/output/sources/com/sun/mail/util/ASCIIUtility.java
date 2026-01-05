package com.sun.mail.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class ASCIIUtility {
    private ASCIIUtility() {
    }

    public static byte[] getBytes(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) charArray[i10];
        }
        return bArr;
    }

    public static int parseInt(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        boolean z6;
        if (bArr == null) {
            throw new NumberFormatException("null");
        }
        if (i11 <= i10) {
            throw new NumberFormatException("illegal number");
        }
        int i15 = 0;
        if (bArr[i10] == 45) {
            i14 = i10 + 1;
            i13 = Integer.MIN_VALUE;
            z6 = true;
        } else {
            i13 = -2147483647;
            i14 = i10;
            z6 = false;
        }
        int i16 = i13 / i12;
        if (i14 < i11) {
            int i17 = i14 + 1;
            int iDigit = Character.digit((char) bArr[i14], i12);
            if (iDigit < 0) {
                throw new NumberFormatException("illegal number: " + toString(bArr, i10, i11));
            }
            i15 = -iDigit;
            i14 = i17;
        }
        while (i14 < i11) {
            int i18 = i14 + 1;
            int iDigit2 = Character.digit((char) bArr[i14], i12);
            if (iDigit2 < 0) {
                throw new NumberFormatException("illegal number");
            }
            if (i15 < i16) {
                throw new NumberFormatException("illegal number");
            }
            int i19 = i15 * i12;
            if (i19 < i13 + iDigit2) {
                throw new NumberFormatException("illegal number");
            }
            i15 = i19 - iDigit2;
            i14 = i18;
        }
        if (!z6) {
            return -i15;
        }
        if (i14 > i10 + 1) {
            return i15;
        }
        throw new NumberFormatException("illegal number");
    }

    public static long parseLong(byte[] bArr, int i10, int i11, int i12) {
        long j6;
        boolean z6;
        int i13;
        long j10;
        if (bArr == null) {
            throw new NumberFormatException("null");
        }
        if (i11 <= i10) {
            throw new NumberFormatException("illegal number");
        }
        if (bArr[i10] == 45) {
            i13 = i10 + 1;
            j6 = Long.MIN_VALUE;
            z6 = true;
        } else {
            j6 = -9223372036854775807L;
            z6 = false;
            i13 = i10;
        }
        long j11 = i12;
        long j12 = j6 / j11;
        if (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit = Character.digit((char) bArr[i13], i12);
            if (iDigit < 0) {
                throw new NumberFormatException("illegal number: " + toString(bArr, i10, i11));
            }
            j10 = -iDigit;
            i13 = i14;
        } else {
            j10 = 0;
        }
        while (i13 < i11) {
            int i15 = i13 + 1;
            int iDigit2 = Character.digit((char) bArr[i13], i12);
            if (iDigit2 < 0) {
                throw new NumberFormatException("illegal number");
            }
            if (j10 < j12) {
                throw new NumberFormatException("illegal number");
            }
            long j13 = j10 * j11;
            long j14 = j6;
            long j15 = iDigit2;
            if (j13 < j14 + j15) {
                throw new NumberFormatException("illegal number");
            }
            j10 = j13 - j15;
            i13 = i15;
            j6 = j14;
        }
        if (!z6) {
            return -j10;
        }
        if (i13 > i10 + 1) {
            return j10;
        }
        throw new NumberFormatException("illegal number");
    }

    public static String toString(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        char[] cArr = new char[i12];
        int i13 = 0;
        while (i13 < i12) {
            cArr[i13] = (char) (bArr[i10] & 255);
            i13++;
            i10++;
        }
        return new String(cArr);
    }

    public static String toString(byte[] bArr) {
        return toString(bArr, 0, bArr.length);
    }

    public static byte[] getBytes(InputStream inputStream) throws IOException {
        if (inputStream instanceof ByteArrayInputStream) {
            int iAvailable = inputStream.available();
            byte[] bArr = new byte[iAvailable];
            inputStream.read(bArr, 0, iAvailable);
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr2, 0, 1024);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String toString(ByteArrayInputStream byteArrayInputStream) {
        int iAvailable = byteArrayInputStream.available();
        char[] cArr = new char[iAvailable];
        byte[] bArr = new byte[iAvailable];
        byteArrayInputStream.read(bArr, 0, iAvailable);
        for (int i10 = 0; i10 < iAvailable; i10++) {
            cArr[i10] = (char) (bArr[i10] & 255);
        }
        return new String(cArr);
    }

    public static int parseInt(byte[] bArr, int i10, int i11) {
        return parseInt(bArr, i10, i11, 10);
    }

    public static long parseLong(byte[] bArr, int i10, int i11) {
        return parseLong(bArr, i10, i11, 10);
    }
}

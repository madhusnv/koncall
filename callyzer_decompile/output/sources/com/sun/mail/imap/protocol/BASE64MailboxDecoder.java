package com.sun.mail.imap.protocol;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class BASE64MailboxDecoder {
    static final char[] pem_array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', ','};
    private static final byte[] pem_convert_array = new byte[256];

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 255; i11++) {
            pem_convert_array[i11] = -1;
        }
        while (true) {
            char[] cArr = pem_array;
            if (i10 >= cArr.length) {
                return;
            }
            pem_convert_array[cArr[i10]] = (byte) i10;
            i10++;
        }
    }

    public static int base64decode(char[] cArr, int i10, CharacterIterator characterIterator) {
        boolean z6 = true;
        int i11 = -1;
        while (true) {
            byte next = (byte) characterIterator.next();
            if (next == -1) {
                break;
            }
            if (next != 45) {
                byte next2 = (byte) characterIterator.next();
                if (next2 == -1 || next2 == 45) {
                    break;
                }
                byte[] bArr = pem_convert_array;
                byte b10 = bArr[next & 255];
                byte b11 = bArr[next2 & 255];
                byte b12 = (byte) (((b10 << 2) & 252) | ((b11 >>> 4) & 3));
                if (i11 != -1) {
                    cArr[i10] = (char) ((i11 << 8) | (b12 & 255));
                    i11 = -1;
                    i10++;
                } else {
                    i11 = b12 & 255;
                }
                byte next3 = (byte) characterIterator.next();
                if (next3 != 61) {
                    if (next3 == -1 || next3 == 45) {
                        break;
                    }
                    byte b13 = bArr[next3 & 255];
                    byte b14 = (byte) (((b11 << 4) & 240) | ((b13 >>> 2) & 15));
                    if (i11 != -1) {
                        cArr[i10] = (char) ((b14 & 255) | (i11 << 8));
                        i11 = -1;
                        i10++;
                    } else {
                        i11 = b14 & 255;
                    }
                    byte next4 = (byte) characterIterator.next();
                    if (next4 == 61) {
                        continue;
                    } else {
                        if (next4 == -1 || next4 == 45) {
                            break;
                        }
                        byte b15 = (byte) ((bArr[next4 & 255] & 63) | ((b13 << 6) & BERTags.PRIVATE));
                        if (i11 != -1) {
                            cArr[i10] = (char) ((b15 & 255) | (i11 << 8));
                            i11 = -1;
                            i10++;
                        } else {
                            i11 = b15 & 255;
                        }
                    }
                }
                z6 = false;
            } else if (z6) {
                int i12 = i10 + 1;
                cArr[i10] = '&';
                return i12;
            }
        }
        return i10;
    }

    public static String decode(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] cArr = new char[str.length()];
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        boolean z6 = false;
        int iBase64decode = 0;
        for (char cFirst = stringCharacterIterator.first(); cFirst != 65535; cFirst = stringCharacterIterator.next()) {
            if (cFirst == '&') {
                z6 = true;
                iBase64decode = base64decode(cArr, iBase64decode, stringCharacterIterator);
            } else {
                cArr[iBase64decode] = cFirst;
                iBase64decode++;
            }
        }
        return z6 ? new String(cArr, 0, iBase64decode) : str;
    }
}

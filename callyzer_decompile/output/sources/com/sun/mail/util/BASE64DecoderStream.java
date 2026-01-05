package com.sun.mail.util;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class BASE64DecoderStream extends FilterInputStream {
    private static final char[] pem_array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] pem_convert_array = new byte[256];
    private byte[] buffer;
    private int bufsize;
    private boolean ignoreErrors;
    private int index;
    private byte[] input_buffer;
    private int input_len;
    private int input_pos;

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

    public BASE64DecoderStream(InputStream inputStream) {
        super(inputStream);
        this.buffer = new byte[3];
        this.bufsize = 0;
        this.index = 0;
        this.input_buffer = new byte[8190];
        this.input_pos = 0;
        this.input_len = 0;
        this.ignoreErrors = false;
        this.ignoreErrors = PropUtil.getBooleanSystemProperty("mail.mime.base64.ignoreerrors", false);
    }

    private int decode(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10;
        while (i11 >= 3) {
            boolean z6 = false;
            int i13 = 0;
            int i14 = 0;
            while (i13 < 4) {
                int i15 = getByte();
                if (i15 == -1 || i15 == -2) {
                    if (i15 == -1) {
                        if (i13 == 0) {
                            return i12 - i10;
                        }
                        if (!this.ignoreErrors) {
                            StringBuilder sbM4567n = AbstractC1452a.m4567n(i13, "BASE64Decoder: Error in encoded stream: needed 4 valid base64 characters but only got ", " before EOF");
                            sbM4567n.append(recentChars());
                            throw new DecodingException(sbM4567n.toString());
                        }
                        z6 = true;
                    } else {
                        if (i13 < 2 && !this.ignoreErrors) {
                            StringBuilder sbM4567n2 = AbstractC1452a.m4567n(i13, "BASE64Decoder: Error in encoded stream: needed at least 2 valid base64 characters, but only got ", " before padding character (=)");
                            sbM4567n2.append(recentChars());
                            throw new DecodingException(sbM4567n2.toString());
                        }
                        if (i13 == 0) {
                            return i12 - i10;
                        }
                    }
                    int i16 = i13 - 1;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = i14 << 6;
                    for (int i18 = i13 + 1; i18 < 4; i18++) {
                        if (!z6) {
                            int i19 = getByte();
                            if (i19 == -1) {
                                if (!this.ignoreErrors) {
                                    throw new DecodingException("BASE64Decoder: Error in encoded stream: hit EOF while looking for padding characters (=)" + recentChars());
                                }
                            } else if (i19 != -2 && !this.ignoreErrors) {
                                throw new DecodingException("BASE64Decoder: Error in encoded stream: found valid base64 character after a padding character (=)" + recentChars());
                            }
                        }
                        i17 <<= 6;
                    }
                    int i20 = i17 >> 8;
                    if (i16 == 2) {
                        bArr[i12 + 1] = (byte) (i20 & 255);
                    }
                    bArr[i12] = (byte) ((i17 >> 16) & 255);
                    return (i12 + i16) - i10;
                }
                i13++;
                i14 = (i14 << 6) | i15;
            }
            bArr[i12 + 2] = (byte) (i14 & 255);
            bArr[i12 + 1] = (byte) ((i14 >> 8) & 255);
            bArr[i12] = (byte) ((i14 >> 16) & 255);
            i11 -= 3;
            i12 += 3;
        }
        return i12 - i10;
    }

    private int getByte() throws IOException {
        byte b10;
        do {
            if (this.input_pos >= this.input_len) {
                try {
                    int i10 = ((FilterInputStream) this).in.read(this.input_buffer);
                    this.input_len = i10;
                    if (i10 <= 0) {
                        return -1;
                    }
                    this.input_pos = 0;
                } catch (EOFException unused) {
                    return -1;
                }
            }
            byte[] bArr = this.input_buffer;
            int i11 = this.input_pos;
            this.input_pos = i11 + 1;
            int i12 = bArr[i11] & 255;
            if (i12 == 61) {
                return -2;
            }
            b10 = pem_convert_array[i12];
        } while (b10 == -1);
        return b10;
    }

    private String recentChars() {
        String strM4561h;
        int i10 = this.input_pos;
        if (i10 > 10) {
            i10 = 10;
        }
        if (i10 <= 0) {
            return "";
        }
        String strM11232c = AbstractC5601a.m11232c(i10, ", the ", " most recent characters were: \"");
        for (int i11 = this.input_pos - i10; i11 < this.input_pos; i11++) {
            char c2 = (char) (this.input_buffer[i11] & 255);
            if (c2 == '\t') {
                strM4561h = AbstractC1452a.m4561h(strM11232c, "\\t");
            } else if (c2 == '\n') {
                strM4561h = AbstractC1452a.m4561h(strM11232c, "\\n");
            } else if (c2 == '\r') {
                strM4561h = AbstractC1452a.m4561h(strM11232c, "\\r");
            } else if (c2 < ' ' || c2 >= 127) {
                strM4561h = strM11232c + "\\" + ((int) c2);
            } else {
                strM4561h = strM11232c + c2;
            }
            strM11232c = strM4561h;
        }
        return AbstractC1452a.m4561h(strM11232c, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return (this.bufsize - this.index) + ((((FilterInputStream) this).in.available() * 3) / 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.index >= this.bufsize) {
            byte[] bArr = this.buffer;
            int iDecode = decode(bArr, 0, bArr.length);
            this.bufsize = iDecode;
            if (iDecode <= 0) {
                return -1;
            }
            this.index = 0;
        }
        byte[] bArr2 = this.buffer;
        int i10 = this.index;
        this.index = i10 + 1;
        return bArr2[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j6) {
        long j10 = 0;
        while (true) {
            long j11 = j6 - 1;
            if (j6 <= 0 || read() < 0) {
                break;
            }
            j10++;
            j6 = j11;
        }
        return j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        if (i11 == 0) {
            return 0;
        }
        int i14 = i10;
        while (true) {
            i12 = this.index;
            i13 = this.bufsize;
            if (i12 >= i13 || i11 <= 0) {
                break;
            }
            byte[] bArr2 = this.buffer;
            this.index = i12 + 1;
            bArr[i14] = bArr2[i12];
            i11--;
            i14++;
        }
        if (i12 >= i13) {
            this.index = 0;
            this.bufsize = 0;
        }
        int i15 = (i11 / 3) * 3;
        if (i15 > 0) {
            int iDecode = decode(bArr, i14, i15);
            i14 += iDecode;
            i11 -= iDecode;
            if (iDecode != i15) {
                if (i14 == i10) {
                    return -1;
                }
                return i14 - i10;
            }
        }
        while (i11 > 0) {
            int i16 = read();
            if (i16 == -1) {
                break;
            }
            bArr[i14] = (byte) i16;
            i11--;
            i14++;
        }
        if (i14 == i10) {
            return -1;
        }
        return i14 - i10;
    }

    public BASE64DecoderStream(InputStream inputStream, boolean z6) {
        super(inputStream);
        this.buffer = new byte[3];
        this.bufsize = 0;
        this.index = 0;
        this.input_buffer = new byte[8190];
        this.input_pos = 0;
        this.input_len = 0;
        this.ignoreErrors = z6;
    }

    public static byte[] decode(byte[] bArr) {
        int i10;
        int length = (bArr.length / 4) * 3;
        if (length == 0) {
            return bArr;
        }
        if (bArr[bArr.length - 1] == 61) {
            length = bArr[bArr.length - 2] == 61 ? length - 2 : length - 1;
        }
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (length2 > 0) {
            byte[] bArr3 = pem_convert_array;
            int i13 = i11 + 2;
            int i14 = (bArr3[bArr[i11 + 1] & 255] | (bArr3[bArr[i11] & 255] << 6)) << 6;
            byte b10 = bArr[i13];
            if (b10 != 61) {
                i13 = i11 + 3;
                i14 |= bArr3[b10 & 255];
                i10 = 3;
            } else {
                i10 = 2;
            }
            int i15 = i14 << 6;
            byte b11 = bArr[i13];
            if (b11 != 61) {
                i13++;
                i15 |= bArr3[b11 & 255];
            } else {
                i10--;
            }
            if (i10 > 2) {
                bArr2[i12 + 2] = (byte) (i15 & 255);
            }
            int i16 = i15 >> 8;
            if (i10 > 1) {
                bArr2[i12 + 1] = (byte) (i16 & 255);
            }
            bArr2[i12] = (byte) ((i15 >> 16) & 255);
            i12 += i10;
            length2 -= 4;
            i11 = i13;
        }
        return bArr2;
    }
}

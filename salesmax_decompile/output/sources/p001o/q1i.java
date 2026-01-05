package p001o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public final class q1i extends Writer {

    /* renamed from: a */
    public final q68 f41145a;

    /* renamed from: b */
    public OutputStream f41146b;

    /* renamed from: c */
    public byte[] f41147c;

    /* renamed from: d */
    public final int f41148d;

    /* renamed from: e */
    public int f41149e = 0;

    /* renamed from: f */
    public int f41150f;

    public q1i(q68 q68Var, OutputStream outputStream) {
        this.f41145a = q68Var;
        this.f41146b = outputStream;
        this.f41147c = q68Var.m44852h();
        this.f41148d = r1.length - 4;
    }

    /* renamed from: c */
    public static void m44736c(int i) throws IOException {
        throw new IOException(m44737d(i));
    }

    /* renamed from: d */
    public static String m44737d(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        }
        if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
    }

    /* renamed from: a */
    public int m44738a(int i) throws IOException {
        int i2 = this.f41150f;
        this.f41150f = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + 65536 + (i - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f41146b;
        if (outputStream != null) {
            int i = this.f41149e;
            if (i > 0) {
                outputStream.write(this.f41147c, 0, i);
                this.f41149e = 0;
            }
            OutputStream outputStream2 = this.f41146b;
            this.f41146b = null;
            byte[] bArr = this.f41147c;
            if (bArr != null) {
                this.f41147c = null;
                this.f41145a.m44861q(bArr);
            }
            outputStream2.close();
            int i2 = this.f41150f;
            this.f41150f = 0;
            if (i2 > 0) {
                m44736c(i2);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f41146b;
        if (outputStream != null) {
            int i = this.f41149e;
            if (i > 0) {
                outputStream.write(this.f41147c, 0, i);
                this.f41149e = 0;
            }
            this.f41146b.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0025, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
                return;
            }
            return;
        }
        if (this.f41150f > 0) {
            i2--;
            write(m44738a(cArr[i]));
            i++;
        }
        int i3 = this.f41149e;
        byte[] bArr = this.f41147c;
        int i4 = this.f41148d;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.f41146b.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char c = cArr[i];
            if (c < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) c;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                while (true) {
                    i = i6;
                    i3 = i7;
                    if (i >= i10) {
                        break;
                    }
                    i6 = i + 1;
                    c = cArr[i];
                    if (c >= 128) {
                        break;
                    }
                    i7 = i3 + 1;
                    bArr[i3] = (byte) c;
                }
            }
            if (c < 2048) {
                int i11 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | Opcodes.CHECKCAST);
                i3 = i11 + 1;
                bArr[i11] = (byte) ((c & '?') | 128);
                i = i6;
            } else if (c < 55296 || c > 57343) {
                int i12 = i3 + 1;
                bArr[i3] = (byte) ((c >> '\f') | 224);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((c >> 6) & 63) | 128);
                bArr[i13] = (byte) ((c & '?') | 128);
                i = i6;
                i3 = i13 + 1;
            } else {
                if (c > 56319) {
                    this.f41149e = i3;
                    m44736c(c);
                }
                this.f41150f = c;
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                int iM44738a = m44738a(cArr[i6]);
                if (iM44738a > 1114111) {
                    this.f41149e = i3;
                    m44736c(iM44738a);
                }
                int i14 = i3 + 1;
                bArr[i3] = (byte) ((iM44738a >> 18) | 240);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((iM44738a >> 12) & 63) | 128);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((iM44738a >> 6) & 63) | 128);
                i3 = i16 + 1;
                bArr[i16] = (byte) ((iM44738a & 63) | 128);
            }
        }
        this.f41149e = i3;
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        int i2;
        if (this.f41150f > 0) {
            i = m44738a(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                m44736c(i);
            }
            this.f41150f = i;
            return;
        }
        int i3 = this.f41149e;
        if (i3 >= this.f41148d) {
            this.f41146b.write(this.f41147c, 0, i3);
            this.f41149e = 0;
        }
        if (i < 128) {
            byte[] bArr = this.f41147c;
            int i4 = this.f41149e;
            this.f41149e = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.f41149e;
        if (i < 2048) {
            byte[] bArr2 = this.f41147c;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | Opcodes.CHECKCAST);
            i2 = i6 + 1;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.f41147c;
            int i7 = i5 + 1;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            int i8 = i7 + 1;
            bArr3[i7] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i8] = (byte) ((i & 63) | 128);
            i2 = i8 + 1;
        } else {
            if (i > 1114111) {
                m44736c(i);
            }
            byte[] bArr4 = this.f41147c;
            int i9 = i5 + 1;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            int i10 = i9 + 1;
            bArr4[i9] = (byte) (((i >> 12) & 63) | 128);
            int i11 = i10 + 1;
            bArr4[i10] = (byte) (((i >> 6) & 63) | 128);
            i2 = i11 + 1;
            bArr4[i11] = (byte) ((i & 63) | 128);
        }
        this.f41149e = i2;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0029, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(String str, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
                return;
            }
            return;
        }
        if (this.f41150f > 0) {
            i2--;
            write(m44738a(str.charAt(i)));
            i++;
        }
        int i3 = this.f41149e;
        byte[] bArr = this.f41147c;
        int i4 = this.f41148d;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.f41146b.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) cCharAt;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                while (true) {
                    i = i6;
                    i3 = i7;
                    if (i >= i10) {
                        break;
                    }
                    i6 = i + 1;
                    cCharAt = str.charAt(i);
                    if (cCharAt >= 128) {
                        break;
                    }
                    i7 = i3 + 1;
                    bArr[i3] = (byte) cCharAt;
                }
            }
            if (cCharAt < 2048) {
                int i11 = i3 + 1;
                bArr[i3] = (byte) ((cCharAt >> 6) | Opcodes.CHECKCAST);
                i3 = i11 + 1;
                bArr[i11] = (byte) ((cCharAt & '?') | 128);
                i = i6;
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                if (cCharAt > 56319) {
                    this.f41149e = i3;
                    m44736c(cCharAt);
                }
                this.f41150f = cCharAt;
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                int iM44738a = m44738a(str.charAt(i6));
                if (iM44738a > 1114111) {
                    this.f41149e = i3;
                    m44736c(iM44738a);
                }
                int i12 = i3 + 1;
                bArr[i3] = (byte) ((iM44738a >> 18) | 240);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((iM44738a >> 12) & 63) | 128);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((iM44738a >> 6) & 63) | 128);
                i3 = i14 + 1;
                bArr[i14] = (byte) ((iM44738a & 63) | 128);
            } else {
                int i15 = i3 + 1;
                bArr[i3] = (byte) ((cCharAt >> '\f') | 224);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i16] = (byte) ((cCharAt & '?') | 128);
                i = i6;
                i3 = i16 + 1;
            }
        }
        this.f41149e = i3;
    }
}

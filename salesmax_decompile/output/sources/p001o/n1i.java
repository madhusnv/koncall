package p001o;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* loaded from: classes5.dex */
public class n1i extends Reader {

    /* renamed from: a */
    public final q68 f36243a;

    /* renamed from: b */
    public InputStream f36244b;

    /* renamed from: c */
    public byte[] f36245c;

    /* renamed from: d */
    public int f36246d;

    /* renamed from: e */
    public int f36247e;

    /* renamed from: f */
    public final boolean f36248f;

    /* renamed from: g */
    public char f36249g = 0;

    /* renamed from: h */
    public int f36250h;

    /* renamed from: q */
    public int f36251q;

    /* renamed from: s */
    public final boolean f36252s;

    /* renamed from: x */
    public char[] f36253x;

    public n1i(q68 q68Var, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.f36243a = q68Var;
        this.f36244b = inputStream;
        this.f36245c = bArr;
        this.f36246d = i;
        this.f36247e = i2;
        this.f36248f = z;
        this.f36252s = inputStream != null;
    }

    /* renamed from: a */
    public final void m39999a() {
        byte[] bArr = this.f36245c;
        if (bArr != null) {
            this.f36245c = null;
            this.f36243a.m44859o(bArr);
        }
    }

    /* renamed from: c */
    public final boolean m40000c(int i) throws IOException {
        int i2;
        this.f36251q += this.f36247e - i;
        if (i > 0) {
            int i3 = this.f36246d;
            if (i3 > 0) {
                byte[] bArr = this.f36245c;
                System.arraycopy(bArr, i3, bArr, 0, i);
                this.f36246d = 0;
            }
            this.f36247e = i;
        } else {
            this.f36246d = 0;
            InputStream inputStream = this.f36244b;
            int i4 = inputStream == null ? -1 : inputStream.read(this.f36245c);
            if (i4 < 1) {
                this.f36247e = 0;
                if (i4 < 0) {
                    if (this.f36252s) {
                        m39999a();
                    }
                    return false;
                }
                m40003g();
            }
            this.f36247e = i4;
        }
        while (true) {
            int i5 = this.f36247e;
            if (i5 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.f36244b;
            if (inputStream2 == null) {
                i2 = -1;
            } else {
                byte[] bArr2 = this.f36245c;
                i2 = inputStream2.read(bArr2, i5, bArr2.length - i5);
            }
            if (i2 < 1) {
                if (i2 < 0) {
                    if (this.f36252s) {
                        m39999a();
                    }
                    m40004h(this.f36247e, 4);
                }
                m40003g();
            }
            this.f36247e += i2;
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f36244b;
        if (inputStream != null) {
            this.f36244b = null;
            m39999a();
            inputStream.close();
        }
    }

    /* renamed from: d */
    public final void m40001d(char[] cArr, int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i + "," + i2 + "), cbuf[" + cArr.length + "]");
    }

    /* renamed from: f */
    public final void m40002f(int i, int i2, String str) throws CharConversionException {
        int i3 = (this.f36251q + this.f36246d) - 1;
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i) + str + " at char #" + (this.f36250h + i2) + ", byte #" + i3 + ")");
    }

    /* renamed from: g */
    public final void m40003g() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    /* renamed from: h */
    public final void m40004h(int i, int i2) throws CharConversionException {
        int i3 = this.f36251q + i;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + this.f36250h + ", byte #" + i3 + ")");
    }

    @Override // java.io.Reader
    public int read() {
        if (this.f36253x == null) {
            this.f36253x = new char[1];
        }
        if (read(this.f36253x, 0, 1) < 1) {
            return -1;
        }
        return this.f36253x[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce A[LOOP:0: B:24:0x003e->B:41:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[SYNTHETIC] */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(char[] cArr, int i, int i2) throws CharConversionException {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f36245c == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            m40001d(cArr, i, i2);
        }
        int i7 = i2 + i;
        char c = this.f36249g;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.f36249g = (char) 0;
        } else {
            int i8 = this.f36247e - this.f36246d;
            if (i8 < 4 && !m40000c(i8)) {
                if (i8 == 0) {
                    return -1;
                }
                m40004h(this.f36247e - this.f36246d, 4);
            }
            i3 = i;
        }
        int i9 = this.f36247e - 4;
        while (i3 < i7) {
            int i10 = this.f36246d;
            if (this.f36248f) {
                byte[] bArr = this.f36245c;
                i4 = (bArr[i10] << 8) | (bArr[i10 + 1] & 255);
                i5 = (bArr[i10 + 3] & 255) | ((bArr[i10 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this.f36245c;
                int i11 = (bArr2[i10] & 255) | ((bArr2[i10 + 1] & 255) << 8);
                i4 = (bArr2[i10 + 3] << 8) | (bArr2[i10 + 2] & 255);
                i5 = i11;
            }
            this.f36246d = i10 + 4;
            if (i4 != 0) {
                int i12 = 65535 & i4;
                int i13 = i5 | ((i12 - 1) << 16);
                if (i12 > 16) {
                    m40002f(i13, i3 - i, String.format(" (above 0x%08x)", 1114111));
                }
                i6 = i3 + 1;
                cArr[i3] = (char) ((i13 >> 10) + 55296);
                int i14 = (i13 & 1023) | 56320;
                if (i6 >= i7) {
                    this.f36249g = (char) i13;
                    i3 = i6;
                    break;
                }
                i5 = i14;
                i3 = i6;
                i6 = i3 + 1;
                cArr[i3] = (char) i5;
                if (this.f36246d <= i9) {
                    i3 = i6;
                    break;
                }
                i3 = i6;
            } else {
                i6 = i3 + 1;
                cArr[i3] = (char) i5;
                if (this.f36246d <= i9) {
                }
            }
        }
        int i15 = i3 - i;
        this.f36250h += i15;
        return i15;
    }
}

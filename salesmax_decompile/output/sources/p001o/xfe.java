package p001o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class xfe extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f53708a;

    /* renamed from: b */
    public int f53709b;

    /* renamed from: c */
    public int f53710c;

    /* renamed from: d */
    public int f53711d;

    /* renamed from: e */
    public int f53712e;

    /* renamed from: f */
    public final wo0 f53713f;

    /* renamed from: o.xfe$a */
    public static class C18147a extends IOException {
        public C18147a(String str) {
            super(str);
        }
    }

    public xfe(InputStream inputStream, wo0 wo0Var) {
        this(inputStream, wo0Var, 65536);
    }

    /* renamed from: d */
    public static IOException m56222d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m56223a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f53711d;
        if (i != -1) {
            int i2 = this.f53712e - i;
            int i3 = this.f53710c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f53709b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f53713f.mo46964c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f53708a = bArr2;
                    this.f53713f.mo46966e(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f53712e - this.f53711d;
                this.f53712e = i4;
                this.f53711d = 0;
                this.f53709b = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f53712e;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f53709b = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f53711d = -1;
            this.f53712e = 0;
            this.f53709b = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f53708a == null || inputStream == null) {
            throw m56222d();
        }
        return (this.f53709b - this.f53712e) + inputStream.available();
    }

    /* renamed from: c */
    public synchronized void m56224c() {
        this.f53710c = this.f53708a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f53708a != null) {
            this.f53713f.mo46966e(this.f53708a);
            this.f53708a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f53710c = Math.max(this.f53710c, i);
        this.f53711d = this.f53712e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f53708a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m56222d();
        }
        if (this.f53712e >= this.f53709b && m56223a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f53708a && (bArr = this.f53708a) == null) {
            throw m56222d();
        }
        int i = this.f53709b;
        int i2 = this.f53712e;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f53712e = i2 + 1;
        return bArr[i2] & 255;
    }

    public synchronized void release() {
        if (this.f53708a != null) {
            this.f53713f.mo46966e(this.f53708a);
            this.f53708a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f53708a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f53711d;
        if (-1 == i) {
            throw new C18147a("Mark has been invalidated, pos: " + this.f53712e + " markLimit: " + this.f53710c);
        }
        this.f53712e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f53708a;
        if (bArr == null) {
            throw m56222d();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m56222d();
        }
        int i = this.f53709b;
        int i2 = this.f53712e;
        if (i - i2 >= j) {
            this.f53712e = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.f53712e = i;
        if (this.f53711d == -1 || j > this.f53710c) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f53711d = -1;
            }
            return j2 + jSkip;
        }
        if (m56223a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f53709b;
        int i4 = this.f53712e;
        if (i3 - i4 >= j - j2) {
            this.f53712e = (int) ((i4 + j) - j2);
            return j;
        }
        long j3 = (j2 + i3) - i4;
        this.f53712e = i3;
        return j3;
    }

    public xfe(InputStream inputStream, wo0 wo0Var, int i) {
        super(inputStream);
        this.f53711d = -1;
        this.f53713f = wo0Var;
        this.f53708a = (byte[]) wo0Var.mo46964c(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f53708a;
        if (bArr2 == null) {
            throw m56222d();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f53712e;
            int i6 = this.f53709b;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f53712e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f53711d == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (m56223a(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f53708a && (bArr2 = this.f53708a) == null) {
                        throw m56222d();
                    }
                    int i8 = this.f53709b;
                    int i9 = this.f53712e;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f53712e += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw m56222d();
        }
    }
}

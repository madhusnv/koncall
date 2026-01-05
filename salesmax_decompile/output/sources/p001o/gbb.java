package p001o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class gbb extends InputStream {

    /* renamed from: a */
    public final q68 f24869a;

    /* renamed from: b */
    public final InputStream f24870b;

    /* renamed from: c */
    public byte[] f24871c;

    /* renamed from: d */
    public int f24872d;

    /* renamed from: e */
    public final int f24873e;

    public gbb(q68 q68Var, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f24869a = q68Var;
        this.f24870b = inputStream;
        this.f24871c = bArr;
        this.f24872d = i;
        this.f24873e = i2;
    }

    /* renamed from: a */
    public final void m28311a() {
        byte[] bArr = this.f24871c;
        if (bArr != null) {
            this.f24871c = null;
            q68 q68Var = this.f24869a;
            if (q68Var != null) {
                q68Var.m44859o(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f24871c != null ? this.f24873e - this.f24872d : this.f24870b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m28311a();
        this.f24870b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        if (this.f24871c == null) {
            this.f24870b.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f24871c == null && this.f24870b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f24871c;
        if (bArr == null) {
            return this.f24870b.read();
        }
        int i = this.f24872d;
        int i2 = i + 1;
        this.f24872d = i2;
        int i3 = bArr[i] & 255;
        if (i2 >= this.f24873e) {
            m28311a();
        }
        return i3;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this.f24871c == null) {
            this.f24870b.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        long j2;
        if (this.f24871c != null) {
            int i = this.f24873e;
            int i2 = this.f24872d;
            long j3 = i - i2;
            if (j3 > j) {
                this.f24872d = i2 + ((int) j);
                return j;
            }
            m28311a();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.f24870b.skip(j) : j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f24871c;
        if (bArr2 != null) {
            int i3 = this.f24873e;
            int i4 = this.f24872d;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.f24872d + i2;
            this.f24872d = i6;
            if (i6 >= this.f24873e) {
                m28311a();
            }
            return i2;
        }
        return this.f24870b.read(bArr, i, i2);
    }
}

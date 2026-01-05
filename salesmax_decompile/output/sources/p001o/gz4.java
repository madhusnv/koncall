package p001o;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class gz4 extends InputStream {

    /* renamed from: a */
    public final dz4 f25983a;

    /* renamed from: b */
    public final iz4 f25984b;

    /* renamed from: f */
    public long f25988f;

    /* renamed from: d */
    public boolean f25986d = false;

    /* renamed from: e */
    public boolean f25987e = false;

    /* renamed from: c */
    public final byte[] f25985c = new byte[1];

    public gz4(dz4 dz4Var, iz4 iz4Var) {
        this.f25983a = dz4Var;
        this.f25984b = iz4Var;
    }

    /* renamed from: a */
    public final void m29672a() {
        if (this.f25986d) {
            return;
        }
        this.f25983a.mo23960e(this.f25984b);
        this.f25986d = true;
    }

    /* renamed from: c */
    public void m29673c() {
        m29672a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f25987e) {
            return;
        }
        this.f25983a.close();
        this.f25987e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f25985c) == -1) {
            return -1;
        }
        return this.f25985c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        op0.m42517g(!this.f25987e);
        m29672a();
        int i3 = this.f25983a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f25988f += i3;
        return i3;
    }
}

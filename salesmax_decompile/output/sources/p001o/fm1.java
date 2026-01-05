package p001o;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class fm1 extends OutputStream {

    /* renamed from: a */
    public final OutputStream f23622a;

    /* renamed from: b */
    public byte[] f23623b;

    /* renamed from: c */
    public wo0 f23624c;

    /* renamed from: d */
    public int f23625d;

    public fm1(OutputStream outputStream, wo0 wo0Var) {
        this(outputStream, wo0Var, 65536);
    }

    /* renamed from: a */
    public final void m27032a() throws IOException {
        int i = this.f23625d;
        if (i > 0) {
            this.f23622a.write(this.f23623b, 0, i);
            this.f23625d = 0;
        }
    }

    /* renamed from: c */
    public final void m27033c() throws IOException {
        if (this.f23625d == this.f23623b.length) {
            m27032a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f23622a.close();
            release();
        } catch (Throwable th) {
            this.f23622a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m27032a();
        this.f23622a.flush();
    }

    public final void release() {
        byte[] bArr = this.f23623b;
        if (bArr != null) {
            this.f23624c.mo46966e(bArr);
            this.f23623b = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f23623b;
        int i2 = this.f23625d;
        this.f23625d = i2 + 1;
        bArr[i2] = (byte) i;
        m27033c();
    }

    public fm1(OutputStream outputStream, wo0 wo0Var, int i) {
        this.f23622a = outputStream;
        this.f23624c = wo0Var;
        this.f23623b = (byte[]) wo0Var.mo46964c(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f23625d;
            if (i6 == 0 && i4 >= this.f23623b.length) {
                this.f23622a.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f23623b.length - i6);
            System.arraycopy(bArr, i5, this.f23623b, this.f23625d, iMin);
            this.f23625d += iMin;
            i3 += iMin;
            m27033c();
        } while (i3 < i2);
    }
}

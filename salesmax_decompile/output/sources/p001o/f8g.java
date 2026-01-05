package p001o;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public class f8g implements Closeable {

    /* renamed from: a */
    public final InputStream f22955a;

    /* renamed from: b */
    public final Charset f22956b;

    /* renamed from: c */
    public byte[] f22957c;

    /* renamed from: d */
    public int f22958d;

    /* renamed from: e */
    public int f22959e;

    /* renamed from: o.f8g$a */
    public class C13366a extends ByteArrayOutputStream {
        public C13366a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, f8g.this.f22956b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public f8g(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: c */
    public final void m26285c() throws IOException {
        InputStream inputStream = this.f22955a;
        byte[] bArr = this.f22957c;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.f22958d = 0;
        this.f22959e = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f22955a) {
            if (this.f22957c != null) {
                this.f22957c = null;
                this.f22955a.close();
            }
        }
    }

    /* renamed from: d */
    public boolean m26286d() {
        return this.f22959e == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m26287f() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f22955a) {
            if (this.f22957c == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f22958d >= this.f22959e) {
                m26285c();
            }
            for (int i3 = this.f22958d; i3 != this.f22959e; i3++) {
                byte[] bArr2 = this.f22957c;
                if (bArr2[i3] == 10) {
                    int i4 = this.f22958d;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    }
                    String str = new String(bArr2, i4, i2 - i4, this.f22956b.name());
                    this.f22958d = i3 + 1;
                    return str;
                }
            }
            C13366a c13366a = new C13366a((this.f22959e - this.f22958d) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.f22957c;
                int i5 = this.f22958d;
                c13366a.write(bArr3, i5, this.f22959e - i5);
                this.f22959e = -1;
                m26285c();
                i = this.f22958d;
                while (i != this.f22959e) {
                    bArr = this.f22957c;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.f22958d;
            if (i != i6) {
                c13366a.write(bArr, i6, i - i6);
            }
            this.f22958d = i + 1;
            return c13366a.toString();
        }
    }

    public f8g(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(tqi.f47622a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f22955a = inputStream;
        this.f22956b = charset;
        this.f22957c = new byte[i];
    }
}

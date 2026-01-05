package p001o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* loaded from: classes6.dex */
public class tp1 extends Writer {

    /* renamed from: a */
    public byte[] f47516a;

    /* renamed from: b */
    public int f47517b;

    /* renamed from: c */
    public vp1 f47518c = null;

    /* renamed from: d */
    public OutputStreamWriter f47519d = null;

    /* renamed from: e */
    public boolean f47520e = false;

    public tp1(int i) {
        this.f47516a = new byte[i];
    }

    /* renamed from: a */
    public void m50278a() {
        this.f47516a = null;
    }

    /* renamed from: c */
    public void m50279c(int i) throws IOException {
        int i2 = this.f47517b;
        int i3 = i2 + i;
        byte[] bArr = this.f47516a;
        if (i3 > bArr.length) {
            if (this.f47520e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Buffer overflow: ");
                stringBuffer.append(this.f47516a.length);
                throw new IOException(stringBuffer.toString());
            }
            byte[] bArr2 = new byte[((bArr.length + i) * 4) / 3];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.f47516a = bArr2;
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: d */
    public int m50280d() {
        return this.f47517b;
    }

    /* renamed from: f */
    public void m50281f(char c) throws IOException {
        m50279c(1);
        if (c < 0 || c > 127) {
            m50282g(new char[]{c}, 0, 1);
            return;
        }
        byte[] bArr = this.f47516a;
        int i = this.f47517b;
        this.f47517b = i + 1;
        bArr[i] = (byte) c;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    /* renamed from: g */
    public final void m50282g(char[] cArr, int i, int i2) throws IOException {
        vp1 vp1Var = this.f47518c;
        if (vp1Var == null) {
            this.f47518c = new vp1(i2 * 2);
            this.f47519d = new OutputStreamWriter(this.f47518c, s8g.f44982b);
        } else {
            vp1Var.reset();
        }
        this.f47519d.write(cArr, i, i2);
        this.f47519d.flush();
        m50279c(this.f47518c.getCount());
        System.arraycopy(this.f47518c.m53158a(), 0, this.f47516a, this.f47517b, this.f47518c.getCount());
        this.f47517b += this.f47518c.getCount();
    }

    /* renamed from: h */
    public void m50283h(OutputStream outputStream) throws IOException {
        outputStream.write(this.f47516a, 0, this.f47517b);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        m50279c(cArr.length);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 0 || c > 127) {
                m50282g(cArr, i, cArr.length - i);
                return;
            }
            byte[] bArr = this.f47516a;
            int i2 = this.f47517b;
            this.f47517b = i2 + 1;
            bArr[i2] = (byte) c;
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        m50279c(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            char c = cArr[i4];
            if (c >= 0 && c <= 127) {
                byte[] bArr = this.f47516a;
                int i5 = this.f47517b;
                this.f47517b = i5 + 1;
                bArr[i5] = (byte) c;
            } else {
                m50282g(cArr, i4, i2 - i3);
                return;
            }
        }
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        if (str == null) {
            write("null", 0, 4);
            return;
        }
        int length = str.length();
        m50279c(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 0 && cCharAt <= 127) {
                byte[] bArr = this.f47516a;
                int i2 = this.f47517b;
                this.f47517b = i2 + 1;
                bArr[i2] = (byte) cCharAt;
            } else {
                m50282g(str.toCharArray(), i, length - i);
                return;
            }
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        m50279c(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            char cCharAt = str.charAt(i4);
            if (cCharAt >= 0 && cCharAt <= 127) {
                byte[] bArr = this.f47516a;
                int i5 = this.f47517b;
                this.f47517b = i5 + 1;
                bArr[i5] = (byte) cCharAt;
            } else {
                m50282g(str.toCharArray(), i4, i2 - i3);
                return;
            }
        }
    }
}

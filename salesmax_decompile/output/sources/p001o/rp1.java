package p001o;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public final class rp1 extends OutputStream {

    /* renamed from: f */
    public static final byte[] f43913f = new byte[0];

    /* renamed from: c */
    public int f43916c;

    /* renamed from: d */
    public byte[] f43917d;

    /* renamed from: e */
    public int f43918e;

    /* renamed from: b */
    public final LinkedList f43915b = new LinkedList();

    /* renamed from: a */
    public final xl1 f43914a = null;

    public rp1(xl1 xl1Var, byte[] bArr, int i) {
        this.f43917d = bArr;
        this.f43918e = i;
    }

    /* renamed from: g */
    public static rp1 m47036g(byte[] bArr, int i) {
        return new rp1(null, bArr, i);
    }

    /* renamed from: a */
    public final void m47037a() {
        int length = this.f43916c + this.f43917d.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.f43916c = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.f43915b.add(this.f43917d);
        this.f43917d = new byte[iMax];
        this.f43918e = 0;
    }

    /* renamed from: c */
    public void m47038c(int i) {
        if (this.f43918e >= this.f43917d.length) {
            m47037a();
        }
        byte[] bArr = this.f43917d;
        int i2 = this.f43918e;
        this.f43918e = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: d */
    public byte[] m47039d(int i) {
        this.f43918e = i;
        return m47042k();
    }

    /* renamed from: f */
    public byte[] m47040f() {
        m47037a();
        return this.f43917d;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    /* renamed from: h */
    public void m47041h() {
        this.f43916c = 0;
        this.f43918e = 0;
        if (this.f43915b.isEmpty()) {
            return;
        }
        this.f43915b.clear();
    }

    /* renamed from: k */
    public byte[] m47042k() {
        int i = this.f43916c + this.f43918e;
        if (i == 0) {
            return f43913f;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.f43915b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f43917d, 0, bArr, i2, this.f43918e);
        int i3 = i2 + this.f43918e;
        if (i3 == i) {
            if (!this.f43915b.isEmpty()) {
                m47041h();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int iMin = Math.min(this.f43917d.length - this.f43918e, i2);
            if (iMin > 0) {
                System.arraycopy(bArr, i, this.f43917d, this.f43918e, iMin);
                i += iMin;
                this.f43918e += iMin;
                i2 -= iMin;
            }
            if (i2 <= 0) {
                return;
            } else {
                m47037a();
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        m47038c(i);
    }
}

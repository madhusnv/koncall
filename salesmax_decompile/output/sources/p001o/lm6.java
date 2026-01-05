package p001o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class lm6 extends FilterInputStream {

    /* renamed from: c */
    public static final byte[] f34038c;

    /* renamed from: d */
    public static final int f34039d;

    /* renamed from: e */
    public static final int f34040e;

    /* renamed from: a */
    public final byte f34041a;

    /* renamed from: b */
    public int f34042b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f34038c = bArr;
        int length = bArr.length;
        f34039d = length;
        f34040e = length + 2;
    }

    public lm6(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.f34041a = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i;
        int i2 = this.f34042b;
        int i3 = (i2 < 2 || i2 > (i = f34040e)) ? super.read() : i2 == i ? this.f34041a : f34038c[i2 - 2] & 255;
        if (i3 != -1) {
            this.f34042b++;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f34042b = (int) (this.f34042b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f34042b;
        int i5 = f34040e;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f34041a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f34038c, this.f34042b - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f34042b += i3;
        }
        return i3;
    }
}

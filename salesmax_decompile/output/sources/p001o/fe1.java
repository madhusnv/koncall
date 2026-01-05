package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class fe1 {

    /* renamed from: a */
    public final byte f23163a;

    /* renamed from: b */
    public final byte f23164b;

    /* renamed from: c */
    public final int f23165c;

    /* renamed from: d */
    public final int f23166d;

    /* renamed from: e */
    public final int f23167e;

    /* renamed from: f */
    public final int f23168f;

    /* renamed from: o.fe1$a */
    public static class C13406a {

        /* renamed from: a */
        public int f23169a;

        /* renamed from: b */
        public long f23170b;

        /* renamed from: c */
        public byte[] f23171c;

        /* renamed from: d */
        public int f23172d;

        /* renamed from: e */
        public int f23173e;

        /* renamed from: f */
        public boolean f23174f;

        /* renamed from: g */
        public int f23175g;

        /* renamed from: h */
        public int f23176h;

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.f23171c), Integer.valueOf(this.f23175g), Boolean.valueOf(this.f23174f), Integer.valueOf(this.f23169a), Long.valueOf(this.f23170b), Integer.valueOf(this.f23176h), Integer.valueOf(this.f23172d), Integer.valueOf(this.f23173e));
        }
    }

    public fe1(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 61);
    }

    /* renamed from: a */
    public int m26473a(C13406a c13406a) {
        if (c13406a.f23171c != null) {
            return c13406a.f23172d - c13406a.f23173e;
        }
        return 0;
    }

    /* renamed from: b */
    public boolean m26474b(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.f23164b == b || mo18520k(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public abstract void mo18518c(byte[] bArr, int i, int i2, C13406a c13406a);

    /* renamed from: d */
    public byte[] m26475d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C13406a c13406a = new C13406a();
        mo18518c(bArr, 0, bArr.length, c13406a);
        mo18518c(bArr, 0, -1, c13406a);
        int i = c13406a.f23172d;
        byte[] bArr2 = new byte[i];
        m26481l(bArr2, 0, i, c13406a);
        return bArr2;
    }

    /* renamed from: e */
    public abstract void mo18519e(byte[] bArr, int i, int i2, C13406a c13406a);

    /* renamed from: f */
    public byte[] m26476f(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : m26477g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public byte[] m26477g(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C13406a c13406a = new C13406a();
        mo18519e(bArr, i, i2, c13406a);
        mo18519e(bArr, i, -1, c13406a);
        int i3 = c13406a.f23172d - c13406a.f23173e;
        byte[] bArr2 = new byte[i3];
        m26481l(bArr2, 0, i3, c13406a);
        return bArr2;
    }

    /* renamed from: h */
    public byte[] m26478h(int i, C13406a c13406a) {
        byte[] bArr = c13406a.f23171c;
        return (bArr == null || bArr.length < c13406a.f23172d + i) ? m26482m(c13406a) : bArr;
    }

    /* renamed from: i */
    public int m26479i() {
        return 8192;
    }

    /* renamed from: j */
    public long m26480j(byte[] bArr) {
        int length = bArr.length;
        int i = this.f23165c;
        long j = (((length + i) - 1) / i) * this.f23166d;
        int i2 = this.f23167e;
        return i2 > 0 ? j + ((((i2 + j) - 1) / i2) * this.f23168f) : j;
    }

    /* renamed from: k */
    public abstract boolean mo18520k(byte b);

    /* renamed from: l */
    public int m26481l(byte[] bArr, int i, int i2, C13406a c13406a) {
        if (c13406a.f23171c == null) {
            return c13406a.f23174f ? -1 : 0;
        }
        int iMin = Math.min(m26473a(c13406a), i2);
        System.arraycopy(c13406a.f23171c, c13406a.f23173e, bArr, i, iMin);
        int i3 = c13406a.f23173e + iMin;
        c13406a.f23173e = i3;
        if (i3 >= c13406a.f23172d) {
            c13406a.f23171c = null;
        }
        return iMin;
    }

    /* renamed from: m */
    public final byte[] m26482m(C13406a c13406a) {
        byte[] bArr = c13406a.f23171c;
        if (bArr == null) {
            c13406a.f23171c = new byte[m26479i()];
            c13406a.f23172d = 0;
            c13406a.f23173e = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            c13406a.f23171c = bArr2;
        }
        return c13406a.f23171c;
    }

    public fe1(int i, int i2, int i3, int i4, byte b) {
        this.f23163a = (byte) 61;
        this.f23165c = i;
        this.f23166d = i2;
        this.f23167e = i3 > 0 && i4 > 0 ? (i3 / i2) * i2 : 0;
        this.f23168f = i4;
        this.f23164b = b;
    }
}

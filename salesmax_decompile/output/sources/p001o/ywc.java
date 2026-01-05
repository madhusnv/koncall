package p001o;

import com.google.firebase.perf.util.Constants;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class ywc {

    /* renamed from: a */
    public byte[] f56210a;

    /* renamed from: b */
    public int f56211b;

    /* renamed from: c */
    public int f56212c;

    /* renamed from: d */
    public int f56213d;

    public ywc() {
        this.f56210a = sqi.f45795f;
    }

    /* renamed from: a */
    public final void m58437a() {
        int i;
        int i2 = this.f56211b;
        op0.m42517g(i2 >= 0 && (i2 < (i = this.f56213d) || (i2 == i && this.f56212c == 0)));
    }

    /* renamed from: b */
    public int m58438b() {
        return ((this.f56213d - this.f56211b) * 8) - this.f56212c;
    }

    /* renamed from: c */
    public void m58439c() {
        if (this.f56212c == 0) {
            return;
        }
        this.f56212c = 0;
        this.f56211b++;
        m58437a();
    }

    /* renamed from: d */
    public int m58440d() {
        op0.m42517g(this.f56212c == 0);
        return this.f56211b;
    }

    /* renamed from: e */
    public int m58441e() {
        return (this.f56211b * 8) + this.f56212c;
    }

    /* renamed from: f */
    public void m58442f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int iMin = Math.min(8 - this.f56212c, i2);
        int i3 = this.f56212c;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f56210a;
        int i5 = this.f56211b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = i2 - iMin;
        bArr[i5] = (byte) (b | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f56210a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f56210a;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b2);
        m58454r(i2);
        m58437a();
    }

    /* renamed from: g */
    public boolean m58443g() {
        boolean z = (this.f56210a[this.f56211b] & (128 >> this.f56212c)) != 0;
        m58453q();
        return z;
    }

    /* renamed from: h */
    public int m58444h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f56212c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f56212c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f56212c = i4;
            byte[] bArr = this.f56210a;
            int i5 = this.f56211b;
            this.f56211b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f56210a;
        int i6 = this.f56211b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f56212c = 0;
            this.f56211b = i6 + 1;
        }
        m58437a();
        return i7;
    }

    /* renamed from: i */
    public void m58445i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f56210a;
            int i4 = this.f56211b;
            int i5 = i4 + 1;
            this.f56211b = i5;
            byte b = bArr2[i4];
            int i6 = this.f56212c;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (Constants.MAX_HOST_LENGTH >> i7));
        bArr[i3] = b3;
        int i8 = this.f56212c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f56210a;
            int i9 = this.f56211b;
            this.f56211b = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f56212c = i8 - 8;
        }
        int i10 = this.f56212c + i7;
        this.f56212c = i10;
        byte[] bArr4 = this.f56210a;
        int i11 = this.f56211b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.f56212c = 0;
            this.f56211b = i11 + 1;
        }
        m58437a();
    }

    /* renamed from: j */
    public long m58446j(int i) {
        return i <= 32 ? sqi.p1(m58444h(i)) : sqi.o1(m58444h(i - 32), m58444h(32));
    }

    /* renamed from: k */
    public void m58447k(byte[] bArr, int i, int i2) {
        op0.m42517g(this.f56212c == 0);
        System.arraycopy(this.f56210a, this.f56211b, bArr, i, i2);
        this.f56211b += i2;
        m58437a();
    }

    /* renamed from: l */
    public String m58448l(int i, Charset charset) {
        byte[] bArr = new byte[i];
        m58447k(bArr, 0, i);
        return new String(bArr, charset);
    }

    /* renamed from: m */
    public void m58449m(zwc zwcVar) {
        m58451o(zwcVar.m60024e(), zwcVar.m60026g());
        m58452p(zwcVar.m60025f() * 8);
    }

    /* renamed from: n */
    public void m58450n(byte[] bArr) {
        m58451o(bArr, bArr.length);
    }

    /* renamed from: o */
    public void m58451o(byte[] bArr, int i) {
        this.f56210a = bArr;
        this.f56211b = 0;
        this.f56212c = 0;
        this.f56213d = i;
    }

    /* renamed from: p */
    public void m58452p(int i) {
        int i2 = i / 8;
        this.f56211b = i2;
        this.f56212c = i - (i2 * 8);
        m58437a();
    }

    /* renamed from: q */
    public void m58453q() {
        int i = this.f56212c + 1;
        this.f56212c = i;
        if (i == 8) {
            this.f56212c = 0;
            this.f56211b++;
        }
        m58437a();
    }

    /* renamed from: r */
    public void m58454r(int i) {
        int i2 = i / 8;
        int i3 = this.f56211b + i2;
        this.f56211b = i3;
        int i4 = this.f56212c + (i - (i2 * 8));
        this.f56212c = i4;
        if (i4 > 7) {
            this.f56211b = i3 + 1;
            this.f56212c = i4 - 8;
        }
        m58437a();
    }

    /* renamed from: s */
    public void m58455s(int i) {
        op0.m42517g(this.f56212c == 0);
        this.f56211b += i;
        m58437a();
    }

    public ywc(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ywc(byte[] bArr, int i) {
        this.f56210a = bArr;
        this.f56213d = i;
    }
}

package p001o;

import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import p001o.vy0;

/* loaded from: classes2.dex */
public final class csf extends tb1 {

    /* renamed from: i */
    public final float f18585i;

    /* renamed from: j */
    public final short f18586j;

    /* renamed from: k */
    public final int f18587k;

    /* renamed from: l */
    public final long f18588l;

    /* renamed from: m */
    public final long f18589m;

    /* renamed from: n */
    public int f18590n;

    /* renamed from: o */
    public boolean f18591o;

    /* renamed from: p */
    public int f18592p;

    /* renamed from: q */
    public long f18593q;

    /* renamed from: r */
    public int f18594r;

    /* renamed from: s */
    public byte[] f18595s;

    /* renamed from: t */
    public int f18596t;

    /* renamed from: u */
    public int f18597u;

    /* renamed from: v */
    public byte[] f18598v;

    public csf() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    /* renamed from: C */
    public static void m21714C(byte[] bArr, int i, int i2) {
        if (i2 >= 32767) {
            bArr[i] = -1;
            bArr[i + 1] = 127;
        } else if (i2 <= -32768) {
            bArr[i] = 0;
            bArr[i + 1] = -128;
        } else {
            bArr[i] = (byte) (i2 & Constants.MAX_HOST_LENGTH);
            bArr[i + 1] = (byte) (i2 >> 8);
        }
    }

    /* renamed from: F */
    public static int m21715F(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    /* renamed from: A */
    public final void m21716A(int i, int i2) {
        if (i == 0) {
            return;
        }
        op0.m42511a(this.f18597u >= i);
        if (i2 == 2) {
            int i3 = this.f18596t;
            int i4 = this.f18597u;
            int i5 = i3 + i4;
            byte[] bArr = this.f18595s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, (i3 + i4) - i, this.f18598v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f18598v, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.f18598v, 0, i6);
                    System.arraycopy(this.f18595s, 0, this.f18598v, i6, length);
                }
            }
        } else {
            int i7 = this.f18596t;
            int i8 = i7 + i;
            byte[] bArr2 = this.f18595s;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.f18598v, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.f18598v, 0, length2);
                System.arraycopy(this.f18595s, 0, this.f18598v, length2, i - length2);
            }
        }
        op0.m42512b(i % this.f18590n == 0, "sizeToOutput is not aligned to frame size: " + i);
        op0.m42517g(this.f18596t < this.f18595s.length);
        m21738y(this.f18598v, i, i2);
    }

    /* renamed from: B */
    public final void m21717B(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f18595s.length));
        int iM21732s = m21732s(byteBuffer);
        if (iM21732s == byteBuffer.position()) {
            this.f18592p = 1;
        } else {
            byteBuffer.limit(Math.min(iM21732s, byteBuffer.capacity()));
            m21737x(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    /* renamed from: D */
    public void m21718D(boolean z) {
        this.f18591o = z;
    }

    /* renamed from: E */
    public final void m21719E(ByteBuffer byteBuffer) {
        int length;
        int i;
        op0.m42517g(this.f18596t < this.f18595s.length);
        int iLimit = byteBuffer.limit();
        int iM21733t = m21733t(byteBuffer);
        int iPosition = iM21733t - byteBuffer.position();
        int i2 = this.f18596t;
        int i3 = this.f18597u;
        int i4 = i2 + i3;
        byte[] bArr = this.f18595s;
        if (i4 < bArr.length) {
            length = bArr.length - (i3 + i2);
            i = i2 + i3;
        } else {
            int length2 = i3 - (bArr.length - i2);
            length = i2 - length2;
            i = length2;
        }
        boolean z = iM21733t < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f18595s, i, iMin);
        int i5 = this.f18597u + iMin;
        this.f18597u = i5;
        op0.m42517g(i5 <= this.f18595s.length);
        boolean z2 = z && iPosition < length;
        m21739z(z2);
        if (z2) {
            this.f18592p = 0;
            this.f18594r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    @Override // p001o.tb1, p001o.vy0
    /* renamed from: a */
    public boolean mo21720a() {
        return super.mo21720a() && this.f18591o;
    }

    @Override // p001o.vy0
    /* renamed from: e */
    public void mo21721e(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m49664g()) {
            int i = this.f18592p;
            if (i == 0) {
                m21717B(byteBuffer);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                m21719E(byteBuffer);
            }
        }
    }

    @Override // p001o.tb1
    /* renamed from: h */
    public vy0.C17692a mo21722h(vy0.C17692a c17692a) throws vy0.C17693b {
        if (c17692a.f51023c == 2) {
            return c17692a.f51021a == -1 ? vy0.C17692a.f51020e : c17692a;
        }
        throw new vy0.C17693b(c17692a);
    }

    @Override // p001o.tb1
    /* renamed from: i */
    public void mo21723i() {
        if (mo21720a()) {
            this.f18590n = this.f46750b.f51022b * 2;
            int iM21727n = m21727n(m21731r(this.f18588l) / 2) * 2;
            if (this.f18595s.length != iM21727n) {
                this.f18595s = new byte[iM21727n];
                this.f18598v = new byte[iM21727n];
            }
        }
        this.f18592p = 0;
        this.f18593q = 0L;
        this.f18594r = 0;
        this.f18596t = 0;
        this.f18597u = 0;
    }

    @Override // p001o.tb1
    /* renamed from: j */
    public void mo21724j() {
        if (this.f18597u > 0) {
            m21739z(true);
            this.f18594r = 0;
        }
    }

    @Override // p001o.tb1
    /* renamed from: k */
    public void mo21725k() {
        this.f18591o = false;
        byte[] bArr = sqi.f45795f;
        this.f18595s = bArr;
        this.f18598v = bArr;
    }

    /* renamed from: m */
    public final int m21726m(float f) {
        return m21727n((int) f);
    }

    /* renamed from: n */
    public final int m21727n(int i) {
        int i2 = this.f18590n;
        return (i / i2) * i2;
    }

    /* renamed from: o */
    public final int m21728o(int i, int i2) {
        int i3 = this.f18587k;
        return i3 + ((((100 - i3) * (i * 1000)) / i2) / 1000);
    }

    /* renamed from: p */
    public final int m21729p(int i, int i2) {
        return (((this.f18587k - 100) * ((i * 1000) / i2)) / 1000) + 100;
    }

    /* renamed from: q */
    public final int m21730q(int i) {
        int iM21731r = ((m21731r(this.f18589m) - this.f18594r) * this.f18590n) - (this.f18595s.length / 2);
        op0.m42517g(iM21731r >= 0);
        return m21726m(Math.min((i * this.f18585i) + 0.5f, iM21731r));
    }

    /* renamed from: r */
    public final int m21731r(long j) {
        return (int) ((j * this.f46750b.f51021a) / 1000000);
    }

    /* renamed from: s */
    public final int m21732s(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (m21735v(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i = this.f18590n;
                return ((iLimit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    /* renamed from: t */
    public final int m21733t(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (m21735v(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i = this.f18590n;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: u */
    public long m21734u() {
        return this.f18593q;
    }

    /* renamed from: v */
    public final boolean m21735v(byte b, byte b2) {
        return Math.abs(m21715F(b, b2)) > this.f18586j;
    }

    /* renamed from: w */
    public final void m21736w(byte[] bArr, int i, int i2) {
        if (i2 == 3) {
            return;
        }
        for (int i3 = 0; i3 < i; i3 += 2) {
            m21714C(bArr, i3, (m21715F(bArr[i3 + 1], bArr[i3]) * (i2 == 0 ? m21729p(i3, i - 1) : i2 == 2 ? m21728o(i3, i - 1) : this.f18587k)) / 100);
        }
    }

    /* renamed from: x */
    public final void m21737x(ByteBuffer byteBuffer) {
        m49665l(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    /* renamed from: y */
    public final void m21738y(byte[] bArr, int i, int i2) {
        op0.m42512b(i % this.f18590n == 0, "byteOutput size is not aligned to frame size " + i);
        m21736w(bArr, i, i2);
        m49665l(i).put(bArr, 0, i).flip();
    }

    /* renamed from: z */
    public final void m21739z(boolean z) {
        int length;
        int iM21730q;
        int i = this.f18597u;
        byte[] bArr = this.f18595s;
        if (i == bArr.length || z) {
            if (this.f18594r == 0) {
                if (z) {
                    m21716A(i, 3);
                    length = i;
                } else {
                    op0.m42517g(i >= bArr.length / 2);
                    length = this.f18595s.length / 2;
                    m21716A(length, 0);
                }
                iM21730q = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM21730q2 = m21730q(length2) + (this.f18595s.length / 2);
                m21716A(iM21730q2, 2);
                iM21730q = iM21730q2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iM21730q = m21730q(length);
                m21716A(iM21730q, 1);
            }
            op0.m42518h(length % this.f18590n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            op0.m42517g(i >= iM21730q);
            this.f18597u -= length;
            int i2 = this.f18596t + length;
            this.f18596t = i2;
            this.f18596t = i2 % this.f18595s.length;
            this.f18594r = this.f18594r + (iM21730q / this.f18590n);
            this.f18593q += (length - iM21730q) / r2;
        }
    }

    public csf(long j, float f, long j2, int i, short s) {
        boolean z = false;
        this.f18594r = 0;
        this.f18596t = 0;
        this.f18597u = 0;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        op0.m42511a(z);
        this.f18588l = j;
        this.f18585i = f;
        this.f18589m = j2;
        this.f18587k = i;
        this.f18586j = s;
        byte[] bArr = sqi.f45795f;
        this.f18595s = bArr;
        this.f18598v = bArr;
    }
}

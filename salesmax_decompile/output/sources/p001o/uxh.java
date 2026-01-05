package p001o;

import java.nio.ByteBuffer;
import p001o.vy0;

/* loaded from: classes2.dex */
public final class uxh extends tb1 {

    /* renamed from: i */
    public int f49614i;

    /* renamed from: j */
    public int f49615j;

    /* renamed from: k */
    public boolean f49616k;

    /* renamed from: l */
    public int f49617l;

    /* renamed from: m */
    public byte[] f49618m = sqi.f45795f;

    /* renamed from: n */
    public int f49619n;

    /* renamed from: o */
    public long f49620o;

    @Override // p001o.tb1, p001o.vy0
    /* renamed from: b */
    public boolean mo32950b() {
        return super.mo32950b() && this.f49619n == 0;
    }

    @Override // p001o.tb1, p001o.vy0
    /* renamed from: c */
    public ByteBuffer mo32951c() {
        int i;
        if (super.mo32950b() && (i = this.f49619n) > 0) {
            m49665l(i).put(this.f49618m, 0, this.f49619n).flip();
            this.f49619n = 0;
        }
        return super.mo32951c();
    }

    @Override // p001o.vy0
    /* renamed from: e */
    public void mo21721e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f49617l);
        this.f49620o += iMin / this.f46750b.f51024d;
        this.f49617l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f49617l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f49619n + i2) - this.f49618m.length;
        ByteBuffer byteBufferM49665l = m49665l(length);
        int iM48736o = sqi.m48736o(length, 0, this.f49619n);
        byteBufferM49665l.put(this.f49618m, 0, iM48736o);
        int iM48736o2 = sqi.m48736o(length - iM48736o, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM48736o2);
        byteBufferM49665l.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM48736o2;
        int i4 = this.f49619n - iM48736o;
        this.f49619n = i4;
        byte[] bArr = this.f49618m;
        System.arraycopy(bArr, iM48736o, bArr, 0, i4);
        byteBuffer.get(this.f49618m, this.f49619n, i3);
        this.f49619n += i3;
        byteBufferM49665l.flip();
    }

    @Override // p001o.tb1
    /* renamed from: h */
    public vy0.C17692a mo21722h(vy0.C17692a c17692a) throws vy0.C17693b {
        if (c17692a.f51023c != 2) {
            throw new vy0.C17693b(c17692a);
        }
        this.f49616k = true;
        return (this.f49614i == 0 && this.f49615j == 0) ? vy0.C17692a.f51020e : c17692a;
    }

    @Override // p001o.tb1
    /* renamed from: i */
    public void mo21723i() {
        if (this.f49616k) {
            this.f49616k = false;
            int i = this.f49615j;
            int i2 = this.f46750b.f51024d;
            this.f49618m = new byte[i * i2];
            this.f49617l = this.f49614i * i2;
        }
        this.f49619n = 0;
    }

    @Override // p001o.tb1
    /* renamed from: j */
    public void mo21724j() {
        if (this.f49616k) {
            if (this.f49619n > 0) {
                this.f49620o += r0 / this.f46750b.f51024d;
            }
            this.f49619n = 0;
        }
    }

    @Override // p001o.tb1
    /* renamed from: k */
    public void mo21725k() {
        this.f49618m = sqi.f45795f;
    }

    /* renamed from: m */
    public long m52117m() {
        return this.f49620o;
    }

    /* renamed from: n */
    public void m52118n() {
        this.f49620o = 0L;
    }

    /* renamed from: o */
    public void m52119o(int i, int i2) {
        this.f49614i = i;
        this.f49615j = i2;
    }
}

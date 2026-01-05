package p001o;

import java.nio.ByteBuffer;
import p001o.vy0;

/* loaded from: classes2.dex */
public final class ug2 extends tb1 {

    /* renamed from: i */
    public int[] f48895i;

    /* renamed from: j */
    public int[] f48896j;

    @Override // p001o.vy0
    /* renamed from: e */
    public void mo21721e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) op0.m42515e(this.f48896j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM49665l = m49665l(((iLimit - iPosition) / this.f46750b.f51024d) * this.f46751c.f51024d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferM49665l.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f46750b.f51024d;
        }
        byteBuffer.position(iLimit);
        byteBufferM49665l.flip();
    }

    @Override // p001o.tb1
    /* renamed from: h */
    public vy0.C17692a mo21722h(vy0.C17692a c17692a) throws vy0.C17693b {
        int[] iArr = this.f48895i;
        if (iArr == null) {
            return vy0.C17692a.f51020e;
        }
        if (c17692a.f51023c != 2) {
            throw new vy0.C17693b(c17692a);
        }
        boolean z = c17692a.f51022b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= c17692a.f51022b) {
                throw new vy0.C17693b(c17692a);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new vy0.C17692a(c17692a.f51021a, iArr.length, 2) : vy0.C17692a.f51020e;
    }

    @Override // p001o.tb1
    /* renamed from: i */
    public void mo21723i() {
        this.f48896j = this.f48895i;
    }

    @Override // p001o.tb1
    /* renamed from: k */
    public void mo21725k() {
        this.f48896j = null;
        this.f48895i = null;
    }

    /* renamed from: m */
    public void m51562m(int[] iArr) {
        this.f48895i = iArr;
    }
}

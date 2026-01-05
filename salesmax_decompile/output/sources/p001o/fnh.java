package p001o;

import java.nio.ByteBuffer;
import p001o.vy0;

/* loaded from: classes2.dex */
public final class fnh extends tb1 {

    /* renamed from: i */
    public static final int f23744i = Float.floatToIntBits(Float.NaN);

    /* renamed from: m */
    public static void m27162m(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (iFloatToIntBits == f23744i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p001o.vy0
    /* renamed from: e */
    public void mo21721e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM49665l;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f46750b.f51023c;
        if (i2 == 21) {
            byteBufferM49665l = m49665l((i / 3) * 4);
            while (iPosition < iLimit) {
                m27162m(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM49665l);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM49665l = m49665l(i);
            while (iPosition < iLimit) {
                m27162m((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM49665l);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM49665l = m49665l((i / 3) * 4);
            while (iPosition < iLimit) {
                m27162m(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM49665l);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferM49665l = m49665l(i);
            while (iPosition < iLimit) {
                m27162m((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM49665l);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM49665l.flip();
    }

    @Override // p001o.tb1
    /* renamed from: h */
    public vy0.C17692a mo21722h(vy0.C17692a c17692a) throws vy0.C17693b {
        int i = c17692a.f51023c;
        if (sqi.E0(i)) {
            return i != 4 ? new vy0.C17692a(c17692a.f51021a, c17692a.f51022b, 4) : vy0.C17692a.f51020e;
        }
        throw new vy0.C17693b(c17692a);
    }
}

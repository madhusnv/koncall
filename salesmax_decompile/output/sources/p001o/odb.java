package p001o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class odb extends uig {
    /* renamed from: h */
    public static odb m42079h(ByteBuffer byteBuffer) {
        return m42080i(byteBuffer, new odb());
    }

    /* renamed from: i */
    public static odb m42080i(ByteBuffer byteBuffer, odb odbVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return odbVar.m42081f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public odb m42081f(int i, ByteBuffer byteBuffer) {
        m42082g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m42082g(int i, ByteBuffer byteBuffer) {
        m51638c(i, byteBuffer);
    }

    /* renamed from: j */
    public ndb m42083j(ndb ndbVar, int i) {
        int iM51637b = m51637b(6);
        if (iM51637b != 0) {
            return ndbVar.m40370f(m51636a(m51639d(iM51637b) + (i * 4)), this.f48974b);
        }
        return null;
    }

    /* renamed from: k */
    public int m42084k() {
        int iM51637b = m51637b(6);
        if (iM51637b != 0) {
            return m51640e(iM51637b);
        }
        return 0;
    }

    /* renamed from: l */
    public int m42085l() {
        int iM51637b = m51637b(4);
        if (iM51637b != 0) {
            return this.f48974b.getInt(iM51637b + this.f48973a);
        }
        return 0;
    }
}

package p001o;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ndb extends uig {
    /* renamed from: f */
    public ndb m40370f(int i, ByteBuffer byteBuffer) {
        m40371g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m40371g(int i, ByteBuffer byteBuffer) {
        m51638c(i, byteBuffer);
    }

    /* renamed from: h */
    public int m40372h(int i) {
        int iM51637b = m51637b(16);
        if (iM51637b != 0) {
            return this.f48974b.getInt(m51639d(iM51637b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int m40373i() {
        int iM51637b = m51637b(16);
        if (iM51637b != 0) {
            return m51640e(iM51637b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean m40374j() {
        int iM51637b = m51637b(6);
        return (iM51637b == 0 || this.f48974b.get(iM51637b + this.f48973a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short m40375k() {
        int iM51637b = m51637b(14);
        if (iM51637b != 0) {
            return this.f48974b.getShort(iM51637b + this.f48973a);
        }
        return (short) 0;
    }

    /* renamed from: l */
    public int m40376l() {
        int iM51637b = m51637b(4);
        if (iM51637b != 0) {
            return this.f48974b.getInt(iM51637b + this.f48973a);
        }
        return 0;
    }

    /* renamed from: m */
    public short m40377m() {
        int iM51637b = m51637b(8);
        if (iM51637b != 0) {
            return this.f48974b.getShort(iM51637b + this.f48973a);
        }
        return (short) 0;
    }

    /* renamed from: n */
    public short m40378n() {
        int iM51637b = m51637b(12);
        if (iM51637b != 0) {
            return this.f48974b.getShort(iM51637b + this.f48973a);
        }
        return (short) 0;
    }
}

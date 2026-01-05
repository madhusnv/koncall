package p001o;

import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes2.dex */
public final class y9c {

    /* renamed from: d */
    public static final byte[] f55109d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* renamed from: e */
    public static final byte[] f55110e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    public ByteBuffer f55111a = vy0.f51019a;

    /* renamed from: c */
    public int f55113c = 0;

    /* renamed from: b */
    public int f55112b = 2;

    /* renamed from: a */
    public void m57405a(a85 a85Var, List list) {
        op0.m42515e(a85Var.f14282d);
        if (a85Var.f14282d.limit() - a85Var.f14282d.position() == 0) {
            return;
        }
        this.f55111a = m57406b(a85Var.f14282d, (this.f55112b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        a85Var.mo16674h();
        a85Var.m16676v(this.f55111a.remaining());
        a85Var.f14282d.put(this.f55111a);
        a85Var.m16677w();
    }

    /* renamed from: b */
    public final ByteBuffer m57406b(ByteBuffer byteBuffer, byte[] bArr) {
        int i;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + Constants.MAX_HOST_LENGTH) / Constants.MAX_HOST_LENGTH;
        int length = i3 + 27 + i2;
        if (this.f55112b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f55109d.length;
            length += f55110e.length + length2;
            i = length2;
        } else {
            i = 0;
        }
        ByteBuffer byteBufferM57407c = m57407c(length);
        if (this.f55112b == 2) {
            if (bArr != null) {
                m57409e(byteBufferM57407c, bArr);
            } else {
                byteBufferM57407c.put(f55109d);
            }
            byteBufferM57407c.put(f55110e);
        }
        int iM52673j = this.f55113c + vec.m52673j(byteBuffer);
        this.f55113c = iM52673j;
        m57410f(byteBufferM57407c, iM52673j, this.f55112b, i3, false);
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 >= 255) {
                byteBufferM57407c.put((byte) -1);
                i2 -= 255;
            } else {
                byteBufferM57407c.put((byte) i2);
                i2 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferM57407c.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM57407c.flip();
        if (this.f55112b == 2) {
            byte[] bArrArray = byteBufferM57407c.array();
            int iArrayOffset = byteBufferM57407c.arrayOffset() + i;
            byte[] bArr2 = f55110e;
            byteBufferM57407c.putInt(i + bArr2.length + 22, sqi.m48744w(bArrArray, iArrayOffset + bArr2.length, byteBufferM57407c.limit() - byteBufferM57407c.position(), 0));
        } else {
            byteBufferM57407c.putInt(22, sqi.m48744w(byteBufferM57407c.array(), byteBufferM57407c.arrayOffset(), byteBufferM57407c.limit() - byteBufferM57407c.position(), 0));
        }
        this.f55112b++;
        return byteBufferM57407c;
    }

    /* renamed from: c */
    public final ByteBuffer m57407c(int i) {
        if (this.f55111a.capacity() < i) {
            this.f55111a = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f55111a.clear();
        }
        return this.f55111a;
    }

    /* renamed from: d */
    public void m57408d() {
        this.f55111a = vy0.f51019a;
        this.f55113c = 0;
        this.f55112b = 2;
    }

    /* renamed from: e */
    public final void m57409e(ByteBuffer byteBuffer, byte[] bArr) {
        m57410f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(b5i.m18174a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, sqi.m48744w(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    /* renamed from: f */
    public final void m57410f(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(b5i.m18174a(i2));
    }
}

package p001o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p001o.xq1;

/* loaded from: classes6.dex */
public final class vyb extends xq1.AbstractC18218i {

    /* renamed from: e */
    public final ByteBuffer f51042e;

    public vyb(ByteBuffer byteBuffer) {
        yn8.m58013b(byteBuffer, "buffer");
        this.f51042e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return xq1.m56585l(this.f51042e.slice());
    }

    @Override // p001o.xq1
    /* renamed from: B */
    public jf3 mo53604B() {
        return jf3.m33686i(this.f51042e, true);
    }

    @Override // p001o.xq1
    /* renamed from: E */
    public int mo53605E(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f51042e.get(i4);
        }
        return i;
    }

    @Override // p001o.xq1
    /* renamed from: G */
    public xq1 mo53606G(int i, int i2) {
        try {
            return new vyb(m53609U(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // p001o.xq1
    /* renamed from: M */
    public String mo53607M(Charset charset) {
        byte[] bArrM56591I;
        int length;
        int iArrayOffset;
        if (this.f51042e.hasArray()) {
            bArrM56591I = this.f51042e.array();
            iArrayOffset = this.f51042e.arrayOffset() + this.f51042e.position();
            length = this.f51042e.remaining();
        } else {
            bArrM56591I = m56591I();
            length = bArrM56591I.length;
            iArrayOffset = 0;
        }
        return new String(bArrM56591I, iArrayOffset, length, charset);
    }

    @Override // p001o.xq1
    /* renamed from: T */
    public void mo53608T(jq1 jq1Var) {
        jq1Var.mo34212a(this.f51042e.slice());
    }

    /* renamed from: U */
    public final ByteBuffer m53609U(int i, int i2) {
        if (i < this.f51042e.position() || i2 > this.f51042e.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer byteBufferSlice = this.f51042e.slice();
        byteBufferSlice.position(i - this.f51042e.position());
        byteBufferSlice.limit(i2 - this.f51042e.position());
        return byteBufferSlice;
    }

    @Override // p001o.xq1
    /* renamed from: d */
    public ByteBuffer mo53610d() {
        return this.f51042e.asReadOnlyBuffer();
    }

    @Override // p001o.xq1
    /* renamed from: e */
    public byte mo53611e(int i) {
        try {
            return this.f51042e.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // p001o.xq1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xq1)) {
            return false;
        }
        xq1 xq1Var = (xq1) obj;
        if (size() != xq1Var.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof vyb ? this.f51042e.equals(((vyb) obj).f51042e) : this.f51042e.equals(xq1Var.mo53610d());
    }

    @Override // p001o.xq1
    /* renamed from: r */
    public void mo53612r(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.f51042e.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // p001o.xq1
    public int size() {
        return this.f51042e.remaining();
    }

    @Override // p001o.xq1
    /* renamed from: x */
    public byte mo53613x(int i) {
        return mo53611e(i);
    }

    @Override // p001o.xq1
    /* renamed from: y */
    public boolean mo53614y() {
        return jqi.m34301r(this.f51042e);
    }
}

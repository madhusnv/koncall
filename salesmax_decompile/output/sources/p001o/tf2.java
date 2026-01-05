package p001o;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes4.dex */
public abstract class tf2 implements p70 {

    /* renamed from: a */
    public final rf2 f46990a;

    /* renamed from: b */
    public final rf2 f46991b;

    public tf2(byte[] bArr) {
        this.f46990a = mo36990g(bArr, 1);
        this.f46991b = mo36990g(bArr, 0);
    }

    /* renamed from: f */
    public static byte[] m49802f(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    @Override // p001o.p70
    /* renamed from: a */
    public byte[] mo24514a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.f46990a.mo35487g()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + this.f46990a.mo35487g() + 16);
        m49804d(byteBufferAllocate, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // p001o.p70
    /* renamed from: b */
    public byte[] mo24515b(byte[] bArr, byte[] bArr2) {
        return m49803c(ByteBuffer.wrap(bArr), bArr2);
    }

    /* renamed from: c */
    public final byte[] m49803c(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() < this.f46990a.mo35487g() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr2 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr3 = new byte[this.f46990a.mo35487g()];
        byteBuffer.get(bArr3);
        if (bArr == null) {
            bArr = new byte[0];
        }
        try {
            rdd.m46569f(m49805e(bArr3), m49802f(bArr, byteBuffer), bArr2);
            byteBuffer.position(iPosition);
            return this.f46990a.m46643e(byteBuffer);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    /* renamed from: d */
    public final void m49804d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr.length + this.f46990a.mo35487g() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        this.f46990a.m46644f(byteBuffer, bArr);
        byteBuffer.position(iPosition);
        byte[] bArr3 = new byte[this.f46990a.mo35487g()];
        byteBuffer.get(bArr3);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrM46564a = rdd.m46564a(m49805e(bArr3), m49802f(bArr2, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrM46564a);
    }

    /* renamed from: e */
    public final byte[] m49805e(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f46991b.m46642c(bArr, 0).get(bArr2);
        return bArr2;
    }

    /* renamed from: g */
    public abstract rf2 mo36990g(byte[] bArr, int i);
}

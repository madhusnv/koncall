package p001o;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes4.dex */
public final class ie9 implements p70 {

    /* renamed from: c */
    public static final byte[] f28562c = new byte[0];

    /* renamed from: a */
    public final id9 f28563a;

    /* renamed from: b */
    public final p70 f28564b;

    public ie9(id9 id9Var, p70 p70Var) {
        this.f28563a = id9Var;
        this.f28564b = p70Var;
    }

    @Override // p001o.p70
    /* renamed from: a */
    public byte[] mo24514a(byte[] bArr, byte[] bArr2) {
        byte[] bArrMo44940a = che.m21277o(this.f28563a).mo44940a();
        return m31994c(this.f28564b.mo24514a(bArrMo44940a, f28562c), ((p70) che.m21271i(this.f28563a.m31928L(), bArrMo44940a, p70.class)).mo24514a(bArr, bArr2));
    }

    @Override // p001o.p70
    /* renamed from: b */
    public byte[] mo24515b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((p70) che.m21271i(this.f28563a.m31928L(), this.f28564b.mo24515b(bArr3, f28562c), p70.class)).mo24515b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    /* renamed from: c */
    public final byte[] m31994c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }
}

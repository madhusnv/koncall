package p001o;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class r76 implements p70 {

    /* renamed from: a */
    public final sh8 f43108a;

    /* renamed from: b */
    public final hna f43109b;

    /* renamed from: c */
    public final int f43110c;

    public r76(sh8 sh8Var, hna hnaVar, int i) {
        this.f43108a = sh8Var;
        this.f43109b = hnaVar;
        this.f43110c = i;
    }

    @Override // p001o.p70
    /* renamed from: a */
    public byte[] mo24514a(byte[] bArr, byte[] bArr2) {
        byte[] bArrMo46640a = this.f43108a.mo46640a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return ar1.m17694a(bArrMo46640a, this.f43109b.mo30849b(ar1.m17694a(bArr2, bArrMo46640a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // p001o.p70
    /* renamed from: b */
    public byte[] mo24515b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f43110c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f43110c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f43109b.mo30848a(bArrCopyOfRange2, ar1.m17694a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f43108a.mo46641b(bArrCopyOfRange);
    }
}

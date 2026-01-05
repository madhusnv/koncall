package ii;

import ci.C0973a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.a */
/* loaded from: classes.dex */
public final class C3259a implements InterfaceC3271m {

    /* renamed from: d */
    public static final C0973a f17435d = new C0973a(2);

    /* renamed from: a */
    public final SecretKeySpec f17436a;

    /* renamed from: b */
    public final int f17437b;

    /* renamed from: c */
    public final int f17438c;

    public C3259a(byte[] bArr, int i10) throws GeneralSecurityException {
        AbstractC3275q.m7625a(bArr.length);
        this.f17436a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f17435d.get()).getBlockSize();
        this.f17438c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f17437b = i10;
    }

    @Override // ii.InterfaceC3271m
    /* renamed from: a */
    public final byte[] mo7601a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f17437b;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i10));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] bArrM7624a = AbstractC3274p.m7624a(i10);
        System.arraycopy(bArrM7624a, 0, bArr2, 0, i10);
        m7603c(true, bArr, bArr2, 0, bArr.length, bArrM7624a, this.f17437b);
        return bArr2;
    }

    @Override // ii.InterfaceC3271m
    /* renamed from: b */
    public final byte[] mo7602b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f17437b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f17437b;
        byte[] bArr3 = new byte[length2 - i11];
        m7603c(false, bArr, bArr3, i11, bArr.length - i11, bArr2, 0);
        return bArr3;
    }

    /* renamed from: c */
    public final void m7603c(boolean z6, byte[] bArr, byte[] bArr2, int i10, int i11, byte[] bArr3, int i12) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f17435d.get();
        byte[] bArr4 = new byte[this.f17438c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f17437b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f17436a;
        if (z6) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}

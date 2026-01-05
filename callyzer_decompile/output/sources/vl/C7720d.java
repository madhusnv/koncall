package vl;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import net.schmizz.sshj.common.SSHRuntimeException;
import wy.AbstractC8226a;
import wy.EnumC8227b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vl.d */
/* loaded from: classes.dex */
public final class C7720d extends AbstractC8226a {

    /* renamed from: f */
    public int f37258f;

    /* renamed from: g */
    public EnumC8227b f37259g;

    /* renamed from: h */
    public boolean f37260h;

    /* renamed from: i */
    public C7719c f37261i;

    /* renamed from: j */
    public SecretKeySpec f37262j;

    @Override // wy.AbstractC8226a, wy.InterfaceC8228c
    /* renamed from: b */
    public final void mo14710b(int i10, byte[] bArr) {
        try {
            m14714i().updateAAD(bArr, i10, 4);
        } catch (GeneralSecurityException e2) {
            throw new SSHRuntimeException("Error updating data through cipher", e2);
        }
    }

    @Override // wy.AbstractC8226a, wy.InterfaceC8228c
    /* renamed from: d */
    public final int mo14711d() {
        return this.f37258f;
    }

    @Override // wy.AbstractC8226a
    /* renamed from: h */
    public final void mo14713h(Cipher cipher, EnumC8227b enumC8227b, byte[] bArr, byte[] bArr2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.f37259g = enumC8227b;
        this.f37262j = m15403g(bArr);
        C7719c c7719c = new C7719c(this.f37258f * 8, bArr2);
        this.f37261i = c7719c;
        cipher.init(enumC8227b == EnumC8227b.Encrypt ? 1 : 2, this.f37262j, c7719c);
        this.f37260h = true;
    }

    /* renamed from: i */
    public final Cipher m14714i() throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!this.f37260h) {
            this.f39365e.init(this.f37259g == EnumC8227b.Encrypt ? 1 : 2, this.f37262j, this.f37261i);
            this.f37260h = true;
        }
        return this.f39365e;
    }

    @Override // wy.AbstractC8226a, wy.InterfaceC8228c
    public final void update(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        try {
            m14714i().doFinal(bArr, i10, this.f37259g == EnumC8227b.Decrypt ? i11 + this.f37258f : i11, bArr, i10);
            byte[] bArr2 = this.f37261i.f37257a;
            int length = bArr2.length;
            int i12 = length - 8;
            int i13 = length - 7;
            int i14 = length - 6;
            int i15 = length - 5;
            int i16 = length - 4;
            int i17 = length - 3;
            int i18 = length - 2;
            int i19 = length - 1;
            long j6 = (bArr2[i12] << 56) | ((bArr2[i13] & 255) << 48) | ((bArr2[i14] & 255) << 40) | ((bArr2[i15] & 255) << 32) | ((bArr2[i16] & 255) << 24) | ((bArr2[i17] & 255) << 16) | ((bArr2[i18] & 255) << 8) | (bArr2[i19] & 255);
            long j10 = j6 + 1;
            if (((j6 ^ j10) & (1 ^ j10)) < 0) {
                throw new ArithmeticException("long overflow");
            }
            bArr2[i12] = (byte) (j10 >> 56);
            bArr2[i13] = (byte) (j10 >> 48);
            bArr2[i14] = (byte) (j10 >> 40);
            bArr2[i15] = (byte) (j10 >> 32);
            bArr2[i16] = (byte) (j10 >> 24);
            bArr2[i17] = (byte) (j10 >> 16);
            bArr2[i18] = (byte) (j10 >> 8);
            bArr2[i19] = (byte) j10;
            this.f37260h = false;
        } catch (GeneralSecurityException e2) {
            throw new SSHRuntimeException("Error updating data through cipher", e2);
        }
    }
}

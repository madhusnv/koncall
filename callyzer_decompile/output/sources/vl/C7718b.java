package vl;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mm.AbstractC4801l;
import net.schmizz.sshj.common.AbstractC5037q;
import net.schmizz.sshj.common.SSHRuntimeException;
import wy.AbstractC8226a;
import wy.EnumC8227b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vl.b */
/* loaded from: classes.dex */
public final class C7718b extends AbstractC8226a {

    /* renamed from: l */
    public static final byte[] f37250l = new byte[32];

    /* renamed from: f */
    public byte[] f37251f;

    /* renamed from: g */
    public EnumC8227b f37252g;

    /* renamed from: h */
    public Cipher f37253h;

    /* renamed from: i */
    public Mac f37254i;

    /* renamed from: j */
    public SecretKeySpec f37255j;

    /* renamed from: k */
    public SecretKeySpec f37256k;

    @Override // wy.AbstractC8226a, wy.InterfaceC8228c
    /* renamed from: b */
    public final void mo14710b(int i10, byte[] bArr) throws ShortBufferException {
        if (i10 != 0) {
            throw new IllegalArgumentException(String.format("updateAAD called with offset %d and length %d", Integer.valueOf(i10), 4));
        }
        if (this.f37252g == EnumC8227b.Decrypt) {
            this.f37251f = Arrays.copyOfRange(bArr, 0, 4);
        }
        try {
            this.f37253h.update(bArr, 0, 4, bArr, 0);
        } catch (GeneralSecurityException e2) {
            throw new SSHRuntimeException("Error updating data through cipher", e2);
        }
    }

    @Override // wy.AbstractC8226a, wy.InterfaceC8228c
    /* renamed from: d */
    public final int mo14711d() {
        return 16;
    }

    @Override // wy.AbstractC8226a, wy.InterfaceC8228c
    /* renamed from: e */
    public final void mo14712e(long j6) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i10 = 1;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{(byte) (j6 >> 56), (byte) (j6 >> 48), (byte) (j6 >> 40), (byte) (j6 >> 32), (byte) (j6 >> 24), (byte) (j6 >> 16), (byte) (j6 >> 8), (byte) j6});
        try {
            Cipher cipher = this.f39365e;
            EnumC8227b enumC8227b = this.f37252g;
            EnumC8227b enumC8227b2 = EnumC8227b.Encrypt;
            cipher.init(enumC8227b == enumC8227b2 ? 1 : 2, this.f37255j, ivParameterSpec);
            Cipher cipher2 = this.f37253h;
            if (this.f37252g != enumC8227b2) {
                i10 = 2;
            }
            cipher2.init(i10, this.f37256k, ivParameterSpec);
            Cipher cipher3 = this.f39365e;
            byte[] bArr = f37250l;
            byte[] bArrUpdate = cipher3.update(bArr);
            this.f39365e.update(bArr);
            try {
                this.f37254i.init(m15403g(bArrUpdate));
                this.f37251f = null;
            } catch (GeneralSecurityException e2) {
                throw new SSHRuntimeException(e2.getMessage(), e2);
            }
        } catch (GeneralSecurityException e10) {
            throw new SSHRuntimeException(e10.getMessage(), e10);
        }
    }

    @Override // wy.AbstractC8226a
    /* renamed from: h */
    public final void mo14713h(Cipher cipher, EnumC8227b enumC8227b, byte[] bArr, byte[] bArr2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.f37252g = enumC8227b;
        this.f37255j = m15403g(Arrays.copyOfRange(bArr, 0, 32));
        this.f37256k = m15403g(Arrays.copyOfRange(bArr, 32, 64));
        try {
            this.f37253h = AbstractC5037q.m9948a("CHACHA");
            this.f37254i = AbstractC5037q.m9951d("POLY1305");
            mo14712e(0L);
        } catch (GeneralSecurityException e2) {
            this.f37253h = null;
            this.f37254i = null;
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    @Override // wy.AbstractC8226a, wy.InterfaceC8228c
    public final void update(byte[] bArr, int i10, int i11) throws IllegalStateException, ShortBufferException {
        if (i10 != 0 && i10 != 4) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "updateAAD called with inputOffset "));
        }
        int i12 = i10 + i11;
        if (this.f37252g == EnumC8227b.Decrypt) {
            byte[] bArr2 = new byte[i12];
            if (i10 == 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i11);
            } else {
                System.arraycopy(this.f37251f, 0, bArr2, 0, 4);
                System.arraycopy(bArr, 4, bArr2, 4, i11);
            }
            if (!MessageDigest.isEqual(Arrays.copyOfRange(bArr, i12, i12 + 16), this.f37254i.doFinal(bArr2))) {
                throw new SSHRuntimeException("MAC Error");
            }
        }
        try {
            this.f39365e.update(bArr, i10, i11, bArr, i10);
            if (this.f37252g == EnumC8227b.Encrypt) {
                System.arraycopy(this.f37254i.doFinal(Arrays.copyOf(bArr, i12)), 0, bArr, i12, 16);
            }
        } catch (GeneralSecurityException e2) {
            throw new SSHRuntimeException("ChaCha20 cipher processing failed", e2);
        }
    }
}

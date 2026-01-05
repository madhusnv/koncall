package wy;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import net.schmizz.sshj.common.AbstractC5037q;
import net.schmizz.sshj.common.SSHRuntimeException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wy.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8226a implements InterfaceC8228c {

    /* renamed from: a */
    public final int f39361a;

    /* renamed from: b */
    public final int f39362b;

    /* renamed from: c */
    public final String f39363c;

    /* renamed from: d */
    public final String f39364d;

    /* renamed from: e */
    public Cipher f39365e;

    public AbstractC8226a(String str, int i10, int i11, String str2) {
        this.f39361a = i10;
        this.f39362b = i11;
        this.f39363c = str;
        this.f39364d = str2;
    }

    @Override // wy.InterfaceC8228c
    /* renamed from: a */
    public final void mo15400a(EnumC8227b enumC8227b, byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f39362b;
        if (length > i10) {
            byte[] bArr3 = new byte[i10];
            System.arraycopy(bArr, 0, bArr3, 0, i10);
            bArr = bArr3;
        }
        int length2 = bArr2.length;
        int i11 = this.f39361a;
        if (length2 > i11) {
            byte[] bArr4 = new byte[i11];
            System.arraycopy(bArr2, 0, bArr4, 0, i11);
            bArr2 = bArr4;
        }
        try {
            Cipher cipherM9948a = AbstractC5037q.m9948a(this.f39364d);
            this.f39365e = cipherM9948a;
            mo14713h(cipherM9948a, enumC8227b, bArr, bArr2);
        } catch (GeneralSecurityException e2) {
            this.f39365e = null;
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    @Override // wy.InterfaceC8228c
    /* renamed from: b */
    public void mo14710b(int i10, byte[] bArr) {
        throw new UnsupportedOperationException(getClass() + " does not support AAD operations");
    }

    @Override // wy.InterfaceC8228c
    /* renamed from: c */
    public final void mo15401c(int i10, int i11, byte[] bArr) throws ShortBufferException {
        mo14710b(i10, bArr);
        update(bArr, i10 + 4, i11);
    }

    @Override // wy.InterfaceC8228c
    /* renamed from: d */
    public int mo14711d() {
        return 0;
    }

    @Override // wy.InterfaceC8228c
    /* renamed from: f */
    public final int mo15402f() {
        return this.f39361a;
    }

    /* renamed from: g */
    public final SecretKeySpec m15403g(byte[] bArr) {
        return new SecretKeySpec(bArr, this.f39363c);
    }

    @Override // wy.InterfaceC8228c
    public final int getBlockSize() {
        return this.f39362b;
    }

    /* renamed from: h */
    public abstract void mo14713h(Cipher cipher, EnumC8227b enumC8227b, byte[] bArr, byte[] bArr2);

    @Override // wy.InterfaceC8228c
    public void update(byte[] bArr, int i10, int i11) throws ShortBufferException {
        try {
            this.f39365e.update(bArr, i10, i11, bArr, i10);
        } catch (ShortBufferException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    @Override // wy.InterfaceC8228c
    /* renamed from: e */
    public void mo14712e(long j6) {
    }
}

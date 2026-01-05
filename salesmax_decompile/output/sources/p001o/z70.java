package p001o;

import com.google.android.gms.common.api.Api;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class z70 implements sh8 {

    /* renamed from: d */
    public static final ThreadLocal f56615d = new C18564a();

    /* renamed from: a */
    public final SecretKeySpec f56616a;

    /* renamed from: b */
    public final int f56617b;

    /* renamed from: c */
    public final int f56618c;

    /* renamed from: o.z70$a */
    public class C18564a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) ag6.f14654f.m17023a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public z70(byte[] bArr, int i) throws GeneralSecurityException {
        sri.m48827a(bArr.length);
        this.f56616a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f56615d.get()).getBlockSize();
        this.f56618c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f56617b = i;
    }

    @Override // p001o.sh8
    /* renamed from: a */
    public byte[] mo46640a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f56617b;
        if (length > Api.BaseClientBuilder.API_PRIORITY_OTHER - i) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.f56617b));
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] bArrM51350c = ube.m51350c(i);
        System.arraycopy(bArrM51350c, 0, bArr2, 0, this.f56617b);
        m58859c(bArr, 0, bArr.length, bArr2, this.f56617b, bArrM51350c, true);
        return bArr2;
    }

    @Override // p001o.sh8
    /* renamed from: b */
    public byte[] mo46641b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f56617b;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int length2 = bArr.length;
        int i2 = this.f56617b;
        byte[] bArr3 = new byte[length2 - i2];
        m58859c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
        return bArr3;
    }

    /* renamed from: c */
    public final void m58859c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f56615d.get();
        byte[] bArr4 = new byte[this.f56618c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f56617b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f56616a, ivParameterSpec);
        } else {
            cipher.init(2, this.f56616a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}

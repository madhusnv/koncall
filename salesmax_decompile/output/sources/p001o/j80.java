package p001o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class j80 implements p70 {

    /* renamed from: b */
    public static final ThreadLocal f29945b = new C14472a();

    /* renamed from: a */
    public final SecretKey f29946a;

    /* renamed from: o.j80$a */
    public class C14472a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) ag6.f14654f.m17023a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public j80(byte[] bArr) throws InvalidAlgorithmParameterException {
        sri.m48827a(bArr.length);
        this.f29946a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m33392c(byte[] bArr) {
        return m33393d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static AlgorithmParameterSpec m33393d(byte[] bArr, int i, int i2) {
        return (!ybg.m57488b() || ybg.m57487a() > 19) ? new GCMParameterSpec(128, bArr, i, i2) : new IvParameterSpec(bArr, i, i2);
    }

    @Override // p001o.p70
    /* renamed from: a */
    public byte[] mo24514a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] bArrM51350c = ube.m51350c(12);
        System.arraycopy(bArrM51350c, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecM33392c = m33392c(bArrM51350c);
        ThreadLocal threadLocal = f29945b;
        ((Cipher) threadLocal.get()).init(1, this.f29946a, algorithmParameterSpecM33392c);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }

    @Override // p001o.p70
    /* renamed from: b */
    public byte[] mo24515b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecM33393d = m33393d(bArr, 0, 12);
        ThreadLocal threadLocal = f29945b;
        ((Cipher) threadLocal.get()).init(2, this.f29946a, algorithmParameterSpecM33393d);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}

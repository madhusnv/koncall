package p001o;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class ohd implements nhd {

    /* renamed from: a */
    public final SecretKey f38364a;

    /* renamed from: b */
    public byte[] f38365b;

    /* renamed from: c */
    public byte[] f38366c;

    public ohd(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sri.m48827a(bArr.length);
        this.f38364a = new SecretKeySpec(bArr, "AES");
        m42247b();
    }

    /* renamed from: c */
    public static Cipher m42246c() {
        return (Cipher) ag6.f14654f.m17023a("AES/ECB/NoPadding");
    }

    @Override // p001o.nhd
    /* renamed from: a */
    public byte[] mo40605a(byte[] bArr, int i) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherM42246c = m42246c();
        cipherM42246c.init(1, this.f38364a);
        int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] bArrM17697d = iMax * 16 == bArr.length ? ar1.m17697d(bArr, (iMax - 1) * 16, this.f38365b, 0, 16) : ar1.m17698e(v80.m52451a(Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length)), this.f38366c);
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipherM42246c.doFinal(ar1.m17697d(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipherM42246c.doFinal(ar1.m17698e(bArrM17697d, bArrDoFinal)), i);
    }

    /* renamed from: b */
    public final void m42247b() throws InvalidKeyException {
        Cipher cipherM42246c = m42246c();
        cipherM42246c.init(1, this.f38364a);
        byte[] bArrM52452b = v80.m52452b(cipherM42246c.doFinal(new byte[16]));
        this.f38365b = bArrM52452b;
        this.f38366c = v80.m52452b(bArrM52452b);
    }
}

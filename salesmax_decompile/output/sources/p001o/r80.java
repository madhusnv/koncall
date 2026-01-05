package p001o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class r80 implements yp5 {

    /* renamed from: c */
    public static final Collection f43123c = Arrays.asList(64);

    /* renamed from: d */
    public static final byte[] f43124d = new byte[16];

    /* renamed from: e */
    public static final byte[] f43125e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a */
    public final ohd f43126a;

    /* renamed from: b */
    public final byte[] f43127b;

    public r80(byte[] bArr) throws InvalidKeyException {
        if (f43123c.contains(Integer.valueOf(bArr.length))) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f43127b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f43126a = new ohd(bArrCopyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    @Override // p001o.yp5
    /* renamed from: a */
    public byte[] mo17650a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) ag6.f14654f.m17023a("AES/CTR/NoPadding");
        byte[] bArrM46331c = m46331c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrM46331c.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f43127b, "AES"), new IvParameterSpec(bArr3));
        return ar1.m17694a(bArrM46331c, cipher.doFinal(bArr));
    }

    @Override // p001o.yp5
    /* renamed from: b */
    public byte[] mo17651b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) ag6.f14654f.m17023a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f43127b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && ybg.m57488b()) {
            bArrDoFinal = new byte[0];
        }
        if (ar1.m17695b(bArrCopyOfRange, m46331c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    /* renamed from: c */
    public final byte[] m46331c(byte[]... bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr.length == 0) {
            return this.f43126a.mo40605a(f43125e, 16);
        }
        byte[] bArrMo40605a = this.f43126a.mo40605a(f43124d, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrMo40605a = ar1.m17698e(v80.m52452b(bArrMo40605a), this.f43126a.mo40605a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f43126a.mo40605a(bArr3.length >= 16 ? ar1.m17699f(bArr3, bArrMo40605a) : ar1.m17698e(v80.m52451a(bArr3), v80.m52452b(bArrMo40605a)), 16);
    }
}

package ii;

import ai.InterfaceC0144a;
import ci.C0973a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.b */
/* loaded from: classes.dex */
public final class C3260b implements InterfaceC0144a {

    /* renamed from: e */
    public static final C0973a f17439e = new C0973a(3);

    /* renamed from: f */
    public static final C0973a f17440f = new C0973a(4);

    /* renamed from: a */
    public final byte[] f17441a;

    /* renamed from: b */
    public final byte[] f17442b;

    /* renamed from: c */
    public final SecretKeySpec f17443c;

    /* renamed from: d */
    public final int f17444d;

    public C3260b(byte[] bArr, int i10) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f17444d = i10;
        AbstractC3275q.m7625a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f17443c = secretKeySpec;
        Cipher cipher = (Cipher) f17439e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM7604c = m7604c(cipher.doFinal(new byte[16]));
        this.f17441a = bArrM7604c;
        this.f17442b = m7604c(bArrM7604c);
    }

    /* renamed from: c */
    public static byte[] m7604c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    /* renamed from: e */
    public static byte[] m7605e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: a */
    public final byte[] mo308a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f17444d;
        if (length > 2147483631 - i10) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i10 + 16];
        byte[] bArrM7624a = AbstractC3274p.m7624a(i10);
        System.arraycopy(bArrM7624a, 0, bArr3, 0, i10);
        Cipher cipher = (Cipher) f17439e.get();
        SecretKeySpec secretKeySpec = this.f17443c;
        cipher.init(1, secretKeySpec);
        byte[] bArrM7606d = m7606d(cipher, 0, bArrM7624a, 0, bArrM7624a.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM7606d2 = m7606d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f17440f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM7606d));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f17444d);
        byte[] bArrM7606d3 = m7606d(cipher, 2, bArr3, this.f17444d, bArr.length);
        int length2 = bArr.length + i10;
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[length2 + i11] = (byte) ((bArrM7606d2[i11] ^ bArrM7606d[i11]) ^ bArrM7606d3[i11]);
        }
        return bArr3;
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: b */
    public final byte[] mo309b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f17444d;
        int i11 = (length - i10) - 16;
        if (i11 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f17439e.get();
        SecretKeySpec secretKeySpec = this.f17443c;
        cipher.init(1, secretKeySpec);
        byte[] bArrM7606d = m7606d(cipher, 0, bArr, 0, this.f17444d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM7606d2 = m7606d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrM7606d3 = m7606d(cipher, 2, bArr, this.f17444d, i11);
        int length2 = bArr.length - 16;
        byte b10 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            b10 = (byte) (b10 | (((bArr[length2 + i12] ^ bArrM7606d2[i12]) ^ bArrM7606d[i12]) ^ bArrM7606d3[i12]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f17440f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM7606d));
        return cipher2.doFinal(bArr, i10, i11);
    }

    /* renamed from: d */
    public final byte[] m7606d(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        byte[] bArr3 = this.f17441a;
        if (i12 == 0) {
            return cipher.doFinal(m7605e(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                bArrDoFinal[i14] = (byte) (bArrDoFinal[i14] ^ bArr[(i11 + i13) + i14]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i13 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13 + i11, i11 + i12);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = m7605e(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f17442b, 16);
            for (int i15 = 0; i15 < bArrCopyOfRange.length; i15++) {
                bArrCopyOf[i15] = (byte) (bArrCopyOf[i15] ^ bArrCopyOfRange[i15]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(m7605e(bArrDoFinal, bArrCopyOf));
    }
}

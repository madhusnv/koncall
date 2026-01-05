package ii;

import a1.C0005d;
import ai.InterfaceC0147d;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.n6;
import pg.p6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.d */
/* loaded from: classes.dex */
public final class C3262d implements InterfaceC0147d {

    /* renamed from: c */
    public static final List f17447c = Arrays.asList(64);

    /* renamed from: d */
    public static final byte[] f17448d = new byte[16];

    /* renamed from: e */
    public static final byte[] f17449e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a */
    public final C0005d f17450a;

    /* renamed from: b */
    public final byte[] f17451b;

    public C3262d(byte[] bArr) throws InvalidKeyException {
        if (!f17447c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(AbstractC5601a.m11233d(bArr.length, " bytes; key must have 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f17451b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f17450a = new C0005d(bArrCopyOfRange);
    }

    @Override // ai.InterfaceC0147d
    /* renamed from: a */
    public final byte[] mo310a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) C3269k.f17466e.m7622a("AES/CTR/NoPadding");
        byte[] bArrM7608c = m7608c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrM7608c.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f17451b, "AES"), new IvParameterSpec(bArr3));
        return p6.m11815b(bArrM7608c, cipher.doFinal(bArr));
    }

    @Override // ai.InterfaceC0147d
    /* renamed from: b */
    public final byte[] mo311b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) C3269k.f17466e.m7622a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f17451b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null) {
            try {
                Class.forName("android.app.Application", false, null);
                bArrDoFinal = new byte[0];
            } catch (Exception unused) {
            }
        }
        if (p6.m11816c(bArrCopyOfRange, m7608c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    /* renamed from: c */
    public final byte[] m7608c(byte[]... bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrM11820g;
        int length = bArr.length;
        C0005d c0005d = this.f17450a;
        if (length == 0) {
            return c0005d.mo67i(16, f17449e);
        }
        byte[] bArrMo67i = c0005d.mo67i(16, f17448d);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrMo67i = p6.m11820g(n6.m11796b(bArrMo67i), c0005d.mo67i(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrMo67i.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrMo67i.length;
            bArrM11820g = Arrays.copyOf(bArr3, bArr3.length);
            for (int i11 = 0; i11 < bArrMo67i.length; i11++) {
                int i12 = length2 + i11;
                bArrM11820g[i12] = (byte) (bArrM11820g[i12] ^ bArrMo67i[i11]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrM11820g = p6.m11820g(bArrCopyOf, n6.m11796b(bArrMo67i));
        }
        return c0005d.mo67i(16, bArrM11820g);
    }
}

package bi;

import a1.C0005d;
import ai.C0155l;
import ai.InterfaceC0144a;
import i0.m0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import pg.p6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bi.b */
/* loaded from: classes.dex */
public final class C0663b implements InterfaceC0144a {

    /* renamed from: a */
    public final /* synthetic */ int f4214a = 0;

    /* renamed from: b */
    public final Object f4215b;

    public C0663b(C0005d c0005d) {
        this.f4215b = c0005d;
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: a */
    public final byte[] mo308a(byte[] bArr, byte[] bArr2) {
        switch (this.f4214a) {
            case 0:
                C0005d c0005d = (C0005d) this.f4215b;
                return p6.m11815b(((C0155l) c0005d.f25c).m360a(), ((InterfaceC0144a) ((C0155l) c0005d.f25c).f487a).mo308a(bArr, bArr2));
            default:
                try {
                    return m1935d(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException unused) {
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                    } catch (InterruptedException unused2) {
                    }
                    return m1935d(bArr, bArr2);
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    @Override // ai.InterfaceC0144a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] mo309b(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException, java.lang.InterruptedException {
        /*
            r7 = this;
            int r0 = r7.f4214a
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            byte[] r8 = r7.m1934c(r8, r9)     // Catch: java.lang.Throwable -> La
            goto L1a
        La:
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L16
        L16:
            byte[] r8 = r7.m1934c(r8, r9)
        L1a:
            return r8
        L1b:
            java.lang.Object r0 = r7.f4215b
            a1.d r0 = (a1.C0005d) r0
            int r1 = r8.length
            r2 = 5
            if (r1 <= r2) goto L63
            r1 = 0
            byte[] r1 = java.util.Arrays.copyOfRange(r8, r1, r2)
            int r3 = r8.length
            byte[] r2 = java.util.Arrays.copyOfRange(r8, r2, r3)
            java.util.List r1 = r0.m80y(r1)
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L63
            java.lang.Object r3 = r1.next()
            ai.l r3 = (ai.C0155l) r3
            java.lang.Object r3 = r3.f487a     // Catch: java.security.GeneralSecurityException -> L4a
            ai.a r3 = (ai.InterfaceC0144a) r3     // Catch: java.security.GeneralSecurityException -> L4a
            byte[] r8 = r3.mo309b(r2, r9)     // Catch: java.security.GeneralSecurityException -> L4a
            goto L81
        L4a:
            r3 = move-exception
            java.util.logging.Logger r4 = bi.C0664c.f4216a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ciphertext prefix matches a key, but cannot decrypt: "
            r5.<init>(r6)
            java.lang.String r3 = r3.toString()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.info(r3)
            goto L35
        L63:
            byte[] r1 = ai.AbstractC0146c.f478a
            java.util.List r0 = r0.m80y(r1)
            java.util.Iterator r0 = r0.iterator()
        L6d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r0.next()
            ai.l r1 = (ai.C0155l) r1
            java.lang.Object r1 = r1.f487a     // Catch: java.security.GeneralSecurityException -> L6d
            ai.a r1 = (ai.InterfaceC0144a) r1     // Catch: java.security.GeneralSecurityException -> L6d
            byte[] r8 = r1.mo309b(r8, r9)     // Catch: java.security.GeneralSecurityException -> L6d
        L81:
            return r8
        L82:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "decryption failed"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.C0663b.mo309b(byte[], byte[]):byte[]");
    }

    /* renamed from: c */
    public byte[] m1934c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, (SecretKey) this.f4215b, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    /* renamed from: d */
    public byte[] m1935d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (SecretKey) this.f4215b);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    public C0663b(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f4215b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(m0.m7378k("Keystore cannot load the key with ID: ", str));
        }
    }
}

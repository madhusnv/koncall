package net.schmizz.sshj.common;

import j$.util.Base64;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.f */
/* loaded from: classes3.dex */
public abstract class AbstractC5026f {

    /* renamed from: a */
    public static final byte[] f24781a;

    static {
        Base64.getDecoder().decode("MC4CAQEwBQYDK2VwBCIEIA");
        f24781a = Base64.getDecoder().decode("MCowBQYDK2VwAyEA");
    }

    /* renamed from: a */
    public static PublicKey m9935a(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length of 32 bytes required");
        }
        byte[] bArr2 = new byte[44];
        byte[] bArr3 = f24781a;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(bArr, 0, bArr2, bArr3.length, 32);
        return AbstractC5037q.m9950c(EdDSAParameterSpec.Ed25519).generatePublic(new X509EncodedKeySpec(bArr2));
    }
}

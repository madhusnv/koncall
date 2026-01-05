package uy;

import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import net.schmizz.sshj.common.EnumC5031k;
import net.schmizz.sshj.common.SSHRuntimeException;
import yl.C8689b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uy.e */
/* loaded from: classes3.dex */
public final class C7575e extends AbstractC7571a {

    /* renamed from: c */
    public final EnumC5031k f36451c;

    public C7575e(String str, EnumC5031k enumC5031k, String str2) {
        super(str, str2);
        this.f36451c = enumC5031k;
    }

    @Override // uy.AbstractC7571a
    /* renamed from: b */
    public final void mo14306b(PublicKey publicKey) throws InvalidKeyException {
        try {
            boolean zEquals = this.f36451c.equals(EnumC5031k.RSA_CERT);
            Signature signature = this.f36448a;
            if (zEquals && (publicKey instanceof C8689b)) {
                signature.initVerify(((C8689b) publicKey).f42050a);
            } else {
                signature.initVerify(publicKey);
            }
        } catch (InvalidKeyException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    @Override // uy.AbstractC7571a
    /* renamed from: d */
    public final boolean mo13437d(byte[] bArr) {
        try {
            return this.f36448a.verify(AbstractC7571a.m14305a(this.f36449b, bArr));
        } catch (SignatureException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }
}

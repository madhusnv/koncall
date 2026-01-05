package uy;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import net.schmizz.sshj.common.AbstractC5037q;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5021a;
import net.schmizz.sshj.common.SSHRuntimeException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uy.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7571a {

    /* renamed from: a */
    public final Signature f36448a;

    /* renamed from: b */
    public final String f36449b;

    public AbstractC7571a(String str, String str2) {
        try {
            this.f36448a = AbstractC5037q.m9954g(str);
            this.f36449b = str2;
        } catch (GeneralSecurityException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    /* renamed from: a */
    public static byte[] m14305a(String str, byte[] bArr) {
        C5021a c5021a = new C5021a(bArr, true);
        try {
            String strM9929x = c5021a.m9929x();
            if (str.equals(strM9929x)) {
                return c5021a.m9925t();
            }
            throw new SSHRuntimeException("Expected '" + str + "' key algorithm, but got: " + strM9929x);
        } catch (Buffer$BufferException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    /* renamed from: b */
    public void mo14306b(PublicKey publicKey) throws InvalidKeyException {
        try {
            this.f36448a.initVerify(publicKey);
        } catch (InvalidKeyException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    /* renamed from: c */
    public final void m14307c(int i10, byte[] bArr) throws SignatureException {
        try {
            this.f36448a.update(bArr, 0, i10);
        } catch (SignatureException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    /* renamed from: d */
    public abstract boolean mo13437d(byte[] bArr);

    public AbstractC7571a(Signature signature, String str) {
        this.f36448a = signature;
        this.f36449b = str;
    }
}

package uy;

import java.io.IOException;
import java.security.SignatureException;
import net.schmizz.sshj.common.C5021a;
import net.schmizz.sshj.common.SSHRuntimeException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uy.d */
/* loaded from: classes3.dex */
public final class C7574d extends AbstractC7572b {

    /* renamed from: c */
    public final String f36450c;

    public C7574d(String str, String str2) {
        super(str, str2);
        this.f36450c = str2;
    }

    @Override // uy.AbstractC7571a
    /* renamed from: d */
    public final boolean mo13437d(byte[] bArr) {
        try {
            C5021a c5021a = new C5021a(AbstractC7571a.m14305a(this.f36450c, bArr), true);
            return this.f36448a.verify(AbstractC7572b.m14308e(c5021a.m9926u(), c5021a.m9926u()));
        } catch (IOException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        } catch (SignatureException e10) {
            throw new SSHRuntimeException(e10.getMessage(), e10);
        }
    }
}

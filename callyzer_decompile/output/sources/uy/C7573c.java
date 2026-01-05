package uy;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SignatureException;
import java.util.Arrays;
import net.schmizz.sshj.common.SSHRuntimeException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uy.c */
/* loaded from: classes3.dex */
public final class C7573c extends AbstractC7572b {
    @Override // uy.AbstractC7571a
    /* renamed from: d */
    public final boolean mo13437d(byte[] bArr) {
        try {
            byte[] bArrM14305a = AbstractC7571a.m14305a("ssh-dss", bArr);
            return this.f36448a.verify(AbstractC7572b.m14308e(new BigInteger(1, Arrays.copyOfRange(bArrM14305a, 0, 20)), new BigInteger(1, Arrays.copyOfRange(bArrM14305a, 20, 40))));
        } catch (IOException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        } catch (SignatureException e10) {
            throw new SSHRuntimeException(e10.getMessage(), e10);
        }
    }
}

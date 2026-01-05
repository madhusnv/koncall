package tl;

import java.security.SignatureException;
import net.schmizz.sshj.common.SSHRuntimeException;
import uy.AbstractC7571a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tl.a */
/* loaded from: classes.dex */
public final class C7172a extends AbstractC7571a {
    @Override // uy.AbstractC7571a
    /* renamed from: d */
    public final boolean mo13437d(byte[] bArr) {
        try {
            return this.f36448a.verify(AbstractC7571a.m14305a("ssh-ed25519", bArr));
        } catch (SignatureException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }
}

package di;

import a1.C0005d;
import ai.AbstractC0146c;
import ai.C0155l;
import ai.InterfaceC0147d;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import pg.p6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: di.b */
/* loaded from: classes.dex */
public final class C1726b implements InterfaceC0147d {

    /* renamed from: a */
    public C0005d f8370a;

    @Override // ai.InterfaceC0147d
    /* renamed from: a */
    public final byte[] mo310a(byte[] bArr, byte[] bArr2) {
        C0005d c0005d = this.f8370a;
        return p6.m11815b(((C0155l) c0005d.f25c).m360a(), ((InterfaceC0147d) ((C0155l) c0005d.f25c).f487a).mo310a(bArr, bArr2));
    }

    @Override // ai.InterfaceC0147d
    /* renamed from: b */
    public final byte[] mo311b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C0005d c0005d = this.f8370a;
        if (bArr.length > 5) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = c0005d.m80y(bArrCopyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((InterfaceC0147d) ((C0155l) it.next()).f487a).mo311b(bArrCopyOfRange2, bArr2);
                } catch (GeneralSecurityException e2) {
                    C1727c.f8371a.info("ciphertext prefix matches a key, but cannot decrypt: " + e2.toString());
                }
            }
        }
        Iterator it2 = c0005d.m80y(AbstractC0146c.f478a).iterator();
        while (it2.hasNext()) {
            try {
                return ((InterfaceC0147d) ((C0155l) it2.next()).f487a).mo311b(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}

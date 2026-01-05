package fi;

import a1.C0005d;
import ai.AbstractC0146c;
import ai.C0155l;
import ai.InterfaceC0154k;
import hi.o2;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import pg.p6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fi.c */
/* loaded from: classes.dex */
public final class C2292c implements InterfaceC0154k {

    /* renamed from: a */
    public final C0005d f10330a;

    /* renamed from: b */
    public final byte[] f10331b = {0};

    public C2292c(C0005d c0005d) {
        this.f10330a = c0005d;
    }

    @Override // ai.InterfaceC0154k
    /* renamed from: a */
    public final void mo358a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        C0005d c0005d = this.f10330a;
        for (C0155l c0155l : c0005d.m80y(bArrCopyOf)) {
            try {
                if (c0155l.f490d.equals(o2.LEGACY)) {
                    ((InterfaceC0154k) c0155l.f487a).mo358a(bArrCopyOfRange, p6.m11815b(bArr2, this.f10331b));
                } else {
                    ((InterfaceC0154k) c0155l.f487a).mo358a(bArrCopyOfRange, bArr2);
                }
                return;
            } catch (GeneralSecurityException e2) {
                C2293d.f10332a.info("tag prefix matches a key, but cannot verify: " + e2);
            }
        }
        Iterator it = c0005d.m80y(AbstractC0146c.f478a).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0154k) ((C0155l) it.next()).f487a).mo358a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // ai.InterfaceC0154k
    /* renamed from: b */
    public final byte[] mo359b(byte[] bArr) {
        C0005d c0005d = this.f10330a;
        return ((C0155l) c0005d.f25c).f490d.equals(o2.LEGACY) ? p6.m11815b(((C0155l) c0005d.f25c).m360a(), ((InterfaceC0154k) ((C0155l) c0005d.f25c).f487a).mo359b(p6.m11815b(bArr, this.f10331b))) : p6.m11815b(((C0155l) c0005d.f25c).m360a(), ((InterfaceC0154k) ((C0155l) c0005d.f25c).f487a).mo359b(bArr));
    }
}

package ii;

import ai.InterfaceC0154k;
import gi.InterfaceC2618a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import pg.p6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.o */
/* loaded from: classes.dex */
public final class C3273o implements InterfaceC0154k {

    /* renamed from: a */
    public final InterfaceC2618a f17471a;

    /* renamed from: b */
    public final int f17472b;

    public C3273o(InterfaceC2618a interfaceC2618a, int i10) throws InvalidAlgorithmParameterException {
        this.f17471a = interfaceC2618a;
        this.f17472b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC2618a.mo67i(i10, new byte[0]);
    }

    @Override // ai.InterfaceC0154k
    /* renamed from: a */
    public final void mo358a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!p6.m11816c(mo359b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // ai.InterfaceC0154k
    /* renamed from: b */
    public final byte[] mo359b(byte[] bArr) {
        return this.f17471a.mo67i(this.f17472b, bArr);
    }
}

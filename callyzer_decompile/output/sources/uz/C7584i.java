package uz;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uz.i */
/* loaded from: classes3.dex */
public final class C7584i implements InterfaceC7587l {
    @Override // uz.InterfaceC7587l
    /* renamed from: a */
    public final boolean mo13823a(SSLSocket sSLSocket) {
        return C7586k.f36465b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // uz.InterfaceC7587l
    /* renamed from: f */
    public final InterfaceC7589n mo13827f(SSLSocket sSLSocket) {
        return new C7586k();
    }
}

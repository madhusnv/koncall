package uz;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uz.m */
/* loaded from: classes3.dex */
public final class C7588m implements InterfaceC7589n {

    /* renamed from: a */
    public final InterfaceC7587l f36466a;

    /* renamed from: b */
    public InterfaceC7589n f36467b;

    public C7588m(InterfaceC7587l interfaceC7587l) {
        this.f36466a = interfaceC7587l;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: a */
    public final boolean mo14309a(SSLSocket sSLSocket) {
        return this.f36466a.mo13823a(sSLSocket);
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: b */
    public final boolean mo14310b() {
        return true;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: c */
    public final String mo14311c(SSLSocket sSLSocket) {
        InterfaceC7589n interfaceC7589nM14316e = m14316e(sSLSocket);
        if (interfaceC7589nM14316e != null) {
            return interfaceC7589nM14316e.mo14311c(sSLSocket);
        }
        return null;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: d */
    public final void mo14312d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC4154l.m8923f(protocols, "protocols");
        InterfaceC7589n interfaceC7589nM14316e = m14316e(sSLSocket);
        if (interfaceC7589nM14316e != null) {
            interfaceC7589nM14316e.mo14312d(sSLSocket, str, protocols);
        }
    }

    /* renamed from: e */
    public final synchronized InterfaceC7589n m14316e(SSLSocket sSLSocket) {
        try {
            if (this.f36467b == null && this.f36466a.mo13823a(sSLSocket)) {
                this.f36467b = this.f36466a.mo13827f(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f36467b;
    }
}

package pc;

import ex.InterfaceC2137a;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.c */
/* loaded from: classes.dex */
public final class C5875c implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f28656a;

    /* renamed from: b */
    public final /* synthetic */ InetSocketAddress f28657b;

    /* renamed from: c */
    public final /* synthetic */ Proxy f28658c;

    public /* synthetic */ C5875c(InetSocketAddress inetSocketAddress, Proxy proxy, int i10) {
        this.f28656a = i10;
        this.f28657b = inetSocketAddress;
        this.f28658c = proxy;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f28656a) {
            case 0:
                return "connect failed: addr=" + this.f28657b + "; proxy=" + this.f28658c + "; protocol=null";
            default:
                return "starting connection: addr=" + this.f28657b + "; proxy=" + this.f28658c;
        }
    }
}

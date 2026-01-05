package og;

import java.net.InetSocketAddress;
import ql.InterfaceC6244a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class gd {

    /* renamed from: a */
    public static final /* synthetic */ int f26474a = 0;

    /* renamed from: a */
    public static void m10670a(Thread thread, InterfaceC6244a interfaceC6244a) {
        InetSocketAddress inetSocketAddressMo12054j = interfaceC6244a.mo12054j();
        thread.setName(String.format("sshj-%s-%s-%d", thread.getClass().getSimpleName(), inetSocketAddressMo12054j == null ? "DISCONNECTED" : inetSocketAddressMo12054j.toString(), Long.valueOf(System.currentTimeMillis())));
    }
}

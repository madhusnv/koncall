package p001o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p001o.kk5;

/* loaded from: classes6.dex */
public final class cl1 implements dyf {

    /* renamed from: a */
    public static final C12701b f18286a = new C12701b(null);

    /* renamed from: b */
    public static final kk5.InterfaceC14853a f18287b = new C12700a();

    /* renamed from: o.cl1$a */
    public static final class C12700a implements kk5.InterfaceC14853a {
        @Override // p001o.kk5.InterfaceC14853a
        /* renamed from: b */
        public boolean mo21372b(SSLSocket sSLSocket) {
            sq8.m48649h(sSLSocket, "sslSocket");
            return bl1.f16469e.m19315b() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // p001o.kk5.InterfaceC14853a
        /* renamed from: c */
        public dyf mo21373c(SSLSocket sSLSocket) {
            sq8.m48649h(sSLSocket, "sslSocket");
            return new cl1();
        }
    }

    /* renamed from: o.cl1$b */
    public static final class C12701b {
        public C12701b() {
        }

        public /* synthetic */ C12701b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final kk5.InterfaceC14853a m21374a() {
            return cl1.f18287b;
        }
    }

    @Override // p001o.dyf
    /* renamed from: a */
    public boolean mo16886a() {
        return bl1.f16469e.m19315b();
    }

    @Override // p001o.dyf
    /* renamed from: b */
    public boolean mo16887b(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // p001o.dyf
    /* renamed from: c */
    public String mo16888c(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : sq8.m48644c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p001o.dyf
    /* renamed from: d */
    public void mo16889d(SSLSocket sSLSocket, String str, List list) {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        if (mo16887b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) e9d.f21191a.m24577b(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}

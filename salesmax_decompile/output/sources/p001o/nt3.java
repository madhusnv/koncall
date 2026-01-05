package p001o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p001o.kk5;

/* loaded from: classes6.dex */
public final class nt3 implements dyf {

    /* renamed from: a */
    public static final C15668b f37282a = new C15668b(null);

    /* renamed from: b */
    public static final kk5.InterfaceC14853a f37283b = new C15667a();

    /* renamed from: o.nt3$a */
    public static final class C15667a implements kk5.InterfaceC14853a {
        @Override // p001o.kk5.InterfaceC14853a
        /* renamed from: b */
        public boolean mo21372b(SSLSocket sSLSocket) {
            sq8.m48649h(sSLSocket, "sslSocket");
            return mt3.f35938e.m39633c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // p001o.kk5.InterfaceC14853a
        /* renamed from: c */
        public dyf mo21373c(SSLSocket sSLSocket) {
            sq8.m48649h(sSLSocket, "sslSocket");
            return new nt3();
        }
    }

    /* renamed from: o.nt3$b */
    public static final class C15668b {
        public C15668b() {
        }

        public /* synthetic */ C15668b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final kk5.InterfaceC14853a m41108a() {
            return nt3.f37283b;
        }
    }

    @Override // p001o.dyf
    /* renamed from: a */
    public boolean mo16886a() {
        return mt3.f35938e.m39633c();
    }

    @Override // p001o.dyf
    /* renamed from: b */
    public boolean mo16887b(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p001o.dyf
    /* renamed from: c */
    public String mo16888c(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        if (mo16887b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p001o.dyf
    /* renamed from: d */
    public void mo16889d(SSLSocket sSLSocket, String str, List list) {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        if (mo16887b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) e9d.f21191a.m24577b(list).toArray(new String[0]));
        }
    }
}

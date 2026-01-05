package p001o;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
public final class kk5 implements dyf {

    /* renamed from: a */
    public final InterfaceC14853a f32326a;

    /* renamed from: b */
    public dyf f32327b;

    /* renamed from: o.kk5$a */
    public interface InterfaceC14853a {
        /* renamed from: b */
        boolean mo21372b(SSLSocket sSLSocket);

        /* renamed from: c */
        dyf mo21373c(SSLSocket sSLSocket);
    }

    public kk5(InterfaceC14853a interfaceC14853a) {
        sq8.m48649h(interfaceC14853a, "socketAdapterFactory");
        this.f32326a = interfaceC14853a;
    }

    @Override // p001o.dyf
    /* renamed from: a */
    public boolean mo16886a() {
        return true;
    }

    @Override // p001o.dyf
    /* renamed from: b */
    public boolean mo16887b(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        return this.f32326a.mo21372b(sSLSocket);
    }

    @Override // p001o.dyf
    /* renamed from: c */
    public String mo16888c(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        dyf dyfVarM35800e = m35800e(sSLSocket);
        if (dyfVarM35800e != null) {
            return dyfVarM35800e.mo16888c(sSLSocket);
        }
        return null;
    }

    @Override // p001o.dyf
    /* renamed from: d */
    public void mo16889d(SSLSocket sSLSocket, String str, List list) {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        dyf dyfVarM35800e = m35800e(sSLSocket);
        if (dyfVarM35800e != null) {
            dyfVarM35800e.mo16889d(sSLSocket, str, list);
        }
    }

    /* renamed from: e */
    public final synchronized dyf m35800e(SSLSocket sSLSocket) {
        if (this.f32327b == null && this.f32326a.mo21372b(sSLSocket)) {
            this.f32327b = this.f32326a.mo21373c(sSLSocket);
        }
        return this.f32327b;
    }
}

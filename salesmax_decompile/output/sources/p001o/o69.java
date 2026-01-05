package p001o;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
public class o69 extends e9d {

    /* renamed from: d */
    public static final C15718a f37825d = new C15718a(0 == true ? 1 : 0);

    /* renamed from: e */
    public static final boolean f37826e;

    /* renamed from: f */
    public static final Integer f37827f;

    /* renamed from: o.o69$a */
    public static final class C15718a {
        public C15718a() {
        }

        public /* synthetic */ C15718a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final o69 m41640a() {
            if (m41641b()) {
                return new o69();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m41641b() {
            return o69.f37826e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property = System.getProperty("java.specification.version");
        Integer numM22638l = property != null ? d9g.m22638l(property) : null;
        f37827f = numM22638l;
        boolean z = true;
        if (numM22638l == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM22638l.intValue() < 9) {
            z = false;
        }
        f37826e = z;
    }

    @Override // p001o.e9d
    /* renamed from: e */
    public void mo19310e(SSLSocket sSLSocket, String str, List list) {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) e9d.f21191a.m24577b(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p001o.e9d
    /* renamed from: g */
    public String mo19311g(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : sq8.m48644c(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // p001o.e9d
    /* renamed from: m */
    public SSLContext mo19312m() throws NoSuchAlgorithmException {
        SSLContext sSLContext;
        Integer num = f37827f;
        if (num != null && num.intValue() >= 9) {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            sq8.m48648g(sSLContext2, "getInstance(...)");
            return sSLContext2;
        }
        try {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = SSLContext.getInstance("TLS");
        }
        sq8.m48646e(sSLContext);
        return sSLContext;
    }
}

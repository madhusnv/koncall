package p001o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p001o.kk5;

/* loaded from: classes6.dex */
public class pf0 implements dyf {

    /* renamed from: f */
    public static final C16095a f39972f;

    /* renamed from: g */
    public static final kk5.InterfaceC14853a f39973g;

    /* renamed from: a */
    public final Class f39974a;

    /* renamed from: b */
    public final Method f39975b;

    /* renamed from: c */
    public final Method f39976c;

    /* renamed from: d */
    public final Method f39977d;

    /* renamed from: e */
    public final Method f39978e;

    /* renamed from: o.pf0$a */
    public static final class C16095a {

        /* renamed from: o.pf0$a$a */
        public static final class a implements kk5.InterfaceC14853a {

            /* renamed from: a */
            public final /* synthetic */ String f39979a;

            public a(String str) {
                this.f39979a = str;
            }

            @Override // p001o.kk5.InterfaceC14853a
            /* renamed from: b */
            public boolean mo21372b(SSLSocket sSLSocket) {
                sq8.m48649h(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                sq8.m48648g(name, "getName(...)");
                return e9g.m24597K(name, this.f39979a + '.', false, 2, null);
            }

            @Override // p001o.kk5.InterfaceC14853a
            /* renamed from: c */
            public dyf mo21373c(SSLSocket sSLSocket) {
                sq8.m48649h(sSLSocket, "sslSocket");
                return pf0.f39972f.m43547b(sSLSocket.getClass());
            }
        }

        public C16095a() {
        }

        public /* synthetic */ C16095a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final pf0 m43547b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !sq8.m48644c(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            sq8.m48646e(superclass);
            return new pf0(superclass);
        }

        /* renamed from: c */
        public final kk5.InterfaceC14853a m43548c(String str) {
            sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            return new a(str);
        }

        /* renamed from: d */
        public final kk5.InterfaceC14853a m43549d() {
            return pf0.f39973g;
        }
    }

    static {
        C16095a c16095a = new C16095a(null);
        f39972f = c16095a;
        f39973g = c16095a.m43548c("com.google.android.gms.org.conscrypt");
    }

    public pf0(Class cls) throws NoSuchMethodException, SecurityException {
        sq8.m48649h(cls, "sslSocketClass");
        this.f39974a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        sq8.m48648g(declaredMethod, "getDeclaredMethod(...)");
        this.f39975b = declaredMethod;
        this.f39976c = cls.getMethod("setHostname", String.class);
        this.f39977d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f39978e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p001o.dyf
    /* renamed from: a */
    public boolean mo16886a() {
        return ef0.f21513e.m24890b();
    }

    @Override // p001o.dyf
    /* renamed from: b */
    public boolean mo16887b(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        return this.f39974a.isInstance(sSLSocket);
    }

    @Override // p001o.dyf
    /* renamed from: c */
    public String mo16888c(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "sslSocket");
        if (!mo16887b(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f39977d.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, sh2.f45422b);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && sq8.m48644c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // p001o.dyf
    /* renamed from: d */
    public void mo16889d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        if (mo16887b(sSLSocket)) {
            try {
                this.f39975b.invoke(sSLSocket, Boolean.TRUE);
                this.f39978e.invoke(sSLSocket, e9d.f21191a.m24578c(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}

package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
public final class l69 extends e9d {

    /* renamed from: i */
    public static final C15005b f33301i = new C15005b(null);

    /* renamed from: d */
    public final Method f33302d;

    /* renamed from: e */
    public final Method f33303e;

    /* renamed from: f */
    public final Method f33304f;

    /* renamed from: g */
    public final Class f33305g;

    /* renamed from: h */
    public final Class f33306h;

    /* renamed from: o.l69$a */
    public static final class C15004a implements InvocationHandler {

        /* renamed from: a */
        public final List f33307a;

        /* renamed from: b */
        public boolean f33308b;

        /* renamed from: c */
        public String f33309c;

        public C15004a(List list) {
            sq8.m48649h(list, "protocols");
            this.f33307a = list;
        }

        /* renamed from: a */
        public final String m36617a() {
            return this.f33309c;
        }

        /* renamed from: b */
        public final boolean m36618b() {
            return this.f33308b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            sq8.m48649h(obj, "proxy");
            sq8.m48649h(method, FirebaseAnalytics.Param.METHOD);
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (sq8.m48644c(name, "supports") && sq8.m48644c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (sq8.m48644c(name, "unsupported") && sq8.m48644c(Void.TYPE, returnType)) {
                this.f33308b = true;
                return null;
            }
            if (sq8.m48644c(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f33307a;
                }
            }
            if ((sq8.m48644c(name, "selectProtocol") || sq8.m48644c(name, "select")) && sq8.m48644c(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    sq8.m48647f(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            sq8.m48647f(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.f33307a.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f33309c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) this.f33307a.get(0);
                    this.f33309c = str2;
                    return str2;
                }
            }
            if ((!sq8.m48644c(name, "protocolSelected") && !sq8.m48644c(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            sq8.m48647f(obj4, "null cannot be cast to non-null type kotlin.String");
            this.f33309c = (String) obj4;
            return null;
        }
    }

    /* renamed from: o.l69$b */
    public static final class C15005b {
        public C15005b() {
        }

        public /* synthetic */ C15005b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final e9d m36619a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                sq8.m48646e(property);
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                sq8.m48646e(method);
                sq8.m48646e(method2);
                sq8.m48646e(method3);
                sq8.m48646e(cls3);
                sq8.m48646e(cls4);
                return new l69(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public l69(Method method, Method method2, Method method3, Class cls, Class cls2) {
        sq8.m48649h(method, "putMethod");
        sq8.m48649h(method2, "getMethod");
        sq8.m48649h(method3, "removeMethod");
        sq8.m48649h(cls, "clientProviderClass");
        sq8.m48649h(cls2, "serverProviderClass");
        this.f33302d = method;
        this.f33303e = method2;
        this.f33304f = method3;
        this.f33305g = cls;
        this.f33306h = cls2;
    }

    @Override // p001o.e9d
    /* renamed from: b */
    public void mo24567b(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(sSLSocket, "sslSocket");
        try {
            this.f33304f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // p001o.e9d
    /* renamed from: e */
    public void mo19310e(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        try {
            this.f33302d.invoke(null, sSLSocket, Proxy.newProxyInstance(e9d.class.getClassLoader(), new Class[]{this.f33305g, this.f33306h}, new C15004a(e9d.f21191a.m24577b(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // p001o.e9d
    /* renamed from: g */
    public String mo19311g(SSLSocket sSLSocket) throws IllegalArgumentException {
        sq8.m48649h(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f33303e.invoke(null, sSLSocket));
            sq8.m48647f(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            C15004a c15004a = (C15004a) invocationHandler;
            if (!c15004a.m36618b() && c15004a.m36617a() == null) {
                e9d.m24566k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (c15004a.m36618b()) {
                return null;
            }
            return c15004a.m36617a();
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}

package p001o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes6.dex */
public final class j3g extends pf0 {

    /* renamed from: j */
    public static final C14445a f29725j = new C14445a(null);

    /* renamed from: h */
    public final Class f29726h;

    /* renamed from: i */
    public final Class f29727i;

    /* renamed from: o.j3g$a */
    public static final class C14445a {
        public C14445a() {
        }

        public /* synthetic */ C14445a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ dyf m33177b(C14445a c14445a, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return c14445a.m33178a(str);
        }

        /* renamed from: a */
        public final dyf m33178a(String str) throws ClassNotFoundException {
            sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                sq8.m48647f(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                sq8.m48647f(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                sq8.m48646e(cls3);
                return new j3g(cls, cls2, cls3);
            } catch (Exception e) {
                ve0 ve0Var = ve0.f50224a;
                String name = hac.class.getName();
                sq8.m48648g(name, "getName(...)");
                ve0Var.m52648a(name, 5, "unable to load android socket classes", e);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3g(Class cls, Class cls2, Class cls3) {
        super(cls);
        sq8.m48649h(cls, "sslSocketClass");
        sq8.m48649h(cls2, "sslSocketFactoryClass");
        sq8.m48649h(cls3, "paramClass");
        this.f29726h = cls2;
        this.f29727i = cls3;
    }
}

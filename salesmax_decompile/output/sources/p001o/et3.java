package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
public final class et3 {

    /* renamed from: e */
    public static final C13258b f22131e = new C13258b(null);

    /* renamed from: f */
    public static final List f22132f;

    /* renamed from: g */
    public static final List f22133g;

    /* renamed from: h */
    public static final et3 f22134h;

    /* renamed from: i */
    public static final et3 f22135i;

    /* renamed from: j */
    public static final et3 f22136j;

    /* renamed from: k */
    public static final et3 f22137k;

    /* renamed from: a */
    public final boolean f22138a;

    /* renamed from: b */
    public final boolean f22139b;

    /* renamed from: c */
    public final String[] f22140c;

    /* renamed from: d */
    public final String[] f22141d;

    /* renamed from: o.et3$b */
    public static final class C13258b {
        public C13258b() {
        }

        public /* synthetic */ C13258b(id5 id5Var) {
            this();
        }
    }

    static {
        r93 r93Var = r93.o1;
        r93 r93Var2 = r93.p1;
        r93 r93Var3 = r93.q1;
        r93 r93Var4 = r93.a1;
        r93 r93Var5 = r93.e1;
        r93 r93Var6 = r93.b1;
        r93 r93Var7 = r93.f1;
        r93 r93Var8 = r93.l1;
        r93 r93Var9 = r93.k1;
        List listM21249n = ch3.m21249n(r93Var, r93Var2, r93Var3, r93Var4, r93Var5, r93Var6, r93Var7, r93Var8, r93Var9);
        f22132f = listM21249n;
        List listM21249n2 = ch3.m21249n(r93Var, r93Var2, r93Var3, r93Var4, r93Var5, r93Var6, r93Var7, r93Var8, r93Var9, r93.L0, r93.M0, r93.j0, r93.k0, r93.f43182H, r93.f43186L, r93.f43211l);
        f22133g = listM21249n2;
        C13257a c13257a = new C13257a(true);
        r93[] r93VarArr = (r93[]) listM21249n.toArray(new r93[0]);
        C13257a c13257aM25567c = c13257a.m25567c((r93[]) Arrays.copyOf(r93VarArr, r93VarArr.length));
        dnh dnhVar = dnh.TLS_1_3;
        dnh dnhVar2 = dnh.TLS_1_2;
        f22134h = c13257aM25567c.m25570f(dnhVar, dnhVar2).m25568d(true).m25565a();
        C13257a c13257a2 = new C13257a(true);
        r93[] r93VarArr2 = (r93[]) listM21249n2.toArray(new r93[0]);
        f22135i = c13257a2.m25567c((r93[]) Arrays.copyOf(r93VarArr2, r93VarArr2.length)).m25570f(dnhVar, dnhVar2).m25568d(true).m25565a();
        C13257a c13257a3 = new C13257a(true);
        r93[] r93VarArr3 = (r93[]) listM21249n2.toArray(new r93[0]);
        f22136j = c13257a3.m25567c((r93[]) Arrays.copyOf(r93VarArr3, r93VarArr3.length)).m25570f(dnhVar, dnhVar2, dnh.TLS_1_1, dnh.TLS_1_0).m25568d(true).m25565a();
        f22137k = new C13257a(false).m25565a();
    }

    public et3(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f22138a = z;
        this.f22139b = z2;
        this.f22140c = strArr;
        this.f22141d = strArr2;
    }

    /* renamed from: b */
    public final void m25557b(SSLSocket sSLSocket, boolean z) {
        sq8.m48649h(sSLSocket, "sslSocket");
        et3 et3VarM25562g = m25562g(sSLSocket, z);
        if (et3VarM25562g.m25564i() != null) {
            sSLSocket.setEnabledProtocols(et3VarM25562g.f22141d);
        }
        if (et3VarM25562g.m25558c() != null) {
            sSLSocket.setEnabledCipherSuites(et3VarM25562g.f22140c);
        }
    }

    /* renamed from: c */
    public final List m25558c() {
        String[] strArr = this.f22140c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(r93.f43201b.m46372b(str));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String[] m25559d() {
        return this.f22140c;
    }

    /* renamed from: e */
    public final boolean m25560e(SSLSocket sSLSocket) {
        sq8.m48649h(sSLSocket, "socket");
        if (!this.f22138a) {
            return false;
        }
        String[] strArr = this.f22141d;
        if (strArr != null && !ggj.m28635o(strArr, sSLSocket.getEnabledProtocols(), uk3.m51677g())) {
            return false;
        }
        String[] strArr2 = this.f22140c;
        return strArr2 == null || ggj.m28635o(strArr2, sSLSocket.getEnabledCipherSuites(), r93.f43201b.m46373c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof et3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f22138a;
        et3 et3Var = (et3) obj;
        if (z != et3Var.f22138a) {
            return false;
        }
        return !z || (Arrays.equals(this.f22140c, et3Var.f22140c) && Arrays.equals(this.f22141d, et3Var.f22141d) && this.f22139b == et3Var.f22139b);
    }

    /* renamed from: f */
    public final boolean m25561f() {
        return this.f22138a;
    }

    /* renamed from: g */
    public final et3 m25562g(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        sq8.m48646e(enabledCipherSuites);
        String[] strArrM59636c = zn8.m59636c(this, enabledCipherSuites);
        if (this.f22141d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            sq8.m48648g(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = ggj.m28644x(enabledProtocols2, this.f22141d, uk3.m51677g());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        sq8.m48646e(supportedCipherSuites);
        int iM28636p = ggj.m28636p(supportedCipherSuites, "TLS_FALLBACK_SCSV", r93.f43201b.m46373c());
        if (z && iM28636p != -1) {
            String str = supportedCipherSuites[iM28636p];
            sq8.m48648g(str, "get(...)");
            strArrM59636c = ggj.m28627g(strArrM59636c, str);
        }
        C13257a c13257aM25566b = new C13257a(this).m25566b((String[]) Arrays.copyOf(strArrM59636c, strArrM59636c.length));
        sq8.m48646e(enabledProtocols);
        return c13257aM25566b.m25569e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).m25565a();
    }

    /* renamed from: h */
    public final boolean m25563h() {
        return this.f22139b;
    }

    public int hashCode() {
        if (!this.f22138a) {
            return 17;
        }
        String[] strArr = this.f22140c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f22141d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f22139b ? 1 : 0);
    }

    /* renamed from: i */
    public final List m25564i() {
        String[] strArr = this.f22141d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(dnh.Companion.m23634a(str));
        }
        return arrayList;
    }

    public String toString() {
        if (!this.f22138a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m25558c(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m25564i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f22139b + ')';
    }

    /* renamed from: o.et3$a */
    public static final class C13257a {

        /* renamed from: a */
        public boolean f22142a;

        /* renamed from: b */
        public String[] f22143b;

        /* renamed from: c */
        public String[] f22144c;

        /* renamed from: d */
        public boolean f22145d;

        public C13257a(boolean z) {
            this.f22142a = z;
        }

        /* renamed from: a */
        public final et3 m25565a() {
            return new et3(this.f22142a, this.f22145d, this.f22143b, this.f22144c);
        }

        /* renamed from: b */
        public final C13257a m25566b(String... strArr) {
            sq8.m48649h(strArr, "cipherSuites");
            if (!this.f22142a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            sq8.m48648g(objArrCopyOf, "copyOf(...)");
            this.f22143b = (String[]) objArrCopyOf;
            return this;
        }

        /* renamed from: c */
        public final C13257a m25567c(r93... r93VarArr) {
            sq8.m48649h(r93VarArr, "cipherSuites");
            if (!this.f22142a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(r93VarArr.length);
            for (r93 r93Var : r93VarArr) {
                arrayList.add(r93Var.m46369c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m25566b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: d */
        public final C13257a m25568d(boolean z) {
            if (!this.f22142a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f22145d = z;
            return this;
        }

        /* renamed from: e */
        public final C13257a m25569e(String... strArr) {
            sq8.m48649h(strArr, "tlsVersions");
            if (!this.f22142a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            sq8.m48648g(objArrCopyOf, "copyOf(...)");
            this.f22144c = (String[]) objArrCopyOf;
            return this;
        }

        /* renamed from: f */
        public final C13257a m25570f(dnh... dnhVarArr) {
            sq8.m48649h(dnhVarArr, "tlsVersions");
            if (!this.f22142a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(dnhVarArr.length);
            for (dnh dnhVar : dnhVarArr) {
                arrayList.add(dnhVar.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m25569e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public C13257a(et3 et3Var) {
            sq8.m48649h(et3Var, "connectionSpec");
            this.f22142a = et3Var.m25561f();
            this.f22143b = et3Var.m25559d();
            this.f22144c = et3Var.f22141d;
            this.f22145d = et3Var.m25563h();
        }
    }
}

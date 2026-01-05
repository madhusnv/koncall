package p001o;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import j$.time.Duration;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p001o.bt1;
import p001o.dk6;
import p001o.e9d;
import p001o.of2;

/* loaded from: classes6.dex */
public class hac implements bt1.InterfaceC12488a {

    /* renamed from: G */
    public static final C13903b f26495G = new C13903b(null);

    /* renamed from: H */
    public static final List f26496H = jgj.m33817k(a2e.HTTP_2, a2e.HTTP_1_1);

    /* renamed from: I */
    public static final List f26497I = jgj.m33817k(et3.f22135i, et3.f22137k);

    /* renamed from: A */
    public final int f26498A;

    /* renamed from: B */
    public final int f26499B;

    /* renamed from: C */
    public final long f26500C;

    /* renamed from: D */
    public final dve f26501D;

    /* renamed from: E */
    public final uog f26502E;

    /* renamed from: F */
    public final ct3 f26503F;

    /* renamed from: a */
    public final du5 f26504a;

    /* renamed from: b */
    public final List f26505b;

    /* renamed from: c */
    public final List f26506c;

    /* renamed from: d */
    public final dk6.InterfaceC12980c f26507d;

    /* renamed from: e */
    public final boolean f26508e;

    /* renamed from: f */
    public final boolean f26509f;

    /* renamed from: g */
    public final t01 f26510g;

    /* renamed from: h */
    public final boolean f26511h;

    /* renamed from: i */
    public final boolean f26512i;

    /* renamed from: j */
    public final f74 f26513j;

    /* renamed from: k */
    public final ov5 f26514k;

    /* renamed from: l */
    public final Proxy f26515l;

    /* renamed from: m */
    public final ProxySelector f26516m;

    /* renamed from: n */
    public final t01 f26517n;

    /* renamed from: o */
    public final SocketFactory f26518o;

    /* renamed from: p */
    public final SSLSocketFactory f26519p;

    /* renamed from: q */
    public final X509TrustManager f26520q;

    /* renamed from: r */
    public final List f26521r;

    /* renamed from: s */
    public final List f26522s;

    /* renamed from: t */
    public final HostnameVerifier f26523t;

    /* renamed from: u */
    public final pf2 f26524u;

    /* renamed from: v */
    public final of2 f26525v;

    /* renamed from: w */
    public final int f26526w;

    /* renamed from: x */
    public final int f26527x;

    /* renamed from: y */
    public final int f26528y;

    /* renamed from: z */
    public final int f26529z;

    /* renamed from: o.hac$b */
    public static final class C13903b {
        public C13903b() {
        }

        public /* synthetic */ C13903b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final List m30140a() {
            return hac.f26497I;
        }

        /* renamed from: b */
        public final List m30141b() {
            return hac.f26496H;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hac(C13902a c13902a) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorM30098K;
        List list;
        sq8.m48649h(c13902a, "builder");
        this.f26504a = c13902a.m30136w();
        this.f26505b = jgj.m33829w(c13902a.m30091D());
        this.f26506c = jgj.m33829w(c13902a.m30093F());
        this.f26507d = c13902a.m30138y();
        boolean zM30100M = c13902a.m30100M();
        this.f26508e = zM30100M;
        boolean zM30139z = c13902a.m30139z();
        this.f26509f = zM30139z;
        this.f26510g = c13902a.m30127n();
        this.f26511h = c13902a.m30088A();
        this.f26512i = c13902a.m30089B();
        this.f26513j = c13902a.m30135v();
        c13902a.m30128o();
        this.f26514k = c13902a.m30137x();
        this.f26515l = c13902a.m30096I();
        if (c13902a.m30096I() != null) {
            proxySelectorM30098K = x4c.f53186a;
        } else {
            proxySelectorM30098K = c13902a.m30098K();
            proxySelectorM30098K = proxySelectorM30098K == null ? ProxySelector.getDefault() : proxySelectorM30098K;
            if (proxySelectorM30098K == null) {
                proxySelectorM30098K = x4c.f53186a;
            }
        }
        this.f26516m = proxySelectorM30098K;
        this.f26517n = c13902a.m30097J();
        this.f26518o = c13902a.m30102O();
        List listM30134u = c13902a.m30134u();
        this.f26521r = listM30134u;
        this.f26522s = c13902a.m30095H();
        this.f26523t = c13902a.m30090C();
        this.f26526w = c13902a.m30129p();
        int iM30132s = c13902a.m30132s();
        this.f26527x = iM30132s;
        int iM30099L = c13902a.m30099L();
        this.f26528y = iM30099L;
        int iM30106S = c13902a.m30106S();
        this.f26529z = iM30106S;
        int iM30094G = c13902a.m30094G();
        this.f26498A = iM30094G;
        this.f26499B = c13902a.m30105R();
        this.f26500C = c13902a.m30092E();
        dve dveVarM30101N = c13902a.m30101N();
        dve dveVar = dveVarM30101N == null ? new dve() : dveVarM30101N;
        this.f26501D = dveVar;
        uog uogVarM30104Q = c13902a.m30104Q();
        this.f26502E = uogVarM30104Q == null ? uog.f49285m : uogVarM30104Q;
        ct3 ct3VarM30133t = c13902a.m30133t();
        if (ct3VarM30133t == null) {
            list = listM30134u;
            ct3 ct3Var = new ct3(0, 0L, null, null, 0 == true ? 1 : 0, iM30099L, iM30106S, iM30132s, iM30099L, iM30094G, zM30100M, zM30139z, dveVar, 31, null);
            c13902a.a0(ct3Var);
            ct3VarM30133t = ct3Var;
        } else {
            list = listM30134u;
        }
        this.f26503F = ct3VarM30133t;
        List list2 = list;
        boolean z = true;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((et3) it.next()).m25561f()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            this.f26519p = null;
            this.f26525v = null;
            this.f26520q = null;
            this.f26524u = pf2.f39984d;
        } else if (c13902a.m30103P() != null) {
            this.f26519p = c13902a.m30103P();
            of2 of2VarM30130q = c13902a.m30130q();
            sq8.m48646e(of2VarM30130q);
            this.f26525v = of2VarM30130q;
            X509TrustManager x509TrustManagerM30107T = c13902a.m30107T();
            sq8.m48646e(x509TrustManagerM30107T);
            this.f26520q = x509TrustManagerM30107T;
            pf2 pf2VarM30131r = c13902a.m30131r();
            sq8.m48646e(of2VarM30130q);
            this.f26524u = pf2VarM30131r.m43555e(of2VarM30130q);
        } else {
            e9d.C13131a c13131a = e9d.f21191a;
            X509TrustManager x509TrustManagerMo19313o = c13131a.m24582g().mo19313o();
            this.f26520q = x509TrustManagerMo19313o;
            e9d e9dVarM24582g = c13131a.m24582g();
            sq8.m48646e(x509TrustManagerMo19313o);
            this.f26519p = e9dVarM24582g.mo24575n(x509TrustManagerMo19313o);
            of2.C15789a c15789a = of2.f38270a;
            sq8.m48646e(x509TrustManagerMo19313o);
            of2 of2VarM42165a = c15789a.m42165a(x509TrustManagerMo19313o);
            this.f26525v = of2VarM42165a;
            pf2 pf2VarM30131r2 = c13902a.m30131r();
            sq8.m48646e(of2VarM42165a);
            this.f26524u = pf2VarM30131r2.m43555e(of2VarM42165a);
        }
        m30062L();
    }

    /* renamed from: A */
    public C13902a m30051A() {
        return new C13902a(this);
    }

    /* renamed from: B */
    public b6j m30052B(ule uleVar, d6j d6jVar) {
        sq8.m48649h(uleVar, "request");
        sq8.m48649h(d6jVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        dee deeVar = new dee(this.f26502E, uleVar, d6jVar, new Random(), this.f26498A, null, this.f26500C, this.f26499B);
        deeVar.m22925o(this);
        return deeVar;
    }

    /* renamed from: C */
    public final int m30053C() {
        return this.f26498A;
    }

    /* renamed from: D */
    public final List m30054D() {
        return this.f26522s;
    }

    /* renamed from: E */
    public final Proxy m30055E() {
        return this.f26515l;
    }

    /* renamed from: F */
    public final t01 m30056F() {
        return this.f26517n;
    }

    /* renamed from: G */
    public final ProxySelector m30057G() {
        return this.f26516m;
    }

    /* renamed from: H */
    public final int m30058H() {
        return this.f26528y;
    }

    /* renamed from: I */
    public final boolean m30059I() {
        return this.f26508e;
    }

    /* renamed from: J */
    public final SocketFactory m30060J() {
        return this.f26518o;
    }

    /* renamed from: K */
    public final SSLSocketFactory m30061K() {
        SSLSocketFactory sSLSocketFactory = this.f26519p;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: L */
    public final void m30062L() {
        boolean z;
        sq8.m48647f(this.f26505b, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.f26505b).toString());
        }
        sq8.m48647f(this.f26506c, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.f26506c).toString());
        }
        List list = this.f26521r;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((et3) it.next()).m25561f()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        if (!z) {
            if (this.f26519p == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f26525v == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f26520q == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f26519p == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f26525v == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f26520q == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!sq8.m48644c(this.f26524u, pf2.f39984d)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: M */
    public final int m30063M() {
        return this.f26499B;
    }

    /* renamed from: N */
    public final int m30064N() {
        return this.f26529z;
    }

    /* renamed from: O */
    public final X509TrustManager m30065O() {
        return this.f26520q;
    }

    @Override // p001o.bt1.InterfaceC12488a
    /* renamed from: a */
    public bt1 mo19702a(ule uleVar) {
        sq8.m48649h(uleVar, "request");
        return new yce(this, uleVar, false);
    }

    /* renamed from: e */
    public final d60 m30066e(w48 w48Var) {
        SSLSocketFactory sSLSocketFactoryM30061K;
        HostnameVerifier hostnameVerifier;
        pf2 pf2Var;
        sq8.m48649h(w48Var, ImagesContract.URL);
        if (w48Var.m53878i()) {
            sSLSocketFactoryM30061K = m30061K();
            hostnameVerifier = this.f26523t;
            pf2Var = this.f26524u;
        } else {
            sSLSocketFactoryM30061K = null;
            hostnameVerifier = null;
            pf2Var = null;
        }
        return new d60(w48Var.m53877h(), w48Var.m53882n(), this.f26514k, this.f26518o, sSLSocketFactoryM30061K, hostnameVerifier, pf2Var, this.f26517n, this.f26515l, this.f26522s, this.f26521r, this.f26516m);
    }

    /* renamed from: f */
    public final t01 m30067f() {
        return this.f26510g;
    }

    /* renamed from: g */
    public final sr1 m30068g() {
        return null;
    }

    /* renamed from: h */
    public final int m30069h() {
        return this.f26526w;
    }

    /* renamed from: i */
    public final of2 m30070i() {
        return this.f26525v;
    }

    /* renamed from: j */
    public final pf2 m30071j() {
        return this.f26524u;
    }

    /* renamed from: k */
    public final int m30072k() {
        return this.f26527x;
    }

    /* renamed from: l */
    public final ct3 m30073l() {
        return this.f26503F;
    }

    /* renamed from: m */
    public final List m30074m() {
        return this.f26521r;
    }

    /* renamed from: n */
    public final f74 m30075n() {
        return this.f26513j;
    }

    /* renamed from: o */
    public final du5 m30076o() {
        return this.f26504a;
    }

    /* renamed from: p */
    public final ov5 m30077p() {
        return this.f26514k;
    }

    /* renamed from: q */
    public final dk6.InterfaceC12980c m30078q() {
        return this.f26507d;
    }

    /* renamed from: r */
    public final boolean m30079r() {
        return this.f26509f;
    }

    /* renamed from: s */
    public final boolean m30080s() {
        return this.f26511h;
    }

    /* renamed from: t */
    public final boolean m30081t() {
        return this.f26512i;
    }

    /* renamed from: u */
    public final dve m30082u() {
        return this.f26501D;
    }

    /* renamed from: v */
    public final uog m30083v() {
        return this.f26502E;
    }

    /* renamed from: w */
    public final HostnameVerifier m30084w() {
        return this.f26523t;
    }

    /* renamed from: x */
    public final List m30085x() {
        return this.f26505b;
    }

    /* renamed from: y */
    public final long m30086y() {
        return this.f26500C;
    }

    /* renamed from: z */
    public final List m30087z() {
        return this.f26506c;
    }

    /* renamed from: o.hac$a */
    public static final class C13902a {

        /* renamed from: A */
        public int f26530A;

        /* renamed from: B */
        public int f26531B;

        /* renamed from: C */
        public int f26532C;

        /* renamed from: D */
        public long f26533D;

        /* renamed from: E */
        public dve f26534E;

        /* renamed from: F */
        public uog f26535F;

        /* renamed from: a */
        public du5 f26536a;

        /* renamed from: b */
        public ct3 f26537b;

        /* renamed from: c */
        public final List f26538c;

        /* renamed from: d */
        public final List f26539d;

        /* renamed from: e */
        public dk6.InterfaceC12980c f26540e;

        /* renamed from: f */
        public boolean f26541f;

        /* renamed from: g */
        public boolean f26542g;

        /* renamed from: h */
        public t01 f26543h;

        /* renamed from: i */
        public boolean f26544i;

        /* renamed from: j */
        public boolean f26545j;

        /* renamed from: k */
        public f74 f26546k;

        /* renamed from: l */
        public ov5 f26547l;

        /* renamed from: m */
        public Proxy f26548m;

        /* renamed from: n */
        public ProxySelector f26549n;

        /* renamed from: o */
        public t01 f26550o;

        /* renamed from: p */
        public SocketFactory f26551p;

        /* renamed from: q */
        public SSLSocketFactory f26552q;

        /* renamed from: r */
        public X509TrustManager f26553r;

        /* renamed from: s */
        public List f26554s;

        /* renamed from: t */
        public List f26555t;

        /* renamed from: u */
        public HostnameVerifier f26556u;

        /* renamed from: v */
        public pf2 f26557v;

        /* renamed from: w */
        public of2 f26558w;

        /* renamed from: x */
        public int f26559x;

        /* renamed from: y */
        public int f26560y;

        /* renamed from: z */
        public int f26561z;

        public C13902a() {
            this.f26536a = new du5();
            this.f26538c = new ArrayList();
            this.f26539d = new ArrayList();
            this.f26540e = jgj.m33809c(dk6.NONE);
            this.f26541f = true;
            this.f26542g = true;
            t01 t01Var = t01.f46178b;
            this.f26543h = t01Var;
            this.f26544i = true;
            this.f26545j = true;
            this.f26546k = f74.f22851b;
            this.f26547l = ov5.f38963b;
            this.f26550o = t01Var;
            SocketFactory socketFactory = SocketFactory.getDefault();
            sq8.m48648g(socketFactory, "getDefault(...)");
            this.f26551p = socketFactory;
            C13903b c13903b = hac.f26495G;
            this.f26554s = c13903b.m30140a();
            this.f26555t = c13903b.m30141b();
            this.f26556u = eac.f21258a;
            this.f26557v = pf2.f39984d;
            this.f26560y = TransferRecord.MAXIMUM_UPLOAD_PARTS;
            this.f26561z = TransferRecord.MAXIMUM_UPLOAD_PARTS;
            this.f26530A = TransferRecord.MAXIMUM_UPLOAD_PARTS;
            this.f26532C = 60000;
            this.f26533D = MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
        }

        /* renamed from: A */
        public final boolean m30088A() {
            return this.f26544i;
        }

        /* renamed from: B */
        public final boolean m30089B() {
            return this.f26545j;
        }

        /* renamed from: C */
        public final HostnameVerifier m30090C() {
            return this.f26556u;
        }

        /* renamed from: D */
        public final List m30091D() {
            return this.f26538c;
        }

        /* renamed from: E */
        public final long m30092E() {
            return this.f26533D;
        }

        /* renamed from: F */
        public final List m30093F() {
            return this.f26539d;
        }

        /* renamed from: G */
        public final int m30094G() {
            return this.f26531B;
        }

        /* renamed from: H */
        public final List m30095H() {
            return this.f26555t;
        }

        /* renamed from: I */
        public final Proxy m30096I() {
            return this.f26548m;
        }

        /* renamed from: J */
        public final t01 m30097J() {
            return this.f26550o;
        }

        /* renamed from: K */
        public final ProxySelector m30098K() {
            return this.f26549n;
        }

        /* renamed from: L */
        public final int m30099L() {
            return this.f26561z;
        }

        /* renamed from: M */
        public final boolean m30100M() {
            return this.f26541f;
        }

        /* renamed from: N */
        public final dve m30101N() {
            return this.f26534E;
        }

        /* renamed from: O */
        public final SocketFactory m30102O() {
            return this.f26551p;
        }

        /* renamed from: P */
        public final SSLSocketFactory m30103P() {
            return this.f26552q;
        }

        /* renamed from: Q */
        public final uog m30104Q() {
            return this.f26535F;
        }

        /* renamed from: R */
        public final int m30105R() {
            return this.f26532C;
        }

        /* renamed from: S */
        public final int m30106S() {
            return this.f26530A;
        }

        /* renamed from: T */
        public final X509TrustManager m30107T() {
            return this.f26553r;
        }

        /* renamed from: U */
        public final C13902a m30108U(List list) {
            sq8.m48649h(list, "protocols");
            List listT0 = kh3.T0(list);
            a2e a2eVar = a2e.H2_PRIOR_KNOWLEDGE;
            if (!(listT0.contains(a2eVar) || listT0.contains(a2e.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listT0).toString());
            }
            if (!(!listT0.contains(a2eVar) || listT0.size() <= 1)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listT0).toString());
            }
            if (!(!listT0.contains(a2e.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listT0).toString());
            }
            sq8.m48647f(listT0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (!(!listT0.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            listT0.remove(a2e.SPDY_3);
            if (!sq8.m48644c(listT0, this.f26555t)) {
                this.f26534E = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(listT0);
            sq8.m48648g(listUnmodifiableList, "unmodifiableList(...)");
            this.f26555t = listUnmodifiableList;
            return this;
        }

        /* renamed from: V */
        public final C13902a m30109V(t01 t01Var) {
            sq8.m48649h(t01Var, "proxyAuthenticator");
            if (!sq8.m48644c(t01Var, this.f26550o)) {
                this.f26534E = null;
            }
            this.f26550o = t01Var;
            return this;
        }

        /* renamed from: W */
        public final C13902a m30110W(ProxySelector proxySelector) {
            sq8.m48649h(proxySelector, "proxySelector");
            if (!sq8.m48644c(proxySelector, this.f26549n)) {
                this.f26534E = null;
            }
            this.f26549n = proxySelector;
            return this;
        }

        /* renamed from: X */
        public final C13902a m30111X(long j, TimeUnit timeUnit) {
            sq8.m48649h(timeUnit, "unit");
            this.f26561z = jgj.m33812f("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: Y */
        public final C13902a m30112Y(Duration duration) {
            sq8.m48649h(duration, "duration");
            m30111X(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: Z */
        public final C13902a m30113Z(boolean z) {
            this.f26541f = z;
            return this;
        }

        /* renamed from: a */
        public final C13902a m30114a(tn8 tn8Var) {
            sq8.m48649h(tn8Var, "interceptor");
            this.f26538c.add(tn8Var);
            return this;
        }

        public final void a0(ct3 ct3Var) {
            this.f26537b = ct3Var;
        }

        /* renamed from: b */
        public final C13902a m30115b(tn8 tn8Var) {
            sq8.m48649h(tn8Var, "interceptor");
            this.f26539d.add(tn8Var);
            return this;
        }

        public final C13902a b0(long j, TimeUnit timeUnit) {
            sq8.m48649h(timeUnit, "unit");
            this.f26530A = jgj.m33812f("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public final hac m30116c() {
            return new hac(this);
        }

        public final C13902a c0(Duration duration) {
            sq8.m48649h(duration, "duration");
            b0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: d */
        public final C13902a m30117d(long j, TimeUnit timeUnit) {
            sq8.m48649h(timeUnit, "unit");
            this.f26560y = jgj.m33812f("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: e */
        public final C13902a m30118e(Duration duration) {
            sq8.m48649h(duration, "duration");
            m30117d(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: f */
        public final C13902a m30119f(ct3 ct3Var) {
            sq8.m48649h(ct3Var, "connectionPool");
            this.f26537b = ct3Var;
            return this;
        }

        /* renamed from: g */
        public final C13902a m30120g(List list) {
            sq8.m48649h(list, "connectionSpecs");
            if (!sq8.m48644c(list, this.f26554s)) {
                this.f26534E = null;
            }
            this.f26554s = jgj.m33829w(list);
            return this;
        }

        /* renamed from: h */
        public final C13902a m30121h(du5 du5Var) {
            sq8.m48649h(du5Var, "dispatcher");
            this.f26536a = du5Var;
            return this;
        }

        /* renamed from: i */
        public final C13902a m30122i(ov5 ov5Var) {
            sq8.m48649h(ov5Var, "dns");
            if (!sq8.m48644c(ov5Var, this.f26547l)) {
                this.f26534E = null;
            }
            this.f26547l = ov5Var;
            return this;
        }

        /* renamed from: j */
        public final C13902a m30123j(dk6 dk6Var) {
            sq8.m48649h(dk6Var, "eventListener");
            this.f26540e = jgj.m33809c(dk6Var);
            return this;
        }

        /* renamed from: k */
        public final C13902a m30124k(dk6.InterfaceC12980c interfaceC12980c) {
            sq8.m48649h(interfaceC12980c, "eventListenerFactory");
            this.f26540e = interfaceC12980c;
            return this;
        }

        /* renamed from: l */
        public final C13902a m30125l(boolean z) {
            this.f26544i = z;
            return this;
        }

        /* renamed from: m */
        public final C13902a m30126m(boolean z) {
            this.f26545j = z;
            return this;
        }

        /* renamed from: n */
        public final t01 m30127n() {
            return this.f26543h;
        }

        /* renamed from: o */
        public final sr1 m30128o() {
            return null;
        }

        /* renamed from: p */
        public final int m30129p() {
            return this.f26559x;
        }

        /* renamed from: q */
        public final of2 m30130q() {
            return this.f26558w;
        }

        /* renamed from: r */
        public final pf2 m30131r() {
            return this.f26557v;
        }

        /* renamed from: s */
        public final int m30132s() {
            return this.f26560y;
        }

        /* renamed from: t */
        public final ct3 m30133t() {
            return this.f26537b;
        }

        /* renamed from: u */
        public final List m30134u() {
            return this.f26554s;
        }

        /* renamed from: v */
        public final f74 m30135v() {
            return this.f26546k;
        }

        /* renamed from: w */
        public final du5 m30136w() {
            return this.f26536a;
        }

        /* renamed from: x */
        public final ov5 m30137x() {
            return this.f26547l;
        }

        /* renamed from: y */
        public final dk6.InterfaceC12980c m30138y() {
            return this.f26540e;
        }

        /* renamed from: z */
        public final boolean m30139z() {
            return this.f26542g;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C13902a(hac hacVar) {
            this();
            sq8.m48649h(hacVar, "okHttpClient");
            this.f26536a = hacVar.m30076o();
            this.f26537b = hacVar.m30073l();
            hh3.m30441A(this.f26538c, hacVar.m30085x());
            hh3.m30441A(this.f26539d, hacVar.m30087z());
            this.f26540e = hacVar.m30078q();
            this.f26541f = hacVar.m30059I();
            this.f26542g = hacVar.m30079r();
            this.f26543h = hacVar.m30067f();
            this.f26544i = hacVar.m30080s();
            this.f26545j = hacVar.m30081t();
            this.f26546k = hacVar.m30075n();
            hacVar.m30068g();
            this.f26547l = hacVar.m30077p();
            this.f26548m = hacVar.m30055E();
            this.f26549n = hacVar.m30057G();
            this.f26550o = hacVar.m30056F();
            this.f26551p = hacVar.m30060J();
            this.f26552q = hacVar.f26519p;
            this.f26553r = hacVar.m30065O();
            this.f26554s = hacVar.m30074m();
            this.f26555t = hacVar.m30054D();
            this.f26556u = hacVar.m30084w();
            this.f26557v = hacVar.m30071j();
            this.f26558w = hacVar.m30070i();
            this.f26559x = hacVar.m30069h();
            this.f26560y = hacVar.m30072k();
            this.f26561z = hacVar.m30058H();
            this.f26530A = hacVar.m30064N();
            this.f26531B = hacVar.m30053C();
            this.f26532C = hacVar.m30063M();
            this.f26533D = hacVar.m30086y();
            this.f26534E = hacVar.m30082u();
            this.f26535F = hacVar.m30083v();
        }
    }

    public hac() {
        this(new C13902a());
    }
}

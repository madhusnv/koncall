package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import org.apache.http.HttpVersion;
import p001o.fmh;
import p001o.hth;
import p001o.k16;
import p001o.qja;

/* loaded from: classes3.dex */
public final class w28 extends dk6 {

    /* renamed from: a */
    public final ct3 f51312a;

    /* renamed from: b */
    public final b18 f51313b;

    /* renamed from: c */
    public final du5 f51314c;

    /* renamed from: d */
    public final d28 f51315d;

    /* renamed from: e */
    public final vdh f51316e;

    /* renamed from: f */
    public final dth f51317f;

    /* renamed from: g */
    public final qja f51318g;

    /* renamed from: h */
    public ulh f51319h;

    /* renamed from: i */
    public boolean f51320i;

    /* renamed from: j */
    public long f51321j;

    /* renamed from: k */
    public boolean f51322k;

    /* renamed from: l */
    public ulh f51323l;

    /* renamed from: m */
    public ulh f51324m;

    /* renamed from: o.w28$a */
    public static final class C17742a implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "cache conditional hit";
        }
    }

    public static final class a0 implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "cache satisfaction failure";
        }
    }

    /* renamed from: o.w28$b */
    public static final class C17743b implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "cache hit";
        }
    }

    public static final class b0 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ ww7 f51325a;

        public b0(ww7 ww7Var) {
            this.f51325a = ww7Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "TLS connect end: handshake=" + this.f51325a;
        }
    }

    /* renamed from: o.w28$c */
    public static final class C17744c implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "cache miss";
        }
    }

    public static final class c0 implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "initiating TLS connection";
        }
    }

    /* renamed from: o.w28$d */
    public static final class C17745d implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "call complete";
        }
    }

    /* renamed from: o.w28$e */
    public static final class C17746e implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "call failed";
        }
    }

    /* renamed from: o.w28$f */
    public static final class C17747f implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "call started";
        }
    }

    /* renamed from: o.w28$g */
    public static final class C17748g implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "call cancelled";
        }
    }

    /* renamed from: o.w28$h */
    public static final class C17749h implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ InetSocketAddress f51326a;

        /* renamed from: b */
        public final /* synthetic */ Proxy f51327b;

        /* renamed from: c */
        public final /* synthetic */ a2e f51328c;

        public C17749h(InetSocketAddress inetSocketAddress, Proxy proxy, a2e a2eVar) {
            this.f51326a = inetSocketAddress;
            this.f51327b = proxy;
            this.f51328c = a2eVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "connection established: addr=" + this.f51326a + "; proxy=" + this.f51327b + "; protocol=" + this.f51328c;
        }
    }

    /* renamed from: o.w28$i */
    public static final class C17750i implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ InetSocketAddress f51329a;

        /* renamed from: b */
        public final /* synthetic */ Proxy f51330b;

        /* renamed from: c */
        public final /* synthetic */ a2e f51331c;

        public C17750i(InetSocketAddress inetSocketAddress, Proxy proxy, a2e a2eVar) {
            this.f51329a = inetSocketAddress;
            this.f51330b = proxy;
            this.f51331c = a2eVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "connect failed: addr=" + this.f51329a + "; proxy=" + this.f51330b + "; protocol=" + this.f51331c;
        }
    }

    /* renamed from: o.w28$j */
    public static final class C17751j implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ InetSocketAddress f51332a;

        /* renamed from: b */
        public final /* synthetic */ Proxy f51333b;

        public C17751j(InetSocketAddress inetSocketAddress, Proxy proxy) {
            this.f51332a = inetSocketAddress;
            this.f51333b = proxy;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "starting connection: addr=" + this.f51332a + "; proxy=" + this.f51333b;
        }
    }

    /* renamed from: o.w28$k */
    public static final class C17752k implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ int f51334a;

        /* renamed from: b */
        public final /* synthetic */ xr3 f51335b;

        /* renamed from: c */
        public final /* synthetic */ w28 f51336c;

        public C17752k(int i, xr3 xr3Var, w28 w28Var) {
            this.f51334a = i;
            this.f51335b = xr3Var;
            this.f51336c = w28Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "connection acquired: conn(id=" + this.f51334a + ")=" + this.f51335b + "; connPool: total=" + this.f51336c.f51312a.m21740a() + ", idle=" + this.f51336c.f51312a.m21743d();
        }
    }

    /* renamed from: o.w28$l */
    public static final class C17753l implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ int f51337a;

        /* renamed from: b */
        public final /* synthetic */ xr3 f51338b;

        /* renamed from: c */
        public final /* synthetic */ w28 f51339c;

        public C17753l(int i, xr3 xr3Var, w28 w28Var) {
            this.f51337a = i;
            this.f51338b = xr3Var;
            this.f51339c = w28Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "connection released: conn(id=" + this.f51337a + ")=" + this.f51338b + "; connPool: total=" + this.f51339c.f51312a.m21740a() + ", idle=" + this.f51339c.f51312a.m21743d();
        }
    }

    /* renamed from: o.w28$m */
    public static final class C17754m implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ String f51340a;

        /* renamed from: b */
        public final /* synthetic */ List f51341b;

        public C17754m(String str, List list) {
            this.f51340a = str;
            this.f51341b = list;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "dns resolved: domain=" + this.f51340a + "; records=" + this.f51341b;
        }
    }

    /* renamed from: o.w28$n */
    public static final class C17755n implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ String f51342a;

        public C17755n(String str) {
            this.f51342a = str;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "dns query: domain=" + this.f51342a;
        }
    }

    /* renamed from: o.w28$o */
    public static final class C17756o implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ w48 f51343a;

        /* renamed from: b */
        public final /* synthetic */ List f51344b;

        public C17756o(w48 w48Var, List list) {
            this.f51343a = w48Var;
            this.f51344b = list;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "proxy select end: url=" + this.f51343a + "; proxies=" + this.f51344b;
        }
    }

    /* renamed from: o.w28$p */
    public static final class C17757p implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ w48 f51345a;

        public C17757p(w48 w48Var) {
            this.f51345a = w48Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "proxy select start: url=" + this.f51345a;
        }
    }

    /* renamed from: o.w28$q */
    public static final class C17758q implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ long f51346a;

        public C17758q(long j) {
            this.f51346a = j;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "finished sending request body: bytesSent=" + this.f51346a;
        }
    }

    /* renamed from: o.w28$r */
    public static final class C17759r implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "sending request body";
        }
    }

    /* renamed from: o.w28$s */
    public static final class C17760s implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "request failed";
        }
    }

    /* renamed from: o.w28$t */
    public static final class C17761t implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "finished sending request headers";
        }
    }

    /* renamed from: o.w28$u */
    public static final class C17762u implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "sending request headers";
        }
    }

    /* renamed from: o.w28$v */
    public static final class C17763v implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ long f51347a;

        public C17763v(long j) {
            this.f51347a = j;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "response body finished: bytesConsumed=" + this.f51347a;
        }
    }

    /* renamed from: o.w28$w */
    public static final class C17764w implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "response body available";
        }
    }

    /* renamed from: o.w28$x */
    public static final class C17765x implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "response failed";
        }
    }

    /* renamed from: o.w28$y */
    public static final class C17766y implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ Long f51348a;

        public C17766y(Long l) {
            this.f51348a = l;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "response headers end: contentLengthHeader=" + this.f51348a;
        }
    }

    /* renamed from: o.w28$z */
    public static final class C17767z implements uk7 {
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "response headers start";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w28(ct3 ct3Var, b18 b18Var, du5 du5Var, d28 d28Var, bt1 bt1Var) {
        qja qjaVarMo33391a;
        q74 q74VarM18281a;
        q74 q74VarM18281a2;
        sq8.m48649h(ct3Var, "pool");
        sq8.m48649h(b18Var, "hr");
        sq8.m48649h(du5Var, "dispatcher");
        sq8.m48649h(d28Var, "metrics");
        sq8.m48649h(bt1Var, "call");
        this.f51312a = ct3Var;
        this.f51313b = b18Var;
        this.f51314c = du5Var;
        this.f51315d = d28Var;
        b8f b8fVar = (b8f) bt1Var.request().m51739j(b8f.class);
        vdh vdhVarM52646a = (b8fVar == null || (q74VarM18281a2 = b8fVar.m18281a()) == null || (vdhVarM52646a = xdh.m56098a(q74VarM18281a2)) == null) ? vdh.f50220a.m52646a() : vdhVarM52646a;
        this.f51316e = vdhVarM52646a;
        this.f51317f = hth.C14073b.m31128a(vdhVarM52646a.mo40628d().mo34509a("aws.smithy.kotlin.runtime.http.engine.okhttp"), HttpVersion.HTTP, null, null, null, 14, null);
        b8f b8fVar2 = (b8f) bt1Var.request().m51739j(b8f.class);
        if (b8fVar2 == null || (q74VarM18281a = b8fVar2.m18281a()) == null) {
            zja zjaVarM59519a = zja.f57293a.m59519a();
            String strMo26336c = kge.m35689b(kac.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("getLogger<T> cannot be used on an anonymous object".toString());
            }
            qjaVarMo33391a = zjaVarM59519a.mo33391a(strMo26336c);
        } else {
            String strMo26336c2 = kge.m35689b(kac.class).mo26336c();
            if (strMo26336c2 == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            qjaVarMo33391a = v74.m52400e(q74VarM18281a, strMo26336c2);
            if (qjaVarMo33391a == null) {
            }
        }
        this.f51318g = qjaVarMo33391a;
        k16.C14700a c14700a = k16.f31358b;
        this.f51321j = m16.m38175s(0, o16.SECONDS);
    }

    @Override // p001o.dk6
    public void cacheConditionalHit(bt1 bt1Var, zqe zqeVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(zqeVar, "cachedResponse");
        qja.C16414b.m45550c(this.f51318g, null, new C17742a(), 1, null);
    }

    @Override // p001o.dk6
    public void cacheHit(bt1 bt1Var, zqe zqeVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(zqeVar, "response");
        qja.C16414b.m45550c(this.f51318g, null, new C17743b(), 1, null);
    }

    @Override // p001o.dk6
    public void cacheMiss(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
        qja.C16414b.m45550c(this.f51318g, null, new C17744c(), 1, null);
    }

    @Override // p001o.dk6
    public void callEnd(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
        this.f51315d.m22265T(this.f51314c.m23829i());
        this.f51315d.m22264S(this.f51314c.m23830j());
        qja.C16414b.m45550c(this.f51318g, null, new C17745d(), 1, null);
        this.f51317f.close();
    }

    @Override // p001o.dk6
    public void callFailed(bt1 bt1Var, IOException iOException) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(iOException, "ioe");
        this.f51315d.m22265T(this.f51314c.m23829i());
        this.f51315d.m22264S(this.f51314c.m23830j());
        this.f51318g.mo18189f(iOException, new C17746e());
        fth.m27471a(this.f51317f, iOException, true);
        this.f51317f.Z0(vzf.ERROR);
        this.f51317f.close();
    }

    @Override // p001o.dk6
    public void callStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
        this.f51319h = fmh.C13489a.a.m27093d(fmh.C13489a.f23681a.m27092b());
        this.f51315d.m22265T(this.f51314c.m23829i());
        this.f51315d.m22264S(this.f51314c.m23830j());
        qja.C16414b.m45550c(this.f51318g, null, new C17747f(), 1, null);
    }

    @Override // p001o.dk6
    public void canceled(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
        qja.C16414b.m45550c(this.f51318g, null, new C17748g(), 1, null);
    }

    @Override // p001o.dk6
    public void connectEnd(bt1 bt1Var, InetSocketAddress inetSocketAddress, Proxy proxy, a2e a2eVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(inetSocketAddress, "inetSocketAddress");
        sq8.m48649h(proxy, "proxy");
        qja.C16414b.m45550c(this.f51318g, null, new C17749h(inetSocketAddress, proxy, a2eVar), 1, null);
    }

    @Override // p001o.dk6
    public void connectFailed(bt1 bt1Var, InetSocketAddress inetSocketAddress, Proxy proxy, a2e a2eVar, IOException iOException) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(inetSocketAddress, "inetSocketAddress");
        sq8.m48649h(proxy, "proxy");
        sq8.m48649h(iOException, "ioe");
        this.f51318g.mo18189f(iOException, new C17750i(inetSocketAddress, proxy, a2eVar));
        b18 b18Var = this.f51313b;
        InetAddress address = inetSocketAddress.getAddress();
        sq8.m48648g(address, "getAddress(...)");
        b18Var.mo18088b(ie5.m31991a(address));
    }

    @Override // p001o.dk6
    public void connectStart(bt1 bt1Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(inetSocketAddress, "inetSocketAddress");
        sq8.m48649h(proxy, "proxy");
        qja.C16414b.m45550c(this.f51318g, null, new C17751j(inetSocketAddress, proxy), 1, null);
    }

    @Override // p001o.dk6
    public void connectionAcquired(bt1 bt1Var, xr3 xr3Var) {
        long jM34869O;
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(xr3Var, "connection");
        this.f51315d.m22262O(this.f51312a.m21740a());
        this.f51315d.m22263Q(this.f51312a.m21743d());
        ulh ulhVar = this.f51319h;
        if (ulhVar == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (!this.f51320i) {
            this.f51320i = true;
            this.f51321j = ulhVar.mo27104a();
            ry7.m47289b(this.f51315d.m22258C(), this.f51321j, null, null, 6, null);
        }
        if (!this.f51322k) {
            this.f51322k = true;
            ulh ulhVar2 = this.f51323l;
            if (ulhVar2 != null) {
                sq8.m48646e(ulhVar2);
                jM34869O = ulhVar2.mo27104a();
            } else {
                jM34869O = k16.m34869O(ulhVar.mo27104a(), this.f51321j);
            }
            ry7.m47289b(this.f51315d.m22269r(), jM34869O, null, null, 6, null);
        }
        qja.C16414b.m45550c(this.f51318g, null, new C17752k(System.identityHashCode(xr3Var), xr3Var, this), 1, null);
    }

    @Override // p001o.dk6
    public void connectionReleased(bt1 bt1Var, xr3 xr3Var) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(xr3Var, "connection");
        this.f51315d.m22262O(this.f51312a.m21740a());
        this.f51315d.m22263Q(this.f51312a.m21743d());
        qja.C16414b.m45550c(this.f51318g, null, new C17753l(System.identityHashCode(xr3Var), xr3Var, this), 1, null);
    }

    @Override // p001o.dk6
    public void dnsEnd(bt1 bt1Var, String str, List list) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(str, "domainName");
        sq8.m48649h(list, "inetAddressList");
        qja.C16414b.m45550c(this.f51318g, null, new C17754m(str, list), 1, null);
    }

    @Override // p001o.dk6
    public void dnsStart(bt1 bt1Var, String str) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(str, "domainName");
        this.f51323l = fmh.C13489a.a.m27093d(fmh.C13489a.f23681a.m27092b());
        if (!this.f51320i) {
            ulh ulhVar = this.f51319h;
            if (ulhVar == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            this.f51321j = ulhVar.mo27104a();
            ry7.m47289b(this.f51315d.m22258C(), this.f51321j, null, null, 6, null);
            this.f51320i = true;
        }
        qja.C16414b.m45550c(this.f51318g, null, new C17755n(str), 1, null);
    }

    @Override // p001o.dk6
    public void proxySelectEnd(bt1 bt1Var, w48 w48Var, List list) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(w48Var, ImagesContract.URL);
        sq8.m48649h(list, "proxies");
        qja.C16414b.m45550c(this.f51318g, null, new C17756o(w48Var, list), 1, null);
    }

    @Override // p001o.dk6
    public void proxySelectStart(bt1 bt1Var, w48 w48Var) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(w48Var, ImagesContract.URL);
        qja.C16414b.m45550c(this.f51318g, null, new C17757p(w48Var), 1, null);
    }

    @Override // p001o.dk6
    public void requestBodyEnd(bt1 bt1Var, long j) {
        sq8.m48649h(bt1Var, "call");
        this.f51324m = fmh.C13489a.a.m27093d(fmh.C13489a.f23681a.m27092b());
        qja.C16414b.m45550c(this.f51318g, null, new C17758q(j), 1, null);
    }

    @Override // p001o.dk6
    public void requestBodyStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
        qja.C16414b.m45550c(this.f51318g, null, new C17759r(), 1, null);
    }

    @Override // p001o.dk6
    public void requestFailed(bt1 bt1Var, IOException iOException) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(iOException, "ioe");
        this.f51318g.mo18189f(iOException, new C17760s());
    }

    @Override // p001o.dk6
    public void requestHeadersEnd(bt1 bt1Var, ule uleVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(uleVar, "request");
        if (uleVar.m51730a() == null) {
            this.f51324m = fmh.C13489a.a.m27093d(fmh.C13489a.f23681a.m27092b());
        }
        qja.C16414b.m45550c(this.f51318g, null, new C17761t(), 1, null);
    }

    @Override // p001o.dk6
    public void requestHeadersStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
        qja.C16414b.m45550c(this.f51318g, null, new C17762u(), 1, null);
    }

    @Override // p001o.dk6
    public void responseBodyEnd(bt1 bt1Var, long j) {
        sq8.m48649h(bt1Var, "call");
        qja.C16414b.m45550c(this.f51318g, null, new C17763v(j), 1, null);
    }

    @Override // p001o.dk6
    public void responseBodyStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
        qja.C16414b.m45550c(this.f51318g, null, new C17764w(), 1, null);
    }

    @Override // p001o.dk6
    public void responseFailed(bt1 bt1Var, IOException iOException) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(iOException, "ioe");
        this.f51318g.mo18189f(iOException, new C17765x());
    }

    @Override // p001o.dk6
    public void responseHeadersEnd(bt1 bt1Var, zqe zqeVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(zqeVar, "response");
        cre creVarM59735c = zqeVar.m59735c();
        qja.C16414b.m45550c(this.f51318g, null, new C17766y(creVarM59735c != null ? Long.valueOf(creVarM59735c.mo21617g()) : null), 1, null);
    }

    @Override // p001o.dk6
    public void responseHeadersStart(bt1 bt1Var) {
        jl6 jl6VarM18282b;
        sq8.m48649h(bt1Var, "call");
        ulh ulhVar = this.f51324m;
        if (ulhVar != null) {
            long jMo27104a = ulhVar.mo27104a();
            ry7.m47289b(this.f51315d.m22259D(), jMo27104a, null, null, 6, null);
            b8f b8fVar = (b8f) bt1Var.request().m51739j(b8f.class);
            if (b8fVar != null && (jl6VarM18282b = b8fVar.m18282b()) != null) {
                jl6VarM18282b.mo34002p(zf6.f57128a.m59376a(), k16.m34883h(jMo27104a));
            }
        }
        qja.C16414b.m45550c(this.f51318g, null, new C17767z(), 1, null);
    }

    @Override // p001o.dk6
    public void satisfactionFailure(bt1 bt1Var, zqe zqeVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(zqeVar, "response");
        qja.C16414b.m45550c(this.f51318g, null, new a0(), 1, null);
    }

    @Override // p001o.dk6
    public void secureConnectEnd(bt1 bt1Var, ww7 ww7Var) {
        sq8.m48649h(bt1Var, "call");
        qja.C16414b.m45550c(this.f51318g, null, new b0(ww7Var), 1, null);
    }

    @Override // p001o.dk6
    public void secureConnectStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
        qja.C16414b.m45550c(this.f51318g, null, new c0(), 1, null);
    }
}

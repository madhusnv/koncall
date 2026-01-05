package p001o;

import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p001o.el6;
import p001o.fve;
import p001o.ww7;
import p001o.zqe;

/* loaded from: classes6.dex */
public final class wr3 implements fve.InterfaceC13582b, el6.InterfaceC13212a {

    /* renamed from: y */
    public static final C17954a f52561y = new C17954a(null);

    /* renamed from: a */
    public final uog f52562a;

    /* renamed from: b */
    public final ade f52563b;

    /* renamed from: c */
    public final int f52564c;

    /* renamed from: d */
    public final int f52565d;

    /* renamed from: e */
    public final int f52566e;

    /* renamed from: f */
    public final int f52567f;

    /* renamed from: g */
    public final int f52568g;

    /* renamed from: h */
    public final boolean f52569h;

    /* renamed from: i */
    public final gt3 f52570i;

    /* renamed from: j */
    public final ede f52571j;

    /* renamed from: k */
    public final bve f52572k;

    /* renamed from: l */
    public final List f52573l;

    /* renamed from: m */
    public final int f52574m;

    /* renamed from: n */
    public final ule f52575n;

    /* renamed from: o */
    public final int f52576o;

    /* renamed from: p */
    public final boolean f52577p;

    /* renamed from: q */
    public volatile boolean f52578q;

    /* renamed from: r */
    public Socket f52579r;

    /* renamed from: s */
    public Socket f52580s;

    /* renamed from: t */
    public ww7 f52581t;

    /* renamed from: u */
    public a2e f52582u;

    /* renamed from: v */
    public im1 f52583v;

    /* renamed from: w */
    public gm1 f52584w;

    /* renamed from: x */
    public zce f52585x;

    /* renamed from: o.wr3$a */
    public static final class C17954a {
        public C17954a() {
        }

        public /* synthetic */ C17954a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.wr3$b */
    public /* synthetic */ class C17955b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52586a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52586a = iArr;
        }
    }

    /* renamed from: o.wr3$c */
    public static final class C17956c extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ ww7 f52587a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17956c(ww7 ww7Var) {
            super(0);
            this.f52587a = ww7Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<Certificate> listM55295d = this.f52587a.m55295d();
            ArrayList arrayList = new ArrayList(dh3.m23088v(listM55295d, 10));
            for (Certificate certificate : listM55295d) {
                sq8.m48647f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* renamed from: o.wr3$d */
    public static final class C17957d extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ pf2 f52588a;

        /* renamed from: b */
        public final /* synthetic */ ww7 f52589b;

        /* renamed from: c */
        public final /* synthetic */ d60 f52590c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17957d(pf2 pf2Var, ww7 ww7Var, d60 d60Var) {
            super(0);
            this.f52588a = pf2Var;
            this.f52589b = ww7Var;
            this.f52590c = d60Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            of2 of2VarM43554d = this.f52588a.m43554d();
            sq8.m48646e(of2VarM43554d);
            return of2VarM43554d.mo33679a(this.f52589b.m55295d(), this.f52590c.m22357l().m53877h());
        }
    }

    public wr3(uog uogVar, ade adeVar, int i, int i2, int i3, int i4, int i5, boolean z, gt3 gt3Var, ede edeVar, bve bveVar, List list, int i6, ule uleVar, int i7, boolean z2) {
        sq8.m48649h(uogVar, "taskRunner");
        sq8.m48649h(adeVar, "connectionPool");
        sq8.m48649h(gt3Var, "user");
        sq8.m48649h(edeVar, "routePlanner");
        sq8.m48649h(bveVar, "route");
        this.f52562a = uogVar;
        this.f52563b = adeVar;
        this.f52564c = i;
        this.f52565d = i2;
        this.f52566e = i3;
        this.f52567f = i4;
        this.f52568g = i5;
        this.f52569h = z;
        this.f52570i = gt3Var;
        this.f52571j = edeVar;
        this.f52572k = bveVar;
        this.f52573l = list;
        this.f52574m = i6;
        this.f52575n = uleVar;
        this.f52576o = i7;
        this.f52577p = z2;
    }

    /* renamed from: l */
    public static /* synthetic */ wr3 m54917l(wr3 wr3Var, int i, ule uleVar, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wr3Var.f52574m;
        }
        if ((i3 & 2) != 0) {
            uleVar = wr3Var.f52575n;
        }
        if ((i3 & 4) != 0) {
            i2 = wr3Var.f52576o;
        }
        if ((i3 & 8) != 0) {
            z = wr3Var.f52577p;
        }
        return wr3Var.m54922k(i, uleVar, i2, z);
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: a */
    public zce mo25596a() throws IOException {
        this.f52570i.mo25543l(getRoute());
        zce zceVar = this.f52585x;
        sq8.m48646e(zceVar);
        this.f52570i.mo25537f(zceVar, getRoute());
        ete eteVarM24824k = this.f52571j.m24824k(this, this.f52573l);
        if (eteVarM24824k != null) {
            return eteVarM24824k.m25603h();
        }
        synchronized (zceVar) {
            this.f52563b.m16928j(zceVar);
            this.f52570i.mo25532a(zceVar);
            y3i y3iVar = y3i.f54824a;
        }
        this.f52570i.mo25547p(zceVar);
        this.f52570i.mo25544m(zceVar);
        return zceVar;
    }

    @Override // p001o.el6.InterfaceC13212a
    /* renamed from: b */
    public void mo25203b(yce yceVar, IOException iOException) {
        sq8.m48649h(yceVar, "call");
    }

    @Override // p001o.el6.InterfaceC13212a
    /* renamed from: c */
    public void mo25204c() {
    }

    @Override // p001o.fve.InterfaceC13582b
    public void cancel() throws IOException {
        this.f52578q = true;
        Socket socket = this.f52579r;
        if (socket != null) {
            jgj.m33813g(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0177 A[Catch: all -> 0x019a, TryCatch #4 {all -> 0x019a, blocks: (B:57:0x014c, B:69:0x016a, B:71:0x0177, B:75:0x017f), top: B:104:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fve.C13581a mo25599d() throws Throwable {
        wr3 wr3VarM54925o;
        wr3 wr3Var;
        rl1 buffer;
        rl1 buffer2;
        boolean z = true;
        if (!(this.f52579r != null)) {
            throw new IllegalStateException("TCP not connected".toString());
        }
        if (!(!isReady())) {
            throw new IllegalStateException("already connected".toString());
        }
        List listM22347b = getRoute().m19864a().m22347b();
        this.f52570i.mo25545n(this);
        wr3 wr3Var2 = null;
        try {
            try {
                try {
                    if (this.f52575n != null) {
                        fve.C13581a c13581aM54921j = m54921j();
                        if (c13581aM54921j.m27570c() != null || c13581aM54921j.m27572e() != null) {
                            this.f52570i.mo25534c(this);
                            Socket socket = this.f52580s;
                            if (socket != null) {
                                jgj.m33813g(socket);
                            }
                            Socket socket2 = this.f52579r;
                            if (socket2 != null) {
                                jgj.m33813g(socket2);
                            }
                            return c13581aM54921j;
                        }
                    }
                    if (getRoute().m19864a().m22356k() != null) {
                        im1 im1Var = this.f52583v;
                        if (!((im1Var == null || (buffer2 = im1Var.getBuffer()) == null || buffer2.mo32311n()) ? false : true)) {
                            gm1 gm1Var = this.f52584w;
                            if (!((gm1Var == null || (buffer = gm1Var.getBuffer()) == null || buffer.mo32311n()) ? false : true)) {
                                this.f52570i.mo25550s();
                                Socket socketCreateSocket = getRoute().m19864a().m22356k().createSocket(this.f52579r, getRoute().m19864a().m22357l().m53877h(), getRoute().m19864a().m22357l().m53882n(), true);
                                sq8.m48647f(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                                SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                                wr3 wr3VarM54926p = m54926p(listM22347b, sSLSocket);
                                et3 et3Var = (et3) listM22347b.get(wr3VarM54926p.f52576o);
                                wr3VarM54925o = wr3VarM54926p.m54925o(listM22347b, sSLSocket);
                                try {
                                    et3Var.m25557b(sSLSocket, wr3VarM54926p.f52577p);
                                    m54920i(sSLSocket, et3Var);
                                    this.f52570i.mo25548q(this.f52581t);
                                    wr3Var = wr3VarM54925o;
                                } catch (IOException e) {
                                    e = e;
                                    z = false;
                                    this.f52570i.mo25554w(getRoute(), null, e);
                                    if (this.f52569h && ate.m17828a(e)) {
                                        wr3Var2 = wr3VarM54925o;
                                    }
                                    fve.C13581a c13581a = new fve.C13581a(this, wr3Var2, e);
                                    this.f52570i.mo25534c(this);
                                    if (!z) {
                                        Socket socket3 = this.f52580s;
                                        if (socket3 != null) {
                                            jgj.m33813g(socket3);
                                        }
                                        Socket socket4 = this.f52579r;
                                        if (socket4 != null) {
                                            jgj.m33813g(socket4);
                                        }
                                    }
                                    return c13581a;
                                }
                            }
                        }
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    this.f52580s = this.f52579r;
                    List listM22351f = getRoute().m19864a().m22351f();
                    a2e a2eVar = a2e.H2_PRIOR_KNOWLEDGE;
                    if (!listM22351f.contains(a2eVar)) {
                        a2eVar = a2e.HTTP_1_1;
                    }
                    this.f52582u = a2eVar;
                    wr3Var = null;
                } catch (IOException e2) {
                    e = e2;
                    wr3VarM54925o = null;
                }
                try {
                    zce zceVar = new zce(this.f52562a, this.f52563b, getRoute(), this.f52579r, this.f52580s, this.f52581t, this.f52582u, this.f52583v, this.f52584w, this.f52568g, this.f52563b.m16924f());
                    this.f52585x = zceVar;
                    zceVar.m59212z();
                    this.f52570i.mo25540i(getRoute(), this.f52582u);
                } catch (IOException e3) {
                    e = e3;
                    wr3VarM54925o = wr3Var;
                    z = false;
                    this.f52570i.mo25554w(getRoute(), null, e);
                    if (this.f52569h) {
                        wr3Var2 = wr3VarM54925o;
                    }
                    fve.C13581a c13581a2 = new fve.C13581a(this, wr3Var2, e);
                    this.f52570i.mo25534c(this);
                    if (!z) {
                    }
                    return c13581a2;
                }
                try {
                    fve.C13581a c13581a3 = new fve.C13581a(this, null, null, 6, null);
                    this.f52570i.mo25534c(this);
                    return c13581a3;
                } catch (IOException e4) {
                    e = e4;
                    wr3VarM54925o = wr3Var;
                    this.f52570i.mo25554w(getRoute(), null, e);
                    if (this.f52569h) {
                    }
                    fve.C13581a c13581a22 = new fve.C13581a(this, wr3Var2, e);
                    this.f52570i.mo25534c(this);
                    if (!z) {
                    }
                    return c13581a22;
                }
            } catch (Throwable th) {
                th = th;
                z = false;
                this.f52570i.mo25534c(this);
                if (!z) {
                    Socket socket5 = this.f52580s;
                    if (socket5 != null) {
                        jgj.m33813g(socket5);
                    }
                    Socket socket6 = this.f52579r;
                    if (socket6 != null) {
                        jgj.m33813g(socket6);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: e */
    public fve.InterfaceC13582b mo25600e() {
        return new wr3(this.f52562a, this.f52563b, this.f52564c, this.f52565d, this.f52566e, this.f52567f, this.f52568g, this.f52569h, this.f52570i, this.f52571j, getRoute(), this.f52573l, this.f52574m, this.f52575n, this.f52576o, this.f52577p);
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: f */
    public fve.C13581a mo25601f() throws Throwable {
        IOException iOException;
        Socket socket;
        Socket socket2;
        boolean z = true;
        if (!(this.f52579r == null)) {
            throw new IllegalStateException("TCP already connected".toString());
        }
        this.f52570i.mo25545n(this);
        try {
            try {
                this.f52570i.mo25542k(getRoute());
                m54919h();
                try {
                    fve.C13581a c13581a = new fve.C13581a(this, null, null, 6, null);
                    this.f52570i.mo25534c(this);
                    return c13581a;
                } catch (IOException e) {
                    iOException = e;
                    this.f52570i.mo25554w(getRoute(), null, iOException);
                    fve.C13581a c13581a2 = new fve.C13581a(this, null, iOException, 2, null);
                    this.f52570i.mo25534c(this);
                    if (!z && (socket2 = this.f52579r) != null) {
                        jgj.m33813g(socket2);
                    }
                    return c13581a2;
                }
            } catch (Throwable th) {
                th = th;
                this.f52570i.mo25534c(this);
                if (!z && (socket = this.f52579r) != null) {
                    jgj.m33813g(socket);
                }
                throw th;
            }
        } catch (IOException e2) {
            iOException = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            z = false;
            this.f52570i.mo25534c(this);
            if (!z) {
                jgj.m33813g(socket);
            }
            throw th;
        }
    }

    /* renamed from: g */
    public final void m54918g() {
        Socket socket = this.f52580s;
        if (socket != null) {
            jgj.m33813g(socket);
        }
    }

    @Override // p001o.el6.InterfaceC13212a
    public bve getRoute() {
        return this.f52572k;
    }

    /* renamed from: h */
    public final void m54919h() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type2 = getRoute().m19865b().type();
        int i = type2 == null ? -1 : C17955b.f52586a[type2.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = getRoute().m19864a().m22355j().createSocket();
            sq8.m48646e(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(getRoute().m19865b());
        }
        this.f52579r = socketCreateSocket;
        if (this.f52578q) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f52567f);
        try {
            e9d.f21191a.m24582g().mo24570f(socketCreateSocket, getRoute().m19867d(), this.f52566e);
            try {
                this.f52583v = uac.m51310c(uac.m51317j(socketCreateSocket));
                this.f52584w = uac.m51309b(uac.m51314g(socketCreateSocket));
            } catch (NullPointerException e) {
                if (sq8.m48644c(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().m19867d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: i */
    public final void m54920i(SSLSocket sSLSocket, et3 et3Var) throws IOException {
        d60 d60VarM19864a = getRoute().m19864a();
        try {
            if (et3Var.m25563h()) {
                e9d.f21191a.m24582g().mo19310e(sSLSocket, d60VarM19864a.m22357l().m53877h(), d60VarM19864a.m22351f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            ww7.C17989a c17989a = ww7.f52793e;
            sq8.m48646e(session);
            ww7 ww7VarM55297a = c17989a.m55297a(session);
            HostnameVerifier hostnameVerifierM22350e = d60VarM19864a.m22350e();
            sq8.m48646e(hostnameVerifierM22350e);
            if (hostnameVerifierM22350e.verify(d60VarM19864a.m22357l().m53877h(), session)) {
                pf2 pf2VarM22346a = d60VarM19864a.m22346a();
                sq8.m48646e(pf2VarM22346a);
                ww7 ww7Var = new ww7(ww7VarM55297a.m55296e(), ww7VarM55297a.m55292a(), ww7VarM55297a.m55294c(), new C17957d(pf2VarM22346a, ww7VarM55297a, d60VarM19864a));
                this.f52581t = ww7Var;
                pf2VarM22346a.m43552b(d60VarM19864a.m22357l().m53877h(), new C17956c(ww7Var));
                String strMo19311g = et3Var.m25563h() ? e9d.f21191a.m24582g().mo19311g(sSLSocket) : null;
                this.f52580s = sSLSocket;
                this.f52583v = uac.m51310c(uac.m51317j(sSLSocket));
                this.f52584w = uac.m51309b(uac.m51314g(sSLSocket));
                this.f52582u = strMo19311g != null ? a2e.Companion.m16367a(strMo19311g) : a2e.HTTP_1_1;
                e9d.f21191a.m24582g().mo24567b(sSLSocket);
                return;
            }
            List listM55295d = ww7VarM55297a.m55295d();
            if (!(!listM55295d.isEmpty())) {
                throw new SSLPeerUnverifiedException("Hostname " + d60VarM19864a.m22357l().m53877h() + " not verified (no certificates)");
            }
            Object obj = listM55295d.get(0);
            sq8.m48647f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(x8g.m55852h("\n            |Hostname " + d60VarM19864a.m22357l().m53877h() + " not verified:\n            |    certificate: " + pf2.f39983c.m43557a(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + eac.f21258a.m24657a(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th) {
            e9d.f21191a.m24582g().mo24567b(sSLSocket);
            jgj.m33813g(sSLSocket);
            throw th;
        }
    }

    @Override // p001o.fve.InterfaceC13582b
    public boolean isReady() {
        return this.f52582u != null;
    }

    /* renamed from: j */
    public final fve.C13581a m54921j() throws IOException {
        ule uleVarM54923m = m54923m();
        if (uleVarM54923m == null) {
            return new fve.C13581a(this, null, null, 6, null);
        }
        Socket socket = this.f52579r;
        if (socket != null) {
            jgj.m33813g(socket);
        }
        int i = this.f52574m + 1;
        if (i < 21) {
            this.f52570i.mo25540i(getRoute(), null);
            return new fve.C13581a(this, m54917l(this, i, uleVarM54923m, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.f52570i.mo25554w(getRoute(), null, protocolException);
        return new fve.C13581a(this, null, protocolException, 2, null);
    }

    /* renamed from: k */
    public final wr3 m54922k(int i, ule uleVar, int i2, boolean z) {
        return new wr3(this.f52562a, this.f52563b, this.f52564c, this.f52565d, this.f52566e, this.f52567f, this.f52568g, this.f52569h, this.f52570i, this.f52571j, getRoute(), this.f52573l, i, uleVar, i2, z);
    }

    /* renamed from: m */
    public final ule m54923m() throws IOException {
        ule uleVar = this.f52575n;
        sq8.m48646e(uleVar);
        String str = "CONNECT " + jgj.m33827u(getRoute().m19864a().m22357l(), true) + " HTTP/1.1";
        while (true) {
            im1 im1Var = this.f52583v;
            sq8.m48646e(im1Var);
            gm1 gm1Var = this.f52584w;
            sq8.m48646e(gm1Var);
            e18 e18Var = new e18(null, this, im1Var, gm1Var);
            nmh nmhVarTimeout = im1Var.timeout();
            long j = this.f52564c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            nmhVarTimeout.mo40796g(j, timeUnit);
            gm1Var.timeout().mo40796g(this.f52565d, timeUnit);
            e18Var.m24070B(uleVar.m51735f(), str);
            e18Var.mo24071a();
            zqe.C18696a c18696aMo24074d = e18Var.mo24074d(false);
            sq8.m48646e(c18696aMo24074d);
            zqe zqeVarM59750c = c18696aMo24074d.m59764q(uleVar).m59750c();
            e18Var.m24069A(zqeVarM59750c);
            int iM59739h = zqeVarM59750c.m59739h();
            if (iM59739h == 200) {
                return null;
            }
            if (iM59739h != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + zqeVarM59750c.m59739h());
            }
            ule uleVarMo31614a = getRoute().m19864a().m22353h().mo31614a(getRoute(), zqeVarM59750c);
            if (uleVarMo31614a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (e9g.m24606x("close", zqe.m59725t(zqeVarM59750c, "Connection", null, 2, null), true)) {
                return uleVarMo31614a;
            }
            uleVar = uleVarMo31614a;
        }
    }

    /* renamed from: n */
    public final List m54924n() {
        return this.f52573l;
    }

    /* renamed from: o */
    public final wr3 m54925o(List list, SSLSocket sSLSocket) {
        sq8.m48649h(list, "connectionSpecs");
        sq8.m48649h(sSLSocket, "sslSocket");
        int i = this.f52576o + 1;
        int size = list.size();
        for (int i2 = i; i2 < size; i2++) {
            if (((et3) list.get(i2)).m25560e(sSLSocket)) {
                return m54917l(this, 0, null, i2, this.f52576o != -1, 3, null);
            }
        }
        return null;
    }

    /* renamed from: p */
    public final wr3 m54926p(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        sq8.m48649h(list, "connectionSpecs");
        sq8.m48649h(sSLSocket, "sslSocket");
        if (this.f52576o != -1) {
            return this;
        }
        wr3 wr3VarM54925o = m54925o(list, sSLSocket);
        if (wr3VarM54925o != null) {
            return wr3VarM54925o;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f52577p);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        sq8.m48646e(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        sq8.m48648g(string, "toString(...)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }
}

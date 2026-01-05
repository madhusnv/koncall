package nz;

import aw.C0467g;
import b00.AbstractC0517b;
import b00.c0;
import b00.d0;
import b00.k0;
import iz.C3368a;
import iz.C3373f;
import iz.C3376i;
import iz.C3379l;
import iz.C3388u;
import iz.C3389v;
import iz.C3391x;
import iz.e0;
import iz.f0;
import iz.j0;
import iz.o0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import kz.AbstractC4299e;
import l1.C4327p;
import mm.AbstractC4801l;
import mz.C4920d;
import nx.AbstractC5179q;
import oz.InterfaceC5780c;
import p020v.x0;
import pg.b7;
import pg.d7;
import pz.C6050d;
import pz.C6053g;
import rw.AbstractC6663m;
import tw.C7240a;
import tz.AbstractC7285d;
import xz.C8521c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.d */
/* loaded from: classes3.dex */
public final class C5193d implements InterfaceC5211v, InterfaceC5780c {

    /* renamed from: a */
    public final C4920d f25302a;

    /* renamed from: b */
    public final C5207r f25303b;

    /* renamed from: c */
    public final int f25304c;

    /* renamed from: d */
    public final int f25305d;

    /* renamed from: e */
    public final int f25306e;

    /* renamed from: f */
    public final int f25307f;

    /* renamed from: g */
    public final int f25308g;

    /* renamed from: h */
    public final boolean f25309h;

    /* renamed from: i */
    public final C5190a f25310i;

    /* renamed from: j */
    public final C5208s f25311j;

    /* renamed from: k */
    public final o0 f25312k;

    /* renamed from: l */
    public final List f25313l;

    /* renamed from: m */
    public final int f25314m;

    /* renamed from: n */
    public final x0 f25315n;

    /* renamed from: o */
    public final int f25316o;

    /* renamed from: p */
    public final boolean f25317p;

    /* renamed from: q */
    public volatile boolean f25318q;

    /* renamed from: r */
    public Socket f25319r;

    /* renamed from: s */
    public Socket f25320s;

    /* renamed from: t */
    public C3388u f25321t;

    /* renamed from: u */
    public f0 f25322u;

    /* renamed from: v */
    public d0 f25323v;

    /* renamed from: w */
    public c0 f25324w;

    /* renamed from: x */
    public C5206q f25325x;

    public C5193d(C4920d taskRunner, C5207r connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z6, C5190a user, C5208s c5208s, o0 route, List list, int i15, x0 x0Var, int i16, boolean z10) {
        AbstractC4154l.m8923f(taskRunner, "taskRunner");
        AbstractC4154l.m8923f(connectionPool, "connectionPool");
        AbstractC4154l.m8923f(user, "user");
        AbstractC4154l.m8923f(route, "route");
        this.f25302a = taskRunner;
        this.f25303b = connectionPool;
        this.f25304c = i10;
        this.f25305d = i11;
        this.f25306e = i12;
        this.f25307f = i13;
        this.f25308g = i14;
        this.f25309h = z6;
        this.f25310i = user;
        this.f25311j = c5208s;
        this.f25312k = route;
        this.f25313l = list;
        this.f25314m = i15;
        this.f25315n = x0Var;
        this.f25316o = i16;
        this.f25317p = z10;
    }

    /* renamed from: l */
    public static C5193d m10165l(C5193d c5193d, int i10, x0 x0Var, int i11, boolean z6, int i12) {
        return new C5193d(c5193d.f25302a, c5193d.f25303b, c5193d.f25304c, c5193d.f25305d, c5193d.f25306e, c5193d.f25307f, c5193d.f25308g, c5193d.f25309h, c5193d.f25310i, c5193d.f25311j, c5193d.f25312k, c5193d.f25313l, (i12 & 1) != 0 ? c5193d.f25314m : i10, (i12 & 2) != 0 ? c5193d.f25315n : x0Var, (i12 & 4) != 0 ? c5193d.f25316o : i11, (i12 & 8) != 0 ? c5193d.f25317p : z6);
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: a */
    public final InterfaceC5211v mo10166a() {
        return new C5193d(this.f25302a, this.f25303b, this.f25304c, this.f25305d, this.f25306e, this.f25307f, this.f25308g, this.f25309h, this.f25310i, this.f25311j, this.f25312k, this.f25313l, this.f25314m, this.f25315n, this.f25316o, this.f25317p);
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: c */
    public final C5206q mo10168c() {
        C5190a c5190a = this.f25310i;
        o0 route = this.f25312k;
        c5190a.getClass();
        AbstractC4154l.m8923f(route, "route");
        C4327p c4327p = c5190a.f25297a.f25359a.f17858y;
        synchronized (c4327p) {
            ((LinkedHashSet) c4327p.f21788b).remove(route);
        }
        C5206q connection = this.f25325x;
        AbstractC4154l.m8920c(connection);
        C5190a c5190a2 = this.f25310i;
        o0 route2 = this.f25312k;
        c5190a2.getClass();
        AbstractC4154l.m8923f(connection, "connection");
        AbstractC4154l.m8923f(route2, "route");
        C5194e c5194e = c5190a2.f25298b;
        C5205p call = c5190a2.f25297a;
        c5194e.getClass();
        AbstractC4154l.m8923f(call, "call");
        C5209t c5209tM10206c = this.f25311j.m10206c(this, this.f25313l);
        if (c5209tM10206c != null) {
            return c5209tM10206c.f25419a;
        }
        synchronized (connection) {
            C5207r c5207r = this.f25303b;
            c5207r.getClass();
            TimeZone timeZone = AbstractC4299e.f21707a;
            c5207r.f25402g.add(connection);
            c5207r.f25400e.m9818d(c5207r.f25401f, 0L);
            this.f25310i.m10150a(connection);
        }
        this.f25310i.m10156g(connection);
        this.f25310i.m10157h(connection);
        return connection;
    }

    @Override // nz.InterfaceC5211v, oz.InterfaceC5780c
    public final void cancel() {
        this.f25318q = true;
        Socket socket = this.f25319r;
        if (socket != null) {
            AbstractC4299e.m9014c(socket);
        }
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: d */
    public final boolean mo10169d() {
        return this.f25322u != null;
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: e */
    public final C5210u mo10170e() {
        Socket socket;
        Socket socket2;
        o0 o0Var = this.f25312k;
        if (this.f25319r != null) {
            throw new IllegalStateException("TCP already connected");
        }
        C5190a c5190a = this.f25310i;
        c5190a.m10151b(this);
        boolean z6 = false;
        try {
            try {
                c5190a.m10155f(o0Var);
                m10174i();
                z6 = true;
                C5210u c5210u = new C5210u(this, null, null, 6);
                c5190a.m10164o(this);
                return c5210u;
            } catch (IOException e2) {
                o0Var.f17969a.getClass();
                if (o0Var.f17970b.type() != Proxy.Type.DIRECT) {
                    C3368a c3368a = o0Var.f17969a;
                    c3368a.f17779g.connectFailed(c3368a.f17780h.m7803h(), o0Var.f17970b.address(), e2);
                }
                c5190a.m10154e(o0Var, e2);
                C5210u c5210u2 = new C5210u(this, null, e2, 2);
                c5190a.m10164o(this);
                if (!z6 && (socket2 = this.f25319r) != null) {
                    AbstractC4299e.m9014c(socket2);
                }
                return c5210u2;
            }
        } catch (Throwable th2) {
            c5190a.m10164o(this);
            if (!z6 && (socket = this.f25319r) != null) {
                AbstractC4299e.m9014c(socket);
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141 A[Catch: all -> 0x002d, TryCatch #10 {all -> 0x002d, blocks: (B:7:0x001c, B:9:0x0020, B:11:0x0028, B:23:0x0042, B:26:0x004b, B:28:0x004f, B:30:0x0057, B:32:0x005b, B:34:0x0063, B:35:0x008d, B:52:0x00ca, B:54:0x00cd, B:56:0x00d0, B:58:0x00df, B:60:0x00e9, B:63:0x00f0, B:65:0x00f7, B:95:0x013a, B:97:0x0141, B:100:0x0146, B:103:0x014b, B:105:0x014f, B:108:0x0158, B:111:0x015d, B:115:0x0163, B:83:0x0126, B:84:0x0129, B:87:0x012d, B:88:0x0131, B:40:0x00a7, B:41:0x00aa, B:42:0x00ab, B:43:0x00b2, B:44:0x00b3, B:45:0x00b6, B:46:0x00b7, B:50:0x00c6, B:49:0x00c4), top: B:149:0x001c }] */
    @Override // nz.InterfaceC5211v
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nz.C5210u mo10172g() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nz.C5193d.mo10172g():nz.u");
    }

    @Override // oz.InterfaceC5780c
    /* renamed from: h */
    public final o0 mo10173h() {
        return this.f25312k;
    }

    /* renamed from: i */
    public final void m10174i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.f25312k.f17970b.type();
        int i10 = type == null ? -1 : AbstractC5192c.f25301a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = this.f25312k.f17969a.f17774b.createSocket();
            AbstractC4154l.m8920c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.f25312k.f17970b);
        }
        this.f25319r = socketCreateSocket;
        if (this.f25318q) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f25307f);
        try {
            AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
            AbstractC7285d.f34750a.mo13615d(socketCreateSocket, this.f25312k.f17971c, this.f25306e);
            try {
                this.f25323v = AbstractC0517b.m1524c(AbstractC0517b.m1530i(socketCreateSocket));
                this.f25324w = AbstractC0517b.m1523b(AbstractC0517b.m1528g(socketCreateSocket));
            } catch (NullPointerException e2) {
                if (AbstractC4154l.m8918a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f25312k.f17971c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    /* renamed from: j */
    public final void m10175j(SSLSocket sSLSocket, C3379l c3379l) {
        String strMo13609e;
        f0 f0VarM7729a;
        C3368a c3368a = this.f25312k.f17969a;
        try {
            if (c3379l.f17936b) {
                AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
                AbstractC7285d.f34750a.mo13608c(sSLSocket, c3368a.f17780h.f17994d, c3368a.f17781i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            AbstractC4154l.m8920c(session);
            C3388u c3388uM11581a = d7.m11581a(session);
            HostnameVerifier hostnameVerifier = c3368a.f17776d;
            AbstractC4154l.m8920c(hostnameVerifier);
            if (!hostnameVerifier.verify(c3368a.f17780h.f17994d, session)) {
                List listM7786a = c3388uM11581a.m7786a();
                if (listM7786a.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c3368a.f17780h.f17994d + " not verified (no certificates)");
                }
                Object obj = listM7786a.get(0);
                AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb2 = new StringBuilder("\n            |Hostname ");
                sb2.append(c3368a.f17780h.f17994d);
                sb2.append(" not verified:\n            |    certificate: ");
                C3373f c3373f = C3373f.f17860c;
                sb2.append(b7.m11546a(x509Certificate));
                sb2.append("\n            |    DN: ");
                sb2.append(x509Certificate.getSubjectDN().getName());
                sb2.append("\n            |    subjectAltNames: ");
                sb2.append(AbstractC6663m.m12754R(C8521c.m15794a(x509Certificate, 7), C8521c.m15794a(x509Certificate, 2)));
                sb2.append("\n            ");
                throw new SSLPeerUnverifiedException(AbstractC5179q.m10123e(sb2.toString()));
            }
            C3373f c3373f2 = c3368a.f17777e;
            AbstractC4154l.m8920c(c3373f2);
            this.f25321t = new C3388u(c3388uM11581a.f17976a, c3388uM11581a.f17977b, c3388uM11581a.f17978c, new C0467g(14, c3373f2, c3388uM11581a, c3368a));
            String hostname = c3368a.f17780h.f17994d;
            AbstractC4154l.m8923f(hostname, "hostname");
            Iterator it = c3373f2.f17861a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (c3379l.f17936b) {
                AbstractC7285d abstractC7285d2 = AbstractC7285d.f34750a;
                strMo13609e = AbstractC7285d.f34750a.mo13609e(sSLSocket);
            } else {
                strMo13609e = null;
            }
            this.f25320s = sSLSocket;
            this.f25323v = AbstractC0517b.m1524c(AbstractC0517b.m1530i(sSLSocket));
            this.f25324w = AbstractC0517b.m1523b(AbstractC0517b.m1528g(sSLSocket));
            if (strMo13609e != null) {
                f0.Companion.getClass();
                f0VarM7729a = e0.m7729a(strMo13609e);
            } else {
                f0VarM7729a = f0.HTTP_1_1;
            }
            this.f25322u = f0VarM7729a;
            AbstractC7285d abstractC7285d3 = AbstractC7285d.f34750a;
            AbstractC7285d.f34750a.getClass();
        } catch (Throwable th2) {
            AbstractC7285d abstractC7285d4 = AbstractC7285d.f34750a;
            AbstractC7285d.f34750a.getClass();
            AbstractC4299e.m9014c(sSLSocket);
            throw th2;
        }
    }

    /* renamed from: k */
    public final C5210u m10176k() throws IOException {
        x0 x0Var;
        x0 x0Var2 = this.f25315n;
        AbstractC4154l.m8920c(x0Var2);
        o0 o0Var = this.f25312k;
        String str = "CONNECT " + AbstractC4299e.m9020i(o0Var.f17969a.f17780h, true) + " HTTP/1.1";
        while (true) {
            d0 d0Var = this.f25323v;
            if (d0Var == null) {
                AbstractC4154l.m8928k("source");
                throw null;
            }
            c0 c0Var = this.f25324w;
            if (c0Var == null) {
                AbstractC4154l.m8928k("sink");
                throw null;
            }
            C6053g c6053g = new C6053g(null, this, d0Var, c0Var);
            d0 d0Var2 = this.f25323v;
            if (d0Var2 == null) {
                AbstractC4154l.m8928k("source");
                throw null;
            }
            k0 k0VarMo1532f = d0Var2.f3601a.mo1532f();
            long j6 = this.f25304c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            k0VarMo1532f.mo1585g(j6);
            c0 c0Var2 = this.f25324w;
            if (c0Var2 == null) {
                AbstractC4154l.m8928k("sink");
                throw null;
            }
            c0Var2.f3595a.mo1538f().mo1585g(this.f25305d);
            c6053g.m12060k((C3389v) x0Var2.f36756d, str);
            c6053g.mo11314b();
            j0 j0VarMo11318f = c6053g.mo11318f(false);
            AbstractC4154l.m8920c(j0VarMo11318f);
            j0VarMo11318f.f17899a = x0Var2;
            iz.k0 k0VarM7732a = j0VarMo11318f.m7732a();
            int i10 = k0VarM7732a.f17920d;
            long jM9016e = AbstractC4299e.m9016e(k0VarM7732a);
            if (jM9016e != -1) {
                C6050d c6050dM12059j = c6053g.m12059j((C3391x) k0VarM7732a.f17917a.f36754b, jM9016e);
                AbstractC4299e.m9018g(c6050dM12059j, Integer.MAX_VALUE);
                c6050dM12059j.close();
            }
            if (i10 == 200) {
                x0Var = null;
                break;
            }
            if (i10 != 407) {
                throw new IOException(AbstractC4801l.m9730d(i10, "Unexpected response code for CONNECT: "));
            }
            x0 x0VarMo7726d = o0Var.f17969a.f17778f.mo7726d(o0Var, k0VarM7732a);
            if (x0VarMo7726d == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            String strM7787b = k0VarM7732a.f17922f.m7787b("Connection");
            if (strM7787b == null) {
                strM7787b = null;
            }
            if ("close".equalsIgnoreCase(strM7787b)) {
                x0Var = x0VarMo7726d;
                break;
            }
            x0Var2 = x0VarMo7726d;
        }
        if (x0Var == null) {
            return new C5210u(this, null, null, 6);
        }
        Socket socket = this.f25319r;
        if (socket != null) {
            AbstractC4299e.m9014c(socket);
        }
        int i11 = this.f25314m + 1;
        C5190a c5190a = this.f25310i;
        if (i11 < 21) {
            c5190a.m10152c(o0Var, null);
            return new C5210u(this, m10165l(this, i11, x0Var, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        c5190a.m10154e(o0Var, protocolException);
        return new C5210u(this, null, protocolException, 2);
    }

    /* renamed from: m */
    public final C5193d m10177m(List connectionSpecs, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        AbstractC4154l.m8923f(connectionSpecs, "connectionSpecs");
        int i10 = this.f25316o;
        int size = connectionSpecs.size();
        for (int i11 = i10 + 1; i11 < size; i11++) {
            C3379l c3379l = (C3379l) connectionSpecs.get(i11);
            c3379l.getClass();
            if (c3379l.f17935a && (((strArr = c3379l.f17938d) == null || AbstractC4297c.m9001e(strArr, sSLSocket.getEnabledProtocols(), C7240a.f34590b)) && ((strArr2 = c3379l.f17937c) == null || AbstractC4297c.m9001e(strArr2, sSLSocket.getEnabledCipherSuites(), C3376i.f17870c)))) {
                return m10165l(this, 0, null, i11, i10 != -1, 3);
            }
        }
        return null;
    }

    /* renamed from: n */
    public final C5193d m10178n(List connectionSpecs, SSLSocket sSLSocket) throws UnknownServiceException {
        AbstractC4154l.m8923f(connectionSpecs, "connectionSpecs");
        if (this.f25316o != -1) {
            return this;
        }
        C5193d c5193dM10177m = m10177m(connectionSpecs, sSLSocket);
        if (c5193dM10177m != null) {
            return c5193dM10177m;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f25317p);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        AbstractC4154l.m8920c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        AbstractC4154l.m8922e(string, "toString(...)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // oz.InterfaceC5780c
    /* renamed from: f */
    public final void mo10171f() {
    }

    @Override // oz.InterfaceC5780c
    /* renamed from: b */
    public final void mo10167b(C5205p c5205p, IOException iOException) {
    }
}

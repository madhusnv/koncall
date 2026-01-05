package nz;

import b00.InterfaceC0527l;
import b00.InterfaceC0528m;
import b00.c0;
import b00.d0;
import iz.C3368a;
import iz.C3388u;
import iz.C3390w;
import iz.f0;
import iz.o0;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import l1.C4327p;
import mz.C4919c;
import mz.C4920d;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import oz.InterfaceC5780c;
import qz.AbstractC6390h;
import qz.AbstractC6396n;
import qz.C6385c;
import qz.C6398p;
import qz.C6406x;
import qz.C6407y;
import qz.EnumC6384b;
import qz.b0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.q */
/* loaded from: classes3.dex */
public final class C5206q extends AbstractC6396n implements InterfaceC5780c {

    /* renamed from: b */
    public final C4920d f25376b;

    /* renamed from: c */
    public final C5207r f25377c;

    /* renamed from: d */
    public final o0 f25378d;

    /* renamed from: e */
    public final Socket f25379e;

    /* renamed from: f */
    public final Socket f25380f;

    /* renamed from: g */
    public final C3388u f25381g;

    /* renamed from: h */
    public final f0 f25382h;

    /* renamed from: i */
    public final InterfaceC0528m f25383i;

    /* renamed from: j */
    public final InterfaceC0527l f25384j;

    /* renamed from: k */
    public final int f25385k;

    /* renamed from: l */
    public final C5194e f25386l;

    /* renamed from: m */
    public C6398p f25387m;

    /* renamed from: n */
    public boolean f25388n;

    /* renamed from: o */
    public boolean f25389o;

    /* renamed from: p */
    public int f25390p;

    /* renamed from: q */
    public int f25391q;

    /* renamed from: r */
    public int f25392r;

    /* renamed from: s */
    public int f25393s;

    /* renamed from: t */
    public final ArrayList f25394t;

    /* renamed from: u */
    public long f25395u;

    public C5206q(C4920d taskRunner, C5207r connectionPool, o0 route, Socket rawSocket, Socket socket, C3388u c3388u, f0 protocol, d0 source, c0 sink, int i10, C5194e c5194e) {
        AbstractC4154l.m8923f(taskRunner, "taskRunner");
        AbstractC4154l.m8923f(connectionPool, "connectionPool");
        AbstractC4154l.m8923f(route, "route");
        AbstractC4154l.m8923f(rawSocket, "rawSocket");
        AbstractC4154l.m8923f(socket, "socket");
        AbstractC4154l.m8923f(protocol, "protocol");
        AbstractC4154l.m8923f(source, "source");
        AbstractC4154l.m8923f(sink, "sink");
        this.f25376b = taskRunner;
        this.f25377c = connectionPool;
        this.f25378d = route;
        this.f25379e = rawSocket;
        this.f25380f = socket;
        this.f25381g = c3388u;
        this.f25382h = protocol;
        this.f25383i = source;
        this.f25384j = sink;
        this.f25385k = i10;
        this.f25386l = c5194e;
        this.f25393s = 1;
        this.f25394t = new ArrayList();
        this.f25395u = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public static void m10197d(iz.d0 d0Var, o0 failedRoute, IOException failure) {
        AbstractC4154l.m8923f(failedRoute, "failedRoute");
        AbstractC4154l.m8923f(failure, "failure");
        if (failedRoute.f17970b.type() != Proxy.Type.DIRECT) {
            C3368a c3368a = failedRoute.f17969a;
            c3368a.f17779g.connectFailed(c3368a.f17780h.m7803h(), failedRoute.f17970b.address(), failure);
        }
        C4327p c4327p = d0Var.f17858y;
        synchronized (c4327p) {
            ((LinkedHashSet) c4327p.f21788b).add(failedRoute);
        }
    }

    @Override // qz.AbstractC6396n
    /* renamed from: a */
    public final void mo10198a(C6398p c6398p, b0 settings) {
        AbstractC4154l.m8923f(settings, "settings");
        synchronized (this) {
            try {
                int i10 = this.f25393s;
                int i11 = (settings.f30791a & 8) != 0 ? settings.f30792b[3] : Integer.MAX_VALUE;
                this.f25393s = i11;
                if (i11 < i10) {
                    C5207r c5207r = this.f25377c;
                    C3368a address = this.f25378d.f17969a;
                    c5207r.getClass();
                    AbstractC4154l.m8923f(address, "address");
                    if (c5207r.f25399d.get(address) != null) {
                        throw new ClassCastException();
                    }
                } else if (i11 > i10) {
                    C5207r c5207r2 = this.f25377c;
                    c5207r2.f25400e.m9818d(c5207r2.f25401f, 0L);
                }
            } finally {
            }
        }
    }

    @Override // oz.InterfaceC5780c
    /* renamed from: b */
    public final void mo10167b(C5205p c5205p, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f25387m != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.f25388n = true;
                        if (this.f25391q == 0) {
                            if (iOException != null) {
                                m10197d(c5205p.f25359a, this.f25378d, iOException);
                            }
                            this.f25390p++;
                        }
                    }
                } else if (((StreamResetException) iOException).f27087a == EnumC6384b.REFUSED_STREAM) {
                    int i10 = this.f25392r + 1;
                    this.f25392r = i10;
                    if (i10 > 1) {
                        this.f25388n = true;
                        this.f25390p++;
                    }
                } else if (((StreamResetException) iOException).f27087a != EnumC6384b.CANCEL || !c5205p.f25373q) {
                    this.f25388n = true;
                    this.f25390p++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // qz.AbstractC6396n
    /* renamed from: c */
    public final void mo10199c(C6406x c6406x) {
        c6406x.m12404c(EnumC6384b.REFUSED_STREAM, null);
    }

    @Override // oz.InterfaceC5780c
    public final void cancel() {
        AbstractC4299e.m9014c(this.f25379e);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m10200e(iz.C3368a r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.String r0 = "hostname"
            java.lang.String r1 = "address"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r11, r1)
            iz.x r1 = r11.f17780h
            java.util.TimeZone r2 = kz.AbstractC4299e.f21707a
            java.util.ArrayList r2 = r10.f25394t
            int r2 = r2.size()
            int r3 = r10.f25393s
            r4 = 0
            if (r2 >= r3) goto Le4
            boolean r2 = r10.f25388n
            if (r2 == 0) goto L1c
            goto Le4
        L1c:
            iz.o0 r2 = r10.f25378d
            iz.a r3 = r2.f17969a
            iz.a r5 = r2.f17969a
            boolean r3 = r3.m7725a(r11)
            if (r3 != 0) goto L2a
            goto Le4
        L2a:
            java.lang.String r3 = r1.f17994d
            java.lang.String r6 = r1.f17994d
            iz.x r7 = r5.f17780h
            java.lang.String r7 = r7.f17994d
            boolean r3 = kotlin.jvm.internal.AbstractC4154l.m8918a(r3, r7)
            r7 = 1
            if (r3 == 0) goto L3a
            return r7
        L3a:
            qz.p r3 = r10.f25387m
            if (r3 != 0) goto L40
            goto Le4
        L40:
            if (r12 == 0) goto Le4
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L4a
            goto Le4
        L4a:
            java.util.Iterator r12 = r12.iterator()
        L4e:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Le4
            java.lang.Object r3 = r12.next()
            iz.o0 r3 = (iz.o0) r3
            java.net.Proxy r8 = r3.f17970b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto L4e
            java.net.Proxy r8 = r2.f17970b
            java.net.Proxy$Type r8 = r8.type()
            if (r8 != r9) goto L4e
            java.net.InetSocketAddress r8 = r2.f17971c
            java.net.InetSocketAddress r3 = r3.f17971c
            boolean r3 = kotlin.jvm.internal.AbstractC4154l.m8918a(r8, r3)
            if (r3 == 0) goto L4e
            javax.net.ssl.HostnameVerifier r12 = r11.f17776d
            xz.c r2 = xz.C8521c.f41446a
            if (r12 == r2) goto L7d
            goto Le4
        L7d:
            java.util.TimeZone r12 = kz.AbstractC4299e.f21707a
            iz.x r12 = r5.f17780h
            int r1 = r1.f17995e
            int r2 = r12.f17995e
            if (r1 == r2) goto L88
            goto Le4
        L88:
            java.lang.String r12 = r12.f17994d
            boolean r12 = kotlin.jvm.internal.AbstractC4154l.m8918a(r6, r12)
            iz.u r1 = r10.f25381g
            if (r12 == 0) goto L93
            goto Lb4
        L93:
            boolean r12 = r10.f25389o
            if (r12 != 0) goto Le4
            if (r1 == 0) goto Le4
            java.util.List r12 = r1.m7786a()
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto Le4
            java.lang.Object r12 = r12.get(r4)
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r12, r2)
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12
            boolean r12 = xz.C8521c.m15796c(r6, r12)
            if (r12 == 0) goto Le4
        Lb4:
            iz.f r11 = r11.f17777e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            kotlin.jvm.internal.AbstractC4154l.m8920c(r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            kotlin.jvm.internal.AbstractC4154l.m8920c(r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.util.List r12 = r1.m7786a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.lang.String r0 = "peerCertificates"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r12, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.util.Set r11 = r11.f17861a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.util.Iterator r11 = r11.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            boolean r12 = r11.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            if (r12 != 0) goto Ld7
            return r7
        Ld7:
            java.lang.Object r11 = r11.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            r11.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.lang.ClassCastException r11 = new java.lang.ClassCastException     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            r11.<init>()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            throw r11     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
        Le4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nz.C5206q.m10200e(iz.a, java.util.List):boolean");
    }

    @Override // oz.InterfaceC5780c
    /* renamed from: f */
    public final void mo10171f() {
        synchronized (this) {
            this.f25388n = true;
        }
        this.f25386l.getClass();
    }

    /* renamed from: g */
    public final boolean m10201g(boolean z6) throws SocketException {
        long j6;
        TimeZone timeZone = AbstractC4299e.f21707a;
        long jNanoTime = System.nanoTime();
        if (this.f25379e.isClosed() || this.f25380f.isClosed() || this.f25380f.isInputShutdown() || this.f25380f.isOutputShutdown()) {
            return false;
        }
        C6398p c6398p = this.f25387m;
        if (c6398p != null) {
            synchronized (c6398p) {
                if (c6398p.f30850f) {
                    return false;
                }
                if (c6398p.f30859q < c6398p.f30858p) {
                    if (jNanoTime >= c6398p.f30860r) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j6 = jNanoTime - this.f25395u;
        }
        if (j6 < 10000000000L || !z6) {
            return true;
        }
        Socket socket = this.f25380f;
        InterfaceC0528m source = this.f25383i;
        AbstractC4154l.m8923f(socket, "<this>");
        AbstractC4154l.m8923f(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.mo1545e();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // oz.InterfaceC5780c
    /* renamed from: h */
    public final o0 mo10173h() {
        return this.f25378d;
    }

    /* renamed from: i */
    public final void m10202i() throws SocketException {
        this.f25395u = System.nanoTime();
        f0 f0Var = this.f25382h;
        if (f0Var == f0.HTTP_2 || f0Var == f0.H2_PRIOR_KNOWLEDGE) {
            this.f25380f.setSoTimeout(0);
            C6385c c6385c = C6385c.f30793a;
            C3390w c3390w = new C3390w(this.f25376b);
            Socket socket = this.f25380f;
            String peerName = this.f25378d.f17969a.f17780h.f17994d;
            InterfaceC0528m source = this.f25383i;
            InterfaceC0527l sink = this.f25384j;
            AbstractC4154l.m8923f(socket, "socket");
            AbstractC4154l.m8923f(peerName, "peerName");
            AbstractC4154l.m8923f(source, "source");
            AbstractC4154l.m8923f(sink, "sink");
            c3390w.f17986e = socket;
            String str = AbstractC4299e.f21708b + ' ' + peerName;
            AbstractC4154l.m8923f(str, "<set-?>");
            c3390w.f17983b = str;
            c3390w.f17987f = source;
            c3390w.f17988g = sink;
            c3390w.f17989h = this;
            c3390w.f17984c = this.f25385k;
            c3390w.f17990i = c6385c;
            C6398p c6398p = new C6398p(c3390w);
            this.f25387m = c6398p;
            b0 b0Var = C6398p.f30841E;
            this.f25393s = (b0Var.f30791a & 8) != 0 ? b0Var.f30792b[3] : Integer.MAX_VALUE;
            C6407y c6407y = c6398p.f30842B;
            synchronized (c6407y) {
                try {
                    if (c6407y.f30914d) {
                        throw new IOException("closed");
                    }
                    Logger logger = C6407y.f30910f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC4299e.m9015d(">> CONNECTION " + AbstractC6390h.f30820a.mo1564e(), new Object[0]));
                    }
                    c6407y.f30911a.p0(AbstractC6390h.f30820a);
                    c6407y.f30911a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C6407y c6407y2 = c6398p.f30842B;
            b0 settings = c6398p.f30862t;
            c6407y2.getClass();
            AbstractC4154l.m8923f(settings, "settings");
            synchronized (c6407y2) {
                try {
                    if (c6407y2.f30914d) {
                        throw new IOException("closed");
                    }
                    c6407y2.m12415n(0, Integer.bitCount(settings.f30791a) * 6, 4, 0);
                    for (int i10 = 0; i10 < 10; i10++) {
                        boolean z6 = true;
                        if (((1 << i10) & settings.f30791a) == 0) {
                            z6 = false;
                        }
                        if (z6) {
                            c6407y2.f30911a.writeShort(i10);
                            c6407y2.f30911a.writeInt(settings.f30792b[i10]);
                        }
                    }
                    c6407y2.f30911a.flush();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (c6398p.f30862t.m12369a() != 65535) {
                c6398p.f30842B.m12412H(0, r2 - Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }
            C4919c.m9815c(c6398p.f30851g.m9824d(), c6398p.f30847c, c6398p.f30843C);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        o0 o0Var = this.f25378d;
        sb2.append(o0Var.f17969a.f17780h.f17994d);
        sb2.append(':');
        sb2.append(o0Var.f17969a.f17780h.f17995e);
        sb2.append(", proxy=");
        sb2.append(o0Var.f17970b);
        sb2.append(" hostAddress=");
        sb2.append(o0Var.f17971c);
        sb2.append(" cipherSuite=");
        C3388u c3388u = this.f25381g;
        if (c3388u == null || (obj = c3388u.f17977b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f25382h);
        sb2.append('}');
        return sb2.toString();
    }
}

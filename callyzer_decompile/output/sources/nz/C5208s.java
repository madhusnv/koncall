package nz;

import a9.C0073l;
import eb.i3;
import iz.C3368a;
import iz.C3379l;
import iz.C3381n;
import iz.C3391x;
import iz.f0;
import iz.k0;
import iz.m0;
import iz.n0;
import iz.o0;
import iz.r0;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4296b;
import kz.AbstractC4297c;
import kz.AbstractC4299e;
import l1.C4327p;
import mz.C4920d;
import nx.C5176n;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.x0;
import pg.ba;
import rw.AbstractC6663m;
import rw.C6661k;
import sw.C6959c;
import tz.AbstractC7285d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.s */
/* loaded from: classes3.dex */
public final class C5208s implements InterfaceC5212w {

    /* renamed from: a */
    public final C4920d f25403a;

    /* renamed from: b */
    public final C5207r f25404b;

    /* renamed from: c */
    public final int f25405c;

    /* renamed from: d */
    public final int f25406d;

    /* renamed from: e */
    public final int f25407e;

    /* renamed from: f */
    public final int f25408f;

    /* renamed from: g */
    public final int f25409g;

    /* renamed from: h */
    public final boolean f25410h;

    /* renamed from: j */
    public final boolean f25411j;

    /* renamed from: k */
    public final C3368a f25412k;

    /* renamed from: l */
    public final C4327p f25413l;

    /* renamed from: m */
    public final C5190a f25414m;

    /* renamed from: n */
    public C5213x f25415n;

    /* renamed from: p */
    public C5214y f25416p;

    /* renamed from: q */
    public o0 f25417q;

    /* renamed from: r */
    public final C6661k f25418r;

    public C5208s(C4920d taskRunner, C5207r connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z6, boolean z10, C3368a address, C4327p routeDatabase, C5190a connectionUser) {
        AbstractC4154l.m8923f(taskRunner, "taskRunner");
        AbstractC4154l.m8923f(connectionPool, "connectionPool");
        AbstractC4154l.m8923f(address, "address");
        AbstractC4154l.m8923f(routeDatabase, "routeDatabase");
        AbstractC4154l.m8923f(connectionUser, "connectionUser");
        this.f25403a = taskRunner;
        this.f25404b = connectionPool;
        this.f25405c = i10;
        this.f25406d = i11;
        this.f25407e = i12;
        this.f25408f = i13;
        this.f25409g = i14;
        this.f25410h = z6;
        this.f25411j = z10;
        this.f25412k = address;
        this.f25413l = routeDatabase;
        this.f25414m = connectionUser;
        this.f25418r = new C6661k();
    }

    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.util.List] */
    /* renamed from: a */
    public final C5193d m10204a() throws IOException {
        String hostAddress;
        int port;
        List listM10828c;
        boolean zContains;
        o0 o0Var = this.f25417q;
        if (o0Var != null) {
            this.f25417q = null;
            return m10205b(o0Var, null);
        }
        C5213x c5213x = this.f25415n;
        if (c5213x != null && c5213x.f25424b < c5213x.f25423a.size()) {
            int i10 = c5213x.f25424b;
            ArrayList arrayList = c5213x.f25423a;
            if (i10 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i11 = c5213x.f25424b;
            c5213x.f25424b = i11 + 1;
            return m10205b((o0) arrayList.get(i11), null);
        }
        C5214y c5214y = this.f25416p;
        if (c5214y == null) {
            c5214y = new C5214y(this.f25412k, this.f25413l, this.f25414m, this.f25411j);
            this.f25416p = c5214y;
        }
        if (!c5214y.m10209a()) {
            throw new IOException("exhausted all routes");
        }
        if (!c5214y.m10209a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (c5214y.f25430f < c5214y.f25429e.size()) {
            C3368a c3368a = c5214y.f25425a;
            if (c5214y.f25430f >= c5214y.f25429e.size()) {
                throw new SocketException("No route to " + c3368a.f17780h.f17994d + "; exhausted proxy configurations: " + c5214y.f25429e);
            }
            List list = c5214y.f25429e;
            int i12 = c5214y.f25430f;
            c5214y.f25430f = i12 + 1;
            Proxy proxy = (Proxy) list.get(i12);
            C5190a c5190a = c5214y.f25427c;
            ArrayList arrayList3 = new ArrayList();
            c5214y.f25431g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                C3391x c3391x = c3368a.f17780h;
                hostAddress = c3391x.f17994d;
                port = c3391x.f17995e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    AbstractC4154l.m8922e(hostAddress, "getHostName(...)");
                } else {
                    hostAddress = address.getHostAddress();
                    AbstractC4154l.m8922e(hostAddress, "getHostAddress(...)");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                C5176n c5176n = AbstractC4296b.f21702a;
                AbstractC4154l.m8923f(hostAddress, "<this>");
                if (AbstractC4296b.f21702a.m10087c(hostAddress)) {
                    listM10828c = pe.m10833h(InetAddress.getByName(hostAddress));
                } else {
                    C5205p c5205p = c5190a.f25297a;
                    c5205p.f25362d.mo7771m(c5205p, hostAddress);
                    List listMo7745c = c3368a.f17773a.mo7745c(hostAddress);
                    if (listMo7745c.isEmpty()) {
                        throw new UnknownHostException(c3368a.f17773a + " returned no addresses for " + hostAddress);
                    }
                    C5205p c5205p2 = c5190a.f25297a;
                    c5205p2.f25362d.mo7770l(c5205p2, hostAddress, listMo7745c);
                    listM10828c = listMo7745c;
                }
                if (c5214y.f25428d && listM10828c.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : listM10828c) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = AbstractC4297c.f21703a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        C6959c c6959cM10829d = pe.m10829d();
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                c6959cM10829d.add(it.next());
                            }
                            if (it2.hasNext()) {
                                c6959cM10829d.add(it2.next());
                            }
                        }
                        listM10828c = pe.m10828c(c6959cM10829d);
                    }
                }
                Iterator it3 = listM10828c.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), port));
                }
            }
            Iterator it4 = c5214y.f25431g.iterator();
            while (it4.hasNext()) {
                o0 o0Var2 = new o0(c5214y.f25425a, proxy, (InetSocketAddress) it4.next());
                C4327p c4327p = c5214y.f25426b;
                synchronized (c4327p) {
                    zContains = ((LinkedHashSet) c4327p.f21788b).contains(o0Var2);
                }
                if (zContains) {
                    c5214y.f25432h.add(o0Var2);
                } else {
                    arrayList2.add(o0Var2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            AbstractC6663m.m12765x(arrayList2, c5214y.f25432h);
            c5214y.f25432h.clear();
        }
        C5213x c5213x2 = new C5213x(arrayList2);
        this.f25415n = c5213x2;
        if (this.f25414m.m10161l()) {
            throw new IOException("Canceled");
        }
        if (c5213x2.f25424b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i13 = c5213x2.f25424b;
        c5213x2.f25424b = i13 + 1;
        return m10205b((o0) arrayList2.get(i13), arrayList2);
    }

    /* renamed from: b */
    public final C5193d m10205b(o0 route, ArrayList arrayList) throws UnknownServiceException {
        AbstractC4154l.m8923f(route, "route");
        C3368a c3368a = route.f17969a;
        if (c3368a.f17775c == null) {
            if (!c3368a.f17782j.contains(C3379l.f17934f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f17969a.f17780h.f17994d;
            AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
            if (!AbstractC7285d.f34750a.mo13611g(str)) {
                throw new UnknownServiceException(AbstractC5601a.m11238i("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c3368a.f17781i.contains(f0.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        x0 x0Var = null;
        if (route.f17970b.type() == Proxy.Type.HTTP) {
            C3368a c3368a2 = route.f17969a;
            if (c3368a2.f17775c != null || c3368a2.f17781i.contains(f0.H2_PRIOR_KNOWLEDGE)) {
                C0073l c0073l = new C0073l();
                C3391x url = route.f17969a.f17780h;
                AbstractC4154l.m8923f(url, "url");
                c0073l.f264a = url;
                c0073l.m196E("CONNECT", null);
                C3368a c3368a3 = route.f17969a;
                c0073l.m193B("Host", AbstractC4299e.m9020i(c3368a3.f17780h, true));
                c0073l.m193B("Proxy-Connection", "Keep-Alive");
                c0073l.m193B("User-Agent", "okhttp/5.1.0");
                x0 x0Var2 = new x0(c0073l);
                m0 m0Var = n0.f17961b;
                C3381n c3381n = r0.J0;
                i3 i3Var = new i3(2);
                f0 protocol = f0.HTTP_1_1;
                AbstractC4154l.m8923f(protocol, "protocol");
                ba.m11554b("Proxy-Authenticate");
                ba.m11555c("OkHttp-Preemptive", "Proxy-Authenticate");
                i3Var.m5731i("Proxy-Authenticate");
                ba.m11553a(i3Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                x0 x0VarMo7726d = c3368a3.f17778f.mo7726d(route, new k0(x0Var2, protocol, "Preemptive Authenticate", 407, null, i3Var.m5727e(), m0Var, null, null, null, -1L, -1L, null, c3381n));
                x0Var = x0VarMo7726d == null ? x0Var2 : x0VarMo7726d;
            }
        }
        return new C5193d(this.f25403a, this.f25404b, this.f25405c, this.f25406d, this.f25407e, this.f25408f, this.f25409g, this.f25410h, this.f25414m, this, route, arrayList, 0, x0Var, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0044, B:22:0x0051, B:25:0x0058), top: B:53:0x0044 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nz.C5209t m10206c(nz.C5193d r11, java.util.List r12) {
        /*
            r10 = this;
            nz.r r0 = r10.f25404b
            nz.a r1 = r10.f25414m
            boolean r1 = r1.m10160k()
            iz.a r2 = r10.f25412k
            nz.a r3 = r10.f25414m
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L18
            boolean r6 = r11.mo10169d()
            if (r6 == 0) goto L18
            r6 = r5
            goto L19
        L18:
            r6 = r4
        L19:
            r0.getClass()
            java.lang.String r7 = "address"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r2, r7)
            java.lang.String r7 = "connectionUser"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r3, r7)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f25402g
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r7 = "iterator(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r0, r7)
        L31:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L79
            java.lang.Object r7 = r0.next()
            nz.q r7 = (nz.C5206q) r7
            kotlin.jvm.internal.AbstractC4154l.m8920c(r7)
            monitor-enter(r7)
            if (r6 == 0) goto L51
            qz.p r9 = r7.f25387m     // Catch: java.lang.Throwable -> L4f
            if (r9 == 0) goto L4a
            r9 = r5
            goto L4b
        L4a:
            r9 = r4
        L4b:
            if (r9 != 0) goto L51
        L4d:
            r9 = r4
            goto L5c
        L4f:
            r11 = move-exception
            goto L77
        L51:
            boolean r9 = r7.m10200e(r2, r12)     // Catch: java.lang.Throwable -> L4f
            if (r9 != 0) goto L58
            goto L4d
        L58:
            r3.m10150a(r7)     // Catch: java.lang.Throwable -> L4f
            r9 = r5
        L5c:
            monitor-exit(r7)
            if (r9 == 0) goto L31
            boolean r9 = r7.m10201g(r1)
            if (r9 == 0) goto L66
            goto L7a
        L66:
            monitor-enter(r7)
            r7.f25388n = r5     // Catch: java.lang.Throwable -> L74
            java.net.Socket r8 = r3.m10163n()     // Catch: java.lang.Throwable -> L74
            monitor-exit(r7)
            if (r8 == 0) goto L31
            kz.AbstractC4299e.m9014c(r8)
            goto L31
        L74:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L77:
            monitor-exit(r7)
            throw r11
        L79:
            r7 = r8
        L7a:
            if (r7 != 0) goto L7d
            return r8
        L7d:
            if (r11 == 0) goto L8a
            iz.o0 r12 = r11.f25312k
            r10.f25417q = r12
            java.net.Socket r11 = r11.f25320s
            if (r11 == 0) goto L8a
            kz.AbstractC4299e.m9014c(r11)
        L8a:
            nz.a r11 = r10.f25414m
            r11.m10156g(r7)
            nz.a r11 = r10.f25414m
            r11.m10157h(r7)
            nz.t r11 = new nz.t
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nz.C5208s.m10206c(nz.d, java.util.List):nz.t");
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: g */
    public final boolean mo8766g(C3391x url) {
        AbstractC4154l.m8923f(url, "url");
        C3391x c3391x = this.f25412k.f17780h;
        return url.f17995e == c3391x.f17995e && AbstractC4154l.m8918a(url.f17994d, c3391x.f17994d);
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: h */
    public final boolean mo8767h() {
        return this.f25414m.m10161l();
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: i */
    public final C3368a mo8768i() {
        return this.f25412k;
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: l */
    public final C6661k mo8771l() {
        return this.f25418r;
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: m */
    public final InterfaceC5211v mo8772m() {
        Socket socketM10163n;
        boolean z6;
        C5209t c5209t;
        C5206q c5206qM10153d = this.f25414m.m10153d();
        if (c5206qM10153d == null) {
            c5209t = null;
        } else {
            boolean zM10201g = c5206qM10153d.m10201g(this.f25414m.m10160k());
            synchronized (c5206qM10153d) {
                try {
                    if (!zM10201g) {
                        z6 = !c5206qM10153d.f25388n;
                        c5206qM10153d.f25388n = true;
                        socketM10163n = this.f25414m.m10163n();
                    } else if (c5206qM10153d.f25388n || !mo8766g(c5206qM10153d.f25378d.f17969a.f17780h)) {
                        socketM10163n = this.f25414m.m10163n();
                        z6 = false;
                    } else {
                        z6 = false;
                        socketM10163n = null;
                    }
                } finally {
                }
            }
            if (this.f25414m.m10153d() == null) {
                if (socketM10163n != null) {
                    AbstractC4299e.m9014c(socketM10163n);
                }
                C5205p c5205p = this.f25414m.f25297a;
                c5205p.f25362d.mo7769k(c5205p, c5206qM10153d);
                this.f25414m.getClass();
                if (socketM10163n != null || z6) {
                    this.f25414m.getClass();
                }
                c5209t = null;
            } else {
                if (socketM10163n != null) {
                    throw new IllegalStateException("Check failed.");
                }
                c5209t = new C5209t(c5206qM10153d);
            }
        }
        if (c5209t != null) {
            return c5209t;
        }
        C5209t c5209tM10206c = m10206c(null, null);
        if (c5209tM10206c != null) {
            return c5209tM10206c;
        }
        if (!this.f25418r.isEmpty()) {
            return (InterfaceC5211v) this.f25418r.removeFirst();
        }
        C5193d c5193dM10204a = m10204a();
        C5209t c5209tM10206c2 = m10206c(c5193dM10204a, c5193dM10204a.f25313l);
        return c5209tM10206c2 != null ? c5209tM10206c2 : c5193dM10204a;
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: p */
    public final boolean mo8775p(C5206q c5206q) {
        C5214y c5214y;
        o0 o0Var;
        if (this.f25418r.isEmpty() && this.f25417q == null) {
            if (c5206q != null) {
                synchronized (c5206q) {
                    o0Var = null;
                    if (c5206q.f25390p == 0 && c5206q.f25388n && AbstractC4299e.m9012a(c5206q.f25378d.f17969a.f17780h, this.f25412k.f17780h)) {
                        o0Var = c5206q.f25378d;
                    }
                }
                if (o0Var != null) {
                    this.f25417q = o0Var;
                    return true;
                }
            }
            C5213x c5213x = this.f25415n;
            if ((c5213x == null || c5213x.f25424b >= c5213x.f25423a.size()) && (c5214y = this.f25416p) != null) {
                return c5214y.m10209a();
            }
        }
        return true;
    }
}

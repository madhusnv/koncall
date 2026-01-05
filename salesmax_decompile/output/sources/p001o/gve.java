package p001o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class gve {

    /* renamed from: i */
    public static final C13824a f25824i = new C13824a(null);

    /* renamed from: a */
    public final d60 f25825a;

    /* renamed from: b */
    public final dve f25826b;

    /* renamed from: c */
    public final gt3 f25827c;

    /* renamed from: d */
    public final boolean f25828d;

    /* renamed from: e */
    public List f25829e;

    /* renamed from: f */
    public int f25830f;

    /* renamed from: g */
    public List f25831g;

    /* renamed from: h */
    public final List f25832h;

    /* renamed from: o.gve$a */
    public static final class C13824a {
        public C13824a() {
        }

        public /* synthetic */ C13824a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final String m29535a(InetSocketAddress inetSocketAddress) {
            sq8.m48649h(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                sq8.m48648g(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            sq8.m48648g(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }
    }

    /* renamed from: o.gve$b */
    public static final class C13825b {

        /* renamed from: a */
        public final List f25833a;

        /* renamed from: b */
        public int f25834b;

        public C13825b(List list) {
            sq8.m48649h(list, "routes");
            this.f25833a = list;
        }

        /* renamed from: a */
        public final List m29536a() {
            return this.f25833a;
        }

        /* renamed from: b */
        public final boolean m29537b() {
            return this.f25834b < this.f25833a.size();
        }

        /* renamed from: c */
        public final bve m29538c() {
            if (!m29537b()) {
                throw new NoSuchElementException();
            }
            List list = this.f25833a;
            int i = this.f25834b;
            this.f25834b = i + 1;
            return (bve) list.get(i);
        }
    }

    public gve(d60 d60Var, dve dveVar, gt3 gt3Var, boolean z) {
        sq8.m48649h(d60Var, "address");
        sq8.m48649h(dveVar, "routeDatabase");
        sq8.m48649h(gt3Var, "connectionUser");
        this.f25825a = d60Var;
        this.f25826b = dveVar;
        this.f25827c = gt3Var;
        this.f25828d = z;
        this.f25829e = ch3.m21246k();
        this.f25831g = ch3.m21246k();
        this.f25832h = new ArrayList();
        m29534f(d60Var.m22357l(), d60Var.m22352g());
    }

    /* renamed from: g */
    public static final List m29528g(Proxy proxy, w48 w48Var, gve gveVar) {
        if (proxy != null) {
            return bh3.m18963e(proxy);
        }
        URI uriM53887s = w48Var.m53887s();
        if (uriM53887s.getHost() == null) {
            return jgj.m33817k(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = gveVar.f25825a.m22354i().select(uriM53887s);
        if (listSelect == null || listSelect.isEmpty()) {
            return jgj.m33817k(Proxy.NO_PROXY);
        }
        sq8.m48646e(listSelect);
        return jgj.m33829w(listSelect);
    }

    /* renamed from: a */
    public final boolean m29529a() {
        return m29530b() || (this.f25832h.isEmpty() ^ true);
    }

    /* renamed from: b */
    public final boolean m29530b() {
        return this.f25830f < this.f25829e.size();
    }

    /* renamed from: c */
    public final C13825b m29531c() {
        if (!m29529a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m29530b()) {
            Proxy proxyM29532d = m29532d();
            Iterator it = this.f25831g.iterator();
            while (it.hasNext()) {
                bve bveVar = new bve(this.f25825a, proxyM29532d, (InetSocketAddress) it.next());
                if (this.f25826b.m23893c(bveVar)) {
                    this.f25832h.add(bveVar);
                } else {
                    arrayList.add(bveVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            hh3.m30441A(arrayList, this.f25832h);
            this.f25832h.clear();
        }
        return new C13825b(arrayList);
    }

    /* renamed from: d */
    public final Proxy m29532d() throws SocketException, UnknownHostException {
        if (m29530b()) {
            List list = this.f25829e;
            int i = this.f25830f;
            this.f25830f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m29533e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f25825a.m22357l().m53877h() + "; exhausted proxy configurations: " + this.f25829e);
    }

    /* renamed from: e */
    public final void m29533e(Proxy proxy) throws SocketException, UnknownHostException {
        String strM53877h;
        int iM53882n;
        List listLookup;
        ArrayList arrayList = new ArrayList();
        this.f25831g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM53877h = this.f25825a.m22357l().m53877h();
            iM53882n = this.f25825a.m22357l().m53882n();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            C13824a c13824a = f25824i;
            sq8.m48646e(socketAddressAddress);
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strM53877h = c13824a.m29535a(inetSocketAddress);
            iM53882n = inetSocketAddress.getPort();
        }
        boolean z = false;
        if (1 <= iM53882n && iM53882n < 65536) {
            z = true;
        }
        if (!z) {
            throw new SocketException("No route to " + strM53877h + ':' + iM53882n + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strM53877h, iM53882n));
            return;
        }
        if (wfj.m54337a(strM53877h)) {
            listLookup = bh3.m18963e(InetAddress.getByName(strM53877h));
        } else {
            this.f25827c.mo25549r(strM53877h);
            listLookup = this.f25825a.m22348c().lookup(strM53877h);
            if (listLookup.isEmpty()) {
                throw new UnknownHostException(this.f25825a.m22348c() + " returned no addresses for " + strM53877h);
            }
            this.f25827c.mo25538g(strM53877h, listLookup);
        }
        if (this.f25828d) {
            listLookup = ci8.m21296a(listLookup);
        }
        Iterator it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM53882n));
        }
    }

    /* renamed from: f */
    public final void m29534f(w48 w48Var, Proxy proxy) {
        this.f25827c.mo25553v(w48Var);
        List listM29528g = m29528g(proxy, w48Var, this);
        this.f25829e = listM29528g;
        this.f25830f = 0;
        this.f25827c.mo25539h(w48Var, listM29528g);
    }
}
